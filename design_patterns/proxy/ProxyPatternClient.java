public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess iAccess = new ProxyInternetAccess("Tanvir Alam");
        iAccess.grantInternetAccess();
    }
}