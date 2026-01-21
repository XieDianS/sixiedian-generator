package com.sixiedian.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixiedian.template.entity.Template;

public interface TemplateRepository extends JpaRepository<Template, Long> {

}