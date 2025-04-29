package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1SrtVariableArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1SrtVariableArea {

  public Dt1SrtVariableArea() {}

  public Dt1SrtVariableArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private Dt1SrtArray dt1SrtArray;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public Dt1SrtArray getDt1SrtArray() {
    return dt1SrtArray;
  }

  public void setDt1SrtArray(Dt1SrtArray dt1SrtArray) {
    this.dt1SrtArray = dt1SrtArray;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1SrtVariableArea dto)
      throws CFException {
    setDt1SrtArray(new Dt1SrtArray(containerLength));
    getDt1SrtArray().populateFromDto(dto.getDt1SrtArray());
  }
}
