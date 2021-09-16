package infoIII.Estructuras;

// Queue interface
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( x )      --> Insert x
// AnyType getFront( )    --> Return least recently inserted item
// AnyType dequeue( )     --> Return and remove least recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// getFront or dequeue on empty queue


// C
//     22
//     33333333
//     4444444
//     888888888888888
//     ^     ^   ^       ^                     ^
//     FB[1]  B[2]                                  B

/**
 * Protocol for queues.
 *
 * @author Mark Allen Weiss
 */
public class PriorityQueue<AnyType> {
    Queue<AnyType>[] colas;
    int priorities;

    public PriorityQueue(int prioridades) {
        priorities = prioridades;
        this.colas = new Queue[prioridades];
        for (int i = 0; i < prioridades; i++) {
            colas[i] = new ListQueue<>();
        }
    }

    /**
     * Insert a new item into the queue.
     *
     * @param x the item to insert.
     */
    void enqueue(AnyType x, int priority) {
        colas[priority].enqueue(x);
    }

    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws Exception if the queue is empty.
     */
    AnyType getFront() throws Exception {
        for (int i = 0; i < priorities; i++) {
            if(!colas[i].isEmpty())
                return colas[i].getFront();
        }
        throw new Exception("getFront Empty");
    }

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws Exception if the queue is empty.
     */
    AnyType dequeue() throws Exception {
        for (int i = 0; i < priorities; i++) {
            if(!colas[i].isEmpty())
                return colas[i].dequeue();
        }
        throw new Exception("getFront Empty");
    }

    /**
     * Test if the queue is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    boolean isEmpty() {
        for (int i = 0; i < priorities; i++) {
            if(!colas[i].isEmpty())
                return false;
        }
        return true;
    }

    /**
     * Make the queue logically empty.
     */
    void makeEmpty() {
        for (int i = 0; i < priorities; i++) {
            colas[i] = new ListQueue<>();
        }
    }
}