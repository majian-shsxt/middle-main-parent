package com.firsttech.entity;

import lombok.Data;

import java.util.Date;

/**
 * * Licensed to CMIM,Inc. under the terms of the CMIM
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date           Author               Version        Comments
 * 2021/8/12       Ma Jian              1.0          Initial Version
 *
 */
@Data
public class MsgBody {

	private String name ;
	private String desc ;
	private Date createTime ;

}