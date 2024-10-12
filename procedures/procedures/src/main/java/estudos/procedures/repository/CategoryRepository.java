package estudos.procedures.repository;

import estudos.procedures.entity.Category;
import estudos.procedures.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Procedure(name = "GET_ALL_CATEGORIES")
    List<CategoryProjection> getAllCategories();

}
