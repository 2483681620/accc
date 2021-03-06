package com.shop.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Users {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Boolean isenabled;

    private Boolean islocked;

    private Date lastlogindate;

    private String lastloginip;

    private Date lockdate;
}