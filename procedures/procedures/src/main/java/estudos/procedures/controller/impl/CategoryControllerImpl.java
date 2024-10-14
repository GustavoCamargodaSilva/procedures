package estudos.procedures.controller.impl;

import estudos.procedures.controller.CategoryController;
import estudos.procedures.projection.CategoryProjection;
import estudos.procedures.service.CategoryService;
import estudos.procedures.service.exception.NoRecordsFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CategoryControllerImpl implements CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Override
    @Cacheable(value = "categories")
    public List<CategoryProjection> getAllCategories() {
        List<CategoryProjection> categoryProjections = categoryService.getAllCategories();

        if (categoryProjections.isEmpty()) {
            throw new NoRecordsFoundException();
        }else {
            return categoryProjections;
        }
    }

}
