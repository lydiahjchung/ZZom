package io.zzom.web.dto

import io.zzom.web.domain.Day
import io.zzom.web.domain.Habits

class HabitsResponseDto(entity: Habits) {
    var id: Long?= entity.id
    var userId: String = entity.userId
    var habit: String = entity.habit
    var day: Day = entity.day
    var alertTime: String = entity.alertTime
}