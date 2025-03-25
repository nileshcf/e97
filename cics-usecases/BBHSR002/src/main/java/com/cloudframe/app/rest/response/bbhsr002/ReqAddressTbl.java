package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqAddressTbl
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqAddressTbl {

  public ReqAddressTbl() {}

  public ReqAddressTbl(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private long reqTblLength;

  private ReqTblLengthRedefined reqTblLengthRedefined;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public long getReqTblLength() {
    return reqTblLength;
  }

  public void setReqTblLength(long reqTblLength) {
    this.reqTblLength = reqTblLength;
  }

  public ReqTblLengthRedefined getReqTblLengthRedefined() {
    return reqTblLengthRedefined;
  }

  public void setReqTblLengthRedefined(ReqTblLengthRedefined reqTblLengthRedefined) {
    this.reqTblLengthRedefined = reqTblLengthRedefined;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.ReqAddressTbl dto)
      throws CFException {
    setReqTblLength(dto.getReqTblLength());
    setReqTblLengthRedefined(new ReqTblLengthRedefined(containerLength));
    getReqTblLengthRedefined().populateFromDto(dto.getReqTblLengthRedefined());
  }
}
