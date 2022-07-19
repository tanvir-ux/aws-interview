import java.util.Observer;
import java.util.Observable;

public class ResponseHandler2 implements Observer {
    private String response;

    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            response = (String) arg;
            System.out.println("Received response " + response);
        }
    }
}