package com.example.incremental.A

class A {
	def iampublic(): Int = {
		dontlook()
		2
	}
	private def dontlook(): Unit = println("you can't hit what you can't see")
}
