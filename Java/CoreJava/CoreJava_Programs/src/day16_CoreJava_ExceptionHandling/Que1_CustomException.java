package day16_CoreJava_ExceptionHandling;

import java.util.Scanner;

/**
 * 1] Write a program for::below cases to handle wrong operations done by customers in
 * deposit, and withdrawal operations.
 * Case 1)CREATE an InvalidAmountException if the user enters zero or -ve amount in deposit
 * and withdraw operations
 * Case 2)Throw  if the user enters the amount greater than the
 * balance in case of withdrawing operations
 */
public class Que1_CustomException {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.whatTransaction();
    }
}
