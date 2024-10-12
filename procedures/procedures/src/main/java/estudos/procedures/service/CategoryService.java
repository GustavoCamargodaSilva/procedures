package estudos.procedures.service;

import estudos.procedures.entity.Category;
import estudos.procedures.projection.CategoryProjection;
import estudos.procedures.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = false)
    public List<CategoryProjection> getAllCategories() {
        return categoryRepository.getAllCategories();
    }
}
