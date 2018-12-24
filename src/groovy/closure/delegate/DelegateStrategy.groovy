import groovy.closure.delegate.Person

class DelegateStrategy {
    void eat(String food) {
        println "我在DelegateTest的地方吃 ${food}"
    }

    def closureHi = {
        name = "易建联"
        age = 26
        eat("苹果")
    }

    static void main(String... args) {
        DelegateStrategy delegateTest = new DelegateStrategy()
        Person p = new Person(name: "姚明", age: 32)
        println p.toString()

        def defClosure = delegateTest.closureHi
        defClosure.delegate = p
        defClosure.setResolveStrategy(Closure.DELEGATE_FIRST)
        defClosure()
        println p.toString()
    }
}