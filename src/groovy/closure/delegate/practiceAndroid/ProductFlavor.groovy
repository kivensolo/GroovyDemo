package groovy.closure.delegate.practiceAndroid

/**
 * author: King.Z <br>
 * date:  2018/12/24 22:00 <br>
 * description: ProductFlavor类 <br>
 */
class ProductFlavor {
    private int mVersionCode
    private int mMinSdkCode
    private int mTargetVersionCode
    private String mVersionName

    def versionCode(int code){
        mVersionCode = code
    }
    def minSdkCode(int code){
        mMinSdkCode = code
    }
    def targetVersionCode(int code){
        mTargetVersionCode = code
    }
    def versionName(String name){
        mVersionName = name
    }

    @Override
    String toString() {
        return "ProductFlavor{" +
                "mVersionCode=" + mVersionCode +
                ", mMinSdkCode=" + mMinSdkCode +
                ", mTargetVersionCode=" + mTargetVersionCode +
                ", mVersionName='" + mVersionName + '\'' +
                '}'
    }
}
