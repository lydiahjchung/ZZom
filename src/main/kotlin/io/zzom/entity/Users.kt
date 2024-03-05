package io.zzom.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users(userName: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @Column(nullable = false)
    var userName: String = userName

    companion object{
        fun of(userName: String): Users {
            return Users(userName)
        }
    }
}