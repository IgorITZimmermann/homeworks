package de.ait.abstractclass;

/**
 * The Athlete class represents a general athlete with a name and experience level.
 * It serves as an abstract base class for specific types of athletes.
 *
 * Класс Athlete представляет общего атлета с именем и уровнем опыта. Он служит как абстрактный базовый класс для конкретных типов атлетов.
 */
public abstract class Athlete {

    private String name;
    private int experience;

    /**
     * Constructs an Athlete with the specified name and experience level.
     *
     * @param name the name of the athlete
     * @param experience the experience level of the athlete
     *
     * Создает атлета с указанными именем и уровнем опыта.
     *
     * @param name имя атлета
     * @param experience уровень опыта атлета
     */
    public Athlete(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    /**
     * Returns the name of the athlete.
     *
     * @return the name of the athlete
     *
     * Возвращает имя атлета.
     *
     * @return имя атлета
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the experience level of the athlete.
     *
     * @return the experience level of the athlete
     *
     * Возвращает уровень опыта атлета.
     *
     * @return уровень опыта
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Defines an abstract method for athlete training. Must be implemented by subclasses.
     *
     * Определяет абстрактный метод тренировки атлета. Должен быть реализован в подклассах.
     */
    public abstract void train();

    /**
     * Displays the athlete's information, including name and experience level.
     *
     * Отображает информацию об атлете, включая имя и уровень опыта.
     */
    public void showInfo() {
        System.out.println("Name: " + name + " Experience: " + experience);
    }

}
