import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {
    private String response;

    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            response = (String) arg;
            System.out.println("Received response " + response);
        }
    }
}