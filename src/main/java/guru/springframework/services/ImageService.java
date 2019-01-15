package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jensW89
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
