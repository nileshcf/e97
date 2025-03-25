package com.cloudframe.app.dto.d5427scn;

import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.exception.CFException;

@Context
public class D5427scnCtx implements ProgramContext, Cloneable {
  GlobalExecutorCtx globalCtx;

  Sqlca sqlca;
  CacheTsqRecord cacheTsqRecord;
  DclsrvcCdTransTbl dclsrvcCdTransTbl;
  Work work;
  DsmCallArea dsmCallArea;
  CsrchSearchKey csrchSearchKey;
  ScnDataArea scnDataArea;
  DfhcommareaGroup dfhcommareaGroup;
  CacheScnKeyArea cacheScnKeyArea;

  int cacheKeyNdx;

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

  boolean programEnded = false;

  public boolean isProgramEnded() {
    return this.programEnded;
  }

  public void setProgramEnded(boolean programEnded) {
    this.programEnded = programEnded;
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

  public CacheTsqRecord getCacheTsqRecord() {
    if (cacheTsqRecord == null) {
      cacheTsqRecord = new CacheTsqRecord();
    }

    return cacheTsqRecord;
  }

  public void setCacheTsqRecord(CacheTsqRecord cacheTsqRecord) {
    this.cacheTsqRecord = cacheTsqRecord;
  }

  public DclsrvcCdTransTbl getDclsrvcCdTransTbl() {
    if (dclsrvcCdTransTbl == null) {
      dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
    }

    return dclsrvcCdTransTbl;
  }

  public void setDclsrvcCdTransTbl(DclsrvcCdTransTbl dclsrvcCdTransTbl) {
    this.dclsrvcCdTransTbl = dclsrvcCdTransTbl;
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

  public DsmCallArea getDsmCallArea() {
    if (dsmCallArea == null) {
      dsmCallArea = new DsmCallArea();
    }

    return dsmCallArea;
  }

  public void setDsmCallArea(DsmCallArea dsmCallArea) {
    this.dsmCallArea = dsmCallArea;
  }

  public CsrchSearchKey getCsrchSearchKey() {
    if (csrchSearchKey == null) {
      csrchSearchKey = new CsrchSearchKey();
    }

    return csrchSearchKey;
  }

  public void setCsrchSearchKey(CsrchSearchKey csrchSearchKey) {
    this.csrchSearchKey = csrchSearchKey;
  }

  public ScnDataArea getScnDataArea() {
    if (scnDataArea == null) {
      scnDataArea = new ScnDataArea();
    }

    return scnDataArea;
  }

  public void setScnDataArea(ScnDataArea scnDataArea) {
    this.scnDataArea = scnDataArea;
  }

  public DfhcommareaGroup getDfhcommareaGroup() {
    if (dfhcommareaGroup == null) {
      dfhcommareaGroup = new DfhcommareaGroup();
    }

    return dfhcommareaGroup;
  }

  public void setDfhcommareaGroup(DfhcommareaGroup dfhcommareaGroup) {
    this.dfhcommareaGroup = dfhcommareaGroup;
  }

  public CacheScnKeyArea getCacheScnKeyArea() {
    if (cacheScnKeyArea == null) {
      cacheScnKeyArea = new CacheScnKeyArea();
    }

    return cacheScnKeyArea;
  }

  public void setCacheScnKeyArea(CacheScnKeyArea cacheScnKeyArea) {
    this.cacheScnKeyArea = cacheScnKeyArea;
  }

  public int getCacheKeyNdx() {
    return cacheKeyNdx;
  }

  public void setCacheKeyNdx(int cacheKeyNdx) {
    this.cacheKeyNdx = cacheKeyNdx;
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
    str += cacheTsqRecord.hashCode();
    str += dclsrvcCdTransTbl.hashCode();
    str += work.hashCode();
    str += dsmCallArea.hashCode();
    str += csrchSearchKey.hashCode();
    str += scnDataArea.hashCode();
    str += dfhcommareaGroup.hashCode();
    str += cacheScnKeyArea.hashCode();
    return str.hashCode();
  }

  public D5427scnCtx clone() {
    D5427scnCtx cloneObj = new D5427scnCtx();
    cloneObj.sqlca = new Sqlca();
    cloneObj.sqlca.set(sqlca.getClonedField());
    cloneObj.cacheTsqRecord = new CacheTsqRecord();
    cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
    cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
    cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
    cloneObj.work = new Work();
    cloneObj.work.set(work.getClonedField());
    cloneObj.dsmCallArea = new DsmCallArea();
    cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
    cloneObj.csrchSearchKey = new CsrchSearchKey();
    cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
    cloneObj.scnDataArea = new ScnDataArea();
    cloneObj.scnDataArea.set(scnDataArea.getClonedField());
    cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
    cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
    cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
    cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
    return cloneObj;
  }

  /** Program method contexts */
  public class ProcessInCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();
    DfhcommareaGroup dfhcommareaGroup = D5427scnCtx.this.getDfhcommareaGroup();

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += scnDataArea.hashCode();
      str += dfhcommareaGroup.hashCode();
      return str.hashCode();
    }

    public ProcessInCtx clone() {
      ProcessInCtx cloneObj = new ProcessInCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
      cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
      return cloneObj;
    }
  }

