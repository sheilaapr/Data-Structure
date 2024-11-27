/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
class triangleRecursion{
    
//================= NOMOR 2 ========================
    public int recursion(int n){
        System.out.println("Segitiga ke- " + n );
        if(n == 1){
            System.out.println("Return 1");
            return 1;
        }else{
            int p =  n + recursion(n - 1);
            System.out.println("Return : " + p);
            return p;
        }
    }
    
    public int iteration(int n){
        int result = 0;
        for(int i = n; i > 0; i--){
            result += i;
            System.out.println("Return : " + result);
        }
        return result;
    }

//================ NOMOR 5 ========================  
    //rekursi
    public int factorialRec(int n){
        if(n == 0){
            return 1;
        }else{
            return (n * factorialRec(n - 1));
        }
    }
    
    //iterasi
    public int factorialIt(int n){ 
        int result = 1;
        for(int i = n; i > 0; i--){
            result *= i;
        }
        return result;
    }
}