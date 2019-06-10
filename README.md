# ELF
## 库

- retrofit——网络请求
- rxjava——异步
- glide——图片加载
- even bus——传递
- gson——解析json
- room——数据库操作

## 架构

- mvp

## 包目录说明

- base

  > base架构包目录

- bean.jsonBean

  > 数据类

- config

  > 常量（列如网络链接，还有其他标识符）

- interfaces

  > - model 
  >
  >   > 数据层类接口
  >
  > - persenter
  >
  >   > persenter层类接口
  >
  > - view
  >
  >   > view层接口

- model

  > 数据类

- persenter

- view

  > - activity
  >
  > - adapter
  >
  > - widget
  >
  >   > 控件类包，自定义view



- MVP

  > - 接口：IBaseView、IBasePresenter、IBaseModel 只包含一些最基本的方法
  > - 使用：创建自己需要的接口继承上面的接口，根据你们自己的需求添加方法。
  >
  >   >e.g.
  >   >
  >   >```kotlin
  >   >interface IMainModel: IBaseModel {
  >   >    fun getData(url: String, callback: Callback) { /*...*/ }
  >   >
  >   >    /*根据自己的需求创建一个Callback，能用lambda就用lambda*/
  >   >    interface Callback {
  >   >        fun onSuccess(result: String) { /*...*/ }
  >   >        fun onFailed(e: Exception) { /*...*/ }
  >   >    }
  >   >}
  >   >```



