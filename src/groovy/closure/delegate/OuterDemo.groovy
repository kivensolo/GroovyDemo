package groovy.closure.delegate

/**
 * author: King.Z <br>
 * date:  2018/12/24 20:58 <br>
 * description: 测试Closure的委托属性 <br>
 *    this对应定义闭包的类，如果在内部类中定义，则指向内部类   [只与类有关]
 *    owner对应定义闭包的那个类或者闭包，如果在闭包中定义，对应闭包，否则同this。[与类和Closure有关]
 *    delegate默认是和owner一致，或者自定义delegate指向。
 */
class OuterDemo {
    class InnerClass {
        def outClosure = {
            def innerClocure = {
            }
            //在内部类中定义，所以this就是InnerClass
            printMsg("outClosure",outClosure)
            println('----------------')
            //在闭包中定义  this也是InnerClass这个类，但是owner和delegate已经成了outClosure这个闭包
            printMsg("innerClosure",innerClocure)
        }

        private void printMsg(String flag, Closure closure){
            def thisObject = closure.getThisObject()
            def ownerObject = closure.getOwner()
            def delegateObject = closure.getDelegate()
            println("${flag} this: ${thisObject.toString()}")
            println("${flag} owner: ${ownerObject.toString()}")
            println("${flag} delegate: ${delegateObject.toString()}")
        }
    }

    def callInnerMethod(){
        def inner = new InnerClass()
        println("outerClosure to String : ${inner.outClosure.toString()}")
        println('----------- ---------- -----------')
        inner.outClosure.call()
    }

    static void main(String[] args) {
        new OuterDemo().callInnerMethod()
    }

    //验证delegate的效果





}
