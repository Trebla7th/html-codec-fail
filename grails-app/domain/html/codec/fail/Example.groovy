package html.codec.fail

class Example {

  String name
  String value

    static constraints = {
    }

  String toString() {
    return "${name} - ${value}"
  }
}
