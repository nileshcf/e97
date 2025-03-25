package org.optum.uhg.rest.response.cics0010;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.cics0010.dto.LsDfhcommarea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class LsDfhcommarea {

    public LsDfhcommarea() {
    }

    public LsDfhcommarea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int lsRequestType;

    @Size(max = 100)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsRequestData = "";

    private int lsReturnCode;

    private long lsReturnEibresp;

    private long lsReturnEibresp2;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getLsRequestType() {
        return lsRequestType;
    }

    public void setLsRequestType(int lsRequestType) {
        this.lsRequestType = lsRequestType;
    }

    public String getLsRequestData() {
        return lsRequestData;
    }

    public void setLsRequestData(String lsRequestData) {
        this.lsRequestData = lsRequestData;
    }

    public int getLsReturnCode() {
        return lsReturnCode;
    }

    public void setLsReturnCode(int lsReturnCode) {
        this.lsReturnCode = lsReturnCode;
    }

    public long getLsReturnEibresp() {
        return lsReturnEibresp;
    }

    public void setLsReturnEibresp(long lsReturnEibresp) {
        this.lsReturnEibresp = lsReturnEibresp;
    }

    public long getLsReturnEibresp2() {
        return lsReturnEibresp2;
    }

    public void setLsReturnEibresp2(long lsReturnEibresp2) {
        this.lsReturnEibresp2 = lsReturnEibresp2;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.cics0010.LsDfhcommarea dto) throws CFException {
        setLsRequestType(dto.getLsRequestType());
        setLsRequestData(CFUtil.trim(dto.getLsRequestData()));
        setLsReturnCode(dto.getLsReturnCode());
        setLsReturnEibresp(dto.getLsReturnEibresp());
        setLsReturnEibresp2(dto.getLsReturnEibresp2());
    }
}
