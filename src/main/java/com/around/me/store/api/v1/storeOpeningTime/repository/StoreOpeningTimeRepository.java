package com.around.me.store.api.v1.storeOpeningTime.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.StoreOpeningTime;

public interface StoreOpeningTimeRepository extends JpaRepository<StoreOpeningTime, Long> {
	
	/**
	 * 점포 오픈시간 조회
	 * @param YnEnum long storeNo
	 * @return Optional<List<StoreOpeningTime>>
	 */
	//Optional<List<StoreOpeningTime>> findAllByStoreNo(StoreOpeningTime StoreOpeningTime);//--수정

}
