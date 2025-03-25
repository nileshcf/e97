package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRetBhiInfo
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRetBhiInfo {

  public HsrRetBhiInfo() {}

  public HsrRetBhiInfo(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetHipaaCd = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetHipaaCdMod = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetGrnrcReqCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetInnCovIndicator = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetT1CovIndicator = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetOonCovIndicator = "";

  private int hsrRetNetCnt;

  @Size(min = 0, max = 12)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<HsrRetNetInfo> hsrRetNetInfo;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrRetHipaaCd() {
    return hsrRetHipaaCd;
  }

  public void setHsrRetHipaaCd(String hsrRetHipaaCd) {
    this.hsrRetHipaaCd = hsrRetHipaaCd;
  }

  public String getHsrRetHipaaCdMod() {
    return hsrRetHipaaCdMod;
  }

  public void setHsrRetHipaaCdMod(String hsrRetHipaaCdMod) {
    this.hsrRetHipaaCdMod = hsrRetHipaaCdMod;
  }

  public String getHsrRetGrnrcReqCd() {
    return hsrRetGrnrcReqCd;
  }

  public void setHsrRetGrnrcReqCd(String hsrRetGrnrcReqCd) {
    this.hsrRetGrnrcReqCd = hsrRetGrnrcReqCd;
  }

  public String getHsrRetInnCovIndicator() {
    return hsrRetInnCovIndicator;
  }

  public void setHsrRetInnCovIndicator(String hsrRetInnCovIndicator) {
    this.hsrRetInnCovIndicator = hsrRetInnCovIndicator;
  }

  public String getHsrRetT1CovIndicator() {
    return hsrRetT1CovIndicator;
  }

  public void setHsrRetT1CovIndicator(String hsrRetT1CovIndicator) {
    this.hsrRetT1CovIndicator = hsrRetT1CovIndicator;
  }

  public String getHsrRetOonCovIndicator() {
    return hsrRetOonCovIndicator;
  }

  public void setHsrRetOonCovIndicator(String hsrRetOonCovIndicator) {
    this.hsrRetOonCovIndicator = hsrRetOonCovIndicator;
  }

  public int getHsrRetNetCnt() {
    return hsrRetNetCnt;
  }

  public void setHsrRetNetCnt(int hsrRetNetCnt) {
    this.hsrRetNetCnt = hsrRetNetCnt;
  }

  public List<HsrRetNetInfo> getHsrRetNetInfo() {
    return hsrRetNetInfo;
  }

  public void setHsrRetNetInfo(List<HsrRetNetInfo> hsrRetNetInfo) {
    this.hsrRetNetInfo = hsrRetNetInfo;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrRetBhiInfo dto)
      throws CFException {
    setHsrRetHipaaCd(CFUtil.trim(dto.getHsrRetHipaaCd()));
    setHsrRetHipaaCdMod(CFUtil.trim(dto.getHsrRetHipaaCdMod()));
    setHsrRetGrnrcReqCd(CFUtil.trim(dto.getHsrRetGrnrcReqCd()));
    setHsrRetInnCovIndicator(CFUtil.trim(dto.getHsrRetInnCovIndicator()));
    setHsrRetT1CovIndicator(CFUtil.trim(dto.getHsrRetT1CovIndicator()));
    setHsrRetOonCovIndicator(CFUtil.trim(dto.getHsrRetOonCovIndicator()));
    setHsrRetNetCnt(dto.getHsrRetNetCnt());
    setHsrRetNetInfo(new ArrayList<>());
    int startPositionOfHsrRetNetInfo = dto.getStartOffset();
    int lenghtOfHsrRetNetInfo =
        com.cloudframe.app.dto.bbhsr002.HsrRetNetInfo.getHsrRetNetInfoFieldLength();
    int processedLengthOfHsrRetNetInfo = startPositionOfHsrRetNetInfo;
    for (int i = 0; i < dto.hsrRetNetInfoSize(); i++) {
      processedLengthOfHsrRetNetInfo = processedLengthOfHsrRetNetInfo + lenghtOfHsrRetNetInfo;
      if (processedLengthOfHsrRetNetInfo <= containerLength) {
        getHsrRetNetInfo().add(new HsrRetNetInfo(containerLength));
        getHsrRetNetInfo().get(i).populateFromDto(dto.getHsrRetNetInfo(i));
      } else break;
    }
  }
}
