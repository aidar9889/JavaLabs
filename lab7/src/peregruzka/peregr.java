/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peregruzka;

/**
 *
 * @author Acer
 */
public class peregr {
    
    public static void print(int x) {
        System.out.println("int: " + x);
    }
    
    public static void print(String str) {
        System.out.println("String: " + str);
    }
    
    public static void print(Integer x) {
        System.out.println("Integer: " + x);
    }
    
    public static void print(double x) {
        System.out.println("double: " + x);
    }
    
    public static void print(long x) {
        System.out.println("long: " + x);
    }
    
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    public static long min(long a, long b) {
        return a < b ? a : b;
    }
    
    public static double min(double a, double b) {
        return a < b ? a : b;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public static long max(long a, long b) {
        return a > b ? a : b;
    }
    
    public static double max(double a, double b) {
        return a > b ? a : b;
    }
    
    public static void main(String args[]) {
        
        print(76);
        print("76");
        
        Integer x = new Integer(76);
        print(x);
        
        int int_a = 7, int_b = 6;
        long long_a = 76, long_b = 6;
        double double_a = 7.6, double_b = 7.67;
        
        print(min(int_a, int_b));
        print(min(long_a, long_b));
        print(min(double_a, double_b));
        
        print(max(long_a, long_b));
        print(max(double_a, double_b));
        print(max(int_a, int_b));
        
    }
}
