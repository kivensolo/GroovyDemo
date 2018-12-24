package groovy.closure.delegate.practiceAndroid

/**
 * author: King.Z <br>
 * date:  2018/12/24 21:59 <br>
 * description: 模拟Gradle Android类 <br>
 */
class Android {
    private int compileSdkVertion
    private String buildToolsVersion
    private ProductFlavor mProductFlavor

    Android (){
        this.mProductFlavor = new ProductFlavor()
    }

    void compileSdkVertion(int version){
        compileSdkVertion = version
    }
    void buildToolsVersion(String version){
        buildToolsVersion = version
    }

    void defaultConfig(Closure closure){
        closure.setDelegate(mProductFlavor)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        closure.call()
    }

    @Override
    String toString() {
        return "Android{\n" +
                "compileSdkVertion=" + compileSdkVertion +
                ", \nbuildToolsVersion='" + buildToolsVersion +
                ", \nmProductFlavor=" + mProductFlavor +
                '}'
    }
}
