package nickqiao.com.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.lang.ref.WeakReference;

import nickqiao.com.sdk.model.IResultListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class ProxySdk {

    private static Object TAG = ProxySdk.class;
    private static ProxySdk intance;
    private WeakReference<Activity> mContext;

    private ProxySdk() {

    }

    public synchronized static ProxySdk createIntance() {
        if (intance == null) {
            intance = new ProxySdk();
        }
        return intance;
    }

    public Context getContext() {
        return mContext.get();
    }

    private void initApplication(Context context) {

    }

    private void onCreate(Context context) {

    }

    public void onPause(Activity activity) {

    }

    public void onResume(Activity activity) {

    }

    public void onStop(Activity activity) {

    }

    public void onNewIntent(Activity activity, Intent intent) {

    }

    public void onDestroy(Activity activity) {

    }

    public void onRestart(Activity activity) {

    }

    public void onActivityResult(Activity activity,int requestCode, int resultCode, Intent data) {

    }

    private void superSdkInit(final Activity activity, final SdkInitInfo info) {

    }

    public void beforeAppAttach(Context context) {

    }

    public void afterAppOnCreate(Context context) {

    }

    public void changeOrientation(Activity activity, int orientation) {

    }

    public void init(final Activity activity, final SdkInitInfo info, IResultListener mResultListener) {

    }

    public void login(Activity activity) {

    }

    public void pay(Activity activity, SdkPayOrder payOrder) {

    }

    public void exitGame(Activity activity) {

    }

    public void logout(Activity activity) {

    }

    public void reportGameInfo(Activity activity, SdkGameInfo gameInfo) {

    }

}
