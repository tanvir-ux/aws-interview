import java.io.*;

interface Bank {
    String getBankName();
}

class HDFC implements Bank {
    private final String BankName;

    public HDFC() {
        BankName = "HDFC BANK";
    }

    public String getBankName() {
        return BankName;
    }
}

class ICIC implements Bank {
    private final String BankName;

    public ICIC() {
        BankName = "ICIC BANK";
    }

    public String getBankName() {
        return BankName;
    }
}

class SBI implements Bank {
    private final String BankName;

    public SBI() {
        BankName = "SBI BANK";
    }

    public String getBankName() {
        return BankName;
    }
}

abstract class Loan {
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years) {
        /* calculate monthly loan payment
        rate = annual interest rate / 12*100
        n = number of monthly installments
        1 years = 12 months
        n = years * 12
        */
        double EMI;
        int n;
        n = years * 12;
        rate = rate / 1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
        System.out.println("Your monthly EMI is " + EMI + " for the amount " + loanamount + " you have borrowed");
    }
}

class HomeLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}

class BusinessLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}

class EducationLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}

abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        }
        else if ( bank.equalsIgnoreCase("ICIC")) {
            return new ICIC();
        }
        else if ( bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}

 class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        return null;
    }

    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        }
        else if (loan.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        }
        else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return null;
    }
}

class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        }
        else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}

