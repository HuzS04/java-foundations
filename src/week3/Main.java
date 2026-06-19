package week3;

import week2.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Dave", 100);

        System.out.println(ExceptionPractice.safeDivide(4, 0));
        System.out.println(ExceptionPractice.getElement(new int[]{1, 2, 4, 5, 5}, 7));

        try{
            bankAccount.withdraw(-20);
        } catch (IllegalArgumentException e){
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
