package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.F5957reqInput
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class F5957reqInput {

  public F5957reqInput() {}

  public F5957reqInput(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqAction = "";

  private ReqViewName reqViewName;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqCoverageType = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqCallingProgram = "";

  private int reqReturnCode;

  private int reqExplanationCode;

  private ReqAddressArea reqAddressArea;

  private ReqAddressAreaTbl reqAddressAreaTbl;

  @Size(max = 150)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqRequestParms = "";

  private ReqRequestParmsRedef reqRequestParmsRedef;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getReqAction() {
    return reqAction;
  }

  public void setReqAction(String reqAction) {
    this.reqAction = reqAction;
  }

  public ReqViewName getReqViewName() {
    return reqViewName;
  }

  public void setReqViewName(ReqViewName reqViewName) {
    this.reqViewName = reqViewName;
  }

  public String getReqCoverageType() {
    return reqCoverageType;
  }

  public void setReqCoverageType(String reqCoverageType) {
    this.reqCoverageType = reqCoverageType;
  }

  public String getReqCallingProgram() {
    return reqCallingProgram;
  }

  public void setReqCallingProgram(String reqCallingProgram) {
    this.reqCallingProgram = reqCallingProgram;
  }

  public int getReqReturnCode() {
    return reqReturnCode;
  }

  public void setReqReturnCode(int reqReturnCode) {
    this.reqReturnCode = reqReturnCode;
  }

  public int getReqExplanationCode() {
    return reqExplanationCode;
  }

  public void setReqExplanationCode(int reqExplanationCode) {
    this.reqExplanationCode = reqExplanationCode;
  }

  public ReqAddressArea getReqAddressArea() {
    return reqAddressArea;
  }

  public void setReqAddressArea(ReqAddressArea reqAddressArea) {
    this.reqAddressArea = reqAddressArea;
  }

  public ReqAddressAreaTbl getReqAddressAreaTbl() {
    return reqAddressAreaTbl;
  }

  public void setReqAddressAreaTbl(ReqAddressAreaTbl reqAddressAreaTbl) {
    this.reqAddressAreaTbl = reqAddressAreaTbl;
  }

  public String getReqRequestParms() {
    return reqRequestParms;
  }

  public void setReqRequestParms(String reqRequestParms) {
    this.reqRequestParms = reqRequestParms;
  }

  public ReqRequestParmsRedef getReqRequestParmsRedef() {
    return reqRequestParmsRedef;
  }

  public void setReqRequestParmsRedef(ReqRequestParmsRedef reqRequestParmsRedef) {
    this.reqRequestParmsRedef = reqRequestParmsRedef;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.F5957reqInput dto)
      throws CFException {
    setReqAction(CFUtil.trim(dto.getReqAction()));
    setReqViewName(new ReqViewName(containerLength));
    getReqViewName().populateFromDto(dto.getReqViewName());
    setReqCoverageType(CFUtil.trim(dto.getReqCoverageType()));
    setReqCallingProgram(CFUtil.trim(dto.getReqCallingProgram()));
    setReqReturnCode(dto.getReqReturnCode());
    setReqExplanationCode(dto.getReqExplanationCode());
    setReqAddressArea(new ReqAddressArea(containerLength));
    getReqAddressArea().populateFromDto(dto.getReqAddressArea());
    setReqAddressAreaTbl(new ReqAddressAreaTbl(containerLength));
    getReqAddressAreaTbl().populateFromDto(dto.getReqAddressAreaTbl());
    setReqRequestParms(CFUtil.trim(dto.getReqRequestParms()));
    setReqRequestParmsRedef(new ReqRequestParmsRedef(containerLength));
    getReqRequestParmsRedef().populateFromDto(dto.getReqRequestParmsRedef());
  }
}
