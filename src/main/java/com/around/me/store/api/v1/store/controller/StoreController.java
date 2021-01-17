package com.around.me.store.api.v1.store.controller;

import java.awt.Menu;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetMenuDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.service.StoreService;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestMappingV1
public class StoreController {

	// 점포서비스
	private final StoreService storeService;

	@ApiOperation(value = "메뉴판정보 조회")
	@GetMapping(value = "/store/menu-images")
	Response<List<StoreImage>> menuImages(@Valid GetMenuImageDTO getMenuImageDTO) {
		List<StoreImage> menuImages = storeService.getMenuImages(getMenuImageDTO);

		if (menuImages == null) {
    		return Response.badRequest(null);

    	} else {
    		return Response.ok(menuImages);
    	}

	}

	@ApiOperation(value = "점포 이벤트 조회")
	@GetMapping(value = "/store/{storeNo}/events")
	Response<List<EventDTO>> events(@PathVariable Long storeNo) {

		// 1. 조회조건
		GetParamEventDTO getParamEventDTO = new GetParamEventDTO();

		getParamEventDTO.setStoreNo(storeNo);

		// 2. 조회
		List<EventDTO> events = storeService.getEvents(getParamEventDTO);

		if (events == null) {
			return Response.badRequest(null);

		} else {
			return Response.ok(events);
		}
	}

	@ApiOperation(value = "점포 메뉴 조회")
	@GetMapping(value = "/store/menus")
	Response<List<Menu>> menus(@Valid GetMenuDTO getMenuDTO) {

		List<Menu> menus = storeService.getMenus(getMenuDTO);

		if (menus == null) {
			return Response.badRequest(null);

		} else {
			return Response.ok(menus);
		}
	}

	@ApiOperation(value = "점포 영업시간 조회")
	@GetMapping(value = "/store/opening/times")
	Response<List<Menu>> openingTimes(@Valid GetOpeningTimesDTO getOpeningTimesDTO) {

		List<Menu> menus = storeService.getMenus(getMenuDTO);

		if (menus == null) {
			return Response.badRequest(null);

		} else {
			return Response.ok(menus);
		}
	}
}