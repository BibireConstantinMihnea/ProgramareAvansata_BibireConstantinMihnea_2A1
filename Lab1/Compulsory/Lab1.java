/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author Mihnea
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab1 app = new Lab1();
        app.helloWorld();
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n=n*3;
        n=n+0b10101;
        n=n+0xFF;
        n=n*6;
        int result = 0;
        while(n>0){
            result = result + n%10;
            n = n/10;
            if(result > 9){
                result = result%10 + result/10;
            }
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
    
    private static void helloWorld(){
        System.out.println("Hello World!");
    } 
    
}
