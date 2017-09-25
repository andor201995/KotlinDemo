class Employee(name: String, registerationId: Int) {    //constructor
    private var name: String
    private var registerationId: Int
    private var city: String? = null

    init {                                              //to initiate parameters
        println("Constructor 1 called")
        this.name = name
        this.registerationId = registerationId
    }

    constructor(name: String, registerationId: Int, city: String) : this(name, registerationId) {
        println("Constructor 2 called")
        this.city = city

    }

    fun display() {
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

fun main(args: Array<String>) {
    val emp = Employee("Anmol", 1, "Chennai")
    emp.display()
    emp.setName("Andor")
    emp.display()
    emp.setRegisterationID(2)
    emp.display()
}