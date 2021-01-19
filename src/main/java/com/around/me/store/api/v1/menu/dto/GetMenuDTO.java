package com.around.me.store.api.v1.menu.dto;

import javax.validation.constraints.NotBlank;

import com.around.me.store.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class GetMenuDTO {

	@ApiModelProperty(value="점포번호", required=true)
	@NotBlank(message = "점포번호는 필수 값입니다.")
	long   storeNo;

	@ApiModelProperty(value="사용 여부", example="Y")
	YnEnum useYn = YnEnum.Y;
}
