package io.zzom.web.domain

import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users(
    @Column(nullable = false) var userId: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?=null
}