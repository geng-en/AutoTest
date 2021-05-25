import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/24 9:28 下午
 */

@SpringBootApplication
@ComponentScan("com.course")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
