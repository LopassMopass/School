import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<EvidenceAut> set = new TreeSet<>();
        set.add(new EvidenceAut("R5TUUI7","Skoda","Karel"));
        set.add(new EvidenceAut("HERRFFF","S","Kare"));
        set.add(new EvidenceAut("DFJHRHT","Sk","Kar"));
        set.add(new EvidenceAut("FDKJFHE","Sko","Ka"));
        set.add(new EvidenceAut("RFOIJRR","Skod","K"));

        Comparator<EvidenceAut> comparator;
        for (EvidenceAut i : set) {
            System.out.println(i);
        }

        /*ArrayList<EvidenceKnih> array = new ArrayList<>();
        array.add(new EvidenceKnih("Most",1000,"Karel"));
        array.add(new EvidenceKnih("Karel",500,"Most"));
        array.add(new EvidenceKnih("Hral",300,"Hinek"));

        System.out.println();*/

    }
}