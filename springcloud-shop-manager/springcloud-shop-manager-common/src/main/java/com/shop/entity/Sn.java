package com.shop.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sn {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Long lastvalue;

    private Integer type;
}