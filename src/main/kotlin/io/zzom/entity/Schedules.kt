package io.zzom.entity

import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.web.domain.Day
import jakarta.persistence.*

@Entity
@Table(name = "schedules")
class Schedules(habitId: Long, day: Day, alertTime: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @Column(nullable = false)
    var habitId: Long = habitId

    @Column(nullable = true)
    var day: Day = day

    @Column(nullable = true)
    var alertTime: String = alertTime

    companion object {
        fun toEntity(id: Long, request: AddHabitsRequest): Schedules {
            return Schedules(id, request.day, request.alertTime)
        }
    }
}