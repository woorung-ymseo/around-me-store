package com.around.me.store.api.v1.menu.repository;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import com.around.me.store.core.enums.common.ImageSortEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.YnEnum;

public interface MenuRepository extends JpaRepository<MenuDetail, Long> {

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return :
	 */
	Optional<List<Menu>> findAllByStoreNoAndUseYn(long storeNo, YnEnum useYn);//--수정


	/**
	 * @param useYn
	 * @param menuNm
	 * @return
	 */
	Optional<List<MenuDetail>> findAllByUseYnAndMenuNameContaining(YnEnum useYn, String menuNm);


	/**
	 * @param storeNo
	 * @param menu
	 * @return
	 */
	Optional<List<StoreImage>> findByStoreNoAndImageSort(long storeNo, ImageSortEnum menu);
}
