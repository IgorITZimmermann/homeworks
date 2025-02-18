package de.ait.consultation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AiApp {
    private static List<AIProject> projects = List.of(
            new AIProject("AlphaMed", "Медицина", 15, 12.5, 24, true, "В разработке"),
            new AIProject("AutoDrive", "Автономные системы", 50, 45.0, 36, false, "Завершен"),
            new AIProject("NLP Master", "Обработка естественного языка", 30, 8.0, 18, true, "В разработке"),
            new AIProject("RoboDoc", "Медицина", 20, 15.0, 12, false, "Приостановлен"),
            new AIProject("AI Translator", "Обработка естественного языка", 10, 5.0, 6, true, "Завершен")
    );


    public static void main(String[] args) {
        //Отфильтруйте проекты, бюджет которых превышает 10 миллионов долларов, и соберите их в список.
        List<AIProject> result10MillionDollars = projects.stream()
                .filter(projects -> projects.getBudget() >= 10)
                .collect(Collectors.toList());
        for (AIProject project : result10MillionDollars) {
            System.out.println(project.getName() + " " + project.getBudget());
        }

        //Создайте список названий проектов, преобразовав их в нижний регистр.
        List<String> resultLowerCase = projects.stream()
                .map(AIProject::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        for (String projectName : resultLowerCase) {
            System.out.println(projectName);
        }

        //Отсортируйте проекты по размеру команды в порядке убывания и выведите первые 3
        List<AIProject> resultTop3 = projects.stream()
                .sorted(Comparator.comparingInt(AIProject::getTeamSize).reversed())
                .limit(3)
                .collect(Collectors.toList());
        for (AIProject project : resultTop3) {
            System.out.println(project.getName() + " " + project.getTeamSize());
        }
    }
}
