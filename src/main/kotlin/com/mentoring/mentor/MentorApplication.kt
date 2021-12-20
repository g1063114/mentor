package com.mentoring.mentor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MentorApplication

fun main(args: Array<String>) {
	runApplication<MentorApplication>(*args)
}
