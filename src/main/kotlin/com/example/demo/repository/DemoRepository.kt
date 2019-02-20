package com.example.demo.repository

import com.example.demo.model.Demo

interface DemoRepository {
    fun findAll(): List<Demo>
}