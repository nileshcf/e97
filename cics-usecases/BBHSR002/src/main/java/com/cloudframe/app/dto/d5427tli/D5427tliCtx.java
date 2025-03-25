package com.cloudframe.app.dto.d5427tli;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.exception.CFException;
import java.sql.ResultSet;

@Context
public class D5427tliCtx implements ProgramContext, Cloneable {
  GlobalExecutorCtx globalCtx;

  Sqlca sqlca;
  Work work;
  DsmCallArea dsmCallArea;
  TliDsmArea tliDsmArea;
  DclsrvcAsgn dclsrvcAsgn;

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

  ResultSet polPlanCsrResultSet;

  public ResultSet getPolPlanCsrResultSet() {
    return this.polPlanCsrResultSet;
  }

  public void setPolPlanCsrResultSet(ResultSet polPlanCsrResultSet) {
    this.polPlanCsrResultSet = polPlanCsrResultSet;
  }

  ResultSet saOiCsrResultSet;

  public ResultSet getSaOiCsrResultSet() {
    return this.saOiCsrResultSet;
  }

  public void setSaOiCsrResultSet(ResultSet saOiCsrResultSet) {
    this.saOiCsrResultSet = saOiCsrResultSet;
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

  public TliDsmArea getTliDsmArea() {
    if (tliDsmArea == null) {
      tliDsmArea = new TliDsmArea();
    }

    return tliDsmArea;
  }

  public void setTliDsmArea(TliDsmArea tliDsmArea) {
    this.tliDsmArea = tliDsmArea;
  }

  public DclsrvcAsgn getDclsrvcAsgn() {
    if (dclsrvcAsgn == null) {
      dclsrvcAsgn = new DclsrvcAsgn();
    }

    return dclsrvcAsgn;
  }

  public void setDclsrvcAsgn(DclsrvcAsgn dclsrvcAsgn) {
    this.dclsrvcAsgn = dclsrvcAsgn;
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
    str += work.hashCode();
    str += dsmCallArea.hashCode();
    str += tliDsmArea.hashCode();
    str += dclsrvcAsgn.hashCode();
    return str.hashCode();
  }

  public D5427tliCtx clone() {
    D5427tliCtx cloneObj = new D5427tliCtx();
    cloneObj.sqlca = new Sqlca();
    cloneObj.sqlca.set(sqlca.getClonedField());
    cloneObj.work = new Work();
    cloneObj.work.set(work.getClonedField());
    cloneObj.dsmCallArea = new DsmCallArea();
    cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
    cloneObj.tliDsmArea = new TliDsmArea();
    cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
    cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
    cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
    return cloneObj;
  }

  /** Program method contexts */
  public class ProcessInCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public ProcessInCtx clone() {
      ProcessInCtx cloneObj = new ProcessInCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessInCtx getProcessInCtx() {
    return new ProcessInCtx();
  }

  public class MainlineInCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

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
     * Returns the value of tliReqClngProg
     *
     * @return tliReqClngProg
     */
    public char[] getTliReqClngProg() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqClngProg();
    }

    /**
     * set variable tliReqClngProg
     *
     * @param value
     */
    public void setTliReqClngProg(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(value);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex);
    }

