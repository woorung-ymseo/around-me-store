package com.around.me.store.api.v1.menu.service;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.around.me.store.core.enums.common.ImageSortEnum;
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

		// 신원호: DTO 필요한 데이터 세팅
		Optional<List<StoreImage>> menuImages = menuRepository.findByStoreNoAndImageSort(getMenuImageDTO.getStoreNo(), ImageSortEnum.MENU);

		return menuImages.orElse(null);
	}

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuDTO
	 * @return : List<Menu>
	 */
	public List<Menu> getStoreMenus(GetMenuDTO getMenuDTO) {
		Optional<List<Menu>> menus = menuRepository.findAllByStoreNoAndUseYn(getMenuDTO.getStoreNo(), YnEnum.Y);

		return menus.orElse(null);
	}


	/**
	 * @param menuNm
	 * @return
	 */
	public List<MenuDetail> getMenus(String menuNm) {
		Optional<List<MenuDetail>> menus = menuRepository.findAllByUseYnAndMenuNameContaining(YnEnum.Y, menuNm);//--수정 몇글자 조회가능한지

		return menus.orElse(null);
	}

}
