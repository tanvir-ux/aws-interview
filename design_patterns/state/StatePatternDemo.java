public class StatePatternDemo {
    Controller controller;

    StatePatternDemo(String con) {
        controller = new Controller();

        if(con.equalsIgnoreCase("accounting")) {
            controller.setAccountingConnection();
        }

        if(con.equalsIgnoreCase("management")) {
            controller.setAccountingConnection();
        }

        if(con.equalsIgnoreCase("sales")) {
            controller.setAccountingConnection();
        }

        controller.open();
        controller.log();
        controller.close();
        controller.update();

    }

    public static void main(String[] args) {
        new StatePatternDemo(args[0]);
    }


}