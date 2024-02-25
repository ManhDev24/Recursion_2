/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion_demo2;

/**
 *
 * @author NC
 */
public class Recursion_demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Binary: " + convert(266, 2));
        System.out.println("Decimal: " + convert(266, 10));
        System.out.println("Octal: " + convert(266, 8));
        System.out.println("Hexadecimal: " + convert(266, 16));
    }
    public static String convert (int n , int base){
        if(n==0) return "0";
        return convert(n/base, base) + Character.forDigit(n%base, base);
    }
    
}
