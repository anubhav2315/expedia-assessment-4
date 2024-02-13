package di

fun main() {
    // Instantiate the DI container
    val diContainer = DIContainer()

    // Register the MyService implementation
    val myService = MyServiceImpl()
    diContainer.registerService(MyService::class.java, myService)

    // Create an instance of MyClass and inject MyService
    val myClassInstance = MyClass(diContainer.resolve(MyService::class.java))

    // Use the class that depends on the service
    val result = myClassInstance.doSomething()

    // Print the result
    println(result)
}