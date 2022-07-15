interface Prototype {
    public Prototype getClone();
}


class EmployeeRecord implements Prototype{
    private int id;
    private String name, designation, address;
    private double salary;

    public EmployeeRecord () {
        System.out.println("Employee records of Mehvozsoft ");
        System.out.println("-------------------------------");
        System.out.println("Eid" +"\t" +"EName" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t" + "Eaddress");
    }

    public EmployeeRecord (int id, String name, String designation, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {
        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }

}