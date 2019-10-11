package com.ekahau.prototypes.khtf.libf

import com.ekahau.prototypes.khtf.libe.LibEntryPoint1


class LibFCase() {

    fun doSomething() {
        LibEntryPoint1().addValue("From LibF")
    }

    fun getContent(): String {
        return LibEntryPoint1().getString()
    }
}