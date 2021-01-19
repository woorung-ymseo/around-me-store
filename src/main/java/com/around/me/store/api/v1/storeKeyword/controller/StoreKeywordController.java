package com.around.me.store.api.v1.storeKeyword.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;

import com.around.me.store.api.v1.storeKeyword.dto.PostStoreKeywordDTO;
import com.around.me.store.api.v1.storeKeyword.service.StoreKeywordService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.StoreKeywordManage;
import com.around.me.store.core.dto.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@Api(tags = "점포키워드")
@RequiredArgsConstructor
@RestMappingV1
public class StoreKeywordController {

	private final StoreKeywordService storeKeywordService;

    @ApiOperation(value = "점포키워드 리스트 조회")
    @GetMapping(value = "/store/storeKeywords")
    Response<List<StoreKeywordManage>> storeKeywords(@Valid PostStoreKeywordDTO postStoreKeywordDTO) {

    	// 점포 키워드 리스트 조회
    	List<StoreKeywordManage> storeKeyWords = storeKeywordService.getStoreKeyWords(postStoreKeywordDTO);

        return Response.ok(storeKeyWords);
    }
}
