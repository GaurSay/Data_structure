package Basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<laptop> list = new ArrayList<>();
		list.add(new laptop("hp",12,12000));
		list.add(new laptop("dell",8,19000));
		list.add(new laptop("apple",6,67000));
		
		List<monitor> list2 = new ArrayList<>();
		list2.add(new monitor("hp",12,12000));
		list2.add(new monitor("dell",8,19000));
		list2.add(new monitor("apple",6,67000));
		
		Collections.sort(list);
		for (laptop l : list) {
			System.out.println(l.ram);
		}
		Comparator<monitor> com = new Comparator<>() {
			public int compare(monitor m,monitor n) {
				return n.price-m.price;
			}
		};
		
		Collections.sort(list2,com);
		for (monitor m : list2) {
			System.out.println(m.price);
		}
	}
}
class laptop implements Comparable<laptop>{
	String name;
	int ram;
	int price;
	public laptop(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	public int compareTo(laptop o) {
		return o.ram-this.ram;
	}
}
class monitor{
	String name;
	int ram;
	int price;
	public monitor(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
}
