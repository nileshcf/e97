package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1SrtItem
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1SrtItem {

    public Dt1SrtItem() {
    }

    public Dt1SrtItem(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int dt1SrtFlnCent;

    private long dt1SrtFln;

    @Size(max = 10)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1SrtIcn = "";

    private long dt1SrtDate;

    private long dt1SrtTime;

    private int dt1SrtBankCode;

    private long dt1SrtDraft;

    @Size(max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1SrtPayeeCode = "";

    private int dt1SrtLineSequence;

    @Size(max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1SrtTranCode = "";

    private long dt1SrtApproverAltId;

    private short dt1SrtClmItem;

    private int dt1SrtSuffixCd;

    private long dt1SrtProviderId;

    private int dt1SrtHeaderCt;

    @Size(max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1SrtDivNbr = "";

    @Size(max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1SrtClsNbr = "";

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getDt1SrtFlnCent() {
        return dt1SrtFlnCent;
    }

    public void setDt1SrtFlnCent(int dt1SrtFlnCent) {
        this.dt1SrtFlnCent = dt1SrtFlnCent;
    }

    public long getDt1SrtFln() {
        return dt1SrtFln;
    }

    public void setDt1SrtFln(long dt1SrtFln) {
        this.dt1SrtFln = dt1SrtFln;
    }

    public String getDt1SrtIcn() {
        return dt1SrtIcn;
    }

    public void setDt1SrtIcn(String dt1SrtIcn) {
        this.dt1SrtIcn = dt1SrtIcn;
    }

    public long getDt1SrtDate() {
        return dt1SrtDate;
    }

    public void setDt1SrtDate(long dt1SrtDate) {
        this.dt1SrtDate = dt1SrtDate;
    }

    public long getDt1SrtTime() {
        return dt1SrtTime;
    }

    public void setDt1SrtTime(long dt1SrtTime) {
        this.dt1SrtTime = dt1SrtTime;
    }

    public int getDt1SrtBankCode() {
        return dt1SrtBankCode;
    }

    public void setDt1SrtBankCode(int dt1SrtBankCode) {
        this.dt1SrtBankCode = dt1SrtBankCode;
    }

    public long getDt1SrtDraft() {
        return dt1SrtDraft;
    }

    public void setDt1SrtDraft(long dt1SrtDraft) {
        this.dt1SrtDraft = dt1SrtDraft;
    }

    public String getDt1SrtPayeeCode() {
        return dt1SrtPayeeCode;
    }

    public void setDt1SrtPayeeCode(String dt1SrtPayeeCode) {
        this.dt1SrtPayeeCode = dt1SrtPayeeCode;
    }

    public int getDt1SrtLineSequence() {
        return dt1SrtLineSequence;
    }

    public void setDt1SrtLineSequence(int dt1SrtLineSequence) {
        this.dt1SrtLineSequence = dt1SrtLineSequence;
    }

    public String getDt1SrtTranCode() {
        return dt1SrtTranCode;
    }

    public void setDt1SrtTranCode(String dt1SrtTranCode) {
        this.dt1SrtTranCode = dt1SrtTranCode;
    }

    public long getDt1SrtApproverAltId() {
        return dt1SrtApproverAltId;
    }

    public void setDt1SrtApproverAltId(long dt1SrtApproverAltId) {
        this.dt1SrtApproverAltId = dt1SrtApproverAltId;
    }

    public short getDt1SrtClmItem() {
        return dt1SrtClmItem;
    }

    public void setDt1SrtClmItem(short dt1SrtClmItem) {
        this.dt1SrtClmItem = dt1SrtClmItem;
    }

    public int getDt1SrtSuffixCd() {
        return dt1SrtSuffixCd;
    }

    public void setDt1SrtSuffixCd(int dt1SrtSuffixCd) {
        this.dt1SrtSuffixCd = dt1SrtSuffixCd;
    }

    public long getDt1SrtProviderId() {
        return dt1SrtProviderId;
    }

    public void setDt1SrtProviderId(long dt1SrtProviderId) {
        this.dt1SrtProviderId = dt1SrtProviderId;
    }

    public int getDt1SrtHeaderCt() {
        return dt1SrtHeaderCt;
    }

    public void setDt1SrtHeaderCt(int dt1SrtHeaderCt) {
        this.dt1SrtHeaderCt = dt1SrtHeaderCt;
    }

    public String getDt1SrtDivNbr() {
        return dt1SrtDivNbr;
    }

    public void setDt1SrtDivNbr(String dt1SrtDivNbr) {
        this.dt1SrtDivNbr = dt1SrtDivNbr;
    }

    public String getDt1SrtClsNbr() {
        return dt1SrtClsNbr;
    }

    public void setDt1SrtClsNbr(String dt1SrtClsNbr) {
        this.dt1SrtClsNbr = dt1SrtClsNbr;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1SrtItem dto) throws CFException {
        setDt1SrtFlnCent(dto.getDt1SrtFlnCent());
        setDt1SrtFln(dto.getDt1SrtFln());
        setDt1SrtIcn(CFUtil.trim(dto.getDt1SrtIcn()));
        setDt1SrtDate(dto.getDt1SrtDate());
        setDt1SrtTime(dto.getDt1SrtTime());
        setDt1SrtBankCode(dto.getDt1SrtBankCode());
        setDt1SrtDraft(dto.getDt1SrtDraft());
        setDt1SrtPayeeCode(CFUtil.trim(dto.getDt1SrtPayeeCode()));
        setDt1SrtLineSequence(dto.getDt1SrtLineSequence());
        setDt1SrtTranCode(CFUtil.trim(dto.getDt1SrtTranCode()));
        setDt1SrtApproverAltId(dto.getDt1SrtApproverAltId());
        setDt1SrtClmItem(dto.getDt1SrtClmItem());
        setDt1SrtSuffixCd(dto.getDt1SrtSuffixCd());
        setDt1SrtProviderId(dto.getDt1SrtProviderId());
        setDt1SrtHeaderCt(dto.getDt1SrtHeaderCt());
        setDt1SrtDivNbr(CFUtil.trim(dto.getDt1SrtDivNbr()));
        setDt1SrtClsNbr(CFUtil.trim(dto.getDt1SrtClsNbr()));
    }
}
