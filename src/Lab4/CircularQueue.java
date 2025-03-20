package Lab4;
import java.util.Scanner;

public class CircularQueue {
    private int[] queue;
    private int rear;
    private int front;
    private int count;
    private int size;

    public CircularQueue(int size){
        this.size=size;
        queue=new int[size];
        front=0;
        rear=-1;
        count=0;
    }
    public void insert(int item){
        if (isFull()){
            System.out.println("Queue is full");
        }else{
            rear=(rear+1)%size;
            queue[rear]=item;
            count++;
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }else{
            int item=queue[front];
            front=(front+1)%size;
            count--;
            return item;
        }
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==size;
    }
    public void dispalyQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue elements: ");
            for (int i=0;i<count;i++){
                System.out.println(queue[(front+i)%size]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int queueSize=input.nextInt();
        CircularQueue queue=new CircularQueue(queueSize);

        for(int i=0;i<queueSize;i++){
            System.out.print("Enter element to insert: ");
            int value=input.nextInt();
            queue.insert(value);
        }


        System.out.print("Enter new element to insert: ");
        queue.insert(input.nextInt());

        System.out.println("Removing: "+queue.remove());

        System.out.print("Enter new element to insert: ");
        queue.insert(input.nextInt());

        System.out.print("Enter another element to insert: ");
        queue.insert(input.nextInt());

    }
}
