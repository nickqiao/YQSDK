package nickqiao.com.sdk.model;

import android.content.pm.ActivityInfo;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class SdkInitInfo {

    /**
     * 游戏id
     */
    public String appid;

    /**
     * 游戏key
     */
    public String appKey;

    /**
     * 是否为调试模式
     */
    public boolean debug = false;

    /**
     * 是否展示闪屏
     */
    public boolean showSplash = false;

    /**
     * 横竖屏
     *  ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE 横屏
     *   ActivityInfo.SCREEN_ORIENTATION_PORTRAIT 竖屏
     */
    public int oritentation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

}
