package com.zch.crm.entity;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:21
 * @version:1.0.0
 */
public class Department {
    private Long id;

    private String deptname;

    private String deptmsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptmsg() {
        return deptmsg;
    }

    public void setDeptmsg(String deptmsg) {
        this.deptmsg = deptmsg == null ? null : deptmsg.trim();
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", deptmsg='" + deptmsg + '\'' +
                '}';
    }
}
