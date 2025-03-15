package de.ait.repository;

import de.ait.model.Loan;

import java.util.ArrayList;
import java.util.List;

public class InMemoryLoanRepositoryImpl implements LoanRepository {
    private List<Loan> loans = new ArrayList<>();

    @Override
    public void save(Loan loan) {
        save(loan);
    }

    @Override
    public Loan findBookById(long bookId) {
        return loans.stream()
                .filter(loan -> loan.getBookId() == bookId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Loan> findAll() {
        return new ArrayList<>(loans);
    }
}
