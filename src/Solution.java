import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    /**
     * Finds the kth smallest value in the binary tree.
     *
     * @param root The root node of the binary tree.
     * @param k The value of k to find the kth smallest.
     * @return The kth smallest value.
     */
    public int kthSmallest(TreeNode root, int k) {
        int counter = 0;  // Counter variable to track the number of visited nodes so far
        int value = -1;   // The kth smallest value to return, cannot find, return -1

        if (root == null) {
            return value;  // Return the default value -1 if the tree is empty
        }

        Deque<TreeNode> stack = new LinkedList<>();  // Create a deque to use as a stack
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);  // Push the current node to the stack to explore the left child
                current = current.left;
            }

            current = stack.pop();  // Pop the top node from the stack and set it as the current node
            counter++;
            value = current.val;  // Store the value of the current node
            if (counter == k) break;  // If the counter value equals k, exit the loop

            current = current.right;  // Move to the right child to continue the traversal
        }

        return value;  // Return the kth smallest value
    }
}
