package com.around.me.store.api.v1.store.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;

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

	    return Response.ok(menuImages);
	}
}