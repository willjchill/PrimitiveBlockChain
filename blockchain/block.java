import java.util.Arrays;

class block {
    private int previousHash;
    private String[] transactions;

    private int blockHash;

    public block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        // contains list of hashes based on transactions
        Object[] contents = { Arrays.hashCode(transactions), previousHash };
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}