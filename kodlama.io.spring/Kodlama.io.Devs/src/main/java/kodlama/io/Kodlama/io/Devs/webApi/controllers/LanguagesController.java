package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController //-->erişim noktası
@RequestMapping("/api/languages") //-->nasıl erişeceği
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) throws Exception {
		this.languageService = languageService;
	}
	
	@PostMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception{
		 languageService.delete(deleteLanguageRequest);		
	}
	
	@PostMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		 languageService.update(updateLanguageRequest);		
	}
	
	@GetMapping("/getAll")
	public List<GetAllLanguagesResponse> getAll(){
		return languageService.getAll();		
	}
	
	@GetMapping("/getById")
	public GetByIdLanguagesResponse  getById(int id){
		return languageService.getById(id);		
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		this.languageService.add(createLanguageRequest);
	}
	
		
}