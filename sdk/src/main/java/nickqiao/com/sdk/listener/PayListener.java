package nickqiao.com.sdk.listener;

/**
 * Created by chenyuqiao on 2017/7/31 .
 */

public interface PayListener {

    void onPaySuccess();
    void onPayFailure();
    void onPayCancel();

}
