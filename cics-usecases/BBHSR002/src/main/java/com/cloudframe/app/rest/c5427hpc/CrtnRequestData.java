package com.cloudframe.app.rest.c5427hpc;

/**
 * The class CrtnRequestData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29.
 */
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnRequestData {
  protected Logger logger = LoggerFactory.getLogger(CrtnRequestData.class);

  /*  Child Field declaration */
  private String crtnCallType = "";
  List<String> crtnSrchCd = new ArrayList<>();
  private String crtnHipaaCd30Flag = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnCallType
   *
   * @return crtnCallType
   */
  public String getCrtnCallType() {
    return crtnCallType;
  }

  /**
   * set variable crtnCallType
   *
   * @param value
   */
  public void setCrtnCallType(String value) {
    crtnCallType = value.trim();
  }
  /**
   * Returns the value of crtnSrchCd
   *
   * @return crtnSrchCd
   */
  public List<String> getCrtnSrchCd() {
    return crtnSrchCd;
  }

  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return crtnSrchCd
   */
  public String getCrtnSrchCd(int index) {
    return crtnSrchCd.get(index);
  }

  /**
   * Update CrtnSrchCd with the passed value at a given index
   *
   * @param index
   * @param value
   */
  public void setCrtnSrchCd(List<String> value) {
    crtnSrchCd = value;
  }

  /**
   * Returns the value of crtnHipaaCd30Flag
   *
   * @return crtnHipaaCd30Flag
   */
  public String getCrtnHipaaCd30Flag() {
    return crtnHipaaCd30Flag;
  }

  /**
   * set variable crtnHipaaCd30Flag
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(String value) {
    crtnHipaaCd30Flag = value.trim();
  }

  @JsonIgnore
  public void setCrtnRequestData(com.cloudframe.app.dto.c5427hpc.CrtnRequestData crtnRequestData)
      throws CFException {
    if (crtnCallType != null && !crtnCallType.isEmpty()) {
      crtnRequestData.setCrtnCallType(crtnCallType.toCharArray());
    }
    if (!crtnSrchCd.isEmpty()) {
      for (int index = 0; index < crtnSrchCd.size(); index++) {
        crtnRequestData.setCrtnSrchCd(index, crtnSrchCd.get(index).toCharArray());
      }
    }
    if (crtnHipaaCd30Flag != null && !crtnHipaaCd30Flag.isEmpty()) {
      crtnRequestData.setCrtnHipaaCd30Flag(crtnHipaaCd30Flag.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427hpc.CrtnRequestData crtnRequestData)
      throws CFException {
    setCrtnCallType(String.valueOf(crtnRequestData.getCrtnCallType()));
    crtnSrchCd.clear();
    crtnRequestData
        .getCrtnSrchCd()
        .forEach(
            item -> {
              String val = CFUtil.trim(item);
              if (!val.isEmpty()) {
                crtnSrchCd.add(val);
              }
            });
    setCrtnHipaaCd30Flag(String.valueOf(crtnRequestData.getCrtnHipaaCd30Flag()));
  }
}
