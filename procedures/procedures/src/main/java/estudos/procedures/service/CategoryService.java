package estudos.procedures.service;

import estudos.procedures.dto.CategoryDTO;
import estudos.procedures.entity.Category;
import estudos.procedures.projection.CategoryProjection;
import estudos.procedures.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.BeanUtils;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = false)
    public List<CategoryDTO> getAllCategories() {
       List<Category> categories = categoryRepository.getAllCategories();
         return categories.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = false)
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO, category);
        category = categoryRepository.save(category);
        return new CategoryDTO(category);
    }

    @Transactional(readOnly = false)
    public CategoryDTO findCategoryById(Long id) {
        Category category = categoryRepository.getCategoryById(id);
        return new CategoryDTO(category);
    }
}
