package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int num : numbers) {
            addNode(num, root);
        }
        dfs(root);
    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftSon());
        System.out.print(node.getNodeInt() + " ");
        dfs(node.getRightSon());
    }
    /*
     Разобрался , но пришлось подсмотреть в решение.
     Логику дерева сам понял и класс Node тоже, а вот с реализацией добавления узла весь день провозился
     Сложное задание, в первый раз полез в решение.
     */
    public static void addNode(int value, Node root) {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        Node nexNode = root;
        Node current = null;

        while (nexNode != null) {
            current = nexNode;

            if (value < current.getNodeInt()) {
                nexNode = current.getLeftSon();
            } else {
                nexNode = current.getRightSon();
            }
        }

        if (value < current.getNodeInt()) {
            current.setLeftSon(new Node(value));
        } else {
            current.setRightSon(new Node(value));
        }
    }
}