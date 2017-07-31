package nickqiao.com.sdk.model;

/**
 * Created by chenyuqiao on 2017/7/31 .
 */
public class SdkRoleInfo {
    // 玩家角色名称
    private String roleName;
    // 玩家等级，应为数字
    private int roleLevel;
    // 玩家所在区服
    private String roleServer;
    // 玩家帐户余额，应为数字，如：100 表示100元宝
    private int roleMoney;


    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public int getRoleLevel() {
        return roleLevel;
    }


    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }


    public String getRoleServer() {
        return roleServer;
    }


    public void setRoleServer(String roleServer) {
        this.roleServer = roleServer;
    }


    public int getRoleMoney() {
        return roleMoney;
    }


    public void setRoleMoney(int roleMoney) {
        this.roleMoney = roleMoney;
    }


    /**
     * 构造玩家信息。
     * @param roleName 玩家角色名称
     * @param roleLevel 玩家等级
     * @param roleServer 玩家所在区服
     * @param roleMoney 玩家在游戏里面的帐户余额
     */
    public SdkRoleInfo(String roleName, int roleLevel, String roleServer,
                       int roleMoney) {
        super();
        this.roleName = roleName;
        this.roleLevel = roleLevel;
        this.roleServer = roleServer;
        this.roleMoney = roleMoney;
    }

    /**
     * 判断是否缺失数据
     * @return
     */
    public boolean isEmpty(){
        return roleName==null || "".equals(roleName) || roleServer==null ||  "".equals(roleServer) ;
    }

    @Override
    public String toString() {
        return "SdkRoleInfo [roleName=" + roleName + ", roleLevel=" + roleLevel
                + ", roleServer=" + roleServer + ", roleMoney=" + roleMoney
                + "]";
    }
}
