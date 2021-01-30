package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wonho
 * @name   점포키워드
 *
 */
@Table(name = "store_keyword")
@Entity
@Getter
public class StoreKeyword {

	@Id
	@GeneratedValue
	@Setter
	private long storeKeywordNo;

	@Setter
	private long storeKeywordManageNo;

	@Setter
	private Long storeNo;

	@Setter
	private String useYn;

    private LocalDateTime regDatetime;

    private LocalDateTime modDatetime;

    private Long regUserNo;

    private Long modUserNo;
}
