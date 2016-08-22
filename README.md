##BottomDialog是什么？
一个显示在底部，占据屏幕宽度的对话框。

##效果图
![pic](https://github.com/cookiemouse/BottomDialog/blob/master/pic/pic.jpg?raw=true)

##使用方法
使用方法非常简单，和DialogFragment一样。其aar在lib文件夹中。[lib](https://github.com/cookiemouse/BesselLoading/tree/master/lib)
```java
    BottomDialog bottomDialog = new BottomDialog();
    View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.view_dialog, null);
    bottomDialog.setContentView(view);
    bottomDialog.show(getFragmentManager(), "testfragment");
```

##实现方法
继承自DialogFragment，设置其属性及位置即可。
具体请见源码。
