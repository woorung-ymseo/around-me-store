package com.around.me.store.api.v1.storeImage.repository;

import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StoreImageRepository extends JpaRepository<StoreImage, Long> {

	Optional<List<StoreImage>> findAllByStoreNoAndDeleteYn(long storeNo, YnEnum deleteYn);

	Optional<List<StoreImage>> findAllByStoreNoAndDeleteYnAndImageSort(Long storeNo, YnEnum n, ImageSortEnum mu);

	Optional<List<StoreImage>> findAllByStoreNoAndDeleteYnAndImageSortAndRepresentationYn(long storeNo, YnEnum n, ImageSortEnum imageSort, YnEnum representationYn);

	Optional<StoreImage> findByStoreNoAndDeleteYnAndImageSortAndRepresentationYn(long storeNo, YnEnum n, ImageSortEnum su, YnEnum y);
}
