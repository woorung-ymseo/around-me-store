package com.around.me.store.api.v1.storeKeyword.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class GetMenuImageDTO {

	@ApiModelProperty(value="점포번호")
	@NotBlank(message = "점포번호는 필수 값입니다.")
	long   storeNo;
}
