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
@Table(name = "storeKeyword")
@Entity
@Getter
public class StoreKeyword {
	
	@Id
	@GeneratedValue
	@ApiModelProperty(value="점포 키워드 번호")
	@Setter
	private long storeKeywordNo;
	
	@ApiModelProperty(value="점포 키워드 관리 번호")
	@Setter
	private long storeKeywordManageNo;
	
	@ApiModelProperty(value="점포 번호")
	@Setter
	private long storeNo;
	
	@ApiModelProperty(value="사용여부")
	@Setter
	private String useYn;
	
	 @ApiModelProperty(value="등록일시")
    private LocalDateTime regDatetime;

    @ApiModelProperty(value="수정일시")
    private LocalDateTime modDatetime;

    @ApiModelProperty(value="등록자")
    private Long regUserNo;

    @ApiModelProperty(value="수정자")
    private Long modUserNo;
}
