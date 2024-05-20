package com.example.examplecontainer

import com.mst.basics.instruct.base.InstructSingle

object InstructSingle {
    val INSTALL_PLUGIN: InstructSingle =
        InstructSingle("an zhuang cha jian", "安装插件", "install plugin")
    val LOAD_PLUGIN: InstructSingle = InstructSingle("jia zai cha jian", "加载插件", "load plugin")
    val UNINSTALL_PLUGIN: InstructSingle =
        InstructSingle("xie zai cha jian", "卸载插件", "uninstall plugin")
}