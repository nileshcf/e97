package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRetArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRetArea {

  public HsrRetArea() {}

  public HsrRetArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private int hsrRetHipaaCnt;

  private HsrRetReturn hsrRetReturn;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public int getHsrRetHipaaCnt() {
    return hsrRetHipaaCnt;
  }

  public void setHsrRetHipaaCnt(int hsrRetHipaaCnt) {
    this.hsrRetHipaaCnt = hsrRetHipaaCnt;
  }

  public HsrRetReturn getHsrRetReturn() {
    return hsrRetReturn;
  }

  public void setHsrRetReturn(HsrRetReturn hsrRetReturn) {
    this.hsrRetReturn = hsrRetReturn;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrRetArea dto) throws CFException {
    setHsrRetHipaaCnt(dto.getHsrRetHipaaCnt());
    setHsrRetReturn(new HsrRetReturn(containerLength));
    getHsrRetReturn().populateFromDto(dto.getHsrRetReturn());
  }
}
