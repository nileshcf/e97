package com.cloudframe.app.dto.c5427bhi;

import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.exception.CFException;

@Context
public class C5427bhiCtx implements ProgramContext, Cloneable {
  GlobalExecutorCtx globalCtx;

  CacheBhiDataArea cacheBhiDataArea;
  Dfhcommarea dfhcommarea;
  CacheBhiKeyArea cacheBhiKeyArea;
  CacheTsqRecord cacheTsqRecord;
  Work work;

  int cacheKeyNdx;
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

  public CacheBhiDataArea getCacheBhiDataArea() {
    if (cacheBhiDataArea == null) {
      cacheBhiDataArea = new CacheBhiDataArea();
    }

    return cacheBhiDataArea;
  }

  public void setCacheBhiDataArea(CacheBhiDataArea cacheBhiDataArea) {
    this.cacheBhiDataArea = cacheBhiDataArea;
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

  public CacheBhiKeyArea getCacheBhiKeyArea() {
    if (cacheBhiKeyArea == null) {
      cacheBhiKeyArea = new CacheBhiKeyArea();
    }

    return cacheBhiKeyArea;
  }

  public void setCacheBhiKeyArea(CacheBhiKeyArea cacheBhiKeyArea) {
    this.cacheBhiKeyArea = cacheBhiKeyArea;
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

  public Work getWork() {
    if (work == null) {
      work = new Work();
    }

    return work;
  }

  public void setWork(Work work) {
    this.work = work;
  }

  public int getCacheKeyNdx() {
    return cacheKeyNdx;
  }

  public void setCacheKeyNdx(int cacheKeyNdx) {
    this.cacheKeyNdx = cacheKeyNdx;
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
    str += cacheBhiDataArea.hashCode();
    str += dfhcommarea.hashCode();
    str += cacheBhiKeyArea.hashCode();
    str += cacheTsqRecord.hashCode();
    str += work.hashCode();
    return str.hashCode();
  }

  public C5427bhiCtx clone() {
    C5427bhiCtx cloneObj = new C5427bhiCtx();
    cloneObj.cacheBhiDataArea = new CacheBhiDataArea();
    cloneObj.cacheBhiDataArea.set(cacheBhiDataArea.getClonedField());
    cloneObj.dfhcommarea = new Dfhcommarea();
    cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
    cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
    cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
    cloneObj.cacheTsqRecord = new CacheTsqRecord();
    cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
    cloneObj.work = new Work();
    cloneObj.work.set(work.getClonedField());
    return cloneObj;
  }

  /** Program method contexts */
  public class ProcessInCtx implements Cloneable {
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
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
    CacheBhiDataArea cacheBhiDataArea = C5427bhiCtx.this.getCacheBhiDataArea();
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    CacheTsqRecord cacheTsqRecord = C5427bhiCtx.this.getCacheTsqRecord();
    Work work = C5427bhiCtx.this.getWork();

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
     * Returns the value of cacheBhiDataArea
     *
     * @return cacheBhiDataArea
     */
    public CacheBhiDataArea getCacheBhiDataArea() {
      return cacheBhiDataArea;
    }

    /**
     * Returns the value of cacheBhiKeyArea
     *
     * @return cacheBhiKeyArea
     */
    public CacheBhiKeyArea getCacheBhiKeyArea() {
      return cacheBhiKeyArea;
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

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
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
      str += cacheBhiDataArea.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheBhiKeyArea.hashCode();
      str += cacheTsqRecord.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public MainlineInCtx clone() {
      MainlineInCtx cloneObj = new MainlineInCtx();
      cloneObj.cacheBhiDataArea = new CacheBhiDataArea();
      cloneObj.cacheBhiDataArea.set(cacheBhiDataArea.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public MainlineInCtx getMainlineInCtx() {
    return new MainlineInCtx();
  }

  public class MainlineOutCtx implements Cloneable {
    CacheBhiDataArea cacheBhiDataArea = C5427bhiCtx.this.getCacheBhiDataArea();
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    CacheTsqRecord cacheTsqRecord = C5427bhiCtx.this.getCacheTsqRecord();
    Work work = C5427bhiCtx.this.getWork();

    /**
     * Returns the value of cacheBhiDataArea
     *
     * @return cacheBhiDataArea
     */
    public CacheBhiDataArea getCacheBhiDataArea() {
      return cacheBhiDataArea;
    }

    /**
     * Returns the value of cacheBhiKeyArea
     *
     * @return cacheBhiKeyArea
     */
    public CacheBhiKeyArea getCacheBhiKeyArea() {
      return cacheBhiKeyArea;
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
     * Returns the value of cacheDataPtr
     *
     * @return cacheDataPtr
     */
    public int getCacheDataPtr() throws CFException {
      return cacheBhiKeyArea.getCacheKeyFixedArea().getCacheDataPtr();
    }

    /**
     * Update CacheDataPtr with the passed value
     *
     * @param number
     */
    public void setCacheDataPtr(int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheDataPtr(number);
    }

    public void setCacheDataPtr(long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheDataPtr((int) number);
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

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheBhiDataArea.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheBhiKeyArea.hashCode();
      str += cacheTsqRecord.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public MainlineOutCtx clone() {
      MainlineOutCtx cloneObj = new MainlineOutCtx();
      cloneObj.cacheBhiDataArea = new CacheBhiDataArea();
      cloneObj.cacheBhiDataArea.set(cacheBhiDataArea.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.cacheTsqRecord = new CacheTsqRecord();
      cloneObj.cacheTsqRecord.set(cacheTsqRecord.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public MainlineOutCtx getMainlineOutCtx() {
    return new MainlineOutCtx();
  }

  public class ProcessCacheInCtx implements Cloneable {
    CacheBhiDataArea cacheBhiDataArea = C5427bhiCtx.this.getCacheBhiDataArea();
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    Work work = C5427bhiCtx.this.getWork();

    /**
     * Returns the value of crtnReqEffDt
     *
     * @return crtnReqEffDt
     */
    public char[] getCrtnReqEffDt() throws CFException {
      return dfhcommarea.getCrtnRequestData().getCrtnReqEffDt();
    }

    /**
     * set variable crtnReqEffDt
     *
     * @param value
     */
    public void setCrtnReqEffDt(char[] value) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqEffDt(value);
    }

    /**
     * Update CrtnReqEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnReqEffDt(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqEffDt(source, sourceIndex);
    }

    public void setCrtnReqEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnReqEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnReqEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnRequestData()
          .setCrtnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnReqEffDt with another Field
     *
     * @param value
     */
    public void setCrtnReqEffDt(Field source) {
      dfhcommarea.getCrtnRequestData().setCrtnReqEffDt(source);
    }

    /**
     * Update CrtnReqEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnReqEffDt(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnRequestData().setCrtnReqEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnReqEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnReqEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnRequestData()
          .setCrtnReqEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheDataNbrOfEntries
     *
     * @return cacheDataNbrOfEntries
     */
    public int getCacheDataNbrOfEntries(int index) throws CFException {
      return cacheBhiKeyArea.getCacheKeyArray(index).getCacheDataNbrOfEntries();
    }

    /**
     * Update CacheDataNbrOfEntries with the passed value
     *
     * @param number
     */
    public void setCacheDataNbrOfEntries(int index, int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries(number);
    }

    public void setCacheDataNbrOfEntries(int index, long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheDataNbrOfEntries((int) number);
    }

    /**
     * Returns the value of cacheCausCd
     *
     * @return cacheCausCd
     */
    public char[] getCacheCausCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheCausCd();
    }

    /**
     * set variable cacheCausCd
     *
     * @param value
     */
    public void setCacheCausCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCausCd(value);
    }

    /**
     * Update CacheCausCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex);
    }

    public void setCacheCausCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCausCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheCausCd with another Field
     *
     * @param value
     */
    public void setCacheCausCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCausCd(source);
    }

    /**
     * Update CacheCausCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCausCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheDataOffset
     *
     * @return cacheDataOffset
     */
    public int getCacheDataOffset(int index) throws CFException {
      return cacheBhiKeyArea.getCacheKeyArray(index).getCacheDataOffset();
    }

    /**
     * Update CacheDataOffset with the passed value
     *
     * @param number
     */
    public void setCacheDataOffset(int index, int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheDataOffset(number);
    }

    public void setCacheDataOffset(int index, long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheDataOffset((int) number);
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

    public void setCacheKeyNdx(int cacheKeyNdx) {
      C5427bhiCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427bhiCtx.this.cacheKeyNdx;
    }
    /**
     * Returns the value of cacheInNtwkClssCd
     *
     * @return cacheInNtwkClssCd
     */
    public char[] getCacheInNtwkClssCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheInNtwkClssCd();
    }

    /**
     * set variable cacheInNtwkClssCd
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheInNtwkClssCd(value);
    }

    /**
     * Update CacheInNtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex);
    }

    public void setCacheInNtwkClssCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheInNtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheInNtwkClssCd with another Field
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source);
    }

    /**
     * Update CacheInNtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheInNtwkClssCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheNtwkTypCd
     *
     * @return cacheNtwkTypCd
     */
    public char[] getCacheNtwkTypCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheNtwkTypCd();
    }

    /**
     * set variable cacheNtwkTypCd
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheNtwkTypCd(value);
    }

    /**
     * Update CacheNtwkTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex);
    }

    public void setCacheNtwkTypCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheNtwkTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheNtwkTypCd with another Field
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheNtwkTypCd(source);
    }

    /**
     * Update CacheNtwkTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheNtwkTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheBenLvlCd
     *
     * @return cacheBenLvlCd
     */
    public char[] getCacheBenLvlCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheBenLvlCd();
    }

    /**
     * set variable cacheBenLvlCd
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheBenLvlCd(value);
    }

    /**
     * Update CacheBenLvlCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex);
    }

    public void setCacheBenLvlCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheBenLvlCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheBenLvlCd with another Field
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheBenLvlCd(source);
    }

    /**
     * Update CacheBenLvlCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheBenLvlCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngTypVal
     *
     * @return cacheProcCdRngTypVal
     */
    public char[] getCacheProcCdRngTypVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngTypVal();
    }

    /**
     * set variable cacheProcCdRngTypVal
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(value);
    }

    /**
     * Update CacheProcCdRngTypVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex);
    }

    public void setCacheProcCdRngTypVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngTypVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheCancDt
     *
     * @return cacheCancDt
     */
    public char[] getCacheCancDt(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheCancDt();
    }

    /**
     * set variable cacheCancDt
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCancDt(value);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex);
    }

    public void setCacheCancDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheCancDt with another Field
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCancDt(source);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnReqCancDt
     *
     * @return crtnReqCancDt
     */
    public char[] getCrtnReqCancDt() throws CFException {
      return dfhcommarea.getCrtnRequestData().getCrtnReqCancDt();
    }

    /**
     * set variable crtnReqCancDt
     *
     * @param value
     */
    public void setCrtnReqCancDt(char[] value) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqCancDt(value);
    }

    /**
     * Update CrtnReqCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnReqCancDt(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqCancDt(source, sourceIndex);
    }

    public void setCrtnReqCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnRequestData().setCrtnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnReqCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnReqCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnRequestData()
          .setCrtnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnReqCancDt with another Field
     *
     * @param value
     */
    public void setCrtnReqCancDt(Field source) {
      dfhcommarea.getCrtnRequestData().setCrtnReqCancDt(source);
    }

    /**
     * Update CrtnReqCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnReqCancDt(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnRequestData().setCrtnReqCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnReqCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnReqCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnRequestData()
          .setCrtnReqCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheDataOverflowYes()
     *
     * @return Returns true if isCacheDataOverflowYes() is "Y"
     */
    public boolean isCacheDataOverflowYes() throws CFException {
      return cacheBhiDataArea.getCacheDataFixedArea().isCacheDataOverflowYes();
    }

    /** set values "Y" */
    public void setCacheDataOverflowYesTrue() throws CFException {
      cacheBhiDataArea.getCacheDataFixedArea().setCacheDataOverflowYesTrue();
    }

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427bhiCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427bhiCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of cacheProvOrgTypCd
     *
     * @return cacheProvOrgTypCd
     */
    public char[] getCacheProvOrgTypCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProvOrgTypCd();
    }

    /**
     * set variable cacheProvOrgTypCd
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheProvOrgTypCd(value);
    }

    /**
     * Update CacheProvOrgTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex);
    }

    public void setCacheProvOrgTypCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProvOrgTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProvOrgTypCd with another Field
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source);
    }

    /**
     * Update CacheProvOrgTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProvOrgTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cachePlOfSrvcCd
     *
     * @return cachePlOfSrvcCd
     */
    public char[] getCachePlOfSrvcCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCachePlOfSrvcCd();
    }

    /**
     * set variable cachePlOfSrvcCd
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCachePlOfSrvcCd(value);
    }

    /**
     * Update CachePlOfSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex);
    }

    public void setCachePlOfSrvcCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CachePlOfSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CachePlOfSrvcCd with another Field
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCachePlOfSrvcCd(source);
    }

    /**
     * Update CachePlOfSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CachePlOfSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheBhiKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Returns the value of cacheHipaaCommtTxt
     *
     * @return cacheHipaaCommtTxt
     */
    public char[] getCacheHipaaCommtTxt(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheHipaaCommtTxt();
    }

    /**
     * set variable cacheHipaaCommtTxt
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(value);
    }

    /**
     * Update CacheHipaaCommtTxt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex);
    }

    public void setCacheHipaaCommtTxt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCommtTxt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Test condition "Y" for isCacheKeyOverflowYes()
     *
     * @return Returns true if isCacheKeyOverflowYes() is "Y"
     */
    public boolean isCacheKeyOverflowYes() throws CFException {
      return cacheBhiKeyArea.getCacheKeyFixedArea().isCacheKeyOverflowYes();
    }

    /** set values "Y" */
    public void setCacheKeyOverflowYesTrue() throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyOverflowYesTrue();
    }
    /**
     * Returns the value of cacheSrvcCd
     *
     * @return cacheSrvcCd
     */
    public char[] getCacheSrvcCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheSrvcCd();
    }

    /**
     * set variable cacheSrvcCd
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheSrvcCd(value);
    }

    /**
     * Update CacheSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex);
    }

    public void setCacheSrvcCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheSrvcCd with another Field
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheSrvcCd(source);
    }

    /**
     * Update CacheSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngEndVal
     *
     * @return cacheProcCdRngEndVal
     */
    public char[] getCacheProcCdRngEndVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngEndVal();
    }

