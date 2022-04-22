import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int f;
    private Logger logger = Logger.get();

    public Filter(int f) {
        this.f = f;
        logger.log("Фильтр со значением " + f + " запущен.");
    }

    public List<Integer> filterOut(List<Integer> list) {
        List<Integer> listOut = new ArrayList<>();
        list.stream()
                .peek(x -> {
                    if (x > f) logger.log("Число " + x + " ПРОХОДИТ.");
                    else logger.log("Число " + x + " не проходит.");
                })
                .filter(x -> x > f)
                .forEach(listOut::add);
        return listOut;
    }
}
