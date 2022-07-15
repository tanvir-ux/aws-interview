import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ProtoTypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter emplyee id");
        int eid = Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.println("Enter emplyee name");
        String name = br.readLine();
        System.out.println("\n");

        System.out.println("Enter emplyee designation");
        String designation = br.readLine();
        System.out.println("\n");

        System.out.println("Enter emplyee salary");
        double salary = Double.parseDouble(br.readLine());
        System.out.println("\n");

        System.out.println("Enter emplyee address");
        String address = br.readLine();
        System.out.println("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, name, designation, salary, address);
        e1.showRecord();

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();// saving memory without creating new object
        e2.showRecord();

    }
}