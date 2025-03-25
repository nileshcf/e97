package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FmaFixedArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FmaFixedArea {

  public FmaFixedArea() {}

  public FmaFixedArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private FmaIpEntry fmaIpEntry;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public FmaIpEntry getFmaIpEntry() {
    return fmaIpEntry;
  }

  public void setFmaIpEntry(FmaIpEntry fmaIpEntry) {
    this.fmaIpEntry = fmaIpEntry;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FmaFixedArea dto) throws CFException {
    setFmaIpEntry(new FmaIpEntry(containerLength));
    getFmaIpEntry().populateFromDto(dto.getFmaIpEntry());
  }
}
