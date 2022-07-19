public class Management implements Connection {
    @Override
    public void open() {
        System.out.println("open database for Management");
    }

    @Override
    public void close() {
        System.out.println("close database for Management");
    }

    @Override
    public void log() {
        System.out.println("Log activities for Management");
    }

    @Override
    public void update() {
        System.out.println("Update Management database");
    }
}