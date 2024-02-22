package io.zzom.web.domain

import jakarta.persistence.*

@Entity
@Table(name = "habits")
class Habits(
    @Column(nullable = false) var habit: String,
    @Column(nullable = false) var day: Day,
    @Column(nullable = false) var alertTime: String,
    @Column(nullable = false) var userId: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?=null
    fun update(habit: String, day: Day, alertTime: String, userId: String) {
        this.habit = habit
        this.day = day
        this.alertTime = alertTime
        this.userId = userId
    }
}