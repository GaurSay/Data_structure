package Hashmap;

public class MapUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new Map<>();
		for (int i = 0; i < 20; i++) {
			hm.insert("a" + i, i * 2);
			System.out.println(hm.getloadFactor());
		}
	}
}
