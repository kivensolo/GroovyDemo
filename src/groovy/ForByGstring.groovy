package groovy

/**
 * author: King.Z <br>
 * date:  2018/4/2 22:31 <br>
 * description: String of Groovy <br>
 */
def var = """ hello  world ,groovy!"""
//使用类java方法
//def repeat(val) {
//    for (i = 0; i < 5; i++) {
//        println val
//    }
//}
//repeat(var)

//使用范围
def repeat2(val) {
    for (i in 0..5) {
        println val
    }
}
repeat2(var)

//使用Gstring的方法
def repeat3(val) {
    for (i in 0..5) {
        println "This is ${i}:${val}"
    }
}
repeat3(var)

println "\n"

//默认参数值
def repeat4(val,repeat=3){
    for(i in 0..<repeat){
     println "This is ${i}:${val}"
    }
}
repeat4(var)
