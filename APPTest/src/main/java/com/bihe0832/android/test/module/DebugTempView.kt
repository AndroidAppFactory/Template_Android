package com.bihe0832.android.test.module

import com.bihe0832.android.common.debug.module.DebugEnvFragment
import com.bihe0832.android.common.debug.view.DebugCommonPanel
import com.bihe0832.android.lib.adapter.CardBaseModule

class DebugTempView : DebugCommonPanel() {

    override fun getDataList(): ArrayList<CardBaseModule> {
        return ArrayList<CardBaseModule>().apply {
            add(getDebugFragmentItemData("环境切换", DebugEnvFragment::class.java))
            add(getDebugItemData("测试日志") { showInfo("测试日志") })
        }
    }
}
