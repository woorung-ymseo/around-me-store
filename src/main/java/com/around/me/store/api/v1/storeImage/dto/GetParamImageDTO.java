package com.around.me.store.api.v1.storeImage.dto;

import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class GetParamImageDTO {

	@ApiModelProperty(value="점포번호", required = true, example = "1")
	@Max(20)
	@NotNull(message = "점포번호는 필수 값입니다.")
	long   storeNo;

	@ApiModelProperty(value="이미지구분", required = true, example = "MU")
	@NotNull(message = "이미지구분은 필수 값입니다.")
	ImageSortEnum imageSort;

	@ApiModelProperty(value="대표이미지여부", required = true, example = "Y")
	@NotNull(message = "대표이미지여부는 필수 값입니다.")
	YnEnum representationYn;
}
