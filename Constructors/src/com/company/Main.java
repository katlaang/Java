package com.company;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Main {

    public static void main(String[] args) {
	/*Account bobsAccount =new Account();
	bobsAccount.setAccountNumber("12345");
	bobsAccount.setBalance(0.00);
	bobsAccount.setCustomerName("Bob Brown");
	bobsAccount.setCustomerEmail("myemail@bob.com");
	bobsAccount.setCustomerPhoneNumber("050 5145210124");
// instead of doing all these lines of code, we can instead use constructors in the Account Class*/
        //calling a constructor
        // Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "050 5145210124" );
        /*Account bobsAccount = new Account(); //calling default constructor

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100.0);

        //calling second constructor
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
*/

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.


        VipPerson person1= new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 =new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.000, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
