package com.around.me.store.api.v1.storeImage.service;

import com.around.me.store.api.v1.storeImage.dto.GetParamImageDTO;
import com.around.me.store.api.v1.storeImage.dto.GetParamMenuImageDTO;
import com.around.me.store.api.v1.storeImage.repository.StoreImageRepository;
import com.around.me.store.core.domain.StoreImage;
import com.around.me.store.core.enums.common.ImageSortEnum;
import com.around.me.store.core.enums.common.YnEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreImageService {

	private final StoreImageRepository storeImageRepository;
	
    /**
     * 점포 이미지 리스트 조회
     * @param storeNo
     * @return List<StoreImage>
     * @apiNote 점포번호를 통해 점포 이미지들을 반환한다.
     */
    public List<StoreImage> getStoreImages(long storeNo) {
        Optional<List<StoreImage>> storeImages = storeImageRepository.findAllByStoreNoAndDeleteYn(storeNo, YnEnum.N);

        return storeImages.orElse(null);
    }

    /**
     * @param getParamImageDTO
     * @return
     * @apiNote 점포번호, 대표이미지여부, 이미지 구분을 통해 점포 이미지들을 반환한다.
     */
    public List<StoreImage> getStoreImages(GetParamImageDTO getParamImageDTO) {
        Optional<List<StoreImage>> storeImages = storeImageRepository.findAllByStoreNoAndDeleteYnAndImageSortAndRepresentationYn(getParamImageDTO.getStoreNo(), YnEnum.N, getParamImageDTO.getImageSort(), getParamImageDTO.getRepresentationYn());

        return storeImages.orElse(null);
    }

    /**
     * @param getParamMenuImage
     * @return
     * @apiNote 점포의 메뉴판 이미지만 반환하는 메서드
     */
    public List<StoreImage> getStoreMenuImages(GetParamMenuImageDTO getParamMenuImage) {

        // storeNo, YnEnum, ImageSortEnum
        Optional<List<StoreImage>> storeImages = storeImageRepository.findAllByStoreNoAndDeleteYnAndImageSort(getParamMenuImage.getStoreNo(), YnEnum.N, ImageSortEnum.MU);

        return storeImages.orElse(null);
    }

    /**
     * @param storeNo
     * @return
     * @apiNote 점표 대표이미지 단건 조회
     */
    public StoreImage getStoreRepresentationImage(long storeNo) {
        Optional<StoreImage> storeImages = storeImageRepository.findByStoreNoAndDeleteYnAndImageSortAndRepresentationYn(storeNo, YnEnum.N, ImageSortEnum.SU, YnEnum.Y);

        return storeImages.orElse(null);
    }
}