    public void setTliReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqClngProg with another Field
     *
     * @param value
     */
    public void setTliReqClngProg(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public MainlineOutCtx getMainlineOutCtx() {
      return new MainlineOutCtx();
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public MainlineInCtx clone() {
      MainlineInCtx cloneObj = new MainlineInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public MainlineInCtx getMainlineInCtx() {
    return new MainlineInCtx();
  }

  public class MainlineOutCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

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
     * Returns the value of tliReqClngProg
     *
     * @return tliReqClngProg
     */
    public char[] getTliReqClngProg() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqClngProg();
    }

    /**
     * set variable tliReqClngProg
     *
     * @param value
     */
    public void setTliReqClngProg(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(value);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex);
    }

    public void setTliReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqClngProg with another Field
     *
     * @param value
     */
    public void setTliReqClngProg(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public MainlineOutCtx clone() {
      MainlineOutCtx cloneObj = new MainlineOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public MainlineOutCtx getMainlineOutCtx() {
    return new MainlineOutCtx();
  }

  public class InitializeOutCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Test condition "N" for isTliTableNotFound()
     *
     * @return Returns true if isTliTableNotFound() is "N"
     */
    public boolean isTliTableNotFound() throws CFException {
      return work.isTliTableNotFound();
    }

    /** set values "N" */
    public void setTliTableNotFoundTrue() throws CFException {
      work.setTliTableNotFoundTrue();
    }
    /**
     * Returns the value of tliRetArea
     *
     * @return tliRetArea
     */
    public TliRetArea getTliRetArea() {
      return tliDsmArea.getTliDataArea().getTliRetArea();
    }

    /**
     * Update TliRetArea with the passed value
     *
     * @param value
     */
    public void setTliRetArea(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().setTliRetArea(value);
    }

    /**
     * Update TliRetArea with a String from an offset and length
     *
     * @param value
     */
    public void setTliRetArea(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().setTliRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetArea(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .setTliRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliRetArea with another Field
     *
     * @param value
     */
    public void setTliRetArea(Field source) {
      tliDsmArea.getTliDataArea().setTliRetArea(source);
    }

    /**
     * Update TliRetArea with another Field from an offset and length
     *
     * @param value
     */
    public void setTliRetArea(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().setTliRetArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetArea(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .setTliRetArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public InitializeOutCtx clone() {
      InitializeOutCtx cloneObj = new InitializeOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public InitializeOutCtx getInitializeOutCtx() {
    return new InitializeOutCtx();
  }

  public class RequestFieldValidationInCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

    /**
     * Returns the value of tliReqShrArngCd
     *
     * @return tliReqShrArngCd
     */
    public char[] getTliReqShrArngCd() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqShrArngCd();
    }

    /**
     * set variable tliReqShrArngCd
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(value);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source, sourceIndex);
    }

    public void setTliReqShrArngCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqShrArngCd with another Field
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPolNbr
     *
     * @return tliReqPolNbr
     */
    public char[] getTliReqPolNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPolNbr();
    }

    /**
     * set variable tliReqPolNbr
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(value);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex);
    }

    public void setTliReqPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPolNbr with another Field
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of tliReqStartDt
     *
     * @return tliReqStartDt
     */
    public char[] getTliReqStartDt() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqStartDt();
    }

    /**
     * set variable tliReqStartDt
     *
     * @param value
     */
    public void setTliReqStartDt(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(value);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex);
    }

    public void setTliReqStartDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqStartDt with another Field
     *
     * @param value
     */
    public void setTliReqStartDt(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPlnNbr
     *
     * @return tliReqPlnNbr
     */
    public char[] getTliReqPlnNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPlnNbr();
    }

    /**
     * set variable tliReqPlnNbr
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(value);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex);
    }

    public void setTliReqPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPlnNbr with another Field
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqObligId
     *
     * @return tliReqObligId
     */
    public char[] getTliReqObligId() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqObligId();
    }

    /**
     * set variable tliReqObligId
     *
     * @param value
     */
    public void setTliReqObligId(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(value);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex);
    }

    public void setTliReqObligId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqObligId with another Field
     *
     * @param value
     */
    public void setTliReqObligId(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public RequestFieldValidationInCtx clone() {
      RequestFieldValidationInCtx cloneObj = new RequestFieldValidationInCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public RequestFieldValidationInCtx getRequestFieldValidationInCtx() {
    return new RequestFieldValidationInCtx();
  }

  public class RequestFieldValidationOutCtx implements Cloneable {
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

    /**
     * Returns the value of tliReqShrArngCd
     *
     * @return tliReqShrArngCd
     */
    public char[] getTliReqShrArngCd() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqShrArngCd();
    }

    /**
     * set variable tliReqShrArngCd
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(value);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source, sourceIndex);
    }

    public void setTliReqShrArngCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqShrArngCd with another Field
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPolNbr
     *
     * @return tliReqPolNbr
     */
    public char[] getTliReqPolNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPolNbr();
    }

    /**
     * set variable tliReqPolNbr
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(value);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex);
    }

    public void setTliReqPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPolNbr with another Field
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of tliReqStartDt
     *
     * @return tliReqStartDt
     */
    public char[] getTliReqStartDt() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqStartDt();
    }

    /**
     * set variable tliReqStartDt
     *
     * @param value
     */
    public void setTliReqStartDt(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(value);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex);
    }

    public void setTliReqStartDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqStartDt with another Field
     *
     * @param value
     */
    public void setTliReqStartDt(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of tliReqPlnNbr
     *
     * @return tliReqPlnNbr
     */
    public char[] getTliReqPlnNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPlnNbr();
    }

    /**
     * set variable tliReqPlnNbr
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(value);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex);
    }

    public void setTliReqPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPlnNbr with another Field
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public RequestFieldValidationOutCtx clone() {
      RequestFieldValidationOutCtx cloneObj = new RequestFieldValidationOutCtx();
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public RequestFieldValidationOutCtx getRequestFieldValidationOutCtx() {
    return new RequestFieldValidationOutCtx();
  }

  public class MoveReqToDclgenInCtx implements Cloneable {
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of tliReqShrArngCd
     *
     * @return tliReqShrArngCd
     */
    public char[] getTliReqShrArngCd() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqShrArngCd();
    }

