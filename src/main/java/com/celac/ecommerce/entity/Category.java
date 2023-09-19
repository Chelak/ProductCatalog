package com.celac.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import org.hibernate.type.TrueFalseConverter;

/** Created by user on 8/5/2015. */
@Entity
@Table(name = "categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "category_name", unique = true)
  private String categoryName;

  @Column(name = "url_path", unique = true)
  private String urlPath;

  @Column(name = "category_description")
  private String categoryDescription;

  @Column(name = "created_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime createdDateTime;

  @Column(name = "updated_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime updatedDateTime;

  @Column(name = "published_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime publishedDateTime;

  @Convert(converter = TrueFalseConverter.class)
  @Column(name = "featured", columnDefinition = "boolean default false")
  private Boolean featured;

  public Category() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }

  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  public LocalDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public LocalDateTime getUpdatedDateTime() {
    return updatedDateTime;
  }

  public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
  }

  public LocalDateTime getPublishedDateTime() {
    return publishedDateTime;
  }

  public void setPublishedDateTime(LocalDateTime publishedDateTime) {
    this.publishedDateTime = publishedDateTime;
  }

  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }
}
