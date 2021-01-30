package com.around.me.store.core.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.around.me.store.core.enums.common.YnEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * @author wonho
 * @name   메뉴 타입
 *
 */
@Table(name = "menu_type")
@Entity
@Getter
public class MenuType {

	@Id
	@GeneratedValue
	private Long menuTypeNo;

	private String menuTypeName;

	private YnEnum useYn;

	private int orderNo;

    private LocalDateTime regDatetime;

    private LocalDateTime modDatetime;

    private Long regUserNo;

    private Long modUserNo;

	@OneToMany(mappedBy = "menuType")
	@JsonIgnore
	private List<MenuDetail> menuDetail = new ArrayList<>();
}