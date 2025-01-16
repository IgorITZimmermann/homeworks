package de.ait.abstractclass;

/**
 * The Marathon class extends the Competition abstract class, representing a marathon competition.
 * It provides specific functionality to start a marathon.
 *
 * Класс Marathon расширяет абстрактный класс Competition, представляя марафон. Он обеспечивает специфичную функцию запуска марафона.
 */
public class Marathon extends Competition {

    /**
     * Constructs a Marathon instance with a specified competition name.
     *
     * @param competitionName the name of the competition
     *
     * Создаёт инстанцию Marathon с указанным названием соревнования.
     *
     * @param competitionName название соревнования
     */
    public Marathon(String competitionName) {
        super(competitionName);
    }

    /**
     * Starts the marathon competition and displays a specific message.
     *
     * Запускает марафон и отображает специфичное сообщение.
     */
    @Override
    public void startCompetition() {
        System.out.println("Марафон начался! Участники бегут 42 км.");
    }

}
