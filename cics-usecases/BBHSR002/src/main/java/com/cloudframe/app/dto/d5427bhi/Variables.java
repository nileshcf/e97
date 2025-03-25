package com.cloudframe.app.dto.d5427bhi;

/**
 * The class Variables is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class Variables extends VariablesSerialized {

  private char[] dsmPgmName = new char[8];

  private char[] stsActive = new char[1];

  private char[] netIndBoth = new char[1];

  private char[] tempVar = Field.fillLowValue(1);

  /** Constructor for Variables */
  public Variables() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setDsmPgmName(("D5427BHI").toCharArray());
    setStsActive(("A").toCharArray());
    setNetIndBoth(("B").toCharArray());
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
   * Returns the value of stsActive
   *
   * @return stsActive
   */
  public char[] getStsActive() throws CFException {
    if (isStsActiveModified()) {
      stsActive = refreshStsActive();
    }
    return stsActive;
  }

  /**
   * set variable stsActive Corresponding COBOL Variable is WS-STS-ACTIVE
   *
   * @param value
   */
  public void setStsActive(char[] value) {
    stsActive = checkStsActiveConstraints(value);
    serializeStsActive(stsActive);
  }

  /**
   * Update StsActive with a char[] from an offset and length
   *
   * @param value
   */
  public void setStsActive(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginStsActive, stsActive.length);
  }

  public void setStsActive(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStsActive, stsActive.length);
  }

  /**
   * Update StsActive with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStsActive(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStsActive + targetIndex, targetLen);
  }

  /**
   * Update StsActive with another Field
   *
   * @param value
   */
  public void setStsActive(Field source) {
    replace(source, 0, source.length(), beginStsActive, STS_ACTIVE_LEN);
  }

  /**
   * Update StsActive with another Field from an offset and length
   *
   * @param value
   */
  public void setStsActive(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStsActive, STS_ACTIVE_LEN);
  }

  /**
   * Update StsActive with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStsActive(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStsActive + targetIndex, targetLen);
  }
  /**
   * Returns the value of netIndBoth
   *
   * @return netIndBoth
   */
  public char[] getNetIndBoth() throws CFException {
    if (isNetIndBothModified()) {
      netIndBoth = refreshNetIndBoth();
    }
    return netIndBoth;
  }

  /**
   * set variable netIndBoth Corresponding COBOL Variable is WS-NET-IND-BOTH
   *
   * @param value
   */
  public void setNetIndBoth(char[] value) {
    netIndBoth = checkNetIndBothConstraints(value);
    serializeNetIndBoth(netIndBoth);
  }

  /**
   * Update NetIndBoth with a char[] from an offset and length
   *
   * @param value
   */
  public void setNetIndBoth(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginNetIndBoth, netIndBoth.length);
  }

  public void setNetIndBoth(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginNetIndBoth, netIndBoth.length);
  }

  /**
   * Update NetIndBoth with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setNetIndBoth(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginNetIndBoth + targetIndex, targetLen);
  }

  /**
   * Update NetIndBoth with another Field
   *
   * @param value
   */
  public void setNetIndBoth(Field source) {
    replace(source, 0, source.length(), beginNetIndBoth, NET_IND_BOTH_LEN);
  }

  /**
   * Update NetIndBoth with another Field from an offset and length
   *
   * @param value
   */
  public void setNetIndBoth(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginNetIndBoth, NET_IND_BOTH_LEN);
  }

  /**
   * Update NetIndBoth with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setNetIndBoth(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginNetIndBoth + targetIndex, targetLen);
  }
  /**
   * Returns the value of tempVar
   *
   * @return tempVar
   */
  public char[] getTempVar() throws CFException {
    if (isTempVarModified()) {
      tempVar = refreshTempVar();
    }
    return tempVar;
  }

  /**
   * set variable tempVar Corresponding COBOL Variable is WS-TEMP-VAR
   *
   * @param value
   */
  public void setTempVar(char[] value) {
    tempVar = checkTempVarConstraints(value);
    serializeTempVar(tempVar);
  }

  /**
   * Update TempVar with a char[] from an offset and length
   *
   * @param value
   */
  public void setTempVar(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTempVar, tempVar.length);
  }

  public void setTempVar(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTempVar, tempVar.length);
  }

  /**
   * Update TempVar with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTempVar(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTempVar + targetIndex, targetLen);
  }

  /**
   * Update TempVar with another Field
   *
   * @param value
   */
  public void setTempVar(Field source) {
    replace(source, 0, source.length(), beginTempVar, TEMP_VAR_LEN);
  }

  /**
   * Update TempVar with another Field from an offset and length
   *
   * @param value
   */
  public void setTempVar(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTempVar, TEMP_VAR_LEN);
  }

  /**
   * Update TempVar with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTempVar(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTempVar + targetIndex, targetLen);
  }

  public static int getVariablesFieldLength() {
    return VARIABLES_LENGTH;
  }
}
