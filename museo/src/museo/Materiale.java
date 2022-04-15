package museo;

public enum Materiale {
    MARMO(4),
    MARMOBIANCO(5),
    MARMOPERLA(6);


    public int getG() {
        return g;
    }

    private int g;

    Materiale(int g){
        this.g = g;
    }

}
