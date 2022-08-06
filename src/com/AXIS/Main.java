package com.AXIS;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

	//BankAccount obj1 = new BankAccount("Divyanshu","BA0012");
   //AA obj1.showmenu();
    BankAccount obj2 = new BankAccount("ASHA","BA0013");
    obj2.showmenu();
    }
}
class BankAccount {
    int balance;
    int previousTransaction;
    String customerName ;
    String customerId;

    BankAccount(String cname,String cid){
        customerName=cname;
        customerId=cid;
    }
    void deposit(int amount){
        if(amount!=0){
            balance +=amount;
            previousTransaction=amount;
        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance -=amount;
            previousTransaction=-amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited : "+previousTransaction);
        }else if(previousTransaction<0){
            System.out.println("Withdrawn : "+Math.abs(previousTransaction));
        }else{
            System.out.println("No Transaction Occured");
        }
    }
    void showmenu(){
        char option= '\0';
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("=============================================================================================================");
            System.out.println("Enter an Option");
            System.out.println("=============================================================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch(option){
                    case 'A':
                    System.out.println("---------------------------------");
                    System.out.println(" Balance = " + balance);
                    System.out.println("---------------------------------");
                    System.out.println("\n");
                    break;

                    case 'B':
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount to deposit : ");
                    System.out.println("--------------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                    case 'C':
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount to withdrawn : ");
                    System.out.println("--------------------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                    case 'D':
                    System.out.println("--------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("**********************************************");
                    break;

                    default :
                    System.out.println(" Invalid Option !! Please enter again ");
                    break;
            }

        }while(option != 'E');

        System.out.println(" THANK YOU FOR USING OUR SERVICES ");
        System.out.println("\n\n");


    }

}