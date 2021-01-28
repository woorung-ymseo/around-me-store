package com.around.me.store.api.v1.menu.controller;

import java.awt.Menu;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.around.me.store.api.v1.menu.dto.GetMenuDTO;
import com.around.me.store.api.v1.menu.service.MenuService;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Menu 관련 API Controller
 */
@Api(tags = "메뉴")
@Slf4j
@RequiredArgsConstructor
@RestMappingV1
public class MenuController {

	// 메뉴서비스
	private final MenuService menuService;

	@ApiOperation(value = "메뉴판이미지 조회")
	@GetMapping(value = "/store/menu-images")
	Response<List<StoreImage>> getMenuImages(@Valid GetMenuImageDTO getMenuImageDTO) {

		// 범용적으로 쓸 수 있게 서비스 명을 바꿔라...
		// 업무별로 패키지 구성
		List<StoreImage> menuImages = menuService.getMenuImages(getMenuImageDTO);

    		return Response.ok(menuImages);
	}

	@ApiOperation(value = "점포 메뉴 조회")
	@GetMapping(value = "/store/menus")
	Response<List<Menu>> getStoreMenus(@Valid GetMenuDTO getMenuDTO) {//--수정 Menu-->MenuDetail

		List<Menu> menus = menuService.getStoreMenus(getMenuDTO);

		return Response.ok(menus);
	}

    /**
     * 메뉴 검색
     * @return Response<List<MenuDetail>>
     */
    @ApiOperation(value = "메뉴 검색")
    @GetMapping(value = "/stores/menus/{menuNm}")
    Response<List<MenuDetail>> getMenus(@ApiParam(value = "메뉴명", required = true, example = "아메리카노") @PathVariable String menuNm) {

    	List<MenuDetail> menus = menuService.getMenus(menuNm);

    	return Response.ok(menus);
    }
}