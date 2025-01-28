package de.ait.consultation;

/**
 * This enum represents various characteristics that pets can have.
 * Each characteristic is paired with a description in Russian.
 *
 * Этот перечислительный тип представляет различные характеристики, которые могут быть у домашних животных.
 * Каждая характеристика сопровождается описанием на русском языке.
 */
public enum PetCharacteristics {

    FRIENDLY("дружелюбный"),       // Friendly pet / Дружелюбное животное
    INDEPENDENT("независимый"),   // Independent pet / Независимое животное
    LOUD("шумный"),               // Loud pet / Шумное животное
    QUIET("спокойный"),           // Quiet pet / Спокойное животное
    CRAZY("активный");            // Crazy or active pet / Активное или "сумасшедшее" животное

    private final String description; // Description in Russian / Описание на русском языке

    /**
     * Constructor for assigning descriptions to the characteristics.
     * Конструктор для назначения описаний характеристикам.
     */
    PetCharacteristics(String description) {
        this.description = description;
    }

    /**
     * Gets the description of the characteristic in Russian.
     * Возвращает описание характеристики на русском языке.
     */
    public String getDescription() {
        return description;
    }
}
