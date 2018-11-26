/**
 * Title:       TestQueue2.java
 * Description: A test drive program for the Queue class
 * 				Used SimpleInput class methods for inputs
 * Company:     ICT HKIVE(TY)
 * @author      Patrick Tong
 */


public class TestQueue {

    public static void main(String[] args) {
	ListQueue queue = new ListQueue();
		queue.enqueue("Alex");
		queue.enqueue("Sandy");
		queue.enqueue("Betty");
		System.out.println(queue);

		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
    }

} // clas TestQueue