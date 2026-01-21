package com.sixiedian.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixiedian.template.entity.Template;
import com.sixiedian.template.service.TemplateService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/templates")
public class TemplateController {

    private static TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        TemplateController.templateService = templateService;
    }

    @GetMapping("/{id}")
    public Template getMethodName(@PathVariable Long id) {
        return templateService.get(id);
    }

    @PostMapping
    public Template postMethodName(@RequestBody Template template) {
        return templateService.add(template);
    }

    @PutMapping("/{id}")
    public Template putMethodName(@PathVariable Long id, @RequestBody Template template) {
        return templateService.update(id, template);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        templateService.delete(id);
    }

    @GetMapping
    public List<Template> getMethodName() {
        return templateService.list();
    }

}