    /**
     * set variable cacheProcCdRngEndVal
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(value);
    }

    /**
     * Update CacheProcCdRngEndVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex);
    }

    public void setCacheProcCdRngEndVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngEndVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheTier1NtwkClssCd
     *
     * @return cacheTier1NtwkClssCd
     */
    public char[] getCacheTier1NtwkClssCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheTier1NtwkClssCd();
    }

    /**
     * set variable cacheTier1NtwkClssCd
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(value);
    }

    /**
     * Update CacheTier1NtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex);
    }

    public void setCacheTier1NtwkClssCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngBegnVal
     *
     * @return cacheProcCdRngBegnVal
     */
    public char[] getCacheProcCdRngBegnVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngBegnVal();
    }

    /**
     * set variable cacheProcCdRngBegnVal
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(value);
    }

    /**
     * Update CacheProcCdRngBegnVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex);
    }

    public void setCacheProcCdRngBegnVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheBhiKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheEffDt
     *
     * @return cacheEffDt
     */
    public char[] getCacheEffDt(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheEffDt();
    }

    /**
     * set variable cacheEffDt
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheEffDt(value);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex);
    }

    public void setCacheEffDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheEffDt with another Field
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheEffDt(source);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
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
      str += cacheBhiDataArea.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheBhiKeyArea.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public ProcessCacheInCtx clone() {
      ProcessCacheInCtx cloneObj = new ProcessCacheInCtx();
      cloneObj.cacheBhiDataArea = new CacheBhiDataArea();
      cloneObj.cacheBhiDataArea.set(cacheBhiDataArea.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheInCtx getProcessCacheInCtx() {
    return new ProcessCacheInCtx();
  }

  public class ProcessCacheOutCtx implements Cloneable {
    CacheBhiDataArea cacheBhiDataArea = C5427bhiCtx.this.getCacheBhiDataArea();
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    Work work = C5427bhiCtx.this.getWork();

    /**
     * Returns the value of crtnProcCdRngTypVal
     *
     * @return crtnProcCdRngTypVal
     */
    public char[] getCrtnProcCdRngTypVal() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnProcCdRngTypVal();
    }

    /**
     * set variable crtnProcCdRngTypVal
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngTypVal(value);
    }

    /**
     * Update CrtnProcCdRngTypVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngTypVal(source, sourceIndex);
    }

    public void setCrtnProcCdRngTypVal(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngTypVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnProcCdRngTypVal with another Field
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngTypVal(source);
    }

    /**
     * Update CrtnProcCdRngTypVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngTypVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnProcCdRngTypVal(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheCausCd
     *
     * @return cacheCausCd
     */
    public char[] getCacheCausCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheCausCd();
    }

    /**
     * set variable cacheCausCd
     *
     * @param value
     */
    public void setCacheCausCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCausCd(value);
    }

    /**
     * Update CacheCausCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex);
    }

    public void setCacheCausCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCausCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheCausCd with another Field
     *
     * @param value
     */
    public void setCacheCausCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCausCd(source);
    }

    /**
     * Update CacheCausCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCausCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCausCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnNtwkTypCd
     *
     * @return crtnNtwkTypCd
     */
    public char[] getCrtnNtwkTypCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnNtwkTypCd();
    }

    /**
     * set variable crtnNtwkTypCd
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnNtwkTypCd(value);
    }

    /**
     * Update CrtnNtwkTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnNtwkTypCd(source, sourceIndex);
    }

    public void setCrtnNtwkTypCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnNtwkTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnNtwkTypCd with another Field
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnNtwkTypCd(source);
    }

    /**
     * Update CrtnNtwkTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnNtwkTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnNtwkTypCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of cacheInNtwkClssCd
     *
     * @return cacheInNtwkClssCd
     */
    public char[] getCacheInNtwkClssCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheInNtwkClssCd();
    }

    /**
     * set variable cacheInNtwkClssCd
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheInNtwkClssCd(value);
    }

    /**
     * Update CacheInNtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex);
    }

    public void setCacheInNtwkClssCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheInNtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheInNtwkClssCd with another Field
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source);
    }

    /**
     * Update CacheInNtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheInNtwkClssCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheInNtwkClssCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

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
     * Returns the value of cacheNtwkTypCd
     *
     * @return cacheNtwkTypCd
     */
    public char[] getCacheNtwkTypCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheNtwkTypCd();
    }

    /**
     * set variable cacheNtwkTypCd
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheNtwkTypCd(value);
    }

    /**
     * Update CacheNtwkTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex);
    }

    public void setCacheNtwkTypCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheNtwkTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheNtwkTypCd with another Field
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheNtwkTypCd(source);
    }

    /**
     * Update CacheNtwkTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheNtwkTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheNtwkTypCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheNtwkTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheBenLvlCd
     *
     * @return cacheBenLvlCd
     */
    public char[] getCacheBenLvlCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheBenLvlCd();
    }

    /**
     * set variable cacheBenLvlCd
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheBenLvlCd(value);
    }

    /**
     * Update CacheBenLvlCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex);
    }

    public void setCacheBenLvlCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheBenLvlCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheBenLvlCd with another Field
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheBenLvlCd(source);
    }

    /**
     * Update CacheBenLvlCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheBenLvlCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheBenLvlCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngTypVal
     *
     * @return cacheProcCdRngTypVal
     */
    public char[] getCacheProcCdRngTypVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngTypVal();
    }

    /**
     * set variable cacheProcCdRngTypVal
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(value);
    }

    /**
     * Update CacheProcCdRngTypVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex);
    }

    public void setCacheProcCdRngTypVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngTypVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngTypVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngTypVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngTypVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheCancDt
     *
     * @return cacheCancDt
     */
    public char[] getCacheCancDt(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheCancDt();
    }

    /**
     * set variable cacheCancDt
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCancDt(value);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex);
    }

    public void setCacheCancDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheCancDt with another Field
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheCancDt(source);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheCancDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnProcCdRngBegnVal
     *
     * @return crtnProcCdRngBegnVal
     */
    public char[] getCrtnProcCdRngBegnVal() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnProcCdRngBegnVal();
    }

    /**
     * set variable crtnProcCdRngBegnVal
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngBegnVal(value);
    }

    /**
     * Update CrtnProcCdRngBegnVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngBegnVal(source, sourceIndex);
    }

    public void setCrtnProcCdRngBegnVal(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngBegnVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnProcCdRngBegnVal with another Field
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngBegnVal(source);
    }

    /**
     * Update CrtnProcCdRngBegnVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngBegnVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnProcCdRngBegnVal(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public void setCacheDataNdx(int cacheDataNdx) {
      C5427bhiCtx.this.cacheDataNdx = cacheDataNdx;
    }

    public int getCacheDataNdx() {
      return C5427bhiCtx.this.cacheDataNdx;
    }
    /**
     * Returns the value of crtnSrvcCd
     *
     * @return crtnSrvcCd
     */
    public char[] getCrtnSrvcCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnSrvcCd();
    }

    /**
     * set variable crtnSrvcCd
     *
     * @param value
     */
    public void setCrtnSrvcCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrvcCd(value);
    }

    /**
     * Update CrtnSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnSrvcCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrvcCd(source, sourceIndex);
    }

    public void setCrtnSrvcCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnSrvcCd with another Field
     *
     * @param value
     */
    public void setCrtnSrvcCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrvcCd(source);
    }

    /**
     * Update CrtnSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnSrvcCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProvOrgTypCd
     *
     * @return cacheProvOrgTypCd
     */
    public char[] getCacheProvOrgTypCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProvOrgTypCd();
    }

    /**
     * set variable cacheProvOrgTypCd
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheProvOrgTypCd(value);
    }

    /**
     * Update CacheProvOrgTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex);
    }

    public void setCacheProvOrgTypCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProvOrgTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProvOrgTypCd with another Field
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source);
    }

    /**
     * Update CacheProvOrgTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProvOrgTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProvOrgTypCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cachePlOfSrvcCd
     *
     * @return cachePlOfSrvcCd
     */
    public char[] getCachePlOfSrvcCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCachePlOfSrvcCd();
    }

    /**
     * set variable cachePlOfSrvcCd
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCachePlOfSrvcCd(value);
    }

    /**
     * Update CachePlOfSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex);
    }

    public void setCachePlOfSrvcCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CachePlOfSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CachePlOfSrvcCd with another Field
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCachePlOfSrvcCd(source);
    }

    /**
     * Update CachePlOfSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CachePlOfSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCachePlOfSrvcCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCachePlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnTier1NtwkClssCd
     *
     * @return crtnTier1NtwkClssCd
     */
    public char[] getCrtnTier1NtwkClssCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnTier1NtwkClssCd();
    }

    /**
     * set variable crtnTier1NtwkClssCd
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnTier1NtwkClssCd(value);
    }

    /**
     * Update CrtnTier1NtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnTier1NtwkClssCd(source, sourceIndex);
    }

    public void setCrtnTier1NtwkClssCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnTier1NtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnTier1NtwkClssCd with another Field
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnTier1NtwkClssCd(source);
    }

    /**
     * Update CrtnTier1NtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnTier1NtwkClssCd with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnTier1NtwkClssCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnHipaaCommtTxt
     *
     * @return crtnHipaaCommtTxt
     */
    public char[] getCrtnHipaaCommtTxt() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnHipaaCommtTxt();
    }

    /**
     * set variable crtnHipaaCommtTxt
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCommtTxt(value);
    }

    /**
     * Update CrtnHipaaCommtTxt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCommtTxt(source, sourceIndex);
    }

    public void setCrtnHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCommtTxt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnHipaaCommtTxt with another Field
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCommtTxt(source);
    }

    /**
     * Update CrtnHipaaCommtTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnHipaaCommtTxt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnHipaaCommtTxt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnCancDt
     *
     * @return crtnCancDt
     */
    public char[] getCrtnCancDt() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnCancDt();
    }

    /**
     * set variable crtnCancDt
     *
     * @param value
     */
    public void setCrtnCancDt(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCancDt(value);
    }

    /**
     * Update CrtnCancDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnCancDt(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCancDt(source, sourceIndex);
    }

    public void setCrtnCancDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnCancDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnCancDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnCancDt with another Field
     *
     * @param value
     */
    public void setCrtnCancDt(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCancDt(source);
    }

    /**
     * Update CrtnCancDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnCancDt(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCancDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnCancDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnCancDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnCancDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnProvOrgTypCd
     *
     * @return crtnProvOrgTypCd
     */
    public char[] getCrtnProvOrgTypCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnProvOrgTypCd();
    }

    /**
     * set variable crtnProvOrgTypCd
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProvOrgTypCd(value);
    }

    /**
     * Update CrtnProvOrgTypCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProvOrgTypCd(source, sourceIndex);
    }

    public void setCrtnProvOrgTypCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProvOrgTypCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnProvOrgTypCd with another Field
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProvOrgTypCd(source);
    }

    /**
     * Update CrtnProvOrgTypCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProvOrgTypCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProvOrgTypCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnProvOrgTypCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProvOrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheHipaaCommtTxt
     *
     * @return cacheHipaaCommtTxt
     */
    public char[] getCacheHipaaCommtTxt(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheHipaaCommtTxt();
    }

    /**
     * set variable cacheHipaaCommtTxt
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(value);
    }

    /**
     * Update CacheHipaaCommtTxt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex);
    }

    public void setCacheHipaaCommtTxt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCommtTxt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheHipaaCommtTxt with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheHipaaCommtTxt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheHipaaCommtTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheSrvcCd
     *
     * @return cacheSrvcCd
     */
    public char[] getCacheSrvcCd(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheSrvcCd();
    }

    /**
     * set variable cacheSrvcCd
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheSrvcCd(value);
    }

    /**
     * Update CacheSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex);
    }

    public void setCacheSrvcCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheSrvcCd with another Field
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheSrvcCd(source);
    }

    /**
     * Update CacheSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheSrvcCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnCausCd
     *
     * @return crtnCausCd
     */
    public char[] getCrtnCausCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnCausCd();
    }

    /**
     * set variable crtnCausCd
     *
     * @param value
     */
    public void setCrtnCausCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCausCd(value);
    }

    /**
     * Update CrtnCausCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnCausCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCausCd(source, sourceIndex);
    }

    public void setCrtnCausCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnCausCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnCausCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnCausCd with another Field
     *
     * @param value
     */
    public void setCrtnCausCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCausCd(source);
    }

    /**
     * Update CrtnCausCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnCausCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnCausCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnCausCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnCausCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnCausCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngEndVal
     *
     * @return cacheProcCdRngEndVal
     */
    public char[] getCacheProcCdRngEndVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngEndVal();
    }

    /**
     * set variable cacheProcCdRngEndVal
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(value);
    }

    /**
     * Update CacheProcCdRngEndVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex);
    }

    public void setCacheProcCdRngEndVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngEndVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngEndVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngEndVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheTier1NtwkClssCd
     *
     * @return cacheTier1NtwkClssCd
     */
    public char[] getCacheTier1NtwkClssCd(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheTier1NtwkClssCd();
    }

    /**
     * set variable cacheTier1NtwkClssCd
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(value);
    }

    /**
     * Update CacheTier1NtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex);
    }

    public void setCacheTier1NtwkClssCd(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheTier1NtwkClssCd with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheTier1NtwkClssCd(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheTier1NtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnProcCdRngEndVal
     *
     * @return crtnProcCdRngEndVal
     */
    public char[] getCrtnProcCdRngEndVal() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnProcCdRngEndVal();
    }

    /**
     * set variable crtnProcCdRngEndVal
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngEndVal(value);
    }

    /**
     * Update CrtnProcCdRngEndVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngEndVal(source, sourceIndex);
    }

    public void setCrtnProcCdRngEndVal(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngEndVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnProcCdRngEndVal with another Field
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngEndVal(source);
    }

    /**
     * Update CrtnProcCdRngEndVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnProcCdRngEndVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnProcCdRngEndVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCrtnProcCdRngEndVal(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnProcCdRngEndVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnPlOfSrvcCd
     *
     * @return crtnPlOfSrvcCd
     */
    public char[] getCrtnPlOfSrvcCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnPlOfSrvcCd();
    }

    /**
     * set variable crtnPlOfSrvcCd
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnPlOfSrvcCd(value);
    }

    /**
     * Update CrtnPlOfSrvcCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnPlOfSrvcCd(source, sourceIndex);
    }

    public void setCrtnPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnPlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnPlOfSrvcCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnPlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnPlOfSrvcCd with another Field
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnPlOfSrvcCd(source);
    }

    /**
     * Update CrtnPlOfSrvcCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnPlOfSrvcCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnPlOfSrvcCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnPlOfSrvcCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnPlOfSrvcCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheProcCdRngBegnVal
     *
     * @return cacheProcCdRngBegnVal
     */
    public char[] getCacheProcCdRngBegnVal(int index) throws CFException {
      return cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .getCacheProcCdRngBegnVal();
    }

    /**
     * set variable cacheProcCdRngBegnVal
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, char[] value) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(value);
    }

    /**
     * Update CacheProcCdRngBegnVal with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, char[] source, int sourceIndex)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex);
    }

    public void setCacheProcCdRngBegnVal(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, Field source) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheProcCdRngBegnVal with another Field from an offset and length to an offset and
     * length
     *
     * @param value
     */
    public void setCacheProcCdRngBegnVal(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheProcCdRngBegnVal(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of cacheEffDt
     *
     * @return cacheEffDt
     */
    public char[] getCacheEffDt(int index) throws CFException {
      return cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).getCacheEffDt();
    }

    /**
     * set variable cacheEffDt
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] value) throws CFException {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheEffDt(value);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, char[] source, int sourceIndex) throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex);
    }

    public void setCacheEffDt(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheEffDt with another Field
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source) {
      cacheBhiDataArea.getCacheDataArrayArea().getCacheDataArray(index).setCacheEffDt(source);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheEffDt(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiDataArea
          .getCacheDataArrayArea()
          .getCacheDataArray(index)
          .setCacheEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Returns the value of crtnBenLvlCd
     *
     * @return crtnBenLvlCd
     */
    public char[] getCrtnBenLvlCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnBenLvlCd();
    }

    /**
     * set variable crtnBenLvlCd
     *
     * @param value
     */
    public void setCrtnBenLvlCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnBenLvlCd(value);
    }

    /**
     * Update CrtnBenLvlCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnBenLvlCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnBenLvlCd(source, sourceIndex);
    }

    public void setCrtnBenLvlCd(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnBenLvlCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnBenLvlCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnBenLvlCd with another Field
     *
     * @param value
     */
    public void setCrtnBenLvlCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnBenLvlCd(source);
    }

    /**
     * Update CrtnBenLvlCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnBenLvlCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnBenLvlCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnBenLvlCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnBenLvlCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnBenLvlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of crtnEffDt
     *
     * @return crtnEffDt
     */
    public char[] getCrtnEffDt() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnEffDt();
    }

    /**
     * set variable crtnEffDt
     *
     * @param value
     */
    public void setCrtnEffDt(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnEffDt(value);
    }

    /**
     * Update CrtnEffDt with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnEffDt(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnEffDt(source, sourceIndex);
    }

    public void setCrtnEffDt(char[] source, int sourceIndex, int sourceLen) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnEffDt with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnEffDt(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnEffDt with another Field
     *
     * @param value
     */
    public void setCrtnEffDt(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnEffDt(source);
    }

    /**
     * Update CrtnEffDt with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnEffDt(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnEffDt(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnEffDt with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnEffDt(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
     * Returns the value of crtnInNtwkClssCd
     *
     * @return crtnInNtwkClssCd
     */
    public char[] getCrtnInNtwkClssCd() throws CFException {
      return dfhcommarea.getCrtnSrchReturnArea().getCrtnInNtwkClssCd();
    }

    /**
     * set variable crtnInNtwkClssCd
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(char[] value) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnInNtwkClssCd(value);
    }

    /**
     * Update CrtnInNtwkClssCd with a char[] from an offset and length
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnInNtwkClssCd(source, sourceIndex);
    }

    public void setCrtnInNtwkClssCd(char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnInNtwkClssCd with a char[] from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(
        char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CrtnInNtwkClssCd with another Field
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(Field source) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnInNtwkClssCd(source);
    }

    /**
     * Update CrtnInNtwkClssCd with another Field from an offset and length
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
      dfhcommarea.getCrtnSrchReturnArea().setCrtnInNtwkClssCd(source, sourceIndex, sourceLen);
    }

    /**
     * Update CrtnInNtwkClssCd with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCrtnInNtwkClssCd(
        Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      dfhcommarea
          .getCrtnSrchReturnArea()
          .setCrtnInNtwkClssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null) return false;
      return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
      String str = "";
      str += cacheBhiDataArea.hashCode();
      str += dfhcommarea.hashCode();
      str += cacheBhiKeyArea.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public ProcessCacheOutCtx clone() {
      ProcessCacheOutCtx cloneObj = new ProcessCacheOutCtx();
      cloneObj.cacheBhiDataArea = new CacheBhiDataArea();
      cloneObj.cacheBhiDataArea.set(cacheBhiDataArea.getClonedField());
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public ProcessCacheOutCtx getProcessCacheOutCtx() {
    return new ProcessCacheOutCtx();
  }

  public class SearchCacheInCtx implements Cloneable {
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    Work work = C5427bhiCtx.this.getWork();

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
     * Returns the value of cacheKeyCnt
     *
     * @return cacheKeyCnt
     */
    public int getCacheKeyCnt() throws CFException {
      return cacheBhiKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
    }

    /**
     * Returns the value of cacheKeyArea
     *
     * @return cacheKeyArea
     */
    public CacheKeyArea getCacheKeyArea(int index) {
      return cacheBhiKeyArea.getCacheKeyArray(index).getCacheKeyArea();
    }

    /**
     * Update CacheKeyArea with the passed value
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] value) throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(value);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, char[] source, int sourceIndex, int sourceLen)
        throws CFException {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with a String from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
    }

    /**
     * Update CacheKeyArea with another Field
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source) {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(int index, Field source, int sourceIndex, int sourceLen) {
      cacheBhiKeyArea.getCacheKeyArray(index).setCacheKeyArea(source, sourceIndex, sourceLen);
    }

    /**
     * Update CacheKeyArea with another Field from an offset and length to an offset and length
     *
     * @param value
     */
    public void setCacheKeyArea(
        int index, Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
      cacheBhiKeyArea
          .getCacheKeyArray(index)
          .setCacheKeyArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
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
      str += dfhcommarea.hashCode();
      str += cacheBhiKeyArea.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public SearchCacheInCtx clone() {
      SearchCacheInCtx cloneObj = new SearchCacheInCtx();
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheInCtx getSearchCacheInCtx() {
    return new SearchCacheInCtx();
  }

  public class SearchCacheOutCtx implements Cloneable {
    Dfhcommarea dfhcommarea = C5427bhiCtx.this.getDfhcommarea();
    CacheBhiKeyArea cacheBhiKeyArea = C5427bhiCtx.this.getCacheBhiKeyArea();
    Work work = C5427bhiCtx.this.getWork();

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
      return cacheBhiKeyArea.getCacheKeyFixedArea().getCacheKeyCnt();
    }

    /**
     * Update CacheKeyCnt with the passed value
     *
     * @param number
     */
    public void setCacheKeyCnt(int number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt(number);
    }

    public void setCacheKeyCnt(long number) throws CFException {
      cacheBhiKeyArea.getCacheKeyFixedArea().setCacheKeyCnt((int) number);
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
      C5427bhiCtx.this.cacheKeyNdx = cacheKeyNdx;
    }

    public int getCacheKeyNdx() {
      return C5427bhiCtx.this.cacheKeyNdx;
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

    public C5427bhiCtx getC5427bhiCtx() {
      return C5427bhiCtx.this;
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
      str += cacheBhiKeyArea.hashCode();
      str += work.hashCode();
      return str.hashCode();
    }

    public SearchCacheOutCtx clone() {
      SearchCacheOutCtx cloneObj = new SearchCacheOutCtx();
      cloneObj.dfhcommarea = new Dfhcommarea();
      cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
      cloneObj.cacheBhiKeyArea = new CacheBhiKeyArea();
      cloneObj.cacheBhiKeyArea.set(cacheBhiKeyArea.getClonedField());
      cloneObj.work = new Work();
      cloneObj.work.set(work.getClonedField());
      return cloneObj;
    }
  }

  public SearchCacheOutCtx getSearchCacheOutCtx() {
    return new SearchCacheOutCtx();
  }
}
