import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Give Bank Name");
            String bankName = br.readLine();
            System.out.println("\n");

            System.out.println("Give account holder name");
            String acHolderName = br.readLine();
            System.out.println("\n");

            System.out.println("Give account number");
            long accNumber= Long.parseLong(br.readLine());
            System.out.println("\n");

            setBankName(bankName);
            setAccountHolderName(acHolderName);
            setAccountNumber(accNumber);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getCreditCard() {
        String bName = getBankName();
        String aHolderName = getAccountHolderName();
        long accNum = getAccountNumber();

        return ("The account number " + accNum + " of " + aHolderName + " in " + bName + 
        " bank is valid and authenticated for issuing the credit card.");
    }
}