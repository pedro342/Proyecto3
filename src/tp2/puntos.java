package tp2;

import java.util.*;
public class puntos {
   void punto_1(){
       String bin1, bin2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Eligio sumar numeros binarios: ");
    do{
        System.out.println("Ingresar el primer numero en binario de 4 digitos: ");
         bin1 = sc.nextLine();
        System.out.println("Ingresar el segundo numero en binario de 4 digitos: ");
         bin2 = sc.nextLine();

    }while(bin1.length()<4 || bin2.length()<4 );
    int bn1 = Integer.parseInt(bin1, 2);
    int bn2 = Integer.parseInt(bin2, 2);
    int suma = bn1 + bn2;
    System.out.println("el primer numero ingresado es:"+bn1+", el segundo numero ingresado es:"+bn2+", y su suma es:"+suma);
   }
   void punto_2(){
       Scanner sc = new Scanner(System.in);
       int factorial=1;
       System.out.println("Eligio calcular el desarrollo de un factorial: ");
       System.out.println("Ingrese el numero del cual quiere calcular el factorial: ");
       int numero = sc.nextInt();
       while(numero != 0){
            factorial = factorial*numero;
            numero--;
       }
       System.out.println("El valor del factorial es: "+factorial);
       
   }
    void punto_3(){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[30];
        int i, series=0;
        System.out.println("Diga cuantos numeros desea ingresar");
        int n = sc.nextInt();
        for(i=0; i<=n; i++){
            System.out.println("Ingrese numeros: ");
            num[i] = sc.nextInt();
        }
        for(i = 0; i<=n; i++){
            if(num[i]-1==num[i+1]){
                series++;
            }
        }
        System.out.println(series);
    }
    void punto_4(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Cuantos puntos en el plano quiere evaluar?");
     int n = sc.nextInt();
     double sup_p = 0;
     double sup_n = 0;
     int triangulos_p = 0;
     int triangulos_n = 0;
     
     for(int i=0; i<n; i++ ){
       System.out.println("Ingrese x: ");
       int x = sc.nextInt();
       
       System.out.println("Ingrese y: ");
       int y = sc.nextInt();
      
       if(y>0){
           sup_p = sup_p + ((y*x)/2);
           triangulos_p ++;
       }else{
           sup_n = sup_n + ((y*x)/2);
           triangulos_n ++;
       }
     }
     
    System.out.println("Hay "+ triangulos_p +" triangulos de superficie positiva y " + "la suma de sus superficies es "+ sup_p + "\nHay " + triangulos_n + " triangulos de superficie negativa"+" y la suma de sus superficies es " + sup_n);
     
    
    }
    
    void punto_5(){
        Scanner sc = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingresar un numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresar un segundo numero: ");
        int b = sc.nextInt();
        for(int i=0; i<(b/2-a); i++){
            suma = suma+(a+i);
            System.out.print(a+i + "+");
        }
        System.out.print("="+ suma);
    }
    void punto_6(){
        Random random = new Random();
        int puntaje=0, tiros; 
        do{
        tiros = random.nextInt(6)+1;
        puntaje = puntaje + tiros;
        System.out.println("salio el numero "+tiros);
        }while(tiros%2!=0);
        System.out.print(puntaje);
    }
    void punto_7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero x: ");
        int x = sc.nextInt();
        int y=1;
        for(int i = 0; i<(x-y); i++){
            if(y%2!=0){
                
            }
        }
    }
}
