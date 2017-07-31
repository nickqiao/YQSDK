package nickqiao.com.sdk.listener;

import nickqiao.com.sdk.model.UserBean;

/**
 * Created by chenyuqiao on 2017/7/31 .
 */
public interface LoginListener {
    public void onSuccess(UserBean user);
    public void onFailure();
}
