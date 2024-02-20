package RealWorld.repository;

import RealWorld.models.UploadModel;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface UploadRepositiry extends CrudRepository<UploadModel, Long> {
    List<UploadModel> findAll();
}
