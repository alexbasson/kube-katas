package io.pivotal.containerizestatelessapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContainerizeStatelessAppApplication

fun main(args: Array<String>) {
	runApplication<ContainerizeStatelessAppApplication>(*args)
}
