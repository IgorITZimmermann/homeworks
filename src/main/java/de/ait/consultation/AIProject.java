package de.ait.consultation;

public class AIProject {

    private String name;          // Название проекта
    private String domain;        // Область применения (например, "Медицина", "Автономные системы", "Обработка естественного языка")
    private int teamSize;        // Размер команды
    private double budget;       // Бюджет проекта в миллионах долларов
    private int duration;        // Длительность проекта в месяцах
    private boolean isOpenSource; // Является ли проект открытым
    private String status;// Статус проекта (например, "В разработке", "Завершен", "Приостановлен")

    public AIProject(String name, String domain, int teamSize, double budget, int duration, boolean isOpenSource, String status) {
        this.name = name;
        this.domain = domain;
        this.teamSize = teamSize;
        this.budget = budget;
        this.duration = duration;
        this.isOpenSource = isOpenSource;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isOpenSource() {
        return isOpenSource;
    }

    public void setOpenSource(boolean openSource) {
        isOpenSource = openSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AIProject{" +
                "name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", teamSize=" + teamSize +
                ", budget=" + budget +
                ", duration=" + duration +
                ", isOpenSource=" + isOpenSource +
                ", status='" + status + '\'' +
                '}';
    }
}
