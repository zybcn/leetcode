package trie;

/**
 * @Author 程序员小张
 * @Date 2023-01-08 20:05
 * @Desc
 */
public class TrieNode {

    protected TrieNode[] children;

    protected boolean isWord;

    public TrieNode() {
        this.children = new TrieNode[26];
    }
}
