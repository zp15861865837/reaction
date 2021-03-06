package com.net.system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Dept implements Serializable {

    private static final long serialVersionUID = -194076170058276436L;

    /**
 	* 部门ID
	*/
    @JsonProperty("id")
    @ApiModelProperty(value="部门ID",name="deptId")
    private Integer deptId;

    /**
	* 部门名称
	*/
    @JsonProperty("name")
    @ApiModelProperty(value="部门名称",name="deptName")
    private String deptName;

    /**
	* 上级部门 ID
	*/
    @ApiModelProperty(value="上级部门ID",name="parentId")
    private Integer parentId;

    /**
	* 排序
	*/
    @ApiModelProperty(value="排序",name="orderNum")
    private Integer orderNum;

    /**
	* 创建时间
	*/
    @JsonIgnore
    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    /**
	* 修改时间
	*/
    @JsonIgnore
    @ApiModelProperty(value="修改时间",name="modifyTime")
    private Date modifyTime;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Dept> children;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public List<Dept> getChildren() {
        return children;
    }

    public void setChildren(List<Dept> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", parentId=" + parentId +
                ", orderNum=" + orderNum +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", children=" + children +
                '}';
    }
}