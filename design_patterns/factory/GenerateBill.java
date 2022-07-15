import java.io.*;

class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter the units for which the bill will be generated");
        int units = Integer.parseInt(br.readLine());
        
        Plan plan = planFactory.getPlan(planName);

        System.out.println("Bill amount for " + planName + "of " + units + "units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}