package net.dobeats.wellness.api.controller

import net.dobeats.wellness.api.domain.model.UsersRecord
import net.dobeats.wellness.api.domain.repository.UsersMapper
import net.dobeats.wellness.api.domain.repository.selectByPrimaryKey
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

class UserController {
    @RestController
    class UserController(private val mapper: UsersMapper) {
        @GetMapping("/user/{user_id}")
        fun find(@PathVariable("user_id") userId: Int): UsersRecord? {
            return mapper.selectByPrimaryKey(userId)
        }
    }
}