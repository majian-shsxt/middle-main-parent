package com.firsttech.config;

import org.springframework.stereotype.Component;

/**
 * * Licensed to CMIM,Inc. under the terms of the CMIM
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date           Author               Version        Comments
 * 2021/8/11       Ma Jian              1.0          Initial Version
 *
 */

@Component
public class RedisLock {

	private static String keyPrefix = "RedisLock:";


	public boolean addLock(String key, long expire) {


		return true;
	}






}