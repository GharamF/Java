package com.Gharam.Lookify.repositories;
import com.Gharam.Lookify.models.Song;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findByArtist(String artist);
	List<Song> findTop10ByOrderByRatingDesc();
}
