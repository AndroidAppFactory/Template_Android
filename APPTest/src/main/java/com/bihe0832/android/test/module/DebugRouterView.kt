package com.bihe0832.android.test.module

import com.bihe0832.android.common.debug.view.DebugCommonPanel
import com.bihe0832.android.lib.adapter.CardBaseModule
import com.bihe0832.android.lib.router.RouterHelper

class DebugRouterView : DebugCommonPanel() {

    override fun getDataList(): ArrayList<CardBaseModule> {
        return ArrayList<CardBaseModule>().apply {
            add(getDebugItemData("打开调试页面") {
                RouterHelper.openPage("zixie://ztandroid/debug")
            })
        }
    }
}
