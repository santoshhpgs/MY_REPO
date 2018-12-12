package com.personal.datastructures;
public class QueueImpl {
    
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;
     
    public QueueImpl(int queueSize)
    {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
 
    /**
     * this method adds element at the end of the queue.
     * @param item
     */
    public void show()
	{	
		for(int i:queueArr)
		{
			System.out.print(i +" ");
		}
		System.out.println();
	}

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: "+item);
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue !");
        }
    }
 
    /**
     * this method removes an element from the top of the queue
     */
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Pop operation done ! removed: "+queueArr[front-1]);
                front = 0;
            } else {
                System.out.println("Pop operation done ! removed: "+queueArr[front-1]);
            }
            currentSize--;
        }
    }
 
    /**
     * This method checks whether the queue is full or not
     * @return boolean
     */
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
     
    /**
     * This method checks whether the queue is empty or not
     * @return
     */
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
     
    public static void main(String a[]){
         
        QueueImpl queue = new QueueImpl(4);
        queue.show();
        queue.enqueue(4);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(56);
        queue.show();
        queue.enqueue(2);
        queue.show();
        queue.enqueue(67);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}