package sample.service

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional
import sample.domain.Todo

interface TodoRepository extends JpaRepository<Todo, Long> {

//    @Transactional(readOnly = true)
//    @Query(value = 'select t from Todo t where t.content =:content')
//    Iterable<Todo> findByContent(@Param("content") String content)
//
//    @Transactional(readOnly = true)
//    @Query(value = 'select t from Todo t where :from < t.timeLimit and t.timeLimit < :to')
//    Iterable<Todo> findByTerm(@Param("from") Date from, @Param("to") Date to)

}
