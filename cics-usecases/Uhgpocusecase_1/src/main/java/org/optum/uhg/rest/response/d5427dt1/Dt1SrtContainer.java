package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1SrtContainer
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1SrtContainer {

    public Dt1SrtContainer() {
    }

    public Dt1SrtContainer(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private Dt1SrtFixedArea dt1SrtFixedArea;

    private Dt1SrtVariableArea dt1SrtVariableArea;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public Dt1SrtFixedArea getDt1SrtFixedArea() {
        return dt1SrtFixedArea;
    }

    public void setDt1SrtFixedArea(Dt1SrtFixedArea dt1SrtFixedArea) {
        this.dt1SrtFixedArea = dt1SrtFixedArea;
    }

    public Dt1SrtVariableArea getDt1SrtVariableArea() {
        return dt1SrtVariableArea;
    }

    public void setDt1SrtVariableArea(Dt1SrtVariableArea dt1SrtVariableArea) {
        this.dt1SrtVariableArea = dt1SrtVariableArea;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1SrtContainer dto) throws CFException {
        setDt1SrtFixedArea(new Dt1SrtFixedArea(containerLength));
        getDt1SrtFixedArea().populateFromDto(dto.getDt1SrtFixedArea());
        setDt1SrtVariableArea(new Dt1SrtVariableArea(containerLength));
        getDt1SrtVariableArea().populateFromDto(dto.getDt1SrtVariableArea());
    }
}
