package Trie;

public class Trie {
	
	private TrieNode root;

	Trie(){
		root = new TrieNode('\0');
	}
	
	public void add(String word) {
		add(root,word);
	}
	
	private void add(TrieNode n,String word) {
		if(word.length() ==0) {
			n.isTerminating = true;
			return;
		}
		
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childSize++;
		}
		add(child,word.substring(1));
	}
	
	public boolean search(String word) {
		return search(root,word);
	}

	private boolean search(TrieNode n, String word) {
		
		if(word.length() == 0) {
			return n.isTerminating;
		}
		
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		
		if(child == null){	
			return false;
		}
		return search(child,word.substring(1));
	}
	
	public void remove(String word) {
		remove(root,word);
	}

	private void remove(TrieNode n, String word) {
		if(word.length() == 0) {
			n.isTerminating = false;
			return;
		}
		
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		
		if(child == null){	
			return ;
		}
		remove(child,word.substring(1));
		
		if(!child.isTerminating && child.childSize ==0) {
			root.children[childIndex] = null;
			child = null;
			root.childSize--;
		}
		
//		if(!child.isTerminating) {
//			int numChild =0;
//			for(int i =0;i<26;i++) {
//				if(child.children!=null) {
//					numChild++;
//				}
//			}
//			if(numChild ==0) {
//				// we can delete child
//				root.children[childIndex] = null;
//				child = null;
//				root.childSize--;
//			}
//			
//		}
	}
	
	public int countWords() {
		// Write your code here
        
        return countWords(root);
	}
    
    private int countWords(TrieNode root){
        int count =0;
        for(int i=0;i<26;i++){
            TrieNode child = root.children[i];
            if(child != null){
                if(child.isTerminating){
                    count++;
                }
                count += countWords(child);
            }
        }
        return count;
    }
}

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childSize;
	
	TrieNode(char data){
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childSize = 0;
	}
}
