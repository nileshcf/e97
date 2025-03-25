package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1SrtArray
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1SrtArray {

    public Dt1SrtArray() {
    }

    public Dt1SrtArray(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    @Size(min = 0, max = 800)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<Dt1SrtItem> dt1SrtItem;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public List<Dt1SrtItem> getDt1SrtItem() {
        return dt1SrtItem;
    }

    public void setDt1SrtItem(List<Dt1SrtItem> dt1SrtItem) {
        this.dt1SrtItem = dt1SrtItem;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1SrtArray dto) throws CFException {
        setDt1SrtItem(new ArrayList<>());
        int startPositionOfDt1SrtItem = dto.getStartOffset();
        int lenghtOfDt1SrtItem = org.optum.uhg.dto.d5427dt1.Dt1SrtItem.getDt1SrtItemFieldLength();
        int processedLengthOfDt1SrtItem = startPositionOfDt1SrtItem;
        for (int i = 0; i < dto.dt1SrtItemSize(); i++) {
            processedLengthOfDt1SrtItem = processedLengthOfDt1SrtItem + lenghtOfDt1SrtItem;
            if (processedLengthOfDt1SrtItem <= containerLength) {
                getDt1SrtItem().add(new Dt1SrtItem());
                getDt1SrtItem().get(i).populateFromDto(dto.getDt1SrtItem(i));
            } else
                break;
        }
    }
}
