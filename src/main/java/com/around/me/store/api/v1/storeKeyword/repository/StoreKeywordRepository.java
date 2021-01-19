package com.around.me.store.api.v1.storeKeyword.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.StoreKeyword;
import com.around.me.store.core.domain.StoreKeywordManage;
import com.around.me.store.core.enums.common.YnEnum;

public interface StoreKeywordRepository extends JpaRepository<StoreKeyword, Long> {

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : useYn(사용여부)
	 * @return : Optional<List<StoreKeywordManage>> (점포키워드목록)
	 */
	Optional<List<StoreKeywordManage>> findByUseYn(YnEnum useYn);

	/**
	 * @date   : 2021. 1. 9.
	 * @author : wonho
	 * @param  : postStoreKeywordDTO
	 * @return : Optional<List<StoreKeywordManage>>
	 */
	Optional<List<StoreKeywordManage>> findByUseYnAndStoreNo(YnEnum useYn, long storeNo);//--수정 PostStoreKeywordDTO
}


