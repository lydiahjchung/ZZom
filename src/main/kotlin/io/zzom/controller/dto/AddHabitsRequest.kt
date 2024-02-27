package io.zzom.controller.dto

import io.zzom.web.domain.Day

data class AddHabitsRequest(
    val userId: Long,
    val habit: String,
    val day: Day,
    val alertTime: String
) {
}