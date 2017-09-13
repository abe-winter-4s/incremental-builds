package com.example.incremental.B

import com.example.incremental.A.A

class B {
	val x = "trigger"
	def consumer() = {
		val a = new A()
		println("this shouldn't affect A")
		a.iampublic()
	}
}
