package lauri.backend.controller;

import lauri.backend.model.Category;
import lauri.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("categories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }
    @PostMapping("categories")
    public String postItem(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return "Kategooria edukalt lisatud " + category.getName();
    }
}

//localhost:8080
