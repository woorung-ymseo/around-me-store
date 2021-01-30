package com.around.me.store.api.v1.menu.dto;

import com.around.me.store.core.enums.common.YnEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GetParamMenuDTO {

	@ApiModelProperty(value="점포번호", example = "1", required = true)
	@NotNull
	private Long   storeNo;

	@ApiModelProperty(value="사용 여부", example = "Y")
	private YnEnum useYn = YnEnum.Y;
}
