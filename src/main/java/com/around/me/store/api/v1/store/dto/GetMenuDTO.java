package com.around.me.store.api.v1.store.dto;

import javax.validation.constraints.NotBlank;

import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.support.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.Example;
import lombok.Getter;

@Getter
public class GetMenuDTO {

	@ApiModelProperty(value="점포번호", required=true)
	@NotBlank(message = "점포번호는 필수 값입니다.")
	long   storeNo;

	@ApiModelProperty(value="사용 여부", example="Y")
	YnEnum useYn = YnEnum.Y;

	@ApiModelProperty(value="이미지구분")
	ImageSortEnum imageSort = ImageSortEnum.MENU;
}
