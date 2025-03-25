package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FmaEntryTable
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FmaEntryTable {

  public FmaEntryTable() {}

  public FmaEntryTable(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(min = 0, max = 20)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<FmaEntry> fmaEntry;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public List<FmaEntry> getFmaEntry() {
    return fmaEntry;
  }

  public void setFmaEntry(List<FmaEntry> fmaEntry) {
    this.fmaEntry = fmaEntry;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FmaEntryTable dto)
      throws CFException {
    setFmaEntry(new ArrayList<>());
    int startPositionOfFmaEntry = dto.getStartOffset();
    int lenghtOfFmaEntry = com.cloudframe.app.dto.bbhsr002.FmaEntry.getFmaEntryFieldLength();
    int processedLengthOfFmaEntry = startPositionOfFmaEntry;
    for (int i = 0; i < dto.fmaEntrySize(); i++) {
      processedLengthOfFmaEntry = processedLengthOfFmaEntry + lenghtOfFmaEntry;
      if (processedLengthOfFmaEntry <= containerLength) {
        getFmaEntry().add(new FmaEntry(containerLength));
        getFmaEntry().get(i).populateFromDto(dto.getFmaEntry(i));
      } else break;
    }
  }
}
