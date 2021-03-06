package com.nothing.ucenter.repository


import com.nothing.ucenter.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface UserRepository: JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    fun findFirstByEmail(email: String): User
}