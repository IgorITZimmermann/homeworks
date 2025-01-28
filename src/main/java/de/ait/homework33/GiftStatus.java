package de.ait.homework33;

/**
 * This enum defines the various statuses that a gift can have.
 * Each status represents the current state of a gift in the system.
 *
 * Этот перечислительный тип определяет различные статусы, которые может иметь подарок.
 * Каждый статус представляет текущее состояние подарка в системе.
 */
public enum GiftStatus {
    AVAILABLE,    // The gift is available / Подарок доступен
    OUT_OF_STOCK, // The gift is out of stock / Подарок отсутствует на складе
    RESERVED,     // The gift is reserved / Подарок зарезервирован
    DELIVERED     // The gift has been delivered / Подарок доставлен
}
