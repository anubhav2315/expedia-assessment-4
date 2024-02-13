package di

class MyClass(private val myService: MyService) {
    fun doSomething(): String {
        return myService.performAction()
    }
}