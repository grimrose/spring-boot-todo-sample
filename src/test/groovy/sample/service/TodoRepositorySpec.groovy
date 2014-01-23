package sample.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import sample.TodoSampleApplication
import sample.domain.Todo
import spock.lang.Specification

@ContextConfiguration(classes = TodoSampleApplication)
class TodoRepositorySpec extends Specification {

    @Autowired
    TodoRepository repository

    def "insert entity"() {
        when:
        Todo todo = new Todo(content: content, timeLimit: limit)

        then:
        repository.save(todo)

        where:
        content | limit
        'one'   | new Date()
        'two'   | null
    }

}

