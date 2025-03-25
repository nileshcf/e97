package org.optum.uhg.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import io.swagger.v3.oas.annotations.Hidden;
import com.fasterxml.jackson.annotation.JsonIgnore;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.Dt1ClmProviderId
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2024-11-20 at 23:03.
 */
public class Dt1ClmProviderId {

    public Dt1ClmProviderId() {
    }

    public Dt1ClmProviderId(int containerLength) {
        this.containerLength = containerLength;
    }

    @JsonIgnore
    private int containerLength;

    private int dt1ClmProviderPrefix;

    private long dt1ClmProviderTin;

    private long dt1ClmProviderSuffix;

    @Hidden
    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getDt1ClmProviderPrefix() {
        return dt1ClmProviderPrefix;
    }

    public void setDt1ClmProviderPrefix(int dt1ClmProviderPrefix) {
        this.dt1ClmProviderPrefix = dt1ClmProviderPrefix;
    }

    public long getDt1ClmProviderTin() {
        return dt1ClmProviderTin;
    }

    public void setDt1ClmProviderTin(long dt1ClmProviderTin) {
        this.dt1ClmProviderTin = dt1ClmProviderTin;
    }

    public long getDt1ClmProviderSuffix() {
        return dt1ClmProviderSuffix;
    }

    public void setDt1ClmProviderSuffix(long dt1ClmProviderSuffix) {
        this.dt1ClmProviderSuffix = dt1ClmProviderSuffix;
    }

    @Hidden
public void populateFromDto(org.optum.uhg.dto.d5427dt1.Dt1ClmProviderId dto) throws CFException {
        setDt1ClmProviderPrefix(dto.getDt1ClmProviderPrefix());
        setDt1ClmProviderTin(dto.getDt1ClmProviderTin());
        setDt1ClmProviderSuffix(dto.getDt1ClmProviderSuffix());
    }
}
