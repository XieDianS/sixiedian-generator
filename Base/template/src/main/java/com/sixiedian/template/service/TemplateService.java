package com.sixiedian.template.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sixiedian.template.entity.Template;
import com.sixiedian.template.repository.TemplateRepository;

import jakarta.transaction.Transactional;

@Service
public class TemplateService {

    private static TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        TemplateService.templateRepository = templateRepository;
    }

    /* 增加 */
    @Transactional
    public Template add(Template template) {
        return templateRepository.save(template);
    }

    /* 查询 */
    @Transactional
    public Template get(Long id) {
        return templateRepository.findById(id).orElseThrow();
    }

    /* 删除 */
    @Transactional
    public void delete(Long id) {
        templateRepository.deleteById(id);
    }

    /* 修改 */
    @Transactional
    public Template update(Long id, Template newTemplate) {
        Template template = templateRepository.findById(id).orElseThrow();
        template.setName(newTemplate.getName());
        return template;
    }

    /* 查询所有 */
    @Transactional
    public List<Template> list() {
        return templateRepository.findAll();
    }
}
