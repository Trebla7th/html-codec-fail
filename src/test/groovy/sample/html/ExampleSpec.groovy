package sample.html

import grails.testing.gorm.DomainUnitTest
import html.codec.fail.Example
import spock.lang.Specification

class ExampleSpec extends Specification implements DomainUnitTest<Example> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
