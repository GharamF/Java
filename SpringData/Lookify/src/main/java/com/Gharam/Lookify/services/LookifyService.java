package com.Gharam.Lookify.services;
import com.Gharam.Lookify.repositories.LookifyRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Gharam.Lookify.models.Song;

@Service
public class LookifyService {
	private final LookifyRepository LookifyRepository;
	
	public LookifyService( LookifyRepository LookifyRepository ) {
		this.LookifyRepository=  LookifyRepository;
	}
	public Song addSong(Song song) {
		return LookifyRepository.save(song);
	}
	public void deleteSong(Long id) {
		LookifyRepository.deleteById(id);
	}
	
	
	public List<Song> allSongs() {
		return LookifyRepository.findAll();
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = LookifyRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        }
        else {
            return null;
        }
	}
	
	public List<Song> SearchSong(String artist){
		return LookifyRepository.findByArtist(artist);
	}
	public List<Song> TopTen(){
		return LookifyRepository.findTop10ByOrderByRatingDesc();
	}
	

	
} 
