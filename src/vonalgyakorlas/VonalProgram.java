package vonalgyakorlas;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal v0 = new Vonal();
        Vonal v1 = new Vonal(3);
        Vonal v2 = new Vonal(10, "zöld");
        Vonal v3 = new Vonal(15, "piros", "pontozott");
        Vonal v4 = new Vonal(14, "kék", "szaggatott", 5);
        
        System.out.println(v0);
        System.out.println(v0.rajz());
        System.out.println(v1);
        System.out.println(v1.rajz());
        System.out.println(v2);
        System.out.println(v2.rajz());
        System.out.println(v3);
        System.out.println(v3.rajz());
        System.out.println(v4);
        System.out.println(v4.rajz());
    }

}
