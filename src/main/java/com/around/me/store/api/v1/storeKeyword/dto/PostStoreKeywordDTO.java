package com.around.me.store.api.v1.storeKeyword.dto;

import javax.validation.constraints.NotBlank;

import com.around.me.support.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class PostStoreKeywordDTO {

	@ApiModelProperty(value="점포번호")
	@NotBlank(message = "점포번호는 필수 값입니다.")
	long   storeNo;

	@ApiModelProperty(value="사용여부")
	YnEnum userYn = YnEnum.Y;
}
