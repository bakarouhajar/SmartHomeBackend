package ma.emsi.smarthome.dao;

import ma.emsi.smarthome.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category , Long> {

}
