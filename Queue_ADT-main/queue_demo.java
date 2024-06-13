package arraylist;
import java.util.*;
public class queue_demo {
	public static void main(String[] args) {
		 ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		 que.add(1); //Adds a new element k to the back of the queue
		 que.add(2);
		 que.add(3);
		 System.out.println("Queue : "+que); //DISPLAY
		 System.out.println("Queue size : "+que.size()); //KNOW THE SIZE
		 System.out.println("Queue peek : "+que.peek()); //TOP ELEMENT RETURN
		 System.out.println("Queue remove : "+que.remove()); //Removes an element from the front of the queue and return its value
		 System.out.println("Queue isEmpty : "+que.isEmpty()); //Returns 1 if the queue is empty otherwise returns 0
		 }

}
