package com.around.me.store.api.v1.storeOpeningTime.controller;

import java.awt.Menu;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;

import com.around.me.store.api.v1.storeOpeningTime.dto.GetParamOpeningTimesDTO;
import com.around.me.store.api.v1.storeOpeningTime.service.StoreOpeningTimeService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestMappingV1
public class StoreOpeningTimeController {

	private final StoreOpeningTimeService storeOpeningTimeService;

	@ApiOperation(value = "점포 영업시간 조회")
	@GetMapping(value = "/store/opening/times")
	Response<List<Menu>> openingTimes(@Valid GetParamOpeningTimesDTO getOpeningTimesDTO) {

		List<Menu> menus = storeOpeningTimeService.getOpeningTimes(getMenuDTO);

		if (menus == null) {
			return Response.badRequest(null);

		} else {
			return Response.ok(menus);
		}
	}
}