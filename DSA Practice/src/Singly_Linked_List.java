public class Singly_Linked_List {
   
    Node head; // head of list
   
    static class Node {
   
        int data;
        Node next;
   
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    // Method to insert a new node
    public static Singly_Linked_List insert(Singly_Linked_List list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
   
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = new_node;
        }
   
        // Return the list by head
        return list;
    }
   
    // Method to print the LinkedList.
    public static void printList(Singly_Linked_List list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
    
            // Go to next node
            currNode = currNode.next;
        }
    }
    
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
    	Singly_Linked_List list = new Singly_Linked_List();
   
        //
        // ******INSERTION******
        //
   
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 4);
        list = insert(list, 6);
        list = insert(list, 8);
        list = insert(list, 9);
        list = insert(list, 6);
        list = insert(list, 2);
        list = insert(list, 1);
   
        // Print the LinkedList
        printList(list);
    }
}