package linkedList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(3, 23);
		list.remove(1);
		list.set(4, 40);
		System.out.println(list.get(3));
		System.out.println(list.size());
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+" ");
//		}
		
		for(int e:list) {
			System.out.print(e+ " ");
		}
		
		
	}

}
