package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsContainer
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class StsContainer {

  public StsContainer() {}

  public StsContainer(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private StsFixedArea stsFixedArea;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public StsFixedArea getStsFixedArea() {
    return stsFixedArea;
  }

  public void setStsFixedArea(StsFixedArea stsFixedArea) {
    this.stsFixedArea = stsFixedArea;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.StsContainer dto) throws CFException {
    setStsFixedArea(new StsFixedArea(containerLength));
    getStsFixedArea().populateFromDto(dto.getStsFixedArea());
  }
}
