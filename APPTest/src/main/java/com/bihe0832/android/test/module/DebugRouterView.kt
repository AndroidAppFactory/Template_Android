package com.bihe0832.android.test.module

import androidx.compose.runtime.Composable
import com.bihe0832.android.app.router.RouterConstants
import com.bihe0832.android.app.router.RouterHelper
import com.bihe0832.android.common.compose.debug.module.router.GetRouterView

@Composable
fun DebugRouterView() {
    GetRouterView(getRouterList())
}

fun getRouterList(): List<String> {
    return mutableListOf(
        "zixie://zweb?url=https%3A%2F%2Fblog.bihe0832.com",
        "zixie://zfeedback?url=https%3A%2F%2Fsupport.qq.com%2Fproduct%2F290858",
        RouterHelper.getFinalURL(RouterConstants.MODULE_NAME_BASE_ABOUT),
        RouterHelper.getFinalURL(RouterConstants.MODULE_NAME_MESSAGE)
    )
}
