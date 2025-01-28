package de.ait.homework33;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * This class manages the list of gifts and provides methods for adding,
 * filtering, and updating gift information.
 *
 * Этот класс управляет списком подарков и предоставляет методы для добавления,
 * фильтрации и обновления информации о подарках.
 */
@Slf4j
public class GiftManager {
    private List<Gift> gifts = new ArrayList<>(); // List to store gifts / Список для хранения подарков

    /**
     * Adds a gift to the list. Logs a warning if the gift is null.
     * Добавляет подарок в список. Логирует предупреждение, если подарок равен null.
     */
    public void addGift(Gift gift) {
        if (gift == null) {
            log.warn("Gift is null");
        } else {
            gifts.add(gift);
            log.info("Gift was added: " + gift.getName());
        }
    }

    /**
     * Filters the list of gifts by a specified category.
     * Фильтрует список подарков по указанной категории.
     */
    public List<Gift> filterByCategory(GiftCategory category) {
        List<Gift> filteredGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getCategory() == category) {
                filteredGifts.add(gift);
            }
        }
        return filteredGifts;
    }

    /**
     * Updates the status of a gift by its name. Returns false if the gift is not found or input is invalid.
     * Обновляет статус подарка по его имени. Возвращает false, если подарок не найден или ввод некорректен.
     */
    public boolean updateGiftStatus(String giftName, GiftStatus newStatus) {
        if (giftName == null || newStatus == null || giftName.isEmpty()) {
            log.error("Status update is not possible. Gift: {}, Status: {}", giftName, newStatus);
            return false;
        } else {
            for (Gift gift : gifts) {
                if (gift.getName().equalsIgnoreCase(giftName)) {
                    gift.setStatus(newStatus);
                    log.info("Status of gift {} was updated to {}", giftName, newStatus);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Retrieves all gifts stored in the system.
     * Возвращает все подарки, хранящиеся в системе.
     */
    public List<Gift> getGifts() {
        return new ArrayList<>(gifts);
    }
}
