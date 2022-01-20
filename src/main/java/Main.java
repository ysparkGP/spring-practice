import com.practice.spring.config.Config;
import com.practice.spring.logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.practice.spring.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result]" + sortService.doSort((Arrays.asList(args))));
    }
}
