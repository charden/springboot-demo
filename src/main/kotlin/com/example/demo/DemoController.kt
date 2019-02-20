package com.example.demo

import com.example.demo.repository.DemoRepository
import com.example.demo.service.DemoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController(private val demoRepository: DemoRepository) {
    @GetMapping("/demo")
    fun demo(model: Model): String {
        val demos = demoRepository.findAll()
        model.addAttribute("demos", demos)
        return "demo"
    }
}