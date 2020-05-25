package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.ImageUrl;
import ro.fasttrackit.travel.exception.ResourceNotFoundException;
import ro.fasttrackit.travel.persistence.ImageUrlRepository;

import java.util.List;

@Service
public class ImageUrlService {
    private final ImageUrlRepository imageUrlRepository;

    public ImageUrlService(ImageUrlRepository imageUrlRepository) {
        this.imageUrlRepository = imageUrlRepository;
    }

    public List<ImageUrl> getAll() {
        return imageUrlRepository.findAll();
    }

    public ImageUrl getImageUrlById(Integer imageUrlId) {
        return getOrThrow(imageUrlId);
    }

    public ImageUrl addVacation(ImageUrl imageUrl) {
        return imageUrlRepository.save(imageUrl);
    }

    public ImageUrl deleteVacation(int imageUrlId) {
        ImageUrl imageUrlToDelete = getOrThrow(imageUrlId);
        imageUrlRepository.deleteById(imageUrlId);
        return imageUrlToDelete;
    }

    public ImageUrl updateVacation(int imageUrlId, ImageUrl imageUrl) {
        ImageUrl dbImageUrl = getOrThrow(imageUrlId);
        dbImageUrl.setUrl(imageUrl.getUrl());
        return imageUrlRepository.save(dbImageUrl);
    }

    private ImageUrl getOrThrow(int imageUrlId) {
        return imageUrlRepository.findById(imageUrlId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find image with id " + imageUrlId));
    }
}
