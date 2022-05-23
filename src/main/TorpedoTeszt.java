package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new TorpedoTeszt().tesztLoves(4);
    }
    
    public String tesztLoves(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
    
    
    
}
