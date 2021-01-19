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

@Table(name = "storeKeywordManage")
@Entity
@Getter
public class StoreKeywordManage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value="점포 키워드 관리 번호")
	@Setter
	private long storeKeywordManageNo;

	@ApiModelProperty(value="점포 키워드 관리 명")
	@Setter
	private String storeKeywordManageName;

	@ApiModelProperty(value="사용 여부")
	@Setter
	@Enumerated(EnumType.STRING)
    private YnEnum useYn;

	@ApiModelProperty(value="등록일시")
	@Setter
	private LocalDateTime regDatetime;

	@ApiModelProperty(value="수정일시")
	@Setter
	private LocalDateTime modDatetime;

	@ApiModelProperty(value="등록자")
	@Setter
	private long regUserNo;

	@ApiModelProperty(value="수정자")
	@Setter
	private long modUserNo;
}
