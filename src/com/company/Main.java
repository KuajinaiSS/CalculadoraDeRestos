package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CALCULADORA DE RESTOS");
        System.out.println("tipe una letra  para cerrar para cerrar");
        System.out.println("===============================================================\n");
        while (true) {
            System.out.println("( a / b )");
            System.out.print("ingrese a: ");
            String aa = scan.next();
            if(!validacionInt(aa)){
                break;
            }
            System.out.print("ingrese b: ");
            String bb = scan.next();
            if(!validacionInt(bb)){
                break;
            }
            int a = Integer.parseInt(aa);
            int b = Integer.parseInt(bb);
            System.out.println("(" + a + "/" + b + ") = " + a / b);
            System.out.println("El resto es: " + a % b);
            System.out.println("===============================================================");
        }
    }
    public static boolean validacionInt(String cadena){
        int num;
        try{
            num = Integer.parseInt(cadena);
            return true;
        }catch (Exception e){
            System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx CERRANDO xxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
            return false;
        }
    }
}