package com.example.examplecontainer

import com.example.examplecontainer.databinding.ActivityMainBinding
import com.mst.basics.base.view.activity.GlassBaseActivity
import com.plugincore.wrapper.PluginEngine
import com.teamhelper.base.mvvm.databinding.viewmodel.EmptyViewModel

class MainActivity : GlassBaseActivity<ActivityMainBinding, EmptyViewModel>() {
    override fun initData() {

    }

    override fun initParams() {

    }

    override fun initView() {

        v.btn1.setInstruct(InstructSingle.LOAD_PLUGIN)
        v.btn1.setOnClickListener {
            PluginEngine.installPlugin("com.mst.testplugin", -1)
        }

        v.btn2.setInstruct(InstructSingle.LOAD_PLUGIN)
        v.btn2.setOnClickListener {
            PluginEngine.launchPlugin("com.mst.testplugin", -1)
        }

        v.btn3.setInstruct(InstructSingle.UNINSTALL_PLUGIN)
        v.btn3.setOnClickListener {
            PluginEngine.uninstallPlugin("com.mst.testplugin", -1)
        }

        setFocusView(v.btn1)
    }

    override fun registerObserve() {

    }

}