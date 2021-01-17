package com.around.me.store.api.v1.storeOpeningTime.dto;

import com.around.me.store.core.enums.common.TimeEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetParamOpeningTimesDTO {

	@ApiModelProperty(value="점포번호")
	private Long storeNo;

	@ApiModelProperty(value="시간 타입")
	private TimeEnum timeType;

//	@ApiModelProperty(value="요일")
//	private String day;
//
//	@ApiModelProperty(value="시간 타입")
//	private TimeEnum timeType;
//
//	@ApiModelProperty(value="부가정보")
//	private String additionalInfomation;
//
//	@ApiModelProperty(value="시작 시")
//	private String startHour;
//
//	@ApiModelProperty(value="종료 시")
//	private String endHour;
//
//	@ApiModelProperty(value="시작 분")
//	private String startMinute;
//
//	@ApiModelProperty(value="종료 분")
//	private String endMinute;
//
//	@ApiModelProperty(value="정렬번호")
//	private int orderNo;
}
