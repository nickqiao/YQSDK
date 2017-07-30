package nickqiao.com.sdk.model;

/**
 * Created by chenyuqiao on 2017/7/30 .
 */

public class SdkPayOrder {

    /**
     *　订单ID 必填　可用UUID.randomUUID().toString()生成
     */
    public String orderId;
    /**
     * 物品ID 必填
     */
    public String itemId;
    /**
     * 物品名称 必填
     */
    public String itemName;

    /**
     * 订单总价 必填
     */
    public long amount;
    /**
     *　区服ID
     */
    public String serverId;
    /**
     * 角色ID
     */
    public String roleId;
    /**
     * 订单备注信息
     */
    public String remark;

    @Override
    public String toString() {
        return "SdkPayOrder{" +
                "orderId='" + orderId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", amount=" + amount +
                ", serverId='" + serverId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

}
