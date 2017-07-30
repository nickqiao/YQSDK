package nickqiao.com.yqsdk;

import android.app.Application;
import android.content.Context;

import nickqiao.com.sdk.YQSDK;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        YQSDK.afterAppOnCreate(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        YQSDK.beforeAppAttach(base);
        super.attachBaseContext(base);
    }
}
