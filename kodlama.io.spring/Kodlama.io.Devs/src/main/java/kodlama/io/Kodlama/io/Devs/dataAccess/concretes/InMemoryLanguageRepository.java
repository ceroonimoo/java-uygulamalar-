package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		System.out.println("added");
		
	}

	@Override
	public void delete(Language language) {
		languages.remove(language);
		System.out.println("deleted");
	}

	@Override
	public void update(Language language) {
		for(Language language1:languages) {
			if(language1.getId()==language.getId()) {
				language1.setName(language.getName());
				System.out.println("updated");
				
			}
		}
	}

	@Override
	public Language getById(int id) {
		for(Language language1:languages) {
			if(language1.getId()==id) {
				return language1;
			}
		}
		return null;
	}

}
