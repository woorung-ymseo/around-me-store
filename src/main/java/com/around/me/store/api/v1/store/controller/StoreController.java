package com.around.me.store.api.v1.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.service.StoreService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.Store;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Store 관련 API Controller
 */
@Api(tags = "점포")
@Slf4j
@RequiredArgsConstructor
@RestMappingV1
public class StoreController {

	// 점포서비스
	private final StoreService storeService;

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
	
	/**
     * 점포 리스트 조회
     * @return Response<List<Store>>
     */
    @ApiOperation(value = "점포 리스트 조회")
    @GetMapping(value = "/stores")
    Response<List<Store>> getStores() {

        List<Store> stores = storeService.getStores();

        return Response.ok(stores);
    }

}