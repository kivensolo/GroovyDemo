package groovy.closure.delegate.practiceAndroid

/**
 * author: King.Z <br>
 * date:  2018/12/24 22:07 <br>
 * description: 模拟安卓Gradle的测试脚本 <br>
 */
def android = {
    compileSdkVertion 22
//    compileSdkVertion=22  //=有效
    buildToolsVersion "25.0.2"
    defaultConfig{
        minSdkCode 14
        minSdkCode(19)
//        minSdkCode=14 无效  以为是minSdkCode方法
        targetVersionCode 22
        versionCode 1
        versionName "1.0"
    }
}

Android a = new Android()
android.delegate = a;
android.setResolveStrategy(Closure.DELEGATE_FIRST)
android.call()
println(a.toString())
