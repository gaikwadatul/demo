package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queue {

	public static void main(String[] args) {
		
		Queue queue=new PriorityQueue();
		queue.add(123);
		queue.add(542);
		queue.add(10);
		queue.add(222);
	System.out.println("Size of element: "+queue.size());
	System.out.println("Elemrnt of queue: "+queue);
	System.out.println("Elemrnt of queue element: "+queue.peek());
	System.out.println("Elemrnt of peek: "+queue);
	
	
	System.out.println("iteration queue using for each loop");
	for(Object obj : queue) {
		System.out.println(obj);
	}
		

	
	}

}
