package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.around.me.support.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author wonho
 * @name   메뉴 상세
 *
 */
@Table(name = "menuDetail")
@Entity
@Getter
public class MenuDetail {

	@ApiModelProperty(value="메뉴번호")
	@Id
	@GeneratedValue
	private long menuNo;

	@ApiModelProperty(value="메뉴 타입 번호")
	private long menuTypeNo;

	@ApiModelProperty(value="점포번호")
	private long storeNo;

	@ApiModelProperty(value="메뉴명")
	private String menuName;

	@ApiModelProperty(value="메뉴설명")
	private String menuDescription;

	@ApiModelProperty(value="가격")
	private int price;

	@ApiModelProperty(value="사용 여부")
	private YnEnum useYn;

	@ApiModelProperty(value="추천 여부")
	private YnEnum recommendYn;

	@ApiModelProperty(value="신메뉴 여부")
	private YnEnum newMenuYn;

	@ApiModelProperty(value="품절 여부")
	private YnEnum soldOutYn;

	@ApiModelProperty(value="정렬번호")
	private int orderNo;

	@ApiModelProperty(value="등록일시")
    private LocalDateTime regDatetime;

    @ApiModelProperty(value="수정일시")
    private LocalDateTime modDatetime;

    @ApiModelProperty(value="등록자")
    private Long regUserNo;

    @ApiModelProperty(value="수정자")
    private Long modUserNo;
}