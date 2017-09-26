package com.andor.kotlin.oops

abstract class CreditCard {
    private var cardNumber = "123Abc"
    fun creditCardId(): String {
        return cardNumber
    }

    abstract fun getCreditCardNo(): String
}

class User : CreditCard() {
    override fun getCreditCardNo(): String {
        return creditCardId()
    }

}

fun main(args: Array<String>) {
    val user = User()
    print(user.getCreditCardNo())
}