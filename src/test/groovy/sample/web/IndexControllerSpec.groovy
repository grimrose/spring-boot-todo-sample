package sample.web

import org.springframework.boot.SpringApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import sample.TodoSampleApplication
import spock.lang.Shared
import spock.lang.Specification

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class IndexControllerSpec extends Specification {

    @Shared
    ConfigurableApplicationContext context

    def setupSpec() {
        context = Executors.newSingleThreadExecutor().submit(new Callable() {
            @Override
            def call() {
                SpringApplication.run(TodoSampleApplication)
            }
        }).get(60, TimeUnit.SECONDS)
    }

    def cleanupSpec() {
        if (context != null) {
            context.close()
        }
    }

    def "should status code is OK"() {
        when:
        ResponseEntity entity = new RestTemplate().getForEntity("http://localhost:8080", String.class)

        then:
        entity.statusCode == HttpStatus.OK
    }

}
