1.解决黑白屏：用setTheme图片的方式

​	然后使用AsyncLayoutFlater加载布局文件，在回调用setContentView（）

2.如果两层LinearLayout包裹两个控件，可以使用<merge>标签来合并。但是在inflate布局的时候，最后一个参数需要改成true（attachToParent），然后也不用addView了。然后在自定义linearLayouT中，设置各种参数

​	