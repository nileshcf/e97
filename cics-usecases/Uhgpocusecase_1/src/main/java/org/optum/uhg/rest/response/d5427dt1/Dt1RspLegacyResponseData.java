package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1RspLegacyResponseData
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1RspLegacyResponseData {

    public Dt1RspLegacyResponseData() {
    }

    public Dt1RspLegacyResponseData(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int dt1RspReturnCode;

    private int dt1RspExplanationCode;

    private int dt1RspRespCode;

    private long dt1RspSqlCode;

    @Size(max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String dt1RspErrSection = "";

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getDt1RspReturnCode() {
        return dt1RspReturnCode;
    }

    public void setDt1RspReturnCode(int dt1RspReturnCode) {
        this.dt1RspReturnCode = dt1RspReturnCode;
    }

    public int getDt1RspExplanationCode() {
        return dt1RspExplanationCode;
    }

    public void setDt1RspExplanationCode(int dt1RspExplanationCode) {
        this.dt1RspExplanationCode = dt1RspExplanationCode;
    }

    public int getDt1RspRespCode() {
        return dt1RspRespCode;
    }

    public void setDt1RspRespCode(int dt1RspRespCode) {
        this.dt1RspRespCode = dt1RspRespCode;
    }

    public long getDt1RspSqlCode() {
        return dt1RspSqlCode;
    }

    public void setDt1RspSqlCode(long dt1RspSqlCode) {
        this.dt1RspSqlCode = dt1RspSqlCode;
    }

    public String getDt1RspErrSection() {
        return dt1RspErrSection;
    }

    public void setDt1RspErrSection(String dt1RspErrSection) {
        this.dt1RspErrSection = dt1RspErrSection;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1RspLegacyResponseData dto) throws CFException {
        setDt1RspReturnCode(dto.getDt1RspReturnCode());
        setDt1RspExplanationCode(dto.getDt1RspExplanationCode());
        setDt1RspRespCode(dto.getDt1RspRespCode());
        setDt1RspSqlCode(dto.getDt1RspSqlCode());
        setDt1RspErrSection(CFUtil.trim(dto.getDt1RspErrSection()));
    }
}
