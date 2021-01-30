package com.around.me.store.core.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.around.me.store.core.enums.common.YnEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author wonho
 * @name   점포
 *
 */
@Table(name = "store")
@Entity
@Getter
public class Store {

	@Id
	@GeneratedValue
	private long storeNo;

	private String storeCode;

	private String storeName;

	private String latitude;

	private String longitude;

	private String storeDescription;

	private String useInformation;

	private String telNo;

	private String zipCode;

	private String loadNameAddress;

	private String zoneNoAddress;

	private String detailAddress;

	private Long areaNo;

	private Long ceoUserNo;

	private String businessNo;

	@Enumerated(EnumType.STRING)
	private YnEnum closedYn;

	private LocalDateTime foundingDate;

	@DateTimeFormat(pattern = "yyyyMMddHHmmss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime regDatetime;

    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime modDatetime;

    private Long regUserNo;

    private Long modUserNo;
}
