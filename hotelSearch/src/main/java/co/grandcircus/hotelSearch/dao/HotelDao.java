package co.grandcircus.hotelSearch.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.hotelSearch.entity.Hotel;


@Repository
@Transactional
public class HotelDao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Hotel> findAll() {
		return em.createQuery("from Hotel", Hotel.class).getResultList();
	}
	
	public List<Hotel> findByCity(String city) {
		return em.createQuery("from Hotel where city = :city order by pricePerNight", Hotel.class)
				.setParameter("city", city)
				.getResultList();
	}

}
