package nickqiao.com.yqsdk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.util.UUID;

import nickqiao.com.sdk.YQSDK;
import nickqiao.com.sdk.model.IResultListener;
import nickqiao.com.sdk.model.SdkGameInfo;
import nickqiao.com.sdk.model.SdkInitInfo;
import nickqiao.com.sdk.model.SdkPayOrder;
import nickqiao.com.sdk.model.SdkResult;

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
        YQSDK.init(this, initInfo, new IResultListener() {
            @Override
            public void onResult(SdkResult result) {

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
                YQSDK.login(this);
                break;
            case R.id.btn_login_out:
                YQSDK.logout(this);
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
                YQSDK.pay(this, order);
                break;
            case R.id.btn_quit:
                YQSDK.exitGame(this);
                break;
            case R.id.btn_report:
                SdkGameInfo gameInfo = new SdkGameInfo();
                // TODO: 2017/7/30
                YQSDK.reportGameInfo(this, gameInfo);
                break;
        }
    }
}
