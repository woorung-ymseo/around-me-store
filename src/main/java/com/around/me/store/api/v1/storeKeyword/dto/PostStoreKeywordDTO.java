package com.around.me.store.api.v1.storeKeyword.dto;

import com.around.me.store.core.enums.common.YnEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class PostStoreKeywordDTO {

	@ApiModelProperty(value="점포번호")
	@NotNull(message = "점포번호는 필수 값입니다.")
	Long   storeNo;

	@ApiModelProperty(value="사용여부")
	YnEnum useYn = YnEnum.Y;
}
