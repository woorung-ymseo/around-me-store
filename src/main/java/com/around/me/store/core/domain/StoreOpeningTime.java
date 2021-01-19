package com.around.me.store.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Table(name = "StoreOpeningTime")
@Entity
@Getter
public class StoreOpeningTime {

	@Id
	@GeneratedValue
	@ApiModelProperty(value="점포 영업시간 번호")
	private long storeOpeningNo;
	
	@ApiModelProperty(value="점포번호")
	private long storeNo;

	@ApiModelProperty(value="요일")
	private String day;
	
	@ApiModelProperty(value="시간 타입")
	private String timeType;
	
	@ApiModelProperty(value="부가정보")
	private String additionalInfomation;
	
	@ApiModelProperty(value="시작 시")
	private String startHour;
	
	@ApiModelProperty(value="종료 시")
	private String endHour;
	
	@ApiModelProperty(value="시작 분")
	private String startMinute;
	
	@ApiModelProperty(value="정렬번호")
	private int orderNo;
	
	@ApiModelProperty(value="종료 분")
	private String endMinute;
	
	@ApiModelProperty(value="등록일시")
	private String regDatetime;
	
	@ApiModelProperty(value="수정일시")
	private String modDatetime;
	
	@ApiModelProperty(value="등록자")
	private long regUserNo;
	
	@ApiModelProperty(value="수정자")
	private long mod_UserNo;
	
}
