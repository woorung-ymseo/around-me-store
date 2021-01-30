package com.around.me.store.core.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author wonho
 * @name   점포
 *
 */
@Table(name = "store_type")
@Entity
@Getter
public class StoreType {

	@Id
	@GeneratedValue
	private long storeNo;

	private String storeCode;

	private String storeName;

	private String latitude;

	private String longitude;

	private String storeDescription;

	private String useInformatioSn;

	private String telNo;

	private String zipCode;

	private String loadNameAddress;

	private String zoneNoAddress;

	private String detailAddress;

	private Long areaNo;

	private Long ceoUserNo;

	private String businessNo;

	private String closedYn;

	private LocalDateTime foundingDate;

    private LocalDateTime regDatetime;

    private LocalDateTime modDatetime;

    private Long regUserNo;

    private Long modUserNo;
}
