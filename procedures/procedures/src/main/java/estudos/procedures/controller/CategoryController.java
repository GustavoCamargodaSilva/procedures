package estudos.procedures.controller;

import estudos.procedures.projection.CategoryProjection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public interface CategoryController {

    @RequestMapping("/listarcategorias")
    public List<CategoryProjection> getAllCategories();

}
