package com.around.me.store.api.v1.wishlist.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
	
	/**
	 * 점포 찜여부
	 * @param long storeNo, long userNo
	 * @return Optional<Wishlist>
	 */
	Optional<Wishlist> findByStoreNoAndUserNo(long storeNo, long userNo);
	
}
