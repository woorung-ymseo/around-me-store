package com.around.me.store.api.v1.menu.service;

import com.around.me.store.api.v1.menu.dto.GetMenuDTO;
import com.around.me.store.api.v1.menu.repository.MenuRepository;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.MenuType;
import com.around.me.store.core.enums.common.YnEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuService {

	private final MenuRepository menuRepository;

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuDTO
	 * @return : List<Menu>
	 */
	public List<MenuType> getStoreMenus(GetMenuDTO getMenuDTO) {
		Optional<List<MenuType>> menus = menuRepository.findAllByStoreNoAndUseYn(getMenuDTO.getStoreNo(), YnEnum.Y);

		return menus.orElse(null);
	}

	/**
	 * @param menuNm
	 * @return
	 */
	public List<MenuType> getMenus(String menuNm) {
		Optional<List<MenuType>> menus = menuRepository.findAllByUseYnAndMenuNameContaining(YnEnum.Y, menuNm);//--수정 몇글자 조회가능한지

		return menus.orElse(null);
	}
}
