# RetrofitManager


使用 JitPack 生成依赖
打开 https://jitpack.io/

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

3. Constant.getInstance().init(); 不须初始化 ，最好在application中
4. 封装有工具类 LogUtils  ToastFactory

4.  ## 简单使用  
     RetrofitManager.getInstance(this)
             .create(Service.class)
             .getMessage("北京")
             .compose(this.<UpdateModel>scheduleSingle())
             .subscribe(new Consumer<UpdateModel>() {
                    @Override
                    public void accept(UpdateModel updateModel) throws Exception {
                    }
                });
