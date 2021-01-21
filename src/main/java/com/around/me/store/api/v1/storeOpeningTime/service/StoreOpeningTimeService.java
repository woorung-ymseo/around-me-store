package com.around.me.store.api.v1.storeOpeningTime.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.storeOpeningTime.dto.GetParamOpeningTimesDTO;
import com.around.me.store.api.v1.storeOpeningTime.repository.StoreOpeningTimeRepository;
import com.around.me.store.core.domain.StoreOpeningTime;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreOpeningTimeService {

	private final StoreOpeningTimeRepository storeOpeningTimeRepository;

	public List<StoreOpeningTime> getStoreOpeningTimes(GetParamOpeningTimesDTO getOpeningTimesDTO){
		
		//Optional<List<StoreOpeningTime>> getStoreOpeningTimes = storeOpeningTimeRepository.findAllByStoreNo(getOpeningTimesDTO);
		
		Optional<List<StoreOpeningTime>> getStoreOpeningTimes = null;//--수정
		
		return getStoreOpeningTimes.orElse(null);
	}
}
