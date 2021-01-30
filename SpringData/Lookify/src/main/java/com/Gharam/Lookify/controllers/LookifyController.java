package com.Gharam.Lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Gharam.Lookify.models.Song;
import com.Gharam.Lookify.services.LookifyService;


@Controller
public class LookifyController {
	private final LookifyService LookifyService;

	public LookifyController(LookifyService lookifyService) {
		this.LookifyService = lookifyService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		return "Home.jsp";
	}

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = LookifyService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	@RequestMapping("/newSong")
	public String addNew(@ModelAttribute("NewSong") Song song, Model model) {
		return "NewSong.jsp";
	}
	
	@RequestMapping(value="/AddNewSong", method=RequestMethod.POST)
	public String process(@Valid @ModelAttribute("addNew") Song song, BindingResult result, Model model) {
	    if (result.hasErrors()) {
			List<Song> songs = LookifyService.allSongs();
			model.addAttribute("songs", songs);
	        return "NewSong.jsp";
	    }
	    else {
	    	LookifyService.addSong(song);
	        return "redirect:/dashboard";
	    }
	}
	
	@RequestMapping("/songs/{id}")
	public String ViewSong(@PathVariable("id") Long id, Model model) {
		Song song = LookifyService.findSong(id);
		model.addAttribute("song", song);
		return "song.jsp";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		LookifyService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/TopTen")
	public String topten(Model model) {
		List<Song> songs = LookifyService.TopTen();
		model.addAttribute("songs", songs);
		return "TopTen.jsp";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
	
	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<Song> songs = LookifyService.SearchSong(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
	
	
	
	
}
