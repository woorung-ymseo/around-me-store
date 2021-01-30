package com.around.me.store.api.v1.wishlist.controller;

import com.around.me.store.api.v1.wishlist.service.WishlistService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.Wishlist;
import com.around.me.store.core.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Wishlist 관련 API Controller
 */
@Api(tags = "찜")
@Slf4j
@RequiredArgsConstructor
@RestMappingV1
public class WishlistController {

	// 찜서비스
	private final WishlistService wishlistService;

    /**
     * 점포 찜여부
     * @return Wishlist
     */
    @ApiOperation(value = "점포 찜여부")
    @GetMapping(value = "/store/{storeNo}/wish")
    Response<Wishlist> getWishYn(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

    	Wishlist wishlist = wishlistService.getWishYn(storeNo);

    	return Response.ok(wishlist);
    }
    
    /**
     * 점포 찜하기
     * @return Long
     */
    @ApiOperation(value = "점포 찜하기")
    @PostMapping(value = "/store/{storeNo}/wish")
    Response<Long> postWish(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

    	Long resultStoreNo = wishlistService.postWish(storeNo).getContent();

    	return Response.ok(resultStoreNo);
    }
    
    /**
     * 점포 찜취소
     * @return Long
     */
    @ApiOperation(value = "점포 찜취소")
    @DeleteMapping(value = "/store/{storeNo}/wish")
    Response<Long> deleteWish(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

    	Long resultStoreNo = wishlistService.deleteWish(storeNo).getContent();

    	return Response.ok(resultStoreNo);
    }
}