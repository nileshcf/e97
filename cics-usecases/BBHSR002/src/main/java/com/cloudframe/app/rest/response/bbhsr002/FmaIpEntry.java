package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.FmaIpEntry
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class FmaIpEntry {

  public FmaIpEntry() {}

  public FmaIpEntry(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private short fmaIpErrCode1;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaIpType1 = "";

  private int fmaIpTypeNumeric1;

  private BigDecimal fmaIpTypeDollars1;

  @Size(max = 4)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaIpTypeAlpha1 = "";

  private short fmaIpErrCode2;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaIpType2 = "";

  private int fmaIpTypeNumeric2;

  private BigDecimal fmaIpTypeDollars2;

  @Size(max = 4)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String fmaIpTypeAlpha2 = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public short getFmaIpErrCode1() {
    return fmaIpErrCode1;
  }

  public void setFmaIpErrCode1(short fmaIpErrCode1) {
    this.fmaIpErrCode1 = fmaIpErrCode1;
  }

  public String getFmaIpType1() {
    return fmaIpType1;
  }

  public void setFmaIpType1(String fmaIpType1) {
    this.fmaIpType1 = fmaIpType1;
  }

  public int getFmaIpTypeNumeric1() {
    return fmaIpTypeNumeric1;
  }

  public void setFmaIpTypeNumeric1(int fmaIpTypeNumeric1) {
    this.fmaIpTypeNumeric1 = fmaIpTypeNumeric1;
  }

  public BigDecimal getFmaIpTypeDollars1() {
    return fmaIpTypeDollars1;
  }

  public void setFmaIpTypeDollars1(BigDecimal fmaIpTypeDollars1) {
    this.fmaIpTypeDollars1 = fmaIpTypeDollars1;
  }

  public String getFmaIpTypeAlpha1() {
    return fmaIpTypeAlpha1;
  }

  public void setFmaIpTypeAlpha1(String fmaIpTypeAlpha1) {
    this.fmaIpTypeAlpha1 = fmaIpTypeAlpha1;
  }

  public short getFmaIpErrCode2() {
    return fmaIpErrCode2;
  }

  public void setFmaIpErrCode2(short fmaIpErrCode2) {
    this.fmaIpErrCode2 = fmaIpErrCode2;
  }

  public String getFmaIpType2() {
    return fmaIpType2;
  }

  public void setFmaIpType2(String fmaIpType2) {
    this.fmaIpType2 = fmaIpType2;
  }

  public int getFmaIpTypeNumeric2() {
    return fmaIpTypeNumeric2;
  }

  public void setFmaIpTypeNumeric2(int fmaIpTypeNumeric2) {
    this.fmaIpTypeNumeric2 = fmaIpTypeNumeric2;
  }

  public BigDecimal getFmaIpTypeDollars2() {
    return fmaIpTypeDollars2;
  }

  public void setFmaIpTypeDollars2(BigDecimal fmaIpTypeDollars2) {
    this.fmaIpTypeDollars2 = fmaIpTypeDollars2;
  }

  public String getFmaIpTypeAlpha2() {
    return fmaIpTypeAlpha2;
  }

  public void setFmaIpTypeAlpha2(String fmaIpTypeAlpha2) {
    this.fmaIpTypeAlpha2 = fmaIpTypeAlpha2;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.FmaIpEntry dto) throws CFException {
    setFmaIpErrCode1(dto.getFmaIpErrCode1());
    setFmaIpType1(CFUtil.trim(dto.getFmaIpType1()));
    setFmaIpTypeNumeric1(dto.getFmaIpTypeNumeric1());
    setFmaIpTypeDollars1(dto.getFmaIpTypeDollars1());
    setFmaIpTypeAlpha1(CFUtil.trim(dto.getFmaIpTypeAlpha1()));
    setFmaIpErrCode2(dto.getFmaIpErrCode2());
    setFmaIpType2(CFUtil.trim(dto.getFmaIpType2()));
    setFmaIpTypeNumeric2(dto.getFmaIpTypeNumeric2());
    setFmaIpTypeDollars2(dto.getFmaIpTypeDollars2());
    setFmaIpTypeAlpha2(CFUtil.trim(dto.getFmaIpTypeAlpha2()));
  }
}
