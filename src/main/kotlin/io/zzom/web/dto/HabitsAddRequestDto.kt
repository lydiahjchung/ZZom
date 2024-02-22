package io.zzom.web.dto

import io.zzom.web.domain.Day
import io.zzom.web.domain.Habits
import kotlin.properties.Delegates

class HabitsAddRequestDto(
    var userId: Long,
    var habit: String,
    var day: Day,
    var alertTime: String
) {
    fun toEntity(): Habits {
        return Habits(
            userId = userId,
            habit = habit,
            day = day,
            alertTime = alertTime
        )
    }
}