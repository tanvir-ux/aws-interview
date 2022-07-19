public class Controller {
    public static Accounting acc;
    public static Sales sal;
    public static Management mgt;

    private static Connection con;

    public Controller() {
        acc = new Accounting();
        sal = new Sales();
        mgt = new Management();
    }

    public void setAccountingConnection() {
        con = acc;
    }

    public void setSalesConnection() {
        con = sal;
    }

    public void setManagementConnection() {
        con = mgt;
    }

    public void open() {
        con.open();
    }

    public void close() {
        con.close();
    }

    public void log() {
        con.log();
    }

    public void update() {
        con.update();
    }
}