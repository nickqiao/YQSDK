package nickqiao.com.sdk.model;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class SdkPayResult extends SdkResult {

    public String orderId;

    public SdkPayResult(int category) {
        super(SdkResult.CATEGORY_PAY);
    }
}
