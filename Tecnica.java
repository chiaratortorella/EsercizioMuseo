package museo;

public enum Tecnica {

    OLIOSUTELA("olio",1),
    TEMPERASUTELA("sale",2),
    DIPINTOMURALEASECCO("pepe",3);

    private String nome;
    private String n;
    public String getN() {
        return n;
    }

    Tecnica(String nome,int n){
        this.n = nome;
    }
}
