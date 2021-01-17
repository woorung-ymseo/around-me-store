package com.around.me.store.api.v1.store.repository;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.api.v1.store.dto.GetMenuDTO;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.api.v1.storeKeyword.dto.PostStoreKeywordDTO;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.domain.StoreKeyword;
import com.around.me.store.core.domain.StoreKeywordManage;
import com.around.me.support.core.enums.common.YnEnum;

public interface StoreRepository extends JpaRepository<StoreKeyword, Long> {

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : postStoreKeywordDTO
	 * @return : Optional<List<StoreKeywordManage>>
	 */
	Optional<List<StoreKeywordManage>> findByUserYnAndStoreNo(@Valid PostStoreKeywordDTO postStoreKeywordDTO);

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return : Optional<List<StoreImage>>
	 */
	Optional<List<StoreImage>> findbyDeleteYnAndStoreNoAndImageSort(@Valid GetMenuImageDTO getMenuImageDTO);

	/**
	 * @date   : 2021. 1. 16.
	 * @author : wonho
	 * @param  : getMenuImageDTO
	 * @return :
	 */
	Optional<List<Menu>> findByDeleteYnAndImageSort(@Valid GetMenuDTO getMenuDTO);
}
