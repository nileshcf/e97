package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsDsmCommonArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class StsDsmCommonArea {

    public StsDsmCommonArea() {
    }

    public StsDsmCommonArea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int stsDsmFuncCd;

    private int stsDsmReturnCode;

    private StsDsmSqlErrorMsgArea stsDsmSqlErrorMsgArea;

    @Size(max = 120)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmSqlErrorMessage = "";

    private StsDsmFormattedSqlErrMsg stsDsmFormattedSqlErrMsg;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getStsDsmFuncCd() {
        return stsDsmFuncCd;
    }

    public void setStsDsmFuncCd(int stsDsmFuncCd) {
        this.stsDsmFuncCd = stsDsmFuncCd;
    }

    public int getStsDsmReturnCode() {
        return stsDsmReturnCode;
    }

    public void setStsDsmReturnCode(int stsDsmReturnCode) {
        this.stsDsmReturnCode = stsDsmReturnCode;
    }

    public StsDsmSqlErrorMsgArea getStsDsmSqlErrorMsgArea() {
        return stsDsmSqlErrorMsgArea;
    }

    public void setStsDsmSqlErrorMsgArea(StsDsmSqlErrorMsgArea stsDsmSqlErrorMsgArea) {
        this.stsDsmSqlErrorMsgArea = stsDsmSqlErrorMsgArea;
    }

    public String getStsDsmSqlErrorMessage() {
        return stsDsmSqlErrorMessage;
    }

    public void setStsDsmSqlErrorMessage(String stsDsmSqlErrorMessage) {
        this.stsDsmSqlErrorMessage = stsDsmSqlErrorMessage;
    }

    public StsDsmFormattedSqlErrMsg getStsDsmFormattedSqlErrMsg() {
        return stsDsmFormattedSqlErrMsg;
    }

    public void setStsDsmFormattedSqlErrMsg(StsDsmFormattedSqlErrMsg stsDsmFormattedSqlErrMsg) {
        this.stsDsmFormattedSqlErrMsg = stsDsmFormattedSqlErrMsg;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.StsDsmCommonArea dto) throws CFException {
        setStsDsmFuncCd(dto.getStsDsmFuncCd());
        setStsDsmReturnCode(dto.getStsDsmReturnCode());
        setStsDsmSqlErrorMsgArea(new StsDsmSqlErrorMsgArea(containerLength));
        getStsDsmSqlErrorMsgArea().populateFromDto(dto.getStsDsmSqlErrorMsgArea());
        setStsDsmSqlErrorMessage(CFUtil.trim(dto.getStsDsmSqlErrorMessage()));
        setStsDsmFormattedSqlErrMsg(new StsDsmFormattedSqlErrMsg(containerLength));
        getStsDsmFormattedSqlErrMsg().populateFromDto(dto.getStsDsmFormattedSqlErrMsg());
    }
}
