package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqTblLengthRedefined
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqTblLengthRedefined {

  public ReqTblLengthRedefined() {}

  public ReqTblLengthRedefined(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private short reqTblAddressLength;

  private int reqTblAddress;

  private int reqTblAddressPtr;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public short getReqTblAddressLength() {
    return reqTblAddressLength;
  }

  public void setReqTblAddressLength(short reqTblAddressLength) {
    this.reqTblAddressLength = reqTblAddressLength;
  }

  public int getReqTblAddress() {
    return reqTblAddress;
  }

  public void setReqTblAddress(int reqTblAddress) {
    this.reqTblAddress = reqTblAddress;
  }

  public int getReqTblAddressPtr() {
    return reqTblAddressPtr;
  }

  public void setReqTblAddressPtr(int reqTblAddressPtr) {
    this.reqTblAddressPtr = reqTblAddressPtr;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.ReqTblLengthRedefined dto) {
    dto.setReqTblAddressLength(getReqTblAddressLength());
    dto.setReqTblAddress(getReqTblAddress());
    dto.setReqTblAddressPtr(getReqTblAddressPtr());
  }
}
