package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long start;
		long end;

		start = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			arrayList.add(0,1);
			
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (end-start) + "ns");
		
		start = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			linkedList.add(0,1);
			
		}
		end = System.nanoTime();
		System.out.println("linkedList 걸린 시간 : " + (end-start) + "ns");
	}

}
