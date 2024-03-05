package io.zzom.controller.dto

import org.springframework.format.annotation.DateTimeFormat
import java.time.DayOfWeek
import java.time.LocalTime

data class HabitsResponse(
    val id: Long,
    var userId: Long,
    var habit: String,
    var day: List<DayOfWeek>,
    @DateTimeFormat(pattern = "HH:mm") var alertTime: LocalTime
) {
}