package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HpcRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class HpcRetArea extends HpcRetAreaSerialized {

  private char[] hpcRetCodeMoreSw = Field.fillLowValue(1);

  private int hpcRetCnt;
  private List<HpcRetHipaa> hpcRetHipaa = new ArrayList<>();

  /** Constructor for HpcRetArea */
  public HpcRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hpcRetCodeMoreSw
   *
   * @return hpcRetCodeMoreSw
   */
  public char[] getHpcRetCodeMoreSw() throws CFException {
    if (isHpcRetCodeMoreSwModified()) {
      hpcRetCodeMoreSw = refreshHpcRetCodeMoreSw();
    }
    return hpcRetCodeMoreSw;
  }

  /**
   * set variable hpcRetCodeMoreSw Corresponding COBOL Variable is HPC-RET-CODE-MORE-SW
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(char[] value) {
    hpcRetCodeMoreSw = checkHpcRetCodeMoreSwConstraints(value);
    serializeHpcRetCodeMoreSw(hpcRetCodeMoreSw);
  }

  /**
   * Update HpcRetCodeMoreSw with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcRetCodeMoreSw, hpcRetCodeMoreSw.length);
  }

  public void setHpcRetCodeMoreSw(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetCodeMoreSw, hpcRetCodeMoreSw.length);
  }

  /**
   * Update HpcRetCodeMoreSw with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetCodeMoreSw + targetIndex, targetLen);
  }

  /**
   * Update HpcRetCodeMoreSw with another Field
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(Field source) {
    replace(source, 0, source.length(), beginHpcRetCodeMoreSw, HPC_RET_CODE_MORE_SW_LEN);
  }

  /**
   * Update HpcRetCodeMoreSw with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetCodeMoreSw, HPC_RET_CODE_MORE_SW_LEN);
  }

  /**
   * Update HpcRetCodeMoreSw with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetCodeMoreSw(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetCodeMoreSw + targetIndex, targetLen);
  }

  char[] hpcRetCodeMoreRows88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isHpcRetCodeMoreRows()
   *
   * @return Returns true if isHpcRetCodeMoreRows() is "Y"
   */
  public boolean isHpcRetCodeMoreRows() throws CFException {
    return (compareChars(getHpcRetCodeMoreSw(), hpcRetCodeMoreRows88Value) == 0);
  }

  /** set values "Y" */
  public void setHpcRetCodeMoreRowsTrue() {
    setHpcRetCodeMoreSw(hpcRetCodeMoreRows88Value);
  }

  char[] hpcRetNoMoreRows88Value = "N".toCharArray();
  /**
   * Test condition "N" for isHpcRetNoMoreRows()
   *
   * @return Returns true if isHpcRetNoMoreRows() is "N"
   */
  public boolean isHpcRetNoMoreRows() throws CFException {
    return (compareChars(getHpcRetCodeMoreSw(), hpcRetNoMoreRows88Value) == 0);
  }

  /** set values "N" */
  public void setHpcRetNoMoreRowsTrue() {
    setHpcRetCodeMoreSw(hpcRetNoMoreRows88Value);
  }
  /**
   * Returns the value of hpcRetCnt
   *
   * @return hpcRetCnt
   */
  public int getHpcRetCnt() throws CFException {
    if (isHpcRetCntModified()) {
      hpcRetCnt = refreshHpcRetCnt();
    }
    return hpcRetCnt;
  }

  /**
   * Update HpcRetCnt with the passed value Corresponding COBOL Variable is HPC-RET-CNT
   *
   * @param number
   */
  public void setHpcRetCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    hpcRetCnt = checkHpcRetCntMaxLimit(number);
    serializeHpcRetCnt(hpcRetCnt);
  }

  public void setHpcRetCnt(long number) {
    number = checkHpcRetCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHpcRetCnt((int) number);
  }

  /**
   * Update HpcRetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHpcRetCnt(char[] value) throws CFException {
    hpcRetCnt = serializeHpcRetCnt(value);
  }
  /**
   * Update HpcRetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHpcRetCntString(char[] value) throws CFException {
    setHpcRetCnt(value);
  }
  /**
   * Returns the value of hpcRetHipaa Corresponding COBOL Variable is HPC-RET-HIPAA
   *
   * @return hpcRetHipaa
   */
  public List<HpcRetHipaa> getHpcRetHipaa() {
    return hpcRetHipaa;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return hpcRetHipaa
   */
  public HpcRetHipaa getHpcRetHipaa(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHpcRetHipaa(), resetting it to 0", index);
      index = 0;
    } else if (index >= HPC_RET_HIPAA_SIZE) {
      index = HPC_RET_HIPAA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hpcRetHipaa - Array index exceeded max Size {}, resetting it to max allowed",
          HPC_RET_HIPAA_SIZE);
    }
    if (index >= hpcRetHipaa.size()) {
      for (int fillIndex = hpcRetHipaa.size() - 1; fillIndex < index; fillIndex++) {
        hpcRetHipaa.add(null);
      }
      hpcRetHipaa.set(
          index,
          new HpcRetHipaa(
              this, beginHpcRetHipaa + index * HpcRetHipaa.getHpcRetHipaaFieldLength()));
    }
    HpcRetHipaa value = hpcRetHipaa.get(index);
    if (value == null) {
      hpcRetHipaa.set(
          index,
          new HpcRetHipaa(
              this, beginHpcRetHipaa + index * HpcRetHipaa.getHpcRetHipaaFieldLength()));
      value = hpcRetHipaa.get(index);
    }
    return value;
  }

  /**
   * Update HpcRetHipaa at index with the passed value Corresponding COBOL Variable is HPC-RET-HIPAA
   *
   * @param index
   * @param value
   */
  public void setHpcRetHipaa(int index, char[] value) {
    getHpcRetHipaa(index).setString(value);
  }

  /**
   * initializes HpcRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHpcRetCodeMoreSw(CONSTANTS.SPACE);
    setHpcRetCnt(0);
    if (hpcRetHipaa.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < HPC_RET_HIPAA_SIZE; index++) {
        HpcRetHipaa newElement =
            new HpcRetHipaa(
                this, beginHpcRetHipaa + index * HpcRetHipaa.getHpcRetHipaaFieldLength());
        newElement.initialize();
        hpcRetHipaa.add(newElement);
      }
    } else {
      if (hpcRetHipaa.size() < HPC_RET_HIPAA_SIZE) {
        // prefill it first
        for (int index = hpcRetHipaa.size(); index < HPC_RET_HIPAA_SIZE; index++) {
          HpcRetHipaa newElement =
              new HpcRetHipaa(
                  this, beginHpcRetHipaa + index * HpcRetHipaa.getHpcRetHipaaFieldLength());
          hpcRetHipaa.add(newElement);
        }
      }

      for (int index = 0; index < HPC_RET_HIPAA_SIZE; index++) {
        HpcRetHipaa hpcRetHipaaVar = hpcRetHipaa.get(index);
        if (hpcRetHipaaVar == null) {
          hpcRetHipaaVar =
              new HpcRetHipaa(
                  this, beginHpcRetHipaa + index * HpcRetHipaa.getHpcRetHipaaFieldLength());
          hpcRetHipaa.set(index, hpcRetHipaaVar);
        }
        hpcRetHipaaVar.initialize();
      }
    }
  }

  public static int getHpcRetAreaFieldLength() {
    return HPC_RET_AREA_LENGTH;
  }
}
