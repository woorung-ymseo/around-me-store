package com.around.me.store.api.v1.storeOpeningTime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.around.me.store.core.domain.StoreKeyword;

public interface StoreOpeningTimeRepository extends JpaRepository<StoreKeyword, Long> {

}
