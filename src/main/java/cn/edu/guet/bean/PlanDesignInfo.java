package cn.edu.guet.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 规划设计评估主表
 * @TableName t_plan_design_info
 */
public class PlanDesignInfo implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 规划工单编号
     */
    private String planBillNo;

    /**
     * 规划设计名称
     */
    private String planDesignName;

    /**
     * 设计单位
     */
    private String designCompany;

    /**
     * 类名 业务类型，枚举：1、 OTN业务
     */
    private Integer specId;

    /**
     * 项目总负责人
     */
    private String projectDirector;

    /**
     * 专业负责人
     */
    private String specLeader;

    /**
     * 设计人
     */
    private String designer;

    /**
     * 校审人 当前用户
     */
    private String reviewer;

    /**
     * 工单来源 枚举：1自建（默认） 2外部工单
     */
    private Integer source;

    /**
     * 系统规划CAD图纸附件Id
     */
    private Integer systemCadFileId;

    /**
     * 系统规划CAD文件名
     */
    private String systemCadFileName;

    /**
     * 系统规划CAD文件URL
     */
    private String systemCadFileUrl;

    /**
     * 系统规划Excel文件附件Id
     */
    private Integer systemExcelFileId;

    /**
     * 系统规划Excel文件附件名
     */
    private String systemExcelFileName;

    /**
     * 系统规划Excel文件附件URL
     */
    private String systemExcelFileUrl;

    /**
     * 波道规划Excel文件附件Id
     */
    private Integer channelExcelFileId;

    /**
     * 波道规划Excel文件附件名
     */
    private String channelExcelFileName;

    /**
     * 波道规划Excel文件附件URL
     */
    private String channelExcelFileUrl;

    /**
     * CAD图纸坐标(左)
     */
    private Integer cadCoordLeft;

    /**
     * CAD图纸坐标(上)
     */
    private Integer cadCoordTop;

    /**
     * CAD图纸坐标(右)
     */
    private Integer cadCoordRight;

    /**
     * CAD图纸坐标(下)
     */
    private Integer cadCoordBottom;

    /**
     * 工单创建人id
     */
    private Integer staffId;

    /**
     * 工单创建人名称
     */
    private String staffName;

    /**
     * 设计新建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    /**
     * 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 规划工单编号
     */
    public String getPlanBillNo() {
        return planBillNo;
    }

    /**
     * 规划工单编号
     */
    public void setPlanBillNo(String planBillNo) {
        this.planBillNo = planBillNo;
    }

    /**
     * 规划设计名称
     */
    public String getPlanDesignName() {
        return planDesignName;
    }

    /**
     * 规划设计名称
     */
    public void setPlanDesignName(String planDesignName) {
        this.planDesignName = planDesignName;
    }

    /**
     * 设计单位
     */
    public String getDesignCompany() {
        return designCompany;
    }

    /**
     * 设计单位
     */
    public void setDesignCompany(String designCompany) {
        this.designCompany = designCompany;
    }

    /**
     * 类名 业务类型，枚举：1、 OTN业务
     */
    public Integer getSpecId() {
        return specId;
    }

    /**
     * 类名 业务类型，枚举：1、 OTN业务
     */
    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    /**
     * 项目总负责人
     */
    public String getProjectDirector() {
        return projectDirector;
    }

    /**
     * 项目总负责人
     */
    public void setProjectDirector(String projectDirector) {
        this.projectDirector = projectDirector;
    }

    /**
     * 专业负责人
     */
    public String getSpecLeader() {
        return specLeader;
    }

    /**
     * 专业负责人
     */
    public void setSpecLeader(String specLeader) {
        this.specLeader = specLeader;
    }

    /**
     * 设计人
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * 设计人
     */
    public void setDesigner(String designer) {
        this.designer = designer;
    }

    /**
     * 校审人 当前用户
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 校审人 当前用户
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * 工单来源 枚举：1自建（默认） 2外部工单
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 工单来源 枚举：1自建（默认） 2外部工单
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 系统规划CAD图纸附件Id
     */
    public Integer getSystemCadFileId() {
        return systemCadFileId;
    }

    /**
     * 系统规划CAD图纸附件Id
     */
    public void setSystemCadFileId(Integer systemCadFileId) {
        this.systemCadFileId = systemCadFileId;
    }

    /**
     * 系统规划CAD文件名
     */
    public String getSystemCadFileName() {
        return systemCadFileName;
    }

    /**
     * 系统规划CAD文件名
     */
    public void setSystemCadFileName(String systemCadFileName) {
        this.systemCadFileName = systemCadFileName;
    }

    /**
     * 系统规划CAD文件URL
     */
    public String getSystemCadFileUrl() {
        return systemCadFileUrl;
    }

    /**
     * 系统规划CAD文件URL
     */
    public void setSystemCadFileUrl(String systemCadFileUrl) {
        this.systemCadFileUrl = systemCadFileUrl;
    }

    /**
     * 系统规划Excel文件附件Id
     */
    public Integer getSystemExcelFileId() {
        return systemExcelFileId;
    }

    /**
     * 系统规划Excel文件附件Id
     */
    public void setSystemExcelFileId(Integer systemExcelFileId) {
        this.systemExcelFileId = systemExcelFileId;
    }

    /**
     * 系统规划Excel文件附件名
     */
    public String getSystemExcelFileName() {
        return systemExcelFileName;
    }

    /**
     * 系统规划Excel文件附件名
     */
    public void setSystemExcelFileName(String systemExcelFileName) {
        this.systemExcelFileName = systemExcelFileName;
    }

    /**
     * 系统规划Excel文件附件URL
     */
    public String getSystemExcelFileUrl() {
        return systemExcelFileUrl;
    }

    /**
     * 系统规划Excel文件附件URL
     */
    public void setSystemExcelFileUrl(String systemExcelFileUrl) {
        this.systemExcelFileUrl = systemExcelFileUrl;
    }

    /**
     * 波道规划Excel文件附件Id
     */
    public Integer getChannelExcelFileId() {
        return channelExcelFileId;
    }

    /**
     * 波道规划Excel文件附件Id
     */
    public void setChannelExcelFileId(Integer channelExcelFileId) {
        this.channelExcelFileId = channelExcelFileId;
    }

    /**
     * 波道规划Excel文件附件名
     */
    public String getChannelExcelFileName() {
        return channelExcelFileName;
    }

    /**
     * 波道规划Excel文件附件名
     */
    public void setChannelExcelFileName(String channelExcelFileName) {
        this.channelExcelFileName = channelExcelFileName;
    }

    /**
     * 波道规划Excel文件附件URL
     */
    public String getChannelExcelFileUrl() {
        return channelExcelFileUrl;
    }

    /**
     * 波道规划Excel文件附件URL
     */
    public void setChannelExcelFileUrl(String channelExcelFileUrl) {
        this.channelExcelFileUrl = channelExcelFileUrl;
    }

    /**
     * CAD图纸坐标(左)
     */
    public Integer getCadCoordLeft() {
        return cadCoordLeft;
    }

    /**
     * CAD图纸坐标(左)
     */
    public void setCadCoordLeft(Integer cadCoordLeft) {
        this.cadCoordLeft = cadCoordLeft;
    }

    /**
     * CAD图纸坐标(上)
     */
    public Integer getCadCoordTop() {
        return cadCoordTop;
    }

    /**
     * CAD图纸坐标(上)
     */
    public void setCadCoordTop(Integer cadCoordTop) {
        this.cadCoordTop = cadCoordTop;
    }

    /**
     * CAD图纸坐标(右)
     */
    public Integer getCadCoordRight() {
        return cadCoordRight;
    }

    /**
     * CAD图纸坐标(右)
     */
    public void setCadCoordRight(Integer cadCoordRight) {
        this.cadCoordRight = cadCoordRight;
    }

    /**
     * CAD图纸坐标(下)
     */
    public Integer getCadCoordBottom() {
        return cadCoordBottom;
    }

    /**
     * CAD图纸坐标(下)
     */
    public void setCadCoordBottom(Integer cadCoordBottom) {
        this.cadCoordBottom = cadCoordBottom;
    }

    /**
     * 工单创建人id
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 工单创建人id
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 工单创建人名称
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 工单创建人名称
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 设计新建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设计新建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
