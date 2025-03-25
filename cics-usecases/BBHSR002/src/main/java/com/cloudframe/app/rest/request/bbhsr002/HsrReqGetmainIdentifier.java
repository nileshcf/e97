package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReqGetmainIdentifier
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReqGetmainIdentifier {

  public HsrReqGetmainIdentifier() {}

  public HsrReqGetmainIdentifier(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqGetmainCreator = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqGetmainCopybook = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrReqGetmainCreator() {
    return hsrReqGetmainCreator;
  }

  public void setHsrReqGetmainCreator(String hsrReqGetmainCreator) {
    this.hsrReqGetmainCreator = hsrReqGetmainCreator;
  }

  public String getHsrReqGetmainCopybook() {
    return hsrReqGetmainCopybook;
  }

  public void setHsrReqGetmainCopybook(String hsrReqGetmainCopybook) {
    this.hsrReqGetmainCopybook = hsrReqGetmainCopybook;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrReqGetmainIdentifier dto) {
    dto.setHsrReqGetmainCreator(getHsrReqGetmainCreator().toCharArray());
    dto.setHsrReqGetmainCopybook(getHsrReqGetmainCopybook().toCharArray());
  }
}
