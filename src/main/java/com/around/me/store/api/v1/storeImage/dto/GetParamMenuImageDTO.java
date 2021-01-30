package com.around.me.store.api.v1.storeImage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class GetParamMenuImageDTO {

	@ApiModelProperty(value="점포번호", required = true, example = "1")
	@Max(20)
	public Long storeNo;
}