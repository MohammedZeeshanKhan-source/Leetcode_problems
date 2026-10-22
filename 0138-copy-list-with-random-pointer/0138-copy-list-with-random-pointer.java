/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/



class Solution {
    public Node copyRandomList(Node head) {

        // If the original linked list is empty, return null
        if (head == null) {
            return null;
        }

        // STEP 1: Insert a cloned node after every original node

        // Start traversing from the original head
        Node temp = head;

        // Continue until we reach the end of the original list
        while (temp != null) {

            // Create a new node with the same value as the original node
            Node cloneNode = new Node(temp.val);

            // Connect the clone to the original node's next node
            // Example: A -> B becomes A -> A' -> B
            cloneNode.next = temp.next;

            // Connect the original node to its clone
            temp.next = cloneNode;

            // Move to the next original node, skipping the clone
            temp = cloneNode.next;
        }

        // STEP 2: Copy the random pointers

        // Start again from the original head
        temp = head;

        // Traverse the interleaved original and cloned nodes
        while (temp != null) {

            // The node immediately after the original is its clone
            Node cloneNode = temp.next;

            // Check whether the original node has a random pointer
            if (temp.random != null) {

                // The clone of temp.random is immediately after temp.random
                // Therefore, temp.random.next points to the correct cloned node
                cloneNode.random = temp.random.next;
            }

            // Move to the next original node, skipping its clone
            temp = cloneNode.next;
        }

        // STEP 3: Separate the original list and the cloned list

        // Start from the original head
        temp = head;

        // Save the head of the cloned list before separating the lists
        Node cloneHead = head.next;

        // Continue until all original nodes have been processed
        while (temp != null) {

            // Get the clone immediately after the current original node
            Node cloneNode = temp.next;

            // Restore the original list by connecting the original node
            // to the next original node
            temp.next = cloneNode.next;

            // If another original node exists, its clone also exists
            if (cloneNode.next != null) {

                // Connect the current clone to the next clone
                cloneNode.next = cloneNode.next.next;
            }

            // Move to the next original node
            temp = temp.next;
        }

        // Return the head of the completely separated cloned list
        return cloneHead;
    }
}
