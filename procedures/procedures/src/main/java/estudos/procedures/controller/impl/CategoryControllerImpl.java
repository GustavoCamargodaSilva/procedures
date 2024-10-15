package estudos.procedures.controller.impl;

import estudos.procedures.controller.CategoryController;
import estudos.procedures.dto.CategoryDTO;
import estudos.procedures.service.CategoryService;
import estudos.procedures.service.exception.NoRecordsFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CategoryControllerImpl implements CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Override
    @Cacheable(value = "categories")
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> categoryProjections = categoryService.getAllCategories();

        if (categoryProjections.isEmpty()) {
            throw new NoRecordsFoundException();
        }else {
            return categoryProjections;
        }
    }

    @Override
    @CacheEvict(value = "categories", allEntries = true)
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
       categoryDTO = categoryService.createCategory(categoryDTO);
         return categoryDTO;
    }

    @Override
    @Cacheable(value = "categories")
    public CategoryDTO findCategoryById(Long id) {
        return categoryService.findCategoryById(id);
    }

}
