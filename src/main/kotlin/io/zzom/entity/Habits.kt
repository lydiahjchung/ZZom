package io.zzom.entity

import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.web.domain.Day
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

//    @Column(nullable = true)
//    var day: Day ?= day
//
//    @Column(nullable = true)
//    var alertTime: String ?= alertTime

    companion object{
        fun toEntity(request: AddHabitsRequest): Habits {
            return Habits(request.userId, request.habit)
        }
    }
}