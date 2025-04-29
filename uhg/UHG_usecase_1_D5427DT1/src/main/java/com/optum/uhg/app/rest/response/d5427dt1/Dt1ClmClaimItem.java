package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmClaimItem
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class Dt1ClmClaimItem {

  public Dt1ClmClaimItem() {}

  public Dt1ClmClaimItem(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private int dt1ClmFilmOffice;

  private long dt1ClmFln;

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmIcn = "";

  private int dt1ClmSuffixCd;

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProcDt = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProcTm = "";

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmFlnFormatDt = "";

  private int dt1ClmHeaderCt;

  private long dt1ClmDraftNo;

  private long dt1ClmFirstServiceDate;

  private long dt1ClmLastServiceDate;

  @Size(max = 40)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProviderName = "";

  private Dt1ClmProviderId dt1ClmProviderId;

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmChargeAmount = "";

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPaidAmount = "";

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmDeductibleAmount = "";

  private Dt1ClmClaimStatus dt1ClmClaimStatus;

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmClmLevelRc = "";

  private int dt1ClmAdjNbr;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmAdjInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPpoInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmClmPhiInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmT1ProcessInd = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmDlgteInd = "";

  @Size(max = 50)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmAuthNbr = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmAuthSrcId = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmAuthProcCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmAuthClmLevelInd = "";

  private int dt1ClmAuthUniqueCnt;

  @Size(max = 7)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPrimaryDiagnosis = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmParsWaivInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmParInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmNonParInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProviderTier = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmTpsmCd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmMskInd = "";

  @Size(max = 10)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmPtntRespAmt = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProvSpclCd = "";

  @Size(max = 9)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmNdbContrId = "";

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmDrgNbr = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmProvMedcdReclmInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmHospProfInd = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmSmbAppCd = "";

  @Size(max = 2)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmSmbStCd = "";

  @Size(max = 117)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String dt1ClmItemFillerArea = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public int getDt1ClmFilmOffice() {
    return dt1ClmFilmOffice;
  }

  public void setDt1ClmFilmOffice(int dt1ClmFilmOffice) {
    this.dt1ClmFilmOffice = dt1ClmFilmOffice;
  }

  public long getDt1ClmFln() {
    return dt1ClmFln;
  }

  public void setDt1ClmFln(long dt1ClmFln) {
    this.dt1ClmFln = dt1ClmFln;
  }

  public String getDt1ClmIcn() {
    return dt1ClmIcn;
  }

  public void setDt1ClmIcn(String dt1ClmIcn) {
    this.dt1ClmIcn = dt1ClmIcn;
  }

  public int getDt1ClmSuffixCd() {
    return dt1ClmSuffixCd;
  }

  public void setDt1ClmSuffixCd(int dt1ClmSuffixCd) {
    this.dt1ClmSuffixCd = dt1ClmSuffixCd;
  }

  public String getDt1ClmProcDt() {
    return dt1ClmProcDt;
  }

  public void setDt1ClmProcDt(String dt1ClmProcDt) {
    this.dt1ClmProcDt = dt1ClmProcDt;
  }

  public String getDt1ClmProcTm() {
    return dt1ClmProcTm;
  }

  public void setDt1ClmProcTm(String dt1ClmProcTm) {
    this.dt1ClmProcTm = dt1ClmProcTm;
  }

  public String getDt1ClmFlnFormatDt() {
    return dt1ClmFlnFormatDt;
  }

  public void setDt1ClmFlnFormatDt(String dt1ClmFlnFormatDt) {
    this.dt1ClmFlnFormatDt = dt1ClmFlnFormatDt;
  }

  public int getDt1ClmHeaderCt() {
    return dt1ClmHeaderCt;
  }

  public void setDt1ClmHeaderCt(int dt1ClmHeaderCt) {
    this.dt1ClmHeaderCt = dt1ClmHeaderCt;
  }

  public long getDt1ClmDraftNo() {
    return dt1ClmDraftNo;
  }

  public void setDt1ClmDraftNo(long dt1ClmDraftNo) {
    this.dt1ClmDraftNo = dt1ClmDraftNo;
  }

  public long getDt1ClmFirstServiceDate() {
    return dt1ClmFirstServiceDate;
  }

  public void setDt1ClmFirstServiceDate(long dt1ClmFirstServiceDate) {
    this.dt1ClmFirstServiceDate = dt1ClmFirstServiceDate;
  }

  public long getDt1ClmLastServiceDate() {
    return dt1ClmLastServiceDate;
  }

  public void setDt1ClmLastServiceDate(long dt1ClmLastServiceDate) {
    this.dt1ClmLastServiceDate = dt1ClmLastServiceDate;
  }

  public String getDt1ClmProviderName() {
    return dt1ClmProviderName;
  }

  public void setDt1ClmProviderName(String dt1ClmProviderName) {
    this.dt1ClmProviderName = dt1ClmProviderName;
  }

  public Dt1ClmProviderId getDt1ClmProviderId() {
    return dt1ClmProviderId;
  }

  public void setDt1ClmProviderId(Dt1ClmProviderId dt1ClmProviderId) {
    this.dt1ClmProviderId = dt1ClmProviderId;
  }

  public String getDt1ClmChargeAmount() {
    return dt1ClmChargeAmount;
  }

  public void setDt1ClmChargeAmount(String dt1ClmChargeAmount) {
    this.dt1ClmChargeAmount = dt1ClmChargeAmount;
  }

  public String getDt1ClmPaidAmount() {
    return dt1ClmPaidAmount;
  }

  public void setDt1ClmPaidAmount(String dt1ClmPaidAmount) {
    this.dt1ClmPaidAmount = dt1ClmPaidAmount;
  }

  public String getDt1ClmDeductibleAmount() {
    return dt1ClmDeductibleAmount;
  }

  public void setDt1ClmDeductibleAmount(String dt1ClmDeductibleAmount) {
    this.dt1ClmDeductibleAmount = dt1ClmDeductibleAmount;
  }

  public Dt1ClmClaimStatus getDt1ClmClaimStatus() {
    return dt1ClmClaimStatus;
  }

  public void setDt1ClmClaimStatus(Dt1ClmClaimStatus dt1ClmClaimStatus) {
    this.dt1ClmClaimStatus = dt1ClmClaimStatus;
  }

  public String getDt1ClmClmLevelRc() {
    return dt1ClmClmLevelRc;
  }

  public void setDt1ClmClmLevelRc(String dt1ClmClmLevelRc) {
    this.dt1ClmClmLevelRc = dt1ClmClmLevelRc;
  }

  public int getDt1ClmAdjNbr() {
    return dt1ClmAdjNbr;
  }

  public void setDt1ClmAdjNbr(int dt1ClmAdjNbr) {
    this.dt1ClmAdjNbr = dt1ClmAdjNbr;
  }

  public String getDt1ClmAdjInd() {
    return dt1ClmAdjInd;
  }

  public void setDt1ClmAdjInd(String dt1ClmAdjInd) {
    this.dt1ClmAdjInd = dt1ClmAdjInd;
  }

  public String getDt1ClmPpoInd() {
    return dt1ClmPpoInd;
  }

  public void setDt1ClmPpoInd(String dt1ClmPpoInd) {
    this.dt1ClmPpoInd = dt1ClmPpoInd;
  }

  public String getDt1ClmClmPhiInd() {
    return dt1ClmClmPhiInd;
  }

  public void setDt1ClmClmPhiInd(String dt1ClmClmPhiInd) {
    this.dt1ClmClmPhiInd = dt1ClmClmPhiInd;
  }

  public String getDt1ClmT1ProcessInd() {
    return dt1ClmT1ProcessInd;
  }

  public void setDt1ClmT1ProcessInd(String dt1ClmT1ProcessInd) {
    this.dt1ClmT1ProcessInd = dt1ClmT1ProcessInd;
  }

  public String getDt1ClmDlgteInd() {
    return dt1ClmDlgteInd;
  }

  public void setDt1ClmDlgteInd(String dt1ClmDlgteInd) {
    this.dt1ClmDlgteInd = dt1ClmDlgteInd;
  }

  public String getDt1ClmAuthNbr() {
    return dt1ClmAuthNbr;
  }

  public void setDt1ClmAuthNbr(String dt1ClmAuthNbr) {
    this.dt1ClmAuthNbr = dt1ClmAuthNbr;
  }

  public String getDt1ClmAuthSrcId() {
    return dt1ClmAuthSrcId;
  }

  public void setDt1ClmAuthSrcId(String dt1ClmAuthSrcId) {
    this.dt1ClmAuthSrcId = dt1ClmAuthSrcId;
  }

  public String getDt1ClmAuthProcCd() {
    return dt1ClmAuthProcCd;
  }

  public void setDt1ClmAuthProcCd(String dt1ClmAuthProcCd) {
    this.dt1ClmAuthProcCd = dt1ClmAuthProcCd;
  }

  public String getDt1ClmAuthClmLevelInd() {
    return dt1ClmAuthClmLevelInd;
  }

  public void setDt1ClmAuthClmLevelInd(String dt1ClmAuthClmLevelInd) {
    this.dt1ClmAuthClmLevelInd = dt1ClmAuthClmLevelInd;
  }

  public int getDt1ClmAuthUniqueCnt() {
    return dt1ClmAuthUniqueCnt;
  }

  public void setDt1ClmAuthUniqueCnt(int dt1ClmAuthUniqueCnt) {
    this.dt1ClmAuthUniqueCnt = dt1ClmAuthUniqueCnt;
  }

  public String getDt1ClmPrimaryDiagnosis() {
    return dt1ClmPrimaryDiagnosis;
  }

  public void setDt1ClmPrimaryDiagnosis(String dt1ClmPrimaryDiagnosis) {
    this.dt1ClmPrimaryDiagnosis = dt1ClmPrimaryDiagnosis;
  }

  public String getDt1ClmParsWaivInd() {
    return dt1ClmParsWaivInd;
  }

  public void setDt1ClmParsWaivInd(String dt1ClmParsWaivInd) {
    this.dt1ClmParsWaivInd = dt1ClmParsWaivInd;
  }

  public String getDt1ClmParInd() {
    return dt1ClmParInd;
  }

  public void setDt1ClmParInd(String dt1ClmParInd) {
    this.dt1ClmParInd = dt1ClmParInd;
  }

  public String getDt1ClmNonParInd() {
    return dt1ClmNonParInd;
  }

  public void setDt1ClmNonParInd(String dt1ClmNonParInd) {
    this.dt1ClmNonParInd = dt1ClmNonParInd;
  }

  public String getDt1ClmProviderTier() {
    return dt1ClmProviderTier;
  }

  public void setDt1ClmProviderTier(String dt1ClmProviderTier) {
    this.dt1ClmProviderTier = dt1ClmProviderTier;
  }

  public String getDt1ClmTpsmCd() {
    return dt1ClmTpsmCd;
  }

  public void setDt1ClmTpsmCd(String dt1ClmTpsmCd) {
    this.dt1ClmTpsmCd = dt1ClmTpsmCd;
  }

  public String getDt1ClmMskInd() {
    return dt1ClmMskInd;
  }

  public void setDt1ClmMskInd(String dt1ClmMskInd) {
    this.dt1ClmMskInd = dt1ClmMskInd;
  }

  public String getDt1ClmPtntRespAmt() {
    return dt1ClmPtntRespAmt;
  }

  public void setDt1ClmPtntRespAmt(String dt1ClmPtntRespAmt) {
    this.dt1ClmPtntRespAmt = dt1ClmPtntRespAmt;
  }

  public String getDt1ClmProvSpclCd() {
    return dt1ClmProvSpclCd;
  }

  public void setDt1ClmProvSpclCd(String dt1ClmProvSpclCd) {
    this.dt1ClmProvSpclCd = dt1ClmProvSpclCd;
  }

  public String getDt1ClmNdbContrId() {
    return dt1ClmNdbContrId;
  }

  public void setDt1ClmNdbContrId(String dt1ClmNdbContrId) {
    this.dt1ClmNdbContrId = dt1ClmNdbContrId;
  }

  public String getDt1ClmDrgNbr() {
    return dt1ClmDrgNbr;
  }

  public void setDt1ClmDrgNbr(String dt1ClmDrgNbr) {
    this.dt1ClmDrgNbr = dt1ClmDrgNbr;
  }

  public String getDt1ClmProvMedcdReclmInd() {
    return dt1ClmProvMedcdReclmInd;
  }

  public void setDt1ClmProvMedcdReclmInd(String dt1ClmProvMedcdReclmInd) {
    this.dt1ClmProvMedcdReclmInd = dt1ClmProvMedcdReclmInd;
  }

  public String getDt1ClmHospProfInd() {
    return dt1ClmHospProfInd;
  }

  public void setDt1ClmHospProfInd(String dt1ClmHospProfInd) {
    this.dt1ClmHospProfInd = dt1ClmHospProfInd;
  }

  public String getDt1ClmSmbAppCd() {
    return dt1ClmSmbAppCd;
  }

  public void setDt1ClmSmbAppCd(String dt1ClmSmbAppCd) {
    this.dt1ClmSmbAppCd = dt1ClmSmbAppCd;
  }

  public String getDt1ClmSmbStCd() {
    return dt1ClmSmbStCd;
  }

  public void setDt1ClmSmbStCd(String dt1ClmSmbStCd) {
    this.dt1ClmSmbStCd = dt1ClmSmbStCd;
  }

  public String getDt1ClmItemFillerArea() {
    return dt1ClmItemFillerArea;
  }

  public void setDt1ClmItemFillerArea(String dt1ClmItemFillerArea) {
    this.dt1ClmItemFillerArea = dt1ClmItemFillerArea;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.Dt1ClmClaimItem dto)
      throws CFException {
    setDt1ClmFilmOffice(dto.getDt1ClmFilmOffice());
    setDt1ClmFln(dto.getDt1ClmFln());
    setDt1ClmIcn(CFUtil.trim(dto.getDt1ClmIcn()));
    setDt1ClmSuffixCd(dto.getDt1ClmSuffixCd());
    setDt1ClmProcDt(CFUtil.trim(dto.getDt1ClmProcDt()));
    setDt1ClmProcTm(CFUtil.trim(dto.getDt1ClmProcTm()));
    setDt1ClmFlnFormatDt(CFUtil.trim(dto.getDt1ClmFlnFormatDt()));
    setDt1ClmHeaderCt(dto.getDt1ClmHeaderCt());
    setDt1ClmDraftNo(dto.getDt1ClmDraftNo());
    setDt1ClmFirstServiceDate(dto.getDt1ClmFirstServiceDate());
    setDt1ClmLastServiceDate(dto.getDt1ClmLastServiceDate());
    setDt1ClmProviderName(CFUtil.trim(dto.getDt1ClmProviderName()));
    setDt1ClmProviderId(new Dt1ClmProviderId(containerLength));
    getDt1ClmProviderId().populateFromDto(dto.getDt1ClmProviderId());
    setDt1ClmChargeAmount(CFUtil.trim(dto.getDt1ClmChargeAmount()));
    setDt1ClmPaidAmount(CFUtil.trim(dto.getDt1ClmPaidAmount()));
    setDt1ClmDeductibleAmount(CFUtil.trim(dto.getDt1ClmDeductibleAmount()));
    setDt1ClmClaimStatus(new Dt1ClmClaimStatus(containerLength));
    getDt1ClmClaimStatus().populateFromDto(dto.getDt1ClmClaimStatus());
    setDt1ClmClmLevelRc(CFUtil.trim(dto.getDt1ClmClmLevelRc()));
    setDt1ClmAdjNbr(dto.getDt1ClmAdjNbr());
    setDt1ClmAdjInd(CFUtil.trim(dto.getDt1ClmAdjInd()));
    setDt1ClmPpoInd(CFUtil.trim(dto.getDt1ClmPpoInd()));
    setDt1ClmClmPhiInd(CFUtil.trim(dto.getDt1ClmClmPhiInd()));
    setDt1ClmT1ProcessInd(CFUtil.trim(dto.getDt1ClmT1ProcessInd()));
    setDt1ClmDlgteInd(CFUtil.trim(dto.getDt1ClmDlgteInd()));
    setDt1ClmAuthNbr(CFUtil.trim(dto.getDt1ClmAuthNbr()));
    setDt1ClmAuthSrcId(CFUtil.trim(dto.getDt1ClmAuthSrcId()));
    setDt1ClmAuthProcCd(CFUtil.trim(dto.getDt1ClmAuthProcCd()));
    setDt1ClmAuthClmLevelInd(CFUtil.trim(dto.getDt1ClmAuthClmLevelInd()));
    setDt1ClmAuthUniqueCnt(dto.getDt1ClmAuthUniqueCnt());
    setDt1ClmPrimaryDiagnosis(CFUtil.trim(dto.getDt1ClmPrimaryDiagnosis()));
    setDt1ClmParsWaivInd(CFUtil.trim(dto.getDt1ClmParsWaivInd()));
    setDt1ClmParInd(CFUtil.trim(dto.getDt1ClmParInd()));
    setDt1ClmNonParInd(CFUtil.trim(dto.getDt1ClmNonParInd()));
    setDt1ClmProviderTier(CFUtil.trim(dto.getDt1ClmProviderTier()));
    setDt1ClmTpsmCd(CFUtil.trim(dto.getDt1ClmTpsmCd()));
    setDt1ClmMskInd(CFUtil.trim(dto.getDt1ClmMskInd()));
    setDt1ClmPtntRespAmt(CFUtil.trim(dto.getDt1ClmPtntRespAmt()));
    setDt1ClmProvSpclCd(CFUtil.trim(dto.getDt1ClmProvSpclCd()));
    setDt1ClmNdbContrId(CFUtil.trim(dto.getDt1ClmNdbContrId()));
    setDt1ClmDrgNbr(CFUtil.trim(dto.getDt1ClmDrgNbr()));
    setDt1ClmProvMedcdReclmInd(CFUtil.trim(dto.getDt1ClmProvMedcdReclmInd()));
    setDt1ClmHospProfInd(CFUtil.trim(dto.getDt1ClmHospProfInd()));
    setDt1ClmSmbAppCd(CFUtil.trim(dto.getDt1ClmSmbAppCd()));
    setDt1ClmSmbStCd(CFUtil.trim(dto.getDt1ClmSmbStCd()));
    setDt1ClmItemFillerArea(CFUtil.trim(dto.getDt1ClmItemFillerArea()));
  }
}