  public ProcessInCtx getProcessInCtx() {
    return new ProcessInCtx();
  }

  public class MainLineInCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

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
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public MainLineInCtx clone() {
      MainLineInCtx cloneObj = new MainLineInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MainLineInCtx getMainLineInCtx() {
    return new MainLineInCtx();
  }

  public class MainLineOutCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

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
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public MainLineOutCtx clone() {
      MainLineOutCtx cloneObj = new MainLineOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MainLineOutCtx getMainLineOutCtx() {
    return new MainLineOutCtx();
  }

  public class InitializeInCtx implements Cloneable {
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

    /**
     * Returns the value of scnReqSrvcCd
     *
     * @return scnReqSrvcCd
     */
    public char[] getScnReqSrvcCd() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqSrvcCd();
    }

    /**
     * set variable scnReqSrvcCd
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(value);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source, sourceIndex);
    }

    public void setScnReqSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of scnReqCancDt
     *
     * @return scnReqCancDt
     */
    public char[] getScnReqCancDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqCancDt();
    }

    /**
     * set variable scnReqCancDt
     *
     * @param value
     */
    public void setScnReqCancDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(value);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source, sourceIndex);
    }

    public void setScnReqCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqCancDt with another Field
     *
     * @param value
     */
    public void setScnReqCancDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnReqEffDt
     *
     * @return scnReqEffDt
     */
    public char[] getScnReqEffDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqEffDt();
    }

    /**
     * set variable scnReqEffDt
     *
     * @param value
     */
    public void setScnReqEffDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(value);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex);
    }

    public void setScnReqEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqEffDt with another Field
     *
     * @param value
     */
    public void setScnReqEffDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    public InitializeOutCtx getInitializeOutCtx() {
      return new InitializeOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += dclsrvcCdTransTbl.hashCode();
      str += dsmCallArea.hashCode();
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public InitializeInCtx clone() {
      InitializeInCtx cloneObj = new InitializeInCtx();
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public InitializeInCtx getInitializeInCtx() {
    return new InitializeInCtx();
  }

  public class InitializeOutCtx implements Cloneable {
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

    /**
     * Returns the value of scnReqSrvcCd
     *
     * @return scnReqSrvcCd
     */
    public char[] getScnReqSrvcCd() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqSrvcCd();
    }

    /**
     * set variable scnReqSrvcCd
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(value);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source, sourceIndex);
    }

    public void setScnReqSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclsrvcCdTransTbl
     *
     * @return dclsrvcCdTransTbl
     */
    public DclsrvcCdTransTbl getDclsrvcCdTransTbl() {
      return dclsrvcCdTransTbl;
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
     * Returns the value of scnReqCancDt
     *
     * @return scnReqCancDt
     */
    public char[] getScnReqCancDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqCancDt();
    }

    /**
     * set variable scnReqCancDt
     *
     * @param value
     */
    public void setScnReqCancDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(value);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source, sourceIndex);
    }

    public void setScnReqCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqCancDt with another Field
     *
     * @param value
     */
    public void setScnReqCancDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnRetArea
     *
     * @return scnRetArea
     */
    public ScnRetArea getScnRetArea() {
      return scnDataArea.getScnReqRetArea().getScnRetArea();
    }

    /**
     * Update ScnRetArea with the passed value
     *
     * @param value
     */
    public void setScnRetArea(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().setScnRetArea(value);
    }

    /**
     * Update ScnRetArea with a String from an offset and length
     *
     * @param value
     */
    public void setScnRetArea(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea.getScnReqRetArea().setScnRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnRetArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnRetArea(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .setScnRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnRetArea with another Field
     *
     * @param value
     */
    public void setScnRetArea(Field source) {
      scnDataArea.getScnReqRetArea().setScnRetArea(source);
    }

    /**
     * Update ScnRetArea with another Field from an offset and length
     *
     * @param value
     */
    public void setScnRetArea(Field source, int sourceIndex, int sourceLen) {
      scnDataArea.getScnReqRetArea().setScnRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnRetArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnRetArea(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .setScnRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnReqEffDt
     *
     * @return scnReqEffDt
     */
    public char[] getScnReqEffDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqEffDt();
    }

    /**
     * set variable scnReqEffDt
     *
     * @param value
     */
    public void setScnReqEffDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(value);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex);
    }

    public void setScnReqEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqEffDt with another Field
     *
     * @param value
     */
    public void setScnReqEffDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += dclsrvcCdTransTbl.hashCode();
      str += dsmCallArea.hashCode();
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public InitializeOutCtx clone() {
      InitializeOutCtx cloneObj = new InitializeOutCtx();
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public InitializeOutCtx getInitializeOutCtx() {
    return new InitializeOutCtx();
  }

  public class GetSvcCdNbrInCtx implements Cloneable {
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    CacheTsqRecord cacheTsqRecord = D5427scnCtx.this.getCacheTsqRecord();
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

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
     * Returns the value of scnReqSrvcCd
     *
     * @return scnReqSrvcCd
     */
    public char[] getScnReqSrvcCd() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqSrvcCd();
    }

    /**
     * set variable scnReqSrvcCd
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(value);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source, sourceIndex);
    }

    public void setScnReqSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of svcaSrvcCdNbr
     *
     * @return svcaSrvcCdNbr
     */
    public char[] getSvcaSrvcCdNbr() throws CFException {
      return dclsrvcCdTransTbl.getSvcaSrvcCdNbr();
    }

    /**
     * set variable svcaSrvcCdNbr
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(value);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex);
    }

    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclsrvcCdTransTbl
     *
     * @return dclsrvcCdTransTbl
     */
    public DclsrvcCdTransTbl getDclsrvcCdTransTbl() {
      return dclsrvcCdTransTbl;
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
     * Returns the value of scnReqCancDt
     *
     * @return scnReqCancDt
     */
    public char[] getScnReqCancDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqCancDt();
    }

    /**
     * set variable scnReqCancDt
     *
     * @param value
     */
    public void setScnReqCancDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(value);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source, sourceIndex);
    }

    public void setScnReqCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqCancDt with another Field
     *
     * @param value
     */
    public void setScnReqCancDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of tsqCachePtr
     *
     * @return tsqCachePtr
     */
    public int getTsqCachePtr() throws CFException {
      return cacheTsqRecord.getTsqCachePtr();
    }

    /**
     * Update TsqCachePtr with the passed value
     *
     * @param number
     */
    public void setTsqCachePtr(int number) throws CFException {
      cacheTsqRecord.setTsqCachePtr(number);
    }

    public void setTsqCachePtr(long number) throws CFException {
      cacheTsqRecord.setTsqCachePtr((int) number);
    }

    /**
     * Returns the value of tsqItem1
     *
     * @return tsqItem1
     */
    public short getTsqItem1() throws CFException {
      return work.getTsqItem1();
    }

    /**
     * Update TsqItem1 with the passed value
     *
     * @param number
     */
    public void setTsqItem1(short number) throws CFException {
      work.setTsqItem1(number);
    }

    public void setTsqItem1(int number) throws CFException {
      work.setTsqItem1((short) number);
    }

    public void setTsqItem1(long number) throws CFException {
      work.setTsqItem1((short) number);
    }

    /**
     * Returns the value of cacheScnKeyArea
     *
     * @return cacheScnKeyArea
     */
    public CacheScnKeyArea getCacheScnKeyArea() {
      return cacheScnKeyArea;
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
     * Returns the value of cacheTsqRecord
     *
     * @return cacheTsqRecord
     */
    public CacheTsqRecord getCacheTsqRecord() {
      return cacheTsqRecord;
    }

    /**
     * Returns the value of tsQueueName
     *
     * @return tsQueueName
     */
    public char[] getTsQueueName() throws CFException {
      return work.getTsQueueName();
    }

    /**
     * set variable tsQueueName
     *
     * @param value
     */
    public void setTsQueueName(char[] value) throws CFException {
      work.setTsQueueName(value);
    }

    /**
     * Returns the value of scnReqEffDt
     *
     * @return scnReqEffDt
     */
    public char[] getScnReqEffDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqEffDt();
    }

    /**
     * set variable scnReqEffDt
     *
     * @param value
     */
    public void setScnReqEffDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(value);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex);
    }

    public void setScnReqEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqEffDt with another Field
     *
     * @param value
     */
    public void setScnReqEffDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    public GetSvcCdNbrOutCtx getGetSvcCdNbrOutCtx() {
      return new GetSvcCdNbrOutCtx();
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
      str += cacheTsqRecord.hashCode();
      str += dclsrvcCdTransTbl.hashCode();
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += csrchSearchKey.hashCode();
      str += scnDataArea.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public GetSvcCdNbrInCtx clone() {
      GetSvcCdNbrInCtx cloneObj = new GetSvcCdNbrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public GetSvcCdNbrInCtx getGetSvcCdNbrInCtx() {
    return new GetSvcCdNbrInCtx();
  }

  public class GetSvcCdNbrOutCtx implements Cloneable {
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    CacheTsqRecord cacheTsqRecord = D5427scnCtx.this.getCacheTsqRecord();
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

    /**
     * Returns the value of csrchSrvcCd
     *
     * @return csrchSrvcCd
     */
    public char[] getCsrchSrvcCd() throws CFException {
      return csrchSearchKey.getCsrchSrvcCd();
    }

    /**
     * set variable csrchSrvcCd
     *
     * @param value
     */
    public void setCsrchSrvcCd(char[] value) throws CFException {
      csrchSearchKey.setCsrchSrvcCd(value);
    }

    /**
     * Update CsrchSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCsrchSrvcCd(char[] source, int sourceIndex) throws CFException {
      csrchSearchKey.setCsrchSrvcCd(source, sourceIndex);
    }

    public void setCsrchSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      csrchSearchKey.setCsrchSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CsrchSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCsrchSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      csrchSearchKey.setCsrchSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CsrchSrvcCd with another Field
     *
     * @param value
     */
    public void setCsrchSrvcCd(Field source) {
      csrchSearchKey.setCsrchSrvcCd(source);
    }

    /**
     * Update CsrchSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCsrchSrvcCd(Field source, int sourceIndex, int sourceLen) {
      csrchSearchKey.setCsrchSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CsrchSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCsrchSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      csrchSearchKey.setCsrchSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnRetSrvcCdNbr
     *
     * @return scnRetSrvcCdNbr
     */
    public char[] getScnRetSrvcCdNbr() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnRetArea().getScnRetSrvcCdNbr();
    }

    /**
     * set variable scnRetSrvcCdNbr
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnRetArea().setScnRetSrvcCdNbr(value);
    }

    /**
     * Update ScnRetSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnRetArea().setScnRetSrvcCdNbr(source, sourceIndex);
    }

    public void setScnRetSrvcCdNbr(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnRetArea()
          .setScnRetSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnRetSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnRetArea()
          .setScnRetSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnRetSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(Field source) {
      scnDataArea.getScnReqRetArea().getScnRetArea().setScnRetSrvcCdNbr(source);
    }

    /**
     * Update ScnRetSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnRetArea()
          .setScnRetSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnRetSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnRetSrvcCdNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnRetArea()
          .setScnRetSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of scnReqSrvcCd
     *
     * @return scnReqSrvcCd
     */
    public char[] getScnReqSrvcCd() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqSrvcCd();
    }

    /**
     * set variable scnReqSrvcCd
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(value);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source, sourceIndex);
    }

    public void setScnReqSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqSrvcCd(source);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of svcaCancDt
     *
     * @return svcaCancDt
     */
    public char[] getSvcaCancDt() throws CFException {
      return dclsrvcCdTransTbl.getSvcaCancDt();
    }

    /**
     * set variable svcaCancDt
     *
     * @param value
     */
    public void setSvcaCancDt(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(value);
    }

    /**
     * Update SvcaCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex);
    }

    public void setSvcaCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaCancDt with another Field
     *
     * @param value
     */
    public void setSvcaCancDt(Field source) {
      dclsrvcCdTransTbl.setSvcaCancDt(source);
    }

    /**
     * Update SvcaCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheScnKeyArea
     *
     * @return cacheScnKeyArea
     */
    public CacheScnKeyArea getCacheScnKeyArea() {
      return cacheScnKeyArea;
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
     * Returns the value of resp2Code
     *
     * @return resp2Code
     */
    public int getResp2Code() throws CFException {
      return work.getResp2Code();
    }

    /**
     * Update Resp2Code with the passed value
     *
     * @param number
     */
    public void setResp2Code(int number) throws CFException {
      work.setResp2Code(number);
    }

    public void setResp2Code(long number) throws CFException {
      work.setResp2Code((int) number);
    }

    /**
     * Returns the value of scnReqEffDt
     *
     * @return scnReqEffDt
     */
    public char[] getScnReqEffDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqEffDt();
    }

    /**
     * set variable scnReqEffDt
     *
     * @param value
     */
    public void setScnReqEffDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(value);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex);
    }

    public void setScnReqEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqEffDt with another Field
     *
     * @param value
     */
    public void setScnReqEffDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of respCode
     *
     * @return respCode
     */
    public int getRespCode() throws CFException {
      return work.getRespCode();
    }

    /**
     * Update RespCode with the passed value
     *
     * @param number
     */
    public void setRespCode(int number) throws CFException {
      work.setRespCode(number);
    }

    public void setRespCode(long number) throws CFException {
      work.setRespCode((int) number);
    }

    /**
     * Returns the value of svcaSrvcCdNbr
     *
     * @return svcaSrvcCdNbr
     */
    public char[] getSvcaSrvcCdNbr() throws CFException {
      return dclsrvcCdTransTbl.getSvcaSrvcCdNbr();
    }

    /**
     * set variable svcaSrvcCdNbr
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(value);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex);
    }

    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclsrvcCdTransTbl
     *
     * @return dclsrvcCdTransTbl
     */
    public DclsrvcCdTransTbl getDclsrvcCdTransTbl() {
      return dclsrvcCdTransTbl;
    }

    /**
     * Returns the value of svcaEffDt
     *
     * @return svcaEffDt
     */
    public char[] getSvcaEffDt() throws CFException {
      return dclsrvcCdTransTbl.getSvcaEffDt();
    }

    /**
     * set variable svcaEffDt
     *
     * @param value
     */
    public void setSvcaEffDt(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(value);
    }

    /**
     * Update SvcaEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex);
    }

    public void setSvcaEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaEffDt with another Field
     *
     * @param value
     */
    public void setSvcaEffDt(Field source) {
      dclsrvcCdTransTbl.setSvcaEffDt(source);
    }

    /**
     * Update SvcaEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of scnReqCancDt
     *
     * @return scnReqCancDt
     */
    public char[] getScnReqCancDt() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqCancDt();
    }

    /**
     * set variable scnReqCancDt
     *
     * @param value
     */
    public void setScnReqCancDt(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(value);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source, sourceIndex);
    }

    public void setScnReqCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqCancDt with another Field
     *
     * @param value
     */
    public void setScnReqCancDt(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqCancDt(source);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of svcaSrvcCd
     *
     * @return svcaSrvcCd
     */
    public char[] getSvcaSrvcCd() throws CFException {
      return dclsrvcCdTransTbl.getSvcaSrvcCd();
    }

    /**
     * set variable svcaSrvcCd
     *
     * @param value
     */
    public void setSvcaSrvcCd(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCd(value);
    }

    /**
     * Update SvcaSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCd(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source, sourceIndex);
    }

    public void setSvcaSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaSrvcCd with another Field
     *
     * @param value
     */
    public void setSvcaSrvcCd(Field source) {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source);
    }

    /**
     * Update SvcaSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCd(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    /**
     * Test condition 100 -305 for isSqlcodeNotFound()
     *
     * @return Returns true if isSqlcodeNotFound() is 100 -305
     */
    public boolean isSqlcodeNotFound() throws CFException {
      return work.isSqlcodeNotFound();
    }

    /** set values 100 -305 */
    public void setSqlcodeNotFoundTrue() throws CFException {
      work.setSqlcodeNotFoundTrue();
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
     * Test condition "?" for isCsrchFoundSwIsOverflow()
     *
     * @return Returns true if isCsrchFoundSwIsOverflow() is "?"
     */
    public boolean isCsrchFoundSwIsOverflow() throws CFException {
      return work.isCsrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCsrchFoundSwIsOverflowTrue() throws CFException {
      work.setCsrchFoundSwIsOverflowTrue();
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += cacheTsqRecord.hashCode();
      str += dclsrvcCdTransTbl.hashCode();
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += csrchSearchKey.hashCode();
      str += scnDataArea.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public GetSvcCdNbrOutCtx clone() {
      GetSvcCdNbrOutCtx cloneObj = new GetSvcCdNbrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public GetSvcCdNbrOutCtx getGetSvcCdNbrOutCtx() {
    return new GetSvcCdNbrOutCtx();
  }

  public class ProcessCacheInCtx implements Cloneable {
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    Work work = D5427scnCtx.this.getWork();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

    public void setCacheKeyNdx(int cacheKeyNdx) {
      D5427scnCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return D5427scnCtx.this.cacheKeyNdx;
    }
    /**
     * Returns the value of cacheEffDt
     *
     * @return cacheEffDt
     */
    public char[] getCacheEffDt(int index) throws CFException {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheEffDt();
    }

    /**
     * set variable cacheEffDt
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheEffDt(value);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheEffDt(source, sourceIndex);
    }

    public void setCacheEffDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheEffDt with another Field
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheEffDt(source);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isBinsrchFoundIsY()
     *
     * @return Returns true if isBinsrchFoundIsY() is "Y"
     */
    public boolean isBinsrchFoundIsY() throws CFException {
      return work.isBinsrchFoundIsY();
    }

    /** set values "Y" */
    public void setBinsrchFoundIsYTrue() throws CFException {
      work.setBinsrchFoundIsYTrue();
    }
    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of svcaEffDt
     *
     * @return svcaEffDt
     */
    public char[] getSvcaEffDt() throws CFException {
      return dclsrvcCdTransTbl.getSvcaEffDt();
    }

    /**
     * set variable svcaEffDt
     *
     * @param value
     */
    public void setSvcaEffDt(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(value);
    }

    /**
     * Update SvcaEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex);
    }

    public void setSvcaEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaEffDt with another Field
     *
     * @param value
     */
    public void setSvcaEffDt(Field source) {
      dclsrvcCdTransTbl.setSvcaEffDt(source);
    }

    /**
     * Update SvcaEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of csrchSearchKey
     *
     * @return csrchSearchKey
     */
    public CsrchSearchKey getCsrchSearchKey() {
      return csrchSearchKey;
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheScnKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Returns the value of cacheSrvcCdNbr
     *
     * @return cacheSrvcCdNbr
     */
    public char[] getCacheSrvcCdNbr(int index) throws CFException {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheSrvcCdNbr();
    }

    /**
     * set variable cacheSrvcCdNbr
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(value);
    }

    /**
     * Update CacheSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, char[] source, int sourceIndex) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex);
    }

    public void setCacheSrvcCdNbr(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source);
    }

    /**
     * Update CacheSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "N" for isBinsrchFoundIsN()
     *
     * @return Returns true if isBinsrchFoundIsN() is "N"
     */
    public boolean isBinsrchFoundIsN() throws CFException {
      return work.isBinsrchFoundIsN();
    }

    /** set values "N" */
    public void setBinsrchFoundIsNTrue() throws CFException {
      work.setBinsrchFoundIsNTrue();
    }
    /**
     * Returns the value of svcaCancDt
     *
     * @return svcaCancDt
     */
    public char[] getSvcaCancDt() throws CFException {
      return dclsrvcCdTransTbl.getSvcaCancDt();
    }

    /**
     * set variable svcaCancDt
     *
     * @param value
     */
    public void setSvcaCancDt(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(value);
    }

    /**
     * Update SvcaCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex);
    }

    public void setSvcaCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaCancDt with another Field
     *
     * @param value
     */
    public void setSvcaCancDt(Field source) {
      dclsrvcCdTransTbl.setSvcaCancDt(source);
    }

    /**
     * Update SvcaCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyArrayMax
     *
     * @return cacheKeyArrayMax
     */
    public int getCacheKeyArrayMax() throws CFException {
      return cacheScnKeyArea.getCacheKeyFixedArea().getCacheKeyArrayMax();
    }

    /**
     * Update CacheKeyArrayMax with the passed value
     *
     * @param number
     */
    public void setCacheKeyArrayMax(int number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyArrayMax(number);
    }

    public void setCacheKeyArrayMax(long number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyArrayMax((int) number);
    }

    /**
     * Returns the value of cacheCancDt
     *
     * @return cacheCancDt
     */
    public char[] getCacheCancDt(int index) throws CFException {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheCancDt();
    }

    /**
     * set variable cacheCancDt
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheCancDt(value);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheCancDt(source, sourceIndex);
    }

    public void setCacheCancDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheCancDt with another Field
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheCancDt(source);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    public ProcessCacheOutCtx getProcessCacheOutCtx() {
      return new ProcessCacheOutCtx();
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
      str += dclsrvcCdTransTbl.hashCode();
      str += work.hashCode();
      str += csrchSearchKey.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public ProcessCacheInCtx clone() {
      ProcessCacheInCtx cloneObj = new ProcessCacheInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheInCtx getProcessCacheInCtx() {
    return new ProcessCacheInCtx();
  }

  public class ProcessCacheOutCtx implements Cloneable {
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    DclsrvcCdTransTbl dclsrvcCdTransTbl = D5427scnCtx.this.getDclsrvcCdTransTbl();
    Work work = D5427scnCtx.this.getWork();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

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
     * Returns the value of svcaSrvcCdNbr
     *
     * @return svcaSrvcCdNbr
     */
    public char[] getSvcaSrvcCdNbr() throws CFException {
      return dclsrvcCdTransTbl.getSvcaSrvcCdNbr();
    }

    /**
     * set variable svcaSrvcCdNbr
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] value) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(value);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex);
    }

    public void setSvcaSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update SvcaSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setSvcaSrvcCdNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcCdTransTbl.setSvcaSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCsrchFoundSwIsYes()
     *
     * @return Returns true if isCsrchFoundSwIsYes() is "Y"
     */
    public boolean isCsrchFoundSwIsYes() throws CFException {
      return work.isCsrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCsrchFoundSwIsYesTrue() throws CFException {
      work.setCsrchFoundSwIsYesTrue();
    }
    /**
     * Test condition "?" for isCsrchFoundSwIsOverflow()
     *
     * @return Returns true if isCsrchFoundSwIsOverflow() is "?"
     */
    public boolean isCsrchFoundSwIsOverflow() throws CFException {
      return work.isCsrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCsrchFoundSwIsOverflowTrue() throws CFException {
      work.setCsrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of cacheSrvcCdNbr
     *
     * @return cacheSrvcCdNbr
     */
    public char[] getCacheSrvcCdNbr(int index) throws CFException {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheSrvcCdNbr();
    }

    /**
     * set variable cacheSrvcCdNbr
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(value);
    }

    /**
     * Update CacheSrvcCdNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, char[] source, int sourceIndex) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex);
    }

    public void setCacheSrvcCdNbr(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCdNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheSrvcCdNbr with another Field
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source);
    }

    /**
     * Update CacheSrvcCdNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheSrvcCdNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCdNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCdNbr(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheSrvcCdNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "N" for isCsrchFoundSwIsNo()
     *
     * @return Returns true if isCsrchFoundSwIsNo() is "N"
     */
    public boolean isCsrchFoundSwIsNo() throws CFException {
      return work.isCsrchFoundSwIsNo();
    }

    /** set values "N" */
    public void setCsrchFoundSwIsNoTrue() throws CFException {
      work.setCsrchFoundSwIsNoTrue();
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += dclsrvcCdTransTbl.hashCode();
      str += work.hashCode();
      str += csrchSearchKey.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public ProcessCacheOutCtx clone() {
      ProcessCacheOutCtx cloneObj = new ProcessCacheOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.dclsrvcCdTransTbl = new DclsrvcCdTransTbl();
      cloneObj.dclsrvcCdTransTbl.set(dclsrvcCdTransTbl.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheOutCtx getProcessCacheOutCtx() {
    return new ProcessCacheOutCtx();
  }

  public class SearchCacheInCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

    /**
     * Returns the value of binsrchHigh
     *
     * @return binsrchHigh
     */
    public int getBinsrchHigh() throws CFException {
      return work.getBinsrchHigh();
    }

    /**
     * Update BinsrchHigh with the passed value
     *
     * @param number
     */
    public void setBinsrchHigh(int number) throws CFException {
      work.setBinsrchHigh(number);
    }

    public void setBinsrchHigh(long number) throws CFException {
      work.setBinsrchHigh((int) number);
    }

    /**
     * Returns the value of binsrchLow
     *
     * @return binsrchLow
     */
    public int getBinsrchLow() throws CFException {
      return work.getBinsrchLow();
    }

    /**
     * Update BinsrchLow with the passed value
     *
     * @param number
     */
    public void setBinsrchLow(int number) throws CFException {
      work.setBinsrchLow(number);
    }

    public void setBinsrchLow(long number) throws CFException {
      work.setBinsrchLow((int) number);
    }

    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheScnKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheScnKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheScnKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of csrchSearchKey
     *
     * @return csrchSearchKey
     */
    public CsrchSearchKey getCsrchSearchKey() {
      return csrchSearchKey;
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheScnKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    public SearchCacheOutCtx getSearchCacheOutCtx() {
      return new SearchCacheOutCtx();
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
      str += csrchSearchKey.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public SearchCacheInCtx clone() {
      SearchCacheInCtx cloneObj = new SearchCacheInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheInCtx getSearchCacheInCtx() {
    return new SearchCacheInCtx();
  }

  public class SearchCacheOutCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    CsrchSearchKey csrchSearchKey = D5427scnCtx.this.getCsrchSearchKey();
    CacheScnKeyArea cacheScnKeyArea = D5427scnCtx.this.getCacheScnKeyArea();

    public void setCacheKeyNdx(int cacheKeyNdx) {
      D5427scnCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return D5427scnCtx.this.cacheKeyNdx;
    }
    /**
     * Returns the value of binsrchHigh
     *
     * @return binsrchHigh
     */
    public int getBinsrchHigh() throws CFException {
      return work.getBinsrchHigh();
    }

    /**
     * Update BinsrchHigh with the passed value
     *
     * @param number
     */
    public void setBinsrchHigh(int number) throws CFException {
      work.setBinsrchHigh(number);
    }

    public void setBinsrchHigh(long number) throws CFException {
      work.setBinsrchHigh((int) number);
    }

    /**
     * Returns the value of binsrchLow
     *
     * @return binsrchLow
     */
    public int getBinsrchLow() throws CFException {
      return work.getBinsrchLow();
    }

    /**
     * Update BinsrchLow with the passed value
     *
     * @param number
     */
    public void setBinsrchLow(int number) throws CFException {
      work.setBinsrchLow(number);
    }

    public void setBinsrchLow(long number) throws CFException {
      work.setBinsrchLow((int) number);
    }

    /**
     * Returns the value of binsrchFound
     *
     * @return binsrchFound
     */
    public char[] getBinsrchFound() throws CFException {
      return work.getBinsrchFound();
    }

    /**
     * set variable binsrchFound
     *
     * @param value
     */
    public void setBinsrchFound(char[] value) throws CFException {
      work.setBinsrchFound(value);
    }

    /**
     * Returns the value of binsrchMid
     *
     * @return binsrchMid
     */
    public int getBinsrchMid() throws CFException {
      return work.getBinsrchMid();
    }

    /**
     * Update BinsrchMid with the passed value
     *
     * @param number
     */
    public void setBinsrchMid(int number) throws CFException {
      work.setBinsrchMid(number);
    }

    public void setBinsrchMid(long number) throws CFException {
      work.setBinsrchMid((int) number);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheScnKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheScnKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Test condition "N" for isBinsrchFoundIsN()
     *
     * @return Returns true if isBinsrchFoundIsN() is "N"
     */
    public boolean isBinsrchFoundIsN() throws CFException {
      return work.isBinsrchFoundIsN();
    }

    /** set values "N" */
    public void setBinsrchFoundIsNTrue() throws CFException {
      work.setBinsrchFoundIsNTrue();
    }

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += csrchSearchKey.hashCode();
      str += cacheScnKeyArea.hashCode();
      return str.hashCode();
    }

    public SearchCacheOutCtx clone() {
      SearchCacheOutCtx cloneObj = new SearchCacheOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.csrchSearchKey = new CsrchSearchKey();
      cloneObj.csrchSearchKey.set(csrchSearchKey.getClonedField());
      cloneObj.cacheScnKeyArea = new CacheScnKeyArea();
      cloneObj.cacheScnKeyArea.set(cacheScnKeyArea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheOutCtx getSearchCacheOutCtx() {
    return new SearchCacheOutCtx();
  }

  public class ErrorProcessInCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

    /**
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
    }

    public ErrorProcessOutCtx getErrorProcessOutCtx() {
      return new ErrorProcessOutCtx();
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
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public ErrorProcessInCtx clone() {
      ErrorProcessInCtx cloneObj = new ErrorProcessInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ErrorProcessInCtx getErrorProcessInCtx() {
    return new ErrorProcessInCtx();
  }

  public class ErrorProcessOutCtx implements Cloneable {
    Work work = D5427scnCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();
    ScnDataArea scnDataArea = D5427scnCtx.this.getScnDataArea();

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
     * Returns the value of scnReqClngProg
     *
     * @return scnReqClngProg
     */
    public char[] getScnReqClngProg() throws CFException {
      return scnDataArea.getScnReqRetArea().getScnReqArea().getScnReqClngProg();
    }

    /**
     * set variable scnReqClngProg
     *
     * @param value
     */
    public void setScnReqClngProg(char[] value) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(value);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(char[] source, int sourceIndex) throws CFException {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source, sourceIndex);
    }

    public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update ScnReqClngProg with another Field
     *
     * @param value
     */
    public void setScnReqClngProg(Field source) {
      scnDataArea.getScnReqRetArea().getScnReqArea().setScnReqClngProg(source);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update ScnReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setScnReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      scnDataArea
          .getScnReqRetArea()
          .getScnReqArea()
          .setScnReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
      str += scnDataArea.hashCode();
      return str.hashCode();
    }

    public ErrorProcessOutCtx clone() {
      ErrorProcessOutCtx cloneObj = new ErrorProcessOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.scnDataArea = new ScnDataArea();
      cloneObj.scnDataArea.set(scnDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ErrorProcessOutCtx getErrorProcessOutCtx() {
    return new ErrorProcessOutCtx();
  }

  public class SqlErrorProcessInCtx implements Cloneable {
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();

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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
    Sqlca sqlca = D5427scnCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427scnCtx.this.getDsmCallArea();

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

    public D5427scnCtx getD5427scnCtx() {
      return D5427scnCtx.this;
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
