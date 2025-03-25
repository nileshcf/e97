package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqView
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqView {

  public ReqView() {}

  public ReqView(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqView2Bytes = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqView1Byte = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getReqView2Bytes() {
    return reqView2Bytes;
  }

  public void setReqView2Bytes(String reqView2Bytes) {
    this.reqView2Bytes = reqView2Bytes;
  }

  public String getReqView1Byte() {
    return reqView1Byte;
  }

  public void setReqView1Byte(String reqView1Byte) {
    this.reqView1Byte = reqView1Byte;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.ReqView dto) {
    dto.setReqView2Bytes(getReqView2Bytes().toCharArray());
    dto.setReqView1Byte(getReqView1Byte().toCharArray());
  }
}
