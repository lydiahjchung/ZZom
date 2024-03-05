package io.zzom.entity

import io.zzom.controller.dto.AddHabitsRequest
import jakarta.persistence.*

@Entity
@Table(name = "habits")
class Habits(userId: Long, habit: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @Column(nullable = false)
    var userId: Long = userId

    @Column(nullable = false)
    var habit: String = habit

    companion object{
        fun of(userId: Long, habit: String): Habits {
            return Habits(userId, habit)
        }
    }
}