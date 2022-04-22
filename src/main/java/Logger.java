import java.util.ArrayList;
import java.util.List;

public class Logger {
    private int id = 1;
    private static List<String> list = new ArrayList<>();
    private static Logger logger = null;

    private Logger() {
        log("Логгер запущен.");
    }

    public static Logger get() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        list.add("[" + id++ + "] " + msg);
    }

    public void printLog() {
        System.out.println("===================LOG====================");
        list.forEach(System.out::println);
        System.out.println("===================LOG====================");
    }
}
