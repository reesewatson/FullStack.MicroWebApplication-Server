package com.zipcodewilmington.videoproject.repositories;

import com.zipcodewilmington.videoproject.models.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
}
