package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1RspContainer
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1RspContainer {

  public Dt1RspContainer() {}

  public Dt1RspContainer(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private Dt1RspFixedArea dt1RspFixedArea;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public Dt1RspFixedArea getDt1RspFixedArea() {
    return dt1RspFixedArea;
  }

  public void setDt1RspFixedArea(Dt1RspFixedArea dt1RspFixedArea) {
    this.dt1RspFixedArea = dt1RspFixedArea;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1RspContainer dto)
      throws CFException {
    setDt1RspFixedArea(new Dt1RspFixedArea(containerLength));
    getDt1RspFixedArea().populateFromDto(dto.getDt1RspFixedArea());
  }
}
