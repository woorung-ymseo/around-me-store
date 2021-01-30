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
	@Setter
	private Long storeImageNo;

	@Setter
	private Long storeNo;

	@Setter
	@Enumerated(EnumType.STRING)
	private YnEnum representationYn;

	@Setter
	@Enumerated(EnumType.STRING)
	private ImageSortEnum imageSort;

	@Setter
	@Enumerated(EnumType.STRING)
	private YnEnum deleteYn;

	@Setter
	private int orderNo;

	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "Asia/Seoul") 
	private LocalDateTime regDatetime;

	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "Asia/Seoul") 
	private LocalDateTime modDatetime;

	@Setter
	private Long regUserNo;

	@Setter
	private Long modUserNo;
}
