package com.example.demo.service

import com.example.demo.entity.DemoDao
import com.example.demo.entity.DemoEntity
import org.springframework.stereotype.Service

@Service
class DemoService(
        val anythingDao: DemoDao
) {

    fun findAll(): List<DemoEntity> {
        return this.anythingDao.selectAll()
    }

}