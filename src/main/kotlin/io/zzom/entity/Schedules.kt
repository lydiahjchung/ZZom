package io.zzom.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*
import org.springframework.format.annotation.DateTimeFormat
import java.time.DayOfWeek
import java.time.LocalTime

@Entity
@Table(name = "schedules")
class Schedules(habitId: Long, day: DayOfWeek, alertTime: LocalTime) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @Column(nullable = false)
    var habitId: Long = habitId

    @Column(nullable = true)
    var day: DayOfWeek = day

    @Column(nullable = true)
    @DateTimeFormat(pattern = "HH:mm")
    var alertTime: LocalTime = alertTime

    companion object {
        fun of(habitId: Long, day: DayOfWeek, alertTime: LocalTime): Schedules {
            return Schedules(habitId, day, alertTime)
        }
    }
}