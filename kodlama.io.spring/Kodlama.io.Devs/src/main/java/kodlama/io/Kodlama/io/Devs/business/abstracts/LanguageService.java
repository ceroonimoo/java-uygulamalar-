package kodlama.io.Kodlama.io.Devs.business.abstracts;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
	GetByIdLanguagesResponse getById(int id);



}
