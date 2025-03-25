package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsFixedArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class StsFixedArea {

    public StsFixedArea() {
    }

    public StsFixedArea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    @Size(max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespProgramName = "";

    @Size(max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespCode = "";

    private StsResponseVars stsResponseVars;

    private StsDsmCommonArea stsDsmCommonArea;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public String getStsRespProgramName() {
        return stsRespProgramName;
    }

    public void setStsRespProgramName(String stsRespProgramName) {
        this.stsRespProgramName = stsRespProgramName;
    }

    public String getStsRespCode() {
        return stsRespCode;
    }

    public void setStsRespCode(String stsRespCode) {
        this.stsRespCode = stsRespCode;
    }

    public StsResponseVars getStsResponseVars() {
        return stsResponseVars;
    }

    public void setStsResponseVars(StsResponseVars stsResponseVars) {
        this.stsResponseVars = stsResponseVars;
    }

    public StsDsmCommonArea getStsDsmCommonArea() {
        return stsDsmCommonArea;
    }

    public void setStsDsmCommonArea(StsDsmCommonArea stsDsmCommonArea) {
        this.stsDsmCommonArea = stsDsmCommonArea;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.StsFixedArea dto) throws CFException {
        setStsRespProgramName(CFUtil.trim(dto.getStsRespProgramName()));
        setStsRespCode(CFUtil.trim(dto.getStsRespCode()));
        setStsResponseVars(new StsResponseVars(containerLength));
        getStsResponseVars().populateFromDto(dto.getStsResponseVars());
        setStsDsmCommonArea(new StsDsmCommonArea(containerLength));
        getStsDsmCommonArea().populateFromDto(dto.getStsDsmCommonArea());
    }
}
