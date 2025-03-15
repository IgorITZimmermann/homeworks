package de.ait.deleteme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestApiDemoControllerTest {

    private RestApiDemoController controller;

    @BeforeEach
    void setUp() {
        // На каждый тест создаём новый экземпляр контроллера,
        // чтобы список coffees был в "чистом" состоянии для каждого теста
        controller = new RestApiDemoController();
    }

    @Test
    void testGetCoffees_ShouldReturnDefaultCoffees() {
        // В контроллере по умолчанию создаётся список из 4 кофе
        Iterable<Coffee> coffees = controller.getCoffees();
        List<Coffee> coffeeList = new ArrayList<>();
        coffees.forEach(coffeeList::add);

        assertEquals(4, coffeeList.size(), "По умолчанию должно быть 4 кофе в списке");
    }

    @Test
    void testGetCoffeeById_Found() {
        // Получаем текущий список
        List<Coffee> coffeeList = new ArrayList<>();
        controller.getCoffees().forEach(coffeeList::add);

        // Возьмём первый кофе и найдём его по ID
        Coffee firstCoffee = coffeeList.get(0);
        String existingId = firstCoffee.getId();

        Optional<Coffee> maybeCoffee = controller.getCoffeeById(existingId);

        assertTrue(maybeCoffee.isPresent(), "Кофе по этому id должен существовать");
        assertEquals(existingId, maybeCoffee.get().getId());
    }

    @Test
    void testGetCoffeeById_NotFound() {
        // Используем "левый" ID, которого нет в списке
        Optional<Coffee> maybeCoffee = controller.getCoffeeById("non-existent-id");

        assertTrue(maybeCoffee.isEmpty(), "Кофе по этому id не должно существовать");
    }

    @Test
    void testPostCoffee_ShouldAddNewCoffee() {
        // Считаем размер списка ДО
        List<Coffee> before = new ArrayList<>();
        controller.getCoffees().forEach(before::add);
        int sizeBefore = before.size();

        Coffee newCoffee = new Coffee("Test Coffee");
        Coffee postedCoffee = controller.postCoffee(newCoffee);

        // Проверяем, что пост вернул наш же объект (можно проверить ссылку или поля)
        assertEquals(newCoffee, postedCoffee, "postCoffee должен вернуть тот же объект");
        assertNotNull(postedCoffee.getId(), "ID у кофе не должен быть null");

        // Считаем размер списка ПОСЛЕ
        List<Coffee> after = new ArrayList<>();
        controller.getCoffees().forEach(after::add);

        assertEquals(sizeBefore + 1, after.size(),
                "После добавления нового кофе размер списка должен увеличиться на 1");
    }

    @Test
    void testPutCoffee_UpdateExistingCoffee() {
        // Берём существующий кофе из списка
        List<Coffee> coffeeList = new ArrayList<>();
        controller.getCoffees().forEach(coffeeList::add);
        Coffee existing = coffeeList.get(0);

        // Создаём новый объект с тем же ID, но другим именем
        String oldId = existing.getId();
        Coffee updatedCoffee = new Coffee(oldId, "Updated Coffee Name");

        ResponseEntity<Coffee> response = controller.putCoffee(oldId, updatedCoffee);

        assertEquals(HttpStatus.OK, response.getStatusCode(),
                "Должен вернуться статус 200, если кофе существует");
        assertNotNull(response.getBody(), "Тело ответа не должно быть null");
        assertEquals("Updated Coffee Name", response.getBody().getName(),
                "Имя в отредактированном кофе должно обновиться");

        // Дополнительно можно проверить, что действительно обновилось в списке
        Optional<Coffee> maybeCoffee = controller.getCoffeeById(oldId);
        assertTrue(maybeCoffee.isPresent());
        assertEquals("Updated Coffee Name", maybeCoffee.get().getName());
    }

    @Test
    void testPutCoffee_CreateNewCoffeeIfNotExist() {
        // Идём со "свежим" несуществующим ID
        String newId = "non-existent-id";
        Coffee newCoffee = new Coffee(newId, "New Coffee via PUT");

        // PUT на несуществующий id -> должен вернуть 201 CREATED и добавить в список
        ResponseEntity<Coffee> response = controller.putCoffee(newId, newCoffee);

        assertEquals(HttpStatus.CREATED, response.getStatusCode(),
                "Если кофе с таким ID не существует, должен вернуться 201 CREATED");
        assertNotNull(response.getBody());
        // По коду в postCoffee(id, name) всё равно генерируется UUID,
        // поэтому реальный id в итоговом объекте может отличаться от newId
        // Но проверим имя для наглядности
        assertEquals("New Coffee via PUT", response.getBody().getName());

        // Проверим, что в списке стало на 1 больше
        List<Coffee> after = new ArrayList<>();
        controller.getCoffees().forEach(after::add);

        // По умолчанию было 4, теперь должно быть 5
        assertEquals(5, after.size());
    }

    @Test
    void testDeleteCoffee() {
        // Количество кофе до удаления
        List<Coffee> before = new ArrayList<>();
        controller.getCoffees().forEach(before::add);
        int sizeBefore = before.size();

        // Возьмём ID первого кофе
        String idToDelete = before.get(0).getId();

        controller.deleteCoffee(idToDelete);

        // Количество кофе после удаления
        List<Coffee> after = new ArrayList<>();
        controller.getCoffees().forEach(after::add);
        int sizeAfter = after.size();

        assertEquals(sizeBefore - 1, sizeAfter,
                "После удаления размер списка должен уменьшиться на 1");

        // Дополнительно убедимся, что действительно удалён нужный
        Optional<Coffee> maybeCoffee = controller.getCoffeeById(idToDelete);
        assertTrue(maybeCoffee.isEmpty(),
                "Удалённый кофе не должен существовать в списке");
    }
}
