package com.around.me.store.api.v1.storeKeyword.dto;

import javax.validation.constraints.NotBlank;

import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class GetMenuImageDTO {

	@ApiModelProperty(value="점포번호")
	@NotBlank(message = "점포번호는 필수 값입니다.")
	long   storeNo;

	@ApiModelProperty(value="삭제여부")
	YnEnum deleteYn = YnEnum.Y;

	@ApiModelProperty(value="이미지구분")
	ImageSortEnum imageSort = ImageSortEnum.MENU;
}
