package com.andor.kotlin.oops

open class Employee(name: String, registerationId: Int) : EmpOP {    //constructor and interface implementation
    private var name: String
    private var registerationId: Int
    var city: String? = null                            //public by default

    init {                                              //to initiate parameters
        println("Constructor 1 called")
        this.name = name
        this.registerationId = registerationId
    }

    constructor(name: String, registerationId: Int, city: String) : this(name, registerationId) {
        println("Constructor 2 called")
        this.city = city

    }

    override fun display() {
        println("name:${getName()}")
        println("registerationId:${getRegisterationId()}")
    }
    //GETTER & SETTERS

    fun getName(): String {
        return this.name;
    }

    fun getRegisterationId(): Int {
        return this.registerationId;
    }

    fun setName(name: String) {
        this.name = name;
    }

    fun setRegisterationID(registerationId: Int) {
        this.registerationId = registerationId;
    }
}

//Inheritance all class and funtion in kotlin are final by default so "open" is used to make it non final

class ZohoEmployee(name: String, registerationId: Int, city: String, country: String) : Employee(name = name, registerationId = registerationId, city = city) {
    private var country: String? = null

    init {
        println("ZOHOEmployee constructor")
        this.country = country
    }


}

fun main(args: Array<String>) {
    println("oops.Employee")
    val emp = Employee("Anmol", 1, "Chennai")
    emp.display()
    emp.setName("Andor")
    emp.display()
    emp.setRegisterationID(2)
    emp.display()

    println("oops.ZohoEmployee")
    val zohoEmp = ZohoEmployee("Anmol Srivastava", 3, "Chennai", "India")
    zohoEmp.display()
}