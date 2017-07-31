package nickqiao.com.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import nickqiao.com.sdk.listener.LoginListener;
import nickqiao.com.sdk.listener.LogoutListener;
import nickqiao.com.sdk.listener.PayListener;
import nickqiao.com.sdk.listener.SplashListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;
import nickqiao.com.sdk.utils.ScreenUtil;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class ProxySdk {

    private static String TAG = ProxySdk.class.getSimpleName();
    private static ProxySdk intance;
    private Application mApplicaton;
    private Activity mActivity;

    private SdkInitInfo mSdkInitInfo;

    private SplashListener mSplashListener;
    private PayListener mPayListener;
    private LoginListener mLoginListener;
    private LogoutListener mLogoutListener;

    private ProxySdk() {

    }

    public synchronized static ProxySdk createIntance() {
        if (intance == null) {
            intance = new ProxySdk();
        }
        return intance;
    }

    public Context getContext() {
        return mApplicaton;
    }

    public Activity getActivity() {
        return mActivity;
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

    public void init(final Activity activity, final SdkInitInfo sdkInitInfo, SplashListener splashListener) {
        Log.d(TAG, "init");
        mActivity = activity;
        mApplicaton = activity.getApplication();
        mSdkInitInfo = sdkInitInfo;
        mSplashListener = splashListener;
        ScreenUtil.init(activity.getApplication());
    }

    public void login(LoginListener loginListener) {
        Log.d(TAG, "login");
        mLoginListener = loginListener;
    }

    public void pay(SdkPayOrder payOrder, PayListener payListener) {
        Log.d(TAG, "pay");
        mPayListener = payListener;
    }

    public void exitGame(Activity activity) {
        Log.d(TAG, "exitGame");
    }

    public void logout(LogoutListener logoutListener) {
        Log.d(TAG, "logout");
        mLogoutListener = logoutListener;
    }

    public void reportGameInfo(SdkGameInfo gameInfo) {
        Log.d(TAG, "reportGameInfo");
    }

}
