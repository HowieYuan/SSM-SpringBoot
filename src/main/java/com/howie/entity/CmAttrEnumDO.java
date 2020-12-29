package com.howie.entity;

/**
 * entity:CmAttrEnum
 *
 * @author
 * @version 3.0
 * @date 2020-10-21
 */
public class CmAttrEnumDO {

    private static final long serialVersionUID = 1L;

    /* 枚举ID */
    private Long enumId;

    /* 属性ID */
    private Long attrId;

    /* 父级枚举ID */
    private Long parentEnumId;

    /* 枚举级别 */
    private Long enumLevel;

    /* 值名称 */
    private String enumName;

    /* 值编码 */
    private String enumCode;

    /* 值顺序 */
    private Integer enumOrder;

    /* 是否默认选中（1：是、0：否） */
    private byte isChecked;

    /* 状态（1：有效；0：无效） */
    private byte enumStatus;


    //其他自定义属性


    // Constructor
    public CmAttrEnumDO() {
    }

    /**
     * full Constructor
     */
    public CmAttrEnumDO(Long enumId, Long attrId, Long parentEnumId, Long enumLevel, String enumName, String enumCode, Integer enumOrder, byte isChecked, byte enumStatus) {
        this.enumId = enumId;
        this.attrId = attrId;
        this.parentEnumId = parentEnumId;
        this.enumLevel = enumLevel;
        this.enumName = enumName;
        this.enumCode = enumCode;
        this.enumOrder = enumOrder;
        this.isChecked = isChecked;
        this.enumStatus = enumStatus;
    }

    public Long getEnumId() {
        return enumId;
    }

    public void setEnumId(Long enumId) {
        this.enumId = enumId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getParentEnumId() {
        return parentEnumId;
    }

    public void setParentEnumId(Long parentEnumId) {
        this.parentEnumId = parentEnumId;
    }

    public Long getEnumLevel() {
        return enumLevel;
    }

    public void setEnumLevel(Long enumLevel) {
        this.enumLevel = enumLevel;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(String enumCode) {
        this.enumCode = enumCode;
    }

    public Integer getEnumOrder() {
        return enumOrder;
    }

    public void setEnumOrder(Integer enumOrder) {
        this.enumOrder = enumOrder;
    }

    public byte getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(byte isChecked) {
        this.isChecked = isChecked;
    }

    public byte getEnumStatus() {
        return enumStatus;
    }

    public void setEnumStatus(byte enumStatus) {
        this.enumStatus = enumStatus;
    }

    @Override
    public String toString() {
        return "CmAttrEnum [" + "enumId=" + enumId + ", attrId=" + attrId + ", parentEnumId=" + parentEnumId + ", enumLevel=" + enumLevel + ", enumName=" + enumName + ", enumCode=" + enumCode + ", enumOrder=" + enumOrder + ", isChecked=" + isChecked + ", enumStatus=" + enumStatus + "]";
    }
}
