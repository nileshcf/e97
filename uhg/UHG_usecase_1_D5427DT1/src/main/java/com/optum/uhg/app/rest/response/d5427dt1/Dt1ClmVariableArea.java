package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmVariableArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1ClmVariableArea {

  public Dt1ClmVariableArea() {}

  public Dt1ClmVariableArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(min = 0, max = 800)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<Dt1ClmClaimItem> dt1ClmClaimItem;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public List<Dt1ClmClaimItem> getDt1ClmClaimItem() {
    return dt1ClmClaimItem;
  }

  public void setDt1ClmClaimItem(List<Dt1ClmClaimItem> dt1ClmClaimItem) {
    this.dt1ClmClaimItem = dt1ClmClaimItem;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1ClmVariableArea dto)
      throws CFException {
    setDt1ClmClaimItem(new ArrayList<>());
    int startPositionOfDt1ClmClaimItem = dto.getStartOffset();
    int lenghtOfDt1ClmClaimItem =
        com.optum.uhg.app.dto.d5427dt1.Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength();
    int processedLengthOfDt1ClmClaimItem = startPositionOfDt1ClmClaimItem;
    for (int i = 0; i < dto.dt1ClmClaimItemSize(); i++) {
      processedLengthOfDt1ClmClaimItem = processedLengthOfDt1ClmClaimItem + lenghtOfDt1ClmClaimItem;
      if (processedLengthOfDt1ClmClaimItem <= containerLength) {
        getDt1ClmClaimItem().add(new Dt1ClmClaimItem(containerLength));
        getDt1ClmClaimItem().get(i).populateFromDto(dto.getDt1ClmClaimItem(i));
      } else break;
    }
  }
}
