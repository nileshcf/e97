package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1SrtFixedArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1SrtFixedArea {

    public Dt1SrtFixedArea() {
    }

    public Dt1SrtFixedArea(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int dt1SrtItemCnt;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getDt1SrtItemCnt() {
        return dt1SrtItemCnt;
    }

    public void setDt1SrtItemCnt(int dt1SrtItemCnt) {
        this.dt1SrtItemCnt = dt1SrtItemCnt;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1SrtFixedArea dto) throws CFException {
        setDt1SrtItemCnt(dto.getDt1SrtItemCnt());
    }
}
