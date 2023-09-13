public class RodneCislo {
    private String rCislo;
    public  void  setRodneCislo(String rCislo) throws  Exception {
        if(!rCislo.matches("")){
            throw new Exception("Neni rodne cislo");
        }
        this.rCislo = rCislo;
    }

    public RodneCislo(String rCislo) throws Exception {
        this.setRodneCislo(rCislo);
    }
}
