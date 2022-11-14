package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;
	private kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest updateTechnologyRequest;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<GetAllTechnologiesResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologiesResponse> getAllTechnologiesResponse = new ArrayList<>();		
        for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setLanguageId(technology.getLanguage().getId());
			responseItem.setLanguageName(technology.getLanguage().getName());
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			getAllTechnologiesResponse.add(responseItem);
		}
		return getAllTechnologiesResponse;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		if(isNameExist(createTechnologyRequest.getName()) == true) {
			throw new Exception("This technology already exist.");
		}
		else if(createTechnologyRequest.getName().isBlank()) {
			throw new Exception("technology name can not be empty.");
		}
		Language language = languageRepository.findById(createTechnologyRequest.getLanguageId()).get();
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);		
	}

	private boolean isNameExist(String name) {
		for(Technology technologyName: technologyRepository.findAll()) {
			if(technologyName.getName()==name) {
				return true;
			}
	}
		return false;
	}
	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		Technology technology = technologyRepository.findById(deleteTechnologyRequest.getId()).get();
		technologyRepository.delete(technology);
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		Language language = languageRepository.findById(updateTechnologyRequest.getId()).get();
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getId()).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);
		
	}

	@Override
	public GetByIdTechnologiesResponse getById(int id) {
		java.util.Optional<Technology> technology = technologyRepository.findById(id);
		GetByIdTechnologiesResponse responseItem = new GetByIdTechnologiesResponse();
		responseItem.setName(technology.get().getName());
		return responseItem;		
	}

}
