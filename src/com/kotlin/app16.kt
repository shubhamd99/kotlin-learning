package com.kotlin

fun main(args: Array<String>) {

    var mybtn = MyButton()
    mybtn.onClick()
    mybtn.onTouch()

}

// Interface is not a class, it is sometype of listner service

interface MyInterfaceListner {

    var name: String  // properties in interface is abstract in nature, no default values

    fun onTouch()  // methods in interface is abstract in nature

    fun onClick() {   // Normal methods are public and open but not final
        println("On click interface code")
    }

}

class MyButton : MyInterfaceListner {

    override var name:String = "My Interface"

    override fun onTouch() {
        println("Button is touched")
    }

    override fun onClick() {  // optional to override
        super.onClick()
        println("Button is clicked")
    }
}