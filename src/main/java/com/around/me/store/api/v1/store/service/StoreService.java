package com.around.me.store.api.v1.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.repository.StoreRepository;
import com.around.me.store.core.domain.Store;
import com.around.me.store.core.dto.Response;
import com.around.me.store.core.enums.common.YnEnum;
import com.around.me.store.core.support.ResourceClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreRepository storeRepository;

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

}
