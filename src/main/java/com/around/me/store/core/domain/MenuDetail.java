package com.around.me.store.core.domain;

import com.around.me.store.core.enums.common.YnEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author wonho
 * @name   메뉴 상세
 *
 */
@Table(name = "menu_detail")
@Entity
@Getter
public class MenuDetail {

	@Id
	@GeneratedValue
	private long menuNo;

	@ManyToOne
	@JoinColumn(name = "menu_type_no")
	private MenuType menuType;

	private long storeNo;

	private String menuName;

	private String menuDescription;

	private int price;

	@Enumerated(EnumType.STRING)
	private YnEnum useYn;

	@Enumerated(EnumType.STRING)
	private YnEnum recommendYn;

	@Enumerated(EnumType.STRING)
	private YnEnum newMenuYn;

	@Enumerated(EnumType.STRING)
	private YnEnum soldOutYn;

	private Integer orderNo;

	@DateTimeFormat(pattern = "yyyyMMddHHmmss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime regDatetime;

    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime modDatetime;

    private Long regUserNo;

    private Long modUserNo;
}