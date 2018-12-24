package groovy.closure.delegate

/**
 * author: King.Z <br>
 * date:  2018/12/24 20:35 <br>
 * description: Persion实体 <br>
 */
class Person {
    String name
    int age
    void eat(String food)  {
        println("我在Person这个地方吃这个----> ${food}")
    }


    @Override
    String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}

