package io.zzom.controller.dto

import org.springframework.format.annotation.DateTimeFormat
import java.time.DayOfWeek
import java.time.LocalTime

data class AddHabitsRequest(
    val userId: Long,
    var habit: String,
    val day: List<DayOfWeek>,
    @DateTimeFormat(pattern = "HH:mm") val alertTime: LocalTime
) {
}