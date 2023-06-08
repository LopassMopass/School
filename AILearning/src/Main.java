import AI.Node;

import static AI.BinaryTree.*;
public class Main {
    public static void main(String[] args) {
        Node<String> root;

        System.out.println("Think of an animal. I will ask you yes/no questions. Then through your answers I will try to guess your animal.");
        root = beginningTree();
        do
            play(root);
        while (query("Shall we try again?"));

        System.out.println("I am glad that I get your animal right. See you next time!");
    }
}
