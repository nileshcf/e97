package com.cloudframe.app.dto.d5427pol;

/**
 * The class WorkVariables is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class WorkVariables extends WorkVariablesSerialized {

  private List<StdFields> stdFields = new ArrayList<>();

  private int lineSub;

  private char[] dsmPgmName = new char[8];

  private int dfltChgPct;

  private char[] policyNbr = Field.fillLowValue(6);

  private char[] policyInd = new char[1];

  private char[] obligId = new char[2];

  /** Constructor for WorkVariables */
  public WorkVariables() {
    super();
    /*  set the parent of each child as this which are a group variable */
    for (int arrayIndex = 0; arrayIndex < STD_FIELDS_SIZE; arrayIndex++) {
      stdFields.add(
          new StdFields(this, beginStdFields + arrayIndex * StdFields.getStdFieldsFieldLength()));
    }
    /*  end of offset */
    setDsmPgmName(("D5427POL").toCharArray());
    setPolicyInd(("N").toCharArray());
    setObligId(fillSpace(2));
  }

  /**
   * Returns the value of stdFields Corresponding COBOL Variable is WS-STD-FIELDS
   *
   * @return stdFields
   */
  public List<StdFields> getStdFields() {
    return stdFields;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return stdFields
   */
  public StdFields getStdFields(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getStdFields(), resetting it to 0", index);
      index = 0;
    } else if (index >= STD_FIELDS_SIZE) {
      index = STD_FIELDS_SIZE - 1; // can't exceed max array size
      logger.trace(
          "stdFields - Array index exceeded max Size {}, resetting it to max allowed",
          STD_FIELDS_SIZE);
    }
    if (index >= stdFields.size()) {
      for (int fillIndex = stdFields.size() - 1; fillIndex < index; fillIndex++) {
        stdFields.add(null);
      }
      stdFields.set(
          index, new StdFields(this, beginStdFields + index * StdFields.getStdFieldsFieldLength()));
    }
    StdFields value = stdFields.get(index);
    if (value == null) {
      stdFields.set(
          index, new StdFields(this, beginStdFields + index * StdFields.getStdFieldsFieldLength()));
      value = stdFields.get(index);
    }
    return value;
  }

  /**
   * Update StdFields at index with the passed value Corresponding COBOL Variable is WS-STD-FIELDS
   *
   * @param index
   * @param value
   */
  public void setStdFields(int index, char[] value) {
    getStdFields(index).setString(value);
  }

  /**
   * Returns the value of lineSub
   *
   * @return lineSub
   */
  public int getLineSub() throws CFException {
    if (isLineSubModified()) {
      lineSub = refreshLineSub();
    }
    return lineSub;
  }

  /**
   * Update LineSub with the passed value Corresponding COBOL Variable is WS-LINE-SUB
   *
   * @param number
   */
  public void setLineSub(int number) {
    // Truncate if the number is beyond +/- Max range
    lineSub = checkLineSubMaxLimit(number);
    serializeLineSub(lineSub);
  }

  public void setLineSub(long number) {
    number = checkLineSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLineSub((int) number);
  }

  /**
   * Returns the value of dsmPgmName
   *
   * @return dsmPgmName
   */
  public char[] getDsmPgmName() throws CFException {
    if (isDsmPgmNameModified()) {
      dsmPgmName = refreshDsmPgmName();
    }
    return dsmPgmName;
  }

  /**
   * set variable dsmPgmName Corresponding COBOL Variable is WS-DSM-PGM-NAME
   *
   * @param value
   */
  public void setDsmPgmName(char[] value) {
    dsmPgmName = checkDsmPgmNameConstraints(value);
    serializeDsmPgmName(dsmPgmName);
  }

  /**
   * Update DsmPgmName with a char[] from an offset and length
   *
   * @param value
   */
  public void setDsmPgmName(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDsmPgmName, dsmPgmName.length);
  }

  public void setDsmPgmName(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsmPgmName, dsmPgmName.length);
  }

  /**
   * Update DsmPgmName with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmPgmName(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsmPgmName + targetIndex, targetLen);
  }

  /**
   * Update DsmPgmName with another Field
   *
   * @param value
   */
  public void setDsmPgmName(Field source) {
    replace(source, 0, source.length(), beginDsmPgmName, DSM_PGM_NAME_LEN);
  }

  /**
   * Update DsmPgmName with another Field from an offset and length
   *
   * @param value
   */
  public void setDsmPgmName(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsmPgmName, DSM_PGM_NAME_LEN);
  }

  /**
   * Update DsmPgmName with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmPgmName(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsmPgmName + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfltChgPct
   *
   * @return dfltChgPct
   */
  public int getDfltChgPct() throws CFException {
    if (isDfltChgPctModified()) {
      dfltChgPct = refreshDfltChgPct();
    }
    return dfltChgPct;
  }

  /**
   * Update DfltChgPct with the passed value Corresponding COBOL Variable is WS-DFLT-CHG-PCT
   *
   * @param number
   */
  public void setDfltChgPct(int number) {
    // Truncate if the number is beyond +/- Max range
    dfltChgPct = checkDfltChgPctMaxLimit(number);
    serializeDfltChgPct(dfltChgPct);
  }

  public void setDfltChgPct(long number) {
    number = checkDfltChgPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDfltChgPct((int) number);
  }

  /**
   * Update DfltChgPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setDfltChgPct(char[] value) throws CFException {
    dfltChgPct = serializeDfltChgPct(value);
  }
  /**
   * Update DfltChgPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setDfltChgPctString(char[] value) throws CFException {
    setDfltChgPct(value);
  }
  /**
   * Returns the value of policyNbr
   *
   * @return policyNbr
   */
  public char[] getPolicyNbr() throws CFException {
    if (isPolicyNbrModified()) {
      policyNbr = refreshPolicyNbr();
    }
    return policyNbr;
  }

  /**
   * set variable policyNbr Corresponding COBOL Variable is WS-POLICY-NBR
   *
   * @param value
   */
  public void setPolicyNbr(char[] value) {
    policyNbr = checkPolicyNbrConstraints(value);
    serializePolicyNbr(policyNbr);
  }

  /**
   * Update PolicyNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolicyNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolicyNbr, policyNbr.length);
  }

  public void setPolicyNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyNbr, policyNbr.length);
  }

  /**
   * Update PolicyNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolicyNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyNbr + targetIndex, targetLen);
  }

  /**
   * Update PolicyNbr with another Field
   *
   * @param value
   */
  public void setPolicyNbr(Field source) {
    replace(source, 0, source.length(), beginPolicyNbr, POLICY_NBR_LEN);
  }

  /**
   * Update PolicyNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPolicyNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyNbr, POLICY_NBR_LEN);
  }

  /**
   * Update PolicyNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolicyNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of policyInd
   *
   * @return policyInd
   */
  public char[] getPolicyInd() throws CFException {
    if (isPolicyIndModified()) {
      policyInd = refreshPolicyInd();
    }
    return policyInd;
  }

  /**
   * set variable policyInd Corresponding COBOL Variable is WS-POLICY-IND
   *
   * @param value
   */
  public void setPolicyInd(char[] value) {
    policyInd = checkPolicyIndConstraints(value);
    serializePolicyInd(policyInd);
  }

  /**
   * Update PolicyInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolicyInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolicyInd, policyInd.length);
  }

  public void setPolicyInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyInd, policyInd.length);
  }

  /**
   * Update PolicyInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolicyInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyInd + targetIndex, targetLen);
  }

  /**
   * Update PolicyInd with another Field
   *
   * @param value
   */
  public void setPolicyInd(Field source) {
    replace(source, 0, source.length(), beginPolicyInd, POLICY_IND_LEN);
  }

  /**
   * Update PolicyInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolicyInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyInd, POLICY_IND_LEN);
  }

  /**
   * Update PolicyInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolicyInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolicyInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of obligId
   *
   * @return obligId
   */
  public char[] getObligId() throws CFException {
    if (isObligIdModified()) {
      obligId = refreshObligId();
    }
    return obligId;
  }

  /**
   * set variable obligId Corresponding COBOL Variable is WS-OBLIG-ID
   *
   * @param value
   */
  public void setObligId(char[] value) {
    obligId = checkObligIdConstraints(value);
    serializeObligId(obligId);
  }

  /**
   * Update ObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginObligId, obligId.length);
  }

  public void setObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginObligId, obligId.length);
  }

  /**
   * Update ObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginObligId + targetIndex, targetLen);
  }

  /**
   * Update ObligId with another Field
   *
   * @param value
   */
  public void setObligId(Field source) {
    replace(source, 0, source.length(), beginObligId, OBLIG_ID_LEN);
  }

  /**
   * Update ObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginObligId, OBLIG_ID_LEN);
  }

  /**
   * Update ObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginObligId + targetIndex, targetLen);
  }

  public static int getWorkVariablesFieldLength() {
    return WORK_VARIABLES_LENGTH;
  }
}
