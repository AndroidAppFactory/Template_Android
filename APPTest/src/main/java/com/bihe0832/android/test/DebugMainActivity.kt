package com.bihe0832.android.test

import android.os.Bundle
import android.view.Gravity
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import com.bihe0832.android.app.router.RouterConstants
import com.bihe0832.android.common.compose.debug.DebugUtilsV2
import com.bihe0832.android.common.compose.debug.common.DebugComposeMainActivity
import com.bihe0832.android.common.compose.debug.module.DebugCommonComposeView
import com.bihe0832.android.lib.debug.icon.DebugLogTips
import com.bihe0832.android.lib.router.annotation.APPMain
import com.bihe0832.android.lib.router.annotation.Module
import com.bihe0832.android.lib.sqlite.impl.CommonDBManager
import com.bihe0832.android.test.module.DebugLogActivity
import com.bihe0832.android.test.module.DebugRouterView
import com.bihe0832.android.test.module.DebugTempView

@APPMain
@Module(RouterConstants.MODULE_NAME_DEBUG)
class DebugMainActivity : DebugComposeMainActivity() {

    val TAB_FOR_DEV_COMMON: String = "通用调试"
    val TAB_FOR_DEV_TEMP: String = "临时调试"
    val TAB_FOR_ROUTER: String = "路由测试"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DebugLogTips.initModule(this, true, Gravity.LEFT or Gravity.TOP)
        CommonDBManager.init(this)
    }

    @Composable
    override fun getNavigationIcon(): ImageVector? {
        return null
    }

    override fun getTabs(): List<String> {
        return mutableListOf(
            TAB_FOR_DEV_COMMON,
            TAB_FOR_DEV_TEMP,
            TAB_FOR_ROUTER
        )
    }

    override fun getDefault(): String {
        return TAB_FOR_DEV_COMMON
    }

    @Composable
    override fun GetPageView(page: Int, tab: String) {
        when (tab) {
            TAB_FOR_DEV_COMMON -> {
                val context = LocalContext.current
                DebugCommonComposeView {
                    DebugUtilsV2.startActivityWithException(
                        context,
                        DebugLogActivity::class.java
                    )
                }
            }

            TAB_FOR_DEV_TEMP -> {
                DebugTempView()
            }

            TAB_FOR_ROUTER -> {
                DebugRouterView()
            }

            else -> {
                val context = LocalContext.current
                DebugCommonComposeView {
                    DebugUtilsV2.startActivityWithException(
                        context,
                        DebugLogActivity::class.java
                    )
                }
            }
        }
    }
}
