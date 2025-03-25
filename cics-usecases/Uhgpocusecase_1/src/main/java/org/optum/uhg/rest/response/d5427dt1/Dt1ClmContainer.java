package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmContainer
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1ClmContainer {

    public Dt1ClmContainer() {
    }

    public Dt1ClmContainer(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private Dt1ClmFixedArea dt1ClmFixedArea;

    private Dt1ClmVariableArea dt1ClmVariableArea;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public Dt1ClmFixedArea getDt1ClmFixedArea() {
        return dt1ClmFixedArea;
    }

    public void setDt1ClmFixedArea(Dt1ClmFixedArea dt1ClmFixedArea) {
        this.dt1ClmFixedArea = dt1ClmFixedArea;
    }

    public Dt1ClmVariableArea getDt1ClmVariableArea() {
        return dt1ClmVariableArea;
    }

    public void setDt1ClmVariableArea(Dt1ClmVariableArea dt1ClmVariableArea) {
        this.dt1ClmVariableArea = dt1ClmVariableArea;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1ClmContainer dto) throws CFException {
        setDt1ClmFixedArea(new Dt1ClmFixedArea(containerLength));
        getDt1ClmFixedArea().populateFromDto(dto.getDt1ClmFixedArea());
        setDt1ClmVariableArea(new Dt1ClmVariableArea(containerLength));
        getDt1ClmVariableArea().populateFromDto(dto.getDt1ClmVariableArea());
    }
}
