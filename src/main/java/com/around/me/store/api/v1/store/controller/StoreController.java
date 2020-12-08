package com.around.me.store.api.v1.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.around.me.store.api.v1.store.service.StoreService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.Store;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestMappingV1
public class StoreController {

	// 점포서비스
	private final StoreService storeService;

    /**
     * @param
     * @return
     */
    @ApiOperation(value = "점포리스트 조회")
    @GetMapping(value = "/stores")
    Response<List<Store>> getStores() {

        return Response.ok(null);
    }
}
