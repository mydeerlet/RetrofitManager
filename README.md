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
   implementation 'com.github.mydeerlet:RetrofitManager:1.0.1'

3. Constant.getInstance().init(); 必须初始化 ，最好在application中
4. 封装有工具类 LogUtils  ToastFactory

5. ### 简单使用
        RetrofitManager.getInstance(this)
                .create(Service.class)
                .getMessage("北京")
                .compose(this.<UpdateModel>scheduleSingle())
                .subscribe(new Consumer<UpdateModel>() {
                    @Override
                    public void accept(UpdateModel updateModel) throws Exception {
                        LogUtils.i("aaa",updateModel.getData().getGanmao());
                    }
                },new RxException<Throwable>());
    
6. dimens.xml 用来指定dp sp ，没有测试可用性待检测
7. #### 修改状态栏颜色，使用沉浸式状态栏继承BaseActivity ，BaseFragment 即可
        StatusBarUtil.setDarkMode(MainActivity.this);
        StatusBarUtil.setColor(MainActivity.this, ContextCompat.getColor(MainActivity.this,R.color.colorAccent),0);
