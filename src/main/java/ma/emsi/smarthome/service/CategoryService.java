package ma.emsi.smarthome.service;

import ma.emsi.smarthome.bean.Category;
import ma.emsi.smarthome.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;

    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    public int save(Category category) {
        if (category == null) return -1;
        else {
            categoryDao.save(category);
            return 1;
        }
    }

    public Optional<Category> findById(Long aLong) {
        return categoryDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        categoryDao.deleteById(aLong);
    }

    public void deleteAll() {
        categoryDao.deleteAll();
    }
}
