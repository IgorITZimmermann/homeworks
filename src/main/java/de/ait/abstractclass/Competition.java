package de.ait.abstractclass;

/**
 * The Competition class serves as an abstract base class for various types of competitions.
 * It provides methods to display competition information and defines an abstract method to start the competition.
 *
 * Класс Competition служит абстрактной базой для различных типов соревнований. Он предоставляет методы для отображения информации о соревнованиях и определяет абстрактный метод для запуска соревнований.
 */
public abstract class Competition {

    private String competitionName;

    /**
     * Constructs a Competition with a specified name.
     *
     * @param competitionName the name of the competition
     *
     * Создаёт соревнование с указанным именем.
     *
     * @param competitionName имя соревнования
     */
    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }

    /**
     * Defines an abstract method to start the competition.
     * This method must be implemented by subclasses.
     *
     * Определяет абстрактный метод для запуска соревнований. Должен быть реализован в подклассах.
     */
    public abstract void startCompetition();

    /**
     * Displays information about the competition.
     *
     * Отображает информацию о соревновании.
     */
    public void showCompetitionInfo() {
        System.out.println("Competition: " + competitionName);
    }
}
