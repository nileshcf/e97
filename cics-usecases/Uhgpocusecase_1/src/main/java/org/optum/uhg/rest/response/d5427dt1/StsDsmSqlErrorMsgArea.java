package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsDsmSqlErrorMsgArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class StsDsmSqlErrorMsgArea {

    public StsDsmSqlErrorMsgArea() {
    }

    public StsDsmSqlErrorMsgArea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    @Size(max = 25)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrTblName = "";

    @Size(max = 34)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrSectnName = "";

    @Size(max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrPgmName = "";

    @Size(max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrClngPgmName = "";

    @Size(max = 10)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrTblAction = "";

    @Size(max = 35)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String stsDsmErrTxt = "";

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public String getStsDsmErrTblName() {
        return stsDsmErrTblName;
    }

    public void setStsDsmErrTblName(String stsDsmErrTblName) {
        this.stsDsmErrTblName = stsDsmErrTblName;
    }

    public String getStsDsmErrSectnName() {
        return stsDsmErrSectnName;
    }

    public void setStsDsmErrSectnName(String stsDsmErrSectnName) {
        this.stsDsmErrSectnName = stsDsmErrSectnName;
    }

    public String getStsDsmErrPgmName() {
        return stsDsmErrPgmName;
    }

    public void setStsDsmErrPgmName(String stsDsmErrPgmName) {
        this.stsDsmErrPgmName = stsDsmErrPgmName;
    }

    public String getStsDsmErrClngPgmName() {
        return stsDsmErrClngPgmName;
    }

    public void setStsDsmErrClngPgmName(String stsDsmErrClngPgmName) {
        this.stsDsmErrClngPgmName = stsDsmErrClngPgmName;
    }

    public String getStsDsmErrTblAction() {
        return stsDsmErrTblAction;
    }

    public void setStsDsmErrTblAction(String stsDsmErrTblAction) {
        this.stsDsmErrTblAction = stsDsmErrTblAction;
    }

    public String getStsDsmErrTxt() {
        return stsDsmErrTxt;
    }

    public void setStsDsmErrTxt(String stsDsmErrTxt) {
        this.stsDsmErrTxt = stsDsmErrTxt;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.StsDsmSqlErrorMsgArea dto) throws CFException {
        setStsDsmErrTblName(CFUtil.trim(dto.getStsDsmErrTblName()));
        setStsDsmErrSectnName(CFUtil.trim(dto.getStsDsmErrSectnName()));
        setStsDsmErrPgmName(CFUtil.trim(dto.getStsDsmErrPgmName()));
        setStsDsmErrClngPgmName(CFUtil.trim(dto.getStsDsmErrClngPgmName()));
        setStsDsmErrTblAction(CFUtil.trim(dto.getStsDsmErrTblAction()));
        setStsDsmErrTxt(CFUtil.trim(dto.getStsDsmErrTxt()));
    }
}
