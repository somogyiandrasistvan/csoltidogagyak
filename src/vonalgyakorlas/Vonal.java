package vonalgyakorlas;

public class Vonal {

    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    
    
    private int hossz;
    private String szin;
    private String tipus;
    private int eltolas;

    public Vonal() {
        this(1);
    }

    public Vonal(int hossz) {
        this(hossz, "fehér");
    }

    public Vonal(int hossz, String szin) {
        this(hossz, szin, "szimpla");
    }

    public Vonal(int hossz, String szin, String tipus) {
        this(hossz, szin, tipus, 0);
    }

    public Vonal(int hossz, String szin, String tipus, int eltolas) {
        setHossz(hossz);
        setSzin(szin);
        setTipus(tipus);
        setEltolas(eltolas);
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        if (hossz < 1) {
            hossz = 1;
        }
        this.hossz = hossz;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        if(szin == null || szin.isBlank()){
            szin = "fehér";
        }
        
        
        this.szin = szin;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getEltolas() {
        return eltolas;
    }

    public void setEltolas(int eltolas) {
        if (eltolas < 0) {
            eltolas = 1;
        }
        this.eltolas = eltolas;
    }

    public String rajz() {
        String eltolva = eltolva();
        String szine = szine();
        String hossza = hossza();
        return eltolva + szine + hossza;
    }

    public String eltolva() {
        String hossza = "";
        for (int i = 0; i < eltolas; i++) {
            hossza += " ";
        }
        return hossza;
    }

    public String hossza() {
        String tipusa = tipusa();
        String hossza = "";
        for (int i = 0; i < hossz; i++) {
            hossza += tipusa;
        }
        return hossza;
    }

    public String tipusa() {
        String tipusa = "";
        switch (tipus) {
            case "szimpla":
                tipusa = "_";
                break;
            case "szaggatott":
                tipusa = "-";
                break;
            case "pontozott":
                tipusa = ".";
                break;
        }
        return tipusa;
    }
    
    public String szine(){
        String szine = "";
        switch (szin){
            case "fehér":
                szine = WHITE;
                break;
            case "piros":
                szine = RED;
                break;
            case "kék":
                szine = BLUE;
                break;
            case "zöld":
                szine = GREEN;
                break;
        }
        return szine;
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", szin=" + szin + ", tipus=" + tipus + ", eltolas=" + eltolas + '}';
    }

}
