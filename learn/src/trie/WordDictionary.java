package trie;

/**
 * @Author 程序员小张
 * @Date 2023-01-08 21:07
 * @Desc 211 添加与搜索单词
 */
public class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        return helper(word, 0, root);
    }

    public boolean helper(String word, int pos, TrieNode node) {
        if (pos == word.length()) {
            return node.isWord;
        }
        char ch = word.charAt(pos);
        if (ch != '.') {
            return node.children[ch - 'a'] != null && helper(word, pos + 1, node.children[ch - 'a']);
        } else {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null && helper(word, pos + 1, node.children[i])) {
                    return true;
                }
            }
            return false;
        }
    }

}
