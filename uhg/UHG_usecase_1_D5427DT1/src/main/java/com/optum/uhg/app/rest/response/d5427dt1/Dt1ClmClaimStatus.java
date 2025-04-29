package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmClaimStatus
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1ClmClaimStatus {

  public Dt1ClmClaimStatus() {}

  public Dt1ClmClaimStatus(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmUnprocFlag = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmClosedFlag = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPendedFlag = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmRejectedFlag = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPaidFlag = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getDt1ClmUnprocFlag() {
    return dt1ClmUnprocFlag;
  }

  public void setDt1ClmUnprocFlag(String dt1ClmUnprocFlag) {
    this.dt1ClmUnprocFlag = dt1ClmUnprocFlag;
  }

  public String getDt1ClmClosedFlag() {
    return dt1ClmClosedFlag;
  }

  public void setDt1ClmClosedFlag(String dt1ClmClosedFlag) {
    this.dt1ClmClosedFlag = dt1ClmClosedFlag;
  }

  public String getDt1ClmPendedFlag() {
    return dt1ClmPendedFlag;
  }

  public void setDt1ClmPendedFlag(String dt1ClmPendedFlag) {
    this.dt1ClmPendedFlag = dt1ClmPendedFlag;
  }

  public String getDt1ClmRejectedFlag() {
    return dt1ClmRejectedFlag;
  }

  public void setDt1ClmRejectedFlag(String dt1ClmRejectedFlag) {
    this.dt1ClmRejectedFlag = dt1ClmRejectedFlag;
  }

  public String getDt1ClmPaidFlag() {
    return dt1ClmPaidFlag;
  }

  public void setDt1ClmPaidFlag(String dt1ClmPaidFlag) {
    this.dt1ClmPaidFlag = dt1ClmPaidFlag;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1ClmClaimStatus dto)
      throws CFException {
    setDt1ClmUnprocFlag(CFUtil.trim(dto.getDt1ClmUnprocFlag()));
    setDt1ClmClosedFlag(CFUtil.trim(dto.getDt1ClmClosedFlag()));
    setDt1ClmPendedFlag(CFUtil.trim(dto.getDt1ClmPendedFlag()));
    setDt1ClmRejectedFlag(CFUtil.trim(dto.getDt1ClmRejectedFlag()));
    setDt1ClmPaidFlag(CFUtil.trim(dto.getDt1ClmPaidFlag()));
  }
}
