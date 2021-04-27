package com.demo.module.demo02;

import com.demo.module.Artist;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class ValidationListener {

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @PrePersist
  @PreUpdate
  private void validate(Artist artist) {
    System.out.println(".DataValidationListener validate()");
    if (artist.getFirstName() == null || "".equals(artist.getFirstName()))
      throw new IllegalArgumentException("Invalid first name");
    if (artist.getLastName() == null || "".equals(artist.getLastName()))
      throw new IllegalArgumentException("Invalid last name");
  }
}