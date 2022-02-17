package com.czf.bootweb.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;


@Data
@TableName("students")//指定表名
public class Students {

    /*
    * 代表属性不在表里
    * */
    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String pass;



    private int id;
    private String name;
    private String password;
    private String gender;
    private String birthday;
    private int age;
    private String major;
    private String dorm;

}
