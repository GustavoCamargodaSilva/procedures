package estudos.procedures.repository;
import estudos.procedures.entity.Category;
import estudos.procedures.util.StoredProcedures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Procedure(procedureName = StoredProcedures.PROCEDURE_GET_ALL_CATEGORIES)
    List<Category> getAllCategories();

    @Procedure(procedureName = StoredProcedures.PROCEDURE_GET_CATEGORY_BY_ID)
    Category getCategoryById(Long id);

}
