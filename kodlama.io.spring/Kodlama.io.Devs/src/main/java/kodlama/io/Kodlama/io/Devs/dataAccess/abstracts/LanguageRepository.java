package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository //bu sınıf bir dataAccess nesnesidir
public interface LanguageRepository extends JpaRepository<Language,Integer> {
	

}
