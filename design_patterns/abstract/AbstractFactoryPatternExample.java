import java.io.*;

class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of the bank from where you want to take loan");
        String bankName = br.readLine();
        System.out.println("\n");
        System.out.println("Enter type of loan e.g. home loan or business loan or education loan");
        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.println("\n");
        System.out.println("Enter the interest rate for " + bank.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the loan amount you want to take");
        double loanamount = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the amount of years to pay your entire loan");
        int years = Integer.parseInt(br.readLine());
        System.out.println('\n');
        System.out.println("You are taking the loan from " + bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanamount, years);
    }
}