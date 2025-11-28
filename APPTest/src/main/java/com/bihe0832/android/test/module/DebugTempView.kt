package com.bihe0832.android.test.module

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.bihe0832.android.common.compose.debug.item.DebugItem
import com.bihe0832.android.common.compose.debug.ui.DebugContent
import com.bihe0832.android.lib.utils.intent.IntentUtils

@Composable
fun DebugTempView() {
    DebugContent {
        val activity = LocalContext.current as? Activity
        DebugItem("简单测试函数") {
            testFunc()
        }
        DebugItem("通用测试预处理") {
            preTest()
        }
        DebugItem("APP设置") {
            activity?.let {
                IntentUtils.startAppDetailSettings(it)
            }
        }
    }
}

private fun preTest() {

}

private fun testFunc() {

}
