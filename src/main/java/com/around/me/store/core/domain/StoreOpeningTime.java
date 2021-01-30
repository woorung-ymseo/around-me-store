package com.around.me.store.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Table(name = "store_opening_time")
@Entity
@Getter
public class StoreOpeningTime {

	@Id
	@GeneratedValue
	private long storeOpeningNo;
	
	private long storeNo;

	private String day;
	
	private String timeType;
	
	private String additionalInfomation;
	
	private String startHour;
	
	private String endHour;
	
	private String startMinute;
	
	private int orderNo;
	
	private String endMinute;
	
	private String regDatetime;
	
	private String modDatetime;
	
	private long regUserNo;
	
	private long mod_UserNo;
}
