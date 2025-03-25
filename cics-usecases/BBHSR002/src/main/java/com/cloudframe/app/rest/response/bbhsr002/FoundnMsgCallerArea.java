package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FoundnMsgCallerArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FoundnMsgCallerArea {

  public FoundnMsgCallerArea() {}

  public FoundnMsgCallerArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private FmaControlArea fmaControlArea;

  private FmaFixedArea fmaFixedArea;

  private FmaEntryTable fmaEntryTable;

  @Size(min = 0, max = 20)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<Short> fmaFieldNumber;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public FmaControlArea getFmaControlArea() {
    return fmaControlArea;
  }

  public void setFmaControlArea(FmaControlArea fmaControlArea) {
    this.fmaControlArea = fmaControlArea;
  }

  public FmaFixedArea getFmaFixedArea() {
    return fmaFixedArea;
  }

  public void setFmaFixedArea(FmaFixedArea fmaFixedArea) {
    this.fmaFixedArea = fmaFixedArea;
  }

  public FmaEntryTable getFmaEntryTable() {
    return fmaEntryTable;
  }

  public void setFmaEntryTable(FmaEntryTable fmaEntryTable) {
    this.fmaEntryTable = fmaEntryTable;
  }

  public List<Short> getFmaFieldNumber() {
    return fmaFieldNumber;
  }

  public void setFmaFieldNumber(List<Short> fmaFieldNumber) {
    this.fmaFieldNumber = fmaFieldNumber;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FoundnMsgCallerArea dto)
      throws CFException {
    setFmaControlArea(new FmaControlArea(containerLength));
    getFmaControlArea().populateFromDto(dto.getFmaControlArea());
    setFmaFixedArea(new FmaFixedArea(containerLength));
    getFmaFixedArea().populateFromDto(dto.getFmaFixedArea());
    setFmaEntryTable(new FmaEntryTable(containerLength));
    getFmaEntryTable().populateFromDto(dto.getFmaEntryTable());
    setFmaFieldNumber(new ArrayList<>());
    for (int i = 0; i < dto.fmaFieldNumberSize(); i++) {
      getFmaFieldNumber().add(dto.getFmaFieldNumber(i));
    }
  }
}
