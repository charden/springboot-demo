package com.example.demo.repository

import com.example.demo.entity.DemoDao
import com.example.demo.entity.DemoEntity
import com.example.demo.model.Demo
import org.springframework.stereotype.Repository

@Repository
class DemoRepositoryDomaImpl(
        private val demoDao: DemoDao
): DemoRepository {
    override fun findAll(): List<Demo> {
        return demoDao.selectAll().map { _mapToModel(it) }
    }

    // ここでDomaのEntity（Java）をドメインのModel（Kotlin）に詰め替える
    private fun _mapToModel(demoEntity: DemoEntity): Demo {
        return Demo(
                id = demoEntity.id,
                name = demoEntity.name,
                createdAt = demoEntity.createdAt,
                updatedAt = demoEntity.updatedAt
        )
    }
}