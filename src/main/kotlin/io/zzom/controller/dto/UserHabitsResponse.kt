package io.zzom.controller.dto

import io.zzom.web.domain.Day

data class GetHabitsResponse(
    val id: Long,
    val habit: String,
    val day: Day,
    val alertTime: String
) {
}