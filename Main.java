import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int corectpin = 1234;
        int trials = 0;
        int pin;
        int choice;
        int successwihdraw=0;
        int successdeposite =0;
        double currentBalance = 2500.7;



            while (trials < 3){
                System.out.println(" please enetr a 4-digit PIN. ");
               pin = s.nextInt();
                if (pin == corectpin)
                {
                    System.out.println("logged successfuly");
                    System.out.println("ur initial balance = " + currentBalance);
                    System.out.println("1. Check Balance \n" +
                            "2. Deposit \n" +
                            "3. Withdraw \n" +
                            "4. Show Account Status \n" +
                            "5. Exit");
                    break;

                } else{
                    System.out.println("wrong pin");
                trials ++;
                if (trials == 3){
                    System.out.println("your account has been blocked");
                    System.exit(0);
                } // if

            } // else

        }// while
        do {
            if (currentBalance ==0)
                System.out.println("WARNING,ur account is empty ");
            System.out.println("please enter a number from 1-5");
             choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(currentBalance);
                    break;
                case 2:
                    System.out.println("eneter the amount you want to deposite");
                    double deposite = s.nextDouble();
                    if (deposite > 0) {
                        currentBalance += deposite;
                        successdeposite++;
                        System.out.println("ur balance = " + currentBalance);
                    } else {
                        System.out.println("invalid amount");
                    }
                    break;
                case 3:
                    System.out.println("eneter the amount you want to withdraw");
                    double withdraw = s.nextDouble();
                    if ((withdraw > 0) && (withdraw <= currentBalance)) {
                        currentBalance -= withdraw;
                        successwihdraw++;
                        System.out.println("ur balance = " + currentBalance);
                    } else {

                        System.out.println("invalid amount");
                    }
                    break;
                case 4:
                    if (currentBalance >= 5000)
                        System.out.println("this is an VIP Customer");
                    else if (currentBalance <= 4999.99 && currentBalance >= 1000)
                        System.out.println("this is a Regular Customer");
                    else if (currentBalance < 1000)
                        System.out.println("low balance ");
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM");
                    System.out.println("number of successful withdrawal transactions = " + successwihdraw);
                    System.out.println("number of successful deposite transactions = " + successdeposite);
                default:
                    System.out.println("invaid choice");
            }// switch
        }
        while ( choice != 5);









































    }
}