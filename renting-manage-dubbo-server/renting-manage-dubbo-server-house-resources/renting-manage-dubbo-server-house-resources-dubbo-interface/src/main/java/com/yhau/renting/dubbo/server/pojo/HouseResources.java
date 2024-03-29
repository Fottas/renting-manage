package com.yhau.renting.dubbo.server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 房源表
 * </p>
 *
 * @author yhau
 * @since 2019-09-23
 */
@Data
@Accessors(chain = true)
@TableName("tb_house_resources")
public class HouseResources extends BasePojo {

    private static final long serialVersionUID = 6723870077315263436L;

    /**
     * 房源标题
     */
    private String title;

    /**
     * 楼盘id
     */
    private Long estateId;

    /**
     * 楼号（栋）
     */
    private String buildingNum;

    /**
     * 单元号
     */
    private String buildingUnit;

    /**
     * 门牌号
     */
    private String buildingFloorNum;

    /**
     * 租金
     */
    private Integer rent;

    /**
     * 租赁方式，1-整租，2-合租
     */
    private String rentMethod;

    /**
     * 支付方式，1-付一押一，2-付三押一，3-付六押一，4-年付押一，5-其它
     */
    private String paymentMethod;

    /**
     * 户型，如：2室1厅1卫
     */
    private String houseType;

    /**
     * 建筑面积
     */
    private String coveredArea;

    /**
     * 使用面积
     */
    private String useArea;

    /**
     * 楼层，如：8/26
     */
    private String floor;

    /**
     * 朝向：东、南、西、北
     */
    private String orientation;

    /**
     * 装修，1-精装，2-简装，3-毛坯
     */
    private String decoration;

    /**
     * 配套设施， 如：1,2,3
     */
    private String facilities;

    /**
     * 图片，最多5张
     */
    private String pic;

    /**
     * 描述
     */
    private String houseDesc;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 看房时间，1-上午，2-中午，3-下午，4-晚上，5-全天
     */
    private String time;

    /**
     * 物业费
     */
    private String propertyCost;

}
