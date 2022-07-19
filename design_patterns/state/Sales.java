public class Sales implements Connection {
    @Override
    public void open() {
        System.out.println("open database for sales");
    }

    @Override
    public void close() {
        System.out.println("close database for sales");
    }

    @Override
    public void log() {
        System.out.println("Log activities for sales");
    }

    @Override
    public void update() {
        System.out.println("Update sales database");
    }
}