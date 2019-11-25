package wang.doug.frame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("wang.doug.frame.dao")
public class FrameApplication {

    public static void main(String[] args) {

        SpringApplication.run(FrameApplication.class, args);

    }
}
