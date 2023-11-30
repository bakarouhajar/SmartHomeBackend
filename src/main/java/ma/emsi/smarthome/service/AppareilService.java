package ma.emsi.smarthome.service;

import ma.emsi.smarthome.bean.Appareil;
import ma.emsi.smarthome.dao.AppareilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppareilService {
    //Injection du Dao dans le service
    @Autowired
    AppareilDao appareilDao;

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }

    public int save(Appareil appareil) {
        if (appareil == null) return -1;
        else {
            appareilDao.save(appareil);
            return 1;
        }
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilDao.findById(aLong);
    }

    public void changeState(Long id) {
        Optional<Appareil> fAppareil = findById(id);
        if (fAppareil.isPresent()) {
            Appareil appareil = fAppareil.get();
            appareil.setState(!appareil.isState());
            save(appareil);
        }
    }

    public void changeAllState() {
        List<Appareil> fAppareil = findAll();
        for (Appareil appareil : fAppareil) {
            appareil.setState(!appareil.isState());
            save(appareil);
        }
    }
    public void deleteById(Long aLong) {
        appareilDao.deleteById(aLong);
    }

    public void deleteAll() {
        appareilDao.deleteAll();
    }
}
