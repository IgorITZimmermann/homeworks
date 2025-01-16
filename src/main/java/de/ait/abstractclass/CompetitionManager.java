package de.ait.abstractclass;

import java.util.ArrayList;
import java.util.List;

/**
 * The CompetitionManager class demonstrates the management of various competitions.
 * It creates a list of competitions, displays their information, and starts each competition.
 *
 * Класс CompetitionManager демонстрирует управление различными соревнованиями. Он создаёт список соревнований, отображает их информацию и запускает каждое соревнование.
 */
public class CompetitionManager {

    public static void main(String[] args) {
        // Create a list to store competitions
        // Создание списка для хранения соревнований
        List<Competition> competitionList = new ArrayList<>();

        // Add competitions to the list
        // Добавление соревнований в список
        competitionList.add(new Marathon("Марафон"));
        competitionList.add(new SwimmingChampionship("Чемпионат по плаванию"));

        // Iterate through the list, display competition information, and start each competition
        // Итерация по списку, отображение информации и запуск каждого соревнования
        for (Competition competition : competitionList) {
            competition.showCompetitionInfo();
            competition.startCompetition();
            System.out.println("---------------------------");
        }
    }
}
