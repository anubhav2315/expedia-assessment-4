
class TypeSafeBuilderTest {
    private val elements = mutableListOf<Any>()

    fun head(block: Head.() -> Unit) {
        val head = Head()
        head.block()
        elements.add(head)
    }

    fun body(block: Body.() -> Unit) {
        val body = Body()
        body.block()
        elements.add(body)
    }

    override fun toString(): String {
        return "<html>\n${elements.joinToString("\n")}\n</html>"
    }
}

class Head {
    private val headElements = mutableListOf<HeadElement>()

    fun title(titleText: String) {
        headElements.add(HeadElement.Title(titleText))
    }

    override fun toString(): String {
        return "<head>\n${headElements.joinToString("\n")}\n</head>"
    }
}

sealed class HeadElement {
    data class Title(val text: String) : HeadElement() {
        override fun toString(): String = "<title>$text</title>"
    }
}

class Body {
    private val bodyElements = mutableListOf<BodyElement>()

    fun h1(text: String) {
        bodyElements.add(BodyElement.H1(text))
    }

    fun p(text: String) {
        bodyElements.add(BodyElement.P(text))
    }

    override fun toString(): String {
        return "<body>\n${bodyElements.joinToString("\n")}\n</body>"
    }
}

sealed class BodyElement {
    data class H1(val text: String) : BodyElement() {
        override fun toString(): String = "<h1>$text</h1>"
    }

    data class P(val text: String) : BodyElement() {
        override fun toString(): String = "<p>$text</p>"
    }
}

fun main() {
    val html = TypeSafeBuilderTest()

    html.head {
        title("My HTML Page")
    }

    html.body {
        h1("Welcome to My HTML Page")
        p("This is a simple example of an HTML DSL in Kotlin.")
    }

    println(html)
}
