package com.around.me.store.api.v1.storeKeyword.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.storeKeyword.dto.PostStoreKeywordDTO;
import com.around.me.store.api.v1.storeKeyword.repository.StoreKeywordRepository;
import com.around.me.store.core.domain.StoreKeywordManage;
import com.around.me.store.core.enums.common.YnEnum;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreKeywordService {

	private final StoreKeywordRepository storeKeywordRepository;

	// 전체 점포키워드목록 조회
	public List<StoreKeywordManage> getStoreKeyWords(PostStoreKeywordDTO postStoreKeywordDTO) {
		Optional<List<StoreKeywordManage>> storeKeywords = null;

		// 전체조회
		if (postStoreKeywordDTO == null) {
			storeKeywords = storeKeywordRepository.findByUseYn(YnEnum.Y);

		// 조건조회
		} else {
			storeKeywords = storeKeywordRepository.findByUseYnAndStoreNo(postStoreKeywordDTO.getUseYn(),postStoreKeywordDTO.getStoreNo());//--수정
		}

		return storeKeywords.orElse(null);
	}
}
