
// Goal: Create simple blockchain method
// Eventually we will integrate this method
// with NFC radiofrequencies as input data 
import java.util.ArrayList;

class Main {
    ArrayList<block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransaction = { "testing lmao", "hi" };

        block genesis = new block(0, genesisTransaction);

        System.out.println(genesis.getBlockHash());
    }
}