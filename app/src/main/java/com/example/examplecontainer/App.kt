package com.example.examplecontainer

import com.mst.basics.GlassBaseApplication
import com.plugincore.wrapper.PluginEngine
import com.plugincore.wrapper.application.PluginApplication
import com.teamhelper.base.application.AppConfig

class App : GlassBaseApplication() {
    override fun addApplications(appConfig: AppConfig) {
        super.addApplications(appConfig)
        // OEM鉴权标识
        PluginEngine.setProjectCode("TEST")
        appConfig.add(PluginApplication())
    }
}