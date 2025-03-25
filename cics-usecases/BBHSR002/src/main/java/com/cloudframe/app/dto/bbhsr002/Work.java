package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Work extends WorkSerialized {

  private char[] panValet = new char[24];

  private char[] d5427hpc01 = new char[8];

  private char[] d5427pol01 = new char[8];

  private char[] d5427tli01 = new char[8];

  private char[] d5427bhi01 = new char[8];

  private char[] d5427scn01 = new char[8];

  private char[] versionNo = new char[1];

  private int sub1;

  private int sub2;

  private int bhiSub;

  private int hpaSub;

  private int bhiSub01;

  private int hipaaCodeUsedSub;

  private int posHipaaSub;

  private int posSub;

  private int posSub1;

  private char[] tliTableSw = Field.fillLowValue(1);

  private char[] bhiRowFndSw = Field.fillLowValue(1);

  private char[] methodSw = Field.fillLowValue(1);

  private char[] dFlag = Field.fillLowValue(1);

  private char[] iFlag = Field.fillLowValue(1);

  private char[] bFlag = Field.fillLowValue(1);

  private char[] oFlag = Field.fillLowValue(1);

  private char[] hipaaCd47Sw = Field.fillLowValue(1);

  private char[] hipaaCd47PresentSw = Field.fillLowValue(1);

  private char[] hipaaCd30PresentSw = Field.fillLowValue(1);

  private char[] allRowCreatedSw = new char[6];

  private char[] hcaTables = new char[6];

  private char[] empTables = new char[6];

  private char[] hcaPolicySets = new char[2];

  private char[] empPolicySets = new char[6];

  private int posCnt;

  private int hipaaCount;

  private int cicsDfhrespCode;

  private int wvAdaFlength;

  private short ehbHpaSub;

  private short ehbBhiSub;

  private short ehbBhiSub2;

  private char[] ehbBhiAf91000Ind = Field.fillLowValue(1);

  private char[] ehbBhiAf92507Ind = Field.fillLowValue(1);

  private char[] ehbBhiAfBothInd = Field.fillLowValue(1);

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setPanValet(("BBHSR002                ").toCharArray());
    setD5427hpc01(("D5427HPC").toCharArray());
    setD5427pol01(("D5427POL").toCharArray());
    setD5427tli01(("D5427TLI").toCharArray());
    setD5427bhi01(("D5427BHI").toCharArray());
    setD5427scn01(("D5427SCN").toCharArray());
    setVersionNo(("5").toCharArray());
    setSub2(0);
    setBhiSub(0);
    setHpaSub(0);
    setBhiSub01(0);
    setPosHipaaSub(0);
    setPosSub(0);
    setPosSub1(0);
    setAllRowCreatedSw(fillSpace(6));
    setHcaTables(fillSpace(6));
    setEmpTables(fillSpace(6));
    setHcaPolicySets(fillSpace(2));
    setEmpPolicySets(fillSpace(6));
  }

  /**
   * Returns the value of panValet
   *
   * @return panValet
   */
  public char[] getPanValet() throws CFException {
    return panValet;
  }

  /**
   * set variable panValet Corresponding COBOL Variable is PAN-VALET
   *
   * @param value
   */
  public void setPanValet(char[] value) {
    value = checkPanValetConstraints(value);
    arraycopy(value, 0, panValet, 0, value.length);
  }

  public void setPanValet(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, panValet, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of d5427hpc01
   *
   * @return d5427hpc01
   */
  public char[] getD5427hpc01() throws CFException {
    return d5427hpc01;
  }

  /**
   * set variable d5427hpc01 Corresponding COBOL Variable is WS-D5427HPC
   *
   * @param value
   */
  public void setD5427hpc01(char[] value) {
    value = checkD5427hpc01Constraints(value);
    arraycopy(value, 0, d5427hpc01, 0, value.length);
  }

  public void setD5427hpc01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, d5427hpc01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of d5427pol01
   *
   * @return d5427pol01
   */
  public char[] getD5427pol01() throws CFException {
    return d5427pol01;
  }

  /**
   * set variable d5427pol01 Corresponding COBOL Variable is WS-D5427POL
   *
   * @param value
   */
  public void setD5427pol01(char[] value) {
    value = checkD5427pol01Constraints(value);
    arraycopy(value, 0, d5427pol01, 0, value.length);
  }

  public void setD5427pol01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, d5427pol01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of d5427tli01
   *
   * @return d5427tli01
   */
  public char[] getD5427tli01() throws CFException {
    return d5427tli01;
  }

  /**
   * set variable d5427tli01 Corresponding COBOL Variable is WS-D5427TLI
   *
   * @param value
   */
  public void setD5427tli01(char[] value) {
    value = checkD5427tli01Constraints(value);
    arraycopy(value, 0, d5427tli01, 0, value.length);
  }

  public void setD5427tli01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, d5427tli01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of d5427bhi01
   *
   * @return d5427bhi01
   */
  public char[] getD5427bhi01() throws CFException {
    return d5427bhi01;
  }

  /**
   * set variable d5427bhi01 Corresponding COBOL Variable is WS-D5427BHI
   *
   * @param value
   */
  public void setD5427bhi01(char[] value) {
    value = checkD5427bhi01Constraints(value);
    arraycopy(value, 0, d5427bhi01, 0, value.length);
  }

  public void setD5427bhi01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, d5427bhi01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of d5427scn01
   *
   * @return d5427scn01
   */
  public char[] getD5427scn01() throws CFException {
    return d5427scn01;
  }

  /**
   * set variable d5427scn01 Corresponding COBOL Variable is WS-D5427SCN
   *
   * @param value
   */
  public void setD5427scn01(char[] value) {
    value = checkD5427scn01Constraints(value);
    arraycopy(value, 0, d5427scn01, 0, value.length);
  }

  public void setD5427scn01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, d5427scn01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of versionNo
   *
   * @return versionNo
   */
  public char[] getVersionNo() throws CFException {
    return versionNo;
  }

  /**
   * set variable versionNo Corresponding COBOL Variable is WS-VERSION-NO
   *
   * @param value
   */
  public void setVersionNo(char[] value) {
    value = checkVersionNoConstraints(value);
    arraycopy(value, 0, versionNo, 0, value.length);
  }

  public void setVersionNo(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, versionNo, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of sub1
   *
   * @return sub1
   */
  public int getSub1() throws CFException {
    if (isSub1Modified()) {
      sub1 = refreshSub1();
    }
    return sub1;
  }

  /**
   * Update Sub1 with the passed value Corresponding COBOL Variable is WS-SUB1
   *
   * @param number
   */
  public void setSub1(int number) {
    // Truncate if the number is beyond +/- Max range
    sub1 = checkSub1MaxLimit(number);
    serializeSub1(sub1);
  }

  public void setSub1(long number) {
    number = checkSub1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setSub1((int) number);
  }

  /**
   * Update Sub1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setSub1(char[] value) throws CFException {
    sub1 = serializeSub1(value);
  }
  /**
   * Update Sub1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setSub1String(char[] value) throws CFException {
    setSub1(value);
  }
  /**
   * Returns the value of sub2
   *
   * @return sub2
   */
  public int getSub2() throws CFException {
    return sub2;
  }

  /**
   * Update Sub2 with the passed value Corresponding COBOL Variable is WS-SUB2
   *
   * @param number
   */
  public void setSub2(int number) {
    // Truncate if the number is beyond +/- Max range
    sub2 = checkSub2MaxLimit(number);
  }

  public void setSub2(long number) {
    number = checkSub2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setSub2((int) number);
  }

  /**
   * Returns the value of bhiSub
   *
   * @return bhiSub
   */
  public int getBhiSub() throws CFException {
    return bhiSub;
  }

  /**
   * Update BhiSub with the passed value Corresponding COBOL Variable is BHI-SUB
   *
   * @param number
   */
  public void setBhiSub(int number) {
    // Truncate if the number is beyond +/- Max range
    bhiSub = checkBhiSubMaxLimit(number);
  }

  public void setBhiSub(long number) {
    number = checkBhiSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBhiSub((int) number);
  }

  /**
   * Returns the value of hpaSub
   *
   * @return hpaSub
   */
  public int getHpaSub() throws CFException {
    return hpaSub;
  }

  /**
   * Update HpaSub with the passed value Corresponding COBOL Variable is WS-HPA-SUB
   *
   * @param number
   */
  public void setHpaSub(int number) {
    // Truncate if the number is beyond +/- Max range
    hpaSub = checkHpaSubMaxLimit(number);
  }

  public void setHpaSub(long number) {
    number = checkHpaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHpaSub((int) number);
  }

  /**
   * Returns the value of bhiSub01
   *
   * @return bhiSub01
   */
  public int getBhiSub01() throws CFException {
    return bhiSub01;
  }

  /**
   * Update BhiSub01 with the passed value Corresponding COBOL Variable is WS-BHI-SUB
   *
   * @param number
   */
  public void setBhiSub01(int number) {
    // Truncate if the number is beyond +/- Max range
    bhiSub01 = checkBhiSub01MaxLimit(number);
  }

  public void setBhiSub01(long number) {
    number = checkBhiSub01MaxLimit(number); // Truncate if value is beyond +/- Max range
    setBhiSub01((int) number);
  }

  /**
   * Returns the value of hipaaCodeUsedSub
   *
   * @return hipaaCodeUsedSub
   */
  public int getHipaaCodeUsedSub() throws CFException {
    if (isHipaaCodeUsedSubModified()) {
      hipaaCodeUsedSub = refreshHipaaCodeUsedSub();
    }
    return hipaaCodeUsedSub;
  }

  /**
   * Update HipaaCodeUsedSub with the passed value Corresponding COBOL Variable is
   * HIPAA-CODE-USED-SUB
   *
   * @param number
   */
  public void setHipaaCodeUsedSub(int number) {
    // Truncate if the number is beyond +/- Max range
    hipaaCodeUsedSub = checkHipaaCodeUsedSubMaxLimit(number);
    serializeHipaaCodeUsedSub(hipaaCodeUsedSub);
  }

  public void setHipaaCodeUsedSub(long number) {
    number = checkHipaaCodeUsedSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHipaaCodeUsedSub((int) number);
  }

  /**
   * Update HipaaCodeUsedSub with the passed value
   *
   * @param value (String or char[])
   */
  public void setHipaaCodeUsedSub(char[] value) throws CFException {
    hipaaCodeUsedSub = serializeHipaaCodeUsedSub(value);
  }
  /**
   * Update HipaaCodeUsedSub with the passed value
   *
   * @param value (String or char[])
   */
  public void setHipaaCodeUsedSubString(char[] value) throws CFException {
    setHipaaCodeUsedSub(value);
  }
  /**
   * Returns the value of posHipaaSub
   *
   * @return posHipaaSub
   */
  public int getPosHipaaSub() throws CFException {
    return posHipaaSub;
  }

  /**
   * Update PosHipaaSub with the passed value Corresponding COBOL Variable is POS-HIPAA-SUB
   *
   * @param number
   */
  public void setPosHipaaSub(int number) {
    // Truncate if the number is beyond +/- Max range
    posHipaaSub = checkPosHipaaSubMaxLimit(number);
  }

  public void setPosHipaaSub(long number) {
    number = checkPosHipaaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosHipaaSub((int) number);
  }

  /**
   * Returns the value of posSub
   *
   * @return posSub
   */
  public int getPosSub() throws CFException {
    return posSub;
  }

  /**
   * Update PosSub with the passed value Corresponding COBOL Variable is POS-SUB
   *
   * @param number
   */
  public void setPosSub(int number) {
    // Truncate if the number is beyond +/- Max range
    posSub = checkPosSubMaxLimit(number);
  }

  public void setPosSub(long number) {
    number = checkPosSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosSub((int) number);
  }

  /**
   * Returns the value of posSub1
   *
   * @return posSub1
   */
  public int getPosSub1() throws CFException {
    return posSub1;
  }

  /**
   * Update PosSub1 with the passed value Corresponding COBOL Variable is POS-SUB1
   *
   * @param number
   */
  public void setPosSub1(int number) {
    // Truncate if the number is beyond +/- Max range
    posSub1 = checkPosSub1MaxLimit(number);
  }

  public void setPosSub1(long number) {
    number = checkPosSub1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosSub1((int) number);
  }

  /**
   * Returns the value of tliTableSw
   *
   * @return tliTableSw
   */
  public char[] getTliTableSw() throws CFException {
    return tliTableSw;
  }

  /**
   * set variable tliTableSw Corresponding COBOL Variable is WS-TLI-TABLE-SW
   *
   * @param value
   */
  public void setTliTableSw(char[] value) {
    value = checkTliTableSwConstraints(value);
    arraycopy(value, 0, tliTableSw, 0, value.length);
  }

  public void setTliTableSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, tliTableSw, 0, beginIndex + endIndex);
  }

  char[] tliTableNotFound88Value = "N".toCharArray();
  /**
   * Test condition "N" for isTliTableNotFound()
   *
   * @return Returns true if isTliTableNotFound() is "N"
   */
  public boolean isTliTableNotFound() throws CFException {
    return (compareChars(getTliTableSw(), tliTableNotFound88Value) == 0);
  }

  /** set values "N" */
  public void setTliTableNotFoundTrue() {
    setTliTableSw(tliTableNotFound88Value);
  }

  char[] tliTableFound88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isTliTableFound()
   *
   * @return Returns true if isTliTableFound() is "Y"
   */
  public boolean isTliTableFound() throws CFException {
    return (compareChars(getTliTableSw(), tliTableFound88Value) == 0);
  }

  /** set values "Y" */
  public void setTliTableFoundTrue() {
    setTliTableSw(tliTableFound88Value);
  }
  /**
   * Returns the value of bhiRowFndSw
   *
   * @return bhiRowFndSw
   */
  public char[] getBhiRowFndSw() throws CFException {
    return bhiRowFndSw;
  }

  /**
   * set variable bhiRowFndSw Corresponding COBOL Variable is WS-BHI-ROW-FND-SW
   *
   * @param value
   */
  public void setBhiRowFndSw(char[] value) {
    value = checkBhiRowFndSwConstraints(value);
    arraycopy(value, 0, bhiRowFndSw, 0, value.length);
  }

  public void setBhiRowFndSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, bhiRowFndSw, 0, beginIndex + endIndex);
  }

  char[] bhiRowFound88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isBhiRowFound()
   *
   * @return Returns true if isBhiRowFound() is "Y"
   */
  public boolean isBhiRowFound() throws CFException {
    return (compareChars(getBhiRowFndSw(), bhiRowFound88Value) == 0);
  }

  /** set values "Y" */
  public void setBhiRowFoundTrue() {
    setBhiRowFndSw(bhiRowFound88Value);
  }

  char[] bhiRowNotFound88Value = "N".toCharArray();
  /**
   * Test condition "N" for isBhiRowNotFound()
   *
   * @return Returns true if isBhiRowNotFound() is "N"
   */
  public boolean isBhiRowNotFound() throws CFException {
    return (compareChars(getBhiRowFndSw(), bhiRowNotFound88Value) == 0);
  }

  /** set values "N" */
  public void setBhiRowNotFoundTrue() {
    setBhiRowFndSw(bhiRowNotFound88Value);
  }
  /**
   * Returns the value of methodSw
   *
   * @return methodSw
   */
  public char[] getMethodSw() throws CFException {
    return methodSw;
  }

  /**
   * set variable methodSw Corresponding COBOL Variable is METHOD-SW
   *
   * @param value
   */
  public void setMethodSw(char[] value) {
    value = checkMethodSwConstraints(value);
    arraycopy(value, 0, methodSw, 0, value.length);
  }

  public void setMethodSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, methodSw, 0, beginIndex + endIndex);
  }

  char[] oldMethod88Value = "O".toCharArray();
  /**
   * Test condition "O" for isOldMethod()
   *
   * @return Returns true if isOldMethod() is "O"
   */
  public boolean isOldMethod() throws CFException {
    return (compareChars(getMethodSw(), oldMethod88Value) == 0);
  }

  /** set values "O" */
  public void setOldMethodTrue() {
    setMethodSw(oldMethod88Value);
  }

  char[] uMethod88Value = "U".toCharArray();
  /**
   * Test condition "U" for isUMethod()
   *
   * @return Returns true if isUMethod() is "U"
   */
  public boolean isUMethod() throws CFException {
    return (compareChars(getMethodSw(), uMethod88Value) == 0);
  }

  /** set values "U" */
  public void setUMethodTrue() {
    setMethodSw(uMethod88Value);
  }

  char[] newMethod88Value = "N".toCharArray();
  /**
   * Test condition "N" for isNewMethod()
   *
   * @return Returns true if isNewMethod() is "N"
   */
  public boolean isNewMethod() throws CFException {
    return (compareChars(getMethodSw(), newMethod88Value) == 0);
  }

  /** set values "N" */
  public void setNewMethodTrue() {
    setMethodSw(newMethod88Value);
  }
  /**
   * Returns the value of dFlag
   *
   * @return dFlag
   */
  public char[] getDFlag() throws CFException {
    return dFlag;
  }

  /**
   * set variable dFlag Corresponding COBOL Variable is WS-D-FLAG
   *
   * @param value
   */
  public void setDFlag(char[] value) {
    value = checkDFlagConstraints(value);
    arraycopy(value, 0, dFlag, 0, value.length);
  }

  public void setDFlag(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, dFlag, 0, beginIndex + endIndex);
  }

  char[] dFlagNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isDFlagNo()
   *
   * @return Returns true if isDFlagNo() is "N"
   */
  public boolean isDFlagNo() throws CFException {
    return (compareChars(getDFlag(), dFlagNo88Value) == 0);
  }

  /** set values "N" */
  public void setDFlagNoTrue() {
    setDFlag(dFlagNo88Value);
  }

  char[] dFlagYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isDFlagYes()
   *
   * @return Returns true if isDFlagYes() is "Y"
   */
  public boolean isDFlagYes() throws CFException {
    return (compareChars(getDFlag(), dFlagYes88Value) == 0);
  }

  /** set values "Y" */
  public void setDFlagYesTrue() {
    setDFlag(dFlagYes88Value);
  }
  /**
   * Returns the value of iFlag
   *
   * @return iFlag
   */
  public char[] getIFlag() throws CFException {
    return iFlag;
  }

  /**
   * set variable iFlag Corresponding COBOL Variable is WS-I-FLAG
   *
   * @param value
   */
  public void setIFlag(char[] value) {
    value = checkIFlagConstraints(value);
    arraycopy(value, 0, iFlag, 0, value.length);
  }

  public void setIFlag(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, iFlag, 0, beginIndex + endIndex);
  }

  char[] iFlagNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isIFlagNo()
   *
   * @return Returns true if isIFlagNo() is "N"
   */
  public boolean isIFlagNo() throws CFException {
    return (compareChars(getIFlag(), iFlagNo88Value) == 0);
  }

  /** set values "N" */
  public void setIFlagNoTrue() {
    setIFlag(iFlagNo88Value);
  }

  char[] iFlagYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isIFlagYes()
   *
   * @return Returns true if isIFlagYes() is "Y"
   */
  public boolean isIFlagYes() throws CFException {
    return (compareChars(getIFlag(), iFlagYes88Value) == 0);
  }

  /** set values "Y" */
  public void setIFlagYesTrue() {
    setIFlag(iFlagYes88Value);
  }
  /**
   * Returns the value of bFlag
   *
   * @return bFlag
   */
  public char[] getBFlag() throws CFException {
    return bFlag;
  }

  /**
   * set variable bFlag Corresponding COBOL Variable is WS-B-FLAG
   *
   * @param value
   */
  public void setBFlag(char[] value) {
    value = checkBFlagConstraints(value);
    arraycopy(value, 0, bFlag, 0, value.length);
  }

  public void setBFlag(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, bFlag, 0, beginIndex + endIndex);
  }

  char[] bFlagNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isBFlagNo()
   *
   * @return Returns true if isBFlagNo() is "N"
   */
  public boolean isBFlagNo() throws CFException {
    return (compareChars(getBFlag(), bFlagNo88Value) == 0);
  }

  /** set values "N" */
  public void setBFlagNoTrue() {
    setBFlag(bFlagNo88Value);
  }

  char[] bFlagYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isBFlagYes()
   *
   * @return Returns true if isBFlagYes() is "Y"
   */
  public boolean isBFlagYes() throws CFException {
    return (compareChars(getBFlag(), bFlagYes88Value) == 0);
  }

  /** set values "Y" */
  public void setBFlagYesTrue() {
    setBFlag(bFlagYes88Value);
  }
  /**
   * Returns the value of oFlag
   *
   * @return oFlag
   */
  public char[] getOFlag() throws CFException {
    return oFlag;
  }

  /**
   * set variable oFlag Corresponding COBOL Variable is WS-O-FLAG
   *
   * @param value
   */
  public void setOFlag(char[] value) {
    value = checkOFlagConstraints(value);
    arraycopy(value, 0, oFlag, 0, value.length);
  }

  public void setOFlag(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, oFlag, 0, beginIndex + endIndex);
  }

  char[] oFlagNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isOFlagNo()
   *
   * @return Returns true if isOFlagNo() is "N"
   */
  public boolean isOFlagNo() throws CFException {
    return (compareChars(getOFlag(), oFlagNo88Value) == 0);
  }

  /** set values "N" */
  public void setOFlagNoTrue() {
    setOFlag(oFlagNo88Value);
  }

  char[] oFlagYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isOFlagYes()
   *
   * @return Returns true if isOFlagYes() is "Y"
   */
  public boolean isOFlagYes() throws CFException {
    return (compareChars(getOFlag(), oFlagYes88Value) == 0);
  }

  /** set values "Y" */
  public void setOFlagYesTrue() {
    setOFlag(oFlagYes88Value);
  }
  /**
   * Returns the value of hipaaCd47Sw
   *
   * @return hipaaCd47Sw
   */
  public char[] getHipaaCd47Sw() throws CFException {
    return hipaaCd47Sw;
  }

  /**
   * set variable hipaaCd47Sw Corresponding COBOL Variable is WS-HIPAA-CD-47-SW
   *
   * @param value
   */
  public void setHipaaCd47Sw(char[] value) {
    value = checkHipaaCd47SwConstraints(value);
    arraycopy(value, 0, hipaaCd47Sw, 0, value.length);
  }

  public void setHipaaCd47Sw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hipaaCd47Sw, 0, beginIndex + endIndex);
  }

  char[] hipaaCd47Skipped88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isHipaaCd47Skipped()
   *
   * @return Returns true if isHipaaCd47Skipped() is "Y"
   */
  public boolean isHipaaCd47Skipped() throws CFException {
    return (compareChars(getHipaaCd47Sw(), hipaaCd47Skipped88Value) == 0);
  }

  /** set values "Y" */
  public void setHipaaCd47SkippedTrue() {
    setHipaaCd47Sw(hipaaCd47Skipped88Value);
  }

  char[] hipaaCd47NotSkipped88Value = "N".toCharArray();
  /**
   * Test condition "N" for isHipaaCd47NotSkipped()
   *
   * @return Returns true if isHipaaCd47NotSkipped() is "N"
   */
  public boolean isHipaaCd47NotSkipped() throws CFException {
    return (compareChars(getHipaaCd47Sw(), hipaaCd47NotSkipped88Value) == 0);
  }

  /** set values "N" */
  public void setHipaaCd47NotSkippedTrue() {
    setHipaaCd47Sw(hipaaCd47NotSkipped88Value);
  }
  /**
   * Returns the value of hipaaCd47PresentSw
   *
   * @return hipaaCd47PresentSw
   */
  public char[] getHipaaCd47PresentSw() throws CFException {
    return hipaaCd47PresentSw;
  }

  /**
   * set variable hipaaCd47PresentSw Corresponding COBOL Variable is WS-HIPAA-CD-47-PRESENT-SW
   *
   * @param value
   */
  public void setHipaaCd47PresentSw(char[] value) {
    value = checkHipaaCd47PresentSwConstraints(value);
    arraycopy(value, 0, hipaaCd47PresentSw, 0, value.length);
  }

  public void setHipaaCd47PresentSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hipaaCd47PresentSw, 0, beginIndex + endIndex);
  }

  char[] hipaa47Present88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isHipaa47Present()
   *
   * @return Returns true if isHipaa47Present() is "Y"
   */
  public boolean isHipaa47Present() throws CFException {
    return (compareChars(getHipaaCd47PresentSw(), hipaa47Present88Value) == 0);
  }

  /** set values "Y" */
  public void setHipaa47PresentTrue() {
    setHipaaCd47PresentSw(hipaa47Present88Value);
  }

  char[] hipaa47NotPresent88Value = "N".toCharArray();
  /**
   * Test condition "N" for isHipaa47NotPresent()
   *
   * @return Returns true if isHipaa47NotPresent() is "N"
   */
  public boolean isHipaa47NotPresent() throws CFException {
    return (compareChars(getHipaaCd47PresentSw(), hipaa47NotPresent88Value) == 0);
  }

  /** set values "N" */
  public void setHipaa47NotPresentTrue() {
    setHipaaCd47PresentSw(hipaa47NotPresent88Value);
  }
  /**
   * Returns the value of hipaaCd30PresentSw
   *
   * @return hipaaCd30PresentSw
   */
  public char[] getHipaaCd30PresentSw() throws CFException {
    return hipaaCd30PresentSw;
  }

  /**
   * set variable hipaaCd30PresentSw Corresponding COBOL Variable is WS-HIPAA-CD-30-PRESENT-SW
   *
   * @param value
   */
  public void setHipaaCd30PresentSw(char[] value) {
    value = checkHipaaCd30PresentSwConstraints(value);
    arraycopy(value, 0, hipaaCd30PresentSw, 0, value.length);
  }

  public void setHipaaCd30PresentSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hipaaCd30PresentSw, 0, beginIndex + endIndex);
  }

  char[] hipaa30Present88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isHipaa30Present()
   *
   * @return Returns true if isHipaa30Present() is "Y"
   */
  public boolean isHipaa30Present() throws CFException {
    return (compareChars(getHipaaCd30PresentSw(), hipaa30Present88Value) == 0);
  }

  /** set values "Y" */
  public void setHipaa30PresentTrue() {
    setHipaaCd30PresentSw(hipaa30Present88Value);
  }

  char[] hipaa30NotPresent88Value = "N".toCharArray();
  /**
   * Test condition "N" for isHipaa30NotPresent()
   *
   * @return Returns true if isHipaa30NotPresent() is "N"
   */
  public boolean isHipaa30NotPresent() throws CFException {
    return (compareChars(getHipaaCd30PresentSw(), hipaa30NotPresent88Value) == 0);
  }

  /** set values "N" */
  public void setHipaa30NotPresentTrue() {
    setHipaaCd30PresentSw(hipaa30NotPresent88Value);
  }
  /**
   * Returns the value of allRowCreatedSw
   *
   * @return allRowCreatedSw
   */
  public char[] getAllRowCreatedSw() throws CFException {
    return allRowCreatedSw;
  }

  /**
   * set variable allRowCreatedSw Corresponding COBOL Variable is WS-ALL-ROW-CREATED-SW
   *
   * @param value
   */
  public void setAllRowCreatedSw(char[] value) {
    value = checkAllRowCreatedSwConstraints(value);
    arraycopy(value, 0, allRowCreatedSw, 0, value.length);
  }

  public void setAllRowCreatedSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, allRowCreatedSw, 0, beginIndex + endIndex);
  }

  char[] allRowCreated88Value = "Y     ".toCharArray();
  /**
   * Test condition "Y" for isAllRowCreated()
   *
   * @return Returns true if isAllRowCreated() is "Y"
   */
  public boolean isAllRowCreated() throws CFException {
    return (compareChars(getAllRowCreatedSw(), allRowCreated88Value) == 0);
  }

  /** set values "Y" */
  public void setAllRowCreatedTrue() {
    setAllRowCreatedSw(allRowCreated88Value);
  }
  /**
   * Returns the value of hcaTables
   *
   * @return hcaTables
   */
  public char[] getHcaTables() throws CFException {
    return hcaTables;
  }

  /**
   * set variable hcaTables Corresponding COBOL Variable is WS-HCA-TABLES
   *
   * @param value
   */
  public void setHcaTables(char[] value) {
    value = checkHcaTablesConstraints(value);
    arraycopy(value, 0, hcaTables, 0, value.length);
  }

  public void setHcaTables(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hcaTables, 0, beginIndex + endIndex);
  }

  /**
   * Test condition "HCAN01" THRU "HCAN50" for isHcaTables1()
   *
   * @return Returns true if isHcaTables1() is "HCAN01" THRU "HCAN50"
   */
  public boolean isHcaTables1() throws CFException {
    return (isGreaterOrEqual(getHcaTables(), "HCAN01") && isLessOrEqual(getHcaTables(), "HCAN50"));
  }

  /** set values "HCAN01" THRU "HCAN50" */
  public void setHcaTables1True() {
    setHcaTables("HCAN01".toCharArray());
  }
  /**
   * Returns the value of empTables
   *
   * @return empTables
   */
  public char[] getEmpTables() throws CFException {
    return empTables;
  }

  /**
   * set variable empTables Corresponding COBOL Variable is WS-EMP-TABLES
   *
   * @param value
   */
  public void setEmpTables(char[] value) {
    value = checkEmpTablesConstraints(value);
    arraycopy(value, 0, empTables, 0, value.length);
  }

  public void setEmpTables(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, empTables, 0, beginIndex + endIndex);
  }

  /**
   * Test condition "EMP001" THRU "EMP134" for isEmpTables1()
   *
   * @return Returns true if isEmpTables1() is "EMP001" THRU "EMP134"
   */
  public boolean isEmpTables1() throws CFException {
    return (isGreaterOrEqual(getEmpTables(), "EMP001") && isLessOrEqual(getEmpTables(), "EMP134"));
  }

  /** set values "EMP001" THRU "EMP134" */
  public void setEmpTables1True() {
    setEmpTables("EMP001".toCharArray());
  }
  /**
   * Returns the value of hcaPolicySets
   *
   * @return hcaPolicySets
   */
  public char[] getHcaPolicySets() throws CFException {
    return hcaPolicySets;
  }

  /**
   * set variable hcaPolicySets Corresponding COBOL Variable is WS-HCA-POLICY-SETS
   *
   * @param value
   */
  public void setHcaPolicySets(char[] value) {
    value = checkHcaPolicySetsConstraints(value);
    arraycopy(value, 0, hcaPolicySets, 0, value.length);
  }

  public void setHcaPolicySets(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hcaPolicySets, 0, beginIndex + endIndex);
  }

  char[] set2188Value = "21".toCharArray();
  /**
   * Test condition "21" for isSet21()
   *
   * @return Returns true if isSet21() is "21"
   */
  public boolean isSet21() throws CFException {
    return (compareChars(getHcaPolicySets(), set2188Value) == 0);
  }

  /** set values "21" */
  public void setSet21True() {
    setHcaPolicySets(set2188Value);
  }

  char[] set2288Value = "22".toCharArray();
  /**
   * Test condition "22" for isSet22()
   *
   * @return Returns true if isSet22() is "22"
   */
  public boolean isSet22() throws CFException {
    return (compareChars(getHcaPolicySets(), set2288Value) == 0);
  }

  /** set values "22" */
  public void setSet22True() {
    setHcaPolicySets(set2288Value);
  }

  char[] set2388Value = "23".toCharArray();
  /**
   * Test condition "23" for isSet23()
   *
   * @return Returns true if isSet23() is "23"
   */
  public boolean isSet23() throws CFException {
    return (compareChars(getHcaPolicySets(), set2388Value) == 0);
  }

  /** set values "23" */
  public void setSet23True() {
    setHcaPolicySets(set2388Value);
  }

  char[] set2788Value = "27".toCharArray();
  /**
   * Test condition "27" for isSet27()
   *
   * @return Returns true if isSet27() is "27"
   */
  public boolean isSet27() throws CFException {
    return (compareChars(getHcaPolicySets(), set2788Value) == 0);
  }

  /** set values "27" */
  public void setSet27True() {
    setHcaPolicySets(set2788Value);
  }

  char[] set2888Value = "28".toCharArray();
  /**
   * Test condition "28" for isSet28()
   *
   * @return Returns true if isSet28() is "28"
   */
  public boolean isSet28() throws CFException {
    return (compareChars(getHcaPolicySets(), set2888Value) == 0);
  }

  /** set values "28" */
  public void setSet28True() {
    setHcaPolicySets(set2888Value);
  }

  char[] set3088Value = "30".toCharArray();
  /**
   * Test condition "30" for isSet30()
   *
   * @return Returns true if isSet30() is "30"
   */
  public boolean isSet30() throws CFException {
    return (compareChars(getHcaPolicySets(), set3088Value) == 0);
  }

  /** set values "30" */
  public void setSet30True() {
    setHcaPolicySets(set3088Value);
  }

  char[] set3188Value = "31".toCharArray();
  /**
   * Test condition "31" for isSet31()
   *
   * @return Returns true if isSet31() is "31"
   */
  public boolean isSet31() throws CFException {
    return (compareChars(getHcaPolicySets(), set3188Value) == 0);
  }

  /** set values "31" */
  public void setSet31True() {
    setHcaPolicySets(set3188Value);
  }

  char[] set3288Value = "32".toCharArray();
  /**
   * Test condition "32" for isSet32()
   *
   * @return Returns true if isSet32() is "32"
   */
  public boolean isSet32() throws CFException {
    return (compareChars(getHcaPolicySets(), set3288Value) == 0);
  }

  /** set values "32" */
  public void setSet32True() {
    setHcaPolicySets(set3288Value);
  }

  char[] set3388Value = "33".toCharArray();
  /**
   * Test condition "33" for isSet33()
   *
   * @return Returns true if isSet33() is "33"
   */
  public boolean isSet33() throws CFException {
    return (compareChars(getHcaPolicySets(), set3388Value) == 0);
  }

  /** set values "33" */
  public void setSet33True() {
    setHcaPolicySets(set3388Value);
  }

  char[] set3488Value = "34".toCharArray();
  /**
   * Test condition "34" for isSet34()
   *
   * @return Returns true if isSet34() is "34"
   */
  public boolean isSet34() throws CFException {
    return (compareChars(getHcaPolicySets(), set3488Value) == 0);
  }

  /** set values "34" */
  public void setSet34True() {
    setHcaPolicySets(set3488Value);
  }

  char[] set3588Value = "35".toCharArray();
  /**
   * Test condition "35" for isSet35()
   *
   * @return Returns true if isSet35() is "35"
   */
  public boolean isSet35() throws CFException {
    return (compareChars(getHcaPolicySets(), set3588Value) == 0);
  }

  /** set values "35" */
  public void setSet35True() {
    setHcaPolicySets(set3588Value);
  }

  char[] set3688Value = "36".toCharArray();
  /**
   * Test condition "36" for isSet36()
   *
   * @return Returns true if isSet36() is "36"
   */
  public boolean isSet36() throws CFException {
    return (compareChars(getHcaPolicySets(), set3688Value) == 0);
  }

  /** set values "36" */
  public void setSet36True() {
    setHcaPolicySets(set3688Value);
  }

  char[] set3788Value = "37".toCharArray();
  /**
   * Test condition "37" for isSet37()
   *
   * @return Returns true if isSet37() is "37"
   */
  public boolean isSet37() throws CFException {
    return (compareChars(getHcaPolicySets(), set3788Value) == 0);
  }

  /** set values "37" */
  public void setSet37True() {
    setHcaPolicySets(set3788Value);
  }

  char[] set3888Value = "38".toCharArray();
  /**
   * Test condition "38" for isSet38()
   *
   * @return Returns true if isSet38() is "38"
   */
  public boolean isSet38() throws CFException {
    return (compareChars(getHcaPolicySets(), set3888Value) == 0);
  }

  /** set values "38" */
  public void setSet38True() {
    setHcaPolicySets(set3888Value);
  }

  char[] set3988Value = "39".toCharArray();
  /**
   * Test condition "39" for isSet39()
   *
   * @return Returns true if isSet39() is "39"
   */
  public boolean isSet39() throws CFException {
    return (compareChars(getHcaPolicySets(), set3988Value) == 0);
  }

  /** set values "39" */
  public void setSet39True() {
    setHcaPolicySets(set3988Value);
  }

  char[] set4088Value = "40".toCharArray();
  /**
   * Test condition "40" for isSet40()
   *
   * @return Returns true if isSet40() is "40"
   */
  public boolean isSet40() throws CFException {
    return (compareChars(getHcaPolicySets(), set4088Value) == 0);
  }

  /** set values "40" */
  public void setSet40True() {
    setHcaPolicySets(set4088Value);
  }

  char[] set4188Value = "41".toCharArray();
  /**
   * Test condition "41" for isSet41()
   *
   * @return Returns true if isSet41() is "41"
   */
  public boolean isSet41() throws CFException {
    return (compareChars(getHcaPolicySets(), set4188Value) == 0);
  }

  /** set values "41" */
  public void setSet41True() {
    setHcaPolicySets(set4188Value);
  }

  char[] set4288Value = "42".toCharArray();
  /**
   * Test condition "42" for isSet42()
   *
   * @return Returns true if isSet42() is "42"
   */
  public boolean isSet42() throws CFException {
    return (compareChars(getHcaPolicySets(), set4288Value) == 0);
  }

  /** set values "42" */
  public void setSet42True() {
    setHcaPolicySets(set4288Value);
  }

  char[] set4388Value = "43".toCharArray();
  /**
   * Test condition "43" for isSet43()
   *
   * @return Returns true if isSet43() is "43"
   */
  public boolean isSet43() throws CFException {
    return (compareChars(getHcaPolicySets(), set4388Value) == 0);
  }

  /** set values "43" */
  public void setSet43True() {
    setHcaPolicySets(set4388Value);
  }

  char[] set4488Value = "44".toCharArray();
  /**
   * Test condition "44" for isSet44()
   *
   * @return Returns true if isSet44() is "44"
   */
  public boolean isSet44() throws CFException {
    return (compareChars(getHcaPolicySets(), set4488Value) == 0);
  }

  /** set values "44" */
  public void setSet44True() {
    setHcaPolicySets(set4488Value);
  }

  char[] set4588Value = "45".toCharArray();
  /**
   * Test condition "45" for isSet45()
   *
   * @return Returns true if isSet45() is "45"
   */
  public boolean isSet45() throws CFException {
    return (compareChars(getHcaPolicySets(), set4588Value) == 0);
  }

  /** set values "45" */
  public void setSet45True() {
    setHcaPolicySets(set4588Value);
  }

  char[] set4688Value = "46".toCharArray();
  /**
   * Test condition "46" for isSet46()
   *
   * @return Returns true if isSet46() is "46"
   */
  public boolean isSet46() throws CFException {
    return (compareChars(getHcaPolicySets(), set4688Value) == 0);
  }

  /** set values "46" */
  public void setSet46True() {
    setHcaPolicySets(set4688Value);
  }

  char[] set4788Value = "47".toCharArray();
  /**
   * Test condition "47" for isSet47()
   *
   * @return Returns true if isSet47() is "47"
   */
  public boolean isSet47() throws CFException {
    return (compareChars(getHcaPolicySets(), set4788Value) == 0);
  }

  /** set values "47" */
  public void setSet47True() {
    setHcaPolicySets(set4788Value);
  }

  char[] set4888Value = "48".toCharArray();
  /**
   * Test condition "48" for isSet48()
   *
   * @return Returns true if isSet48() is "48"
   */
  public boolean isSet48() throws CFException {
    return (compareChars(getHcaPolicySets(), set4888Value) == 0);
  }

  /** set values "48" */
  public void setSet48True() {
    setHcaPolicySets(set4888Value);
  }

  char[] set4988Value = "49".toCharArray();
  /**
   * Test condition "49" for isSet49()
   *
   * @return Returns true if isSet49() is "49"
   */
  public boolean isSet49() throws CFException {
    return (compareChars(getHcaPolicySets(), set4988Value) == 0);
  }

  /** set values "49" */
  public void setSet49True() {
    setHcaPolicySets(set4988Value);
  }

  char[] set5088Value = "50".toCharArray();
  /**
   * Test condition "50" for isSet50()
   *
   * @return Returns true if isSet50() is "50"
   */
  public boolean isSet50() throws CFException {
    return (compareChars(getHcaPolicySets(), set5088Value) == 0);
  }

  /** set values "50" */
  public void setSet50True() {
    setHcaPolicySets(set5088Value);
  }

  char[] set5188Value = "51".toCharArray();
  /**
   * Test condition "51" for isSet51()
   *
   * @return Returns true if isSet51() is "51"
   */
  public boolean isSet51() throws CFException {
    return (compareChars(getHcaPolicySets(), set5188Value) == 0);
  }

  /** set values "51" */
  public void setSet51True() {
    setHcaPolicySets(set5188Value);
  }

  char[] set5288Value = "52".toCharArray();
  /**
   * Test condition "52" for isSet52()
   *
   * @return Returns true if isSet52() is "52"
   */
  public boolean isSet52() throws CFException {
    return (compareChars(getHcaPolicySets(), set5288Value) == 0);
  }

  /** set values "52" */
  public void setSet52True() {
    setHcaPolicySets(set5288Value);
  }

  char[] set5388Value = "53".toCharArray();
  /**
   * Test condition "53" for isSet53()
   *
   * @return Returns true if isSet53() is "53"
   */
  public boolean isSet53() throws CFException {
    return (compareChars(getHcaPolicySets(), set5388Value) == 0);
  }

  /** set values "53" */
  public void setSet53True() {
    setHcaPolicySets(set5388Value);
  }
  /**
   * Returns the value of empPolicySets
   *
   * @return empPolicySets
   */
  public char[] getEmpPolicySets() throws CFException {
    return empPolicySets;
  }

  /**
   * set variable empPolicySets Corresponding COBOL Variable is WS-EMP-POLICY-SETS
   *
   * @param value
   */
  public void setEmpPolicySets(char[] value) {
    value = checkEmpPolicySetsConstraints(value);
    arraycopy(value, 0, empPolicySets, 0, value.length);
  }

  public void setEmpPolicySets(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, empPolicySets, 0, beginIndex + endIndex);
  }

  char[] empSet0188Value = "EMP001".toCharArray();
  /**
   * Test condition "EMP001" for isEmpSet01()
   *
   * @return Returns true if isEmpSet01() is "EMP001"
   */
  public boolean isEmpSet01() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0188Value) == 0);
  }

  /** set values "EMP001" */
  public void setEmpSet01True() {
    setEmpPolicySets(empSet0188Value);
  }

  char[] empSet0388Value = "EMP003".toCharArray();
  /**
   * Test condition "EMP003" for isEmpSet03()
   *
   * @return Returns true if isEmpSet03() is "EMP003"
   */
  public boolean isEmpSet03() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0388Value) == 0);
  }

  /** set values "EMP003" */
  public void setEmpSet03True() {
    setEmpPolicySets(empSet0388Value);
  }

  char[] empSet0488Value = "EMP004".toCharArray();
  /**
   * Test condition "EMP004" for isEmpSet04()
   *
   * @return Returns true if isEmpSet04() is "EMP004"
   */
  public boolean isEmpSet04() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0488Value) == 0);
  }

  /** set values "EMP004" */
  public void setEmpSet04True() {
    setEmpPolicySets(empSet0488Value);
  }

  char[] empSet0588Value = "EMP005".toCharArray();
  /**
   * Test condition "EMP005" for isEmpSet05()
   *
   * @return Returns true if isEmpSet05() is "EMP005"
   */
  public boolean isEmpSet05() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0588Value) == 0);
  }

  /** set values "EMP005" */
  public void setEmpSet05True() {
    setEmpPolicySets(empSet0588Value);
  }

  char[] empSet0688Value = "EMP006".toCharArray();
  /**
   * Test condition "EMP006" for isEmpSet06()
   *
   * @return Returns true if isEmpSet06() is "EMP006"
   */
  public boolean isEmpSet06() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0688Value) == 0);
  }

  /** set values "EMP006" */
  public void setEmpSet06True() {
    setEmpPolicySets(empSet0688Value);
  }

  char[] empSet0788Value = "EMP007".toCharArray();
  /**
   * Test condition "EMP007" for isEmpSet07()
   *
   * @return Returns true if isEmpSet07() is "EMP007"
   */
  public boolean isEmpSet07() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0788Value) == 0);
  }

  /** set values "EMP007" */
  public void setEmpSet07True() {
    setEmpPolicySets(empSet0788Value);
  }

  char[] empSet0888Value = "EMP008".toCharArray();
  /**
   * Test condition "EMP008" for isEmpSet08()
   *
   * @return Returns true if isEmpSet08() is "EMP008"
   */
  public boolean isEmpSet08() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0888Value) == 0);
  }

  /** set values "EMP008" */
  public void setEmpSet08True() {
    setEmpPolicySets(empSet0888Value);
  }

  char[] empSet0988Value = "EMP009".toCharArray();
  /**
   * Test condition "EMP009" for isEmpSet09()
   *
   * @return Returns true if isEmpSet09() is "EMP009"
   */
  public boolean isEmpSet09() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet0988Value) == 0);
  }

  /** set values "EMP009" */
  public void setEmpSet09True() {
    setEmpPolicySets(empSet0988Value);
  }

  char[] empSet1088Value = "EMP010".toCharArray();
  /**
   * Test condition "EMP010" for isEmpSet10()
   *
   * @return Returns true if isEmpSet10() is "EMP010"
   */
  public boolean isEmpSet10() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1088Value) == 0);
  }

  /** set values "EMP010" */
  public void setEmpSet10True() {
    setEmpPolicySets(empSet1088Value);
  }

  char[] empSet1288Value = "EMP012".toCharArray();
  /**
   * Test condition "EMP012" for isEmpSet12()
   *
   * @return Returns true if isEmpSet12() is "EMP012"
   */
  public boolean isEmpSet12() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1288Value) == 0);
  }

  /** set values "EMP012" */
  public void setEmpSet12True() {
    setEmpPolicySets(empSet1288Value);
  }

  char[] empSet1388Value = "EMP013".toCharArray();
  /**
   * Test condition "EMP013" for isEmpSet13()
   *
   * @return Returns true if isEmpSet13() is "EMP013"
   */
  public boolean isEmpSet13() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1388Value) == 0);
  }

  /** set values "EMP013" */
  public void setEmpSet13True() {
    setEmpPolicySets(empSet1388Value);
  }

  char[] empSet1488Value = "EMP014".toCharArray();
  /**
   * Test condition "EMP014" for isEmpSet14()
   *
   * @return Returns true if isEmpSet14() is "EMP014"
   */
  public boolean isEmpSet14() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1488Value) == 0);
  }

  /** set values "EMP014" */
  public void setEmpSet14True() {
    setEmpPolicySets(empSet1488Value);
  }

  char[] empSet1588Value = "EMP015".toCharArray();
  /**
   * Test condition "EMP015" for isEmpSet15()
   *
   * @return Returns true if isEmpSet15() is "EMP015"
   */
  public boolean isEmpSet15() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1588Value) == 0);
  }

  /** set values "EMP015" */
  public void setEmpSet15True() {
    setEmpPolicySets(empSet1588Value);
  }

  char[] empSet1688Value = "EMP016".toCharArray();
  /**
   * Test condition "EMP016" for isEmpSet16()
   *
   * @return Returns true if isEmpSet16() is "EMP016"
   */
  public boolean isEmpSet16() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1688Value) == 0);
  }

  /** set values "EMP016" */
  public void setEmpSet16True() {
    setEmpPolicySets(empSet1688Value);
  }

  char[] empSet1788Value = "EMP017".toCharArray();
  /**
   * Test condition "EMP017" for isEmpSet17()
   *
   * @return Returns true if isEmpSet17() is "EMP017"
   */
  public boolean isEmpSet17() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1788Value) == 0);
  }

  /** set values "EMP017" */
  public void setEmpSet17True() {
    setEmpPolicySets(empSet1788Value);
  }

  char[] empSet1888Value = "EMP018".toCharArray();
  /**
   * Test condition "EMP018" for isEmpSet18()
   *
   * @return Returns true if isEmpSet18() is "EMP018"
   */
  public boolean isEmpSet18() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1888Value) == 0);
  }

  /** set values "EMP018" */
  public void setEmpSet18True() {
    setEmpPolicySets(empSet1888Value);
  }

  char[] empSet1988Value = "EMP019".toCharArray();
  /**
   * Test condition "EMP019" for isEmpSet19()
   *
   * @return Returns true if isEmpSet19() is "EMP019"
   */
  public boolean isEmpSet19() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet1988Value) == 0);
  }

  /** set values "EMP019" */
  public void setEmpSet19True() {
    setEmpPolicySets(empSet1988Value);
  }

  char[] empSet2088Value = "EMP020".toCharArray();
  /**
   * Test condition "EMP020" for isEmpSet20()
   *
   * @return Returns true if isEmpSet20() is "EMP020"
   */
  public boolean isEmpSet20() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2088Value) == 0);
  }

  /** set values "EMP020" */
  public void setEmpSet20True() {
    setEmpPolicySets(empSet2088Value);
  }

  char[] empSet2188Value = "EMP021".toCharArray();
  /**
   * Test condition "EMP021" for isEmpSet21()
   *
   * @return Returns true if isEmpSet21() is "EMP021"
   */
  public boolean isEmpSet21() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2188Value) == 0);
  }

  /** set values "EMP021" */
  public void setEmpSet21True() {
    setEmpPolicySets(empSet2188Value);
  }

  char[] empSet2288Value = "EMP022".toCharArray();
  /**
   * Test condition "EMP022" for isEmpSet22()
   *
   * @return Returns true if isEmpSet22() is "EMP022"
   */
  public boolean isEmpSet22() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2288Value) == 0);
  }

  /** set values "EMP022" */
  public void setEmpSet22True() {
    setEmpPolicySets(empSet2288Value);
  }

  char[] empSet2388Value = "EMP023".toCharArray();
  /**
   * Test condition "EMP023" for isEmpSet23()
   *
   * @return Returns true if isEmpSet23() is "EMP023"
   */
  public boolean isEmpSet23() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2388Value) == 0);
  }

  /** set values "EMP023" */
  public void setEmpSet23True() {
    setEmpPolicySets(empSet2388Value);
  }

  char[] empSet2788Value = "EMP027".toCharArray();
  /**
   * Test condition "EMP027" for isEmpSet27()
   *
   * @return Returns true if isEmpSet27() is "EMP027"
   */
  public boolean isEmpSet27() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2788Value) == 0);
  }

  /** set values "EMP027" */
  public void setEmpSet27True() {
    setEmpPolicySets(empSet2788Value);
  }

  char[] empSet2888Value = "EMP028".toCharArray();
  /**
   * Test condition "EMP028" for isEmpSet28()
   *
   * @return Returns true if isEmpSet28() is "EMP028"
   */
  public boolean isEmpSet28() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2888Value) == 0);
  }

  /** set values "EMP028" */
  public void setEmpSet28True() {
    setEmpPolicySets(empSet2888Value);
  }

  char[] empSet2988Value = "EMP029".toCharArray();
  /**
   * Test condition "EMP029" for isEmpSet29()
   *
   * @return Returns true if isEmpSet29() is "EMP029"
   */
  public boolean isEmpSet29() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet2988Value) == 0);
  }

  /** set values "EMP029" */
  public void setEmpSet29True() {
    setEmpPolicySets(empSet2988Value);
  }

  char[] empSet3088Value = "EMP030".toCharArray();
  /**
   * Test condition "EMP030" for isEmpSet30()
   *
   * @return Returns true if isEmpSet30() is "EMP030"
   */
  public boolean isEmpSet30() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3088Value) == 0);
  }

  /** set values "EMP030" */
  public void setEmpSet30True() {
    setEmpPolicySets(empSet3088Value);
  }

  char[] empSet3188Value = "EMP031".toCharArray();
  /**
   * Test condition "EMP031" for isEmpSet31()
   *
   * @return Returns true if isEmpSet31() is "EMP031"
   */
  public boolean isEmpSet31() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3188Value) == 0);
  }

  /** set values "EMP031" */
  public void setEmpSet31True() {
    setEmpPolicySets(empSet3188Value);
  }

  char[] empSet3288Value = "EMP032".toCharArray();
  /**
   * Test condition "EMP032" for isEmpSet32()
   *
   * @return Returns true if isEmpSet32() is "EMP032"
   */
  public boolean isEmpSet32() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3288Value) == 0);
  }

  /** set values "EMP032" */
  public void setEmpSet32True() {
    setEmpPolicySets(empSet3288Value);
  }

  char[] empSet3388Value = "EMP033".toCharArray();
  /**
   * Test condition "EMP033" for isEmpSet33()
   *
   * @return Returns true if isEmpSet33() is "EMP033"
   */
  public boolean isEmpSet33() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3388Value) == 0);
  }

  /** set values "EMP033" */
  public void setEmpSet33True() {
    setEmpPolicySets(empSet3388Value);
  }

  char[] empSet3488Value = "EMP034".toCharArray();
  /**
   * Test condition "EMP034" for isEmpSet34()
   *
   * @return Returns true if isEmpSet34() is "EMP034"
   */
  public boolean isEmpSet34() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3488Value) == 0);
  }

  /** set values "EMP034" */
  public void setEmpSet34True() {
    setEmpPolicySets(empSet3488Value);
  }

  char[] empSet3588Value = "EMP035".toCharArray();
  /**
   * Test condition "EMP035" for isEmpSet35()
   *
   * @return Returns true if isEmpSet35() is "EMP035"
   */
  public boolean isEmpSet35() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3588Value) == 0);
  }

  /** set values "EMP035" */
  public void setEmpSet35True() {
    setEmpPolicySets(empSet3588Value);
  }

  char[] empSet3688Value = "EMP036".toCharArray();
  /**
   * Test condition "EMP036" for isEmpSet36()
   *
   * @return Returns true if isEmpSet36() is "EMP036"
   */
  public boolean isEmpSet36() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3688Value) == 0);
  }

  /** set values "EMP036" */
  public void setEmpSet36True() {
    setEmpPolicySets(empSet3688Value);
  }

  char[] empSet3788Value = "EMP037".toCharArray();
  /**
   * Test condition "EMP037" for isEmpSet37()
   *
   * @return Returns true if isEmpSet37() is "EMP037"
   */
  public boolean isEmpSet37() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3788Value) == 0);
  }

  /** set values "EMP037" */
  public void setEmpSet37True() {
    setEmpPolicySets(empSet3788Value);
  }

  char[] empSet3888Value = "EMP038".toCharArray();
  /**
   * Test condition "EMP038" for isEmpSet38()
   *
   * @return Returns true if isEmpSet38() is "EMP038"
   */
  public boolean isEmpSet38() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3888Value) == 0);
  }

  /** set values "EMP038" */
  public void setEmpSet38True() {
    setEmpPolicySets(empSet3888Value);
  }

  char[] empSet3988Value = "EMP039".toCharArray();
  /**
   * Test condition "EMP039" for isEmpSet39()
   *
   * @return Returns true if isEmpSet39() is "EMP039"
   */
  public boolean isEmpSet39() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet3988Value) == 0);
  }

  /** set values "EMP039" */
  public void setEmpSet39True() {
    setEmpPolicySets(empSet3988Value);
  }

  char[] empSet4088Value = "EMP040".toCharArray();
  /**
   * Test condition "EMP040" for isEmpSet40()
   *
   * @return Returns true if isEmpSet40() is "EMP040"
   */
  public boolean isEmpSet40() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4088Value) == 0);
  }

  /** set values "EMP040" */
  public void setEmpSet40True() {
    setEmpPolicySets(empSet4088Value);
  }

  char[] empSet4188Value = "EMP041".toCharArray();
  /**
   * Test condition "EMP041" for isEmpSet41()
   *
   * @return Returns true if isEmpSet41() is "EMP041"
   */
  public boolean isEmpSet41() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4188Value) == 0);
  }

  /** set values "EMP041" */
  public void setEmpSet41True() {
    setEmpPolicySets(empSet4188Value);
  }

  char[] empSet4288Value = "EMP042".toCharArray();
  /**
   * Test condition "EMP042" for isEmpSet42()
   *
   * @return Returns true if isEmpSet42() is "EMP042"
   */
  public boolean isEmpSet42() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4288Value) == 0);
  }

  /** set values "EMP042" */
  public void setEmpSet42True() {
    setEmpPolicySets(empSet4288Value);
  }

  char[] empSet4388Value = "EMP043".toCharArray();
  /**
   * Test condition "EMP043" for isEmpSet43()
   *
   * @return Returns true if isEmpSet43() is "EMP043"
   */
  public boolean isEmpSet43() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4388Value) == 0);
  }

  /** set values "EMP043" */
  public void setEmpSet43True() {
    setEmpPolicySets(empSet4388Value);
  }

  char[] empSet4488Value = "EMP044".toCharArray();
  /**
   * Test condition "EMP044" for isEmpSet44()
   *
   * @return Returns true if isEmpSet44() is "EMP044"
   */
  public boolean isEmpSet44() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4488Value) == 0);
  }

  /** set values "EMP044" */
  public void setEmpSet44True() {
    setEmpPolicySets(empSet4488Value);
  }

  char[] empSet4588Value = "EMP045".toCharArray();
  /**
   * Test condition "EMP045" for isEmpSet45()
   *
   * @return Returns true if isEmpSet45() is "EMP045"
   */
  public boolean isEmpSet45() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4588Value) == 0);
  }

  /** set values "EMP045" */
  public void setEmpSet45True() {
    setEmpPolicySets(empSet4588Value);
  }

  char[] empSet4688Value = "EMP046".toCharArray();
  /**
   * Test condition "EMP046" for isEmpSet46()
   *
   * @return Returns true if isEmpSet46() is "EMP046"
   */
  public boolean isEmpSet46() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4688Value) == 0);
  }

  /** set values "EMP046" */
  public void setEmpSet46True() {
    setEmpPolicySets(empSet4688Value);
  }

  char[] empSet4788Value = "EMP047".toCharArray();
  /**
   * Test condition "EMP047" for isEmpSet47()
   *
   * @return Returns true if isEmpSet47() is "EMP047"
   */
  public boolean isEmpSet47() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4788Value) == 0);
  }

  /** set values "EMP047" */
  public void setEmpSet47True() {
    setEmpPolicySets(empSet4788Value);
  }

  char[] empSet4888Value = "EMP048".toCharArray();
  /**
   * Test condition "EMP048" for isEmpSet48()
   *
   * @return Returns true if isEmpSet48() is "EMP048"
   */
  public boolean isEmpSet48() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4888Value) == 0);
  }

  /** set values "EMP048" */
  public void setEmpSet48True() {
    setEmpPolicySets(empSet4888Value);
  }

  char[] empSet4988Value = "EMP049".toCharArray();
  /**
   * Test condition "EMP049" for isEmpSet49()
   *
   * @return Returns true if isEmpSet49() is "EMP049"
   */
  public boolean isEmpSet49() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet4988Value) == 0);
  }

  /** set values "EMP049" */
  public void setEmpSet49True() {
    setEmpPolicySets(empSet4988Value);
  }

  char[] empSet5088Value = "EMP050".toCharArray();
  /**
   * Test condition "EMP050" for isEmpSet50()
   *
   * @return Returns true if isEmpSet50() is "EMP050"
   */
  public boolean isEmpSet50() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet5088Value) == 0);
  }

  /** set values "EMP050" */
  public void setEmpSet50True() {
    setEmpPolicySets(empSet5088Value);
  }

  char[] empSet5188Value = "EMP051".toCharArray();
  /**
   * Test condition "EMP051" for isEmpSet51()
   *
   * @return Returns true if isEmpSet51() is "EMP051"
   */
  public boolean isEmpSet51() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet5188Value) == 0);
  }

  /** set values "EMP051" */
  public void setEmpSet51True() {
    setEmpPolicySets(empSet5188Value);
  }

  char[] empSet5288Value = "EMP052".toCharArray();
  /**
   * Test condition "EMP052" for isEmpSet52()
   *
   * @return Returns true if isEmpSet52() is "EMP052"
   */
  public boolean isEmpSet52() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet5288Value) == 0);
  }

  /** set values "EMP052" */
  public void setEmpSet52True() {
    setEmpPolicySets(empSet5288Value);
  }

  char[] empSet8188Value = "EMP081".toCharArray();
  /**
   * Test condition "EMP081" for isEmpSet81()
   *
   * @return Returns true if isEmpSet81() is "EMP081"
   */
  public boolean isEmpSet81() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet8188Value) == 0);
  }

  /** set values "EMP081" */
  public void setEmpSet81True() {
    setEmpPolicySets(empSet8188Value);
  }

  char[] empSet8288Value = "EMP082".toCharArray();
  /**
   * Test condition "EMP082" for isEmpSet82()
   *
   * @return Returns true if isEmpSet82() is "EMP082"
   */
  public boolean isEmpSet82() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet8288Value) == 0);
  }

  /** set values "EMP082" */
  public void setEmpSet82True() {
    setEmpPolicySets(empSet8288Value);
  }

  char[] empSet8388Value = "EMP083".toCharArray();
  /**
   * Test condition "EMP083" for isEmpSet83()
   *
   * @return Returns true if isEmpSet83() is "EMP083"
   */
  public boolean isEmpSet83() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet8388Value) == 0);
  }

  /** set values "EMP083" */
  public void setEmpSet83True() {
    setEmpPolicySets(empSet8388Value);
  }

  char[] empSet8488Value = "EMP084".toCharArray();
  /**
   * Test condition "EMP084" for isEmpSet84()
   *
   * @return Returns true if isEmpSet84() is "EMP084"
   */
  public boolean isEmpSet84() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet8488Value) == 0);
  }

  /** set values "EMP084" */
  public void setEmpSet84True() {
    setEmpPolicySets(empSet8488Value);
  }

  char[] empSet8788Value = "EMP087".toCharArray();
  /**
   * Test condition "EMP087" for isEmpSet87()
   *
   * @return Returns true if isEmpSet87() is "EMP087"
   */
  public boolean isEmpSet87() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet8788Value) == 0);
  }

  /** set values "EMP087" */
  public void setEmpSet87True() {
    setEmpPolicySets(empSet8788Value);
  }

  char[] empSet14488Value = "EMP144".toCharArray();
  /**
   * Test condition "EMP144" for isEmpSet144()
   *
   * @return Returns true if isEmpSet144() is "EMP144"
   */
  public boolean isEmpSet144() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet14488Value) == 0);
  }

  /** set values "EMP144" */
  public void setEmpSet144True() {
    setEmpPolicySets(empSet14488Value);
  }

  char[] empSet14588Value = "EMP145".toCharArray();
  /**
   * Test condition "EMP145" for isEmpSet145()
   *
   * @return Returns true if isEmpSet145() is "EMP145"
   */
  public boolean isEmpSet145() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet14588Value) == 0);
  }

  /** set values "EMP145" */
  public void setEmpSet145True() {
    setEmpPolicySets(empSet14588Value);
  }

  char[] empSet14888Value = "EMP148".toCharArray();
  /**
   * Test condition "EMP148" for isEmpSet148()
   *
   * @return Returns true if isEmpSet148() is "EMP148"
   */
  public boolean isEmpSet148() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet14888Value) == 0);
  }

  /** set values "EMP148" */
  public void setEmpSet148True() {
    setEmpPolicySets(empSet14888Value);
  }

  char[] empSet14988Value = "EMP149".toCharArray();
  /**
   * Test condition "EMP149" for isEmpSet149()
   *
   * @return Returns true if isEmpSet149() is "EMP149"
   */
  public boolean isEmpSet149() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet14988Value) == 0);
  }

  /** set values "EMP149" */
  public void setEmpSet149True() {
    setEmpPolicySets(empSet14988Value);
  }

  char[] empSet15388Value = "EMP153".toCharArray();
  /**
   * Test condition "EMP153" for isEmpSet153()
   *
   * @return Returns true if isEmpSet153() is "EMP153"
   */
  public boolean isEmpSet153() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet15388Value) == 0);
  }

  /** set values "EMP153" */
  public void setEmpSet153True() {
    setEmpPolicySets(empSet15388Value);
  }

  char[] empSet15488Value = "EMP154".toCharArray();
  /**
   * Test condition "EMP154" for isEmpSet154()
   *
   * @return Returns true if isEmpSet154() is "EMP154"
   */
  public boolean isEmpSet154() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet15488Value) == 0);
  }

  /** set values "EMP154" */
  public void setEmpSet154True() {
    setEmpPolicySets(empSet15488Value);
  }

  char[] empSet15788Value = "EMP157".toCharArray();
  /**
   * Test condition "EMP157" for isEmpSet157()
   *
   * @return Returns true if isEmpSet157() is "EMP157"
   */
  public boolean isEmpSet157() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet15788Value) == 0);
  }

  /** set values "EMP157" */
  public void setEmpSet157True() {
    setEmpPolicySets(empSet15788Value);
  }

  char[] empSet15888Value = "EMP158".toCharArray();
  /**
   * Test condition "EMP158" for isEmpSet158()
   *
   * @return Returns true if isEmpSet158() is "EMP158"
   */
  public boolean isEmpSet158() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet15888Value) == 0);
  }

  /** set values "EMP158" */
  public void setEmpSet158True() {
    setEmpPolicySets(empSet15888Value);
  }

  char[] empSet15988Value = "EMP159".toCharArray();
  /**
   * Test condition "EMP159" for isEmpSet159()
   *
   * @return Returns true if isEmpSet159() is "EMP159"
   */
  public boolean isEmpSet159() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet15988Value) == 0);
  }

  /** set values "EMP159" */
  public void setEmpSet159True() {
    setEmpPolicySets(empSet15988Value);
  }

  char[] empSet16088Value = "EMP160".toCharArray();
  /**
   * Test condition "EMP160" for isEmpSet160()
   *
   * @return Returns true if isEmpSet160() is "EMP160"
   */
  public boolean isEmpSet160() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16088Value) == 0);
  }

  /** set values "EMP160" */
  public void setEmpSet160True() {
    setEmpPolicySets(empSet16088Value);
  }

  char[] empSet16188Value = "EMP161".toCharArray();
  /**
   * Test condition "EMP161" for isEmpSet161()
   *
   * @return Returns true if isEmpSet161() is "EMP161"
   */
  public boolean isEmpSet161() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16188Value) == 0);
  }

  /** set values "EMP161" */
  public void setEmpSet161True() {
    setEmpPolicySets(empSet16188Value);
  }

  char[] empSet16288Value = "EMP162".toCharArray();
  /**
   * Test condition "EMP162" for isEmpSet162()
   *
   * @return Returns true if isEmpSet162() is "EMP162"
   */
  public boolean isEmpSet162() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16288Value) == 0);
  }

  /** set values "EMP162" */
  public void setEmpSet162True() {
    setEmpPolicySets(empSet16288Value);
  }

  char[] empSet16388Value = "EMP163".toCharArray();
  /**
   * Test condition "EMP163" for isEmpSet163()
   *
   * @return Returns true if isEmpSet163() is "EMP163"
   */
  public boolean isEmpSet163() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16388Value) == 0);
  }

  /** set values "EMP163" */
  public void setEmpSet163True() {
    setEmpPolicySets(empSet16388Value);
  }

  char[] empSet16488Value = "EMP164".toCharArray();
  /**
   * Test condition "EMP164" for isEmpSet164()
   *
   * @return Returns true if isEmpSet164() is "EMP164"
   */
  public boolean isEmpSet164() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16488Value) == 0);
  }

  /** set values "EMP164" */
  public void setEmpSet164True() {
    setEmpPolicySets(empSet16488Value);
  }

  char[] empSet16588Value = "EMP165".toCharArray();
  /**
   * Test condition "EMP165" for isEmpSet165()
   *
   * @return Returns true if isEmpSet165() is "EMP165"
   */
  public boolean isEmpSet165() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16588Value) == 0);
  }

  /** set values "EMP165" */
  public void setEmpSet165True() {
    setEmpPolicySets(empSet16588Value);
  }

  char[] empSet16688Value = "EMP166".toCharArray();
  /**
   * Test condition "EMP166" for isEmpSet166()
   *
   * @return Returns true if isEmpSet166() is "EMP166"
   */
  public boolean isEmpSet166() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16688Value) == 0);
  }

  /** set values "EMP166" */
  public void setEmpSet166True() {
    setEmpPolicySets(empSet16688Value);
  }

  char[] empSet16788Value = "EMP167".toCharArray();
  /**
   * Test condition "EMP167" for isEmpSet167()
   *
   * @return Returns true if isEmpSet167() is "EMP167"
   */
  public boolean isEmpSet167() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16788Value) == 0);
  }

  /** set values "EMP167" */
  public void setEmpSet167True() {
    setEmpPolicySets(empSet16788Value);
  }

  char[] empSet16888Value = "EMP168".toCharArray();
  /**
   * Test condition "EMP168" for isEmpSet168()
   *
   * @return Returns true if isEmpSet168() is "EMP168"
   */
  public boolean isEmpSet168() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16888Value) == 0);
  }

  /** set values "EMP168" */
  public void setEmpSet168True() {
    setEmpPolicySets(empSet16888Value);
  }

  char[] empSet16988Value = "EMP169".toCharArray();
  /**
   * Test condition "EMP169" for isEmpSet169()
   *
   * @return Returns true if isEmpSet169() is "EMP169"
   */
  public boolean isEmpSet169() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet16988Value) == 0);
  }

  /** set values "EMP169" */
  public void setEmpSet169True() {
    setEmpPolicySets(empSet16988Value);
  }

  char[] empSet17088Value = "EMP170".toCharArray();
  /**
   * Test condition "EMP170" for isEmpSet170()
   *
   * @return Returns true if isEmpSet170() is "EMP170"
   */
  public boolean isEmpSet170() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet17088Value) == 0);
  }

  /** set values "EMP170" */
  public void setEmpSet170True() {
    setEmpPolicySets(empSet17088Value);
  }

  char[] empSet17188Value = "EMP171".toCharArray();
  /**
   * Test condition "EMP171" for isEmpSet171()
   *
   * @return Returns true if isEmpSet171() is "EMP171"
   */
  public boolean isEmpSet171() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet17188Value) == 0);
  }

  /** set values "EMP171" */
  public void setEmpSet171True() {
    setEmpPolicySets(empSet17188Value);
  }

  char[] empSet17288Value = "EMP172".toCharArray();
  /**
   * Test condition "EMP172" for isEmpSet172()
   *
   * @return Returns true if isEmpSet172() is "EMP172"
   */
  public boolean isEmpSet172() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet17288Value) == 0);
  }

  /** set values "EMP172" */
  public void setEmpSet172True() {
    setEmpPolicySets(empSet17288Value);
  }

  char[] empSet19588Value = "EMP195".toCharArray();
  /**
   * Test condition "EMP195" for isEmpSet195()
   *
   * @return Returns true if isEmpSet195() is "EMP195"
   */
  public boolean isEmpSet195() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet19588Value) == 0);
  }

  /** set values "EMP195" */
  public void setEmpSet195True() {
    setEmpPolicySets(empSet19588Value);
  }

  char[] empSet19688Value = "EMP196".toCharArray();
  /**
   * Test condition "EMP196" for isEmpSet196()
   *
   * @return Returns true if isEmpSet196() is "EMP196"
   */
  public boolean isEmpSet196() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet19688Value) == 0);
  }

  /** set values "EMP196" */
  public void setEmpSet196True() {
    setEmpPolicySets(empSet19688Value);
  }

  char[] empSet19788Value = "EMP197".toCharArray();
  /**
   * Test condition "EMP197" for isEmpSet197()
   *
   * @return Returns true if isEmpSet197() is "EMP197"
   */
  public boolean isEmpSet197() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet19788Value) == 0);
  }

  /** set values "EMP197" */
  public void setEmpSet197True() {
    setEmpPolicySets(empSet19788Value);
  }

  char[] empSet19888Value = "EMP198".toCharArray();
  /**
   * Test condition "EMP198" for isEmpSet198()
   *
   * @return Returns true if isEmpSet198() is "EMP198"
   */
  public boolean isEmpSet198() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet19888Value) == 0);
  }

  /** set values "EMP198" */
  public void setEmpSet198True() {
    setEmpPolicySets(empSet19888Value);
  }

  char[] empSet19988Value = "EMP199".toCharArray();
  /**
   * Test condition "EMP199" for isEmpSet199()
   *
   * @return Returns true if isEmpSet199() is "EMP199"
   */
  public boolean isEmpSet199() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet19988Value) == 0);
  }

  /** set values "EMP199" */
  public void setEmpSet199True() {
    setEmpPolicySets(empSet19988Value);
  }

  char[] empSet20088Value = "EMP200".toCharArray();
  /**
   * Test condition "EMP200" for isEmpSet200()
   *
   * @return Returns true if isEmpSet200() is "EMP200"
   */
  public boolean isEmpSet200() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20088Value) == 0);
  }

  /** set values "EMP200" */
  public void setEmpSet200True() {
    setEmpPolicySets(empSet20088Value);
  }

  char[] empSet20188Value = "EMP201".toCharArray();
  /**
   * Test condition "EMP201" for isEmpSet201()
   *
   * @return Returns true if isEmpSet201() is "EMP201"
   */
  public boolean isEmpSet201() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20188Value) == 0);
  }

  /** set values "EMP201" */
  public void setEmpSet201True() {
    setEmpPolicySets(empSet20188Value);
  }

  char[] empSet20288Value = "EMP202".toCharArray();
  /**
   * Test condition "EMP202" for isEmpSet202()
   *
   * @return Returns true if isEmpSet202() is "EMP202"
   */
  public boolean isEmpSet202() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20288Value) == 0);
  }

  /** set values "EMP202" */
  public void setEmpSet202True() {
    setEmpPolicySets(empSet20288Value);
  }

  char[] empSet20388Value = "EMP203".toCharArray();
  /**
   * Test condition "EMP203" for isEmpSet203()
   *
   * @return Returns true if isEmpSet203() is "EMP203"
   */
  public boolean isEmpSet203() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20388Value) == 0);
  }

  /** set values "EMP203" */
  public void setEmpSet203True() {
    setEmpPolicySets(empSet20388Value);
  }

  char[] empSet20488Value = "EMP204".toCharArray();
  /**
   * Test condition "EMP204" for isEmpSet204()
   *
   * @return Returns true if isEmpSet204() is "EMP204"
   */
  public boolean isEmpSet204() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20488Value) == 0);
  }

  /** set values "EMP204" */
  public void setEmpSet204True() {
    setEmpPolicySets(empSet20488Value);
  }

  char[] empSet20588Value = "EMP205".toCharArray();
  /**
   * Test condition "EMP205" for isEmpSet205()
   *
   * @return Returns true if isEmpSet205() is "EMP205"
   */
  public boolean isEmpSet205() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20588Value) == 0);
  }

  /** set values "EMP205" */
  public void setEmpSet205True() {
    setEmpPolicySets(empSet20588Value);
  }

  char[] empSet20688Value = "EMP206".toCharArray();
  /**
   * Test condition "EMP206" for isEmpSet206()
   *
   * @return Returns true if isEmpSet206() is "EMP206"
   */
  public boolean isEmpSet206() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet20688Value) == 0);
  }

  /** set values "EMP206" */
  public void setEmpSet206True() {
    setEmpPolicySets(empSet20688Value);
  }

  char[] empSet21188Value = "EMP211".toCharArray();
  /**
   * Test condition "EMP211" for isEmpSet211()
   *
   * @return Returns true if isEmpSet211() is "EMP211"
   */
  public boolean isEmpSet211() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet21188Value) == 0);
  }

  /** set values "EMP211" */
  public void setEmpSet211True() {
    setEmpPolicySets(empSet21188Value);
  }

  char[] empSet21288Value = "EMP212".toCharArray();
  /**
   * Test condition "EMP212" for isEmpSet212()
   *
   * @return Returns true if isEmpSet212() is "EMP212"
   */
  public boolean isEmpSet212() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet21288Value) == 0);
  }

  /** set values "EMP212" */
  public void setEmpSet212True() {
    setEmpPolicySets(empSet21288Value);
  }

  char[] empSet21388Value = "EMP213".toCharArray();
  /**
   * Test condition "EMP213" for isEmpSet213()
   *
   * @return Returns true if isEmpSet213() is "EMP213"
   */
  public boolean isEmpSet213() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet21388Value) == 0);
  }

  /** set values "EMP213" */
  public void setEmpSet213True() {
    setEmpPolicySets(empSet21388Value);
  }

  char[] empSet21488Value = "EMP214".toCharArray();
  /**
   * Test condition "EMP214" for isEmpSet214()
   *
   * @return Returns true if isEmpSet214() is "EMP214"
   */
  public boolean isEmpSet214() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet21488Value) == 0);
  }

  /** set values "EMP214" */
  public void setEmpSet214True() {
    setEmpPolicySets(empSet21488Value);
  }

  char[] empSet24788Value = "EMP247".toCharArray();
  /**
   * Test condition "EMP247" for isEmpSet247()
   *
   * @return Returns true if isEmpSet247() is "EMP247"
   */
  public boolean isEmpSet247() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet24788Value) == 0);
  }

  /** set values "EMP247" */
  public void setEmpSet247True() {
    setEmpPolicySets(empSet24788Value);
  }

  char[] empSet24888Value = "EMP248".toCharArray();
  /**
   * Test condition "EMP248" for isEmpSet248()
   *
   * @return Returns true if isEmpSet248() is "EMP248"
   */
  public boolean isEmpSet248() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet24888Value) == 0);
  }

  /** set values "EMP248" */
  public void setEmpSet248True() {
    setEmpPolicySets(empSet24888Value);
  }

  char[] empSet24988Value = "EMP249".toCharArray();
  /**
   * Test condition "EMP249" for isEmpSet249()
   *
   * @return Returns true if isEmpSet249() is "EMP249"
   */
  public boolean isEmpSet249() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet24988Value) == 0);
  }

  /** set values "EMP249" */
  public void setEmpSet249True() {
    setEmpPolicySets(empSet24988Value);
  }

  char[] empSet25088Value = "EMP250".toCharArray();
  /**
   * Test condition "EMP250" for isEmpSet250()
   *
   * @return Returns true if isEmpSet250() is "EMP250"
   */
  public boolean isEmpSet250() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet25088Value) == 0);
  }

  /** set values "EMP250" */
  public void setEmpSet250True() {
    setEmpPolicySets(empSet25088Value);
  }

  char[] empSet25188Value = "EMP251".toCharArray();
  /**
   * Test condition "EMP251" for isEmpSet251()
   *
   * @return Returns true if isEmpSet251() is "EMP251"
   */
  public boolean isEmpSet251() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet25188Value) == 0);
  }

  /** set values "EMP251" */
  public void setEmpSet251True() {
    setEmpPolicySets(empSet25188Value);
  }

  char[] empSet25988Value = "EMP259".toCharArray();
  /**
   * Test condition "EMP259" for isEmpSet259()
   *
   * @return Returns true if isEmpSet259() is "EMP259"
   */
  public boolean isEmpSet259() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet25988Value) == 0);
  }

  /** set values "EMP259" */
  public void setEmpSet259True() {
    setEmpPolicySets(empSet25988Value);
  }

  char[] empSet26088Value = "EMP260".toCharArray();
  /**
   * Test condition "EMP260" for isEmpSet260()
   *
   * @return Returns true if isEmpSet260() is "EMP260"
   */
  public boolean isEmpSet260() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26088Value) == 0);
  }

  /** set values "EMP260" */
  public void setEmpSet260True() {
    setEmpPolicySets(empSet26088Value);
  }

  char[] empSet26188Value = "EMP261".toCharArray();
  /**
   * Test condition "EMP261" for isEmpSet261()
   *
   * @return Returns true if isEmpSet261() is "EMP261"
   */
  public boolean isEmpSet261() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26188Value) == 0);
  }

  /** set values "EMP261" */
  public void setEmpSet261True() {
    setEmpPolicySets(empSet26188Value);
  }

  char[] empSet26288Value = "EMP262".toCharArray();
  /**
   * Test condition "EMP262" for isEmpSet262()
   *
   * @return Returns true if isEmpSet262() is "EMP262"
   */
  public boolean isEmpSet262() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26288Value) == 0);
  }

  /** set values "EMP262" */
  public void setEmpSet262True() {
    setEmpPolicySets(empSet26288Value);
  }

  char[] empSet26388Value = "EMP263".toCharArray();
  /**
   * Test condition "EMP263" for isEmpSet263()
   *
   * @return Returns true if isEmpSet263() is "EMP263"
   */
  public boolean isEmpSet263() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26388Value) == 0);
  }

  /** set values "EMP263" */
  public void setEmpSet263True() {
    setEmpPolicySets(empSet26388Value);
  }

  char[] empSet26488Value = "EMP264".toCharArray();
  /**
   * Test condition "EMP264" for isEmpSet264()
   *
   * @return Returns true if isEmpSet264() is "EMP264"
   */
  public boolean isEmpSet264() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26488Value) == 0);
  }

  /** set values "EMP264" */
  public void setEmpSet264True() {
    setEmpPolicySets(empSet26488Value);
  }

  char[] empSet26588Value = "EMP265".toCharArray();
  /**
   * Test condition "EMP265" for isEmpSet265()
   *
   * @return Returns true if isEmpSet265() is "EMP265"
   */
  public boolean isEmpSet265() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26588Value) == 0);
  }

  /** set values "EMP265" */
  public void setEmpSet265True() {
    setEmpPolicySets(empSet26588Value);
  }

  char[] empSet26688Value = "EMP266".toCharArray();
  /**
   * Test condition "EMP266" for isEmpSet266()
   *
   * @return Returns true if isEmpSet266() is "EMP266"
   */
  public boolean isEmpSet266() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26688Value) == 0);
  }

  /** set values "EMP266" */
  public void setEmpSet266True() {
    setEmpPolicySets(empSet26688Value);
  }

  char[] empSet26788Value = "EMP267".toCharArray();
  /**
   * Test condition "EMP267" for isEmpSet267()
   *
   * @return Returns true if isEmpSet267() is "EMP267"
   */
  public boolean isEmpSet267() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26788Value) == 0);
  }

  /** set values "EMP267" */
  public void setEmpSet267True() {
    setEmpPolicySets(empSet26788Value);
  }

  char[] empSet26888Value = "EMP268".toCharArray();
  /**
   * Test condition "EMP268" for isEmpSet268()
   *
   * @return Returns true if isEmpSet268() is "EMP268"
   */
  public boolean isEmpSet268() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26888Value) == 0);
  }

  /** set values "EMP268" */
  public void setEmpSet268True() {
    setEmpPolicySets(empSet26888Value);
  }

  char[] empSet26988Value = "EMP269".toCharArray();
  /**
   * Test condition "EMP269" for isEmpSet269()
   *
   * @return Returns true if isEmpSet269() is "EMP269"
   */
  public boolean isEmpSet269() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet26988Value) == 0);
  }

  /** set values "EMP269" */
  public void setEmpSet269True() {
    setEmpPolicySets(empSet26988Value);
  }

  char[] empSet27088Value = "EMP270".toCharArray();
  /**
   * Test condition "EMP270" for isEmpSet270()
   *
   * @return Returns true if isEmpSet270() is "EMP270"
   */
  public boolean isEmpSet270() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet27088Value) == 0);
  }

  /** set values "EMP270" */
  public void setEmpSet270True() {
    setEmpPolicySets(empSet27088Value);
  }

  char[] empSet29888Value = "EMP298".toCharArray();
  /**
   * Test condition "EMP298" for isEmpSet298()
   *
   * @return Returns true if isEmpSet298() is "EMP298"
   */
  public boolean isEmpSet298() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet29888Value) == 0);
  }

  /** set values "EMP298" */
  public void setEmpSet298True() {
    setEmpPolicySets(empSet29888Value);
  }

  char[] empSet29988Value = "EMP299".toCharArray();
  /**
   * Test condition "EMP299" for isEmpSet299()
   *
   * @return Returns true if isEmpSet299() is "EMP299"
   */
  public boolean isEmpSet299() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet29988Value) == 0);
  }

  /** set values "EMP299" */
  public void setEmpSet299True() {
    setEmpPolicySets(empSet29988Value);
  }

  char[] empSet30088Value = "EMP300".toCharArray();
  /**
   * Test condition "EMP300" for isEmpSet300()
   *
   * @return Returns true if isEmpSet300() is "EMP300"
   */
  public boolean isEmpSet300() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30088Value) == 0);
  }

  /** set values "EMP300" */
  public void setEmpSet300True() {
    setEmpPolicySets(empSet30088Value);
  }

  char[] empSet30188Value = "EMP301".toCharArray();
  /**
   * Test condition "EMP301" for isEmpSet301()
   *
   * @return Returns true if isEmpSet301() is "EMP301"
   */
  public boolean isEmpSet301() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30188Value) == 0);
  }

  /** set values "EMP301" */
  public void setEmpSet301True() {
    setEmpPolicySets(empSet30188Value);
  }

  char[] empSet30288Value = "EMP302".toCharArray();
  /**
   * Test condition "EMP302" for isEmpSet302()
   *
   * @return Returns true if isEmpSet302() is "EMP302"
   */
  public boolean isEmpSet302() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30288Value) == 0);
  }

  /** set values "EMP302" */
  public void setEmpSet302True() {
    setEmpPolicySets(empSet30288Value);
  }

  char[] empSet30388Value = "EMP303".toCharArray();
  /**
   * Test condition "EMP303" for isEmpSet303()
   *
   * @return Returns true if isEmpSet303() is "EMP303"
   */
  public boolean isEmpSet303() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30388Value) == 0);
  }

  /** set values "EMP303" */
  public void setEmpSet303True() {
    setEmpPolicySets(empSet30388Value);
  }

  char[] empSet30488Value = "EMP304".toCharArray();
  /**
   * Test condition "EMP304" for isEmpSet304()
   *
   * @return Returns true if isEmpSet304() is "EMP304"
   */
  public boolean isEmpSet304() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30488Value) == 0);
  }

  /** set values "EMP304" */
  public void setEmpSet304True() {
    setEmpPolicySets(empSet30488Value);
  }

  char[] empSet30588Value = "EMP305".toCharArray();
  /**
   * Test condition "EMP305" for isEmpSet305()
   *
   * @return Returns true if isEmpSet305() is "EMP305"
   */
  public boolean isEmpSet305() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30588Value) == 0);
  }

  /** set values "EMP305" */
  public void setEmpSet305True() {
    setEmpPolicySets(empSet30588Value);
  }

  char[] empSet30688Value = "EMP306".toCharArray();
  /**
   * Test condition "EMP306" for isEmpSet306()
   *
   * @return Returns true if isEmpSet306() is "EMP306"
   */
  public boolean isEmpSet306() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30688Value) == 0);
  }

  /** set values "EMP306" */
  public void setEmpSet306True() {
    setEmpPolicySets(empSet30688Value);
  }

  char[] empSet30788Value = "EMP307".toCharArray();
  /**
   * Test condition "EMP307" for isEmpSet307()
   *
   * @return Returns true if isEmpSet307() is "EMP307"
   */
  public boolean isEmpSet307() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30788Value) == 0);
  }

  /** set values "EMP307" */
  public void setEmpSet307True() {
    setEmpPolicySets(empSet30788Value);
  }

  char[] empSet30888Value = "EMP308".toCharArray();
  /**
   * Test condition "EMP308" for isEmpSet308()
   *
   * @return Returns true if isEmpSet308() is "EMP308"
   */
  public boolean isEmpSet308() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30888Value) == 0);
  }

  /** set values "EMP308" */
  public void setEmpSet308True() {
    setEmpPolicySets(empSet30888Value);
  }

  char[] empSet30988Value = "EMP309".toCharArray();
  /**
   * Test condition "EMP309" for isEmpSet309()
   *
   * @return Returns true if isEmpSet309() is "EMP309"
   */
  public boolean isEmpSet309() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet30988Value) == 0);
  }

  /** set values "EMP309" */
  public void setEmpSet309True() {
    setEmpPolicySets(empSet30988Value);
  }

  char[] empSet31088Value = "EMP310".toCharArray();
  /**
   * Test condition "EMP310" for isEmpSet310()
   *
   * @return Returns true if isEmpSet310() is "EMP310"
   */
  public boolean isEmpSet310() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet31088Value) == 0);
  }

  /** set values "EMP310" */
  public void setEmpSet310True() {
    setEmpPolicySets(empSet31088Value);
  }

  char[] empSet31188Value = "EMP311".toCharArray();
  /**
   * Test condition "EMP311" for isEmpSet311()
   *
   * @return Returns true if isEmpSet311() is "EMP311"
   */
  public boolean isEmpSet311() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet31188Value) == 0);
  }

  /** set values "EMP311" */
  public void setEmpSet311True() {
    setEmpPolicySets(empSet31188Value);
  }

  char[] empSet31288Value = "EMP312".toCharArray();
  /**
   * Test condition "EMP312" for isEmpSet312()
   *
   * @return Returns true if isEmpSet312() is "EMP312"
   */
  public boolean isEmpSet312() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet31288Value) == 0);
  }

  /** set values "EMP312" */
  public void setEmpSet312True() {
    setEmpPolicySets(empSet31288Value);
  }

  char[] empSet32888Value = "EMP328".toCharArray();
  /**
   * Test condition "EMP328" for isEmpSet328()
   *
   * @return Returns true if isEmpSet328() is "EMP328"
   */
  public boolean isEmpSet328() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet32888Value) == 0);
  }

  /** set values "EMP328" */
  public void setEmpSet328True() {
    setEmpPolicySets(empSet32888Value);
  }

  char[] empSet32988Value = "EMP329".toCharArray();
  /**
   * Test condition "EMP329" for isEmpSet329()
   *
   * @return Returns true if isEmpSet329() is "EMP329"
   */
  public boolean isEmpSet329() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet32988Value) == 0);
  }

  /** set values "EMP329" */
  public void setEmpSet329True() {
    setEmpPolicySets(empSet32988Value);
  }

  char[] empSet33088Value = "EMP330".toCharArray();
  /**
   * Test condition "EMP330" for isEmpSet330()
   *
   * @return Returns true if isEmpSet330() is "EMP330"
   */
  public boolean isEmpSet330() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet33088Value) == 0);
  }

  /** set values "EMP330" */
  public void setEmpSet330True() {
    setEmpPolicySets(empSet33088Value);
  }

  char[] empSet33188Value = "EMP331".toCharArray();
  /**
   * Test condition "EMP331" for isEmpSet331()
   *
   * @return Returns true if isEmpSet331() is "EMP331"
   */
  public boolean isEmpSet331() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet33188Value) == 0);
  }

  /** set values "EMP331" */
  public void setEmpSet331True() {
    setEmpPolicySets(empSet33188Value);
  }

  char[] empSet33888Value = "EMP338".toCharArray();
  /**
   * Test condition "EMP338" for isEmpSet338()
   *
   * @return Returns true if isEmpSet338() is "EMP338"
   */
  public boolean isEmpSet338() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet33888Value) == 0);
  }

  /** set values "EMP338" */
  public void setEmpSet338True() {
    setEmpPolicySets(empSet33888Value);
  }

  char[] empSet33988Value = "EMP339".toCharArray();
  /**
   * Test condition "EMP339" for isEmpSet339()
   *
   * @return Returns true if isEmpSet339() is "EMP339"
   */
  public boolean isEmpSet339() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet33988Value) == 0);
  }

  /** set values "EMP339" */
  public void setEmpSet339True() {
    setEmpPolicySets(empSet33988Value);
  }

  char[] empSet34088Value = "EMP340".toCharArray();
  /**
   * Test condition "EMP340" for isEmpSet340()
   *
   * @return Returns true if isEmpSet340() is "EMP340"
   */
  public boolean isEmpSet340() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34088Value) == 0);
  }

  /** set values "EMP340" */
  public void setEmpSet340True() {
    setEmpPolicySets(empSet34088Value);
  }

  char[] empSet34188Value = "EMP341".toCharArray();
  /**
   * Test condition "EMP341" for isEmpSet341()
   *
   * @return Returns true if isEmpSet341() is "EMP341"
   */
  public boolean isEmpSet341() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34188Value) == 0);
  }

  /** set values "EMP341" */
  public void setEmpSet341True() {
    setEmpPolicySets(empSet34188Value);
  }

  char[] empSet34288Value = "EMP342".toCharArray();
  /**
   * Test condition "EMP342" for isEmpSet342()
   *
   * @return Returns true if isEmpSet342() is "EMP342"
   */
  public boolean isEmpSet342() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34288Value) == 0);
  }

  /** set values "EMP342" */
  public void setEmpSet342True() {
    setEmpPolicySets(empSet34288Value);
  }

  char[] empSet34388Value = "EMP343".toCharArray();
  /**
   * Test condition "EMP343" for isEmpSet343()
   *
   * @return Returns true if isEmpSet343() is "EMP343"
   */
  public boolean isEmpSet343() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34388Value) == 0);
  }

  /** set values "EMP343" */
  public void setEmpSet343True() {
    setEmpPolicySets(empSet34388Value);
  }

  char[] empSet34488Value = "EMP344".toCharArray();
  /**
   * Test condition "EMP344" for isEmpSet344()
   *
   * @return Returns true if isEmpSet344() is "EMP344"
   */
  public boolean isEmpSet344() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34488Value) == 0);
  }

  /** set values "EMP344" */
  public void setEmpSet344True() {
    setEmpPolicySets(empSet34488Value);
  }

  char[] empSet34588Value = "EMP345".toCharArray();
  /**
   * Test condition "EMP345" for isEmpSet345()
   *
   * @return Returns true if isEmpSet345() is "EMP345"
   */
  public boolean isEmpSet345() throws CFException {
    return (compareChars(getEmpPolicySets(), empSet34588Value) == 0);
  }

  /** set values "EMP345" */
  public void setEmpSet345True() {
    setEmpPolicySets(empSet34588Value);
  }
  /**
   * Returns the value of posCnt
   *
   * @return posCnt
   */
  public int getPosCnt() throws CFException {
    if (isPosCntModified()) {
      posCnt = refreshPosCnt();
    }
    return posCnt;
  }

  /**
   * Update PosCnt with the passed value Corresponding COBOL Variable is WS-POS-CNT
   *
   * @param number
   */
  public void setPosCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    posCnt = checkPosCntMaxLimit(number);
    serializePosCnt(posCnt);
  }

  public void setPosCnt(long number) {
    number = checkPosCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosCnt((int) number);
  }

  /**
   * Update PosCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosCnt(char[] value) throws CFException {
    posCnt = serializePosCnt(value);
  }
  /**
   * Update PosCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosCntString(char[] value) throws CFException {
    setPosCnt(value);
  }
  /**
   * Returns the value of hipaaCount
   *
   * @return hipaaCount
   */
  public int getHipaaCount() throws CFException {
    if (isHipaaCountModified()) {
      hipaaCount = refreshHipaaCount();
    }
    return hipaaCount;
  }

  /**
   * Update HipaaCount with the passed value Corresponding COBOL Variable is WS-HIPAA-COUNT
   *
   * @param number
   */
  public void setHipaaCount(int number) {
    // Truncate if the number is beyond +/- Max range
    hipaaCount = checkHipaaCountMaxLimit(number);
    serializeHipaaCount(hipaaCount);
  }

  public void setHipaaCount(long number) {
    number = checkHipaaCountMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHipaaCount((int) number);
  }

  /**
   * Update HipaaCount with the passed value
   *
   * @param value (String or char[])
   */
  public void setHipaaCount(char[] value) throws CFException {
    hipaaCount = serializeHipaaCount(value);
  }
  /**
   * Update HipaaCount with the passed value
   *
   * @param value (String or char[])
   */
  public void setHipaaCountString(char[] value) throws CFException {
    setHipaaCount(value);
  }
  /**
   * Returns the value of cicsDfhrespCode
   *
   * @return cicsDfhrespCode
   */
  public int getCicsDfhrespCode() throws CFException {
    return cicsDfhrespCode;
  }

  /**
   * Update CicsDfhrespCode with the passed value Corresponding COBOL Variable is CICS-DFHRESP-CODE
   *
   * @param number
   */
  public void setCicsDfhrespCode(int number) {
    // Truncate if the number is beyond +/- Max range
    cicsDfhrespCode = checkCicsDfhrespCodeMaxLimit(number);
  }

  public void setCicsDfhrespCode(long number) {
    number = checkCicsDfhrespCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCicsDfhrespCode((int) number);
  }

  /**
   * Test condition 0 for isCicsNormal()
   *
   * @return Returns true if isCicsNormal() is 0
   */
  public boolean isCicsNormal() throws CFException {
    return (getCicsDfhrespCode() == 0);
  }

  /** set values 0 */
  public void setCicsNormalTrue() {
    setCicsDfhrespCode(0);
  }

  /**
   * Test condition 1 for isCicsError()
   *
   * @return Returns true if isCicsError() is 1
   */
  public boolean isCicsError() throws CFException {
    return (getCicsDfhrespCode() == 1);
  }

  /** set values 1 */
  public void setCicsErrorTrue() {
    setCicsDfhrespCode(1);
  }

  /**
   * Test condition 2 for isCicsRdatt()
   *
   * @return Returns true if isCicsRdatt() is 2
   */
  public boolean isCicsRdatt() throws CFException {
    return (getCicsDfhrespCode() == 2);
  }

  /** set values 2 */
  public void setCicsRdattTrue() {
    setCicsDfhrespCode(2);
  }

  /**
   * Test condition 3 for isCicsWrbrk()
   *
   * @return Returns true if isCicsWrbrk() is 3
   */
  public boolean isCicsWrbrk() throws CFException {
    return (getCicsDfhrespCode() == 3);
  }

  /** set values 3 */
  public void setCicsWrbrkTrue() {
    setCicsDfhrespCode(3);
  }

  /**
   * Test condition 4 for isCicsEof()
   *
   * @return Returns true if isCicsEof() is 4
   */
  public boolean isCicsEof() throws CFException {
    return (getCicsDfhrespCode() == 4);
  }

  /** set values 4 */
  public void setCicsEofTrue() {
    setCicsDfhrespCode(4);
  }

  /**
   * Test condition 5 for isCicsEods()
   *
   * @return Returns true if isCicsEods() is 5
   */
  public boolean isCicsEods() throws CFException {
    return (getCicsDfhrespCode() == 5);
  }

  /** set values 5 */
  public void setCicsEodsTrue() {
    setCicsDfhrespCode(5);
  }

  /**
   * Test condition 6 for isCicsEoc()
   *
   * @return Returns true if isCicsEoc() is 6
   */
  public boolean isCicsEoc() throws CFException {
    return (getCicsDfhrespCode() == 6);
  }

  /** set values 6 */
  public void setCicsEocTrue() {
    setCicsDfhrespCode(6);
  }

  /**
   * Test condition 7 for isCicsInbfmh()
   *
   * @return Returns true if isCicsInbfmh() is 7
   */
  public boolean isCicsInbfmh() throws CFException {
    return (getCicsDfhrespCode() == 7);
  }

  /** set values 7 */
  public void setCicsInbfmhTrue() {
    setCicsDfhrespCode(7);
  }

  /**
   * Test condition 8 for isCicsEndinpt()
   *
   * @return Returns true if isCicsEndinpt() is 8
   */
  public boolean isCicsEndinpt() throws CFException {
    return (getCicsDfhrespCode() == 8);
  }

  /** set values 8 */
  public void setCicsEndinptTrue() {
    setCicsDfhrespCode(8);
  }

  /**
   * Test condition 9 for isCicsNonval()
   *
   * @return Returns true if isCicsNonval() is 9
   */
  public boolean isCicsNonval() throws CFException {
    return (getCicsDfhrespCode() == 9);
  }

  /** set values 9 */
  public void setCicsNonvalTrue() {
    setCicsDfhrespCode(9);
  }

  /**
   * Test condition 10 for isCicsNostart()
   *
   * @return Returns true if isCicsNostart() is 10
   */
  public boolean isCicsNostart() throws CFException {
    return (getCicsDfhrespCode() == 10);
  }

  /** set values 10 */
  public void setCicsNostartTrue() {
    setCicsDfhrespCode(10);
  }

  /**
   * Test condition 11 for isCicsTermiderr()
   *
   * @return Returns true if isCicsTermiderr() is 11
   */
  public boolean isCicsTermiderr() throws CFException {
    return (getCicsDfhrespCode() == 11);
  }

  /** set values 11 */
  public void setCicsTermiderrTrue() {
    setCicsDfhrespCode(11);
  }

  /**
   * Test condition 12 for isCicsDsiderr()
   *
   * @return Returns true if isCicsDsiderr() is 12
   */
  public boolean isCicsDsiderr() throws CFException {
    return (getCicsDfhrespCode() == 12);
  }

  /** set values 12 */
  public void setCicsDsiderrTrue() {
    setCicsDfhrespCode(12);
  }

  /**
   * Test condition 13 for isCicsNotfnd()
   *
   * @return Returns true if isCicsNotfnd() is 13
   */
  public boolean isCicsNotfnd() throws CFException {
    return (getCicsDfhrespCode() == 13);
  }

  /** set values 13 */
  public void setCicsNotfndTrue() {
    setCicsDfhrespCode(13);
  }

  /**
   * Test condition 14 for isCicsDuprec()
   *
   * @return Returns true if isCicsDuprec() is 14
   */
  public boolean isCicsDuprec() throws CFException {
    return (getCicsDfhrespCode() == 14);
  }

  /** set values 14 */
  public void setCicsDuprecTrue() {
    setCicsDfhrespCode(14);
  }

  /**
   * Test condition 15 for isCicsDupkey()
   *
   * @return Returns true if isCicsDupkey() is 15
   */
  public boolean isCicsDupkey() throws CFException {
    return (getCicsDfhrespCode() == 15);
  }

  /** set values 15 */
  public void setCicsDupkeyTrue() {
    setCicsDfhrespCode(15);
  }

  /**
   * Test condition 16 for isCicsInvreq()
   *
   * @return Returns true if isCicsInvreq() is 16
   */
  public boolean isCicsInvreq() throws CFException {
    return (getCicsDfhrespCode() == 16);
  }

  /** set values 16 */
  public void setCicsInvreqTrue() {
    setCicsDfhrespCode(16);
  }

  /**
   * Test condition 17 for isCicsIoerr()
   *
   * @return Returns true if isCicsIoerr() is 17
   */
  public boolean isCicsIoerr() throws CFException {
    return (getCicsDfhrespCode() == 17);
  }

  /** set values 17 */
  public void setCicsIoerrTrue() {
    setCicsDfhrespCode(17);
  }

  /**
   * Test condition 18 for isCicsNospace()
   *
   * @return Returns true if isCicsNospace() is 18
   */
  public boolean isCicsNospace() throws CFException {
    return (getCicsDfhrespCode() == 18);
  }

  /** set values 18 */
  public void setCicsNospaceTrue() {
    setCicsDfhrespCode(18);
  }

  /**
   * Test condition 19 for isCicsNotopen()
   *
   * @return Returns true if isCicsNotopen() is 19
   */
  public boolean isCicsNotopen() throws CFException {
    return (getCicsDfhrespCode() == 19);
  }

  /** set values 19 */
  public void setCicsNotopenTrue() {
    setCicsDfhrespCode(19);
  }

  /**
   * Test condition 20 for isCicsEndfile()
   *
   * @return Returns true if isCicsEndfile() is 20
   */
  public boolean isCicsEndfile() throws CFException {
    return (getCicsDfhrespCode() == 20);
  }

  /** set values 20 */
  public void setCicsEndfileTrue() {
    setCicsDfhrespCode(20);
  }

  /**
   * Test condition 21 for isCicsIllogic()
   *
   * @return Returns true if isCicsIllogic() is 21
   */
  public boolean isCicsIllogic() throws CFException {
    return (getCicsDfhrespCode() == 21);
  }

  /** set values 21 */
  public void setCicsIllogicTrue() {
    setCicsDfhrespCode(21);
  }

  /**
   * Test condition 22 for isCicsLengerr()
   *
   * @return Returns true if isCicsLengerr() is 22
   */
  public boolean isCicsLengerr() throws CFException {
    return (getCicsDfhrespCode() == 22);
  }

  /** set values 22 */
  public void setCicsLengerrTrue() {
    setCicsDfhrespCode(22);
  }

  /**
   * Test condition 23 for isCicsQzero()
   *
   * @return Returns true if isCicsQzero() is 23
   */
  public boolean isCicsQzero() throws CFException {
    return (getCicsDfhrespCode() == 23);
  }

  /** set values 23 */
  public void setCicsQzeroTrue() {
    setCicsDfhrespCode(23);
  }

  /**
   * Test condition 24 for isCicsSignal()
   *
   * @return Returns true if isCicsSignal() is 24
   */
  public boolean isCicsSignal() throws CFException {
    return (getCicsDfhrespCode() == 24);
  }

  /** set values 24 */
  public void setCicsSignalTrue() {
    setCicsDfhrespCode(24);
  }

  /**
   * Test condition 25 for isCicsQbusy()
   *
   * @return Returns true if isCicsQbusy() is 25
   */
  public boolean isCicsQbusy() throws CFException {
    return (getCicsDfhrespCode() == 25);
  }

  /** set values 25 */
  public void setCicsQbusyTrue() {
    setCicsDfhrespCode(25);
  }

  /**
   * Test condition 26 for isCicsItemerr()
   *
   * @return Returns true if isCicsItemerr() is 26
   */
  public boolean isCicsItemerr() throws CFException {
    return (getCicsDfhrespCode() == 26);
  }

  /** set values 26 */
  public void setCicsItemerrTrue() {
    setCicsDfhrespCode(26);
  }

  /**
   * Test condition 27 for isCicsPgmiderr()
   *
   * @return Returns true if isCicsPgmiderr() is 27
   */
  public boolean isCicsPgmiderr() throws CFException {
    return (getCicsDfhrespCode() == 27);
  }

  /** set values 27 */
  public void setCicsPgmiderrTrue() {
    setCicsDfhrespCode(27);
  }

  /**
   * Test condition 28 for isCicsTransiderr()
   *
   * @return Returns true if isCicsTransiderr() is 28
   */
  public boolean isCicsTransiderr() throws CFException {
    return (getCicsDfhrespCode() == 28);
  }

  /** set values 28 */
  public void setCicsTransiderrTrue() {
    setCicsDfhrespCode(28);
  }

  /**
   * Test condition 29 for isCicsEnddata()
   *
   * @return Returns true if isCicsEnddata() is 29
   */
  public boolean isCicsEnddata() throws CFException {
    return (getCicsDfhrespCode() == 29);
  }

  /** set values 29 */
  public void setCicsEnddataTrue() {
    setCicsDfhrespCode(29);
  }

  /**
   * Test condition 30 for isCicsInvtsreq()
   *
   * @return Returns true if isCicsInvtsreq() is 30
   */
  public boolean isCicsInvtsreq() throws CFException {
    return (getCicsDfhrespCode() == 30);
  }

  /** set values 30 */
  public void setCicsInvtsreqTrue() {
    setCicsDfhrespCode(30);
  }

  /**
   * Test condition 31 for isCicsExpired()
   *
   * @return Returns true if isCicsExpired() is 31
   */
  public boolean isCicsExpired() throws CFException {
    return (getCicsDfhrespCode() == 31);
  }

  /** set values 31 */
  public void setCicsExpiredTrue() {
    setCicsDfhrespCode(31);
  }

  /**
   * Test condition 32 for isCicsRetpage()
   *
   * @return Returns true if isCicsRetpage() is 32
   */
  public boolean isCicsRetpage() throws CFException {
    return (getCicsDfhrespCode() == 32);
  }

  /** set values 32 */
  public void setCicsRetpageTrue() {
    setCicsDfhrespCode(32);
  }

  /**
   * Test condition 33 for isCicsRtefail()
   *
   * @return Returns true if isCicsRtefail() is 33
   */
  public boolean isCicsRtefail() throws CFException {
    return (getCicsDfhrespCode() == 33);
  }

  /** set values 33 */
  public void setCicsRtefailTrue() {
    setCicsDfhrespCode(33);
  }

  /**
   * Test condition 34 for isCicsRtesome()
   *
   * @return Returns true if isCicsRtesome() is 34
   */
  public boolean isCicsRtesome() throws CFException {
    return (getCicsDfhrespCode() == 34);
  }

  /** set values 34 */
  public void setCicsRtesomeTrue() {
    setCicsDfhrespCode(34);
  }

  /**
   * Test condition 35 for isCicsTsioerr()
   *
   * @return Returns true if isCicsTsioerr() is 35
   */
  public boolean isCicsTsioerr() throws CFException {
    return (getCicsDfhrespCode() == 35);
  }

  /** set values 35 */
  public void setCicsTsioerrTrue() {
    setCicsDfhrespCode(35);
  }

  /**
   * Test condition 36 for isCicsMapfail()
   *
   * @return Returns true if isCicsMapfail() is 36
   */
  public boolean isCicsMapfail() throws CFException {
    return (getCicsDfhrespCode() == 36);
  }

  /** set values 36 */
  public void setCicsMapfailTrue() {
    setCicsDfhrespCode(36);
  }

  /**
   * Test condition 37 for isCicsInverrterm()
   *
   * @return Returns true if isCicsInverrterm() is 37
   */
  public boolean isCicsInverrterm() throws CFException {
    return (getCicsDfhrespCode() == 37);
  }

  /** set values 37 */
  public void setCicsInverrtermTrue() {
    setCicsDfhrespCode(37);
  }

  /**
   * Test condition 38 for isCicsInvmpsz()
   *
   * @return Returns true if isCicsInvmpsz() is 38
   */
  public boolean isCicsInvmpsz() throws CFException {
    return (getCicsDfhrespCode() == 38);
  }

  /** set values 38 */
  public void setCicsInvmpszTrue() {
    setCicsDfhrespCode(38);
  }

  /**
   * Test condition 39 for isCicsIgreqid()
   *
   * @return Returns true if isCicsIgreqid() is 39
   */
  public boolean isCicsIgreqid() throws CFException {
    return (getCicsDfhrespCode() == 39);
  }

  /** set values 39 */
  public void setCicsIgreqidTrue() {
    setCicsDfhrespCode(39);
  }

  /**
   * Test condition 40 for isCicsOverflow()
   *
   * @return Returns true if isCicsOverflow() is 40
   */
  public boolean isCicsOverflow() throws CFException {
    return (getCicsDfhrespCode() == 40);
  }

  /** set values 40 */
  public void setCicsOverflowTrue() {
    setCicsDfhrespCode(40);
  }

  /**
   * Test condition 41 for isCicsInvldc()
   *
   * @return Returns true if isCicsInvldc() is 41
   */
  public boolean isCicsInvldc() throws CFException {
    return (getCicsDfhrespCode() == 41);
  }

  /** set values 41 */
  public void setCicsInvldcTrue() {
    setCicsDfhrespCode(41);
  }

  /**
   * Test condition 42 for isCicsNostg()
   *
   * @return Returns true if isCicsNostg() is 42
   */
  public boolean isCicsNostg() throws CFException {
    return (getCicsDfhrespCode() == 42);
  }

  /** set values 42 */
  public void setCicsNostgTrue() {
    setCicsDfhrespCode(42);
  }

  /**
   * Test condition 43 for isCicsJiderr()
   *
   * @return Returns true if isCicsJiderr() is 43
   */
  public boolean isCicsJiderr() throws CFException {
    return (getCicsDfhrespCode() == 43);
  }

  /** set values 43 */
  public void setCicsJiderrTrue() {
    setCicsDfhrespCode(43);
  }

  /**
   * Test condition 44 for isCicsQiderr()
   *
   * @return Returns true if isCicsQiderr() is 44
   */
  public boolean isCicsQiderr() throws CFException {
    return (getCicsDfhrespCode() == 44);
  }

  /** set values 44 */
  public void setCicsQiderrTrue() {
    setCicsDfhrespCode(44);
  }

  /**
   * Test condition 45 for isCicsNojbufsp()
   *
   * @return Returns true if isCicsNojbufsp() is 45
   */
  public boolean isCicsNojbufsp() throws CFException {
    return (getCicsDfhrespCode() == 45);
  }

  /** set values 45 */
  public void setCicsNojbufspTrue() {
    setCicsDfhrespCode(45);
  }

  /**
   * Test condition 46 for isCicsDsstat()
   *
   * @return Returns true if isCicsDsstat() is 46
   */
  public boolean isCicsDsstat() throws CFException {
    return (getCicsDfhrespCode() == 46);
  }

  /** set values 46 */
  public void setCicsDsstatTrue() {
    setCicsDfhrespCode(46);
  }

  /**
   * Test condition 47 for isCicsSelnerr()
   *
   * @return Returns true if isCicsSelnerr() is 47
   */
  public boolean isCicsSelnerr() throws CFException {
    return (getCicsDfhrespCode() == 47);
  }

  /** set values 47 */
  public void setCicsSelnerrTrue() {
    setCicsDfhrespCode(47);
  }

  /**
   * Test condition 48 for isCicsFuncerr()
   *
   * @return Returns true if isCicsFuncerr() is 48
   */
  public boolean isCicsFuncerr() throws CFException {
    return (getCicsDfhrespCode() == 48);
  }

  /** set values 48 */
  public void setCicsFuncerrTrue() {
    setCicsDfhrespCode(48);
  }

  /**
   * Test condition 49 for isCicsUnexpin()
   *
   * @return Returns true if isCicsUnexpin() is 49
   */
  public boolean isCicsUnexpin() throws CFException {
    return (getCicsDfhrespCode() == 49);
  }

  /** set values 49 */
  public void setCicsUnexpinTrue() {
    setCicsDfhrespCode(49);
  }

  /**
   * Test condition 50 for isCicsNopassbkrd()
   *
   * @return Returns true if isCicsNopassbkrd() is 50
   */
  public boolean isCicsNopassbkrd() throws CFException {
    return (getCicsDfhrespCode() == 50);
  }

  /** set values 50 */
  public void setCicsNopassbkrdTrue() {
    setCicsDfhrespCode(50);
  }

  /**
   * Test condition 51 for isCicsNopassbkwr()
   *
   * @return Returns true if isCicsNopassbkwr() is 51
   */
  public boolean isCicsNopassbkwr() throws CFException {
    return (getCicsDfhrespCode() == 51);
  }

  /** set values 51 */
  public void setCicsNopassbkwrTrue() {
    setCicsDfhrespCode(51);
  }

  /**
   * Test condition 53 for isCicsSysiderr()
   *
   * @return Returns true if isCicsSysiderr() is 53
   */
  public boolean isCicsSysiderr() throws CFException {
    return (getCicsDfhrespCode() == 53);
  }

  /** set values 53 */
  public void setCicsSysiderrTrue() {
    setCicsDfhrespCode(53);
  }

  /**
   * Test condition 54 for isCicsIscinvreq()
   *
   * @return Returns true if isCicsIscinvreq() is 54
   */
  public boolean isCicsIscinvreq() throws CFException {
    return (getCicsDfhrespCode() == 54);
  }

  /** set values 54 */
  public void setCicsIscinvreqTrue() {
    setCicsDfhrespCode(54);
  }

  /**
   * Test condition 55 for isCicsEnqbusy()
   *
   * @return Returns true if isCicsEnqbusy() is 55
   */
  public boolean isCicsEnqbusy() throws CFException {
    return (getCicsDfhrespCode() == 55);
  }

  /** set values 55 */
  public void setCicsEnqbusyTrue() {
    setCicsDfhrespCode(55);
  }

  /**
   * Test condition 56 for isCicsEnvdeferr()
   *
   * @return Returns true if isCicsEnvdeferr() is 56
   */
  public boolean isCicsEnvdeferr() throws CFException {
    return (getCicsDfhrespCode() == 56);
  }

  /** set values 56 */
  public void setCicsEnvdeferrTrue() {
    setCicsDfhrespCode(56);
  }

  /**
   * Test condition 57 for isCicsIgreqcd()
   *
   * @return Returns true if isCicsIgreqcd() is 57
   */
  public boolean isCicsIgreqcd() throws CFException {
    return (getCicsDfhrespCode() == 57);
  }

  /** set values 57 */
  public void setCicsIgreqcdTrue() {
    setCicsDfhrespCode(57);
  }

  /**
   * Test condition 58 for isCicsSessionerr()
   *
   * @return Returns true if isCicsSessionerr() is 58
   */
  public boolean isCicsSessionerr() throws CFException {
    return (getCicsDfhrespCode() == 58);
  }

  /** set values 58 */
  public void setCicsSessionerrTrue() {
    setCicsDfhrespCode(58);
  }

  /**
   * Test condition 59 for isCicsSysbusy()
   *
   * @return Returns true if isCicsSysbusy() is 59
   */
  public boolean isCicsSysbusy() throws CFException {
    return (getCicsDfhrespCode() == 59);
  }

  /** set values 59 */
  public void setCicsSysbusyTrue() {
    setCicsDfhrespCode(59);
  }

  /**
   * Test condition 60 for isCicsSessbusy()
   *
   * @return Returns true if isCicsSessbusy() is 60
   */
  public boolean isCicsSessbusy() throws CFException {
    return (getCicsDfhrespCode() == 60);
  }

  /** set values 60 */
  public void setCicsSessbusyTrue() {
    setCicsDfhrespCode(60);
  }

  /**
   * Test condition 61 for isCicsNotalloc()
   *
   * @return Returns true if isCicsNotalloc() is 61
   */
  public boolean isCicsNotalloc() throws CFException {
    return (getCicsDfhrespCode() == 61);
  }

  /** set values 61 */
  public void setCicsNotallocTrue() {
    setCicsDfhrespCode(61);
  }

  /**
   * Test condition 62 for isCicsCbiderr()
   *
   * @return Returns true if isCicsCbiderr() is 62
   */
  public boolean isCicsCbiderr() throws CFException {
    return (getCicsDfhrespCode() == 62);
  }

  /** set values 62 */
  public void setCicsCbiderrTrue() {
    setCicsDfhrespCode(62);
  }

  /**
   * Test condition 64 for isCicsInvpartnset()
   *
   * @return Returns true if isCicsInvpartnset() is 64
   */
  public boolean isCicsInvpartnset() throws CFException {
    return (getCicsDfhrespCode() == 64);
  }

  /** set values 64 */
  public void setCicsInvpartnsetTrue() {
    setCicsDfhrespCode(64);
  }

  /**
   * Test condition 65 for isCicsInvpartn()
   *
   * @return Returns true if isCicsInvpartn() is 65
   */
  public boolean isCicsInvpartn() throws CFException {
    return (getCicsDfhrespCode() == 65);
  }

  /** set values 65 */
  public void setCicsInvpartnTrue() {
    setCicsDfhrespCode(65);
  }

  /**
   * Test condition 66 for isCicsPartnfail()
   *
   * @return Returns true if isCicsPartnfail() is 66
   */
  public boolean isCicsPartnfail() throws CFException {
    return (getCicsDfhrespCode() == 66);
  }

  /** set values 66 */
  public void setCicsPartnfailTrue() {
    setCicsDfhrespCode(66);
  }

  /**
   * Test condition 70 for isCicsNotauth()
   *
   * @return Returns true if isCicsNotauth() is 70
   */
  public boolean isCicsNotauth() throws CFException {
    return (getCicsDfhrespCode() == 70);
  }

  /** set values 70 */
  public void setCicsNotauthTrue() {
    setCicsDfhrespCode(70);
  }

  /**
   * Test condition 80 for isCicsNospool()
   *
   * @return Returns true if isCicsNospool() is 80
   */
  public boolean isCicsNospool() throws CFException {
    return (getCicsDfhrespCode() == 80);
  }

  /** set values 80 */
  public void setCicsNospoolTrue() {
    setCicsDfhrespCode(80);
  }

  /**
   * Test condition 81 for isCicsTermerr()
   *
   * @return Returns true if isCicsTermerr() is 81
   */
  public boolean isCicsTermerr() throws CFException {
    return (getCicsDfhrespCode() == 81);
  }

  /** set values 81 */
  public void setCicsTermerrTrue() {
    setCicsDfhrespCode(81);
  }

  /**
   * Test condition 82 for isCicsRolledback()
   *
   * @return Returns true if isCicsRolledback() is 82
   */
  public boolean isCicsRolledback() throws CFException {
    return (getCicsDfhrespCode() == 82);
  }

  /** set values 82 */
  public void setCicsRolledbackTrue() {
    setCicsDfhrespCode(82);
  }

  /**
   * Test condition 83 for isCicsEnd()
   *
   * @return Returns true if isCicsEnd() is 83
   */
  public boolean isCicsEnd() throws CFException {
    return (getCicsDfhrespCode() == 83);
  }

  /** set values 83 */
  public void setCicsEndTrue() {
    setCicsDfhrespCode(83);
  }

  /**
   * Test condition 84 for isCicsDisabled()
   *
   * @return Returns true if isCicsDisabled() is 84
   */
  public boolean isCicsDisabled() throws CFException {
    return (getCicsDfhrespCode() == 84);
  }

  /** set values 84 */
  public void setCicsDisabledTrue() {
    setCicsDfhrespCode(84);
  }

  /**
   * Test condition 85 for isCicsAllocerr()
   *
   * @return Returns true if isCicsAllocerr() is 85
   */
  public boolean isCicsAllocerr() throws CFException {
    return (getCicsDfhrespCode() == 85);
  }

  /** set values 85 */
  public void setCicsAllocerrTrue() {
    setCicsDfhrespCode(85);
  }

  /**
   * Test condition 86 for isCicsStrelerr()
   *
   * @return Returns true if isCicsStrelerr() is 86
   */
  public boolean isCicsStrelerr() throws CFException {
    return (getCicsDfhrespCode() == 86);
  }

  /** set values 86 */
  public void setCicsStrelerrTrue() {
    setCicsDfhrespCode(86);
  }

  /**
   * Test condition 87 for isCicsOpenerr()
   *
   * @return Returns true if isCicsOpenerr() is 87
   */
  public boolean isCicsOpenerr() throws CFException {
    return (getCicsDfhrespCode() == 87);
  }

  /** set values 87 */
  public void setCicsOpenerrTrue() {
    setCicsDfhrespCode(87);
  }

  /**
   * Test condition 88 for isCicsSpolbusy()
   *
   * @return Returns true if isCicsSpolbusy() is 88
   */
  public boolean isCicsSpolbusy() throws CFException {
    return (getCicsDfhrespCode() == 88);
  }

  /** set values 88 */
  public void setCicsSpolbusyTrue() {
    setCicsDfhrespCode(88);
  }

  /**
   * Test condition 89 for isCicsSpolerr()
   *
   * @return Returns true if isCicsSpolerr() is 89
   */
  public boolean isCicsSpolerr() throws CFException {
    return (getCicsDfhrespCode() == 89);
  }

  /** set values 89 */
  public void setCicsSpolerrTrue() {
    setCicsDfhrespCode(89);
  }
  /**
   * Returns the value of wvAdaFlength
   *
   * @return wvAdaFlength
   */
  public int getWvAdaFlength() throws CFException {
    return wvAdaFlength;
  }

  /**
   * Update WvAdaFlength with the passed value Corresponding COBOL Variable is WV-ADA-FLENGTH
   *
   * @param number
   */
  public void setWvAdaFlength(int number) {
    // Truncate if the number is beyond +/- Max range
    wvAdaFlength = checkWvAdaFlengthMaxLimit(number);
  }

  public void setWvAdaFlength(long number) {
    number = checkWvAdaFlengthMaxLimit(number); // Truncate if value is beyond +/- Max range
    setWvAdaFlength((int) number);
  }

  public short getEhbHpaSub() throws CFException {
    if (isEhbHpaSubModified()) {
      ehbHpaSub = refreshEhbHpaSub();
    }
    return ehbHpaSub;
  }

  /**
   * Update EhbHpaSub with the passed value Corresponding COBOL Variable is EHB-HPA-SUB
   *
   * @param number
   */
  public void setEhbHpaSub(short number) {
    ehbHpaSub = checkEhbHpaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeEhbHpaSub(ehbHpaSub);
  }

  public void setEhbHpaSub(int number) {
    number = checkEhbHpaSubMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbHpaSub((short) number);
  }

  public void setEhbHpaSub(long number) {
    number = checkEhbHpaSubMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbHpaSub((short) number);
  }

  public short getEhbBhiSub() throws CFException {
    if (isEhbBhiSubModified()) {
      ehbBhiSub = refreshEhbBhiSub();
    }
    return ehbBhiSub;
  }

  /**
   * Update EhbBhiSub with the passed value Corresponding COBOL Variable is EHB-BHI-SUB
   *
   * @param number
   */
  public void setEhbBhiSub(short number) {
    ehbBhiSub = checkEhbBhiSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeEhbBhiSub(ehbBhiSub);
  }

  public void setEhbBhiSub(int number) {
    number = checkEhbBhiSubMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbBhiSub((short) number);
  }

  public void setEhbBhiSub(long number) {
    number = checkEhbBhiSubMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbBhiSub((short) number);
  }

  public short getEhbBhiSub2() throws CFException {
    if (isEhbBhiSub2Modified()) {
      ehbBhiSub2 = refreshEhbBhiSub2();
    }
    return ehbBhiSub2;
  }

  /**
   * Update EhbBhiSub2 with the passed value Corresponding COBOL Variable is EHB-BHI-SUB2
   *
   * @param number
   */
  public void setEhbBhiSub2(short number) {
    ehbBhiSub2 = checkEhbBhiSub2MaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeEhbBhiSub2(ehbBhiSub2);
  }

  public void setEhbBhiSub2(int number) {
    number = checkEhbBhiSub2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbBhiSub2((short) number);
  }

  public void setEhbBhiSub2(long number) {
    number = checkEhbBhiSub2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEhbBhiSub2((short) number);
  }

  /**
   * Returns the value of ehbBhiAf91000Ind
   *
   * @return ehbBhiAf91000Ind
   */
  public char[] getEhbBhiAf91000Ind() throws CFException {
    return ehbBhiAf91000Ind;
  }

  /**
   * set variable ehbBhiAf91000Ind Corresponding COBOL Variable is EHB-BHI-AF-91000-IND
   *
   * @param value
   */
  public void setEhbBhiAf91000Ind(char[] value) {
    value = checkEhbBhiAf91000IndConstraints(value);
    arraycopy(value, 0, ehbBhiAf91000Ind, 0, value.length);
  }

  public void setEhbBhiAf91000Ind(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, ehbBhiAf91000Ind, 0, beginIndex + endIndex);
  }

  char[] ehbBhiAf91000No88Value = "N".toCharArray();
  /**
   * Test condition "N" for isEhbBhiAf91000No()
   *
   * @return Returns true if isEhbBhiAf91000No() is "N"
   */
  public boolean isEhbBhiAf91000No() throws CFException {
    return (compareChars(getEhbBhiAf91000Ind(), ehbBhiAf91000No88Value) == 0);
  }

  /** set values "N" */
  public void setEhbBhiAf91000NoTrue() {
    setEhbBhiAf91000Ind(ehbBhiAf91000No88Value);
  }

  char[] ehbBhiAf91000Yes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isEhbBhiAf91000Yes()
   *
   * @return Returns true if isEhbBhiAf91000Yes() is "Y"
   */
  public boolean isEhbBhiAf91000Yes() throws CFException {
    return (compareChars(getEhbBhiAf91000Ind(), ehbBhiAf91000Yes88Value) == 0);
  }

  /** set values "Y" */
  public void setEhbBhiAf91000YesTrue() {
    setEhbBhiAf91000Ind(ehbBhiAf91000Yes88Value);
  }
  /**
   * Returns the value of ehbBhiAf92507Ind
   *
   * @return ehbBhiAf92507Ind
   */
  public char[] getEhbBhiAf92507Ind() throws CFException {
    return ehbBhiAf92507Ind;
  }

  /**
   * set variable ehbBhiAf92507Ind Corresponding COBOL Variable is EHB-BHI-AF-92507-IND
   *
   * @param value
   */
  public void setEhbBhiAf92507Ind(char[] value) {
    value = checkEhbBhiAf92507IndConstraints(value);
    arraycopy(value, 0, ehbBhiAf92507Ind, 0, value.length);
  }

  public void setEhbBhiAf92507Ind(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, ehbBhiAf92507Ind, 0, beginIndex + endIndex);
  }

  char[] ehbBhiAf92507No88Value = "N".toCharArray();
  /**
   * Test condition "N" for isEhbBhiAf92507No()
   *
   * @return Returns true if isEhbBhiAf92507No() is "N"
   */
  public boolean isEhbBhiAf92507No() throws CFException {
    return (compareChars(getEhbBhiAf92507Ind(), ehbBhiAf92507No88Value) == 0);
  }

  /** set values "N" */
  public void setEhbBhiAf92507NoTrue() {
    setEhbBhiAf92507Ind(ehbBhiAf92507No88Value);
  }

  char[] ehbBhiAf92507Yes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isEhbBhiAf92507Yes()
   *
   * @return Returns true if isEhbBhiAf92507Yes() is "Y"
   */
  public boolean isEhbBhiAf92507Yes() throws CFException {
    return (compareChars(getEhbBhiAf92507Ind(), ehbBhiAf92507Yes88Value) == 0);
  }

  /** set values "Y" */
  public void setEhbBhiAf92507YesTrue() {
    setEhbBhiAf92507Ind(ehbBhiAf92507Yes88Value);
  }
  /**
   * Returns the value of ehbBhiAfBothInd
   *
   * @return ehbBhiAfBothInd
   */
  public char[] getEhbBhiAfBothInd() throws CFException {
    return ehbBhiAfBothInd;
  }

  /**
   * set variable ehbBhiAfBothInd Corresponding COBOL Variable is EHB-BHI-AF-BOTH-IND
   *
   * @param value
   */
  public void setEhbBhiAfBothInd(char[] value) {
    value = checkEhbBhiAfBothIndConstraints(value);
    arraycopy(value, 0, ehbBhiAfBothInd, 0, value.length);
  }

  public void setEhbBhiAfBothInd(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, ehbBhiAfBothInd, 0, beginIndex + endIndex);
  }

  char[] ehbBhiAfBothNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isEhbBhiAfBothNo()
   *
   * @return Returns true if isEhbBhiAfBothNo() is "N"
   */
  public boolean isEhbBhiAfBothNo() throws CFException {
    return (compareChars(getEhbBhiAfBothInd(), ehbBhiAfBothNo88Value) == 0);
  }

  /** set values "N" */
  public void setEhbBhiAfBothNoTrue() {
    setEhbBhiAfBothInd(ehbBhiAfBothNo88Value);
  }

  char[] ehbBhiAfBothYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isEhbBhiAfBothYes()
   *
   * @return Returns true if isEhbBhiAfBothYes() is "Y"
   */
  public boolean isEhbBhiAfBothYes() throws CFException {
    return (compareChars(getEhbBhiAfBothInd(), ehbBhiAfBothYes88Value) == 0);
  }

  /** set values "Y" */
  public void setEhbBhiAfBothYesTrue() {
    setEhbBhiAfBothInd(ehbBhiAfBothYes88Value);
  }

  public static int getWorkFieldLength() {
    return WORK_LENGTH;
  }
}
