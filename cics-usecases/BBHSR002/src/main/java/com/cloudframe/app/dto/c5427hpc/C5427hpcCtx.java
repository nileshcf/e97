package com.cloudframe.app.dto.c5427hpc;

import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.exception.CFException;

@Context
public class C5427hpcCtx implements ProgramContext, Cloneable {
  GlobalExecutorCtx globalCtx;

  CacheHpcKeyArea cacheHpcKeyArea;
  Work work;
  Dfhcommarea dfhcommarea;
  CacheTsqRecord cacheTsqRecord;
  CacheHpcDataArea cacheHpcDataArea;

  int cacheKeyNdx;
  int crtnNdx;
  int cacheDataNdx;

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

  boolean loopMainline = true;

  public boolean getLoopMainline() {
    return this.loopMainline;
  }

  public void setLoopMainline(boolean loopMainline) {
    this.loopMainline = loopMainline;
  }

  public CacheHpcKeyArea getCacheHpcKeyArea() {
    if (cacheHpcKeyArea == null) {
      cacheHpcKeyArea = new CacheHpcKeyArea();
    }

    return cacheHpcKeyArea;
  }

  public void setCacheHpcKeyArea(CacheHpcKeyArea cacheHpcKeyArea) {
    this.cacheHpcKeyArea = cacheHpcKeyArea;
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

  public Dfhcommarea getDfhcommarea() {
    if (dfhcommarea == null) {
      dfhcommarea = new Dfhcommarea();
    }

    return dfhcommarea;
  }

  public void setDfhcommarea(Dfhcommarea dfhcommarea) {
    this.dfhcommarea = dfhcommarea;
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

  public CacheHpcDataArea getCacheHpcDataArea() {
    if (cacheHpcDataArea == null) {
      cacheHpcDataArea = new CacheHpcDataArea();
    }

    return cacheHpcDataArea;
  }

  public void setCacheHpcDataArea(CacheHpcDataArea cacheHpcDataArea) {
    this.cacheHpcDataArea = cacheHpcDataArea;
  }

  public int getCacheKeyNdx() {
    return cacheKeyNdx;
  }

  public void setCacheKeyNdx(int cacheKeyNdx) {
    this.cacheKeyNdx = cacheKeyNdx;
  }

  public int getCrtnNdx() {
    return crtnNdx;
  }

  public void setCrtnNdx(int crtnNdx) {
    this.crtnNdx = crtnNdx;
  }

  public int getCacheDataNdx() {
    return cacheDataNdx;
  }

  public void setCacheDataNdx(int cacheDataNdx) {
    this.cacheDataNdx = cacheDataNdx;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    return this.hashCode() == o.hashCode();
  }

  @Override
  public int hashCode() {
    String str = "";
    str += cacheHpcKeyArea.hashCode();
    str += work.hashCode();
    str += dfhcommarea.hashCode();
    str += cacheTsqRecord.hashCode();
    str += cacheHpcDataArea.hashCode();
    return str.hashCode();
  }

  public C5427hpcCtx clone() {
    C5427hpcCtx cloneObj = new C5427hpcCtx();
    cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
    cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
    cloneObj.work = new Work();
    cloneObj.work.set(work.getClonedField());
    cloneObj.dfhcommarea = new Dfhcommarea();
    cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
    cloneObj.cacheTsqRecord = new CacheTsqRecord();
    cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
    cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
    cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
    return cloneObj;
  }

  /** Program method contexts */
  public class ProcessInCtx implements Cloneable {
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += dfhcommarea.hashCode();
      return str.hashCode();
    }

    public ProcessInCtx clone() {
      ProcessInCtx cloneObj = new ProcessInCtx();
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessInCtx getProcessInCtx() {
    return new ProcessInCtx();
  }

  public class MainlineInCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheTsqRecord cacheTsqRecord = C5427hpcCtx.this.getCacheTsqRecord();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

    /**
     * Test condition "A" for isCrtnListCsr()
     *
     * @return Returns true if isCrtnListCsr() is "A"
     */
    public boolean isCrtnListCsr() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnListCsr();
    }

    /** set values "A" */
    public void setCrtnListCsrTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnListCsrTrue();
    }
    /**
     * Returns the value of dphpctsq01
     *
     * @return dphpctsq01
     */
    public char[] getDphpctsq01() throws CFException {
      return work.getDphpctsq01();
    }

    /**
     * set variable dphpctsq01
     *
     * @param value
     */
    public void setDphpctsq01(char[] value) throws CFException {
      work.setDphpctsq01(value);
    }

    /**
     * Test condition "D" for isCrtnSelect()
     *
     * @return Returns true if isCrtnSelect() is "D"
     */
    public boolean isCrtnSelect() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnSelect();
    }

