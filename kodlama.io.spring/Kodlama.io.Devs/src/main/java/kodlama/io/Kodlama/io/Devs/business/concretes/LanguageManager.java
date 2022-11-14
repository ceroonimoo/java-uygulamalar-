package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service //bu sınıf bir business nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	private List<Language> languages;
	private CreateLanguageRequest language;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}
		
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> result=languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse= new ArrayList<GetAllLanguagesResponse>();
		for(Language language:languages) {
			GetByIdLanguagesResponse responseItem=new GetByIdLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
		}
		// iş kuaralları
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest)throws Exception {
		if(createLanguageRequest.getName().isEmpty()) {
			throw new Exception("name can not be empty");
		}
		for(Language language1:languages) {
			if(language1.getName()==language.getName()) {
				throw new Exception("names can not be the same");
			}
		}
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GetByIdLanguagesResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
