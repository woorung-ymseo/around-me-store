package com.around.me.store.api.v1.menu.controller;

import com.around.me.store.api.v1.menu.dto.GetMenuDTO;
import com.around.me.store.api.v1.menu.service.MenuService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.MenuDetail;
import com.around.me.store.core.domain.MenuType;
import com.around.me.store.core.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

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

	@ApiOperation(value = "점포 메뉴 조회")
	@GetMapping(value = "/store/menus")
	Response<List<MenuType>> getStoreMenus(@Valid GetMenuDTO getMenuDTO) {

		List<MenuType> menus = menuService.getStoreMenus(getMenuDTO);

		return Response.ok(menus);
	}

    /**
     * 메뉴 검색
     * @return Response<List<MenuDetail>>
     */
    @ApiOperation(value = "메뉴 검색")
    @GetMapping(value = "/stores/menus/{menuNm}")
    Response<List<MenuType>> getMenus(@ApiParam(value = "메뉴명", required = true, example = "아메리카노") @PathVariable String menuNm) {

    	List<MenuType> menus = menuService.getMenus(menuNm);

    	return Response.ok(menus);
    }
}