package html.codec.fail

class BootStrap {

    def init = { servletContext ->


      1.upto(10000,  {
        def e = new Example(name:"key_&${UUID.randomUUID()}", value: "value_&${UUID.randomUUID()}")
        e.save()
      }
      )
    }
    def destroy = {
    }
}
