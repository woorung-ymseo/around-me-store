package com.around.me.store.api.v1.store.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Setter;

@Setter
public class GetParamEventDTO {

	@ApiModelProperty(value="점포번호")
	private Long storeNo;
}
