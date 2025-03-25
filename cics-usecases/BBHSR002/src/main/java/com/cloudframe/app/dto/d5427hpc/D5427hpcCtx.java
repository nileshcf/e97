package com.cloudframe.app.dto.d5427hpc;

import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.exception.CFException;
import java.sql.ResultSet;

@Context
public class D5427hpcCtx implements ProgramContext, Cloneable {
  GlobalExecutorCtx globalCtx;

  Work work;
  Sqlca sqlca;
  HipaaCodeList hipaaCodeList;
  HvHipaaCodeList hvHipaaCodeList;
  DsmCallArea dsmCallArea;
  HipaaCodeListAddressGroup hipaaCodeListAddressGroup;
  HpcDataArea hpcDataArea;
  CacheCommArea cacheCommArea;
  DclhipaaProcCd dclhipaaProcCd;

  private int rc;

  public GlobalExecutorCtx getGlobalCtx() {
    return globalCtx;
  }

  public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
    this.globalCtx = globalCtx;
  }

  public int getRc() {
    return this.rc;
  }

  public void setRc(int rc) {
    this.rc = rc;
  }

  CICSSession cicsSession = new CICSSession();

  public CICSSession getCicsSession() {
    return this.cicsSession;
  }

  public void setCicsSession(CICSSession cicsSession) {
    this.cicsSession = cicsSession;
  }

  ResultSet hipaaGenericCsrResultSet;

  public ResultSet getHipaaGenericCsrResultSet() {
    return this.hipaaGenericCsrResultSet;
  }

  public void setHipaaGenericCsrResultSet(ResultSet hipaaGenericCsrResultSet) {
    this.hipaaGenericCsrResultSet = hipaaGenericCsrResultSet;
  }

  ResultSet hipaaGroupCsrResultSet;

  public ResultSet getHipaaGroupCsrResultSet() {
    return this.hipaaGroupCsrResultSet;
  }

  public void setHipaaGroupCsrResultSet(ResultSet hipaaGroupCsrResultSet) {
    this.hipaaGroupCsrResultSet = hipaaGroupCsrResultSet;
  }

  ResultSet hipaaListCsrResultSet;

  public ResultSet getHipaaListCsrResultSet() {
    return this.hipaaListCsrResultSet;
  }

  public void setHipaaListCsrResultSet(ResultSet hipaaListCsrResultSet) {
    this.hipaaListCsrResultSet = hipaaListCsrResultSet;
  }

  ResultSet hipaaAllCsrResultSet;

  public ResultSet getHipaaAllCsrResultSet() {
    return this.hipaaAllCsrResultSet;
  }

  public void setHipaaAllCsrResultSet(ResultSet hipaaAllCsrResultSet) {
    this.hipaaAllCsrResultSet = hipaaAllCsrResultSet;
  }

  boolean programEnded = false;

  public boolean isProgramEnded() {
    return this.programEnded;
  }

  public void setProgramEnded(boolean programEnded) {
    this.programEnded = programEnded;
  }

  public Work getWork() {
    if (work == null) {
      work = new Work();
    }

    return work;
  }

  public void setWork(Work work) {
    this.work = work;
  }

  public Sqlca getSqlca() {
    if (sqlca == null) {
      sqlca = new Sqlca();
    }

    return sqlca;
  }

  public void setSqlca(Sqlca sqlca) {
    this.sqlca = sqlca;
  }

  public HipaaCodeList getHipaaCodeList() {
    if (hipaaCodeList == null) {
      hipaaCodeList = new HipaaCodeList();
    }

    return hipaaCodeList;
  }

  public void setHipaaCodeList(HipaaCodeList hipaaCodeList) {
    this.hipaaCodeList = hipaaCodeList;
  }

  public HvHipaaCodeList getHvHipaaCodeList() {
    if (hvHipaaCodeList == null) {
      hvHipaaCodeList = new HvHipaaCodeList();
    }

    return hvHipaaCodeList;
  }

  public void setHvHipaaCodeList(HvHipaaCodeList hvHipaaCodeList) {
    this.hvHipaaCodeList = hvHipaaCodeList;
  }

  public DsmCallArea getDsmCallArea() {
    if (dsmCallArea == null) {
      dsmCallArea = new DsmCallArea();
    }

    return dsmCallArea;
  }

  public void setDsmCallArea(DsmCallArea dsmCallArea) {
    this.dsmCallArea = dsmCallArea;
  }

  public HipaaCodeListAddressGroup getHipaaCodeListAddressGroup() {
    if (hipaaCodeListAddressGroup == null) {
      hipaaCodeListAddressGroup = new HipaaCodeListAddressGroup();
    }

    return hipaaCodeListAddressGroup;
  }

  public void setHipaaCodeListAddressGroup(HipaaCodeListAddressGroup hipaaCodeListAddressGroup) {
    this.hipaaCodeListAddressGroup = hipaaCodeListAddressGroup;
  }

  public HpcDataArea getHpcDataArea() {
    if (hpcDataArea == null) {
      hpcDataArea = new HpcDataArea();
    }

    return hpcDataArea;
  }

  public void setHpcDataArea(HpcDataArea hpcDataArea) {
    this.hpcDataArea = hpcDataArea;
  }

  public CacheCommArea getCacheCommArea() {
    if (cacheCommArea == null) {
      cacheCommArea = new CacheCommArea();
    }

    return cacheCommArea;
  }

  public void setCacheCommArea(CacheCommArea cacheCommArea) {
    this.cacheCommArea = cacheCommArea;
  }

  public DclhipaaProcCd getDclhipaaProcCd() {
    if (dclhipaaProcCd == null) {
      dclhipaaProcCd = new DclhipaaProcCd();
    }

    return dclhipaaProcCd;
  }

  public void setDclhipaaProcCd(DclhipaaProcCd dclhipaaProcCd) {
    this.dclhipaaProcCd = dclhipaaProcCd;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    return this.hashCode() == o.hashCode();
  }

  @Override
  public int hashCode() {
    String str = "";
    str += work.hashCode();
    str += sqlca.hashCode();
    str += hipaaCodeList.hashCode();
    str += hvHipaaCodeList.hashCode();
    str += dsmCallArea.hashCode();
    str += hipaaCodeListAddressGroup.hashCode();
    str += hpcDataArea.hashCode();
    str += cacheCommArea.hashCode();
    str += dclhipaaProcCd.hashCode();
    return str.hashCode();
  }

  public D5427hpcCtx clone() {
    D5427hpcCtx cloneObj = new D5427hpcCtx();
    cloneObj.work = new Work();
    cloneObj.work.set(work.getClonedField());
    cloneObj.sqlca = new Sqlca();
    cloneObj.sqlca.set(sqlca.getClonedField());
    cloneObj.hipaaCodeList = new HipaaCodeList();
    cloneObj.hipaaCodeList.set(hipaaCodeList.getClonedField());
    cloneObj.hvHipaaCodeList = new HvHipaaCodeList();
    cloneObj.hvHipaaCodeList.set(hvHipaaCodeList.getClonedField());
    cloneObj.dsmCallArea = new DsmCallArea();
    cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
    cloneObj.hipaaCodeListAddressGroup = new HipaaCodeListAddressGroup();
    cloneObj.hipaaCodeListAddressGroup.set(hipaaCodeListAddressGroup.getClonedField());
    cloneObj.hpcDataArea = new HpcDataArea();
    cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
    cloneObj.cacheCommArea = new CacheCommArea();
    cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
    cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
    cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
    return cloneObj;
  }

  /** Program method contexts */
  public class ProcessInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HipaaCodeListAddressGroup hipaaCodeListAddressGroup =
        D5427hpcCtx.this.getHipaaCodeListAddressGroup();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += hipaaCodeListAddressGroup.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessInCtx clone() {
      ProcessInCtx cloneObj = new ProcessInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hipaaCodeListAddressGroup = new HipaaCodeListAddressGroup();
      cloneObj.hipaaCodeListAddressGroup.set(hipaaCodeListAddressGroup.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessInCtx getProcessInCtx() {
    return new ProcessInCtx();
  }

  public class MainLineInCtx implements Cloneable {
    HipaaCodeList hipaaCodeList = D5427hpcCtx.this.getHipaaCodeList();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HipaaCodeListAddressGroup hipaaCodeListAddressGroup =
        D5427hpcCtx.this.getHipaaCodeListAddressGroup();

    /**
     * Returns the value of hipaaCodeListAddress
     *
     * @return hipaaCodeListAddress
     */
    public int getHipaaCodeListAddress() throws CFException {
      return hipaaCodeListAddressGroup.getHipaaCodeListAddress();
    }

    /**
     * Update HipaaCodeListAddress with the passed value
     *
     * @param number
     */
    public void setHipaaCodeListAddress(int number) throws CFException {
      hipaaCodeListAddressGroup.setHipaaCodeListAddress(number);
    }

    public void setHipaaCodeListAddress(long number) throws CFException {
      hipaaCodeListAddressGroup.setHipaaCodeListAddress((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of hipaaCodeList
     *
     * @return hipaaCodeList
     */
    public HipaaCodeList getHipaaCodeList() {
      return hipaaCodeList;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public MainLineOutCtx getMainLineOutCtx() {
      return new MainLineOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += hipaaCodeList.hashCode();
      str += dsmCallArea.hashCode();
      str += hipaaCodeListAddressGroup.hashCode();
      return str.hashCode();
    }

    public MainLineInCtx clone() {
      MainLineInCtx cloneObj = new MainLineInCtx();
      cloneObj.hipaaCodeList = new HipaaCodeList();
      cloneObj.hipaaCodeList.set(hipaaCodeList.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hipaaCodeListAddressGroup = new HipaaCodeListAddressGroup();
      cloneObj.hipaaCodeListAddressGroup.set(hipaaCodeListAddressGroup.getClonedField());
      return cloneObj;
    }
  }

  public MainLineInCtx getMainLineInCtx() {
    return new MainLineInCtx();
  }

  public class MainLineOutCtx implements Cloneable {
    HipaaCodeList hipaaCodeList = D5427hpcCtx.this.getHipaaCodeList();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HipaaCodeListAddressGroup hipaaCodeListAddressGroup =
        D5427hpcCtx.this.getHipaaCodeListAddressGroup();

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of hipaaCodeList
     *
     * @return hipaaCodeList
     */
    public HipaaCodeList getHipaaCodeList() {
      return hipaaCodeList;
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += hipaaCodeList.hashCode();
      str += dsmCallArea.hashCode();
      str += hipaaCodeListAddressGroup.hashCode();
      return str.hashCode();
    }

    public MainLineOutCtx clone() {
      MainLineOutCtx cloneObj = new MainLineOutCtx();
      cloneObj.hipaaCodeList = new HipaaCodeList();
      cloneObj.hipaaCodeList.set(hipaaCodeList.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hipaaCodeListAddressGroup = new HipaaCodeListAddressGroup();
      cloneObj.hipaaCodeListAddressGroup.set(hipaaCodeListAddressGroup.getClonedField());
      return cloneObj;
    }
  }

  public MainLineOutCtx getMainLineOutCtx() {
    return new MainLineOutCtx();
  }

  public class InitializeOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "N" for isNotExplicitReq()
     *
     * @return Returns true if isNotExplicitReq() is "N"
     */
    public boolean isNotExplicitReq() throws CFException {
      return work.isNotExplicitReq();
    }

    /** set values "N" */
    public void setNotExplicitReqTrue() throws CFException {
      work.setNotExplicitReqTrue();
    }
    /**
     * Returns the value of dsmReturnCode
     *
     * @return dsmReturnCode
     */
    public int getDsmReturnCode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmReturnCode();
    }

    /**
     * Returns String value of dsmReturnCode
     *
     * @return dsmReturnCode
     */
    public char[] getDsmReturnCodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmReturnCodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmReturnCodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmReturnCodeIsNumeric();
    }

    /**
     * Update DsmReturnCode with the passed value
     *
     * @param number
     */
    public void setDsmReturnCode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmReturnCode(number);
    }

    public void setDsmReturnCode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmReturnCode(number);
    }

    /**
     * Update DsmReturnCode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmReturnCode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmReturnCode(value);
    }

    /**
     * Update DsmReturnCode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmReturnCodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmReturnCode(value);
    }

    /**
     * Returns the value of hpcRetArea
     *
     * @return hpcRetArea
     */
    public HpcRetArea getHpcRetArea() {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea();
    }

    /**
     * Update HpcRetArea with the passed value
     *
     * @param value
     */
    public void setHpcRetArea(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().setHpcRetArea(value);
    }

    /**
     * Update HpcRetArea with a String from an offset and length
     *
     * @param value
     */
    public void setHpcRetArea(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea.getHpcReqRetArea().setHpcRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetArea(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .setHpcRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetArea with another Field
     *
     * @param value
     */
    public void setHpcRetArea(Field source) {
      hpcDataArea.getHpcReqRetArea().setHpcRetArea(source);
    }

    /**
     * Update HpcRetArea with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetArea(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea.getHpcReqRetArea().setHpcRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetArea(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .setHpcRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmLogArea
     *
     * @return dsmLogArea
     */
    public DsmLogArea getDsmLogArea() {
      return dsmCallArea.getDsmLogArea();
    }

    /**
     * Update DsmLogArea with the passed value
     *
     * @param value
     */
    public void setDsmLogArea(char[] value) throws CFException {
      dsmCallArea.setDsmLogArea(value);
    }

    /**
     * Update DsmLogArea with a String from an offset and length
     *
     * @param value
     */
    public void setDsmLogArea(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea.setDsmLogArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmLogArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmLogArea(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea.setDsmLogArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmLogArea with another Field
     *
     * @param value
     */
    public void setDsmLogArea(Field source) {
      dsmCallArea.setDsmLogArea(source);
    }

    /**
     * Update DsmLogArea with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmLogArea(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.setDsmLogArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmLogArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmLogArea(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea.setDsmLogArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public InitializeOutCtx clone() {
      InitializeOutCtx cloneObj = new InitializeOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public InitializeOutCtx getInitializeOutCtx() {
    return new InitializeOutCtx();
  }

  public class RequestFieldValidationInCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public RequestFieldValidationOutCtx getRequestFieldValidationOutCtx() {
      return new RequestFieldValidationOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public RequestFieldValidationInCtx clone() {
      RequestFieldValidationInCtx cloneObj = new RequestFieldValidationInCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public RequestFieldValidationInCtx getRequestFieldValidationInCtx() {
    return new RequestFieldValidationInCtx();
  }

  public class RequestFieldValidationOutCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public RequestFieldValidationOutCtx clone() {
      RequestFieldValidationOutCtx cloneObj = new RequestFieldValidationOutCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public RequestFieldValidationOutCtx getRequestFieldValidationOutCtx() {
    return new RequestFieldValidationOutCtx();
  }

  public class ProcessGenericInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public ProcessGenericOutCtx getProcessGenericOutCtx() {
      return new ProcessGenericOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessGenericInCtx clone() {
      ProcessGenericInCtx cloneObj = new ProcessGenericInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessGenericInCtx getProcessGenericInCtx() {
    return new ProcessGenericInCtx();
  }

  public class ProcessGenericOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition "N" for isHpcRetNoMoreRows()
     *
     * @return Returns true if isHpcRetNoMoreRows() is "N"
     */
    public boolean isHpcRetNoMoreRows() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().isHpcRetNoMoreRows();
    }

    /** set values "N" */
    public void setHpcRetNoMoreRowsTrue() throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetNoMoreRowsTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessGenericOutCtx clone() {
      ProcessGenericOutCtx cloneObj = new ProcessGenericOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessGenericOutCtx getProcessGenericOutCtx() {
    return new ProcessGenericOutCtx();
  }

  public class OpenGenericCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public OpenGenericCursorOutCtx getOpenGenericCursorOutCtx() {
      return new OpenGenericCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenGenericCursorInCtx clone() {
      OpenGenericCursorInCtx cloneObj = new OpenGenericCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenGenericCursorInCtx getOpenGenericCursorInCtx() {
    return new OpenGenericCursorInCtx();
  }

  public class OpenGenericCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "B" for isCrtnGenericCsr()
     *
     * @return Returns true if isCrtnGenericCsr() is "B"
     */
    public boolean isCrtnGenericCsr() throws CFException {
      return cacheCommArea.getCrtnRequestData().isCrtnGenericCsr();
    }

    /** set values "B" */
    public void setCrtnGenericCsrTrue() throws CFException {
      cacheCommArea.getCrtnRequestData().setCrtnGenericCsrTrue();
    }
    /**
     * Test condition "N" for isHipaaFetchEndNo()
     *
     * @return Returns true if isHipaaFetchEndNo() is "N"
     */
    public boolean isHipaaFetchEndNo() throws CFException {
      return work.isHipaaFetchEndNo();
    }

    /** set values "N" */
    public void setHipaaFetchEndNoTrue() throws CFException {
      work.setHipaaFetchEndNoTrue();
    }
    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return cacheCommArea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Returns the value of crtnHipaaVerNbr
     *
     * @return crtnHipaaVerNbr
     */
    public char[] getCrtnHipaaVerNbr() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().getCrtnHipaaVerNbr();
    }

    /**
     * set variable crtnHipaaVerNbr
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(value);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex);
    }

    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source) {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(source);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaVerNbr
     *
     * @return hipaaVerNbr
     */
    public char[] getHipaaVerNbr() throws CFException {
      return dclhipaaProcCd.getHipaaVerNbr();
    }

    /**
     * set variable hipaaVerNbr
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(value);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex);
    }

    public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source) {
      dclhipaaProcCd.setHipaaVerNbr(source);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenGenericCursorOutCtx clone() {
      OpenGenericCursorOutCtx cloneObj = new OpenGenericCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenGenericCursorOutCtx getOpenGenericCursorOutCtx() {
    return new OpenGenericCursorOutCtx();
  }

  public class FetchGenericCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public FetchGenericCursorOutCtx getFetchGenericCursorOutCtx() {
      return new FetchGenericCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchGenericCursorInCtx clone() {
      FetchGenericCursorInCtx cloneObj = new FetchGenericCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchGenericCursorInCtx getFetchGenericCursorInCtx() {
    return new FetchGenericCursorInCtx();
  }

  public class FetchGenericCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return cacheCommArea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsFetchTrue();
    }
    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 100 for isDsmEntryNotFndInq()
     *
     * @return Returns true if isDsmEntryNotFndInq() is 100
     */
    public boolean isDsmEntryNotFndInq() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEntryNotFndInq();
    }

    /** set values 100 */
    public void setDsmEntryNotFndInqTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEntryNotFndInqTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of grnrcRqstCd
     *
     * @return grnrcRqstCd
     */
    public char[] getGrnrcRqstCd() throws CFException {
      return dclhipaaProcCd.getGrnrcRqstCd();
    }

    /**
     * set variable grnrcRqstCd
     *
     * @param value
     */
    public void setGrnrcRqstCd(char[] value) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(value);
    }

    /**
     * Update GrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex);
    }

    public void setGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update GrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update GrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setGrnrcRqstCd(Field source) {
      dclhipaaProcCd.setGrnrcRqstCd(source);
    }

    /**
     * Update GrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update GrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of hpcRetHipaaCd
     *
     * @return hpcRetHipaaCd
     */
    public char[] getHpcRetHipaaCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetHipaaCd();
    }

    /**
     * set variable hpcRetHipaaCd
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(value);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex);
    }

    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(source);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Returns the value of hpcRetGrnrcRqstCd
     *
     * @return hpcRetGrnrcRqstCd
     */
    public char[] getHpcRetGrnrcRqstCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetGrnrcRqstCd();
    }

    /**
     * set variable hpcRetGrnrcRqstCd
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, char[] value) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(value);
    }

    /**
     * Update HpcRetGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex);
    }

    public void setHpcRetGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, Field source) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchGenericCursorOutCtx clone() {
      FetchGenericCursorOutCtx cloneObj = new FetchGenericCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchGenericCursorOutCtx getFetchGenericCursorOutCtx() {
    return new FetchGenericCursorOutCtx();
  }

  public class CloseGenericCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public CloseGenericCursorOutCtx getCloseGenericCursorOutCtx() {
      return new CloseGenericCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseGenericCursorInCtx clone() {
      CloseGenericCursorInCtx cloneObj = new CloseGenericCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseGenericCursorInCtx getCloseGenericCursorInCtx() {
    return new CloseGenericCursorInCtx();
  }

  public class CloseGenericCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseGenericCursorOutCtx clone() {
      CloseGenericCursorOutCtx cloneObj = new CloseGenericCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseGenericCursorOutCtx getCloseGenericCursorOutCtx() {
    return new CloseGenericCursorOutCtx();
  }

  public class ProcessExplicitInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public ProcessExplicitOutCtx getProcessExplicitOutCtx() {
      return new ProcessExplicitOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessExplicitInCtx clone() {
      ProcessExplicitInCtx cloneObj = new ProcessExplicitInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessExplicitInCtx getProcessExplicitInCtx() {
    return new ProcessExplicitInCtx();
  }

  public class ProcessExplicitOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition "N" for isHipaaFetchEndNo()
     *
     * @return Returns true if isHipaaFetchEndNo() is "N"
     */
    public boolean isHipaaFetchEndNo() throws CFException {
      return work.isHipaaFetchEndNo();
    }

    /** set values "N" */
    public void setHipaaFetchEndNoTrue() throws CFException {
      work.setHipaaFetchEndNoTrue();
    }
    /**
     * Test condition "N" for isHpcRetNoMoreRows()
     *
     * @return Returns true if isHpcRetNoMoreRows() is "N"
     */
    public boolean isHpcRetNoMoreRows() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().isHpcRetNoMoreRows();
    }

    /** set values "N" */
    public void setHpcRetNoMoreRowsTrue() throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetNoMoreRowsTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessExplicitOutCtx clone() {
      ProcessExplicitOutCtx cloneObj = new ProcessExplicitOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessExplicitOutCtx getProcessExplicitOutCtx() {
    return new ProcessExplicitOutCtx();
  }

  public class OpenGroupCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public OpenGroupCursorOutCtx getOpenGroupCursorOutCtx() {
      return new OpenGroupCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenGroupCursorInCtx clone() {
      OpenGroupCursorInCtx cloneObj = new OpenGroupCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenGroupCursorInCtx getOpenGroupCursorInCtx() {
    return new OpenGroupCursorInCtx();
  }

  public class OpenGroupCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of crtnKeyCode
     *
     * @return crtnKeyCode
     */
    public char[] getCrtnKeyCode() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnKeyCode();
    }

    /**
     * set variable crtnKeyCode
     *
     * @param value
     */
    public void setCrtnKeyCode(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(value);
    }

    /**
     * Update CrtnKeyCode with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex);
    }

    public void setCrtnKeyCode(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnKeyCode with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .setCrtnKeyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnKeyCode with another Field
     *
     * @param value
     */
    public void setCrtnKeyCode(Field source) {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source);
    }

    /**
     * Update CrtnKeyCode with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnKeyCode with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .setCrtnKeyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return cacheCommArea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaVerNbr
     *
     * @return crtnHipaaVerNbr
     */
    public char[] getCrtnHipaaVerNbr() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().getCrtnHipaaVerNbr();
    }

    /**
     * set variable crtnHipaaVerNbr
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(value);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex);
    }

    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source) {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(source);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of hipaaGrpCd
     *
     * @return hipaaGrpCd
     */
    public char[] getHipaaGrpCd() throws CFException {
      return dclhipaaProcCd.getHipaaGrpCd();
    }

    /**
     * set variable hipaaGrpCd
     *
     * @param value
     */
    public void setHipaaGrpCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaGrpCd(value);
    }

    /**
     * Update HipaaGrpCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaGrpCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaGrpCd(source, sourceIndex);
    }

    public void setHipaaGrpCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaGrpCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaGrpCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaGrpCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaGrpCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaGrpCd with another Field
     *
     * @param value
     */
    public void setHipaaGrpCd(Field source) {
      dclhipaaProcCd.setHipaaGrpCd(source);
    }

    /**
     * Update HipaaGrpCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaGrpCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaGrpCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaGrpCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaGrpCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaGrpCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaVerNbr
     *
     * @return hipaaVerNbr
     */
    public char[] getHipaaVerNbr() throws CFException {
      return dclhipaaProcCd.getHipaaVerNbr();
    }

    /**
     * set variable hipaaVerNbr
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(value);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex);
    }

    public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source) {
      dclhipaaProcCd.setHipaaVerNbr(source);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "C" for isCrtnGroupCsr()
     *
     * @return Returns true if isCrtnGroupCsr() is "C"
     */
    public boolean isCrtnGroupCsr() throws CFException {
      return cacheCommArea.getCrtnRequestData().isCrtnGroupCsr();
    }

    /** set values "C" */
    public void setCrtnGroupCsrTrue() throws CFException {
      cacheCommArea.getCrtnRequestData().setCrtnGroupCsrTrue();
    }
    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenGroupCursorOutCtx clone() {
      OpenGroupCursorOutCtx cloneObj = new OpenGroupCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenGroupCursorOutCtx getOpenGroupCursorOutCtx() {
    return new OpenGroupCursorOutCtx();
  }

  public class FetchGroupCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public FetchGroupCursorOutCtx getFetchGroupCursorOutCtx() {
      return new FetchGroupCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchGroupCursorInCtx clone() {
      FetchGroupCursorInCtx cloneObj = new FetchGroupCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchGroupCursorInCtx getFetchGroupCursorInCtx() {
    return new FetchGroupCursorInCtx();
  }

  public class FetchGroupCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return cacheCommArea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsFetchTrue();
    }
    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of hpcRetHipaaCd
     *
     * @return hpcRetHipaaCd
     */
    public char[] getHpcRetHipaaCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetHipaaCd();
    }

    /**
     * set variable hpcRetHipaaCd
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(value);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex);
    }

    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(source);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isExplicitReq()
     *
     * @return Returns true if isExplicitReq() is "Y"
     */
    public boolean isExplicitReq() throws CFException {
      return work.isExplicitReq();
    }

    /** set values "Y" */
    public void setExplicitReqTrue() throws CFException {
      work.setExplicitReqTrue();
    }
    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchGroupCursorOutCtx clone() {
      FetchGroupCursorOutCtx cloneObj = new FetchGroupCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchGroupCursorOutCtx getFetchGroupCursorOutCtx() {
    return new FetchGroupCursorOutCtx();
  }

  public class CloseGroupCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public CloseGroupCursorOutCtx getCloseGroupCursorOutCtx() {
      return new CloseGroupCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseGroupCursorInCtx clone() {
      CloseGroupCursorInCtx cloneObj = new CloseGroupCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseGroupCursorInCtx getCloseGroupCursorInCtx() {
    return new CloseGroupCursorInCtx();
  }

  public class CloseGroupCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseGroupCursorOutCtx clone() {
      CloseGroupCursorOutCtx cloneObj = new CloseGroupCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseGroupCursorOutCtx getCloseGroupCursorOutCtx() {
    return new CloseGroupCursorOutCtx();
  }

  public class ExplicitDataInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Test condition "Y" for isExplicitReq()
     *
     * @return Returns true if isExplicitReq() is "Y"
     */
    public boolean isExplicitReq() throws CFException {
      return work.isExplicitReq();
    }

    /** set values "Y" */
    public void setExplicitReqTrue() throws CFException {
      work.setExplicitReqTrue();
    }
    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public ExplicitDataOutCtx getExplicitDataOutCtx() {
      return new ExplicitDataOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public ExplicitDataInCtx clone() {
      ExplicitDataInCtx cloneObj = new ExplicitDataInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public ExplicitDataInCtx getExplicitDataInCtx() {
    return new ExplicitDataInCtx();
  }

  public class ExplicitDataOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaVerNbr
     *
     * @return crtnHipaaVerNbr
     */
    public char[] getCrtnHipaaVerNbr() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().getCrtnHipaaVerNbr();
    }

    /**
     * set variable crtnHipaaVerNbr
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(value);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex);
    }

    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source) {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(source);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition "D" for isCrtnSelect()
     *
     * @return Returns true if isCrtnSelect() is "D"
     */
    public boolean isCrtnSelect() throws CFException {
      return cacheCommArea.getCrtnRequestData().isCrtnSelect();
    }

    /** set values "D" */
    public void setCrtnSelectTrue() throws CFException {
      cacheCommArea.getCrtnRequestData().setCrtnSelectTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 100 for isDsmEntryNotFndInq()
     *
     * @return Returns true if isDsmEntryNotFndInq() is 100
     */
    public boolean isDsmEntryNotFndInq() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEntryNotFndInq();
    }

    /** set values 100 */
    public void setDsmEntryNotFndInqTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEntryNotFndInqTrue();
    }
    /**
     * Returns the value of hipaaVerNbr
     *
     * @return hipaaVerNbr
     */
    public char[] getHipaaVerNbr() throws CFException {
      return dclhipaaProcCd.getHipaaVerNbr();
    }

    /**
     * set variable hipaaVerNbr
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(value);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex);
    }

    public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source) {
      dclhipaaProcCd.setHipaaVerNbr(source);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of crtnKeyCode
     *
     * @return crtnKeyCode
     */
    public char[] getCrtnKeyCode() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnKeyCode();
    }

    /**
     * set variable crtnKeyCode
     *
     * @param value
     */
    public void setCrtnKeyCode(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(value);
    }

    /**
     * Update CrtnKeyCode with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex);
    }

    public void setCrtnKeyCode(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnKeyCode with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .setCrtnKeyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnKeyCode with another Field
     *
     * @param value
     */
    public void setCrtnKeyCode(Field source) {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source);
    }

    /**
     * Update CrtnKeyCode with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchKey().setCrtnKeyCode(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnKeyCode with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnKeyCode(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .setCrtnKeyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of hpcRetHipaaCd
     *
     * @return hpcRetHipaaCd
     */
    public char[] getHpcRetHipaaCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetHipaaCd();
    }

    /**
     * set variable hpcRetHipaaCd
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(value);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex);
    }

    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(source);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public ExplicitDataOutCtx clone() {
      ExplicitDataOutCtx cloneObj = new ExplicitDataOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public ExplicitDataOutCtx getExplicitDataOutCtx() {
    return new ExplicitDataOutCtx();
  }

  public class ProcessExplicitListInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public ProcessExplicitListOutCtx getProcessExplicitListOutCtx() {
      return new ProcessExplicitListOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessExplicitListInCtx clone() {
      ProcessExplicitListInCtx cloneObj = new ProcessExplicitListInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessExplicitListInCtx getProcessExplicitListInCtx() {
    return new ProcessExplicitListInCtx();
  }

  public class ProcessExplicitListOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition "N" for isHipaaFetchEndNo()
     *
     * @return Returns true if isHipaaFetchEndNo() is "N"
     */
    public boolean isHipaaFetchEndNo() throws CFException {
      return work.isHipaaFetchEndNo();
    }

    /** set values "N" */
    public void setHipaaFetchEndNoTrue() throws CFException {
      work.setHipaaFetchEndNoTrue();
    }
    /**
     * Test condition "N" for isHpcRetNoMoreRows()
     *
     * @return Returns true if isHpcRetNoMoreRows() is "N"
     */
    public boolean isHpcRetNoMoreRows() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().isHpcRetNoMoreRows();
    }

    /** set values "N" */
    public void setHpcRetNoMoreRowsTrue() throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetNoMoreRowsTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessExplicitListOutCtx clone() {
      ProcessExplicitListOutCtx cloneObj = new ProcessExplicitListOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessExplicitListOutCtx getProcessExplicitListOutCtx() {
    return new ProcessExplicitListOutCtx();
  }

  public class OpenListCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HipaaCodeList hipaaCodeList = D5427hpcCtx.this.getHipaaCodeList();
    HvHipaaCodeList hvHipaaCodeList = D5427hpcCtx.this.getHvHipaaCodeList();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of hipaaCodeItem
     *
     * @return hipaaCodeItem
     */
    public char[] getHipaaCodeItem(int index) throws CFException {
      return hipaaCodeList.getHipaaCodeItem(index);
    }

    /**
     * set variable hipaaCodeItem
     *
     * @param value
     */
    public void setHipaaCodeItem(int index, char[] value) throws CFException {
      hipaaCodeList.setHipaaCodeItem((index), value);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of hvHipaaCodeList
     *
     * @return hvHipaaCodeList
     */
    public HvHipaaCodeList getHvHipaaCodeList() {
      return hvHipaaCodeList;
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public OpenListCursorOutCtx getOpenListCursorOutCtx() {
      return new OpenListCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hipaaCodeList.hashCode();
      str += hvHipaaCodeList.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenListCursorInCtx clone() {
      OpenListCursorInCtx cloneObj = new OpenListCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hipaaCodeList = new HipaaCodeList();
      cloneObj.hipaaCodeList.set(hipaaCodeList.getClonedField());
      cloneObj.hvHipaaCodeList = new HvHipaaCodeList();
      cloneObj.hvHipaaCodeList.set(hvHipaaCodeList.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenListCursorInCtx getOpenListCursorInCtx() {
    return new OpenListCursorInCtx();
  }

  public class OpenListCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HipaaCodeList hipaaCodeList = D5427hpcCtx.this.getHipaaCodeList();
    HvHipaaCodeList hvHipaaCodeList = D5427hpcCtx.this.getHvHipaaCodeList();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of hipaaCodeItem
     *
     * @return hipaaCodeItem
     */
    public char[] getHipaaCodeItem(int index) throws CFException {
      return hipaaCodeList.getHipaaCodeItem(index);
    }

    /**
     * set variable hipaaCodeItem
     *
     * @param value
     */
    public void setHipaaCodeItem(int index, char[] value) throws CFException {
      hipaaCodeList.setHipaaCodeItem((index), value);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hpcReqHipaaCd
     *
     * @return hpcReqHipaaCd
     */
    public char[] getHpcReqHipaaCd() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaCd();
    }

    /**
     * set variable hpcReqHipaaCd
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(value);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source, sourceIndex);
    }

    public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaCd(source);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaVerNbr
     *
     * @return crtnHipaaVerNbr
     */
    public char[] getCrtnHipaaVerNbr() throws CFException {
      return cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().getCrtnHipaaVerNbr();
    }

    /**
     * set variable crtnHipaaVerNbr
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(value);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex);
    }

    public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source) {
      cacheCommArea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnHipaaVerNbr(source);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchKey()
          .getCrtnSrchKeyPartial()
          .setCrtnHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of hvHipaaCodeItem8
     *
     * @return hvHipaaCodeItem8
     */
    public char[] getHvHipaaCodeItem8() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem8();
    }

    /**
     * set variable hvHipaaCodeItem8
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem8(value);
    }

    /**
     * Update HvHipaaCodeItem8 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem8(source, sourceIndex);
    }

    public void setHvHipaaCodeItem8(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem8(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem8 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem8(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem8 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem8(source);
    }

    /**
     * Update HvHipaaCodeItem8 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem8(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem8 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem8(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem8(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeItem10
     *
     * @return hvHipaaCodeItem10
     */
    public char[] getHvHipaaCodeItem10() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem10();
    }

    /**
     * set variable hvHipaaCodeItem10
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem10(value);
    }

    /**
     * Update HvHipaaCodeItem10 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem10(source, sourceIndex);
    }

    public void setHvHipaaCodeItem10(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem10(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem10 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem10(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem10 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem10(source);
    }

    /**
     * Update HvHipaaCodeItem10 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem10(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem10 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem10(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem10(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeItem3
     *
     * @return hvHipaaCodeItem3
     */
    public char[] getHvHipaaCodeItem3() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem3();
    }

    /**
     * set variable hvHipaaCodeItem3
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem3(value);
    }

    /**
     * Update HvHipaaCodeItem3 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem3(source, sourceIndex);
    }

    public void setHvHipaaCodeItem3(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem3(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem3 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem3(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem3 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem3(source);
    }

    /**
     * Update HvHipaaCodeItem3 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem3(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem3 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem3(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem3(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "A" for isCrtnListCsr()
     *
     * @return Returns true if isCrtnListCsr() is "A"
     */
    public boolean isCrtnListCsr() throws CFException {
      return cacheCommArea.getCrtnRequestData().isCrtnListCsr();
    }

    /** set values "A" */
    public void setCrtnListCsrTrue() throws CFException {
      cacheCommArea.getCrtnRequestData().setCrtnListCsrTrue();
    }
    /**
     * Returns the value of hvHipaaCodeItem7
     *
     * @return hvHipaaCodeItem7
     */
    public char[] getHvHipaaCodeItem7() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem7();
    }

    /**
     * set variable hvHipaaCodeItem7
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem7(value);
    }

    /**
     * Update HvHipaaCodeItem7 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem7(source, sourceIndex);
    }

    public void setHvHipaaCodeItem7(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem7(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem7 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem7(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem7 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem7(source);
    }

    /**
     * Update HvHipaaCodeItem7 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem7(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem7 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem7(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem7(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeList
     *
     * @return hvHipaaCodeList
     */
    public HvHipaaCodeList getHvHipaaCodeList() {
      return hvHipaaCodeList;
    }

    /**
     * Returns the value of hipaaVerNbr
     *
     * @return hipaaVerNbr
     */
    public char[] getHipaaVerNbr() throws CFException {
      return dclhipaaProcCd.getHipaaVerNbr();
    }

    /**
     * set variable hipaaVerNbr
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(value);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex);
    }

    public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source) {
      dclhipaaProcCd.setHipaaVerNbr(source);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of hvHipaaCodeItem2
     *
     * @return hvHipaaCodeItem2
     */
    public char[] getHvHipaaCodeItem2() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem2();
    }

    /**
     * set variable hvHipaaCodeItem2
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem2(value);
    }

    /**
     * Update HvHipaaCodeItem2 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem2(source, sourceIndex);
    }

    public void setHvHipaaCodeItem2(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem2(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem2 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem2(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem2 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem2(source);
    }

    /**
     * Update HvHipaaCodeItem2 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem2(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem2 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem2(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem2(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeItem5
     *
     * @return hvHipaaCodeItem5
     */
    public char[] getHvHipaaCodeItem5() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem5();
    }

    /**
     * set variable hvHipaaCodeItem5
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem5(value);
    }

    /**
     * Update HvHipaaCodeItem5 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem5(source, sourceIndex);
    }

    public void setHvHipaaCodeItem5(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem5(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem5 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem5(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem5 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem5(source);
    }

    /**
     * Update HvHipaaCodeItem5 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem5(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem5 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem5(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem5(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeItem1
     *
     * @return hvHipaaCodeItem1
     */
    public char[] getHvHipaaCodeItem1() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem1();
    }

    /**
     * set variable hvHipaaCodeItem1
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem1(value);
    }

    /**
     * Update HvHipaaCodeItem1 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem1(source, sourceIndex);
    }

    public void setHvHipaaCodeItem1(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem1(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem1 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem1(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem1 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem1(source);
    }

    /**
     * Update HvHipaaCodeItem1 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem1(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem1 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem1(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem1(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hvHipaaCodeItem9
     *
     * @return hvHipaaCodeItem9
     */
    public char[] getHvHipaaCodeItem9() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem9();
    }

    /**
     * set variable hvHipaaCodeItem9
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem9(value);
    }

    /**
     * Update HvHipaaCodeItem9 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem9(source, sourceIndex);
    }

    public void setHvHipaaCodeItem9(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem9(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem9 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem9(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem9 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem9(source);
    }

    /**
     * Update HvHipaaCodeItem9 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem9(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem9 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem9(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem9(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return cacheCommArea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of hvHipaaCodeItem4
     *
     * @return hvHipaaCodeItem4
     */
    public char[] getHvHipaaCodeItem4() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem4();
    }

    /**
     * set variable hvHipaaCodeItem4
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem4(value);
    }

    /**
     * Update HvHipaaCodeItem4 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem4(source, sourceIndex);
    }

    public void setHvHipaaCodeItem4(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem4(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem4 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem4(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem4 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem4(source);
    }

    /**
     * Update HvHipaaCodeItem4 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem4(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem4 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem4(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem4(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of hvHipaaCodeItem6
     *
     * @return hvHipaaCodeItem6
     */
    public char[] getHvHipaaCodeItem6() throws CFException {
      return hvHipaaCodeList.getHvHipaaCodeItem6();
    }

    /**
     * set variable hvHipaaCodeItem6
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(char[] value) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem6(value);
    }

    /**
     * Update HvHipaaCodeItem6 with a char[] from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(char[] source, int sourceIndex) throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem6(source, sourceIndex);
    }

    public void setHvHipaaCodeItem6(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hvHipaaCodeList.setHvHipaaCodeItem6(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem6 with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem6(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HvHipaaCodeItem6 with another Field
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(Field source) {
      hvHipaaCodeList.setHvHipaaCodeItem6(source);
    }

    /**
     * Update HvHipaaCodeItem6 with another Field from an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(Field source, int sourceIndex, int sourceLen) {
      hvHipaaCodeList.setHvHipaaCodeItem6(source, sourceIndex, sourceLen);
    }

    /**
     * Update HvHipaaCodeItem6 with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHvHipaaCodeItem6(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hvHipaaCodeList.setHvHipaaCodeItem6(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnSrchCd
     *
     * @return crtnSrchCd
     */
    public char[] getCrtnSrchCd(int index) throws CFException {
      return cacheCommArea.getCrtnRequestData().getCrtnSrchCd(index);
    }

    /**
     * set variable crtnSrchCd
     *
     * @param value
     */
    public void setCrtnSrchCd(int index, char[] value) throws CFException {
      cacheCommArea.getCrtnRequestData().setCrtnSrchCd((index), value);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hipaaCodeList.hashCode();
      str += hvHipaaCodeList.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenListCursorOutCtx clone() {
      OpenListCursorOutCtx cloneObj = new OpenListCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hipaaCodeList = new HipaaCodeList();
      cloneObj.hipaaCodeList.set(hipaaCodeList.getClonedField());
      cloneObj.hvHipaaCodeList = new HvHipaaCodeList();
      cloneObj.hvHipaaCodeList.set(hvHipaaCodeList.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenListCursorOutCtx getOpenListCursorOutCtx() {
    return new OpenListCursorOutCtx();
  }

  public class FetchListCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of c5427hpc01
     *
     * @return c5427hpc01
     */
    public char[] getC5427hpc01() throws CFException {
      return work.getC5427hpc01();
    }

    /**
     * set variable c5427hpc01
     *
     * @param value
     */
    public void setC5427hpc01(char[] value) throws CFException {
      work.setC5427hpc01(value);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public FetchListCursorOutCtx getFetchListCursorOutCtx() {
      return new FetchListCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchListCursorInCtx clone() {
      FetchListCursorInCtx cloneObj = new FetchListCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchListCursorInCtx getFetchListCursorInCtx() {
    return new FetchListCursorInCtx();
  }

  public class FetchListCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return cacheCommArea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      cacheCommArea.setCrtnFunctionIsFetchTrue();
    }
    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public int getDsmFuncCd() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmFuncCd();
    }

    /**
     * Returns String value of dsmFuncCd
     *
     * @return dsmFuncCd
     */
    public char[] getDsmFuncCdString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmFuncCdString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmFuncCdIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmFuncCdIsNumeric();
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param number
     */
    public void setDsmFuncCd(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    public void setDsmFuncCd(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(number);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCd(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Update DsmFuncCd with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmFuncCdString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmFuncCd(value);
    }

    /**
     * Returns the value of dsmEditErrorField
     *
     * @return dsmEditErrorField
     */
    public char[] getDsmEditErrorField() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorField();
    }

    /**
     * set variable dsmEditErrorField
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(value);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex);
    }

    public void setDsmEditErrorField(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorField with another Field
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorField(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorField with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorField(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorField(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 100 for isDsmEntryNotFndInq()
     *
     * @return Returns true if isDsmEntryNotFndInq() is 100
     */
    public boolean isDsmEntryNotFndInq() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEntryNotFndInq();
    }

    /** set values 100 */
    public void setDsmEntryNotFndInqTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEntryNotFndInqTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of grnrcRqstCd
     *
     * @return grnrcRqstCd
     */
    public char[] getGrnrcRqstCd() throws CFException {
      return dclhipaaProcCd.getGrnrcRqstCd();
    }

    /**
     * set variable grnrcRqstCd
     *
     * @param value
     */
    public void setGrnrcRqstCd(char[] value) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(value);
    }

    /**
     * Update GrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex);
    }

    public void setGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update GrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update GrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setGrnrcRqstCd(Field source) {
      dclhipaaProcCd.setGrnrcRqstCd(source);
    }

    /**
     * Update GrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update GrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Returns the value of hpcRetHipaaCd
     *
     * @return hpcRetHipaaCd
     */
    public char[] getHpcRetHipaaCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetHipaaCd();
    }

    /**
     * set variable hpcRetHipaaCd
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(value);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex);
    }

    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(source);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 1 for isDsmEditError()
     *
     * @return Returns true if isDsmEditError() is 1
     */
    public boolean isDsmEditError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEditError();
    }

    /** set values 1 */
    public void setDsmEditErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorTrue();
    }
    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheCommArea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmEditErrorValueTxt
     *
     * @return dsmEditErrorValueTxt
     */
    public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
      return dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
    }

    /**
     * Update DsmEditErrorValueTxt with the passed value
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(value);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea.getDsmCommonArea().setDsmEditErrorValueTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmEditErrorValueTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setDsmEditErrorValueTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmCommonArea()
          .setDsmEditErrorValueTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of returnCode
     *
     * @return returnCode
     */
    public char[] getReturnCode() throws CFException {
      return work.getReturnCode();
    }

    /**
     * set variable returnCode
     *
     * @param value
     */
    public void setReturnCode(char[] value) throws CFException {
      work.setReturnCode(value);
    }

    /**
     * Returns the value of hpcRetGrnrcRqstCd
     *
     * @return hpcRetGrnrcRqstCd
     */
    public char[] getHpcRetGrnrcRqstCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetGrnrcRqstCd();
    }

    /**
     * set variable hpcRetGrnrcRqstCd
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, char[] value) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(value);
    }

    /**
     * Update HpcRetGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex);
    }

    public void setHpcRetGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, Field source) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheCommArea
     *
     * @return cacheCommArea
     */
    public CacheCommArea getCacheCommArea() {
      return cacheCommArea;
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchListCursorOutCtx clone() {
      FetchListCursorOutCtx cloneObj = new FetchListCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchListCursorOutCtx getFetchListCursorOutCtx() {
    return new FetchListCursorOutCtx();
  }

  public class CloseListCursorInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return cacheCommArea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      cacheCommArea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public CloseListCursorOutCtx getCloseListCursorOutCtx() {
      return new CloseListCursorOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseListCursorInCtx clone() {
      CloseListCursorInCtx cloneObj = new CloseListCursorInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseListCursorInCtx getCloseListCursorInCtx() {
    return new CloseListCursorInCtx();
  }

  public class CloseListCursorOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    CacheCommArea cacheCommArea = D5427hpcCtx.this.getCacheCommArea();

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += cacheCommArea.hashCode();
      return str.hashCode();
    }

    public CloseListCursorOutCtx clone() {
      CloseListCursorOutCtx cloneObj = new CloseListCursorOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.cacheCommArea = new CacheCommArea();
      cloneObj.cacheCommArea.set(cacheCommArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseListCursorOutCtx getCloseListCursorOutCtx() {
    return new CloseListCursorOutCtx();
  }

  public class ProcessAllHipaaInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public ProcessAllHipaaOutCtx getProcessAllHipaaOutCtx() {
      return new ProcessAllHipaaOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessAllHipaaInCtx clone() {
      ProcessAllHipaaInCtx cloneObj = new ProcessAllHipaaInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessAllHipaaInCtx getProcessAllHipaaInCtx() {
    return new ProcessAllHipaaInCtx();
  }

  public class ProcessAllHipaaOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Test condition "N" for isHpcRetNoMoreRows()
     *
     * @return Returns true if isHpcRetNoMoreRows() is "N"
     */
    public boolean isHpcRetNoMoreRows() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().isHpcRetNoMoreRows();
    }

    /** set values "N" */
    public void setHpcRetNoMoreRowsTrue() throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetNoMoreRowsTrue();
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessAllHipaaOutCtx clone() {
      ProcessAllHipaaOutCtx cloneObj = new ProcessAllHipaaOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessAllHipaaOutCtx getProcessAllHipaaOutCtx() {
    return new ProcessAllHipaaOutCtx();
  }

  public class OpenHipaaAllCsrInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public OpenHipaaAllCsrOutCtx getOpenHipaaAllCsrOutCtx() {
      return new OpenHipaaAllCsrOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenHipaaAllCsrInCtx clone() {
      OpenHipaaAllCsrInCtx cloneObj = new OpenHipaaAllCsrInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenHipaaAllCsrInCtx getOpenHipaaAllCsrInCtx() {
    return new OpenHipaaAllCsrInCtx();
  }

  public class OpenHipaaAllCsrOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqHipaaVerNbr
     *
     * @return hpcReqHipaaVerNbr
     */
    public char[] getHpcReqHipaaVerNbr() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqHipaaVerNbr();
    }

    /**
     * set variable hpcReqHipaaVerNbr
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(value);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source, sourceIndex);
    }

    public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqHipaaVerNbr(source);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "N" for isHipaaFetchEndNo()
     *
     * @return Returns true if isHipaaFetchEndNo() is "N"
     */
    public boolean isHipaaFetchEndNo() throws CFException {
      return work.isHipaaFetchEndNo();
    }

    /** set values "N" */
    public void setHipaaFetchEndNoTrue() throws CFException {
      work.setHipaaFetchEndNoTrue();
    }
    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of hipaaVerNbr
     *
     * @return hipaaVerNbr
     */
    public char[] getHipaaVerNbr() throws CFException {
      return dclhipaaProcCd.getHipaaVerNbr();
    }

    /**
     * set variable hipaaVerNbr
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(value);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex);
    }

    public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaVerNbr with another Field
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source) {
      dclhipaaProcCd.setHipaaVerNbr(source);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaVerNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaVerNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaVerNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public OpenHipaaAllCsrOutCtx clone() {
      OpenHipaaAllCsrOutCtx cloneObj = new OpenHipaaAllCsrOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public OpenHipaaAllCsrOutCtx getOpenHipaaAllCsrOutCtx() {
    return new OpenHipaaAllCsrOutCtx();
  }

  public class FetchHipaaAllCsrInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Test condition 100 for isSqlcodeFetchEnd()
     *
     * @return Returns true if isSqlcodeFetchEnd() is 100
     */
    public boolean isSqlcodeFetchEnd() throws CFException {
      return work.isSqlcodeFetchEnd();
    }

    /** set values 100 */
    public void setSqlcodeFetchEndTrue() throws CFException {
      work.setSqlcodeFetchEndTrue();
    }
    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public FetchHipaaAllCsrOutCtx getFetchHipaaAllCsrOutCtx() {
      return new FetchHipaaAllCsrOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchHipaaAllCsrInCtx clone() {
      FetchHipaaAllCsrInCtx cloneObj = new FetchHipaaAllCsrInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchHipaaAllCsrInCtx getFetchHipaaAllCsrInCtx() {
    return new FetchHipaaAllCsrInCtx();
  }

  public class FetchHipaaAllCsrOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();
    DclhipaaProcCd dclhipaaProcCd = D5427hpcCtx.this.getDclhipaaProcCd();

    /**
     * Returns the value of hipaaCd
     *
     * @return hipaaCd
     */
    public char[] getHipaaCd() throws CFException {
      return dclhipaaProcCd.getHipaaCd();
    }

    /**
     * set variable hipaaCd
     *
     * @param value
     */
    public void setHipaaCd(char[] value) throws CFException {
      dclhipaaProcCd.setHipaaCd(value);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(char[] source, int sourceIndex) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex);
    }

    public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HipaaCd with another Field
     *
     * @param value
     */
    public void setHipaaCd(Field source) {
      dclhipaaProcCd.setHipaaCd(source);
    }

    /**
     * Update HipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclhipaaProcCd.setHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of lneSub
     *
     * @return lneSub
     */
    public int getLneSub() throws CFException {
      return work.getLneSub();
    }

    /**
     * Update LneSub with the passed value
     *
     * @param number
     */
    public void setLneSub(int number) throws CFException {
      work.setLneSub(number);
    }

    public void setLneSub(long number) throws CFException {
      work.setLneSub((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of hpcRetHipaaCd
     *
     * @return hpcRetHipaaCd
     */
    public char[] getHpcRetHipaaCd(int index) throws CFException {
      return hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .getHpcRetHipaaCd();
    }

    /**
     * set variable hpcRetHipaaCd
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(value);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex);
    }

    public void setHpcRetHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetHipaa(index).setHpcRetHipaaCd(source);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcRetHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcRetArea()
          .getHpcRetHipaa(index)
          .setHpcRetHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclhipaaProcCd
     *
     * @return dclhipaaProcCd
     */
    public DclhipaaProcCd getDclhipaaProcCd() {
      return dclhipaaProcCd;
    }

    /**
     * Returns the value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public int getHpcRetCnt() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCnt();
    }

    /**
     * Returns String value of hpcRetCnt
     *
     * @return hpcRetCnt
     */
    public char[] getHpcRetCntString() throws CFException {
      return String.valueOf(hpcDataArea.getHpcReqRetArea().getHpcRetArea().getHpcRetCntString())
          .toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean hpcRetCntIsNumeric() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcRetArea().hpcRetCntIsNumeric();
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param number
     */
    public void setHpcRetCnt(int number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    public void setHpcRetCnt(long number) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(number);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCnt(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Update HpcRetCnt with the passed value
     *
     * @param value (String or char[])
     */
    public void setHpcRetCntString(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcRetArea().setHpcRetCnt(value);
    }

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Test condition 100 for isDsmEntryNotFndInq()
     *
     * @return Returns true if isDsmEntryNotFndInq() is 100
     */
    public boolean isDsmEntryNotFndInq() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmEntryNotFndInq();
    }

    /** set values 100 */
    public void setDsmEntryNotFndInqTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmEntryNotFndInqTrue();
    }
    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      str += dclhipaaProcCd.hashCode();
      return str.hashCode();
    }

    public FetchHipaaAllCsrOutCtx clone() {
      FetchHipaaAllCsrOutCtx cloneObj = new FetchHipaaAllCsrOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      cloneObj.dclhipaaProcCd = new DclhipaaProcCd();
      cloneObj.dclhipaaProcCd.set(dclhipaaProcCd.getClonedField());
      return cloneObj;
    }
  }

  public FetchHipaaAllCsrOutCtx getFetchHipaaAllCsrOutCtx() {
    return new FetchHipaaAllCsrOutCtx();
  }

  public class CloseHipaaAllCsrInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlwarn
     *
     * @return sqlwarn
     */
    public Sqlwarn getSqlwarn() {
      return sqlca.getSqlwarn();
    }

    /**
     * Update Sqlwarn with the passed value
     *
     * @param value
     */
    public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
    }

    /**
     * Update Sqlwarn with a String from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlwarn with another Field
     *
     * @param value
     */
    public void setSqlwarn(Field source) {
      sqlca.setSqlwarn(source);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlwarn(Field source, int sourceIndex, int sourceLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlwarn with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlwarn(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlerrmc
     *
     * @return sqlerrmc
     */
    public char[] getSqlerrmc() throws CFException {
      return sqlca.getSqlerrm().getSqlerrmc();
    }

    /**
     * set variable sqlerrmc
     *
     * @param value
     */
    public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
    }

    public void setSqlerrmc(char[] source, int sourceIndex, int sourceLen) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update Sqlerrmc with another Field
     *
     * @param value
     */
    public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(Field source, int sourceIndex, int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
    }

    /**
     * Update Sqlerrmc with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSqlerrmc(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Returns the value of sqlerrd
     *
     * @return sqlerrd
     */
    public int getSqlerrd(int index) throws CFException {
      return sqlca.getSqlerrd((index));
    }

    /**
     * Update Sqlerrd with the passed value
     *
     * @param number
     */
    public void setSqlerrd(int index, int number) throws CFException {
      sqlca.setSqlerrd((index), number);
    }

    public void setSqlerrd(int index, long number) throws CFException {
      sqlca.setSqlerrd((index), (int) number);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public CloseHipaaAllCsrOutCtx getCloseHipaaAllCsrOutCtx() {
      return new CloseHipaaAllCsrOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public CloseHipaaAllCsrInCtx clone() {
      CloseHipaaAllCsrInCtx cloneObj = new CloseHipaaAllCsrInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseHipaaAllCsrInCtx getCloseHipaaAllCsrInCtx() {
    return new CloseHipaaAllCsrInCtx();
  }

  public class CloseHipaaAllCsrOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();

    /**
     * Returns the value of dsmErrSectnName
     *
     * @return dsmErrSectnName
     */
    public char[] getDsmErrSectnName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrSectnName();
    }

    /**
     * set variable dsmErrSectnName
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(value);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source, sourceIndex);
    }

    public void setDsmErrSectnName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrSectnName with another Field
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrSectnName(source);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrSectnName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrSectnName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrSectnName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlcode_Ws
     *
     * @return sqlcode_Ws
     */
    public int getSqlcode_Ws() throws CFException {
      return work.getSqlcode_Ws();
    }

    /**
     * Update Sqlcode_Ws with the passed value
     *
     * @param number
     */
    public void setSqlcode_Ws(int number) throws CFException {
      work.setSqlcode_Ws(number);
    }

    public void setSqlcode_Ws(long number) throws CFException {
      work.setSqlcode_Ws((int) number);
    }

    /**
     * Returns the value of dsmErrTblName
     *
     * @return dsmErrTblName
     */
    public char[] getDsmErrTblName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblName();
    }

    /**
     * set variable dsmErrTblName
     *
     * @param value
     */
    public void setDsmErrTblName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(value);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source, sourceIndex);
    }

    public void setDsmErrTblName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblName with another Field
     *
     * @param value
     */
    public void setDsmErrTblName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblName(source);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
    }

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 0 for isSqlcodeOk()
     *
     * @return Returns true if isSqlcodeOk() is 0
     */
    public boolean isSqlcodeOk() throws CFException {
      return work.isSqlcodeOk();
    }

    /** set values 0 */
    public void setSqlcodeOkTrue() throws CFException {
      work.setSqlcodeOkTrue();
    }
    /**
     * Test condition 999 for isDsmDb2Error()
     *
     * @return Returns true if isDsmDb2Error() is 999
     */
    public boolean isDsmDb2Error() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDb2Error();
    }

    /** set values 999 */
    public void setDsmDb2ErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue();
    }
    /**
     * Returns the value of dsmErrTblAction
     *
     * @return dsmErrTblAction
     */
    public char[] getDsmErrTblAction() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTblAction();
    }

    /**
     * set variable dsmErrTblAction
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(value);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source, sourceIndex);
    }

    public void setDsmErrTblAction(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTblAction with another Field
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTblAction(source);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTblAction with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTblAction(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTblAction(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public CloseHipaaAllCsrOutCtx clone() {
      CloseHipaaAllCsrOutCtx cloneObj = new CloseHipaaAllCsrOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseHipaaAllCsrOutCtx getCloseHipaaAllCsrOutCtx() {
    return new CloseHipaaAllCsrOutCtx();
  }

  public class MovesForErrorLogInCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Returns the value of hpcReqClngProg
     *
     * @return hpcReqClngProg
     */
    public char[] getHpcReqClngProg() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqClngProg();
    }

    /**
     * set variable hpcReqClngProg
     *
     * @param value
     */
    public void setHpcReqClngProg(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(value);
    }

    /**
     * Update HpcReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(source, sourceIndex);
    }

    public void setHpcReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqClngProg with another Field
     *
     * @param value
     */
    public void setHpcReqClngProg(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(source);
    }

    /**
     * Update HpcReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmPgmName
     *
     * @return dsmPgmName
     */
    public char[] getDsmPgmName() throws CFException {
      return work.getDsmPgmName();
    }

    /**
     * set variable dsmPgmName
     *
     * @param value
     */
    public void setDsmPgmName(char[] value) throws CFException {
      work.setDsmPgmName(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public MovesForErrorLogOutCtx getMovesForErrorLogOutCtx() {
      return new MovesForErrorLogOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public MovesForErrorLogInCtx clone() {
      MovesForErrorLogInCtx cloneObj = new MovesForErrorLogInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MovesForErrorLogInCtx getMovesForErrorLogInCtx() {
    return new MovesForErrorLogInCtx();
  }

  public class MovesForErrorLogOutCtx implements Cloneable {
    Work work = D5427hpcCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();
    HpcDataArea hpcDataArea = D5427hpcCtx.this.getHpcDataArea();

    /**
     * Returns the value of dsmErrClngPgmName
     *
     * @return dsmErrClngPgmName
     */
    public char[] getDsmErrClngPgmName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrClngPgmName();
    }

    /**
     * set variable dsmErrClngPgmName
     *
     * @param value
     */
    public void setDsmErrClngPgmName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrClngPgmName(value);
    }

    /**
     * Update DsmErrClngPgmName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrClngPgmName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrClngPgmName(source, sourceIndex);
    }

    public void setDsmErrClngPgmName(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrClngPgmName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrClngPgmName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrClngPgmName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrClngPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrClngPgmName with another Field
     *
     * @param value
     */
    public void setDsmErrClngPgmName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrClngPgmName(source);
    }

    /**
     * Update DsmErrClngPgmName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrClngPgmName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrClngPgmName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrClngPgmName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrClngPgmName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrClngPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmErrPgmName
     *
     * @return dsmErrPgmName
     */
    public char[] getDsmErrPgmName() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrPgmName();
    }

    /**
     * set variable dsmErrPgmName
     *
     * @param value
     */
    public void setDsmErrPgmName(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrPgmName(value);
    }

    /**
     * Update DsmErrPgmName with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrPgmName(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrPgmName(source, sourceIndex);
    }

    public void setDsmErrPgmName(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrPgmName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrPgmName with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrPgmName(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrPgmName with another Field
     *
     * @param value
     */
    public void setDsmErrPgmName(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrPgmName(source);
    }

    /**
     * Update DsmErrPgmName with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrPgmName(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrPgmName(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrPgmName with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrPgmName(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hpcReqClngProg
     *
     * @return hpcReqClngProg
     */
    public char[] getHpcReqClngProg() throws CFException {
      return hpcDataArea.getHpcReqRetArea().getHpcReqArea().getHpcReqClngProg();
    }

    /**
     * set variable hpcReqClngProg
     *
     * @param value
     */
    public void setHpcReqClngProg(char[] value) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(value);
    }

    /**
     * Update HpcReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(char[] source, int sourceIndex) throws CFException {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(source, sourceIndex);
    }

    public void setHpcReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HpcReqClngProg with another Field
     *
     * @param value
     */
    public void setHpcReqClngProg(Field source) {
      hpcDataArea.getHpcReqRetArea().getHpcReqArea().setHpcReqClngProg(source);
    }

    /**
     * Update HpcReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(Field source, int sourceIndex, int sourceLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update HpcReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHpcReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      hpcDataArea
          .getHpcReqRetArea()
          .getHpcReqArea()
          .setHpcReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dsmPgmName
     *
     * @return dsmPgmName
     */
    public char[] getDsmPgmName() throws CFException {
      return work.getDsmPgmName();
    }

    /**
     * set variable dsmPgmName
     *
     * @param value
     */
    public void setDsmPgmName(char[] value) throws CFException {
      work.setDsmPgmName(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += hpcDataArea.hashCode();
      return str.hashCode();
    }

    public MovesForErrorLogOutCtx clone() {
      MovesForErrorLogOutCtx cloneObj = new MovesForErrorLogOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.hpcDataArea = new HpcDataArea();
      cloneObj.hpcDataArea.set(hpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MovesForErrorLogOutCtx getMovesForErrorLogOutCtx() {
    return new MovesForErrorLogOutCtx();
  }

  public class SqlErrorProcessInCtx implements Cloneable {
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    public SqlErrorProcessOutCtx getSqlErrorProcessOutCtx() {
      return new SqlErrorProcessOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public SqlErrorProcessInCtx clone() {
      SqlErrorProcessInCtx cloneObj = new SqlErrorProcessInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public SqlErrorProcessInCtx getSqlErrorProcessInCtx() {
    return new SqlErrorProcessInCtx();
  }

  public class SqlErrorProcessOutCtx implements Cloneable {
    Sqlca sqlca = D5427hpcCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427hpcCtx.this.getDsmCallArea();

    /**
     * Returns the value of dsmErrTxt
     *
     * @return dsmErrTxt
     */
    public char[] getDsmErrTxt() throws CFException {
      return dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().getDsmErrTxt();
    }

    /**
     * set variable dsmErrTxt
     *
     * @param value
     */
    public void setDsmErrTxt(char[] value) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTxt(value);
    }

    /**
     * Update DsmErrTxt with a char[] from an offset and length
     *
     * @param value
     */
    public void setDsmErrTxt(char[] source, int sourceIndex) throws CFException {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTxt(source, sourceIndex);
    }

    public void setDsmErrTxt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTxt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update DsmErrTxt with another Field
     *
     * @param value
     */
    public void setDsmErrTxt(Field source) {
      dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea().setDsmErrTxt(source);
    }

    /**
     * Update DsmErrTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setDsmErrTxt(Field source, int sourceIndex, int sourceLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update DsmErrTxt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setDsmErrTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dsmCallArea
          .getDsmLogArea()
          .getDsmSqlErrorMsgArea()
          .setDsmErrTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition 90 for isDsmSystemError()
     *
     * @return Returns true if isDsmSystemError() is 90
     */
    public boolean isDsmSystemError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmSystemError();
    }

    /** set values 90 */
    public void setDsmSystemErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSystemErrorTrue();
    }
    /**
     * Test condition 20 for isDsmValueError()
     *
     * @return Returns true if isDsmValueError() is 20
     */
    public boolean isDsmValueError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmValueError();
    }

    /** set values 20 */
    public void setDsmValueErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmValueErrorTrue();
    }
    /**
     * Test condition 10 for isDsmDuplicateError()
     *
     * @return Returns true if isDsmDuplicateError() is 10
     */
    public boolean isDsmDuplicateError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmDuplicateError();
    }

    /** set values 10 */
    public void setDsmDuplicateErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmDuplicateErrorTrue();
    }
    /**
     * Test condition 70 for isDsmPackageError()
     *
     * @return Returns true if isDsmPackageError() is 70
     */
    public boolean isDsmPackageError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmPackageError();
    }

    /** set values 70 */
    public void setDsmPackageErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmPackageErrorTrue();
    }
    /**
     * Returns the value of sqlcode
     *
     * @return sqlcode
     */
    public int getSqlcode() throws CFException {
      return sqlca.getSqlcode();
    }

    /**
     * Update Sqlcode with the passed value
     *
     * @param number
     */
    public void setSqlcode(int number) throws CFException {
      sqlca.setSqlcode(number);
    }

    public void setSqlcode(long number) throws CFException {
      sqlca.setSqlcode((int) number);
    }

    /**
     * Test condition 2 for isDsmNotfoundError()
     *
     * @return Returns true if isDsmNotfoundError() is 2
     */
    public boolean isDsmNotfoundError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmNotfoundError();
    }

    /** set values 2 */
    public void setDsmNotfoundErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmNotfoundErrorTrue();
    }
    /**
     * Test condition 30 for isDsmProcessError()
     *
     * @return Returns true if isDsmProcessError() is 30
     */
    public boolean isDsmProcessError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmProcessError();
    }

    /** set values 30 */
    public void setDsmProcessErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmProcessErrorTrue();
    }
    /**
     * Test condition 1 for isDsmUndefinedError()
     *
     * @return Returns true if isDsmUndefinedError() is 1
     */
    public boolean isDsmUndefinedError() throws CFException {
      return dsmCallArea.getDsmCommonArea().isDsmUndefinedError();
    }

    /** set values 1 */
    public void setDsmUndefinedErrorTrue() throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmUndefinedErrorTrue();
    }
    /**
     * Returns the value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public short getDsmSqlcode() throws CFException {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcode();
    }

    /**
     * Returns the String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeActualString() {
      return dsmCallArea.getDsmCommonArea().getDsmSqlcodeActualString();
    }

    /**
     * Returns String value of dsmSqlcode
     *
     * @return dsmSqlcode
     */
    public char[] getDsmSqlcodeString() throws CFException {
      return String.valueOf(dsmCallArea.getDsmCommonArea().getDsmSqlcodeString()).toCharArray();
    }

    /**
     * This method allows testing if there is a numeric value stored in the serialized String
     *
     * @return true if numeric value is stored in the string
     */
    public boolean dsmSqlcodeIsNumeric() throws CFException {
      return dsmCallArea.getDsmCommonArea().dsmSqlcodeIsNumeric();
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param number
     */
    public void setDsmSqlcode(short number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(int number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    public void setDsmSqlcode(long number) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(number);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcode(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    /**
     * Update DsmSqlcode with the passed value
     *
     * @param value (String or char[])
     */
    public void setDsmSqlcodeString(char[] value) throws CFException {
      dsmCallArea.getDsmCommonArea().setDsmSqlcode(value);
    }

    public D5427hpcCtx getD5427hpcCtx() {
      return D5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += sqlca.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public SqlErrorProcessOutCtx clone() {
      SqlErrorProcessOutCtx cloneObj = new SqlErrorProcessOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public SqlErrorProcessOutCtx getSqlErrorProcessOutCtx() {
    return new SqlErrorProcessOutCtx();
  }
}
