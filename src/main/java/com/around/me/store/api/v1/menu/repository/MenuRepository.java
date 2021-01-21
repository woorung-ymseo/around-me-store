package com.around.me.store.api.v1.menu.repository;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.YnEnum;

public interface MenuRepository extends JpaRepository<MenuDetail, Long> {
	
	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return : Optional<List<StoreImage>>
	 */
	//Optional<List<StoreImage>> findbyDeleteYnAndStoreNoAndImageSort(GetMenuImageDTO getMenuImageDTO);//--수정

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return :
	 */
	//Optional<List<Menu>> findAllByStoreNoAndUseYn(GetMenuImageDTO getMenuImageDTO);//--수정
	
	/**
	 * 메뉴 검색
	 * @param String menuNm
	 * @return Optional<List<MenuDetail>>
	 */
	Optional<List<MenuDetail>> findAllByUseYnAndMenuNameContaining(YnEnum useYn, String menuNm);
	
}
