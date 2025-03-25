package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRetGetmainIdentifier
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRetGetmainIdentifier {

  public HsrRetGetmainIdentifier() {}

  public HsrRetGetmainIdentifier(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetGetmainCreator = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetGetmainCopybook = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrRetGetmainCreator() {
    return hsrRetGetmainCreator;
  }

  public void setHsrRetGetmainCreator(String hsrRetGetmainCreator) {
    this.hsrRetGetmainCreator = hsrRetGetmainCreator;
  }

  public String getHsrRetGetmainCopybook() {
    return hsrRetGetmainCopybook;
  }

  public void setHsrRetGetmainCopybook(String hsrRetGetmainCopybook) {
    this.hsrRetGetmainCopybook = hsrRetGetmainCopybook;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrRetGetmainIdentifier dto)
      throws CFException {
    setHsrRetGetmainCreator(CFUtil.trim(dto.getHsrRetGetmainCreator()));
    setHsrRetGetmainCopybook(CFUtil.trim(dto.getHsrRetGetmainCopybook()));
  }
}
