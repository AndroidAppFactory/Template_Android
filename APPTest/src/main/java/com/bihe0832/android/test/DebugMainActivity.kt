package com.bihe0832.android.test

import android.os.Bundle
import com.bihe0832.android.app.router.RouterConstants
import com.bihe0832.android.common.debug.base.BaseDebugActivity
import com.bihe0832.android.lib.router.annotation.APPMain
import com.bihe0832.android.lib.router.annotation.Module
import com.bihe0832.android.test.module.DebugRouterView
import com.bihe0832.android.test.module.DebugTempView

@APPMain
@Module(RouterConstants.MODULE_NAME_DEBUG)
class DebugMainActivity : BaseDebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initToolbar(R.id.common_toolbar, "DebugMainActivity", false, true, R.drawable.ic_left_arrow)
    }

    override fun getDebugTempView(): Class<*> {
        return DebugTempView::class.java
    }

    override fun getDebugRouterView(): Class<*> {
        return DebugRouterView::class.java
    }
}
