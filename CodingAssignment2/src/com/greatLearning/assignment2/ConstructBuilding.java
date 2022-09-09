package com.greatLearning.assignment2;

import java.util.Scanner;
import java.util.PriorityQueue;

import com.greatLearning.util.MyComparator;

public class ConstructBuilding {
	
	private int totalFloors;
	private int[] arr;
	private final Scanner sc = new Scanner(System.in);
	private PriorityQueue<Integer> pq;
	
	ConstructBuilding(){
		System.out.print("Enter Total number of floors: ");
		System.out.println();
		totalFloors = sc.nextInt();
		arr = new int[totalFloors + 1];
		pq = new PriorityQueue<Integer>(totalFloors, new MyComparator());
	}
	
	public void createFloors() {
		
		for(int i = 1; i <= totalFloors ; i++) {
			
			System.out.println("Enter the floor size on given day: "+ i);
			arr[i] = sc.nextInt();
			pq.add(arr[i]);
		}
	}
	
	public void assemble() {
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(totalFloors+1 , new MyComparator());
		Integer top = pq.poll();
		Integer temp = 0;
		pq1.add(-1);
		for(int i = 1; i <= totalFloors; i++) {
			
			if(arr[i] != top) {
				pq1.add(arr[i]);
				System.out.println("Day: "+i);
				System.out.println();
			}else {
				System.out.println("Day: "+i);
				System.out.print(top+" ");
				top = pq.poll();
				temp = pq1.poll();
				while(top == temp && top != null) {
						System.out.print(top+ " ");
						top = pq.poll();
						temp = pq1.poll();
				}
				pq1.add(temp);
				System.out.println();
			}
		}
	}
}
