package com.tree.shu.elf.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Create by yuanbing
 */
abstract class BaseActivity<V: IBaseView, P: IBasePresenter<V, M>, M: IBaseModel>: AppCompatActivity() {
    protected var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        presenter?.attachView(getViewToAttach())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
    }

    /**
     * 返回需要绑定的IBaseView对象
     */
    abstract fun getViewToAttach(): V

    /**
     * 创建IBasePresenter的对象
     */
    abstract fun createPresenter(): P
}