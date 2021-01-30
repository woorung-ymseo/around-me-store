package com.around.me.store.core.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.around.me.store.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author wonho
 * @name   메뉴 타입
 *
 */
@Table(name = "menu_type")
@Entity
@Getter
public class MenuType {

	@ApiModelProperty(value="메뉴 타입 번호")
	@Id
	@GeneratedValue
	private Long menuTypeNo;

	@ApiModelProperty(value="메뉴타입명")
	private String menuTypeName;

	@ApiModelProperty(value="사용 여부")
	private YnEnum useYn;

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

	@ApiModelProperty(value="메뉴 타입")
	@OneToMany(mappedBy = "MenuType")
	private List<MenuDetail> menuDetail = new ArrayList<>();
}