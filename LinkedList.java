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
// 12) AddTwoNumbners in a linkedlist  **
// 13) Delete nth element from  Last in Linked list
// 14) Reverse a linked list
// 15)  Even and odd segregation in linkedlist 
// 16) Dutch national flag sortnumber(3) in linked list
// 17) Palindrome or not 
// 18) Left Rotate a linkedlist 
// 19)Intersection of linkedlist

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
    public static void printLL(Node head) {
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
        if(head == null){
            head = newNode;
            return;        }
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
        }while(slow!=fast && fast!=null);        //why ?  because when there are no more nodes to traverse, it will come out of this loop and then only
        if(fast==null) return false;
        return true;
    }

    // 11) Remove loop in a linkedlisttttttttt
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

         if(slow != fast){    // linear linked list
              return;         
         }
         if(slow == head){
            prev.next = null;      // why ?  because it will make the last node point to nothing, which means no loop present
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

    // 12) AddTwoNumbners in a linkedlist

    public static Node addTwoLinkedlists(Node l1, Node l2) {
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        Node head = new Node(-1);
        Node newHead = head;
        while (temp1 != null || temp2 != null) {
            int sum = 0;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            newHead.next = newNode;
            newHead = newNode;
        }
        Node newNode = new Node(carry);
        if (carry != 0) {
            newHead.next = newNode;
        }
        return head.next;

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

    // 15)  Even and odd segregation in linkedlist
    public static Node evenOddSegregate(){
        Node evenHead = new Node(-1);
        Node oddHead = new Node(-1);
        Node even = evenHead;
        Node odd = oddHead;
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(index%2==0){
                even.next = temp;
                even = even.next;
            }
            else{
                odd.next = temp;
                odd = odd.next;
            }
            //index++;
            temp = temp.next;
            index++;
        }
        // even.next = oddHead.next;
        //  odd.next = null;
        //  return evenHead.next;
        even.next = null;
         odd.next = evenHead.next;
         return oddHead.next;
    }


    //16) Dutch national flag sortnumber(3) in linked list
    public static Node sortColors(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead, one = oneHead, two = twoHead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        // Connect the sublists
        one.next = twoHead.next;
        zero.next = oneHead.next;
        two.next = null;
        // Return the head of the sorted list
        return zeroHead.next;
    }
    
    
    
    
    // 17) Palindrome or not
    
    public static boolean isPalindrome() {
        if (head == null || head.next == null) return true; // Handling case with 0 or 1 node
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) { // Move slow to the middle of the list
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow.next;
        Node next;
        while (curr != null) { // Reverse the second half of the list
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow.next = prev; // Update the next of the middle node to the new head of the reversed list
        Node p1 = head; // Pointer to the start of the first half
        Node p2 = prev; // Pointer to the start of the second half
        while (p1 != slow.next && p2 != null) { // Check for palindrome
            if (p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    // 18) Left Rotate a linkedlist 
    public static Node leftRotate(int k){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        count++;
        if(k%count==0) return head;
        k=k%count;
        temp.next=head;
        Node prev=null;
        for(int i=0;i<count-k+1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        head=temp;
        return head;
    }
    

    public static Node head2;
    public static int lenOfLL1(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public static int lenOfLL2(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    // 19) Intersection of linkedlist
    public static void intersectionOfLL(Node head1, Node head2) {
        int len1 = lenOfLL1(head1);
        int len2 = lenOfLL2(head2);
        if (len1 > len2) {
            int steps = len1 - len2;
            while (steps != 0) {
                head1 = head1.next;
                steps--;
            }
        } else if (len2 > len1) {
            int steps = len2 - len1;
            while (steps != 0) {
                head2 = head2.next;
                steps--;
            }
        }
        // Now head1 and head2 are at the same distance from the intersection point
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                // Intersection found
                System.out.println("Intersection found at node with value: " + head1.data);
                return;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        // No intersection found
        System.out.println("No intersection found.");
    }
    
    
    public static void main(String[] satish) {
        // head = new Node(2);
        // head.next = new Node(2);
        // head.next.next = new Node(0);
        // head.next.next.next = new Node(1);
        // head.next.next.next.next = new Node(2);
        // head.next.next.next.next.next = new Node(1);
        // head.next.next.next.next.next.next = new Node(0);
        //head.next.next.next.next.next.next.next = head.next.next.next;
        //printLL();
        //isCyclic();
        //removeLoop();
        // printLL();
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
        // reverseLinkedList();
        // printLL();
        // head = evenOddSegregate();
    //    printLL(head);
    //     head = sortColors(head);
        //System.out.println(isPalindrome());
        //  printLL(head);
        //  int k = 2;
        //  leftRotate( k);
        // printLL(head);
       
        // Node l1 = new Node(2);
        // l1.next = new Node(4);
        // Node commonNode = new Node(3); // Creating a common node
        // l1.next.next = commonNode;
        // l1.next.next.next = new Node(5);
        // printLL(l1);

        // Node l2 = new Node(2);
        // l2.next = new Node(4);
        // l2.next.next = commonNode; // Making l2 share the common node
        // printLL(l2);

        // int count1 = lenOfLL1(l1);
        // System.out.println("Length of l1: " + count1);
        // int count2 = lenOfLL2(l2);
        // System.out.println("Length of l2: " + count2);
        // intersectionOfLL(l1, l2);

      //  printLL(head);

        // Node l1 = new Node(2);
        // l1.next = new Node(4);
        // Node commonNode = new Node(3); // Creating a common node
        // l1.next.next = commonNode;
        // l1.next.next.next = new Node(5);
        // printLL(l1);

        // Node l2 = new Node(2);
        // l2.next = new Node(4);
        // l2.next.next = commonNode; // Making l2 share the common node
        // printLL(l2);

        // Node add = addTwoLinkedlists(l1, l2);
        // System.out.println("The sum of two linked lists is : ");
        // printLL(add);

        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        l1.next.next.next = new Node(5);
         printLL(l1);
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        l2.next.next.next = new Node(2);
         printLL(l2);
         head = addTwoLinkedlists(l1, l2);
        printLL(head);

        
    }
}