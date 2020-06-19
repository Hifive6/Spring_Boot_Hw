package com.tts.homework.springbootsite.repository;

import com.tts.homework.springbootsite.Domain.VGIModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface VideoGameRepository extends CrudRepository<VGIModel, Long>{
    
    List<VGIModel> findByTitle(String title);
}