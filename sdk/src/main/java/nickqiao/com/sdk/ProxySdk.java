package nickqiao.com.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import nickqiao.com.sdk.listener.IResultListener;
import nickqiao.com.sdk.listener.SplashListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class ProxySdk {

    private static String TAG = ProxySdk.class.getSimpleName();
    private static ProxySdk intance;
    private Activity mContext;
    private static SplashListener mSplashListener;
    private SdkInitInfo mSdkInitInfo;
    private IResultListener mResultListener;
    private ProxySdk() {

    }

    public synchronized static ProxySdk createIntance() {
        if (intance == null) {
            intance = new ProxySdk();
        }
        return intance;
    }

    public Context getContext() {
        return mContext;
    }

    private void initApplication(Context context) {

    }

    public void beforeAppAttach(Context context) {
        Log.d(TAG, "beforeAppAttach");
    }

    public void afterAppOnCreate(Context context) {
        Log.d(TAG, "afterAppOnCreate");
    }

    private void onCreate(Context context) {

    }

    public void onPause(Activity activity) {
        Log.d(TAG, "onPause");
    }

    public void onResume(Activity activity) {
        Log.d(TAG, "onResume");

    }

    public void onStop(Activity activity) {
        Log.d(TAG, "onStop");
    }

    public void onNewIntent(Activity activity, Intent intent) {

    }

    public void onDestroy(Activity activity) {
        Log.d(TAG, "onDestroy");
    }

    public void onRestart(Activity activity) {
        Log.d(TAG, "onRestart");
    }

    public void onActivityResult(Activity activity,int requestCode, int resultCode, Intent data) {

    }

    private void superSdkInit(final Activity activity, final SdkInitInfo info) {

    }

    public void changeOrientation(Activity activity, int orientation) {

    }

    public void init(final Activity activity, final SdkInitInfo sdkInitInfo, IResultListener resultListener) {
        Log.d(TAG, "init");
        mContext = activity;
        mSdkInitInfo = sdkInitInfo;
        mResultListener = resultListener;
    }

    public void login(Activity activity) {
        Log.d(TAG, "login");
    }

    public void pay(Activity activity, SdkPayOrder payOrder) {
        Log.d(TAG, "pay");
    }

    public void exitGame(Activity activity) {
        Log.d(TAG, "exitGame");
    }

    public void logout(Activity activity) {
        Log.d(TAG, "logout");
    }

    public void reportGameInfo(Activity activity, SdkGameInfo gameInfo) {
        Log.d(TAG, "reportGameInfo");
    }

}
