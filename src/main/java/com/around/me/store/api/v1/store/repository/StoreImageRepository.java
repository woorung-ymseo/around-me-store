package com.around.me.store.api.v1.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.YnEnum;

public interface StoreImageRepository extends JpaRepository<StoreImage, Long> {

	/**
	 * 점포 이미지 리스트 조회
	 * @param long storeNo, YnEnum deleteYn
	 * @return Optional<List<StoreImage>>
	 */
	Optional<List<StoreImage>> findAllByStoreNoAndDeleteYn(long storeNo, YnEnum deleteYn);
	
}
