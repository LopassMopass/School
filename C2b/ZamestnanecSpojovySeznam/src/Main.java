public class Main {
    public static void main(String[] args) {
        //Zamestnanec print
        Firma firma = new Firma();
        for (Zamestnanec zamestnanec : firma) {
            System.out.println(zamestnanec+", ");
        }
        //Spojovy seznam print
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(3);
        myList.add(2);
        myList.add(1);
        myList.add(4);
        myList.addLast(10);
        myList.addLast(0);
        myList.add(8);

        //System.out.println(myList);
        /*
        System.out.println(myList.get(0));
        System.out.println(myList.get(myList.size() - 2));
        */
        /*
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        */
        for(int x : myList){
            System.out.println(x);
        }
    }
}