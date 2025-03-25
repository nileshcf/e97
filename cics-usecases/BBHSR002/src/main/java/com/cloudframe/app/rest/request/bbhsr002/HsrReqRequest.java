package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReqRequest
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReqRequest {

  public HsrReqRequest() {}

  public HsrReqRequest(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqCovTypCd = "";

  @Size(max = 6)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqMxiPolicy = "";

  private int hsrReqMxiPlan;

  private int hsrReqMxiClass;

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqHipaaServTypCd = "";

  private long hsrReqEffDate;

  private long hsrReqCancelDate;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqVersionNo = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqBnReqStartDt = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrReqCovTypCd() {
    return hsrReqCovTypCd;
  }

  public void setHsrReqCovTypCd(String hsrReqCovTypCd) {
    this.hsrReqCovTypCd = hsrReqCovTypCd;
  }

  public String getHsrReqMxiPolicy() {
    return hsrReqMxiPolicy;
  }

  public void setHsrReqMxiPolicy(String hsrReqMxiPolicy) {
    this.hsrReqMxiPolicy = hsrReqMxiPolicy;
  }

  public int getHsrReqMxiPlan() {
    return hsrReqMxiPlan;
  }

  public void setHsrReqMxiPlan(int hsrReqMxiPlan) {
    this.hsrReqMxiPlan = hsrReqMxiPlan;
  }

  public int getHsrReqMxiClass() {
    return hsrReqMxiClass;
  }

  public void setHsrReqMxiClass(int hsrReqMxiClass) {
    this.hsrReqMxiClass = hsrReqMxiClass;
  }

  public String getHsrReqHipaaServTypCd() {
    return hsrReqHipaaServTypCd;
  }

  public void setHsrReqHipaaServTypCd(String hsrReqHipaaServTypCd) {
    this.hsrReqHipaaServTypCd = hsrReqHipaaServTypCd;
  }

  public long getHsrReqEffDate() {
    return hsrReqEffDate;
  }

  public void setHsrReqEffDate(long hsrReqEffDate) {
    this.hsrReqEffDate = hsrReqEffDate;
  }

  public long getHsrReqCancelDate() {
    return hsrReqCancelDate;
  }

  public void setHsrReqCancelDate(long hsrReqCancelDate) {
    this.hsrReqCancelDate = hsrReqCancelDate;
  }

  public String getHsrReqVersionNo() {
    return hsrReqVersionNo;
  }

  public void setHsrReqVersionNo(String hsrReqVersionNo) {
    this.hsrReqVersionNo = hsrReqVersionNo;
  }

  public String getHsrReqBnReqStartDt() {
    return hsrReqBnReqStartDt;
  }

  public void setHsrReqBnReqStartDt(String hsrReqBnReqStartDt) {
    this.hsrReqBnReqStartDt = hsrReqBnReqStartDt;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrReqRequest dto) {
    dto.setHsrReqCovTypCd(getHsrReqCovTypCd().toCharArray());
    dto.setHsrReqMxiPolicy(getHsrReqMxiPolicy().toCharArray());
    dto.setHsrReqMxiPlan(getHsrReqMxiPlan());
    dto.setHsrReqMxiClass(getHsrReqMxiClass());
    dto.setHsrReqHipaaServTypCd(getHsrReqHipaaServTypCd().toCharArray());
    dto.setHsrReqEffDate(getHsrReqEffDate());
    dto.setHsrReqCancelDate(getHsrReqCancelDate());
    dto.setHsrReqVersionNo(getHsrReqVersionNo().toCharArray());
    dto.setHsrReqBnReqStartDt(getHsrReqBnReqStartDt().toCharArray());
  }
}
