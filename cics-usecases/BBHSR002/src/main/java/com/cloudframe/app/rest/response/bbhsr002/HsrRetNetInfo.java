package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRetNetInfo
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRetNetInfo {

  public HsrRetNetInfo() {}

  public HsrRetNetInfo(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 6)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetSlotTblId = "";

  @Size(max = 6)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetSrvcCd = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetPlOfSrvcCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetCausCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetBenLvlCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetNetInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetInNtwkClssCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetT1NtwkClssCd = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetSrvcCdNbr = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetProcRangeFrom = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetProcRangeTo = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetProcCdType = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetProvOrgTypCd = "";

  @Size(max = 300)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetHipaaCommtTxt = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrRetSlotTblId() {
    return hsrRetSlotTblId;
  }

  public void setHsrRetSlotTblId(String hsrRetSlotTblId) {
    this.hsrRetSlotTblId = hsrRetSlotTblId;
  }

  public String getHsrRetSrvcCd() {
    return hsrRetSrvcCd;
  }

  public void setHsrRetSrvcCd(String hsrRetSrvcCd) {
    this.hsrRetSrvcCd = hsrRetSrvcCd;
  }

  public String getHsrRetPlOfSrvcCd() {
    return hsrRetPlOfSrvcCd;
  }

  public void setHsrRetPlOfSrvcCd(String hsrRetPlOfSrvcCd) {
    this.hsrRetPlOfSrvcCd = hsrRetPlOfSrvcCd;
  }

  public String getHsrRetCausCd() {
    return hsrRetCausCd;
  }

  public void setHsrRetCausCd(String hsrRetCausCd) {
    this.hsrRetCausCd = hsrRetCausCd;
  }

  public String getHsrRetBenLvlCd() {
    return hsrRetBenLvlCd;
  }

  public void setHsrRetBenLvlCd(String hsrRetBenLvlCd) {
    this.hsrRetBenLvlCd = hsrRetBenLvlCd;
  }

  public String getHsrRetNetInd() {
    return hsrRetNetInd;
  }

  public void setHsrRetNetInd(String hsrRetNetInd) {
    this.hsrRetNetInd = hsrRetNetInd;
  }

  public String getHsrRetInNtwkClssCd() {
    return hsrRetInNtwkClssCd;
  }

  public void setHsrRetInNtwkClssCd(String hsrRetInNtwkClssCd) {
    this.hsrRetInNtwkClssCd = hsrRetInNtwkClssCd;
  }

  public String getHsrRetT1NtwkClssCd() {
    return hsrRetT1NtwkClssCd;
  }

  public void setHsrRetT1NtwkClssCd(String hsrRetT1NtwkClssCd) {
    this.hsrRetT1NtwkClssCd = hsrRetT1NtwkClssCd;
  }

  public String getHsrRetSrvcCdNbr() {
    return hsrRetSrvcCdNbr;
  }

  public void setHsrRetSrvcCdNbr(String hsrRetSrvcCdNbr) {
    this.hsrRetSrvcCdNbr = hsrRetSrvcCdNbr;
  }

  public String getHsrRetProcRangeFrom() {
    return hsrRetProcRangeFrom;
  }

  public void setHsrRetProcRangeFrom(String hsrRetProcRangeFrom) {
    this.hsrRetProcRangeFrom = hsrRetProcRangeFrom;
  }

  public String getHsrRetProcRangeTo() {
    return hsrRetProcRangeTo;
  }

  public void setHsrRetProcRangeTo(String hsrRetProcRangeTo) {
    this.hsrRetProcRangeTo = hsrRetProcRangeTo;
  }

  public String getHsrRetProcCdType() {
    return hsrRetProcCdType;
  }

  public void setHsrRetProcCdType(String hsrRetProcCdType) {
    this.hsrRetProcCdType = hsrRetProcCdType;
  }

  public String getHsrRetProvOrgTypCd() {
    return hsrRetProvOrgTypCd;
  }

  public void setHsrRetProvOrgTypCd(String hsrRetProvOrgTypCd) {
    this.hsrRetProvOrgTypCd = hsrRetProvOrgTypCd;
  }

  public String getHsrRetHipaaCommtTxt() {
    return hsrRetHipaaCommtTxt;
  }

  public void setHsrRetHipaaCommtTxt(String hsrRetHipaaCommtTxt) {
    this.hsrRetHipaaCommtTxt = hsrRetHipaaCommtTxt;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrRetNetInfo dto)
      throws CFException {
    setHsrRetSlotTblId(CFUtil.trim(dto.getHsrRetSlotTblId()));
    setHsrRetSrvcCd(CFUtil.trim(dto.getHsrRetSrvcCd()));
    setHsrRetPlOfSrvcCd(CFUtil.trim(dto.getHsrRetPlOfSrvcCd()));
    setHsrRetCausCd(CFUtil.trim(dto.getHsrRetCausCd()));
    setHsrRetBenLvlCd(CFUtil.trim(dto.getHsrRetBenLvlCd()));
    setHsrRetNetInd(CFUtil.trim(dto.getHsrRetNetInd()));
    setHsrRetInNtwkClssCd(CFUtil.trim(dto.getHsrRetInNtwkClssCd()));
    setHsrRetT1NtwkClssCd(CFUtil.trim(dto.getHsrRetT1NtwkClssCd()));
    setHsrRetSrvcCdNbr(CFUtil.trim(dto.getHsrRetSrvcCdNbr()));
    setHsrRetProcRangeFrom(CFUtil.trim(dto.getHsrRetProcRangeFrom()));
    setHsrRetProcRangeTo(CFUtil.trim(dto.getHsrRetProcRangeTo()));
    setHsrRetProcCdType(CFUtil.trim(dto.getHsrRetProcCdType()));
    setHsrRetProvOrgTypCd(CFUtil.trim(dto.getHsrRetProvOrgTypCd()));
    setHsrRetHipaaCommtTxt(CFUtil.trim(dto.getHsrRetHipaaCommtTxt()));
  }
}
