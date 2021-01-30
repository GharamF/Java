package com.Gharam.DisplayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class DisplayDate {

	@GetMapping("/")
	public String Home() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model datetemp) {
		SimpleDateFormat formatDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		String date = formatDate.format(new Date());
		datetemp.addAttribute("date", date );
		return "date.jsp";
	}
	@GetMapping("/time")
	public String time(Model timetemp) {
		SimpleDateFormat formatTiem = new SimpleDateFormat("HH:mm a");
		String time = formatTiem.format(new Date());
		timetemp.addAttribute("time", time );
		return "time.jsp";
	}

	
}
