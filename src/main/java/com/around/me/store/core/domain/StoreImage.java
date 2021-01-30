package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wonho
 * @name   점포
 *
 */
@Table(name = "store_image")
@Entity
@Getter
public class StoreImage {

	@Id
	@ApiModelProperty(value="점포이미지번호")
	@Setter
	private Long storeImageNo;

	@ApiModelProperty(value="점포번호")
	@Setter
	private Long storeNo;

	@ApiModelProperty(value="대표이미지여부")
	@Setter
	@Enumerated(EnumType.STRING)
	private YnEnum representationYn;

	@ApiModelProperty(value="이미지구분")
	@Setter
	@Enumerated(EnumType.STRING)
	private ImageSortEnum imageSort;

	@ApiModelProperty(value="삭제여부")
	@Setter
	@Enumerated(EnumType.STRING)
	private YnEnum deleteYn;

	@ApiModelProperty(value="정렬번호")
	@Setter
	private int orderNo;

	@ApiModelProperty(value="등록일시")
	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "Asia/Seoul") 
	private LocalDateTime regDatetime;

	@ApiModelProperty(value="수정일시")
	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "Asia/Seoul") 
	private LocalDateTime modDatetime;

	@ApiModelProperty(value="등록자", hidden = true)
	@Setter
	private Long regUserNo;

	@ApiModelProperty(value="수정자", hidden = true)
	@Setter
	private Long modUserNo;
}
