package Lab04;

    public class QueueArray {
        private int[] queue;
        private int rear;
        private int front;
        private int count;
        private int size;

         public QueueArray(int size) {
            this.size = size;
            queue = new int[size];
            front = 0;
            rear = -1;
            count = 0;
        }

        public void insert(int item) {
            if (isFull()) {
                System.out.println("Queue is full.Cannot insert");
            } else {
                rear++;
                queue[rear] = item;
                count++;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.Cannot remove.");
                return -1;
            } else {
                int item = queue[front];
                front++;
                count--;
                return item;
            }
        }

        public int peekFront() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return queue[front];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }

        public int getCount() {
            return count;
        }
        public void displayQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
            } else {
                System.out.print("Queue elements: ");
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            QueueArray queue = new QueueArray(3);

            queue.insert(10);
            queue.insert(20);
            queue.insert(30);

            queue.displayQueue();

            System.out.println("Removed: " + queue.remove());

            queue.displayQueue();

            System.out.println("Front Element: " + queue.peekFront());
            System.out.println("Queue Count: " + queue.getCount());

        }
    }


