package com.stackroute.newz.test.model;

import java.time.LocalDateTime;

import org.meanbean.lang.Factory;

@SuppressWarnings("PMD")
public class LocalDateTimeFactory implements Factory<LocalDateTime> {
	@Override
	public LocalDateTime create() {
		return LocalDateTime.now();
	}
}
