package AI;

import java.util.Scanner;

public class BinaryTree {
    private static Scanner scanner = new Scanner(System.in);
    public static void play(Node<String> current) {
        while (!current.isLeaf()) {
            if (query(current.getData()))
                current = current.getLeft();
            else
                current = current.getRight();
        }

        System.out.print("My guess is " + current.getData() + ". ");
        if (!query("Am I right?"))
            learn(current);
        else
            System.out.println("I knew it all along!");
    }

    public static Node<String> beginningTree() {
        Node<String> root;
        Node<String> child;

        final String ROOT_QUESTION = "Are you a dog?";
        final String LEFT_QUESTION = "Are you bigger than a cat?";
        final String RIGHT_QUESTION = "Do you live underwater?";
        final String ANIMAL1 = "Akita";
        final String ANIMAL2 = "Norway rat";
        final String ANIMAL3 = "Trout";
        final String ANIMAL4 = "Starling";

        root = new Node<String>(ROOT_QUESTION, null, null);

        child = new Node<String>(LEFT_QUESTION, null, null);
        child.setLeft(new Node<String>(ANIMAL1, null, null));
        child.setRight(new Node<String>(ANIMAL2, null, null));
        root.setLeft(child);

        child = new Node<String>(RIGHT_QUESTION, null, null);
        child.setLeft(new Node<String>(ANIMAL3, null, null));
        child.setRight(new Node<String>(ANIMAL4, null, null));
        root.setRight(child);

        return root;
    }

    public static void learn(Node<String> current) {
        String guessAnimal;
        String correctAnimal;
        String newQuestion;

        guessAnimal = current.getData();
        System.out.println("I give up. What are you then? ");
        correctAnimal = scanner.nextLine();
        System.out.println("Please type a yes/no question that will distinguish a");
        System.out.println(correctAnimal + " from a " + guessAnimal + ".");
        newQuestion = scanner.nextLine();

        current.setData(newQuestion);
        System.out.println("As a " + correctAnimal + ", " + newQuestion);
        if (query("Please answer")) {
            current.setLeft(new Node<String>(correctAnimal, null, null));
            current.setRight(new Node<String>(guessAnimal, null, null));
        }
        else {
            current.setLeft(new Node<String>(guessAnimal, null, null));
            current.setRight(new Node<String>(correctAnimal, null, null));
        }
    }

    public static boolean query(String prompt)
    {
        String answer;

        System.out.print(prompt + " [Y or N]: ");
        answer = scanner.nextLine().toUpperCase();
        while (!answer.startsWith("Y") && !answer.startsWith("N")) {
            System.out.print("Invalid response. Please type Y or N: ");
            answer = scanner.nextLine().toUpperCase();
        }
        return answer.startsWith("Y");
    }
}
