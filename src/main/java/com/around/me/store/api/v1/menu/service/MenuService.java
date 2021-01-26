package com.around.me.store.api.v1.menu.service;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.menu.repository.MenuRepository;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.api.v1.menu.dto.GetMenuDTO;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.YnEnum;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {

	private final MenuRepository menuRepository;

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @Return : List<StoreImage>
	 */
	public List<StoreImage> getMenuImages(@Valid GetMenuImageDTO getMenuImageDTO) {
		//Optional<List<StoreImage>> menuImages = menuRepository.findbyDeleteYnAndStoreNoAndImageSort(getMenuImageDTO);

		Optional<List<StoreImage>> menuImages=null;//--수정
		
		return menuImages.orElse(null);
	}

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuDTO
	 * @return : List<Menu>
	 */
	public List<Menu> getStoreMenus(@Valid GetMenuDTO getMenuDTO) {
		//Optional<List<Menu>> menus = menuRepository.findAllByStoreNoAndUseYn(getMenuDTO);

		Optional<List<Menu>> menus=null;//--수정
		
		return menus.orElse(null);
	}

	/**
	 * 메뉴 검색
	 * @param String menuNm
	 * @return List<MenuDetail>
	 */
	public List<MenuDetail> getMenus(String menuNm) {
		Optional<List<MenuDetail>> menus = menuRepository.findAllByUseYnAndMenuNameContaining(YnEnum.Y, menuNm);//--수정 몇글자 조회가능한지

		return menus.orElse(null);
	}

}
