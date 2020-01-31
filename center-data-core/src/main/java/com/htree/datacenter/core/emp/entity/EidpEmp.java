package com.htree.datacenter.core.emp.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author CodeGenerator
 * @since 2020-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EidpEmp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private String sex;

    /**
     * 所属机构
     */
    private String department;

    /**
     * 上司
     */
    private String superior;

    /**
     * 职务
     */
    private String post;

    /**
     * 职称
     */
    private String title;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 入职日期
     */
    private Date enrollment;

    /**
     * 离职日期
     */
    private Date resign;

    /**
     * 合同到期日期
     */
    private Date contract;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 创建人id
     */
    private String createEmpId;

    /**
     * 创建人
     */
    private String createEmp;

    /**
     * 修改日期
     */
    private Date modifytime;

    /**
     * 修改人id
     */
    private String modifyEmpId;

    /**
     * 修改人
     */
    private String modifyEmp;

    /**
     * 是否删除0：正常,1删除
     */
    @TableLogic
    private Integer serverFlag;

    @Version
    private Integer version;


}
