package datastructures;

public class BinarySearchTreeSample {
    public static class Node {
        Node left, right;
        int data;
        public Node (int data){
            this.data = data;
        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean contain(int value) {
            if (data == value) {
                return true;
            } else if (value <= data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contain(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contain(value);
                }
            }
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInOrder();
            }
        }
    }

}
