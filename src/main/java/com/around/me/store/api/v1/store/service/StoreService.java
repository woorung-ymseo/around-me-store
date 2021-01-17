package com.around.me.store.api.v1.store.service;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetMenuDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.store.repository.StoreRepository;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;
import com.around.me.store.core.support.ResourceClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreRepository storeRepository;

	// 통신
	private final ResourceClient resourceClient;

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @Return : List<StoreImage>
	 */
	public List<StoreImage> getMenuImages(@Valid GetMenuImageDTO getMenuImageDTO) {
		Optional<List<StoreImage>> menuImages = storeRepository.findbyDeleteYnAndStoreNoAndImageSort(getMenuImageDTO);

		return menuImages.orElse(null);
	}

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return : List<>
	 */
	public List<Menu> getMenus(@Valid GetMenuDTO getMenuDTO) {
		Optional<List<Menu>> menus = storeRepository.findByDeleteYnAndImageSort(getMenuDTO);

		return menus.orElse(null);
	}

	public List<EventDTO> getEvents(GetParamEventDTO getParamEventDTO) {

		Response<List> resultResponse = resourceClient.getForResponse("http://127.0.0.1:8082/event/api/v1/events", getParamEventDTO, List.class);

		return resultResponse.getContent();
	}
}
