package io.zzom.web.domain

import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users(
    @Column(nullable = false) var userName: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0
}