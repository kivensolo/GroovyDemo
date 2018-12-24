package groovy.closure.delegate.practice

/**
 * author: King.Z <br>
 * date:  2018/12/24 21:40 <br>
 * description: 闭包练习 <br>
 *     用闭包实现一个View的回调接口
 */

static void main(String[] args) {
    View view = new View()
    //最后参数只有一个Closure  则省略括号
    view.setOnclickListenner{View v ->
        println('闭包执行')
        println v.toString()
    }
    //未省略版本
//    def clocure = { View v ->
//        println('闭包执行')
//        println v.toString()
//    }
//    view.setOnclickListenner(clocure)
}
