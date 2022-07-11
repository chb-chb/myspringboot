package com.zrzyfw.myspringboot.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@EqualsAndHashCode()
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @Length(min = 5, max = 11, message = "电话号码长度不得少于5位,不得多于11位")
    private String username;

    @NotEmpty(message = "名称不能为空")
    private String name;

    private String password;

    private String deptId;

    private String email;

    private String mobile;

    private Integer gender;

    private String avatar;

    private Integer lockFlag;

    private Integer roleBelong;

    private String workTime;

    private String duty;

    private String dutySign;

    private String auditSign;

    private String mobileCode;

    private String psd;

    private Integer hasScore;

    private BigDecimal score;

    private String offFlag;

    private Integer unbindSum;

    private String cid;

    private String mobileCo;

    private String mobileC;

    private String userNo;

    private String mpopenid;

    private String appNum;

    private LocalDateTime loginTime;

    private String mobileCc;

    protected String created;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss") //出参
    protected LocalDateTime gmtCreate;

    protected String modified;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss") //出参
    protected LocalDateTime gmtModified;

    protected Integer delFlag;

    protected String remarks;

}
