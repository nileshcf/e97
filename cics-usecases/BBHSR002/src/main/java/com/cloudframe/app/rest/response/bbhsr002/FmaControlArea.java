package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FmaControlArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FmaControlArea {

  public FmaControlArea() {}

  public FmaControlArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private short fmaSubscript;

  private short fmaEntryTableOccurs;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaDoneSw = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public short getFmaSubscript() {
    return fmaSubscript;
  }

  public void setFmaSubscript(short fmaSubscript) {
    this.fmaSubscript = fmaSubscript;
  }

  public short getFmaEntryTableOccurs() {
    return fmaEntryTableOccurs;
  }

  public void setFmaEntryTableOccurs(short fmaEntryTableOccurs) {
    this.fmaEntryTableOccurs = fmaEntryTableOccurs;
  }

  public String getFmaDoneSw() {
    return fmaDoneSw;
  }

  public void setFmaDoneSw(String fmaDoneSw) {
    this.fmaDoneSw = fmaDoneSw;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FmaControlArea dto)
      throws CFException {
    setFmaSubscript(dto.getFmaSubscript());
    setFmaEntryTableOccurs(dto.getFmaEntryTableOccurs());
    setFmaDoneSw(CFUtil.trim(dto.getFmaDoneSw()));
  }
}
