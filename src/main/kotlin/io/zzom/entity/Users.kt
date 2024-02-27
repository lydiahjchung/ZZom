package io.zzom.entity

import io.zzom.controller.dto.SignUpRequest
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
        fun toEntity(request: SignUpRequest): Users {
            return Users(request.userName)
        }
    }
}