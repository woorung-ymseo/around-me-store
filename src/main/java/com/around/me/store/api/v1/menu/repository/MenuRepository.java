package com.around.me.store.api.v1.menu.repository;

import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.enums.common.YnEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<MenuDetail, Long> {

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return :
	 */
	Optional<List<MenuDetail>> findAllByStoreNoAndUseYn(long storeNo, YnEnum useYn);


	/**
	 * @param useYn
	 * @param menuNm
	 * @return
	 */
	Optional<List<MenuDetail>> findAllByUseYnAndMenuNameContaining(YnEnum useYn, String menuNm);
}
