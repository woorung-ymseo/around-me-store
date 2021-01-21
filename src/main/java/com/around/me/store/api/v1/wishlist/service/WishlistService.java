package com.around.me.store.api.v1.wishlist.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.wishlist.repository.WishlistRepository;
import com.around.me.store.core.domain.Wishlist;
import com.around.me.store.core.dto.Response;
import com.around.me.store.core.support.ResourceClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WishlistService {

	private final WishlistRepository wishlistRepository;
	
	private final ResourceClient resourceClient;
	
	/**
	 * 점포 찜여부
	 * @param long storeNo
	 * @return Wishlist
	 */
	public Wishlist getWishYn(@Valid long storeNo) {
		
		Optional<Wishlist> wishYn = wishlistRepository.findByStoreNoAndUserNo(storeNo, 1L);//--수정

		return wishYn.orElse(null);
	}
	
	/**
	 * 점포 찜하기
	 * @param long storeNo
	 * @return long
	 */
	public Response<Long> postWish(@Valid long storeNo) {
		
        Response<Long> data = resourceClient.getForResponse("http://127.0.0.1:8081/user/api/v1/", Long.class);//--수정

        return data;
    }
	
	/**
	 * 점포 찜취소
	 * @param long storeNo
	 * @return long
	 */
	public Response<Long> deleteWish(@Valid long storeNo) {
		
        Response<Long> data = resourceClient.getForResponse("http://127.0.0.1:8081/user/api/v1/", Long.class);//--수정

        return data;
    }

}
