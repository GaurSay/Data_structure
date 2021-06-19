package recursion;

import TicTacToe.Game;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabccba";
//		System.out.println(removeDup(s));
		Game game = new Game();
//		game.Play();
		
	}
	
	public static String removeDup(String s) {
		if(s.length() <=1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return removeDup(s.substring(1));
		}
		return s.charAt(0) + removeDup(s.substring(1));
  }
}
