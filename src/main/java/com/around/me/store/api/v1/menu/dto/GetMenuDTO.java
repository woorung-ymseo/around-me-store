package com.around.me.store.api.v1.menu.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import com.around.me.store.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class GetMenuDTO {

	@ApiModelProperty(value="점포번호", example = "1", required=true)
	@Max(20)
	long   storeNo;

	@ApiModelProperty(value="사용 여부", example="Y")
	YnEnum useYn = YnEnum.Y;
}
