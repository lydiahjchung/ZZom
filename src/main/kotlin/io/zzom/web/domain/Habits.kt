package io.zzom.web.domain

import jakarta.persistence.*

@Entity
@Table(name = "habits")
class Habits(
    @Column(nullable = false) var habit: String,
    @Column(nullable = false) var day: Day,
    @Column(nullable = false) var alertTime: String,
    @Column(nullable = false) var userId: Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0
    fun update(habit: String, day: Day, alertTime: String, userId: Long) {
        this.habit = habit
        this.day = day
        this.alertTime = alertTime
        this.userId = userId
    }
}