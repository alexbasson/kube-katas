package io.pivotal.containerizestatelessapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun `say hello`(@RequestParam(required = false) name: String?): String {
        return "Hello, ${name ?: "world"}!"
    }

}
