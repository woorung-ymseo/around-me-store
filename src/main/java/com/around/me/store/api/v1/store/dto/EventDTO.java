package com.around.me.store.api.v1.store.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class EventDTO {

	@ApiModelProperty(value="이벤트번호")
	private Long eventNo;

	@ApiModelProperty(value="이벤트 명")
	private String eventName;

	@ApiModelProperty(value="점포번호")
	private Long storeNo;

	@ApiModelProperty(value="시작 일자")
	private LocalDateTime startDate;

	@ApiModelProperty(value="종료 일자")
	private LocalDateTime endDate;

	@ApiModelProperty(value="시작 시")
	private String startHour;

	@ApiModelProperty(value="시작 분")
	private String startMinute;

	@ApiModelProperty(value="종료 시")
	private String endHour;

	@ApiModelProperty(value="종료 분")
	private String endMinute;

	@ApiModelProperty(value="이벤트 내용")
	private String eventContent;
}
