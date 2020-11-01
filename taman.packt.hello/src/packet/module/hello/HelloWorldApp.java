package packet.module.hello;

import java.util.logging.Logger;

public class HelloWorldApp {
    private static Logger log = Logger.getLogger(HelloWorldApp.class.getName());

    public static void main(String[] args) {
        log.info("Hello World from Java SE 9 Module System");
    }
}