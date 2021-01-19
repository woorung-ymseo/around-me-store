package com.around.me.store.api.v1.storeOpeningTime.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;

import com.around.me.store.api.v1.storeOpeningTime.dto.GetParamOpeningTimesDTO;
import com.around.me.store.api.v1.storeOpeningTime.service.StoreOpeningTimeService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.StoreOpeningTime;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@Api(tags = "점포오픈시간")
@RequiredArgsConstructor
@RestMappingV1
public class StoreOpeningTimeController {

	private final StoreOpeningTimeService storeOpeningTimeService;

	@ApiOperation(value = "점포 영업시간 조회")
	@GetMapping(value = "/store/opening/times")
	Response<List<StoreOpeningTime>> openingTimes(@Valid GetParamOpeningTimesDTO getOpeningTimesDTO) {

		List<StoreOpeningTime> storeOpeningTimes = storeOpeningTimeService.getStoreOpeningTimes(getOpeningTimesDTO);

		if (storeOpeningTimes == null) {
			return Response.badRequest(null);

		} else {
			return Response.ok(storeOpeningTimes);
		}
	}
}