package com.around.me.store.api.v1.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.repository.StoreImageRepository;
import com.around.me.store.api.v1.store.repository.StoreRepository;
import com.around.me.store.core.domain.Store;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;
import com.around.me.store.core.enums.common.YnEnum;
import com.around.me.store.core.support.ResourceClient;

import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreRepository storeRepository;

	private final StoreImageRepository storeImageRepository;
	
	// 통신
	private final ResourceClient resourceClient;

	public List<EventDTO> getEvents(GetParamEventDTO getParamEventDTO) {

		Response<List> resultResponse = resourceClient.getForResponse("http://127.0.0.1:8082/event/api/v1/events", getParamEventDTO, List.class);

		return resultResponse.getContent();
	}
	
	/**
     * 점포 리스트 조회
     * @return List<Store>
     */
    public List<Store> getStores() {

        Optional<List<Store>> stores = storeRepository.findAllByClosedYn(YnEnum.N);

        return stores.orElse(null);
    }
    
    /**
     * 점포 정보 조회
     * @return Store
     */
    public Store getStore(@ApiParam(value = "점포 번호", required = true, example = "1") @PathVariable long storeNo) {

    	Assert.isTrue(storeNo == 0, "잘못된 요청입니다.");
    	
        Optional<Store> store = storeRepository.findAllBystoreNoAndClosedYn(storeNo, YnEnum.N);

        return store.orElse(null);
    }
    
    /**
     * 점포 이미지 리스트 조회
     * @return List<StoreImage>
     */
    public List<StoreImage> getStoreImages(long storeNo) {

    	Assert.isTrue(storeNo == 0, "잘못된 요청입니다.");
    	
        Optional<List<StoreImage>> storeImages = storeImageRepository.findAllByStoreNoAndDeleteYn(storeNo, YnEnum.N);

        return storeImages.orElse(null);
    }

}