    /**
     * set variable tliReqShrArngCd
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(value);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source, sourceIndex);
    }

    public void setTliReqShrArngCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqShrArngCd with another Field
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPolNbr
     *
     * @return tliReqPolNbr
     */
    public char[] getTliReqPolNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPolNbr();
    }

    /**
     * set variable tliReqPolNbr
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(value);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex);
    }

    public void setTliReqPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPolNbr with another Field
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqStartDt
     *
     * @return tliReqStartDt
     */
    public char[] getTliReqStartDt() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqStartDt();
    }

    /**
     * set variable tliReqStartDt
     *
     * @param value
     */
    public void setTliReqStartDt(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(value);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex);
    }

    public void setTliReqStartDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqStartDt with another Field
     *
     * @param value
     */
    public void setTliReqStartDt(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPlnNbr
     *
     * @return tliReqPlnNbr
     */
    public char[] getTliReqPlnNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPlnNbr();
    }

    /**
     * set variable tliReqPlnNbr
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(value);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex);
    }

    public void setTliReqPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPlnNbr with another Field
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqObligId
     *
     * @return tliReqObligId
     */
    public char[] getTliReqObligId() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqObligId();
    }

    /**
     * set variable tliReqObligId
     *
     * @param value
     */
    public void setTliReqObligId(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(value);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex);
    }

    public void setTliReqObligId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqObligId with another Field
     *
     * @param value
     */
    public void setTliReqObligId(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public MoveReqToDclgenOutCtx getMoveReqToDclgenOutCtx() {
      return new MoveReqToDclgenOutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public MoveReqToDclgenInCtx clone() {
      MoveReqToDclgenInCtx cloneObj = new MoveReqToDclgenInCtx();
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public MoveReqToDclgenInCtx getMoveReqToDclgenInCtx() {
    return new MoveReqToDclgenInCtx();
  }

  public class MoveReqToDclgenOutCtx implements Cloneable {
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of hdrCancDt
     *
     * @return hdrCancDt
     */
    public char[] getHdrCancDt() throws CFException {
      return dclsrvcAsgn.getHdrCancDt();
    }

    /**
     * set variable hdrCancDt
     *
     * @param value
     */
    public void setHdrCancDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrCancDt(value);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex);
    }

    public void setHdrCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrCancDt with another Field
     *
     * @param value
     */
    public void setHdrCancDt(Field source) {
      dclsrvcAsgn.setHdrCancDt(source);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqShrArngCd
     *
     * @return tliReqShrArngCd
     */
    public char[] getTliReqShrArngCd() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqShrArngCd();
    }

    /**
     * set variable tliReqShrArngCd
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(value);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source, sourceIndex);
    }

    public void setTliReqShrArngCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqShrArngCd with another Field
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqShrArngCd(source);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPolNbr
     *
     * @return tliReqPolNbr
     */
    public char[] getTliReqPolNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPolNbr();
    }

    /**
     * set variable tliReqPolNbr
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(value);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex);
    }

    public void setTliReqPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPolNbr with another Field
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrPolNbr
     *
     * @return hdrPolNbr
     */
    public char[] getHdrPolNbr() throws CFException {
      return dclsrvcAsgn.getHdrPolNbr();
    }

    /**
     * set variable hdrPolNbr
     *
     * @param value
     */
    public void setHdrPolNbr(char[] value) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(value);
    }

    /**
     * Update HdrPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex);
    }

    public void setHdrPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrPolNbr with another Field
     *
     * @param value
     */
    public void setHdrPolNbr(Field source) {
      dclsrvcAsgn.setHdrPolNbr(source);
    }

    /**
     * Update HdrPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrPlnNbr
     *
     * @return hdrPlnNbr
     */
    public char[] getHdrPlnNbr() throws CFException {
      return dclsrvcAsgn.getHdrPlnNbr();
    }

    /**
     * set variable hdrPlnNbr
     *
     * @param value
     */
    public void setHdrPlnNbr(char[] value) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(value);
    }

    /**
     * Update HdrPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex);
    }

    public void setHdrPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrPlnNbr with another Field
     *
     * @param value
     */
    public void setHdrPlnNbr(Field source) {
      dclsrvcAsgn.setHdrPlnNbr(source);
    }

    /**
     * Update HdrPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqStartDt
     *
     * @return tliReqStartDt
     */
    public char[] getTliReqStartDt() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqStartDt();
    }

    /**
     * set variable tliReqStartDt
     *
     * @param value
     */
    public void setTliReqStartDt(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(value);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex);
    }

    public void setTliReqStartDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqStartDt with another Field
     *
     * @param value
     */
    public void setTliReqStartDt(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqStartDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqStartDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqStartDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqPlnNbr
     *
     * @return tliReqPlnNbr
     */
    public char[] getTliReqPlnNbr() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqPlnNbr();
    }

    /**
     * set variable tliReqPlnNbr
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(value);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex);
    }

    public void setTliReqPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqPlnNbr with another Field
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrObligId
     *
     * @return hdrObligId
     */
    public char[] getHdrObligId() throws CFException {
      return dclsrvcAsgn.getHdrObligId();
    }

    /**
     * set variable hdrObligId
     *
     * @param value
     */
    public void setHdrObligId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrObligId(value);
    }

    /**
     * Update HdrObligId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrObligId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex);
    }

    public void setHdrObligId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrObligId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrObligId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrObligId with another Field
     *
     * @param value
     */
    public void setHdrObligId(Field source) {
      dclsrvcAsgn.setHdrObligId(source);
    }

    /**
     * Update HdrObligId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrObligId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrObligId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrObligId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrShrArngCd
     *
     * @return hdrShrArngCd
     */
    public char[] getHdrShrArngCd() throws CFException {
      return dclsrvcAsgn.getHdrShrArngCd();
    }

    /**
     * set variable hdrShrArngCd
     *
     * @param value
     */
    public void setHdrShrArngCd(char[] value) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(value);
    }

    /**
     * Update HdrShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex);
    }

    public void setHdrShrArngCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrShrArngCd with another Field
     *
     * @param value
     */
    public void setHdrShrArngCd(Field source) {
      dclsrvcAsgn.setHdrShrArngCd(source);
    }

    /**
     * Update HdrShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of tliReqObligId
     *
     * @return tliReqObligId
     */
    public char[] getTliReqObligId() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqObligId();
    }

    /**
     * set variable tliReqObligId
     *
     * @param value
     */
    public void setTliReqObligId(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(value);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex);
    }

    public void setTliReqObligId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqObligId with another Field
     *
     * @param value
     */
    public void setTliReqObligId(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqObligId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqObligId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrProcDt
     *
     * @return hdrProcDt
     */
    public char[] getHdrProcDt() throws CFException {
      return dclsrvcAsgn.getHdrProcDt();
    }

    /**
     * set variable hdrProcDt
     *
     * @param value
     */
    public void setHdrProcDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrProcDt(value);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex);
    }

    public void setHdrProcDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrProcDt with another Field
     *
     * @param value
     */
    public void setHdrProcDt(Field source) {
      dclsrvcAsgn.setHdrProcDt(source);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public MoveReqToDclgenOutCtx clone() {
      MoveReqToDclgenOutCtx cloneObj = new MoveReqToDclgenOutCtx();
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public MoveReqToDclgenOutCtx getMoveReqToDclgenOutCtx() {
    return new MoveReqToDclgenOutCtx();
  }

  public class ProcessPolPlanTliInCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();

    /**
     * Test condition "N" for isTliTableNotFound()
     *
     * @return Returns true if isTliTableNotFound() is "N"
     */
    public boolean isTliTableNotFound() throws CFException {
      return work.isTliTableNotFound();
    }

    /** set values "N" */
    public void setTliTableNotFoundTrue() throws CFException {
      work.setTliTableNotFoundTrue();
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
     * Test condition "Y" for isTliTableFound()
     *
     * @return Returns true if isTliTableFound() is "Y"
     */
    public boolean isTliTableFound() throws CFException {
      return work.isTliTableFound();
    }

    /** set values "Y" */
    public void setTliTableFoundTrue() throws CFException {
      work.setTliTableFoundTrue();
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public ProcessPolPlanTliOutCtx getProcessPolPlanTliOutCtx() {
      return new ProcessPolPlanTliOutCtx();
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
      return str.hashCode();
    }

    public ProcessPolPlanTliInCtx clone() {
      ProcessPolPlanTliInCtx cloneObj = new ProcessPolPlanTliInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessPolPlanTliInCtx getProcessPolPlanTliInCtx() {
    return new ProcessPolPlanTliInCtx();
  }

  public class ProcessPolPlanTliOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      return str.hashCode();
    }

    public ProcessPolPlanTliOutCtx clone() {
      ProcessPolPlanTliOutCtx cloneObj = new ProcessPolPlanTliOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessPolPlanTliOutCtx getProcessPolPlanTliOutCtx() {
    return new ProcessPolPlanTliOutCtx();
  }

  public class OpenPolPlanCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of hdrCancDt
     *
     * @return hdrCancDt
     */
    public char[] getHdrCancDt() throws CFException {
      return dclsrvcAsgn.getHdrCancDt();
    }

    /**
     * set variable hdrCancDt
     *
     * @param value
     */
    public void setHdrCancDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrCancDt(value);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex);
    }

    public void setHdrCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrCancDt with another Field
     *
     * @param value
     */
    public void setHdrCancDt(Field source) {
      dclsrvcAsgn.setHdrCancDt(source);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrPolNbr
     *
     * @return hdrPolNbr
     */
    public char[] getHdrPolNbr() throws CFException {
      return dclsrvcAsgn.getHdrPolNbr();
    }

    /**
     * set variable hdrPolNbr
     *
     * @param value
     */
    public void setHdrPolNbr(char[] value) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(value);
    }

    /**
     * Update HdrPolNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex);
    }

    public void setHdrPolNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPolNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrPolNbr with another Field
     *
     * @param value
     */
    public void setHdrPolNbr(Field source) {
      dclsrvcAsgn.setHdrPolNbr(source);
    }

    /**
     * Update HdrPolNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPolNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPolNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPolNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrPlnNbr
     *
     * @return hdrPlnNbr
     */
    public char[] getHdrPlnNbr() throws CFException {
      return dclsrvcAsgn.getHdrPlnNbr();
    }

    /**
     * set variable hdrPlnNbr
     *
     * @param value
     */
    public void setHdrPlnNbr(char[] value) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(value);
    }

    /**
     * Update HdrPlnNbr with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex);
    }

    public void setHdrPlnNbr(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPlnNbr with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrPlnNbr with another Field
     *
     * @param value
     */
    public void setHdrPlnNbr(Field source) {
      dclsrvcAsgn.setHdrPlnNbr(source);
    }

    /**
     * Update HdrPlnNbr with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrPlnNbr with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrPlnNbr(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrPlnNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrProcDt
     *
     * @return hdrProcDt
     */
    public char[] getHdrProcDt() throws CFException {
      return dclsrvcAsgn.getHdrProcDt();
    }

    /**
     * set variable hdrProcDt
     *
     * @param value
     */
    public void setHdrProcDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrProcDt(value);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex);
    }

    public void setHdrProcDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrProcDt with another Field
     *
     * @param value
     */
    public void setHdrProcDt(Field source) {
      dclsrvcAsgn.setHdrProcDt(source);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public OpenPolPlanCsrOutCtx getOpenPolPlanCsrOutCtx() {
      return new OpenPolPlanCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public OpenPolPlanCsrInCtx clone() {
      OpenPolPlanCsrInCtx cloneObj = new OpenPolPlanCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public OpenPolPlanCsrInCtx getOpenPolPlanCsrInCtx() {
    return new OpenPolPlanCsrInCtx();
  }

  public class OpenPolPlanCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public OpenPolPlanCsrOutCtx clone() {
      OpenPolPlanCsrOutCtx cloneObj = new OpenPolPlanCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public OpenPolPlanCsrOutCtx getOpenPolPlanCsrOutCtx() {
    return new OpenPolPlanCsrOutCtx();
  }

  public class FetchPolPlanCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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
     * Returns the value of hdrSlotTblId
     *
     * @return hdrSlotTblId
     */
    public char[] getHdrSlotTblId() throws CFException {
      return dclsrvcAsgn.getHdrSlotTblId();
    }

    /**
     * set variable hdrSlotTblId
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(value);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex);
    }

    public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrSlotTblId with another Field
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source) {
      dclsrvcAsgn.setHdrSlotTblId(source);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public FetchPolPlanCsrOutCtx getFetchPolPlanCsrOutCtx() {
      return new FetchPolPlanCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public FetchPolPlanCsrInCtx clone() {
      FetchPolPlanCsrInCtx cloneObj = new FetchPolPlanCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public FetchPolPlanCsrInCtx getFetchPolPlanCsrInCtx() {
    return new FetchPolPlanCsrInCtx();
  }

  public class FetchPolPlanCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of tliRetSlotTblId
     *
     * @return tliRetSlotTblId
     */
    public char[] getTliRetSlotTblId() throws CFException {
      return tliDsmArea.getTliDataArea().getTliRetArea().getTliRetSlotTblId();
    }

    /**
     * set variable tliRetSlotTblId
     *
     * @param value
     */
    public void setTliRetSlotTblId(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(value);
    }

    /**
     * Update TliRetSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(source, sourceIndex);
    }

    public void setTliRetSlotTblId(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliRetSlotTblId with another Field
     *
     * @param value
     */
    public void setTliRetSlotTblId(Field source) {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(source);
    }

    /**
     * Update TliRetSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrSlotTblId
     *
     * @return hdrSlotTblId
     */
    public char[] getHdrSlotTblId() throws CFException {
      return dclsrvcAsgn.getHdrSlotTblId();
    }

    /**
     * set variable hdrSlotTblId
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(value);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex);
    }

    public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrSlotTblId with another Field
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source) {
      dclsrvcAsgn.setHdrSlotTblId(source);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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
     * Test condition "Y" for isTliTableFound()
     *
     * @return Returns true if isTliTableFound() is "Y"
     */
    public boolean isTliTableFound() throws CFException {
      return work.isTliTableFound();
    }

    /** set values "Y" */
    public void setTliTableFoundTrue() throws CFException {
      work.setTliTableFoundTrue();
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public FetchPolPlanCsrOutCtx clone() {
      FetchPolPlanCsrOutCtx cloneObj = new FetchPolPlanCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public FetchPolPlanCsrOutCtx getFetchPolPlanCsrOutCtx() {
    return new FetchPolPlanCsrOutCtx();
  }

  public class ClosePolPlanCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public ClosePolPlanCsrOutCtx getClosePolPlanCsrOutCtx() {
      return new ClosePolPlanCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public ClosePolPlanCsrInCtx clone() {
      ClosePolPlanCsrInCtx cloneObj = new ClosePolPlanCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public ClosePolPlanCsrInCtx getClosePolPlanCsrInCtx() {
    return new ClosePolPlanCsrInCtx();
  }

  public class ClosePolPlanCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public ClosePolPlanCsrOutCtx clone() {
      ClosePolPlanCsrOutCtx cloneObj = new ClosePolPlanCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public ClosePolPlanCsrOutCtx getClosePolPlanCsrOutCtx() {
    return new ClosePolPlanCsrOutCtx();
  }

  public class ProcessSaOiTliInCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();

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
     * Test condition "Y" for isTliTableFound()
     *
     * @return Returns true if isTliTableFound() is "Y"
     */
    public boolean isTliTableFound() throws CFException {
      return work.isTliTableFound();
    }

    /** set values "Y" */
    public void setTliTableFoundTrue() throws CFException {
      work.setTliTableFoundTrue();
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public ProcessSaOiTliOutCtx getProcessSaOiTliOutCtx() {
      return new ProcessSaOiTliOutCtx();
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
      return str.hashCode();
    }

    public ProcessSaOiTliInCtx clone() {
      ProcessSaOiTliInCtx cloneObj = new ProcessSaOiTliInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessSaOiTliInCtx getProcessSaOiTliInCtx() {
    return new ProcessSaOiTliInCtx();
  }

  public class ProcessSaOiTliOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      return str.hashCode();
    }

    public ProcessSaOiTliOutCtx clone() {
      ProcessSaOiTliOutCtx cloneObj = new ProcessSaOiTliOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessSaOiTliOutCtx getProcessSaOiTliOutCtx() {
    return new ProcessSaOiTliOutCtx();
  }

  public class OpenSaOiCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of hdrCancDt
     *
     * @return hdrCancDt
     */
    public char[] getHdrCancDt() throws CFException {
      return dclsrvcAsgn.getHdrCancDt();
    }

    /**
     * set variable hdrCancDt
     *
     * @param value
     */
    public void setHdrCancDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrCancDt(value);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex);
    }

    public void setHdrCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrCancDt with another Field
     *
     * @param value
     */
    public void setHdrCancDt(Field source) {
      dclsrvcAsgn.setHdrCancDt(source);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrObligId
     *
     * @return hdrObligId
     */
    public char[] getHdrObligId() throws CFException {
      return dclsrvcAsgn.getHdrObligId();
    }

    /**
     * set variable hdrObligId
     *
     * @param value
     */
    public void setHdrObligId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrObligId(value);
    }

    /**
     * Update HdrObligId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrObligId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex);
    }

    public void setHdrObligId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrObligId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrObligId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrObligId with another Field
     *
     * @param value
     */
    public void setHdrObligId(Field source) {
      dclsrvcAsgn.setHdrObligId(source);
    }

    /**
     * Update HdrObligId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrObligId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrObligId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrObligId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrObligId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrShrArngCd
     *
     * @return hdrShrArngCd
     */
    public char[] getHdrShrArngCd() throws CFException {
      return dclsrvcAsgn.getHdrShrArngCd();
    }

    /**
     * set variable hdrShrArngCd
     *
     * @param value
     */
    public void setHdrShrArngCd(char[] value) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(value);
    }

    /**
     * Update HdrShrArngCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex);
    }

    public void setHdrShrArngCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrShrArngCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrShrArngCd with another Field
     *
     * @param value
     */
    public void setHdrShrArngCd(Field source) {
      dclsrvcAsgn.setHdrShrArngCd(source);
    }

    /**
     * Update HdrShrArngCd with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrShrArngCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrShrArngCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrShrArngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of hdrProcDt
     *
     * @return hdrProcDt
     */
    public char[] getHdrProcDt() throws CFException {
      return dclsrvcAsgn.getHdrProcDt();
    }

    /**
     * set variable hdrProcDt
     *
     * @param value
     */
    public void setHdrProcDt(char[] value) throws CFException {
      dclsrvcAsgn.setHdrProcDt(value);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex);
    }

    public void setHdrProcDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrProcDt with another Field
     *
     * @param value
     */
    public void setHdrProcDt(Field source) {
      dclsrvcAsgn.setHdrProcDt(source);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrProcDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrProcDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrProcDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public OpenSaOiCsrOutCtx getOpenSaOiCsrOutCtx() {
      return new OpenSaOiCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public OpenSaOiCsrInCtx clone() {
      OpenSaOiCsrInCtx cloneObj = new OpenSaOiCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public OpenSaOiCsrInCtx getOpenSaOiCsrInCtx() {
    return new OpenSaOiCsrInCtx();
  }

  public class OpenSaOiCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public OpenSaOiCsrOutCtx clone() {
      OpenSaOiCsrOutCtx cloneObj = new OpenSaOiCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public OpenSaOiCsrOutCtx getOpenSaOiCsrOutCtx() {
    return new OpenSaOiCsrOutCtx();
  }

  public class FetchSaOiCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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
     * Returns the value of hdrSlotTblId
     *
     * @return hdrSlotTblId
     */
    public char[] getHdrSlotTblId() throws CFException {
      return dclsrvcAsgn.getHdrSlotTblId();
    }

    /**
     * set variable hdrSlotTblId
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(value);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex);
    }

    public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrSlotTblId with another Field
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source) {
      dclsrvcAsgn.setHdrSlotTblId(source);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public FetchSaOiCsrOutCtx getFetchSaOiCsrOutCtx() {
      return new FetchSaOiCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public FetchSaOiCsrInCtx clone() {
      FetchSaOiCsrInCtx cloneObj = new FetchSaOiCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public FetchSaOiCsrInCtx getFetchSaOiCsrInCtx() {
    return new FetchSaOiCsrInCtx();
  }

  public class FetchSaOiCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();
    DclsrvcAsgn dclsrvcAsgn = D5427tliCtx.this.getDclsrvcAsgn();

    /**
     * Returns the value of tliRetSlotTblId
     *
     * @return tliRetSlotTblId
     */
    public char[] getTliRetSlotTblId() throws CFException {
      return tliDsmArea.getTliDataArea().getTliRetArea().getTliRetSlotTblId();
    }

    /**
     * set variable tliRetSlotTblId
     *
     * @param value
     */
    public void setTliRetSlotTblId(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(value);
    }

    /**
     * Update TliRetSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(source, sourceIndex);
    }

    public void setTliRetSlotTblId(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliRetSlotTblId with another Field
     *
     * @param value
     */
    public void setTliRetSlotTblId(Field source) {
      tliDsmArea.getTliDataArea().getTliRetArea().setTliRetSlotTblId(source);
    }

    /**
     * Update TliRetSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliRetSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliRetSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliRetArea()
          .setTliRetSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of hdrSlotTblId
     *
     * @return hdrSlotTblId
     */
    public char[] getHdrSlotTblId() throws CFException {
      return dclsrvcAsgn.getHdrSlotTblId();
    }

    /**
     * set variable hdrSlotTblId
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] value) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(value);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(char[] source, int sourceIndex) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex);
    }

    public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update HdrSlotTblId with another Field
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source) {
      dclsrvcAsgn.setHdrSlotTblId(source);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen);
    }

    /**
     * Update HdrSlotTblId with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setHdrSlotTblId(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dclsrvcAsgn.setHdrSlotTblId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of dclsrvcAsgn
     *
     * @return dclsrvcAsgn
     */
    public DclsrvcAsgn getDclsrvcAsgn() {
      return dclsrvcAsgn;
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
     * Test condition "Y" for isTliTableFound()
     *
     * @return Returns true if isTliTableFound() is "Y"
     */
    public boolean isTliTableFound() throws CFException {
      return work.isTliTableFound();
    }

    /** set values "Y" */
    public void setTliTableFoundTrue() throws CFException {
      work.setTliTableFoundTrue();
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      str += tliDsmArea.hashCode();
      str += dclsrvcAsgn.hashCode();
      return str.hashCode();
    }

    public FetchSaOiCsrOutCtx clone() {
      FetchSaOiCsrOutCtx cloneObj = new FetchSaOiCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      cloneObj.dclsrvcAsgn = new DclsrvcAsgn();
      cloneObj.dclsrvcAsgn.set(dclsrvcAsgn.getClonedField());
      return cloneObj;
    }
  }

  public FetchSaOiCsrOutCtx getFetchSaOiCsrOutCtx() {
    return new FetchSaOiCsrOutCtx();
  }

  public class CloseSaOiCsrInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
    }

    public CloseSaOiCsrOutCtx getCloseSaOiCsrOutCtx() {
      return new CloseSaOiCsrOutCtx();
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public CloseSaOiCsrInCtx clone() {
      CloseSaOiCsrInCtx cloneObj = new CloseSaOiCsrInCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseSaOiCsrInCtx getCloseSaOiCsrInCtx() {
    return new CloseSaOiCsrInCtx();
  }

  public class CloseSaOiCsrOutCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

    /**
     * Returns the value of sqlca
     *
     * @return sqlca
     */
    public Sqlca getSqlca() {
      return sqlca;
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += work.hashCode();
      str += dsmCallArea.hashCode();
      return str.hashCode();
    }

    public CloseSaOiCsrOutCtx clone() {
      CloseSaOiCsrOutCtx cloneObj = new CloseSaOiCsrOutCtx();
      cloneObj.sqlca = new Sqlca();
      cloneObj.sqlca.set(sqlca.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      return cloneObj;
    }
  }

  public CloseSaOiCsrOutCtx getCloseSaOiCsrOutCtx() {
    return new CloseSaOiCsrOutCtx();
  }

  public class MovesForErrorLogInCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

    /**
     * Returns the value of tliReqClngProg
     *
     * @return tliReqClngProg
     */
    public char[] getTliReqClngProg() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqClngProg();
    }

    /**
     * set variable tliReqClngProg
     *
     * @param value
     */
    public void setTliReqClngProg(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(value);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex);
    }

    public void setTliReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqClngProg with another Field
     *
     * @param value
     */
    public void setTliReqClngProg(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public MovesForErrorLogInCtx clone() {
      MovesForErrorLogInCtx cloneObj = new MovesForErrorLogInCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public MovesForErrorLogInCtx getMovesForErrorLogInCtx() {
    return new MovesForErrorLogInCtx();
  }

  public class MovesForErrorLogOutCtx implements Cloneable {
    Work work = D5427tliCtx.this.getWork();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();
    TliDsmArea tliDsmArea = D5427tliCtx.this.getTliDsmArea();

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
     * Returns the value of tliReqClngProg
     *
     * @return tliReqClngProg
     */
    public char[] getTliReqClngProg() throws CFException {
      return tliDsmArea.getTliDataArea().getTliReqArea().getTliReqClngProg();
    }

    /**
     * set variable tliReqClngProg
     *
     * @param value
     */
    public void setTliReqClngProg(char[] value) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(value);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(char[] source, int sourceIndex) throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex);
    }

    public void setTliReqClngProg(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update TliReqClngProg with another Field
     *
     * @param value
     */
    public void setTliReqClngProg(Field source) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(Field source, int sourceIndex, int sourceLen) {
      tliDsmArea.getTliDataArea().getTliReqArea().setTliReqClngProg(source, sourceIndex, sourceLen);
    }

    /**
     * Update TliReqClngProg with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setTliReqClngProg(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      tliDsmArea
          .getTliDataArea()
          .getTliReqArea()
          .setTliReqClngProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
      str += tliDsmArea.hashCode();
      return str.hashCode();
    }

    public MovesForErrorLogOutCtx clone() {
      MovesForErrorLogOutCtx cloneObj = new MovesForErrorLogOutCtx();
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dsmCallArea = new DsmCallArea();
      cloneObj.dsmCallArea.set(dsmCallArea.getClonedField());
      cloneObj.tliDsmArea = new TliDsmArea();
      cloneObj.tliDsmArea.set(tliDsmArea.getClonedField());
      return cloneObj;
    }
  }

  public MovesForErrorLogOutCtx getMovesForErrorLogOutCtx() {
    return new MovesForErrorLogOutCtx();
  }

  public class SqlErrorProcessInCtx implements Cloneable {
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
    Sqlca sqlca = D5427tliCtx.this.getSqlca();
    DsmCallArea dsmCallArea = D5427tliCtx.this.getDsmCallArea();

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

    public D5427tliCtx getD5427tliCtx() {
      return D5427tliCtx.this;
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
