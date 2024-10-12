package estudos.procedures.controller.impl;

import estudos.procedures.controller.CategoryController;
import estudos.procedures.projection.CategoryProjection;
import estudos.procedures.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryControllerImpl implements CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Override
    public List<CategoryProjection> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
