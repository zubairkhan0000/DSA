class TrieNode {
    TrieNode[] children;
    boolean isEndofWord;

    TrieNode() {
        children = new TrieNode[2];
        isEndofWord = false;
    }
}

public class BinaryTrie {
    private TrieNode root;

    public BinaryTrie() {
        root = new TrieNode();
    }

    public void insert(String binaryString) {
        TrieNode current = root;
        for (int i = 0; i < binaryString.length(); i++) {
            int index = binaryString.charAt(i) - '0';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndofWord = true;
    }

    public boolean search(String binaryString) {
        TrieNode current = root;
        for (int i = 0; i < binaryString.length(); i++) {
            int index = binaryString.charAt(i) - '0';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current != null && current.isEndofWord; 
    }
    public static void main(String[] args) {
        BinaryTrie trie = new BinaryTrie();
        trie.insert("1010");
        trie.insert("1101");
        trie.insert("1110");
        trie.insert("1001");
        System.out.println("Searching for 1010: " + trie.search("1010"));
        System.out.println("Searching for 1111: " + trie.search("1111"));
    }
}
