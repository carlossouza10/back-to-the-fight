package com.crafaelsouza.backtothefight.domain.model;

import java.util.List;

public class ValidatorUtil {
	
	public static void validateRangeValueAttribute(double attribute, double minValue, double maxValue, String attributeName) {
		if (attribute < minValue) {
			throw new IllegalArgumentException(String.format("%s cannot be less then %s", attributeName, minValue));
		}
		
		if (attribute > maxValue) {
			throw new IllegalArgumentException(String.format("%s cannot be greater then %s", attributeName, maxValue));	
		}
	}
	
	public static void validateRangeValueAttribute(int attribute, int minValue, int maxValue, String attributeName) {
		if (attribute < minValue) {
			throw new IllegalArgumentException(String.format("%s cannot be less then %s", attributeName, minValue));
		}
		
		if (attribute > maxValue) {
			throw new IllegalArgumentException(String.format("%s cannot be greater then %s", attributeName, maxValue));	
		}
	}

	public static void validateNullOrEmptyValue(String attribute, String attributeName) {
		if (attribute == null || attribute.isEmpty()) {
			throw new IllegalArgumentException(String.format("Field '%s'  cannot be null or empty",  attributeName));
		}
	}
	
	public static void validateNullObject(Object object, String attributeName) {
		if (object == null) {
			throw new IllegalArgumentException(String.format("Field '%s'  cannot be null or empty", attributeName));
		}
	}
	
	public static void validateNullorEmptyList(List<?> list, String attributeName) {
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException(String.format("Field '%s'  cannot be null or empty", attributeName));
		}
	}
}