package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service //bu sınıf bir business nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	private List<Language> languages;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}
		
	@Override
	public List<Language> getAll() {
		// iş kuaralları
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language)throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("name can not be empty");
		}
		for(Language language1:languages) {
			if(language1.getName()==language.getName()) {
				throw new Exception("names can not be the same");
			}
		}
	}

	@Override
	public void delete(Language language) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Language language)  {
		// TODO Auto-generated method stub
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
