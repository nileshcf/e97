package org.optum.uhg.rest.request.cics0009;

import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.cics0009.dto.LsRequestDataGroup
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class LsRequestDataGroup {

    public LsRequestDataGroup() {
    }

    public LsRequestDataGroup(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    @Size(max = 100)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsRequestData = "";

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public String getLsRequestData() {
        return lsRequestData;
    }

    public void setLsRequestData(String lsRequestData) {
        this.lsRequestData = lsRequestData;
    }

    @Hidden
public void populateToDto(org.optum.uhg.dto.cics0009.LsRequestDataGroup dto) {
        dto.setLsRequestData(getLsRequestData().toCharArray());
    }
}
