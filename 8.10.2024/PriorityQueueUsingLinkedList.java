public class PriorityQueueUsingLinkedList {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue() ;
        pq.enque(3 , 3) ;
        pq.enque(1 , 1) ;
        pq.enque(2 , 2) ;

        System.out.println(pq.deque()) ;
    }
}


class Node {
    int data ; 
    int priority ;
    Node next ;

    Node(int data , int priority) {
        this.data = data ;
        this.priority = priority ;
        this.next = null;
    }
}

class PriorityQueue {
    Node head ; 

    PriorityQueue() {
        head = null ;
    }

    void enque(int data , int priority) {
        Node newNode = new Node(data , priority) ;

        if(head == null) {
            head = newNode ;
            head.next = null ;
        }

        // head pehle aayega
        if(head != null || head.priority<newNode.priority) {
            Node temp = head ;
            head = newNode;

            while(temp != null && temp.priority<newNode.priority) {
                temp = temp.next ;
            }
            newNode.next = temp.next ;
            temp.next = newNode ;
        }
    }
 
    int deque() {
        if(head==null) {
            System.out.println("priority queue is empty");
            return -1 ;
        }
        int res = head.data ;
        head = head.next ;
        return res ;
    } 

    int peek() {
        if(head==null) {
            System.out.println("priority queue is empty");
            return -1 ;
        }
        return head.data ;
    }
}
