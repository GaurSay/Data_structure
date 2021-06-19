package Trie;

public class TrieUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Trie t = new Trie();
			t.add("there");
			t.add("their");
			System.out.println(t.search("there"));
			t.remove("there");
			System.out.println(t.search("there"));
//			System.out.println(t.search("theire"));
	}

}
