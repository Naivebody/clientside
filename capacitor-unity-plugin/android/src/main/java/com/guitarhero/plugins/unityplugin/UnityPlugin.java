package com.guitarhero.plugins.unityplugin;
import android.content.Intent;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;


@CapacitorPlugin(name = "UnityPlugin")
public class UnityPlugin extends Plugin {
    @PluginMethod
    public void startUnity(PluginCall call) {
        // 获取当前 Activity
        android.app.Activity activity = getActivity();
        // 启动 Unity 的主 Activity（你的自定义插件 Activity）
        Intent intent = new Intent(activity, com.guitarhero.practice.plugin.VolumeCustomActivity.class);
        activity.startActivity(intent);
        call.resolve();
    }
}
