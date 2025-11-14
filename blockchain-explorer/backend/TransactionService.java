import java.util.List;
import java.util.Arrays;

public class TransactionService {
    public void printRecentTransactions() {
        List<String> txs = Arrays.asList("TX123: 10 ARDR", "TX124: 5 ARDR", "TX125: 2 ARDR");
        System.out.println("Recent Transactions:");
        for (String tx : txs) {
            System.out.println(tx);
        }
    }
}
