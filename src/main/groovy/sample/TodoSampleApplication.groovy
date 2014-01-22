package sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class TodoSampleApplication {

    static void main(String... args) {
        SpringApplication.run(TodoSampleApplication.class, args)
    }

}
