package estudos.procedures.controller;

import estudos.procedures.dto.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public interface CategoryController {

    @GetMapping("/listarcategorias")
    public List<CategoryDTO> getAllCategories();

    @PostMapping("/cadastrar")
    public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO);

    @GetMapping("/procurarcategoria/{id}")
    public CategoryDTO findCategoryById(@PathVariable Long id);

}
