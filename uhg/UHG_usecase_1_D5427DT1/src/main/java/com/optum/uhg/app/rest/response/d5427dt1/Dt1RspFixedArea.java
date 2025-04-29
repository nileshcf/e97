package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1RspFixedArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1RspFixedArea {

  public Dt1RspFixedArea() {}

  public Dt1RspFixedArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspViewName = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspViewVersion = "";

  private Dt1RspLegacyResponseData dt1RspLegacyResponseData;

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspEmpid = "";

  @Size(max = 6)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspPolicy = "";

  private int dt1RspDepNbr;

  @Size(max = 12)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspFirstName = "";

  @Size(max = 20)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspLastName = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspRel = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspSystem = "";

  private int dt1RspPlanVariation;

  private int dt1RspReportingCode;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspFundingResponsibility = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspPatPhiInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspUhpInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspCcmRelSrvcInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspCcmPriorAuthInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspEbrPriorAuthInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspEbcPriorAuthInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspOncPolPrtcpCd = "";

  private int dt1RspTotalClaimCount;

  private int dt1RspCurrentClaimCount;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspExplCode = "";

  @Size(max = 80)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspNextKey = "";

  @Size(max = 16)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspClmContainerName = "";

  private long dt1RspClmContainerItemCnt;

  private long dt1RspClmContainerItemLen;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspGenTstPrtcpCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspSecOpinVendCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspUgiInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspLgiInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspExdInd = "";

  @Size(max = 154)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1RspFillerArea = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getDt1RspViewName() {
    return dt1RspViewName;
  }

  public void setDt1RspViewName(String dt1RspViewName) {
    this.dt1RspViewName = dt1RspViewName;
  }

  public String getDt1RspViewVersion() {
    return dt1RspViewVersion;
  }

  public void setDt1RspViewVersion(String dt1RspViewVersion) {
    this.dt1RspViewVersion = dt1RspViewVersion;
  }

  public Dt1RspLegacyResponseData getDt1RspLegacyResponseData() {
    return dt1RspLegacyResponseData;
  }

  public void setDt1RspLegacyResponseData(Dt1RspLegacyResponseData dt1RspLegacyResponseData) {
    this.dt1RspLegacyResponseData = dt1RspLegacyResponseData;
  }

  public String getDt1RspEmpid() {
    return dt1RspEmpid;
  }

  public void setDt1RspEmpid(String dt1RspEmpid) {
    this.dt1RspEmpid = dt1RspEmpid;
  }

  public String getDt1RspPolicy() {
    return dt1RspPolicy;
  }

  public void setDt1RspPolicy(String dt1RspPolicy) {
    this.dt1RspPolicy = dt1RspPolicy;
  }

  public int getDt1RspDepNbr() {
    return dt1RspDepNbr;
  }

  public void setDt1RspDepNbr(int dt1RspDepNbr) {
    this.dt1RspDepNbr = dt1RspDepNbr;
  }

  public String getDt1RspFirstName() {
    return dt1RspFirstName;
  }

  public void setDt1RspFirstName(String dt1RspFirstName) {
    this.dt1RspFirstName = dt1RspFirstName;
  }

  public String getDt1RspLastName() {
    return dt1RspLastName;
  }

  public void setDt1RspLastName(String dt1RspLastName) {
    this.dt1RspLastName = dt1RspLastName;
  }

  public String getDt1RspRel() {
    return dt1RspRel;
  }

  public void setDt1RspRel(String dt1RspRel) {
    this.dt1RspRel = dt1RspRel;
  }

  public String getDt1RspSystem() {
    return dt1RspSystem;
  }

  public void setDt1RspSystem(String dt1RspSystem) {
    this.dt1RspSystem = dt1RspSystem;
  }

  public int getDt1RspPlanVariation() {
    return dt1RspPlanVariation;
  }

  public void setDt1RspPlanVariation(int dt1RspPlanVariation) {
    this.dt1RspPlanVariation = dt1RspPlanVariation;
  }

  public int getDt1RspReportingCode() {
    return dt1RspReportingCode;
  }

  public void setDt1RspReportingCode(int dt1RspReportingCode) {
    this.dt1RspReportingCode = dt1RspReportingCode;
  }

  public String getDt1RspFundingResponsibility() {
    return dt1RspFundingResponsibility;
  }

  public void setDt1RspFundingResponsibility(String dt1RspFundingResponsibility) {
    this.dt1RspFundingResponsibility = dt1RspFundingResponsibility;
  }

  public String getDt1RspPatPhiInd() {
    return dt1RspPatPhiInd;
  }

  public void setDt1RspPatPhiInd(String dt1RspPatPhiInd) {
    this.dt1RspPatPhiInd = dt1RspPatPhiInd;
  }

  public String getDt1RspUhpInd() {
    return dt1RspUhpInd;
  }

  public void setDt1RspUhpInd(String dt1RspUhpInd) {
    this.dt1RspUhpInd = dt1RspUhpInd;
  }

  public String getDt1RspCcmRelSrvcInd() {
    return dt1RspCcmRelSrvcInd;
  }

  public void setDt1RspCcmRelSrvcInd(String dt1RspCcmRelSrvcInd) {
    this.dt1RspCcmRelSrvcInd = dt1RspCcmRelSrvcInd;
  }

  public String getDt1RspCcmPriorAuthInd() {
    return dt1RspCcmPriorAuthInd;
  }

  public void setDt1RspCcmPriorAuthInd(String dt1RspCcmPriorAuthInd) {
    this.dt1RspCcmPriorAuthInd = dt1RspCcmPriorAuthInd;
  }

  public String getDt1RspEbrPriorAuthInd() {
    return dt1RspEbrPriorAuthInd;
  }

  public void setDt1RspEbrPriorAuthInd(String dt1RspEbrPriorAuthInd) {
    this.dt1RspEbrPriorAuthInd = dt1RspEbrPriorAuthInd;
  }

  public String getDt1RspEbcPriorAuthInd() {
    return dt1RspEbcPriorAuthInd;
  }

  public void setDt1RspEbcPriorAuthInd(String dt1RspEbcPriorAuthInd) {
    this.dt1RspEbcPriorAuthInd = dt1RspEbcPriorAuthInd;
  }

  public String getDt1RspOncPolPrtcpCd() {
    return dt1RspOncPolPrtcpCd;
  }

  public void setDt1RspOncPolPrtcpCd(String dt1RspOncPolPrtcpCd) {
    this.dt1RspOncPolPrtcpCd = dt1RspOncPolPrtcpCd;
  }

  public int getDt1RspTotalClaimCount() {
    return dt1RspTotalClaimCount;
  }

  public void setDt1RspTotalClaimCount(int dt1RspTotalClaimCount) {
    this.dt1RspTotalClaimCount = dt1RspTotalClaimCount;
  }

  public int getDt1RspCurrentClaimCount() {
    return dt1RspCurrentClaimCount;
  }

  public void setDt1RspCurrentClaimCount(int dt1RspCurrentClaimCount) {
    this.dt1RspCurrentClaimCount = dt1RspCurrentClaimCount;
  }

  public String getDt1RspExplCode() {
    return dt1RspExplCode;
  }

  public void setDt1RspExplCode(String dt1RspExplCode) {
    this.dt1RspExplCode = dt1RspExplCode;
  }

  public String getDt1RspNextKey() {
    return dt1RspNextKey;
  }

  public void setDt1RspNextKey(String dt1RspNextKey) {
    this.dt1RspNextKey = dt1RspNextKey;
  }

  public String getDt1RspClmContainerName() {
    return dt1RspClmContainerName;
  }

  public void setDt1RspClmContainerName(String dt1RspClmContainerName) {
    this.dt1RspClmContainerName = dt1RspClmContainerName;
  }

  public long getDt1RspClmContainerItemCnt() {
    return dt1RspClmContainerItemCnt;
  }

  public void setDt1RspClmContainerItemCnt(long dt1RspClmContainerItemCnt) {
    this.dt1RspClmContainerItemCnt = dt1RspClmContainerItemCnt;
  }

  public long getDt1RspClmContainerItemLen() {
    return dt1RspClmContainerItemLen;
  }

  public void setDt1RspClmContainerItemLen(long dt1RspClmContainerItemLen) {
    this.dt1RspClmContainerItemLen = dt1RspClmContainerItemLen;
  }

  public String getDt1RspGenTstPrtcpCd() {
    return dt1RspGenTstPrtcpCd;
  }

  public void setDt1RspGenTstPrtcpCd(String dt1RspGenTstPrtcpCd) {
    this.dt1RspGenTstPrtcpCd = dt1RspGenTstPrtcpCd;
  }

  public String getDt1RspSecOpinVendCd() {
    return dt1RspSecOpinVendCd;
  }

  public void setDt1RspSecOpinVendCd(String dt1RspSecOpinVendCd) {
    this.dt1RspSecOpinVendCd = dt1RspSecOpinVendCd;
  }

  public String getDt1RspUgiInd() {
    return dt1RspUgiInd;
  }

  public void setDt1RspUgiInd(String dt1RspUgiInd) {
    this.dt1RspUgiInd = dt1RspUgiInd;
  }

  public String getDt1RspLgiInd() {
    return dt1RspLgiInd;
  }

  public void setDt1RspLgiInd(String dt1RspLgiInd) {
    this.dt1RspLgiInd = dt1RspLgiInd;
  }

  public String getDt1RspExdInd() {
    return dt1RspExdInd;
  }

  public void setDt1RspExdInd(String dt1RspExdInd) {
    this.dt1RspExdInd = dt1RspExdInd;
  }

  public String getDt1RspFillerArea() {
    return dt1RspFillerArea;
  }

  public void setDt1RspFillerArea(String dt1RspFillerArea) {
    this.dt1RspFillerArea = dt1RspFillerArea;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1RspFixedArea dto)
      throws CFException {
    setDt1RspViewName(CFUtil.trim(dto.getDt1RspViewName()));
    setDt1RspViewVersion(CFUtil.trim(dto.getDt1RspViewVersion()));
    setDt1RspLegacyResponseData(new Dt1RspLegacyResponseData(containerLength));
    getDt1RspLegacyResponseData().populateFromDto(dto.getDt1RspLegacyResponseData());
    setDt1RspEmpid(CFUtil.trim(dto.getDt1RspEmpid()));
    setDt1RspPolicy(CFUtil.trim(dto.getDt1RspPolicy()));
    setDt1RspDepNbr(dto.getDt1RspDepNbr());
    setDt1RspFirstName(CFUtil.trim(dto.getDt1RspFirstName()));
    setDt1RspLastName(CFUtil.trim(dto.getDt1RspLastName()));
    setDt1RspRel(CFUtil.trim(dto.getDt1RspRel()));
    setDt1RspSystem(CFUtil.trim(dto.getDt1RspSystem()));
    setDt1RspPlanVariation(dto.getDt1RspPlanVariation());
    setDt1RspReportingCode(dto.getDt1RspReportingCode());
    setDt1RspFundingResponsibility(CFUtil.trim(dto.getDt1RspFundingResponsibility()));
    setDt1RspPatPhiInd(CFUtil.trim(dto.getDt1RspPatPhiInd()));
    setDt1RspUhpInd(CFUtil.trim(dto.getDt1RspUhpInd()));
    setDt1RspCcmRelSrvcInd(CFUtil.trim(dto.getDt1RspCcmRelSrvcInd()));
    setDt1RspCcmPriorAuthInd(CFUtil.trim(dto.getDt1RspCcmPriorAuthInd()));
    setDt1RspEbrPriorAuthInd(CFUtil.trim(dto.getDt1RspEbrPriorAuthInd()));
    setDt1RspEbcPriorAuthInd(CFUtil.trim(dto.getDt1RspEbcPriorAuthInd()));
    setDt1RspOncPolPrtcpCd(CFUtil.trim(dto.getDt1RspOncPolPrtcpCd()));
    setDt1RspTotalClaimCount(dto.getDt1RspTotalClaimCount());
    setDt1RspCurrentClaimCount(dto.getDt1RspCurrentClaimCount());
    setDt1RspExplCode(CFUtil.trim(dto.getDt1RspExplCode()));
    setDt1RspNextKey(CFUtil.trim(dto.getDt1RspNextKey()));
    setDt1RspClmContainerName(CFUtil.trim(dto.getDt1RspClmContainerName()));
    setDt1RspClmContainerItemCnt(dto.getDt1RspClmContainerItemCnt());
    setDt1RspClmContainerItemLen(dto.getDt1RspClmContainerItemLen());
    setDt1RspGenTstPrtcpCd(CFUtil.trim(dto.getDt1RspGenTstPrtcpCd()));
    setDt1RspSecOpinVendCd(CFUtil.trim(dto.getDt1RspSecOpinVendCd()));
    setDt1RspUgiInd(CFUtil.trim(dto.getDt1RspUgiInd()));
    setDt1RspLgiInd(CFUtil.trim(dto.getDt1RspLgiInd()));
    setDt1RspExdInd(CFUtil.trim(dto.getDt1RspExdInd()));
    setDt1RspFillerArea(CFUtil.trim(dto.getDt1RspFillerArea()));
  }
}
