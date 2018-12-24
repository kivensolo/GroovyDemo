package groovy.closure

/**
 * author: King.Z <br>
 * date:  2018/12/24 20:35 <br>
 * description: closure测试 <br>
 */
def innerclosure = {
    def str = '''hello
                    kinz'''
    println(str)
}

def helloClosure = { String x ->
    println("haha,${x}")
}

//exe Closure way_1    直接函数调用
innerclosure()
helloClosure("closure")
//exe Closure way_2    .call方法调用
helloClosure.call("closure2")


