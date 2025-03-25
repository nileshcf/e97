package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.List;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqHsrHipaaList
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqHsrHipaaList {

  public ReqHsrHipaaList() {}

  public ReqHsrHipaaList(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(min = 0, max = 9)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<String> reqHipaaCdItem;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public List<String> getReqHipaaCdItem() {
    return reqHipaaCdItem;
  }

  public void setReqHipaaCdItem(List<String> reqHipaaCdItem) {
    this.reqHipaaCdItem = reqHipaaCdItem;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.ReqHsrHipaaList dto) {
    if (getReqHipaaCdItem() != null) {
      for (int i = 0; i < getReqHipaaCdItem().size(); i++) {
        dto.setReqHipaaCdItem(i, getReqHipaaCdItem().get(i).toCharArray());
      }
    }
  }
}
