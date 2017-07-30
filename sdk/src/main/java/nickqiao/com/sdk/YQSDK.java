package nickqiao.com.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import nickqiao.com.sdk.model.IResultListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class YQSDK {

    public static void init(Activity activity, SdkInitInfo info, IResultListener resultListener) {
        ProxySdk.createIntance().init(activity, info, resultListener);
    }

    public static void login(Activity activity) {
        ProxySdk.createIntance().login(activity);
    }

    public static void pay(Activity activity, SdkPayOrder payOrder) {
        ProxySdk.createIntance().pay(activity, payOrder);
    }

    public static void exitGame(Activity activity) {
        ProxySdk.createIntance().exitGame(activity);
    }

    public static void logout(Activity activity) {
        ProxySdk.createIntance().logout(activity);
    }

    public static void reportGameInfo(Activity activity, SdkGameInfo gameInfo) {
        ProxySdk.createIntance().reportGameInfo(activity, gameInfo);
    }

    /**
     * Application生命周期相关接口
     * 在application的attachBaseContext方法中调用
     * 必须在super.attachBaseContext(context)前调用
     * @param context
     */
    public static void beforeAppAttach(Context context) {
        ProxySdk.createIntance().beforeAppAttach(context);
    }

    /**
     * Application生命周期相关接口
     * 在application的onCreate方法中调用
     * 必须在super.onCreate()后调用
     * @param context
     */
    public static void afterAppOnCreate(Context context) {
        ProxySdk.createIntance().afterAppOnCreate(context);
    }

    /**
     * Activity 相关生命周期 onResume
     * @param activity
     */
    public static void onResume(Activity activity) {
        ProxySdk.createIntance().onResume(activity);
    }
    /**
     * Activity 相关生命周期 onPause
     * @param activity
     */
    public static void onPause(Activity activity) {
        ProxySdk.createIntance().onPause(activity);
    }

    /**
     * Activity 相关生命周期 onStop
     * @param activity
     */
    public static void onStop(Activity activity) {
        ProxySdk.createIntance().onStop(activity);
    }
    /**
     * Activity 相关生命周期 onNewIntent
     * @param activity
     */
    public static void onNewIntent(Activity activity, Intent intent) {
        ProxySdk.createIntance().onNewIntent(activity, intent);
    }

    /**
     * Activity 相关生命周期 onDestroy
     * @param activity
     */
    public static void onDestroy(Activity activity) {
        ProxySdk.createIntance().onDestroy(activity);
    }

    public static void onRestart(Activity activity) {
        ProxySdk.createIntance().onRestart(activity);
    }

    public static void onActivityResult(Activity activity,int requestCode, int resultCode, Intent data){
        ProxySdk.createIntance().onActivityResult(activity,requestCode,resultCode,data);
    }

}
