package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRetReturn
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRetReturn {

  public HsrRetReturn() {}

  public HsrRetReturn(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRetNOSvcInd = "";

  @Size(min = 0, max = 300)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<HsrRetBhiInfo> hsrRetBhiInfo;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrRetNOSvcInd() {
    return hsrRetNOSvcInd;
  }

  public void setHsrRetNOSvcInd(String hsrRetNOSvcInd) {
    this.hsrRetNOSvcInd = hsrRetNOSvcInd;
  }

  public List<HsrRetBhiInfo> getHsrRetBhiInfo() {
    return hsrRetBhiInfo;
  }

  public void setHsrRetBhiInfo(List<HsrRetBhiInfo> hsrRetBhiInfo) {
    this.hsrRetBhiInfo = hsrRetBhiInfo;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrRetReturn dto) throws CFException {
    setHsrRetNOSvcInd(CFUtil.trim(dto.getHsrRetNOSvcInd()));
    setHsrRetBhiInfo(new ArrayList<>());
    int startPositionOfHsrRetBhiInfo = dto.getStartOffset();
    int lenghtOfHsrRetBhiInfo =
        com.cloudframe.app.dto.bbhsr002.HsrRetBhiInfo.getHsrRetBhiInfoFieldLength();
    int processedLengthOfHsrRetBhiInfo = startPositionOfHsrRetBhiInfo;
    for (int i = 0; i < dto.hsrRetBhiInfoSize(); i++) {
      processedLengthOfHsrRetBhiInfo = processedLengthOfHsrRetBhiInfo + lenghtOfHsrRetBhiInfo;
      if (processedLengthOfHsrRetBhiInfo <= containerLength) {
        getHsrRetBhiInfo().add(new HsrRetBhiInfo(containerLength));
        getHsrRetBhiInfo().get(i).populateFromDto(dto.getHsrRetBhiInfo(i));
      } else break;
    }
  }
}
