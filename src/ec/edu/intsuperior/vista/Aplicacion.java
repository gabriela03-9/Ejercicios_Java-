/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
packagee ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Aplicacion {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        


}
    public static void ejerccio_1(){
      System.out.println("Ingrese el primer número:");
    int num1 = scanner.nextInt();

    System.out.println("Ingrese el segundo número:");
    int num2 = scanner.nextInt();

    System.out.println("Ingrese el tercer número:");
    int num3 = scanner.nextInt();

    // Ordenar los números de mayor a menor
    int mayor = Math.max(num1, Math.max(num2, num3));
    int medio = (num1 + num2 + num3) - mayor - Math.min(num1, Math.min(num2, num3));
    int menor = Math.min(num1, Math.min(num2, num3));

    System.out.println("Los números ordenados de mayor a menor son:");
    System.out.println(mayor);
    System.out.println(medio);
    System.out.println(menor);
  }
}
public static void ejercicio_2(){
double o,p;
 System.out.print("Introduce el radio de un circulo: ");
        r=Entrada.real();
a=Math.PI*(r*r); 
System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
    
public static void ejercicio_3(){
 double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r=Entrada.real();
        l=2*Math.PI*r;
        
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);

}
public static void ejercio_4(){
int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        if(n1==n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

}
public static void ejercicio_5() {
         int t[];         
         
         t = new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.print("Introduzca un número: ");
            t[i]=Entrada.entero();
        }
        System.out.println("Los números son:");
        for (int i=0;i<5;i++)
            System.out.println(t[i]);
}
public static void ejercicio_6(){
 int suma=0;
        for (int i =1; i <=n ; i++)
            suma += 2*i-1;       // así calculamos el i-ésimo impar
        return (suma);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Introduzca un numero: ");
 n =Entrada.entero();
        System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares (n));

}
public static void ejercicio_7(){

int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        if(n1==n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales")
}
public static void ejercicio_8(){

}
 int a,b,c;
        System.out.print("Introduzca primer número: ");
        a=Entrada.entero();
        System.out.print("Introduzca segundo número: ");
        b=Entrada.entero();
        System.out.print("Introduzca tercer número: ");
        c=Entrada.entero();
        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
 else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a) 
                     System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                  }
               }
            }
        }
    }
 }
public static void ejercicio_9

}

