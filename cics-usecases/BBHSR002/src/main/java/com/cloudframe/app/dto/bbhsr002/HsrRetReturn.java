package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetReturn is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class HsrRetReturn extends HsrRetReturnSerialized {

  private char[] hsrRetNOSvcInd = Field.fillLowValue(1);
  private List<HsrRetBhiInfo> hsrRetBhiInfo = new ArrayList<>();

  /** Constructor for HsrRetReturn */
  public HsrRetReturn() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetReturn. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetReturn(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrRetNOSvcInd
   *
   * @return hsrRetNOSvcInd
   */
  public char[] getHsrRetNOSvcInd() throws CFException {
    if (isHsrRetNOSvcIndModified()) {
      hsrRetNOSvcInd = refreshHsrRetNOSvcInd();
    }
    return hsrRetNOSvcInd;
  }

  /**
   * set variable hsrRetNOSvcInd Corresponding COBOL Variable is HSR-RET-N-O-SVC-IND
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(char[] value) {
    hsrRetNOSvcInd = checkHsrRetNOSvcIndConstraints(value);
    serializeHsrRetNOSvcInd(hsrRetNOSvcInd);
  }

  /**
   * Update HsrRetNOSvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetNOSvcInd, hsrRetNOSvcInd.length);
  }

  public void setHsrRetNOSvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNOSvcInd, hsrRetNOSvcInd.length);
  }

  /**
   * Update HsrRetNOSvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNOSvcInd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetNOSvcInd with another Field
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(Field source) {
    replace(source, 0, source.length(), beginHsrRetNOSvcInd, HSR_RET_NOSVC_IND_LEN);
  }

  /**
   * Update HsrRetNOSvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNOSvcInd, HSR_RET_NOSVC_IND_LEN);
  }

  /**
   * Update HsrRetNOSvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetNOSvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNOSvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetBhiInfo Corresponding COBOL Variable is HSR-RET-BHI-INFO
   *
   * @return hsrRetBhiInfo
   */
  public List<HsrRetBhiInfo> getHsrRetBhiInfo() {
    return hsrRetBhiInfo;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return hsrRetBhiInfo
   */
  public HsrRetBhiInfo getHsrRetBhiInfo(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHsrRetBhiInfo(), resetting it to 0", index);
      index = 0;
    } else if (index >= HSR_RET_BHI_INFO_SIZE) {
      index = HSR_RET_BHI_INFO_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hsrRetBhiInfo - Array index exceeded max Size {}, resetting it to max allowed",
          HSR_RET_BHI_INFO_SIZE);
    }
    if (index >= hsrRetBhiInfo.size()) {
      for (int fillIndex = hsrRetBhiInfo.size() - 1; fillIndex < index; fillIndex++) {
        hsrRetBhiInfo.add(null);
      }
      hsrRetBhiInfo.set(
          index,
          new HsrRetBhiInfo(
              this, beginHsrRetBhiInfo + index * HsrRetBhiInfo.getHsrRetBhiInfoFieldLength()));
    }
    HsrRetBhiInfo value = hsrRetBhiInfo.get(index);
    if (value == null) {
      hsrRetBhiInfo.set(
          index,
          new HsrRetBhiInfo(
              this, beginHsrRetBhiInfo + index * HsrRetBhiInfo.getHsrRetBhiInfoFieldLength()));
      value = hsrRetBhiInfo.get(index);
    }
    return value;
  }

  /**
   * Update HsrRetBhiInfo at index with the passed value Corresponding COBOL Variable is
   * HSR-RET-BHI-INFO
   *
   * @param index
   * @param value
   */
  public void setHsrRetBhiInfo(int index, char[] value) {
    getHsrRetBhiInfo(index).setString(value);
  }

  /**
   * initializes HsrRetReturn String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetNOSvcInd(CONSTANTS.SPACE);
    if (hsrRetBhiInfo.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < HSR_RET_BHI_INFO_SIZE; index++) {
        HsrRetBhiInfo newElement =
            new HsrRetBhiInfo(
                this, beginHsrRetBhiInfo + index * HsrRetBhiInfo.getHsrRetBhiInfoFieldLength());
        newElement.initialize();
        hsrRetBhiInfo.add(newElement);
      }
    } else {
      if (hsrRetBhiInfo.size() < HSR_RET_BHI_INFO_SIZE) {
        // prefill it first
        for (int index = hsrRetBhiInfo.size(); index < HSR_RET_BHI_INFO_SIZE; index++) {
          HsrRetBhiInfo newElement =
              new HsrRetBhiInfo(
                  this, beginHsrRetBhiInfo + index * HsrRetBhiInfo.getHsrRetBhiInfoFieldLength());
          hsrRetBhiInfo.add(newElement);
        }
      }

      for (int index = 0; index < HSR_RET_BHI_INFO_SIZE; index++) {
        HsrRetBhiInfo hsrRetBhiInfoVar = hsrRetBhiInfo.get(index);
        if (hsrRetBhiInfoVar == null) {
          hsrRetBhiInfoVar =
              new HsrRetBhiInfo(
                  this, beginHsrRetBhiInfo + index * HsrRetBhiInfo.getHsrRetBhiInfoFieldLength());
          hsrRetBhiInfo.set(index, hsrRetBhiInfoVar);
        }
        hsrRetBhiInfoVar.initialize();
      }
    }
  }

  public static int getHsrRetReturnFieldLength() {
    return HSR_RET_RETURN_LENGTH;
  }
}
