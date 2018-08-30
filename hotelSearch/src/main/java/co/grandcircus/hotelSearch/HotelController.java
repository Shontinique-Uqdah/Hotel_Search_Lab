package co.grandcircus.hotelSearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelSearch.dao.HotelDao;
import co.grandcircus.hotelSearch.entity.Hotel;

@Controller
public class HotelController {
	
	@Autowired
	HotelDao hotelDao;
	
	@RequestMapping("/") 
	public ModelAndView showHome() {
		return new ModelAndView("index");
	}
	
	@PostMapping("/hotels") 
	public ModelAndView showHotels(@RequestParam("city") String city) {
		List<Hotel> hotels = hotelDao.findByCity(city);
		return new ModelAndView("hotels", "hotels", hotels);
	}
	

}
