package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new TorpedoTeszt().tesztLovesTalalat(4);
    }
    
    public String tesztLovesTalalat(int poz) {
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
    
    
    
}
