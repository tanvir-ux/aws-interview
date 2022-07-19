public class Accounting implements Connection {
    @Override
    public void open() {
        System.out.println("open database for accounting");
    }

    @Override
    public void close() {
        System.out.println("close database for accounting");
    }

    @Override
    public void log() {
        System.out.println("Log activities for accounting");
    }

    @Override
    public void update() {
        System.out.println("Update accounting database");
    }
}