package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository //bu sınıf bir dataAccess nesnesidir
public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language);
	void delete(Language language);
	void update(Language language);
	Language getById(int id);
}
