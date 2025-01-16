package de.ait.abstractclass;

/**
 * The Runner class extends the Athlete abstract class, representing a runner athlete.
 * It provides specific functionality for runner training.
 *
 * Класс Runner расширяет абстрактный класс Athlete, представляя бегуна. Он обеспечивает специфичную функцию тренировки бегунов.
 */
public class Runner extends Athlete {

    /**
     * Constructs a Runner with a specified name and experience level.
     *
     * @param name the name of the runner
     * @param experience the experience level of the runner
     *
     * Создаёт бегуна с указанными именем и уровнем опыта.
     *
     * @param name имя бегуна
     * @param experience уровень опыта бегуна
     */
    public Runner(String name, int experience) {
        super(name, experience);
    }

    /**
     * Implements the training method for runners.
     * Displays a message indicating the runner's training activity.
     *
     * Реализует метод тренировки для бегунов.
     * Отображает сообщение о действиях бегуна во время тренировки.
     */
    @Override
    public void train() {
        System.out.println(getName() + " run 5 kilometers");
    }
}