    /** set values "D" */
    public void setCrtnSelectTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnSelectTrue();
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
     * Returns the value of cacheTsqRecord
     *
     * @return cacheTsqRecord
     */
    public CacheTsqRecord getCacheTsqRecord() {
      return cacheTsqRecord;
    }

    /**
     * Test condition "B" for isCrtnGenericCsr()
     *
     * @return Returns true if isCrtnGenericCsr() is "B"
     */
    public boolean isCrtnGenericCsr() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnGenericCsr();
    }

    /** set values "B" */
    public void setCrtnGenericCsrTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnGenericCsrTrue();
    }
    /**
     * Returns the value of cacheHpcDataArea
     *
     * @return cacheHpcDataArea
     */
    public CacheHpcDataArea getCacheHpcDataArea() {
      return cacheHpcDataArea;
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
     * Returns the value of cacheHpcKeyArea
     *
     * @return cacheHpcKeyArea
     */
    public CacheHpcKeyArea getCacheHpcKeyArea() {
      return cacheHpcKeyArea;
    }

    /**
     * Test condition "C" for isCrtnGroupCsr()
     *
     * @return Returns true if isCrtnGroupCsr() is "C"
     */
    public boolean isCrtnGroupCsr() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnGroupCsr();
    }

    /** set values "C" */
    public void setCrtnGroupCsrTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnGroupCsrTrue();
    }
    /**
     * Returns the value of dfhcommarea
     *
     * @return dfhcommarea
     */
    public Dfhcommarea getDfhcommarea() {
      return dfhcommarea;
    }

    /**
     * Test condition "Y" for isSwFirstTimeIsY()
     *
     * @return Returns true if isSwFirstTimeIsY() is "Y"
     */
    public boolean isSwFirstTimeIsY() throws CFException {
      return work.isSwFirstTimeIsY();
    }

    /** set values "Y" */
    public void setSwFirstTimeIsYTrue() throws CFException {
      work.setSwFirstTimeIsYTrue();
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

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
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
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheTsqRecord.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public MainlineInCtx clone() {
      MainlineInCtx cloneObj = new MainlineInCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MainlineInCtx getMainlineInCtx() {
    return new MainlineInCtx();
  }

  public class MainlineOutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheTsqRecord cacheTsqRecord = C5427hpcCtx.this.getCacheTsqRecord();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

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
     * Returns the value of cacheHpcKeyArea
     *
     * @return cacheHpcKeyArea
     */
    public CacheHpcKeyArea getCacheHpcKeyArea() {
      return cacheHpcKeyArea;
    }

    /**
     * Test condition "N" for isSwFirstTimeIsN()
     *
     * @return Returns true if isSwFirstTimeIsN() is "N"
     */
    public boolean isSwFirstTimeIsN() throws CFException {
      return work.isSwFirstTimeIsN();
    }

    /** set values "N" */
    public void setSwFirstTimeIsNTrue() throws CFException {
      work.setSwFirstTimeIsNTrue();
    }
    /**
     * Test condition "R" for isSwRetryIsY()
     *
     * @return Returns true if isSwRetryIsY() is "R"
     */
    public boolean isSwRetryIsY() throws CFException {
      return work.isSwRetryIsY();
    }

    /** set values "R" */
    public void setSwRetryIsYTrue() throws CFException {
      work.setSwRetryIsYTrue();
    }
    /**
     * Returns the value of cacheDataPtr
     *
     * @return cacheDataPtr
     */
    public int getCacheDataPtr() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheDataPtr();
    }

    /**
     * Update CacheDataPtr with the passed value
     *
     * @param number
     */
    public void setCacheDataPtr(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheDataPtr(number);
    }

    public void setCacheDataPtr(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheDataPtr((int) number);
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
     * Test condition "N" for isSwUseCacheIsN()
     *
     * @return Returns true if isSwUseCacheIsN() is "N"
     */
    public boolean isSwUseCacheIsN() throws CFException {
      return work.isSwUseCacheIsN();
    }

    /** set values "N" */
    public void setSwUseCacheIsNTrue() throws CFException {
      work.setSwUseCacheIsNTrue();
    }
    /**
     * Returns the value of crtnQueryTyp
     *
     * @return crtnQueryTyp
     */
    public int getCrtnQueryTyp() throws CFException {
      return dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial().getCrtnQueryTyp();
    }

    /**
     * Update CrtnQueryTyp with the passed value
     *
     * @param number
     */
    public void setCrtnQueryTyp(int number) throws CFException {
      dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnQueryTyp(number);
    }

    public void setCrtnQueryTyp(long number) throws CFException {
      dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial().setCrtnQueryTyp((int) number);
    }

    /**
     * Test condition "Y" for isSwUseCacheIsY()
     *
     * @return Returns true if isSwUseCacheIsY() is "Y"
     */
    public boolean isSwUseCacheIsY() throws CFException {
      return work.isSwUseCacheIsY();
    }

    /** set values "Y" */
    public void setSwUseCacheIsYTrue() throws CFException {
      work.setSwUseCacheIsYTrue();
    }
    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of dfhcommarea
     *
     * @return dfhcommarea
     */
    public Dfhcommarea getDfhcommarea() {
      return dfhcommarea;
    }

    /**
     * Returns the value of cacheHpcDataArea
     *
     * @return cacheHpcDataArea
     */
    public CacheHpcDataArea getCacheHpcDataArea() {
      return cacheHpcDataArea;
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheTsqRecord.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public MainlineOutCtx clone() {
      MainlineOutCtx cloneObj = new MainlineOutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public MainlineOutCtx getMainlineOutCtx() {
    return new MainlineOutCtx();
  }

  public class ProcessCacheInCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

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
     * Returns the value of crtnSrchCd
     *
     * @return crtnSrchCd
     */
    public char[] getCrtnSrchCd(int index) throws CFException {
      return dfhcommarea.getCrtnRequestData().getCrtnSrchCd(index);
    }

    /**
     * set variable crtnSrchCd
     *
     * @param value
     */
    public void setCrtnSrchCd(int index, char[] value) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnSrchCd((index), value);
    }

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
    }
    /**
     * Returns the value of priorGrnrcRqstCd
     *
     * @return priorGrnrcRqstCd
     */
    public char[] getPriorGrnrcRqstCd() throws CFException {
      return work.getPriorGrnrcRqstCd();
    }

    /**
     * set variable priorGrnrcRqstCd
     *
     * @param value
     */
    public void setPriorGrnrcRqstCd(char[] value) throws CFException {
      work.setPriorGrnrcRqstCd(value);
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of cacheDataNbrOfEntries
     *
     * @return cacheDataNbrOfEntries
     */
    public int getCacheDataNbrOfEntries(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataNbrOfEntries();
    }

    /**
     * Update CacheDataNbrOfEntries with the passed value
     *
     * @param number
     */
    public void setCacheDataNbrOfEntries(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries(number);
    }

    public void setCacheDataNbrOfEntries(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries((int) number);
    }

    /**
     * Returns the value of cacheDataTyp
     *
     * @return cacheDataTyp
     */
    public int getCacheDataTyp(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheDataTyp();
    }

    /**
     * Update CacheDataTyp with the passed value
     *
     * @param number
     */
    public void setCacheDataTyp(int index, int number) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheDataTyp(number);
    }

    public void setCacheDataTyp(int index, long number) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheDataTyp((int) number);
    }

    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Test condition "Y" for isCacheDataOverflowYes()
     *
     * @return Returns true if isCacheDataOverflowYes() is "Y"
     */
    public boolean isCacheDataOverflowYes() throws CFException {
      return cacheHpcDataArea.getCacheDataFixedArea().isCacheDataOverflowYes();
    }

    /** set values "Y" */
    public void setCacheDataOverflowYesTrue() throws CFException {
      cacheHpcDataArea.getCacheDataFixedArea().setCacheDataOverflowYesTrue();
    }
    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return dfhcommarea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsFetchTrue();
    }
    /**
     * Returns the value of priorHipaaCd
     *
     * @return priorHipaaCd
     */
    public char[] getPriorHipaaCd() throws CFException {
      return work.getPriorHipaaCd();
    }

    /**
     * set variable priorHipaaCd
     *
     * @param value
     */
    public void setPriorHipaaCd(char[] value) throws CFException {
      work.setPriorHipaaCd(value);
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
     * Returns the value of cacheGrnrcRqstCd
     *
     * @return cacheGrnrcRqstCd
     */
    public char[] getCacheGrnrcRqstCd(int index) throws CFException {
      return cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheGrnrcRqstCd();
    }

    /**
     * set variable cacheGrnrcRqstCd
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(value);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex);
    }

    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(source);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheHipaaGrpCd
     *
     * @return cacheHipaaGrpCd
     */
    public char[] getCacheHipaaGrpCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaGrpCd();
    }

    /**
     * set variable cacheHipaaGrpCd
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaGrpCd(value);
    }

    /**
     * Update CacheHipaaGrpCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaGrpCd(source, sourceIndex);
    }

    public void setCacheHipaaGrpCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaGrpCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaGrpCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaGrpCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaGrpCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaGrpCd(source);
    }

    /**
     * Update CacheHipaaGrpCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaGrpCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaGrpCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaGrpCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaGrpCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public void setCrtnNdx(int crtnNdx) {
      C5427hpcCtx.this.crtnNdx = crtnNdx;
    }

    public int getCrtnNdx() {
      return C5427hpcCtx.this.crtnNdx;
    }
    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return dfhcommarea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Returns the value of cacheKeyAreaPartial
     *
     * @return cacheKeyAreaPartial
     */
    public CacheKeyAreaPartial getCacheKeyAreaPartial(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().getCacheKeyAreaPartial();
    }

    /**
     * Update CacheKeyAreaPartial with the passed value
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(value);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(source);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheKeyOverflowYes()
     *
     * @return Returns true if isCacheKeyOverflowYes() is "Y"
     */
    public boolean isCacheKeyOverflowYes() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().isCacheKeyOverflowYes();
    }

    /** set values "Y" */
    public void setCacheKeyOverflowYesTrue() throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyOverflowYesTrue();
    }
    /**
     * Returns the value of crtnSrchKeyPartial
     *
     * @return crtnSrchKeyPartial
     */
    public CrtnSrchKeyPartial getCrtnSrchKeyPartial() {
      return dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial();
    }

    /**
     * Update CrtnSrchKeyPartial with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(value);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheDataOffset
     *
     * @return cacheDataOffset
     */
    public int getCacheDataOffset(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataOffset();
    }

    /**
     * Update CacheDataOffset with the passed value
     *
     * @param number
     */
    public void setCacheDataOffset(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset(number);
    }

    public void setCacheDataOffset(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
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
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCacheInCtx clone() {
      ProcessCacheInCtx cloneObj = new ProcessCacheInCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheInCtx getProcessCacheInCtx() {
    return new ProcessCacheInCtx();
  }

  public class ProcessCacheOutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

    /**
     * Test condition "N" for isCrtnSrchFoundSwIsNo()
     *
     * @return Returns true if isCrtnSrchFoundSwIsNo() is "N"
     */
    public boolean isCrtnSrchFoundSwIsNo() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsNo();
    }

    /** set values "N" */
    public void setCrtnSrchFoundSwIsNoTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsNoTrue();
    }
    /**
     * Returns the value of priorGrnrcRqstCd
     *
     * @return priorGrnrcRqstCd
     */
    public char[] getPriorGrnrcRqstCd() throws CFException {
      return work.getPriorGrnrcRqstCd();
    }

    /**
     * set variable priorGrnrcRqstCd
     *
     * @param value
     */
    public void setPriorGrnrcRqstCd(char[] value) throws CFException {
      work.setPriorGrnrcRqstCd(value);
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    /**
     * Returns the value of priorHipaaCd
     *
     * @return priorHipaaCd
     */
    public char[] getPriorHipaaCd() throws CFException {
      return work.getPriorHipaaCd();
    }

    /**
     * set variable priorHipaaCd
     *
     * @param value
     */
    public void setPriorHipaaCd(char[] value) throws CFException {
      work.setPriorHipaaCd(value);
    }

    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of cacheGrnrcRqstCd
     *
     * @return cacheGrnrcRqstCd
     */
    public char[] getCacheGrnrcRqstCd(int index) throws CFException {
      return cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheGrnrcRqstCd();
    }

    /**
     * set variable cacheGrnrcRqstCd
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(value);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex);
    }

    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(source);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "N" for isCrtnHipaaCd30N()
     *
     * @return Returns true if isCrtnHipaaCd30N() is "N"
     */
    public boolean isCrtnHipaaCd30N() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnHipaaCd30N();
    }

    /** set values "N" */
    public void setCrtnHipaaCd30NTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnHipaaCd30NTrue();
    }
    /**
     * Test condition "Y" for isCrtnHipaaCd30Y()
     *
     * @return Returns true if isCrtnHipaaCd30Y() is "Y"
     */
    public boolean isCrtnHipaaCd30Y() throws CFException {
      return dfhcommarea.getCrtnRequestData().isCrtnHipaaCd30Y();
    }

    /** set values "Y" */
    public void setCrtnHipaaCd30YTrue() throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnHipaaCd30YTrue();
    }

    public void setCrtnNdx(int crtnNdx) {
      C5427hpcCtx.this.crtnNdx = crtnNdx;
    }

    public int getCrtnNdx() {
      return C5427hpcCtx.this.crtnNdx;
    }
    /**
     * Returns the value of crtnSqlcode
     *
     * @return crtnSqlcode
     */
    public int getCrtnSqlcode() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnSqlcode();
    }

    /**
     * Update CrtnSqlcode with the passed value
     *
     * @param number
     */
    public void setCrtnSqlcode(int number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode(number);
    }

    public void setCrtnSqlcode(long number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCacheOutCtx clone() {
      ProcessCacheOutCtx cloneObj = new ProcessCacheOutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheOutCtx getProcessCacheOutCtx() {
    return new ProcessCacheOutCtx();
  }

  public class ProcessCache1500InCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

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

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of cacheDataNbrOfEntries
     *
     * @return cacheDataNbrOfEntries
     */
    public int getCacheDataNbrOfEntries(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataNbrOfEntries();
    }

    /**
     * Update CacheDataNbrOfEntries with the passed value
     *
     * @param number
     */
    public void setCacheDataNbrOfEntries(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries(number);
    }

    public void setCacheDataNbrOfEntries(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries((int) number);
    }

    /**
     * Returns the value of cacheDataTyp
     *
     * @return cacheDataTyp
     */
    public int getCacheDataTyp(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheDataTyp();
    }

    /**
     * Update CacheDataTyp with the passed value
     *
     * @param number
     */
    public void setCacheDataTyp(int index, int number) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheDataTyp(number);
    }

    public void setCacheDataTyp(int index, long number) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheDataTyp((int) number);
    }

    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Test condition "Y" for isCacheDataOverflowYes()
     *
     * @return Returns true if isCacheDataOverflowYes() is "Y"
     */
    public boolean isCacheDataOverflowYes() throws CFException {
      return cacheHpcDataArea.getCacheDataFixedArea().isCacheDataOverflowYes();
    }

    /** set values "Y" */
    public void setCacheDataOverflowYesTrue() throws CFException {
      cacheHpcDataArea.getCacheDataFixedArea().setCacheDataOverflowYesTrue();
    }
    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return dfhcommarea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsFetchTrue();
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
     * Returns the value of cacheGrnrcRqstCd
     *
     * @return cacheGrnrcRqstCd
     */
    public char[] getCacheGrnrcRqstCd(int index) throws CFException {
      return cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheGrnrcRqstCd();
    }

    /**
     * set variable cacheGrnrcRqstCd
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(value);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex);
    }

    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(source);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return dfhcommarea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Returns the value of cacheKeyAreaPartial
     *
     * @return cacheKeyAreaPartial
     */
    public CacheKeyAreaPartial getCacheKeyAreaPartial(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().getCacheKeyAreaPartial();
    }

    /**
     * Update CacheKeyAreaPartial with the passed value
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(value);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(source);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheKeyOverflowYes()
     *
     * @return Returns true if isCacheKeyOverflowYes() is "Y"
     */
    public boolean isCacheKeyOverflowYes() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().isCacheKeyOverflowYes();
    }

    /** set values "Y" */
    public void setCacheKeyOverflowYesTrue() throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyOverflowYesTrue();
    }
    /**
     * Returns the value of crtnSrchKeyPartial
     *
     * @return crtnSrchKeyPartial
     */
    public CrtnSrchKeyPartial getCrtnSrchKeyPartial() {
      return dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial();
    }

    /**
     * Update CrtnSrchKeyPartial with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(value);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheDataOffset
     *
     * @return cacheDataOffset
     */
    public int getCacheDataOffset(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataOffset();
    }

    /**
     * Update CacheDataOffset with the passed value
     *
     * @param number
     */
    public void setCacheDataOffset(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset(number);
    }

    public void setCacheDataOffset(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    public ProcessCache1500OutCtx getProcessCache1500OutCtx() {
      return new ProcessCache1500OutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache1500InCtx clone() {
      ProcessCache1500InCtx cloneObj = new ProcessCache1500InCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache1500InCtx getProcessCache1500InCtx() {
    return new ProcessCache1500InCtx();
  }

  public class ProcessCache1500OutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

    /**
     * Test condition "N" for isCrtnSrchFoundSwIsNo()
     *
     * @return Returns true if isCrtnSrchFoundSwIsNo() is "N"
     */
    public boolean isCrtnSrchFoundSwIsNo() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsNo();
    }

    /** set values "N" */
    public void setCrtnSrchFoundSwIsNoTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsNoTrue();
    }
    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of cacheGrnrcRqstCd
     *
     * @return cacheGrnrcRqstCd
     */
    public char[] getCacheGrnrcRqstCd(int index) throws CFException {
      return cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheGrnrcRqstCd();
    }

    /**
     * set variable cacheGrnrcRqstCd
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(value);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex);
    }

    public void setCacheGrnrcRqstCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheGrnrcRqstCd(source);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheGrnrcRqstCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of crtnGrnrcRqstCd
     *
     * @return crtnGrnrcRqstCd
     */
    public char[] getCrtnGrnrcRqstCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnGrnrcRqstCd();
    }

    /**
     * set variable crtnGrnrcRqstCd
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(value);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex);
    }

    public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnGrnrcRqstCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnGrnrcRqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnSqlcode
     *
     * @return crtnSqlcode
     */
    public int getCrtnSqlcode() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnSqlcode();
    }

    /**
     * Update CrtnSqlcode with the passed value
     *
     * @param number
     */
    public void setCrtnSqlcode(int number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode(number);
    }

    public void setCrtnSqlcode(long number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode((int) number);
    }

    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache1500OutCtx clone() {
      ProcessCache1500OutCtx cloneObj = new ProcessCache1500OutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache1500OutCtx getProcessCache1500OutCtx() {
    return new ProcessCache1500OutCtx();
  }

  public class ProcessCache2000InCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

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

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of cacheDataNbrOfEntries
     *
     * @return cacheDataNbrOfEntries
     */
    public int getCacheDataNbrOfEntries(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataNbrOfEntries();
    }

    /**
     * Update CacheDataNbrOfEntries with the passed value
     *
     * @param number
     */
    public void setCacheDataNbrOfEntries(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries(number);
    }

    public void setCacheDataNbrOfEntries(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries((int) number);
    }

    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Test condition "Y" for isCacheDataOverflowYes()
     *
     * @return Returns true if isCacheDataOverflowYes() is "Y"
     */
    public boolean isCacheDataOverflowYes() throws CFException {
      return cacheHpcDataArea.getCacheDataFixedArea().isCacheDataOverflowYes();
    }

    /** set values "Y" */
    public void setCacheDataOverflowYesTrue() throws CFException {
      cacheHpcDataArea.getCacheDataFixedArea().setCacheDataOverflowYesTrue();
    }
    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    /**
     * Test condition "F" for isCrtnFunctionIsFetch()
     *
     * @return Returns true if isCrtnFunctionIsFetch() is "F"
     */
    public boolean isCrtnFunctionIsFetch() throws CFException {
      return dfhcommarea.isCrtnFunctionIsFetch();
    }

    /** set values "F" */
    public void setCrtnFunctionIsFetchTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsFetchTrue();
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
     * Returns the value of crtnSrchKey
     *
     * @return crtnSrchKey
     */
    public CrtnSrchKey getCrtnSrchKey() {
      return dfhcommarea.getCrtnSrchKey();
    }

    /**
     * Update CrtnSrchKey with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] value) throws CFException {
      dfhcommarea.setCrtnSrchKey(value);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKey with another Field
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source) {
      dfhcommarea.setCrtnSrchKey(source);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "O" for isCrtnFunctionIsOpen()
     *
     * @return Returns true if isCrtnFunctionIsOpen() is "O"
     */
    public boolean isCrtnFunctionIsOpen() throws CFException {
      return dfhcommarea.isCrtnFunctionIsOpen();
    }

    /** set values "O" */
    public void setCrtnFunctionIsOpenTrue() throws CFException {
      dfhcommarea.setCrtnFunctionIsOpenTrue();
    }
    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheKeyOverflowYes()
     *
     * @return Returns true if isCacheKeyOverflowYes() is "Y"
     */
    public boolean isCacheKeyOverflowYes() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().isCacheKeyOverflowYes();
    }

    /** set values "Y" */
    public void setCacheKeyOverflowYesTrue() throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyOverflowYesTrue();
    }
    /**
     * Returns the value of cacheDataOffset
     *
     * @return cacheDataOffset
     */
    public int getCacheDataOffset(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataOffset();
    }

    /**
     * Update CacheDataOffset with the passed value
     *
     * @param number
     */
    public void setCacheDataOffset(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset(number);
    }

    public void setCacheDataOffset(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    public ProcessCache2000OutCtx getProcessCache2000OutCtx() {
      return new ProcessCache2000OutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache2000InCtx clone() {
      ProcessCache2000InCtx cloneObj = new ProcessCache2000InCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache2000InCtx getProcessCache2000InCtx() {
    return new ProcessCache2000InCtx();
  }

  public class ProcessCache2000OutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

    /**
     * Test condition "N" for isCrtnSrchFoundSwIsNo()
     *
     * @return Returns true if isCrtnSrchFoundSwIsNo() is "N"
     */
    public boolean isCrtnSrchFoundSwIsNo() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsNo();
    }

    /** set values "N" */
    public void setCrtnSrchFoundSwIsNoTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsNoTrue();
    }
    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnSqlcode
     *
     * @return crtnSqlcode
     */
    public int getCrtnSqlcode() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnSqlcode();
    }

    /**
     * Update CrtnSqlcode with the passed value
     *
     * @param number
     */
    public void setCrtnSqlcode(int number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode(number);
    }

    public void setCrtnSqlcode(long number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode((int) number);
    }

    /**
     * Returns the value of bcntrFetchOccurrance
     *
     * @return bcntrFetchOccurrance
     */
    public short getBcntrFetchOccurrance() throws CFException {
      return work.getBcntrFetchOccurrance();
    }

    /**
     * Update BcntrFetchOccurrance with the passed value
     *
     * @param number
     */
    public void setBcntrFetchOccurrance(short number) throws CFException {
      work.setBcntrFetchOccurrance(number);
    }

    public void setBcntrFetchOccurrance(int number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public void setBcntrFetchOccurrance(long number) throws CFException {
      work.setBcntrFetchOccurrance((short) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache2000OutCtx clone() {
      ProcessCache2000OutCtx cloneObj = new ProcessCache2000OutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache2000OutCtx getProcessCache2000OutCtx() {
    return new ProcessCache2000OutCtx();
  }

  public class ProcessCache3000InCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

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
     * Returns the value of crtnSrchKey
     *
     * @return crtnSrchKey
     */
    public CrtnSrchKey getCrtnSrchKey() {
      return dfhcommarea.getCrtnSrchKey();
    }

    /**
     * Update CrtnSrchKey with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] value) throws CFException {
      dfhcommarea.setCrtnSrchKey(value);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKey with another Field
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source) {
      dfhcommarea.setCrtnSrchKey(source);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheKeyOverflowYes()
     *
     * @return Returns true if isCacheKeyOverflowYes() is "Y"
     */
    public boolean isCacheKeyOverflowYes() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().isCacheKeyOverflowYes();
    }

    /** set values "Y" */
    public void setCacheKeyOverflowYesTrue() throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyOverflowYesTrue();
    }
    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Test condition "Y" for isCacheDataOverflowYes()
     *
     * @return Returns true if isCacheDataOverflowYes() is "Y"
     */
    public boolean isCacheDataOverflowYes() throws CFException {
      return cacheHpcDataArea.getCacheDataFixedArea().isCacheDataOverflowYes();
    }

    /** set values "Y" */
    public void setCacheDataOverflowYesTrue() throws CFException {
      cacheHpcDataArea.getCacheDataFixedArea().setCacheDataOverflowYesTrue();
    }
    /**
     * Returns the value of cacheDataOffset
     *
     * @return cacheDataOffset
     */
    public int getCacheDataOffset(int index) throws CFException {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheDataOffset();
    }

    /**
     * Update CacheDataOffset with the passed value
     *
     * @param number
     */
    public void setCacheDataOffset(int index, int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset(number);
    }

    public void setCacheDataOffset(int index, long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheDataOffset((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    public ProcessCache3000OutCtx getProcessCache3000OutCtx() {
      return new ProcessCache3000OutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache3000InCtx clone() {
      ProcessCache3000InCtx cloneObj = new ProcessCache3000InCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache3000InCtx getProcessCache3000InCtx() {
    return new ProcessCache3000InCtx();
  }

  public class ProcessCache3000OutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();
    CacheHpcDataArea cacheHpcDataArea = C5427hpcCtx.this.getCacheHpcDataArea();

    /**
     * Test condition "N" for isCrtnSrchFoundSwIsNo()
     *
     * @return Returns true if isCrtnSrchFoundSwIsNo() is "N"
     */
    public boolean isCrtnSrchFoundSwIsNo() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsNo();
    }

    /** set values "N" */
    public void setCrtnSrchFoundSwIsNoTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsNoTrue();
    }
    /**
     * Test condition "Y" for isCrtnSrchFoundSwIsYes()
     *
     * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
     */
    public boolean isCrtnSrchFoundSwIsYes() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsYes();
    }

    /** set values "Y" */
    public void setCrtnSrchFoundSwIsYesTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsYesTrue();
    }
    /**
     * Returns the value of crtnHipaaCd
     *
     * @return crtnHipaaCd
     */
    public char[] getCrtnHipaaCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnHipaaCd();
    }

    /**
     * set variable crtnHipaaCd
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(value);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex);
    }

    public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCd with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427hpcCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427hpcCtx.this.cacheDataNdx;
    }
    /**
     * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
     *
     * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
     */
    public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().isCrtnSrchFoundSwIsOverflow();
    }

    /** set values "?" */
    public void setCrtnSrchFoundSwIsOverflowTrue() throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrchFoundSwIsOverflowTrue();
    }
    /**
     * Returns the value of cacheHipaaCd
     *
     * @return cacheHipaaCd
     */
    public char[] getCacheHipaaCd(int index) throws CFException {
      return cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheHipaaCd();
    }

    /**
     * set variable cacheHipaaCd
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] value) throws CFException {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(value);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex);
    }

    public void setCacheHipaaCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCd with another Field
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source) {
      cacheHpcDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheHipaaCd(source);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnSqlcode
     *
     * @return crtnSqlcode
     */
    public int getCrtnSqlcode() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnSqlcode();
    }

    /**
     * Update CrtnSqlcode with the passed value
     *
     * @param number
     */
    public void setCrtnSqlcode(int number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode(number);
    }

    public void setCrtnSqlcode(long number) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSqlcode((int) number);
    }

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheHpcDataArea.hashCode();
      return str.hashCode();
    }

    public ProcessCache3000OutCtx clone() {
      ProcessCache3000OutCtx cloneObj = new ProcessCache3000OutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheHpcDataArea = new CacheHpcDataArea();
      cloneObj.cacheHpcDataArea.set(cacheHpcDataArea.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCache3000OutCtx getProcessCache3000OutCtx() {
    return new ProcessCache3000OutCtx();
  }

  public class SearchCacheInCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();

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
     * Returns the value of cacheKeyAreaPartial
     *
     * @return cacheKeyAreaPartial
     */
    public CacheKeyAreaPartial getCacheKeyAreaPartial(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().getCacheKeyAreaPartial();
    }

    /**
     * Update CacheKeyAreaPartial with the passed value
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(value);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea().setCacheKeyAreaPartial(source);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyAreaPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheKeyAreaPartial(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .getCacheKeyArea()
          .setCacheKeyAreaPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Returns the value of crtnSrchKeyPartial
     *
     * @return crtnSrchKeyPartial
     */
    public CrtnSrchKeyPartial getCrtnSrchKeyPartial() {
      return dfhcommarea.getCrtnSrchKey().getCrtnSrchKeyPartial();
    }

    /**
     * Update CrtnSrchKeyPartial with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(value);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchKey().setCrtnSrchKeyPartial(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKeyPartial with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnSrchKeyPartial(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchKey()
          .setCrtnSrchKeyPartial(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
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
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      return str.hashCode();
    }

    public SearchCacheInCtx clone() {
      SearchCacheInCtx cloneObj = new SearchCacheInCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheInCtx getSearchCacheInCtx() {
    return new SearchCacheInCtx();
  }

  public class SearchCacheOutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();

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

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
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
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
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

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      return str.hashCode();
    }

    public SearchCacheOutCtx clone() {
      SearchCacheOutCtx cloneObj = new SearchCacheOutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheOutCtx getSearchCacheOutCtx() {
    return new SearchCacheOutCtx();
  }

  public class SearchCache5100InCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();

    /**
     * Returns the value of crtnSrchKey
     *
     * @return crtnSrchKey
     */
    public CrtnSrchKey getCrtnSrchKey() {
      return dfhcommarea.getCrtnSrchKey();
    }

    /**
     * Update CrtnSrchKey with the passed value
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] value) throws CFException {
      dfhcommarea.setCrtnSrchKey(value);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrchKey with another Field
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source) {
      dfhcommarea.setCrtnSrchKey(source);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrchKey with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrchKey(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea.setCrtnSrchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheHpcKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheHpcKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheHpcKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
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

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    public SearchCache5100OutCtx getSearchCache5100OutCtx() {
      return new SearchCache5100OutCtx();
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      return str.hashCode();
    }

    public SearchCache5100InCtx clone() {
      SearchCache5100InCtx cloneObj = new SearchCache5100InCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCache5100InCtx getSearchCache5100InCtx() {
    return new SearchCache5100InCtx();
  }

  public class SearchCache5100OutCtx implements Cloneable {
    CacheHpcKeyArea cacheHpcKeyArea = C5427hpcCtx.this.getCacheHpcKeyArea();
    Work work = C5427hpcCtx.this.getWork();
    Dfhcommarea dfhcommarea = C5427hpcCtx.this.getDfhcommarea();

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

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427hpcCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427hpcCtx.this.cacheKeyNdx;
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
      return cacheHpcKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheHpcKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
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

    public C5427hpcCtx getC5427hpcCtx() {
      return C5427hpcCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheHpcKeyArea.hashCode();
      str += work.hashCode();
      str += dfhcommarea.hashCode();
      return str.hashCode();
    }

    public SearchCache5100OutCtx clone() {
      SearchCache5100OutCtx cloneObj = new SearchCache5100OutCtx();
      cloneObj.cacheHpcKeyArea = new CacheHpcKeyArea();
      cloneObj.cacheHpcKeyArea.set(cacheHpcKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      return cloneObj;
    }
  }

  public SearchCache5100OutCtx getSearchCache5100OutCtx() {
    return new SearchCache5100OutCtx();
  }
}
