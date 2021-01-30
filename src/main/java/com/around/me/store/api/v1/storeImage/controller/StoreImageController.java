package com.around.me.store.api.v1.storeImage.controller;

import com.around.me.store.api.v1.storeImage.dto.GetParamImageDTO;
import com.around.me.store.api.v1.storeImage.dto.GetParamMenuImageDTO;
import com.around.me.store.api.v1.storeImage.service.StoreImageService;
import com.around.me.store.core.annoitation.version.RestMappingV1;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.util.List;

/**
 * StoreImage 관련 API Controller
 */
@Api(tags = "점포이미지")
@Slf4j
@RequiredArgsConstructor
@RestMappingV1
public class StoreImageController {

	// 점포이미지서비스
	private final StoreImageService storeImageService;

    @ApiOperation(value = "점포 이미지 리스트 조회")
    @GetMapping(value = "/store/{storeNo}/images")
    Response<List<StoreImage>> getStoreImages(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

        List<StoreImage> storeImages = storeImageService.getStoreImages(storeNo);

        return Response.ok(storeImages);
    }

    @ApiOperation(value = "점포 대표 이미지 조회")
    @GetMapping(value = "/store/{storeNo}/representation-image")
    Response<StoreImage> getStoreRepresentationImages(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

        StoreImage storeImage = storeImageService.getStoreRepresentationImage(storeNo);

        return Response.ok(storeImage);
    }

    @ApiOperation(value = "점포 이미지 리스트 조회(여러 조건)")
    @GetMapping(value = "/store/images")
    Response<List<StoreImage>> getStoreImagesByConditions(@Valid GetParamImageDTO getParamImageDTO) {

        List<StoreImage> storeImages = storeImageService.getStoreImages(getParamImageDTO);

        return Response.ok(storeImages);
    }

    @ApiOperation(value = "점포 메뉴 이미지 리스트 조회")
    @GetMapping(value = "/store/menu-images")
    Response<List<StoreImage>> getStoreMenuImage(@Valid GetParamMenuImageDTO getParamMenuImageDTO) {

        List<StoreImage> storeImages = storeImageService.getStoreMenuImages(getParamMenuImageDTO);

        return Response.ok(storeImages);
    }
}