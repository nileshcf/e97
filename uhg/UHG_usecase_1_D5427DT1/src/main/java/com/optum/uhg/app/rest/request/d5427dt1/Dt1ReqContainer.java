package com.optum.uhg.app.rest.request.d5427dt1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ReqContainer
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1ReqContainer {

  public Dt1ReqContainer() {}

  public Dt1ReqContainer(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private Dt1RequestArea dt1RequestArea;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public Dt1RequestArea getDt1RequestArea() {
    return dt1RequestArea;
  }

  public void setDt1RequestArea(Dt1RequestArea dt1RequestArea) {
    this.dt1RequestArea = dt1RequestArea;
  }

  @Hidden
  public void populateToDto(com.optum.uhg.app.dto.d5427dt1.Dt1ReqContainer dto) {
    getDt1RequestArea().populateToDto(dto.getDt1RequestArea());
  }
}
