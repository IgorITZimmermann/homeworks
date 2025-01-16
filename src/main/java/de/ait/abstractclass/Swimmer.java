package de.ait.abstractclass;

/**
 * The Swimmer class extends the Athlete abstract class, representing a swimmer athlete.
 * It provides specific functionality for swimmer training.
 *
 * Класс Swimmer расширяет абстрактный класс Athlete, представляя пловца. Он обеспечивает специфичную функцию тренировки пловцов.
 */
public class Swimmer extends Athlete {

    /**
     * Constructs a Swimmer with a specified name and experience level.
     *
     * @param name the name of the swimmer
     * @param experience the experience level of the swimmer
     *
     * Создаёт пловца с указанными именем и уровнем опыта.
     *
     * @param name имя пловца
     * @param experience уровень опыта пловца
     */
    public Swimmer(String name, int experience) {
        super(name, experience);
    }

    /**
     * Implements the training method for swimmers.
     * Displays a message indicating the swimmer's training activity.
     *
     * Реализует метод тренировки для пловцов.
     * Отображает сообщение о действиях пловца во время тренировки.
     */
    @Override
    public void train() {
        System.out.println(getName() + " swam 20 rides");
    }
}
