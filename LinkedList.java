// 1) Print the linkedlist
// 2) Add element at begininning of the linkedlist
// 3) Count of nodes(Length of linkedlist)
// 4) Add an element to the last in the linkedList
// 5) Adding an element at given position in the LinkedList
// 6) Search an element in the linkedlist
// 7) Delete a node at the beginning of the linkedlist
// 8) Delete a node at the End of the Linked List
// 9) delete a node at particular position of the linkedlist
// 10) Cyclic or loop presence or not in a linked list
// 11) Remove loop in a linkedlist 
// 12) AddTwoNumbners in a linkedlist
// 13) Delete nth element from  Last in Linked list
// 14) Reverse a linked list
// 15)

public class LinkedList {
    static class Node { 
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node head;
   //1) Print the linkedlist
    public static void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //2) Add element at begininning of the linkedlist
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //3) Count of nodes(Length of linkedlist)
    public static void countNodes() {
        Node temp = head;
        int count=0;
        while(temp != null) {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    //4) Add an element to the last in the linkedList
    public static void addLast(int data) {
        Node temp = head;
        while(temp.next != null) {
            temp=temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
    }
    //5) Adding an element at given position in the LinkedList
    public static void addAtParticularPos(int data, int target) {
        if(target < 0) {
            System.out.println("given target is below 0");
            return;
        }
        if(target == 0) {
            addFirst(data);
            return;
        }
        int count = 0;
        Node temp = head;
        while(count != target-1) {
            count++;
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode; 
    }
    // 6)Search an element in the linkedlist
    public static boolean search(int data) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == data) return true;
            temp = temp.next;
        }
         return false;
    }
    //7) Delete a node at the beginning of the linkedlist
    public static void deleteFirst() {
        head = head.next;
    }
    //8) Delete a node at the End of the Linked List
    public static void deleteLast() {
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    //9) delete a node at particular position of the linkedlist
    public static void delAtParticularPos(int target) {
        if(target < 0) {
            System.out.println("given target is below 0");
            return;
        }
        if(target == 0) {
            deleteFirst();
            return;
        }
        int count = 0;
        Node temp = head;
        while(count != target-1) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // 10) Cyclic or loop presence or not in a linked list
    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(slow!=fast && fast!=null);
        if(fast==null) return false;
        return true;
    }

    // 11) Remove loop in a linkedlist
    public static void removeLoop() {
        Node  slow = head;
        Node  fast = head;
        Node  prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow ==  fast) break;
        }

         if(slow != fast){
              return;
         }
         if(slow == head){
            prev.next = null;
            return;
         }
        slow = head;
       
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

   
    // 13) Delete nth element from  Last in Linked list
    public static void deleteNFromLast(int n){
        Node fast = head;
        while(n!=0 && fast!=null){
            fast = fast.next;
            n--;
        }
        if(n!=0){
            System.out.println("This can't  be possible give n value between 0 to lenth");
            return;
        }
        if(fast == null){
            head = head.next;
            return;
        }
        Node slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }


    // 14) Reverse a linked list

    public static void reverseLinkedList(){
        Node prev = head;
        Node current = head.next;
        while(current != null){
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head.next=null;
        head = prev;
    }

    
    public static void main(String[] satish) {
        head = new Node(15);
        head.next = new Node(20);
        head.next.next = new Node(25);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(35);
        head.next.next.next.next.next = new Node(45);
        head.next.next.next.next.next.next = new Node(66);
        //head.next.next.next.next.next.next.next = head.next.next.next;
        //printLL();
        //isCyclic();
        //removeLoop();
        printLL();
        //removeLoop();
        // addFirst(3243);
        // printLL();
        // countNodes();
        // addLast(3214);
        // printLL();
        // addAtParticularPos(3223,2);
        // printLL();
        // System.out.println(search(300));
        // deleteFirst();
        // printLL();
        // deleteLast();
        // printLL();
        // delAtParticularPos(3);
        // printLL();
        // int n = 1;
        // deleteNFromLast(n);
        // printLL();
        reverseLinkedList();
        printLL();
    }
}