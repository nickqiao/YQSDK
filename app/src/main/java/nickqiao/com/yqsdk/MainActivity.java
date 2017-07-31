package nickqiao.com.yqsdk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.util.UUID;

import nickqiao.com.sdk.YQSDK;
import nickqiao.com.sdk.listener.LoginListener;
import nickqiao.com.sdk.listener.LogoutListener;
import nickqiao.com.sdk.listener.PayListener;
import nickqiao.com.sdk.listener.SplashListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;
import nickqiao.com.sdk.model.UserBean;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSDK();
        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.btn_login_out).setOnClickListener(this);
        findViewById(R.id.btn_pay).setOnClickListener(this);
        findViewById(R.id.btn_quit).setOnClickListener(this);
        findViewById(R.id.btn_report).setOnClickListener(this);
    }

    private void initSDK() {
        SdkInitInfo initInfo = new SdkInitInfo();
        initInfo.appid = "";
        initInfo.appKey = "";
        initInfo.debug = true;
        initInfo.oritentation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        initInfo.showSplash = false;
        YQSDK.init(this, initInfo, new SplashListener() {
            @Override
            public void onSplashComplete() {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        YQSDK.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        YQSDK.onPause(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        YQSDK.onStop(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        YQSDK.onRestart(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        YQSDK.onDestroy(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        YQSDK.onNewIntent(this, intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                YQSDK.login(new LoginListener() {
                    @Override
                    public void onSuccess(UserBean user) {

                    }

                    @Override
                    public void onFailure() {

                    }
                });
                break;
            case R.id.btn_login_out:
                YQSDK.logout(new LogoutListener() {
                    @Override
                    public void onLogout() {

                    }
                });
                break;
            case R.id.btn_pay:
                SdkPayOrder order = new SdkPayOrder();
                order.amount = 10000;
                order.orderId = UUID.randomUUID().toString();
                order.itemId = "itemId";
                order.itemName = "itemName";
                order.remark =  "remark";
                order.serverId = "serverId";
                order.roleId = "roleId";
                YQSDK.pay(order, new PayListener() {
                    @Override
                    public void onPaySuccess() {

                    }

                    @Override
                    public void onPayFailure() {

                    }

                    @Override
                    public void onPayCancel() {

                    }
                });
                break;
            case R.id.btn_quit:
                YQSDK.exitGame(this);
                break;
            case R.id.btn_report:
                SdkGameInfo gameInfo = new SdkGameInfo();
                // TODO: 2017/7/30
                YQSDK.reportGameInfo(gameInfo);
                break;
        }
    }
}
