package com.around.me.store.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Table(name = "Wishlist")
@Entity
@Getter
public class Wishlist {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="찜 번호")
    private long wishlistNo;

    @ApiModelProperty(value="점포번호")
    private String storeNo;

    @ApiModelProperty(value="등록일시")
	@DateTimeFormat(pattern = "yyyyMMddHHmmss")
    private Long regDatetime;
    
    @ApiModelProperty(value="회원번호")
    private Long userNo;
}
