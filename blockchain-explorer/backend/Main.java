public class Main {
    public static void main(String[] args) {
        System.out.println("Blockchain Explorer Backend Running...");
        TransactionService txService = new TransactionService();
        txService.printRecentTransactions();
    }
}
