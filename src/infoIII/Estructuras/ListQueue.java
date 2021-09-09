package infoIII.Estructuras;

// ListQueue class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( x )      --> Insert x
// AnyType getFront( )    --> Return least recently inserted item
// AnyType dequeue( )     --> Return and remove least recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// getFront or dequeue on empty queue

/**
 * List-based implementation of the queue.
 *
 * @author Mark Allen Weiss
 */
public class ListQueue<AnyType> implements Queue<AnyType> {
    private ListNode<AnyType> front;
    private ListNode<AnyType> back;

    /**
     * Construct the queue.
     */
    public ListQueue() {
        front = back = null;
    }

    /**
     * Test if the queue is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Insert a new item into the queue.
     *
     * @param x the item to insert.
     */
    public void enqueue(AnyType x) {
        if (isEmpty())    // Make queue of one element
            back = front = new ListNode<>(x);
        else {                // Regular case
            back.next = new ListNode<>(x);
            back = back.next;
        }
    }

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws Exception if the queue is empty.
     */
    public AnyType dequeue() throws Exception {
        if (isEmpty())
            throw new Exception("ListQueue dequeue");

        AnyType returnValue = front.element;
        front = front.next;
        return returnValue;
    }

    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws Exception if the queue is empty.
     */
    public AnyType getFront() throws Exception {
        if (isEmpty())
            throw new Exception("ListQueue getFront");
        return front.element;
    }

    /**
     * Make the queue logically empty.
     */
    public void makeEmpty() {
        front = null;
        back = null;
    }
}