package sample.domain

import groovy.transform.Canonical

import javax.persistence.*

@Entity
@Canonical
class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column(length = 50, nullable = false)
    String content

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    Date timeLimit

    @Version
    Long version = 0L

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date createAt = new Date()

}
