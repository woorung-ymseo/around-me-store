package com.around.me.store.api.v1.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.Store;
import com.around.me.store.core.enums.common.YnEnum;

public interface StoreRepository extends JpaRepository<Store, Long> {

	/**
	 * 점포 리스트 조회
	 * @param YnEnum useYn
	 * @return Optional<List<Store>>
	 */
	Optional<List<Store>> findAllByClosedYn(YnEnum closedYn);
	
	/**
	 * 점포 정보 조회
	 * @param long StoreNo, YnEnum closedYn
	 * @return Optional<Store>
	 */
	Optional<Store> findByStoreNoAndClosedYn(long StoreNo, YnEnum closedYn);
}
