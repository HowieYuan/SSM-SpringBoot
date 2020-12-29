package com.howie.entity;

/**
 * entity:CmAttr
 *
 * @author
 * @version 3.0
 * @date 2020-10-21
 */
public class CmAttrDO {

    private static final long serialVersionUID = 1L;

    /* 属性ID */
    private Long attrId;

    /* 所属机构ID（四格平台统一为0） */
    private Long organId;

    /* 属性名称 */
    private String attrName;


    private String level;

    /* 父级属性ID（0：无父级、>0：父级值、-1：属性组） */
    private Long parentAttrId;

    /* 属性编码 */
    private String attrCode;

    /* 属性类型（1：企业自定义、2：平台初始化-大类、3：平台初始化-通用） */
    private byte attrType;

    /* 文本框：text；
            下拉框：select；
            日期控件：date；
            文本域：textarea；
            复选框：checkbox；
            单选按钮：radio；
            数字文本框：number；
            整数文本框：integer；
            金额文本框：amount；
            表格变量：tableVar */
    private String attrValueType;

    /* 属性值长度 */
    private Integer attrValueLength;

    /* 属性值取值方式（1：客户输入、2：系统计算、3：系统查询） */
    private byte attrValueMethod;

    /* 是否枚举（1：是、0：否） */
    private byte isEnum;

    /* 是否只读（1：是、0：否） */
    private byte readOnly;

    /* 属性描述 */
    private String remark;

    /* 属性排序 */
    private Integer attrOrder;

    /* 属性状态（1：启用、0：禁用） */
    private byte attrStatus;

    /* 创建人ID */
    private Long createBy;

    /* 创建时间 */
    private Long createDate;

    /* 修改人ID */
    private Long updateBy;

    /* 修改时间 */
    private Long updateDate;


    //其他自定义属性


    // Constructor
    public CmAttrDO() {
    }

    /**
     * full Constructor
     */
    public CmAttrDO(Long attrId, Long organId, String attrName, String level, Long parentAttrId, String attrCode, byte attrType, String attrValueType, Integer attrValueLength, byte attrValueMethod, byte isEnum, byte readOnly, String remark, Integer attrOrder, byte attrStatus, Long createBy, Long createDate, Long updateBy, Long updateDate) {
        this.attrId = attrId;
        this.organId = organId;
        this.attrName = attrName;
        this.level = level;
        this.parentAttrId = parentAttrId;
        this.attrCode = attrCode;
        this.attrType = attrType;
        this.attrValueType = attrValueType;
        this.attrValueLength = attrValueLength;
        this.attrValueMethod = attrValueMethod;
        this.isEnum = isEnum;
        this.readOnly = readOnly;
        this.remark = remark;
        this.attrOrder = attrOrder;
        this.attrStatus = attrStatus;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getOrganId() {
        return organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getParentAttrId() {
        return parentAttrId;
    }

    public void setParentAttrId(Long parentAttrId) {
        this.parentAttrId = parentAttrId;
    }

    public String getAttrCode() {
        return attrCode;
    }

    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public byte getAttrType() {
        return attrType;
    }

    public void setAttrType(byte attrType) {
        this.attrType = attrType;
    }

    public String getAttrValueType() {
        return attrValueType;
    }

    public void setAttrValueType(String attrValueType) {
        this.attrValueType = attrValueType;
    }

    public Integer getAttrValueLength() {
        return attrValueLength;
    }

    public void setAttrValueLength(Integer attrValueLength) {
        this.attrValueLength = attrValueLength;
    }

    public byte getAttrValueMethod() {
        return attrValueMethod;
    }

    public void setAttrValueMethod(byte attrValueMethod) {
        this.attrValueMethod = attrValueMethod;
    }

    public byte getIsEnum() {
        return isEnum;
    }

    public void setIsEnum(byte isEnum) {
        this.isEnum = isEnum;
    }

    public byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(byte readOnly) {
        this.readOnly = readOnly;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
    }

    public byte getAttrStatus() {
        return attrStatus;
    }

    public void setAttrStatus(byte attrStatus) {
        this.attrStatus = attrStatus;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "CmAttr [" + "attrId=" + attrId + ", organId=" + organId + ", attrName=" + attrName + ", level=" + level + ", parentAttrId=" + parentAttrId + ", attrCode=" + attrCode + ", attrType=" + attrType + ", attrValueType=" + attrValueType + ", attrValueLength=" + attrValueLength + ", attrValueMethod=" + attrValueMethod + ", isEnum=" + isEnum + ", readOnly=" + readOnly + ", remark=" + remark + ", attrOrder=" + attrOrder + ", attrStatus=" + attrStatus + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
    }
}
