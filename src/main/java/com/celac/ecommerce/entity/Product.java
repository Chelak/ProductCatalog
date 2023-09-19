package com.celac.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import org.hibernate.type.TrueFalseConverter;

/** Created by user on 8/5/2015. */
@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "product_name", unique = true)
  private String productName;

  @Column(name = "product_stock_quantity")
  private int productStock;

  @Column(name = "product_price")
  private double productPrice;

  @Column(name = "product_Description")
  private String productDescription;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  @Column(name = "caption_image_path")
  private String captionImagePath;

  @Convert(converter = TrueFalseConverter.class)
  @Column(name = "featured", columnDefinition = "boolean default false")
  private Boolean featured;

  @Column(name = "published", columnDefinition = "boolean default 0")
  private Boolean published;

  @Column(name = "created_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime createdDateTime;

  @Column(name = "updated_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime updatedDateTime;

  @Column(name = "published_date_time", columnDefinition = "TIMESTAMP")
  private LocalDateTime publishedDateTime;

  public Product() {}

  public Product(
      String productName, int productStock, double productPrice, String productDescription) {
    this.productName = productName;
    this.productStock = productStock;
    this.productPrice = productPrice;
    this.productDescription = productDescription;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductStock() {
    return productStock;
  }

  public void setProductStock(int productStock) {
    this.productStock = productStock;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getCaptionImagePath() {
    return captionImagePath;
  }

  public void setCaptionImagePath(String captionImagePath) {
    this.captionImagePath = captionImagePath;
  }

  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
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
}
