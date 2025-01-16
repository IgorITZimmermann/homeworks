package de.ait.abstractclass;

/**
 * The SwimmingChampionship class extends the Competition abstract class, representing a swimming championship.
 * It provides specific functionality to start a swimming championship.
 *
 * Класс SwimmingChampionship расширяет абстрактный класс Competition, представляя чемпионат по плаванию. Он обеспечивает специфичную функцию запуска чемпионата.
 */
public class SwimmingChampionship extends Competition {

    /**
     * Constructs a SwimmingChampionship instance with a specified competition name.
     *
     * @param competitionName the name of the competition
     *
     * Создаёт инстанцию SwimmingChampionship с указанным названием соревнования.
     *
     * @param competitionName название соревнования
     */
    public SwimmingChampionship(String competitionName) {
        super(competitionName);
    }

    /**
     * Starts the swimming championship and displays a specific message.
     *
     * Запускает чемпионат по плаванию и отображает специфичное сообщение.
     */
    @Override
    public void startCompetition() {
        System.out.println("Чемпионат по плаванию начался! Участники плывут 100 метров.");
    }
}
