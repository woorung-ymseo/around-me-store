package com.around.me.store.api.v1.store.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.store.repository.StoreRepository;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.core.domain.StoreImage;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreRepository storeRepository;

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
}
