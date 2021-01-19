package com.around.me.store.api.v1.menu.repository;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.api.v1.menu.dto.GetMenuDTO;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;

public interface MenuRepository extends JpaRepository<MenuDetail, Long> {
	
	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return : Optional<List<StoreImage>>
	 */
	Optional<List<StoreImage>> findbyDeleteYnAndStoreNoAndImageSort(YnEnum deleteYn,ImageSortEnum imageSort);//--수정(GetMenuImageDTO)

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return :
	 */
	Optional<List<Menu>> findAllByStoreNoAndUseYn(long storeNo, YnEnum useYn);//--수정(GetMenuDTO)
	
	/**
	 * 메뉴 검색
	 * @param String menuNm
	 * @return Optional<List<Menu>>
	 */
	Optional<List<Menu>> findAllByUseYnAndMenuName(YnEnum useYn, String menuNm);
	
}
