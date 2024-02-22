package io.zzom.web.dto

import io.zzom.web.domain.Users

class UsersResponseDto(entity: Users) {
    var id: Long?= entity.id
    var userId: String = entity.userId
}