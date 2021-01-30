package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.around.me.store.core.enums.common.YnEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Table(name = "store_keyword_manage")
@Entity
@Getter
public class StoreKeywordManage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	private long storeKeywordManageNo;

	@Setter
	private String storeKeywordManageName;

	@Setter
	@Enumerated(EnumType.STRING)
    private YnEnum useYn;

	@Setter
	private LocalDateTime regDatetime;

	@Setter
	private LocalDateTime modDatetime;

	@Setter
	private long regUserNo;

	@Setter
	private long modUserNo;
}
