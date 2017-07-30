package nickqiao.com.sdk.model;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class SdkResult {

    /**
     * SDK初始化
     */
    public static final int CATEGORY_INIT = 0;
    /**
     * 账户登录
     */
    public static final int CATEGORY_LOGIN = 1;
    /**
     * 账户登出
     */
    public static final int CATEGORY_LOGOUT = 2;
    /**
     * 支付
     */
    public static final int CATEGORY_PAY = 3;

    /**
     * 退出游戏
     */
    public static final int CATEGORY_EXIT = 4;


    /**
     * SDK初始化失败
     */
    public static final int ERR_SDK_INIT_FAILED = 101;

    /**
     * SDK登录失败
     */
    public static final int ERR_SDK_LOGIN_FAILD = 102;

    /**
     * 订单支付失败
     */
    public static final int ERR_PAY_FAILED = 103;
    /**
     * 用户取消订单支付
     */
    public static final int ERR_PAY_USER_CANCELED = 104;

    /**
     * 游戏自己退出,SDK没有退出框
     */
    public static final int ERR_EXIT_GAME_SELF = 201;

    /**
     * SDK退出游戏成功
     */
    public static final int ERR_EXIT_SDK_FINISH = 202;

    /**
     * 未知错误
     *
     */
    public static final int ERR_UNKNOWN = 999;


    public SdkResult(int category) {
        this.category = category;
        this.success = true;
    }

    /**
     * 操作分类
     * @see #CATEGORY_INIT
     * @see #CATEGORY_LOGIN
     * @see #CATEGORY_LOGOUT
     * @see #CATEGORY_PAY
     */
    public int category;

    /**
     * 是否执行成功
     */
    public boolean success;

    /**
     * 错误码
     * @see #ERR_UNKNOWN
     * @see #ERR_SDK_INIT_FAILED
     * @see #ERR_PAY_FAILED
     * @see #ERR_PAY_USER_CANCELED
     */
    public int code;
    /**
     * 错误原因
     */
    public String reason;

    @Override
    public String toString() {
        return "SdkResult{" +
                "category=" + category +
                ", success=" + success +
                ", code=" + code +
                ", reason='" + reason + '\'' +
                '}';
    }

}
