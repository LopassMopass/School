package DynamickePole;

public class Trida<E> {
    private E[] array;
    private int count;
    //Udela nam Array
    public Trida(int size){
        array = (E[]) new Object[size];
        count = 0;
    }
    //Udela nam Array s velikosti vetsi nez 0
    public Trida(){
        array = (E[]) new Object[3];
        count = 0;
    }
    //Funkce add v ArrayListu
    public void add(E element){
        if(count >= array.length){
            E[] help = (E[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++){
                help[i] = array[i];
            }
            array = help;
        }
        array[count] = element;
        count++;
    }
    //Vyhleda nam index v ArrayListu
    public E get(int index) {
        if(index < 0 || index >= count){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
    //Pocet prvku v poli
    public int size(){
        return count;
    }
}
