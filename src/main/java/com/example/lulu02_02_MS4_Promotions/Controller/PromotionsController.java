package com.example.lulu02_02_MS4_Promotions.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lulu02_02_MS4_Promotions.Entity.PromotionsEntity;
import com.example.lulu02_02_MS4_Promotions.Repository.PromotionsRepository;

@RestController
public class PromotionsController {
	
	@Autowired
	PromotionsRepository pr;
	
	@GetMapping("/pss/getAdds")
	public List<PromotionsEntity> getJPQL() {
		return pr.findAll();
	}
	@PostMapping("/pss/addAdds")
	public PromotionsEntity createuser(@RequestBody PromotionsEntity prod) {
		return pr.save(prod);
	  }
	@DeleteMapping("/pss/deleteAdds/{id}")
	public void PromotionsEntity (@PathVariable ("id") Integer id){
		pr.deleteById(id);
	}
	

}
