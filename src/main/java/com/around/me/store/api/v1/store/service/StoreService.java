package com.around.me.store.api.v1.store.service;

import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.repository.StoreRepository;
import com.around.me.store.core.domain.Store;
import com.around.me.store.core.dto.Response;
import com.around.me.store.core.enums.common.YnEnum;
import com.around.me.store.core.support.ResourceClient;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreRepository storeRepository;

	// 통신
	private final ResourceClient resourceClient;

    /**
     * 점포 정보 조회
     * @param  storeNo
     * @return Store
     */
    public Store getStore(long storeNo) {

        // 값 검사
        Assert.isTrue(storeNo != 0,     "잘못된 요청입니다.");

        Optional<Store> store = storeRepository.findByStoreNoAndClosedYn(storeNo, YnEnum.N);

        return store.orElse(null);
    }

	public Response<List> getEvents(GetParamEventDTO getParamEventDTO) {

		Response<List> resultResponse = resourceClient.getForResponse("http://127.0.0.1:8082/event/api/v1/events", getParamEventDTO, List.class);

		return resultResponse;
	}
	
	/**
     * 점포 리스트 조회
     * @return List<Store>
     */
    public List<Store> getStores() {

        Optional<List<Store>> stores = storeRepository.findAllByClosedYn(YnEnum.N);

        return stores.orElse(null);
    }
}
