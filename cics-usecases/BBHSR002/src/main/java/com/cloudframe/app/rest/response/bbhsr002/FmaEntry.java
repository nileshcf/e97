package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FmaEntry
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FmaEntry {

  public FmaEntry() {}

  public FmaEntry(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private short fmaErrCode1;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaType1 = "";

  private int fmaTypeNumeric1;

  private BigDecimal fmaTypeDollars1;

  @Size(max = 4)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaTypeAlpha1 = "";

  private short fmaErrCode2;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaType2 = "";

  private int fmaTypeNumeric2;

  private BigDecimal fmaTypeDollars2;

  @Size(max = 4)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaTypeAlpha2 = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public short getFmaErrCode1() {
    return fmaErrCode1;
  }

  public void setFmaErrCode1(short fmaErrCode1) {
    this.fmaErrCode1 = fmaErrCode1;
  }

  public String getFmaType1() {
    return fmaType1;
  }

  public void setFmaType1(String fmaType1) {
    this.fmaType1 = fmaType1;
  }

  public int getFmaTypeNumeric1() {
    return fmaTypeNumeric1;
  }

  public void setFmaTypeNumeric1(int fmaTypeNumeric1) {
    this.fmaTypeNumeric1 = fmaTypeNumeric1;
  }

  public BigDecimal getFmaTypeDollars1() {
    return fmaTypeDollars1;
  }

  public void setFmaTypeDollars1(BigDecimal fmaTypeDollars1) {
    this.fmaTypeDollars1 = fmaTypeDollars1;
  }

  public String getFmaTypeAlpha1() {
    return fmaTypeAlpha1;
  }

  public void setFmaTypeAlpha1(String fmaTypeAlpha1) {
    this.fmaTypeAlpha1 = fmaTypeAlpha1;
  }

  public short getFmaErrCode2() {
    return fmaErrCode2;
  }

  public void setFmaErrCode2(short fmaErrCode2) {
    this.fmaErrCode2 = fmaErrCode2;
  }

  public String getFmaType2() {
    return fmaType2;
  }

  public void setFmaType2(String fmaType2) {
    this.fmaType2 = fmaType2;
  }

  public int getFmaTypeNumeric2() {
    return fmaTypeNumeric2;
  }

  public void setFmaTypeNumeric2(int fmaTypeNumeric2) {
    this.fmaTypeNumeric2 = fmaTypeNumeric2;
  }

  public BigDecimal getFmaTypeDollars2() {
    return fmaTypeDollars2;
  }

  public void setFmaTypeDollars2(BigDecimal fmaTypeDollars2) {
    this.fmaTypeDollars2 = fmaTypeDollars2;
  }

  public String getFmaTypeAlpha2() {
    return fmaTypeAlpha2;
  }

  public void setFmaTypeAlpha2(String fmaTypeAlpha2) {
    this.fmaTypeAlpha2 = fmaTypeAlpha2;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FmaEntry dto) throws CFException {
    setFmaErrCode1(dto.getFmaErrCode1());
    setFmaType1(CFUtil.trim(dto.getFmaType1()));
    setFmaTypeNumeric1(dto.getFmaTypeNumeric1());
    setFmaTypeDollars1(dto.getFmaTypeDollars1());
    setFmaTypeAlpha1(CFUtil.trim(dto.getFmaTypeAlpha1()));
    setFmaErrCode2(dto.getFmaErrCode2());
    setFmaType2(CFUtil.trim(dto.getFmaType2()));
    setFmaTypeNumeric2(dto.getFmaTypeNumeric2());
    setFmaTypeDollars2(dto.getFmaTypeDollars2());
    setFmaTypeAlpha2(CFUtil.trim(dto.getFmaTypeAlpha2()));
  }
}
