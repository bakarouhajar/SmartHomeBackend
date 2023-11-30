package ma.emsi.smarthome.ws;

import ma.emsi.smarthome.bean.Category;
import ma.emsi.smarthome.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/categorie")
@CrossOrigin(origins = "http://localhost:4200")
public class CategorieWS {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping
    public int save(Category category) {
        return categoryService.save(category);
    }

    @GetMapping("id/{id}")
    public Optional<Category> findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        categoryService.deleteAll();
    }
}
