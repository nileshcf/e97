package com.optum.uhg.app.rest.response.d5427dt1;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/* This class is generated from :com.cloudframe.app.d5427dt1.dto.StsDsmFormattedSqlErrMsg
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-04-28 at 19:33.
 */
public class StsDsmFormattedSqlErrMsg {

  public StsDsmFormattedSqlErrMsg() {}

  public StsDsmFormattedSqlErrMsg(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(min = 0, max = 10)
  @Schema(description = "Default value is empty", defaultValue = "[]")
  private List<String> stsDsmFrmtdSqlErrMsg;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public List<String> getStsDsmFrmtdSqlErrMsg() {
    return stsDsmFrmtdSqlErrMsg;
  }

  public void setStsDsmFrmtdSqlErrMsg(List<String> stsDsmFrmtdSqlErrMsg) {
    this.stsDsmFrmtdSqlErrMsg = stsDsmFrmtdSqlErrMsg;
  }

  @Hidden
  public void populateFromDto(com.optum.uhg.app.dto.d5427dt1.StsDsmFormattedSqlErrMsg dto)
      throws CFException {
    setStsDsmFrmtdSqlErrMsg(new ArrayList<>());
    int startPositionOfStsDsmFrmtdSqlErrMsg = dto.getStartOffset();
    int lenghtOfStsDsmFrmtdSqlErrMsg = dto.stsDsmFrmtdSqlErrMsgFieldLength();
    int processedLengthOfStsDsmFrmtdSqlErrMsg = startPositionOfStsDsmFrmtdSqlErrMsg;
    for (int i = 0; i < dto.stsDsmFrmtdSqlErrMsgSize(); i++) {
      processedLengthOfStsDsmFrmtdSqlErrMsg =
          processedLengthOfStsDsmFrmtdSqlErrMsg + lenghtOfStsDsmFrmtdSqlErrMsg;
      if (processedLengthOfStsDsmFrmtdSqlErrMsg <= containerLength) {
        getStsDsmFrmtdSqlErrMsg().add(CFUtil.trim(dto.getStsDsmFrmtdSqlErrMsg(i)));
      } else break;
    }
  }
}
