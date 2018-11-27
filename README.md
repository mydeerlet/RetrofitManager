# RetrofitManager


使用 JitPack 生成依赖
打开 https://jitpack.io/ 并将 github 的项目地址填入，点击 Look Up
会看到刚刚提交的 release 的版本号在列表中


Add it in your root build.gradle at the end of repositories:

1.  在progect build.gradle中添加
    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    
2. 引入依赖
   implementation 'com.github.mydeerlet:RetrofitManager:0.2'
