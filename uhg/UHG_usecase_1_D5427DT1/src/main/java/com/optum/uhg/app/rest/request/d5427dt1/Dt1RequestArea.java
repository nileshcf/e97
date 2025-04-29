package com.optum.uhg.app.rest.request.d5427dt1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.List;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1RequestArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1RequestArea {

  public Dt1RequestArea() {}

  public Dt1RequestArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqViewName = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqViewVersionNbr = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqSearchType = "";

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqEmpid = "";

  @Size(max = 6)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqPolicy = "";

  private int dt1ReqDepNbr;

  @Size(max = 16)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqFirstName = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqRel = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqSystem = "";

  private int dt1ReqFilmOffice;

  private long dt1ReqFln;

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqIcn = "";

  private long dt1ReqFirstServiceDate;

  private long dt1ReqLastServiceDate;

  private long dt1ReqProviderTin;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqFundingResp = "";

  @Size(max = 50)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqAuthNbr = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqServiceCategory = "";

  @Size(min = 0, max = 5)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<String> dt1ReqSpiCategoryCd;

  @Size(max = 80)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqNextKey = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqClmItemsRequested = "";

  @Size(max = 7)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqCptFrom = "";

  @Size(max = 7)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqCptThru = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqRevFrom = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqRevThru = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqRemarkCd = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqProvSpclCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqCauseCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqAppliedToOopInd = "";

  @Size(max = 124)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ReqFillerArea = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getDt1ReqViewName() {
    return dt1ReqViewName;
  }

  public void setDt1ReqViewName(String dt1ReqViewName) {
    this.dt1ReqViewName = dt1ReqViewName;
  }

  public String getDt1ReqViewVersionNbr() {
    return dt1ReqViewVersionNbr;
  }

  public void setDt1ReqViewVersionNbr(String dt1ReqViewVersionNbr) {
    this.dt1ReqViewVersionNbr = dt1ReqViewVersionNbr;
  }

  public String getDt1ReqSearchType() {
    return dt1ReqSearchType;
  }

  public void setDt1ReqSearchType(String dt1ReqSearchType) {
    this.dt1ReqSearchType = dt1ReqSearchType;
  }

  public String getDt1ReqEmpid() {
    return dt1ReqEmpid;
  }

  public void setDt1ReqEmpid(String dt1ReqEmpid) {
    this.dt1ReqEmpid = dt1ReqEmpid;
  }

  public String getDt1ReqPolicy() {
    return dt1ReqPolicy;
  }

  public void setDt1ReqPolicy(String dt1ReqPolicy) {
    this.dt1ReqPolicy = dt1ReqPolicy;
  }

  public int getDt1ReqDepNbr() {
    return dt1ReqDepNbr;
  }

  public void setDt1ReqDepNbr(int dt1ReqDepNbr) {
    this.dt1ReqDepNbr = dt1ReqDepNbr;
  }

  public String getDt1ReqFirstName() {
    return dt1ReqFirstName;
  }

  public void setDt1ReqFirstName(String dt1ReqFirstName) {
    this.dt1ReqFirstName = dt1ReqFirstName;
  }

  public String getDt1ReqRel() {
    return dt1ReqRel;
  }

  public void setDt1ReqRel(String dt1ReqRel) {
    this.dt1ReqRel = dt1ReqRel;
  }

  public String getDt1ReqSystem() {
    return dt1ReqSystem;
  }

  public void setDt1ReqSystem(String dt1ReqSystem) {
    this.dt1ReqSystem = dt1ReqSystem;
  }

  public int getDt1ReqFilmOffice() {
    return dt1ReqFilmOffice;
  }

  public void setDt1ReqFilmOffice(int dt1ReqFilmOffice) {
    this.dt1ReqFilmOffice = dt1ReqFilmOffice;
  }

  public long getDt1ReqFln() {
    return dt1ReqFln;
  }

  public void setDt1ReqFln(long dt1ReqFln) {
    this.dt1ReqFln = dt1ReqFln;
  }

  public String getDt1ReqIcn() {
    return dt1ReqIcn;
  }

  public void setDt1ReqIcn(String dt1ReqIcn) {
    this.dt1ReqIcn = dt1ReqIcn;
  }

  public long getDt1ReqFirstServiceDate() {
    return dt1ReqFirstServiceDate;
  }

  public void setDt1ReqFirstServiceDate(long dt1ReqFirstServiceDate) {
    this.dt1ReqFirstServiceDate = dt1ReqFirstServiceDate;
  }

  public long getDt1ReqLastServiceDate() {
    return dt1ReqLastServiceDate;
  }

  public void setDt1ReqLastServiceDate(long dt1ReqLastServiceDate) {
    this.dt1ReqLastServiceDate = dt1ReqLastServiceDate;
  }

  public long getDt1ReqProviderTin() {
    return dt1ReqProviderTin;
  }

  public void setDt1ReqProviderTin(long dt1ReqProviderTin) {
    this.dt1ReqProviderTin = dt1ReqProviderTin;
  }

  public String getDt1ReqFundingResp() {
    return dt1ReqFundingResp;
  }

  public void setDt1ReqFundingResp(String dt1ReqFundingResp) {
    this.dt1ReqFundingResp = dt1ReqFundingResp;
  }

  public String getDt1ReqAuthNbr() {
    return dt1ReqAuthNbr;
  }

  public void setDt1ReqAuthNbr(String dt1ReqAuthNbr) {
    this.dt1ReqAuthNbr = dt1ReqAuthNbr;
  }

  public String getDt1ReqServiceCategory() {
    return dt1ReqServiceCategory;
  }

  public void setDt1ReqServiceCategory(String dt1ReqServiceCategory) {
    this.dt1ReqServiceCategory = dt1ReqServiceCategory;
  }

  public List<String> getDt1ReqSpiCategoryCd() {
    return dt1ReqSpiCategoryCd;
  }

  public void setDt1ReqSpiCategoryCd(List<String> dt1ReqSpiCategoryCd) {
    this.dt1ReqSpiCategoryCd = dt1ReqSpiCategoryCd;
  }

  public String getDt1ReqNextKey() {
    return dt1ReqNextKey;
  }

  public void setDt1ReqNextKey(String dt1ReqNextKey) {
    this.dt1ReqNextKey = dt1ReqNextKey;
  }

  public String getDt1ReqClmItemsRequested() {
    return dt1ReqClmItemsRequested;
  }

  public void setDt1ReqClmItemsRequested(String dt1ReqClmItemsRequested) {
    this.dt1ReqClmItemsRequested = dt1ReqClmItemsRequested;
  }

  public String getDt1ReqCptFrom() {
    return dt1ReqCptFrom;
  }

  public void setDt1ReqCptFrom(String dt1ReqCptFrom) {
    this.dt1ReqCptFrom = dt1ReqCptFrom;
  }

  public String getDt1ReqCptThru() {
    return dt1ReqCptThru;
  }

  public void setDt1ReqCptThru(String dt1ReqCptThru) {
    this.dt1ReqCptThru = dt1ReqCptThru;
  }

  public String getDt1ReqRevFrom() {
    return dt1ReqRevFrom;
  }

  public void setDt1ReqRevFrom(String dt1ReqRevFrom) {
    this.dt1ReqRevFrom = dt1ReqRevFrom;
  }

  public String getDt1ReqRevThru() {
    return dt1ReqRevThru;
  }

  public void setDt1ReqRevThru(String dt1ReqRevThru) {
    this.dt1ReqRevThru = dt1ReqRevThru;
  }

  public String getDt1ReqRemarkCd() {
    return dt1ReqRemarkCd;
  }

  public void setDt1ReqRemarkCd(String dt1ReqRemarkCd) {
    this.dt1ReqRemarkCd = dt1ReqRemarkCd;
  }

  public String getDt1ReqProvSpclCd() {
    return dt1ReqProvSpclCd;
  }

  public void setDt1ReqProvSpclCd(String dt1ReqProvSpclCd) {
    this.dt1ReqProvSpclCd = dt1ReqProvSpclCd;
  }

  public String getDt1ReqCauseCd() {
    return dt1ReqCauseCd;
  }

  public void setDt1ReqCauseCd(String dt1ReqCauseCd) {
    this.dt1ReqCauseCd = dt1ReqCauseCd;
  }

  public String getDt1ReqAppliedToOopInd() {
    return dt1ReqAppliedToOopInd;
  }

  public void setDt1ReqAppliedToOopInd(String dt1ReqAppliedToOopInd) {
    this.dt1ReqAppliedToOopInd = dt1ReqAppliedToOopInd;
  }

  public String getDt1ReqFillerArea() {
    return dt1ReqFillerArea;
  }

  public void setDt1ReqFillerArea(String dt1ReqFillerArea) {
    this.dt1ReqFillerArea = dt1ReqFillerArea;
  }

  @Hidden
  public void populateToDto(com.optum.uhg.app.dto.d5427dt1.Dt1RequestArea dto) {
    dto.setDt1ReqViewName(getDt1ReqViewName().toCharArray());
    dto.setDt1ReqViewVersionNbr(getDt1ReqViewVersionNbr().toCharArray());
    dto.setDt1ReqSearchType(getDt1ReqSearchType().toCharArray());
    dto.setDt1ReqEmpid(getDt1ReqEmpid().toCharArray());
    dto.setDt1ReqPolicy(getDt1ReqPolicy().toCharArray());
    dto.setDt1ReqDepNbr(getDt1ReqDepNbr());
    dto.setDt1ReqFirstName(getDt1ReqFirstName().toCharArray());
    dto.setDt1ReqRel(getDt1ReqRel().toCharArray());
    dto.setDt1ReqSystem(getDt1ReqSystem().toCharArray());
    dto.setDt1ReqFilmOffice(getDt1ReqFilmOffice());
    dto.setDt1ReqFln(getDt1ReqFln());
    dto.setDt1ReqIcn(getDt1ReqIcn().toCharArray());
    dto.setDt1ReqFirstServiceDate(getDt1ReqFirstServiceDate());
    dto.setDt1ReqLastServiceDate(getDt1ReqLastServiceDate());
    dto.setDt1ReqProviderTin(getDt1ReqProviderTin());
    dto.setDt1ReqFundingResp(getDt1ReqFundingResp().toCharArray());
    dto.setDt1ReqAuthNbr(getDt1ReqAuthNbr().toCharArray());
    dto.setDt1ReqServiceCategory(getDt1ReqServiceCategory().toCharArray());
    if (getDt1ReqSpiCategoryCd() != null) {
      for (int i = 0; i < getDt1ReqSpiCategoryCd().size(); i++) {
        dto.setDt1ReqSpiCategoryCd(i, getDt1ReqSpiCategoryCd().get(i).toCharArray());
      }
    }
    dto.setDt1ReqNextKey(getDt1ReqNextKey().toCharArray());
    dto.setDt1ReqClmItemsRequested(getDt1ReqClmItemsRequested().toCharArray());
    dto.setDt1ReqCptFrom(getDt1ReqCptFrom().toCharArray());
    dto.setDt1ReqCptThru(getDt1ReqCptThru().toCharArray());
    dto.setDt1ReqRevFrom(getDt1ReqRevFrom().toCharArray());
    dto.setDt1ReqRevThru(getDt1ReqRevThru().toCharArray());
    dto.setDt1ReqRemarkCd(getDt1ReqRemarkCd().toCharArray());
    dto.setDt1ReqProvSpclCd(getDt1ReqProvSpclCd().toCharArray());
    dto.setDt1ReqCauseCd(getDt1ReqCauseCd().toCharArray());
    dto.setDt1ReqAppliedToOopInd(getDt1ReqAppliedToOopInd().toCharArray());
    dto.setDt1ReqFillerArea(getDt1ReqFillerArea().toCharArray());
  }
}
