
package PromediarNotas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Promediar obj1 = new Promediar();
        System.out.println("Ingrese nombre");
        System.out.print("nombre :");
        obj1.setNombre(sc.next());
        System.out.println("Ingrese edad");
        System.out.print("Edad :"); 
        obj1.setEdad(sc.nextInt());
        System.out.println("Ingrese Pc1");
        System.out.print("PC1 :");
        obj1.setPc1(sc.nextInt());
        System.out.println("Ingrese Pc1");
        System.out.print("PC1 :");
        obj1.setPc2(sc.nextInt());
        System.out.println("Ingrese Pc2");
        System.out.print("PC2 :");
        obj1.setPc3(sc.nextInt());
        System.out.println("Ingrese Pc3");
        System.out.print("PC3 :");
        obj1.setEf(sc.nextInt());
        System.out.println("Ingrese EF");
        System.out.print("EF :");
        obj1.setEf(sc.nextInt());
        
        System.out.println(obj1.report());
        
        obj1.report();
        System.out.println();
        /* Segundo objeto */
        


        
    }
    
}

