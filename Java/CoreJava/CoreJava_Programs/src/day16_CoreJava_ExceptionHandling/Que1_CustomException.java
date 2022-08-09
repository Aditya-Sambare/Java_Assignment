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
/*
::::::output is ::::::
Enter 1 for Deposit and 2 for Withdraw
Balance is : 45000
1
Enter the Amount you want to Deposit
0
you have entered wrong amount

Process finished with exit code 0
------------------------------------------------------------
Enter 1 for Deposit and 2 for Withdraw
Balance is : 45000
1
Enter the Amount you want to Deposit
1200
Deposit Sucessfull Balance is : 46200

Process finished with exit code 0
------------------------------------------------------------------------------------
Enter 1 for Deposit and 2 for Withdraw
Balance is : 45000
2
enter the amount you want to withdraw
0
Remaining Balance is : 45000
you have entered wrong amount

Process finished with exit code 0
----------------------------------------------------------
Enter 1 for Deposit and 2 for Withdraw
Balance is : 45000
2
enter the amount you want to withdraw
1200
Withdraw Sucessfull Remaining Balance is : 43800

Process finished with exit code 0
--------------------------------------------------
Enter 1 for Deposit and 2 for Withdraw
Balance is : 45000
2
enter the amount you want to withdraw
900000
You dont have sufficient Balance

Process finished with exit code 0

 */