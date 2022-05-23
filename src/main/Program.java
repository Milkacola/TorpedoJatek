package main;

import java.util.Random;
import java.util.Scanner;

public class Program {

    private static String[] palya = new String[7];
    
    public static void main(String[] args) {
        System.out.println("Fő program");
        general();
        elhelyez();
        jatek();
    }
    
    public static void general() {
        for (int i = 0; i < palya.length; i++) {
            palya[i] = "-";
        }
        kiir();
    }
    
    public static void elhelyez() {
        Random rnd = new Random();
        int szam = rnd.nextInt(5);
        Hajo hajo = new Hajo(new int[]{szam,szam+1,szam+2});
        
        for (int i = 0; i < 3; i++) {
            palya[i + szam] = "X";
        }
        
    }
    
    public static void kiir(){
        elhelyez();
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i] + " ");
        }
    }
    
    public static void jatek(){
        boolean sullyedt = false;
        while (sullyedt==false) {            
            int lovesekSzama = 0;
            int talalatokSzama = 0;
            Scanner src = new Scanner(System.in);
            System.out.println("Hova szeretne lőni?");
            int tipp = src.nextInt();
            lovesekSzama = lovesekSzama+1;
            if (palya[tipp-1]=="X") {
                    System.out.println("talált");
                    talalatokSzama = talalatokSzama+1;
                }
            else{
                System.out.println("nem talált");
            }
            if (talalatokSzama==3) {
                sullyedt=true;
            }
            System.out.println("Eddigi lövések " + lovesekSzama + " db.");
        }
        System.out.println("Talált, süllyedt. Játék vége!");
    }
    
}
