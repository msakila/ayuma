import java.util.scanner;

public class AtmMachine {
private static Scanner in;
private static float balance =0;//initial balance for everyone
    private static int anotherTransaction;
    public static void main(String[] args) {
	// write your code here
        in =new Scanner(System.in);
        //call our transaction method here
        transaction();
    }
    private static void transaction(){
        //here is where the most of work is
        int choice;

        System.out.println("please select an option");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("Balance");

        choice =in.nextInt();

        switch(choice){
            case 1:
            float amount;
            System.out.println("please enter amount to withdraw:");
            amount=in.nextFloat();
            if(amount>balance || amount ==0){
                System.out.println("you have insufficient funds\n\n");
                anotherTransaction();//ask if they want another transaction

            }
            else
            {
                //they have some cash
                //update balance
                balance =balance - amount;
                System.out.println(" you have withdrawn " + amount+"and your new balance is" +balance+"\n");
                anotherTransaction();
            }
            break;

            case 2:
                //option number 2 is depositing
                float deposit;
                System.out.println(" please enter amount you wish to deposit:");
                deposit = in.nextFloat();
                //update balance
                balance  = deposit + balance;
                System.out.println(" you have deposited " +deposit+"new balance is"+balance+"\n");
                anotherTransaction();
                break;

            case 3:
                // this option is to check balance
                System.out.println(" your balance is"+balance+"\n");
                anotherTransaction();
                break;

        }
    }
}
