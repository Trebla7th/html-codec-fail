package html.codec.fail

class ExampleController {

    def index() {

      def examples = Example.list()

      def failures = []

      examples.each { example ->
        String name = example.name.encodeAsHTML()
        String value = example.value.encodeAsHTML()

        if(name.contains("&") && !name.contains("&amp")) {
          println("Name ${name} failed to encode")
          println("Unencoded name: ${example.value}  ---- Encoded name: ${value}")
          failures.add(new Example(name: name, value:value))
        }

        if(value.contains("&") && !value.contains("&amp")) {
          println("Value ${value} failed to encode")
          println("Unencoded value: ${example.value}  ---- Encoded Value: ${value}")
          failures.add(new Example(name: name, value:value))
        }
      }

      return [failures: failures, total: examples.size()]
    }

  def generateExamples() {
    println("Generating 10000 more examples...")
    1.upto(10000,  {
      def e = new Example(name:"key_&${UUID.randomUUID()}", value: "value_&${UUID.randomUUID()}")
      e.save()
    }
    )
    redirect(action: 'index')
  }
}
