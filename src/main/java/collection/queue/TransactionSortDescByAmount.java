package collection.queue;

import java.util.Comparator;

public class TransactionSortDescByAmount implements Comparator<Transaction> {
    @Override
    public int compare(Transaction left, Transaction right) {
        return Integer.compare(right.getAmount(), left.getAmount());
    }
}
