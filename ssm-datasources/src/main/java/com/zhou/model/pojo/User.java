package com.zhou.model.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author zhous
 * @create 2019-07-06 13:58
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;
}
