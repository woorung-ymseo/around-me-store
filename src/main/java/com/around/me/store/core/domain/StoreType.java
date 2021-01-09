package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author wonho
 * @name   점포
 *
 */
@Table(name = "storeType")
@Entity
@Getter
public class StoreType {

	@ApiModelProperty(value="점포번호")
	@Id
	@GeneratedValue
	private long storeNo;

	@ApiModelProperty(value="점포코드")
	private String storeCode;

	@ApiModelProperty(value="점포 명")
	private String storeName;

	@ApiModelProperty(value="위도")
	private String latitude;

	@ApiModelProperty(value="경도")
	private String longitude;

	@ApiModelProperty(value="점포설명")
	private String storeDescription;

	@ApiModelProperty(value="이용안내")
	private String useInformatioSn;

	@ApiModelProperty(value="전화번호")
	private String telNo;

	@ApiModelProperty(value="우편번호")
	private String zipCode;

	@ApiModelProperty(value="도로명주소")
	private String loadNameAddress;

	@ApiModelProperty(value="지번주소")
	private String zoneNoAddress;

	@ApiModelProperty(value="상세주소")
	private String detailAddress;

	@ApiModelProperty(value="지역번호")
	private Long areaNo;

	@ApiModelProperty(value="점주회원번호")
	@OneToMany
	private Long ceoUserNo;

	@ApiModelProperty(value="사업자번호")
	private String businessNo;

	@ApiModelProperty(value="폐업여부")
	private String closedYn;

	@ApiModelProperty(value="개업일")
	private LocalDateTime foundingDate;

	@ApiModelProperty(value="등록일시")
    private LocalDateTime regDatetime;

    @ApiModelProperty(value="수정일시")
    private LocalDateTime modDatetime;

    @ApiModelProperty(value="등록자")
    private Long regUserNo;

    @ApiModelProperty(value="수정자")
    private Long modUserNo;
}
