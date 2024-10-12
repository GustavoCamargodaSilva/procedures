package estudos.procedures.controller.impl;

import estudos.procedures.controller.CategoryController;
import estudos.procedures.projection.CategoryProjection;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryControllerImpl implements CategoryController {

    @Override
    public List<CategoryProjection> getAllCategories() {
        return List.of();
    }
}
