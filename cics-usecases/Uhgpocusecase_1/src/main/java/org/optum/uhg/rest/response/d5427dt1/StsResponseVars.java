package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsResponseVars
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class StsResponseVars {

    public StsResponseVars() {
    }

    public StsResponseVars(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    @Size(max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespMessageType = "";

    @Size(max = 100)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespAdditionalInfo1 = "";

    @Size(max = 100)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespAdditionalInfo2 = "";

    @Size(max = 30)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsRespDataValue = "";

    private long stsCicsresp;

    private long stsCicsresp2;

    private long stsEibtaskn;

    private long stsSqlcode;

    @Size(max = 5)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsSqlstate = "";

    @Size(max = 30)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsParagraph = "";

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public String getStsRespMessageType() {
        return stsRespMessageType;
    }

    public void setStsRespMessageType(String stsRespMessageType) {
        this.stsRespMessageType = stsRespMessageType;
    }

    public String getStsRespAdditionalInfo1() {
        return stsRespAdditionalInfo1;
    }

    public void setStsRespAdditionalInfo1(String stsRespAdditionalInfo1) {
        this.stsRespAdditionalInfo1 = stsRespAdditionalInfo1;
    }

    public String getStsRespAdditionalInfo2() {
        return stsRespAdditionalInfo2;
    }

    public void setStsRespAdditionalInfo2(String stsRespAdditionalInfo2) {
        this.stsRespAdditionalInfo2 = stsRespAdditionalInfo2;
    }

    public String getStsRespDataValue() {
        return stsRespDataValue;
    }

    public void setStsRespDataValue(String stsRespDataValue) {
        this.stsRespDataValue = stsRespDataValue;
    }

    public long getStsCicsresp() {
        return stsCicsresp;
    }

    public void setStsCicsresp(long stsCicsresp) {
        this.stsCicsresp = stsCicsresp;
    }

    public long getStsCicsresp2() {
        return stsCicsresp2;
    }

    public void setStsCicsresp2(long stsCicsresp2) {
        this.stsCicsresp2 = stsCicsresp2;
    }

    public long getStsEibtaskn() {
        return stsEibtaskn;
    }

    public void setStsEibtaskn(long stsEibtaskn) {
        this.stsEibtaskn = stsEibtaskn;
    }

    public long getStsSqlcode() {
        return stsSqlcode;
    }

    public void setStsSqlcode(long stsSqlcode) {
        this.stsSqlcode = stsSqlcode;
    }

    public String getStsSqlstate() {
        return stsSqlstate;
    }

    public void setStsSqlstate(String stsSqlstate) {
        this.stsSqlstate = stsSqlstate;
    }

    public String getStsParagraph() {
        return stsParagraph;
    }

    public void setStsParagraph(String stsParagraph) {
        this.stsParagraph = stsParagraph;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.StsResponseVars dto) throws CFException {
        setStsRespMessageType(CFUtil.trim(dto.getStsRespMessageType()));
        setStsRespAdditionalInfo1(CFUtil.trim(dto.getStsRespAdditionalInfo1()));
        setStsRespAdditionalInfo2(CFUtil.trim(dto.getStsRespAdditionalInfo2()));
        setStsRespDataValue(CFUtil.trim(dto.getStsRespDataValue()));
        setStsCicsresp(dto.getStsCicsresp());
        setStsCicsresp2(dto.getStsCicsresp2());
        setStsEibtaskn(dto.getStsEibtaskn());
        setStsSqlcode(dto.getStsSqlcode());
        setStsSqlstate(CFUtil.trim(dto.getStsSqlstate()));
        setStsParagraph(CFUtil.trim(dto.getStsParagraph()));
    }
}
