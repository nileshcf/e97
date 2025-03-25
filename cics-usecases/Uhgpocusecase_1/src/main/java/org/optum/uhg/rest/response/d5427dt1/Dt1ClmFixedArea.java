package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmFixedArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1ClmFixedArea {

    public Dt1ClmFixedArea() {
    }

    public Dt1ClmFixedArea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private long dt1ClmClmContainerItemCnt;

    private long dt1ClmClmContainerItemLen;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public long getDt1ClmClmContainerItemCnt() {
        return dt1ClmClmContainerItemCnt;
    }

    public void setDt1ClmClmContainerItemCnt(long dt1ClmClmContainerItemCnt) {
        this.dt1ClmClmContainerItemCnt = dt1ClmClmContainerItemCnt;
    }

    public long getDt1ClmClmContainerItemLen() {
        return dt1ClmClmContainerItemLen;
    }

    public void setDt1ClmClmContainerItemLen(long dt1ClmClmContainerItemLen) {
        this.dt1ClmClmContainerItemLen = dt1ClmClmContainerItemLen;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1ClmFixedArea dto) throws CFException {
        setDt1ClmClmContainerItemCnt(dto.getDt1ClmClmContainerItemCnt());
        setDt1ClmClmContainerItemLen(dto.getDt1ClmClmContainerItemLen());
    }
}
