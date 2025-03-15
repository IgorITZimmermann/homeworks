package de.ait.repository;

import de.ait.model.Loan;

import java.util.List;

public interface LoanRepository {
    void save(Loan loan);
    Loan findBookById(long bookId);
    List<Loan> findAll();
}
