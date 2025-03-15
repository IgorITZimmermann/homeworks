package de.ait.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Loan {
    private long bookId;
    private long readerId;
    private LocalDate dateIssued; //дата выдачи
    private LocalDate dateDue;// планируемая дата возврата
    private LocalDate dateReturned; //фактическая дата возврата, null если книгу не вернули

    public Loan(long bookId, long readerId, LocalDate dateIssued, LocalDate dateDue, LocalDate dateReturned) {
        this.bookId = bookId;
        this.readerId = readerId;
        this.dateIssued = dateIssued;
        this.dateDue = dateDue;
        this.dateReturned = dateReturned;
    }
}
