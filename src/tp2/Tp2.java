package tp2;

import java.util.Scanner;

public class Tp2 {

    public static void main(String[] args) {
        puntos pt = new puntos();
        Scanner sc = new Scanner(System.in);
        int opciones;
        System.out.println("En este tp hay 7 puntos para elegir, ingrese cuantos quiere probar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Que programa desea probar: ");
            System.out.println("1:");
            System.out.println("2:");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    pt.punto_1();
                    break;
                case 2:
                    pt.punto_2();
                    break;
                case 3:
                    pt.punto_3();
                    break;
                case 5:
                    pt.punto_5();
                    break;
                case 6:
                    pt.punto_6();
                    break;
            }

        }
    }

}
