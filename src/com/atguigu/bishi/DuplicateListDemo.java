package com.atguigu.bishi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateListDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("before:"+list.size());
		System.out.println("after:"+DuplicateListDemo.dupDeal(list).size());
		list = DuplicateListDemo.dupDeal(list);
		for (Integer element : list) {
			System.out.print(element+" ");
		}
	}
	
	public static List<Integer> dupDeal(List<Integer> mylist){
		
		Set set = new HashSet();
		set.add(mylist);
		return new ArrayList<Integer>(set);
	}
}
