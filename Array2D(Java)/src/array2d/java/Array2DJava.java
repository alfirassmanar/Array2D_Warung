/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d.java;
import java.util.Scanner;

/**
 *
 * @author alfir
 */
public class Array2DJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order[][] = new String [5][3]; // [] depan baris [] belakang kolom
        int nominal [][] = new int [5][10];
        int chose1, chose2, pilih3;
        int index = 0,
            food = 0,
            drink = 0,
            payment,
            change,
            indexfood = 0, 
            indexdrink = 0,
            indextotal = 0,
            amount1 = 0;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("--------------------------------");
        }
        System.out.println("Welcome to My Program");
        for (int i = 0; i < 2; i++) {
            System.out.println("--------------------------------");
        }
        for(String b = "y"; b.equals("y") || b.equals("Y");){
        do {
            System.out.println("\nMENU");
            System.out.println("1. Food");
            System.out.println("2. Drink");
            System.out.println("click (3) for Done");
            System.out.print("Chose : ");
            chose1 = sc.nextInt();
            
            switch(chose1) {
                    case 1:
                        System.out.println("Food list");
                        System.out.println("1. Burger");
                        System.out.println("2. Pizza");
                        System.out.println("3. Roti-O");
                        System.out.print("Chose : ");
                        chose2 = sc.nextInt(); 
                        switch(chose2){
                                case 1:
                                    order[indexfood][0] = "Burger ";
                                    nominal[indexfood][0] = 25000;
                                break;
                                case 2:
                                     order[indexfood][0] = "Pizza ";
                                     nominal[indexfood][0] = 65000;
                                break;
                                case 3:
                                     order[indexfood][0] = "Roti-O";
                                     nominal[indexfood][0] = 20000;
                                break;
                        }
                        System.out.print("Amount : ");          //Jumlah Makanan
                        amount1 = sc.nextInt();
                        nominal [indexfood][2] = amount1;
                        nominal[indexfood][4] = nominal[indexfood][0] * nominal[indexfood][2];
                        food = nominal[indexfood][4];
//                      nominal[indexmakanan][6] = nominal[indexmakanan][4];
                        indexfood++;
                    break;
                    
                    case 2:
                        System.out.println("List Drink");
                        System.out.println("1. Coca-Cola");
                        System.out.println("2. Sprite");
                        System.out.println("3. Fanta");
                        System.out.print("Chose : ");
                        chose2 = sc.nextInt();
                        switch(chose2){
                                case 1:
                                    order[indexdrink][1] = "Coca-Cola";
                                    nominal[indexdrink][1] = 10000;
                                break;
                                case 2:
                                     order[indexdrink][1] = "Sprite  ";
                                     nominal[indexdrink][1] = 10000;
                                break;
                                case 3:
                                     order[indexdrink][1] = "Fanta   ";
                                     nominal[indexdrink][1] = 10000;
                                break;
                        }
                        System.out.print("Amount : ");          //Jumlah Minuman
                        amount1 = sc.nextInt();
                        nominal[indexdrink][3] = amount1;
                        nominal[indexdrink][5] = nominal[indexdrink][1] * nominal[indexdrink][3];
                        drink = nominal[indexdrink][5];
//                      nominal[indexminuman][7] = nominal[indexminuman][5] + nominal[indexmakanan][6];
                        indexdrink++;
                    break;
                    
                    case 3:
                        System.out.println("Thank You");
            }
            System.out.println(" ");
        } while(chose1 != 3);
        
        indextotal = food + drink; //grand total
        
        System.out.println("List purchase");
        System.out.println("Food");
        for (int i = 0; i < 5; i++) {
                if(order[i][0] != null){
                    System.out.print((i+1)+". "+order[i][0]);  
                    System.out.print("\t Rp."+nominal[i][0]);
                    System.out.print("\t "+nominal[i][2]+"x"+"\t=");
                    System.out.println("\t "+nominal[i][4]);
                    System.out.println("");
                }
        }
        System.out.println("Drink");
        for (int i = 0; i < 5; i++) {
                if(order[i][1] != null){
                    System.out.print((i+1)+". "+order[i][1]);   
                    System.out.print("\t Rp."+nominal[i][1]);
                    System.out.print("\t "+nominal[i][3]+"x"+"\t=");
                    System.out.println("\t "+nominal[i][5]);
                    System.out.println("");
                }
                
        }
        
        System.out.print("Grand Total : ");
        for (int i = 0; i < 1; i++) {
            System.out.print(indextotal);
        }

          System.out.print("\nPayment : ");         //        Pembayaran
            payment = sc.nextInt();
                
            for(int q = 0; q < indextotal; q++){
                if(indextotal == 0){
                System.out.println("your money paid off");
            } else if(payment < indextotal) {
                System.out.print("Your money is less :");
                payment = sc.nextInt();
                
            }    
        }
            if(payment >= indextotal){
                change = payment - indextotal ;
                System.out.println("Change money : Rp." + change);
               
            }
        
        System.out.println(" ");
        System.out.print("\n do you want order again? (Y/T) :"); //untuk menginput apakah inhin memilih lagi atau tidak
        b = sc.next();
    }
        
        
    }
    
   
}