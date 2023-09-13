public class Zvire {
    private String name;
    enum druh{
        Bilozravec,
        Masozravec,
        Vsezravec
    }

    public Zvire(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
