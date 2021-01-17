package com.around.me.store.api.v1.storeOpeningTime.service;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.around.me.store.api.v1.store.dto.EventDTO;
import com.around.me.store.api.v1.store.dto.GetMenuDTO;
import com.around.me.store.api.v1.store.dto.GetParamEventDTO;
import com.around.me.store.api.v1.storeKeyword.dto.GetMenuImageDTO;
import com.around.me.store.api.v1.storeOpeningTime.repository.StoreOpeningTimeRepository;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.dto.Response;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreOpeningTimeService {

	private final StoreOpeningTimeRepository storeOpeningTimeRepository;

}
