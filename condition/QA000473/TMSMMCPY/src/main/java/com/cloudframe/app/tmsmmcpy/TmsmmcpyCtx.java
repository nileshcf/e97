package com.cloudframe.app.tmsmmcpy;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.tmsmmcpy.dto.SortKey;
import com.cloudframe.app.tmsmmcpy.dto.WorkFieldGroup;
import com.cloudframe.app.tmsmmcpy.file.records.SortRecord;
import com.cloudframe.app.tmsmmcpy.dto.SmmRec;
import com.cloudframe.app.tmsmmcpy.file.records.SmmRecord;
import com.cloudframe.app.tmsmmcpy.file.records.SmmRecordOut;
import com.cloudframe.app.tmsmmcpy.dto.Work;


@Context
public class TmsmmcpyCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    SmmRecord smmRecord;
    SmmRecordOut smmRecordOut;
    SortRecord sortRecord;
    WorkFieldGroup workFieldGroup;
    SortKey sortKey;
    SmmRec smmRec;
    Work work;


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



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }

    boolean loopOutputSmm = true;

    public boolean getLoopOutputSmm() {
        return this.loopOutputSmm;
    }

    public void setLoopOutputSmm(boolean loopOutputSmm) {
            this.loopOutputSmm = loopOutputSmm;
        }

    public SmmRecord getSmmRecord() {
        if (smmRecord == null) {
            smmRecord = new SmmRecord();
        }

        return smmRecord;
    }

    public void setSmmRecord(SmmRecord smmRecord) {
        this.smmRecord = smmRecord;
    }
    public SmmRecordOut getSmmRecordOut() {
        if (smmRecordOut == null) {
            smmRecordOut = new SmmRecordOut();
        }

        return smmRecordOut;
    }

    public void setSmmRecordOut(SmmRecordOut smmRecordOut) {
        this.smmRecordOut = smmRecordOut;
    }
    public SortRecord getSortRecord() {
        if (sortRecord == null) {
            sortRecord = new SortRecord();
        }

        return sortRecord;
    }

    public void setSortRecord(SortRecord sortRecord) {
        this.sortRecord = sortRecord;
    }
    public WorkFieldGroup getWorkFieldGroup() {
        if (workFieldGroup == null) {
            workFieldGroup = new WorkFieldGroup();
        }

        return workFieldGroup;
    }

    public void setWorkFieldGroup(WorkFieldGroup workFieldGroup) {
        this.workFieldGroup = workFieldGroup;
    }
    public SortKey getSortKey() {
        if (sortKey == null) {
            sortKey = new SortKey();
        }

        return sortKey;
    }

    public void setSortKey(SortKey sortKey) {
        this.sortKey = sortKey;
    }
    public SmmRec getSmmRec() {
        if (smmRec == null) {
            smmRec = new SmmRec();
        }

        return smmRec;
    }

    public void setSmmRec(SmmRec smmRec) {
        this.smmRec = smmRec;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += smmRecordOut.hashCode();
        str += sortRecord.hashCode();
        str += workFieldGroup.hashCode();
        str += sortKey.hashCode();
        str += smmRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TmsmmcpyCtx clone() {
        TmsmmcpyCtx cloneObj = new TmsmmcpyCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.smmRecordOut = new SmmRecordOut();
        cloneObj.smmRecordOut.set(smmRecordOut.getClonedField());
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.workFieldGroup = new WorkFieldGroup();
        cloneObj.workFieldGroup.set(workFieldGroup.getClonedField());
        cloneObj.sortKey = new SortKey();
        cloneObj.sortKey.set(sortKey.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     Work work = TmsmmcpyCtx.this.getWork();

	/**
	 *	Returns the value of sortKey01
	 *	@return sortKey01
	 */
   public char[] getSortKey01() throws CFException  {              
   		return sortRecord.getSortKey01();
   }

  
	/**
	*  set variable sortKey01
	*  @param value
	**/
   public void setSortKey01(char[] value) throws CFException {
      sortRecord.setSortKey01(value);
   } 

     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex) throws CFException {
      sortRecord.setSortKey01(source, sourceIndex);
   	
   }
   
   public void setSortKey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortKey01 with another Field
	 *	@param value
	 */
   public void setSortKey01(Field source) {
      sortRecord.setSortKey01(source);
   }  
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortRecord
	 *	@return sortRecord
	 */   
	 public SortRecord getSortRecord() {
   	return sortRecord;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
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
        str += sortRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     Work work = TmsmmcpyCtx.this.getWork();

	/**
	 *	Returns the value of endSw
	 *	@return endSw
	 */
   public char[] getEndSw() throws CFException  {              
   		return work.getEndSw();
   }

  
	/**
	*  set variable endSw
	*  @param value
	**/
   public void setEndSw(char[] value) throws CFException {
      work.setEndSw(value);
   } 


        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitializationInCtx implements Cloneable {
     SmmRecord smmRecord = TmsmmcpyCtx.this.getSmmRecord();
     SmmRecordOut smmRecordOut = TmsmmcpyCtx.this.getSmmRecordOut();

	/**
	 *	Returns the value of smmRecord
	 *	@return smmRecord
	 */   
	 public SmmRecord getSmmRecord() {
   	return smmRecord;
   }


	/**
	 *	Returns the value of smmRecordOut
	 *	@return smmRecordOut
	 */   
	 public SmmRecordOut getSmmRecordOut() {
   	return smmRecordOut;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += smmRecordOut.hashCode();
       return str.hashCode();
    }

    public InitializationInCtx clone() {
        InitializationInCtx cloneObj = new InitializationInCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.smmRecordOut = new SmmRecordOut();
        cloneObj.smmRecordOut.set(smmRecordOut.getClonedField());
        return cloneObj;
    }

    }

    public InitializationInCtx getInitializationInCtx() {
            return new InitializationInCtx();
    }
     public class ReadSmmInCtx implements Cloneable {
     Work work = TmsmmcpyCtx.this.getWork();

	/**
	 *	Test condition "Y" for isSmmEof()
	 *	@return  Returns true if isSmmEof() is "Y"
	 */
   public boolean isSmmEof() throws CFException {
      return work.isSmmEof();
   }

	/**
	*  set values "Y"
	*/
   	public void setSmmEofTrue()  throws CFException{  			
    	work.setSmmEofTrue();
   	}

        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
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

    public ReadSmmInCtx clone() {
        ReadSmmInCtx cloneObj = new ReadSmmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadSmmInCtx getReadSmmInCtx() {
            return new ReadSmmInCtx();
    }
     public class ReadAndProcessSmmInCtx implements Cloneable {
     SmmRecord smmRecord = TmsmmcpyCtx.this.getSmmRecord();
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     WorkFieldGroup workFieldGroup = TmsmmcpyCtx.this.getWorkFieldGroup();
     SortKey sortKey = TmsmmcpyCtx.this.getSortKey();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();
     Work work = TmsmmcpyCtx.this.getWork();

	/**
	 *	Returns the value of smmField1
	 *	@return smmField1
	 */
   public char[] getSmmField1() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField1();
   }

  
	/**
	*  set variable smmField1
	*  @param value
	**/
   public void setSmmField1(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField1(value);
   } 

     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex);
   	
   }
   
   public void setSmmField1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField1 with another Field
	 *	@param value
	 */
   public void setSmmField1(Field source) {
      smmRec.getSmmKey().setSmmField1(source);
   }  
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getSmmRecordsRead() throws CFException {  
        return work.getSmmRecordsRead();
}
	/**
	 * 	Update SmmRecordsRead with the passed value
	 *	@param number
	 */
	public void setSmmRecordsRead(int number)  throws CFException{
		work.setSmmRecordsRead(number);
	}


	public void setSmmRecordsRead(long number)  throws CFException{
	    work.setSmmRecordsRead(number);
	}
	

	/**
	 *	Returns the value of smmEnd
	 *	@return smmEnd
	 */
   public char[] getSmmEnd() throws CFException  {              
   		return smmRec.getSmmEnd();
   }

  
	/**
	*  set variable smmEnd
	*  @param value
	**/
   public void setSmmEnd(char[] value) throws CFException {
      smmRec.setSmmEnd(value);
   } 

     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmEnd(source, sourceIndex);
   	
   }
   
   public void setSmmEnd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmEnd with another Field
	 *	@param value
	 */
   public void setSmmEnd(Field source) {
      smmRec.setSmmEnd(source);
   }  
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortKey
	 *	@return sortKey
	 */   
	 public SortKey getSortKey() {
   	return sortKey;
   }


	/**
	 *	Returns the value of smmBatchKey
	 *	@return smmBatchKey
	 */
   public char[] getSmmBatchKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmBatchKey();
   }

  
	/**
	*  set variable smmBatchKey
	*  @param value
	**/
   public void setSmmBatchKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(value);
   } 

     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex);
   	
   }
   
   public void setSmmBatchKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBatchKey with another Field
	 *	@param value
	 */
   public void setSmmBatchKey(Field source) {
      smmRec.getSmmKey().setSmmBatchKey(source);
   }  
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDataserverId
	 *	@return smmDataserverId
	 */
   public char[] getSmmDataserverId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDataserverId();
   }

  
	/**
	*  set variable smmDataserverId
	*  @param value
	**/
   public void setSmmDataserverId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(value);
   } 

     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex);
   	
   }
   
   public void setSmmDataserverId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDataserverId with another Field
	 *	@param value
	 */
   public void setSmmDataserverId(Field source) {
      smmRec.getSmmKey().setSmmDataserverId(source);
   }  
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmExtCapXptId
	 *	@return smmExtCapXptId
	 */
   public char[] getSmmExtCapXptId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmExtCapXptId();
   }

  
	/**
	*  set variable smmExtCapXptId
	*  @param value
	**/
   public void setSmmExtCapXptId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(value);
   } 

     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex);
   	
   }
   
   public void setSmmExtCapXptId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmExtCapXptId with another Field
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source) {
      smmRec.getSmmKey().setSmmExtCapXptId(source);
   }  
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDdrKey
	 *	@return smmDdrKey
	 */
   public char[] getSmmDdrKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDdrKey();
   }

  
	/**
	*  set variable smmDdrKey
	*  @param value
	**/
   public void setSmmDdrKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(value);
   } 

     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDdrKey with another Field
	 *	@param value
	 */
   public void setSmmDdrKey(Field source) {
      smmRec.getSmmKey().setSmmDdrKey(source);
   }  
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortRecord
	 *	@return sortRecord
	 */   
	 public SortRecord getSortRecord() {
   	return sortRecord;
   }


public long getInvalidSmmCnt() throws CFException {  
        return work.getInvalidSmmCnt();
}
	/**
	 * 	Update InvalidSmmCnt with the passed value
	 *	@param number
	 */
	public void setInvalidSmmCnt(long number)  throws CFException{
		work.setInvalidSmmCnt(number);
	}



	/**
	 *	Returns the value of workFieldGroup
	 *	@return workFieldGroup
	 */   
	 public WorkFieldGroup getWorkFieldGroup() {
   	return workFieldGroup;
   }


	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField3();
   }

  
	/**
	*  set variable smmField3
	*  @param value
	**/
   public void setSmmField3(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField3(value);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
      smmRec.getSmmKey().setSmmField3(source);
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRec
	 *	@return smmRec
	 */   
	 public SmmRec getSmmRec() {
   	return smmRec;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }

        public ReadAndProcessSmmOutCtx getReadAndProcessSmmOutCtx() {
            return new ReadAndProcessSmmOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += sortRecord.hashCode();
        str += workFieldGroup.hashCode();
        str += sortKey.hashCode();
        str += smmRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadAndProcessSmmInCtx clone() {
        ReadAndProcessSmmInCtx cloneObj = new ReadAndProcessSmmInCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.workFieldGroup = new WorkFieldGroup();
        cloneObj.workFieldGroup.set(workFieldGroup.getClonedField());
        cloneObj.sortKey = new SortKey();
        cloneObj.sortKey.set(sortKey.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadAndProcessSmmInCtx getReadAndProcessSmmInCtx() {
            return new ReadAndProcessSmmInCtx();
    }
     public class ReadAndProcessSmmOutCtx implements Cloneable {
     SmmRecord smmRecord = TmsmmcpyCtx.this.getSmmRecord();
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     WorkFieldGroup workFieldGroup = TmsmmcpyCtx.this.getWorkFieldGroup();
     SortKey sortKey = TmsmmcpyCtx.this.getSortKey();
     Work work = TmsmmcpyCtx.this.getWork();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();

	/**
	 *	Returns the value of sortExtCapXptId
	 *	@return sortExtCapXptId
	 */
   public char[] getSortExtCapXptId() throws CFException  {              
   		return sortKey.getSortExtCapXptId();
   }

  
	/**
	*  set variable sortExtCapXptId
	*  @param value
	**/
   public void setSortExtCapXptId(char[] value) throws CFException {
      sortKey.setSortExtCapXptId(value);
   } 

     /**
	 * 	Update SortExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortExtCapXptId(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortExtCapXptId(source, sourceIndex);
   	
   }
   
   public void setSortExtCapXptId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortExtCapXptId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortExtCapXptId with another Field
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source) {
      sortKey.setSortExtCapXptId(source);
   }  
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortExtCapXptId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField1
	 *	@return smmField1
	 */
   public char[] getSmmField1() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField1();
   }

  
	/**
	*  set variable smmField1
	*  @param value
	**/
   public void setSmmField1(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField1(value);
   } 

     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex);
   	
   }
   
   public void setSmmField1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField1 with another Field
	 *	@param value
	 */
   public void setSmmField1(Field source) {
      smmRec.getSmmKey().setSmmField1(source);
   }  
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortDdrKey
	 *	@return sortDdrKey
	 */
   public char[] getSortDdrKey() throws CFException  {              
   		return sortKey.getSortDdrKey();
   }

  
	/**
	*  set variable sortDdrKey
	*  @param value
	**/
   public void setSortDdrKey(char[] value) throws CFException {
      sortKey.setSortDdrKey(value);
   } 

     /**
	 * 	Update SortDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortDdrKey(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortDdrKey(source, sourceIndex);
   	
   }
   
   public void setSortDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortDdrKey with another Field
	 *	@param value
	 */
   public void setSortDdrKey(Field source) {
      sortKey.setSortDdrKey(source);
   }  
   
     /**
	 * 	Update SortDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortDdrKey(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortDsrvId
	 *	@return sortDsrvId
	 */
   public char[] getSortDsrvId() throws CFException  {              
   		return sortKey.getSortDsrvId();
   }

  
	/**
	*  set variable sortDsrvId
	*  @param value
	**/
   public void setSortDsrvId(char[] value) throws CFException {
      sortKey.setSortDsrvId(value);
   } 

     /**
	 * 	Update SortDsrvId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortDsrvId(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortDsrvId(source, sourceIndex);
   	
   }
   
   public void setSortDsrvId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortDsrvId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortDsrvId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortDsrvId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortDsrvId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortDsrvId with another Field
	 *	@param value
	 */
   public void setSortDsrvId(Field source) {
      sortKey.setSortDsrvId(source);
   }  
   
     /**
	 * 	Update SortDsrvId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortDsrvId(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortDsrvId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortDsrvId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortDsrvId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortDsrvId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isSmmNotEof()
	 *	@return  Returns true if isSmmNotEof() is "N"
	 */
   public boolean isSmmNotEof() throws CFException {
      return work.isSmmNotEof();
   }

	/**
	*  set values "N"
	*/
   	public void setSmmNotEofTrue()  throws CFException{  			
    	work.setSmmNotEofTrue();
   	}
public int getSmmRecordsRead() throws CFException {  
        return work.getSmmRecordsRead();
}
	/**
	 * 	Update SmmRecordsRead with the passed value
	 *	@param number
	 */
	public void setSmmRecordsRead(int number)  throws CFException{
		work.setSmmRecordsRead(number);
	}


	public void setSmmRecordsRead(long number)  throws CFException{
	    work.setSmmRecordsRead(number);
	}
	

	/**
	 *	Returns the value of sortKey
	 *	@return sortKey
	 */   
	 public SortKey getSortKey() {
   	return sortKey;
   }


	/**
	 *	Returns the value of smmBatchKey
	 *	@return smmBatchKey
	 */
   public char[] getSmmBatchKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmBatchKey();
   }

  
	/**
	*  set variable smmBatchKey
	*  @param value
	**/
   public void setSmmBatchKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(value);
   } 

     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex);
   	
   }
   
   public void setSmmBatchKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBatchKey with another Field
	 *	@param value
	 */
   public void setSmmBatchKey(Field source) {
      smmRec.getSmmKey().setSmmBatchKey(source);
   }  
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDataserverId
	 *	@return smmDataserverId
	 */
   public char[] getSmmDataserverId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDataserverId();
   }

  
	/**
	*  set variable smmDataserverId
	*  @param value
	**/
   public void setSmmDataserverId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(value);
   } 

     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex);
   	
   }
   
   public void setSmmDataserverId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDataserverId with another Field
	 *	@param value
	 */
   public void setSmmDataserverId(Field source) {
      smmRec.getSmmKey().setSmmDataserverId(source);
   }  
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmExtCapXptId
	 *	@return smmExtCapXptId
	 */
   public char[] getSmmExtCapXptId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmExtCapXptId();
   }

  
	/**
	*  set variable smmExtCapXptId
	*  @param value
	**/
   public void setSmmExtCapXptId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(value);
   } 

     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex);
   	
   }
   
   public void setSmmExtCapXptId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmExtCapXptId with another Field
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source) {
      smmRec.getSmmKey().setSmmExtCapXptId(source);
   }  
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDdrKey
	 *	@return smmDdrKey
	 */
   public char[] getSmmDdrKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDdrKey();
   }

  
	/**
	*  set variable smmDdrKey
	*  @param value
	**/
   public void setSmmDdrKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(value);
   } 

     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDdrKey with another Field
	 *	@param value
	 */
   public void setSmmDdrKey(Field source) {
      smmRec.getSmmKey().setSmmDdrKey(source);
   }  
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of workField
	 *	@return workField
	 */
   public char[] getWorkField() throws CFException  {              
   		return workFieldGroup.getWorkField();
   }

  
	/**
	*  set variable workField
	*  @param value
	**/
   public void setWorkField(char[] value) throws CFException {
      workFieldGroup.setWorkField(value);
   } 

     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex) throws CFException {
      workFieldGroup.setWorkField(source, sourceIndex);
   	
   }
   
   public void setWorkField(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WorkField with another Field
	 *	@param value
	 */
   public void setWorkField(Field source) {
      workFieldGroup.setWorkField(source);
   }  
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRecord
	 *	@return smmRecord
	 */   
	 public SmmRecord getSmmRecord() {
   	return smmRecord;
   }


	/**
	 *	Returns the value of sortKey01
	 *	@return sortKey01
	 */
   public char[] getSortKey01() throws CFException  {              
   		return sortRecord.getSortKey01();
   }

  
	/**
	*  set variable sortKey01
	*  @param value
	**/
   public void setSortKey01(char[] value) throws CFException {
      sortRecord.setSortKey01(value);
   } 

     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex) throws CFException {
      sortRecord.setSortKey01(source, sourceIndex);
   	
   }
   
   public void setSortKey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortKey01 with another Field
	 *	@param value
	 */
   public void setSortKey01(Field source) {
      sortRecord.setSortKey01(source);
   }  
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortRecord
	 *	@return sortRecord
	 */   
	 public SortRecord getSortRecord() {
   	return sortRecord;
   }


	/**
	 *	Test condition "Y" for isSmmEof()
	 *	@return  Returns true if isSmmEof() is "Y"
	 */
   public boolean isSmmEof() throws CFException {
      return work.isSmmEof();
   }

	/**
	*  set values "Y"
	*/
   	public void setSmmEofTrue()  throws CFException{  			
    	work.setSmmEofTrue();
   	}
public long getInvalidSmmCnt() throws CFException {  
        return work.getInvalidSmmCnt();
}
	/**
	 * 	Update InvalidSmmCnt with the passed value
	 *	@param number
	 */
	public void setInvalidSmmCnt(long number)  throws CFException{
		work.setInvalidSmmCnt(number);
	}



	/**
	 *	Returns the value of sortField3
	 *	@return sortField3
	 */
   public char[] getSortField3() throws CFException  {              
   		return sortKey.getSortField3();
   }

  
	/**
	*  set variable sortField3
	*  @param value
	**/
   public void setSortField3(char[] value) throws CFException {
      sortKey.setSortField3(value);
   } 

     /**
	 * 	Update SortField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortField3(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortField3(source, sourceIndex);
   	
   }
   
   public void setSortField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortField3 with another Field
	 *	@param value
	 */
   public void setSortField3(Field source) {
      sortKey.setSortField3(source);
   }  
   
     /**
	 * 	Update SortField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortField3(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortField1
	 *	@return sortField1
	 */
   public char[] getSortField1() throws CFException  {              
   		return sortKey.getSortField1();
   }

  
	/**
	*  set variable sortField1
	*  @param value
	**/
   public void setSortField1(char[] value) throws CFException {
      sortKey.setSortField1(value);
   } 

     /**
	 * 	Update SortField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortField1(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortField1(source, sourceIndex);
   	
   }
   
   public void setSortField1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortField1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortField1 with another Field
	 *	@param value
	 */
   public void setSortField1(Field source) {
      sortKey.setSortField1(source);
   }  
   
     /**
	 * 	Update SortField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortField1(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortField1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortBatchKey
	 *	@return sortBatchKey
	 */
   public char[] getSortBatchKey() throws CFException  {              
   		return sortKey.getSortBatchKey();
   }

  
	/**
	*  set variable sortBatchKey
	*  @param value
	**/
   public void setSortBatchKey(char[] value) throws CFException {
      sortKey.setSortBatchKey(value);
   } 

     /**
	 * 	Update SortBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortBatchKey(char[] source, int sourceIndex) throws CFException {
      sortKey.setSortBatchKey(source, sourceIndex);
   	
   }
   
   public void setSortBatchKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKey.setSortBatchKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortBatchKey with another Field
	 *	@param value
	 */
   public void setSortBatchKey(Field source) {
      sortKey.setSortBatchKey(source);
   }  
   
     /**
	 * 	Update SortBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortBatchKey(Field source, int sourceIndex,int sourceLen) {
      sortKey.setSortBatchKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKey.setSortBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField3();
   }

  
	/**
	*  set variable smmField3
	*  @param value
	**/
   public void setSmmField3(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField3(value);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
      smmRec.getSmmKey().setSmmField3(source);
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRec
	 *	@return smmRec
	 */   
	 public SmmRec getSmmRec() {
   	return smmRec;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += sortRecord.hashCode();
        str += workFieldGroup.hashCode();
        str += sortKey.hashCode();
        str += work.hashCode();
        str += smmRec.hashCode();
       return str.hashCode();
    }

    public ReadAndProcessSmmOutCtx clone() {
        ReadAndProcessSmmOutCtx cloneObj = new ReadAndProcessSmmOutCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.workFieldGroup = new WorkFieldGroup();
        cloneObj.workFieldGroup.set(workFieldGroup.getClonedField());
        cloneObj.sortKey = new SortKey();
        cloneObj.sortKey.set(sortKey.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        return cloneObj;
    }

    }

    public ReadAndProcessSmmOutCtx getReadAndProcessSmmOutCtx() {
            return new ReadAndProcessSmmOutCtx();
    }
     public class ReformatFieldInCtx implements Cloneable {
     WorkFieldGroup workFieldGroup = TmsmmcpyCtx.this.getWorkFieldGroup();

	/**
	 *	Returns the value of workField
	 *	@return workField
	 */
   public char[] getWorkField() throws CFException  {              
   		return workFieldGroup.getWorkField();
   }

  
	/**
	*  set variable workField
	*  @param value
	**/
   public void setWorkField(char[] value) throws CFException {
      workFieldGroup.setWorkField(value);
   } 

     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex) throws CFException {
      workFieldGroup.setWorkField(source, sourceIndex);
   	
   }
   
   public void setWorkField(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WorkField with another Field
	 *	@param value
	 */
   public void setWorkField(Field source) {
      workFieldGroup.setWorkField(source);
   }  
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of workFieldGroup
	 *	@return workFieldGroup
	 */   
	 public WorkFieldGroup getWorkFieldGroup() {
   	return workFieldGroup;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }

        public ReformatFieldOutCtx getReformatFieldOutCtx() {
            return new ReformatFieldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workFieldGroup.hashCode();
       return str.hashCode();
    }

    public ReformatFieldInCtx clone() {
        ReformatFieldInCtx cloneObj = new ReformatFieldInCtx();
        cloneObj.workFieldGroup = new WorkFieldGroup();
        cloneObj.workFieldGroup.set(workFieldGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReformatFieldInCtx getReformatFieldInCtx() {
            return new ReformatFieldInCtx();
    }
     public class ReformatFieldOutCtx implements Cloneable {
     WorkFieldGroup workFieldGroup = TmsmmcpyCtx.this.getWorkFieldGroup();

	/**
	 *	Returns the value of workField
	 *	@return workField
	 */
   public char[] getWorkField() throws CFException  {              
   		return workFieldGroup.getWorkField();
   }

  
	/**
	*  set variable workField
	*  @param value
	**/
   public void setWorkField(char[] value) throws CFException {
      workFieldGroup.setWorkField(value);
   } 

     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex) throws CFException {
      workFieldGroup.setWorkField(source, sourceIndex);
   	
   }
   
   public void setWorkField(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WorkField with another Field
	 *	@param value
	 */
   public void setWorkField(Field source) {
      workFieldGroup.setWorkField(source);
   }  
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workFieldGroup.setWorkField(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of workFieldGroup
	 *	@return workFieldGroup
	 */   
	 public WorkFieldGroup getWorkFieldGroup() {
   	return workFieldGroup;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workFieldGroup.hashCode();
       return str.hashCode();
    }

    public ReformatFieldOutCtx clone() {
        ReformatFieldOutCtx cloneObj = new ReformatFieldOutCtx();
        cloneObj.workFieldGroup = new WorkFieldGroup();
        cloneObj.workFieldGroup.set(workFieldGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReformatFieldOutCtx getReformatFieldOutCtx() {
            return new ReformatFieldOutCtx();
    }
     public class OutputSmmInCtx implements Cloneable {
     SmmRecordOut smmRecordOut = TmsmmcpyCtx.this.getSmmRecordOut();
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     SortKey sortKey = TmsmmcpyCtx.this.getSortKey();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();
     Work work = TmsmmcpyCtx.this.getWork();

	/**
	 *	Returns the value of sortKey01
	 *	@return sortKey01
	 */
   public char[] getSortKey01() throws CFException  {              
   		return sortRecord.getSortKey01();
   }

  
	/**
	*  set variable sortKey01
	*  @param value
	**/
   public void setSortKey01(char[] value) throws CFException {
      sortRecord.setSortKey01(value);
   } 

     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex) throws CFException {
      sortRecord.setSortKey01(source, sourceIndex);
   	
   }
   
   public void setSortKey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortKey01 with another Field
	 *	@param value
	 */
   public void setSortKey01(Field source) {
      sortRecord.setSortKey01(source);
   }  
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmKeyHold
	 *	@return smmKeyHold
	 */
   public char[] getSmmKeyHold() throws CFException  {              
   		return work.getSmmKeyHold();
   }

  
	/**
	*  set variable smmKeyHold
	*  @param value
	**/
   public void setSmmKeyHold(char[] value) throws CFException {
      work.setSmmKeyHold(value);
   } 

	/**
	 *	Returns the value of smmRecordOut
	 *	@return smmRecordOut
	 */   
	 public SmmRecordOut getSmmRecordOut() {
   	return smmRecordOut;
   }


	/**
	 *	Returns the value of sortRecord
	 *	@return sortRecord
	 */   
	 public SortRecord getSortRecord() {
   	return sortRecord;
   }


public long getWriteSmmCnt() throws CFException {  
        return work.getWriteSmmCnt();
}
	/**
	 * 	Update WriteSmmCnt with the passed value
	 *	@param number
	 */
	public void setWriteSmmCnt(long number)  throws CFException{
		work.setWriteSmmCnt(number);
	}



public long getSmmDupCnt() throws CFException {  
        return work.getSmmDupCnt();
}
	/**
	 * 	Update SmmDupCnt with the passed value
	 *	@param number
	 */
	public void setSmmDupCnt(long number)  throws CFException{
		work.setSmmDupCnt(number);
	}



	/**
	 *	Returns the value of sortKey
	 *	@return sortKey
	 */   
	 public SortKey getSortKey() {
   	return sortKey;
   }


	/**
	 *	Returns the value of depDupKey
	 *	@return depDupKey
	 */
	public long getDepDupKey() throws CFException {
   		return work.getDepDupKey();
	}


	/**
	 *	Returns String value of depDupKey
	 *	@return depDupKey
	 */
	public char[]  getDepDupKeyString() throws CFException {
	     return String.valueOf(work.getDepDupKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean depDupKeyIsNumeric()  throws CFException{
	    return work.depDupKeyIsNumeric();
	}

	/**
	 * 	Update DepDupKey with the passed value
	 *	@param number
	 */
	public void setDepDupKey(long number)  throws CFException{
		work.setDepDupKey(number);
	}
	

	
	/**
	 * 	Update DepDupKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDepDupKey(char[] value)  throws CFException {
		work.setDepDupKey(value);
	}
	
	/**
	 * 	Update DepDupKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDepDupKeyString(char[] value)  throws CFException{
		work.setDepDupKey(value);
	}	

	/**
	 *	Returns the value of smmRec
	 *	@return smmRec
	 */   
	 public SmmRec getSmmRec() {
   	return smmRec;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }

        public OutputSmmOutCtx getOutputSmmOutCtx() {
            return new OutputSmmOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecordOut.hashCode();
        str += sortRecord.hashCode();
        str += sortKey.hashCode();
        str += smmRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OutputSmmInCtx clone() {
        OutputSmmInCtx cloneObj = new OutputSmmInCtx();
        cloneObj.smmRecordOut = new SmmRecordOut();
        cloneObj.smmRecordOut.set(smmRecordOut.getClonedField());
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.sortKey = new SortKey();
        cloneObj.sortKey.set(sortKey.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OutputSmmInCtx getOutputSmmInCtx() {
            return new OutputSmmInCtx();
    }
     public class OutputSmmOutCtx implements Cloneable {
     SmmRecordOut smmRecordOut = TmsmmcpyCtx.this.getSmmRecordOut();
     SortRecord sortRecord = TmsmmcpyCtx.this.getSortRecord();
     SortKey sortKey = TmsmmcpyCtx.this.getSortKey();
     Work work = TmsmmcpyCtx.this.getWork();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();

	/**
	 *	Test condition "Y" for isSortEof()
	 *	@return  Returns true if isSortEof() is "Y"
	 */
   public boolean isSortEof() throws CFException {
      return work.isSortEof();
   }

	/**
	*  set values "Y"
	*/
   	public void setSortEofTrue()  throws CFException{  			
    	work.setSortEofTrue();
   	}
	/**
	 *	Returns the value of sortKey01
	 *	@return sortKey01
	 */
   public char[] getSortKey01() throws CFException  {              
   		return sortRecord.getSortKey01();
   }

  
	/**
	*  set variable sortKey01
	*  @param value
	**/
   public void setSortKey01(char[] value) throws CFException {
      sortRecord.setSortKey01(value);
   } 

     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex) throws CFException {
      sortRecord.setSortKey01(source, sourceIndex);
   	
   }
   
   public void setSortKey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortKey01 with another Field
	 *	@param value
	 */
   public void setSortKey01(Field source) {
      sortRecord.setSortKey01(source);
   }  
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRecord.setSortKey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmKeyHold
	 *	@return smmKeyHold
	 */
   public char[] getSmmKeyHold() throws CFException  {              
   		return work.getSmmKeyHold();
   }

  
	/**
	*  set variable smmKeyHold
	*  @param value
	**/
   public void setSmmKeyHold(char[] value) throws CFException {
      work.setSmmKeyHold(value);
   } 

	/**
	 *	Returns the value of smmRecordOut
	 *	@return smmRecordOut
	 */   
	 public SmmRecordOut getSmmRecordOut() {
   	return smmRecordOut;
   }


	/**
	 *	Returns the value of sortRecord
	 *	@return sortRecord
	 */   
	 public SortRecord getSortRecord() {
   	return sortRecord;
   }


public long getWriteSmmCnt() throws CFException {  
        return work.getWriteSmmCnt();
}
	/**
	 * 	Update WriteSmmCnt with the passed value
	 *	@param number
	 */
	public void setWriteSmmCnt(long number)  throws CFException{
		work.setWriteSmmCnt(number);
	}



public long getSmmDupCnt() throws CFException {  
        return work.getSmmDupCnt();
}
	/**
	 * 	Update SmmDupCnt with the passed value
	 *	@param number
	 */
	public void setSmmDupCnt(long number)  throws CFException{
		work.setSmmDupCnt(number);
	}



	/**
	 *	Returns the value of sortKey
	 *	@return sortKey
	 */   
	 public SortKey getSortKey() {
   	return sortKey;
   }


	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField3();
   }

  
	/**
	*  set variable smmField3
	*  @param value
	**/
   public void setSmmField3(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField3(value);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
      smmRec.getSmmKey().setSmmField3(source);
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of depDupKey
	 *	@return depDupKey
	 */
	public long getDepDupKey() throws CFException {
   		return work.getDepDupKey();
	}


	/**
	 *	Returns String value of depDupKey
	 *	@return depDupKey
	 */
	public char[]  getDepDupKeyString() throws CFException {
	     return String.valueOf(work.getDepDupKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean depDupKeyIsNumeric()  throws CFException{
	    return work.depDupKeyIsNumeric();
	}

	/**
	 * 	Update DepDupKey with the passed value
	 *	@param number
	 */
	public void setDepDupKey(long number)  throws CFException{
		work.setDepDupKey(number);
	}
	

	
	/**
	 * 	Update DepDupKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDepDupKey(char[] value)  throws CFException {
		work.setDepDupKey(value);
	}
	
	/**
	 * 	Update DepDupKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDepDupKeyString(char[] value)  throws CFException{
		work.setDepDupKey(value);
	}	

	/**
	 *	Returns the value of smmRec
	 *	@return smmRec
	 */   
	 public SmmRec getSmmRec() {
   	return smmRec;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecordOut.hashCode();
        str += sortRecord.hashCode();
        str += sortKey.hashCode();
        str += work.hashCode();
        str += smmRec.hashCode();
       return str.hashCode();
    }

    public OutputSmmOutCtx clone() {
        OutputSmmOutCtx cloneObj = new OutputSmmOutCtx();
        cloneObj.smmRecordOut = new SmmRecordOut();
        cloneObj.smmRecordOut.set(smmRecordOut.getClonedField());
        cloneObj.sortRecord = new SortRecord();
        cloneObj.sortRecord.set(sortRecord.getClonedField());
        cloneObj.sortKey = new SortKey();
        cloneObj.sortKey.set(sortKey.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        return cloneObj;
    }

    }

    public OutputSmmOutCtx getOutputSmmOutCtx() {
            return new OutputSmmOutCtx();
    }
     public class UnstringInCtx implements Cloneable {
     SmmRecord smmRecord = TmsmmcpyCtx.this.getSmmRecord();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();

	/**
	 *	Returns the value of smmRecord
	 *	@return smmRecord
	 */   
	 public SmmRecord getSmmRecord() {
   	return smmRecord;
   }



        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }

        public UnstringOutCtx getUnstringOutCtx() {
            return new UnstringOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += smmRec.hashCode();
       return str.hashCode();
    }

    public UnstringInCtx clone() {
        UnstringInCtx cloneObj = new UnstringInCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        return cloneObj;
    }

    }

    public UnstringInCtx getUnstringInCtx() {
            return new UnstringInCtx();
    }
     public class UnstringOutCtx implements Cloneable {
     SmmRecord smmRecord = TmsmmcpyCtx.this.getSmmRecord();
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();

	/**
	 *	Returns the value of smmField8
	 *	@return smmField8
	 */
   public char[] getSmmField8() throws CFException  {              
   		return smmRec.getSmmField8();
   }

  
	/**
	*  set variable smmField8
	*  @param value
	**/
   public void setSmmField8(char[] value) throws CFException {
      smmRec.setSmmField8(value);
   } 

     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField8(source, sourceIndex);
   	
   }
   
   public void setSmmField8(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField8(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField8 with another Field
	 *	@param value
	 */
   public void setSmmField8(Field source) {
      smmRec.setSmmField8(source);
   }  
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField1
	 *	@return smmField1
	 */
   public char[] getSmmField1() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField1();
   }

  
	/**
	*  set variable smmField1
	*  @param value
	**/
   public void setSmmField1(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField1(value);
   } 

     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex);
   	
   }
   
   public void setSmmField1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField1 with another Field
	 *	@param value
	 */
   public void setSmmField1(Field source) {
      smmRec.getSmmKey().setSmmField1(source);
   }  
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField4
	 *	@return smmField4
	 */
   public char[] getSmmField4() throws CFException  {              
   		return smmRec.getSmmField4();
   }

  
	/**
	*  set variable smmField4
	*  @param value
	**/
   public void setSmmField4(char[] value) throws CFException {
      smmRec.setSmmField4(value);
   } 

     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField4(source, sourceIndex);
   	
   }
   
   public void setSmmField4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField4 with another Field
	 *	@param value
	 */
   public void setSmmField4(Field source) {
      smmRec.setSmmField4(source);
   }  
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField15
	 *	@return smmField15
	 */
   public char[] getSmmField15() throws CFException  {              
   		return smmRec.getSmmField15();
   }

  
	/**
	*  set variable smmField15
	*  @param value
	**/
   public void setSmmField15(char[] value) throws CFException {
      smmRec.setSmmField15(value);
   } 

     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField15(source, sourceIndex);
   	
   }
   
   public void setSmmField15(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField15(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField15 with another Field
	 *	@param value
	 */
   public void setSmmField15(Field source) {
      smmRec.setSmmField15(source);
   }  
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmHash
	 *	@return smmHash
	 */
   public char[] getSmmHash() throws CFException  {              
   		return smmRec.getSmmHash();
   }

  
	/**
	*  set variable smmHash
	*  @param value
	**/
   public void setSmmHash(char[] value) throws CFException {
      smmRec.setSmmHash(value);
   } 

     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmHash(source, sourceIndex);
   	
   }
   
   public void setSmmHash(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmHash(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmHash with another Field
	 *	@param value
	 */
   public void setSmmHash(Field source) {
      smmRec.setSmmHash(source);
   }  
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText5
	 *	@return smmRefText5
	 */
   public char[] getSmmRefText5() throws CFException  {              
   		return smmRec.getSmmRefText5();
   }

  
	/**
	*  set variable smmRefText5
	*  @param value
	**/
   public void setSmmRefText5(char[] value) throws CFException {
      smmRec.setSmmRefText5(value);
   } 

     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText5(source, sourceIndex);
   	
   }
   
   public void setSmmRefText5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText5 with another Field
	 *	@param value
	 */
   public void setSmmRefText5(Field source) {
      smmRec.setSmmRefText5(source);
   }  
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmMatchStatus
	 *	@return smmMatchStatus
	 */
   public char[] getSmmMatchStatus() throws CFException  {              
   		return smmRec.getSmmMatchStatus();
   }

  
	/**
	*  set variable smmMatchStatus
	*  @param value
	**/
   public void setSmmMatchStatus(char[] value) throws CFException {
      smmRec.setSmmMatchStatus(value);
   } 

     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmMatchStatus(source, sourceIndex);
   	
   }
   
   public void setSmmMatchStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmMatchStatus with another Field
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source) {
      smmRec.setSmmMatchStatus(source);
   }  
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText4
	 *	@return smmRefText4
	 */
   public char[] getSmmRefText4() throws CFException  {              
   		return smmRec.getSmmRefText4();
   }

  
	/**
	*  set variable smmRefText4
	*  @param value
	**/
   public void setSmmRefText4(char[] value) throws CFException {
      smmRec.setSmmRefText4(value);
   } 

     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText4(source, sourceIndex);
   	
   }
   
   public void setSmmRefText4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText4 with another Field
	 *	@param value
	 */
   public void setSmmRefText4(Field source) {
      smmRec.setSmmRefText4(source);
   }  
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmEnd
	 *	@return smmEnd
	 */
   public char[] getSmmEnd() throws CFException  {              
   		return smmRec.getSmmEnd();
   }

  
	/**
	*  set variable smmEnd
	*  @param value
	**/
   public void setSmmEnd(char[] value) throws CFException {
      smmRec.setSmmEnd(value);
   } 

     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmEnd(source, sourceIndex);
   	
   }
   
   public void setSmmEnd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmEnd with another Field
	 *	@param value
	 */
   public void setSmmEnd(Field source) {
      smmRec.setSmmEnd(source);
   }  
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmBatchKey
	 *	@return smmBatchKey
	 */
   public char[] getSmmBatchKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmBatchKey();
   }

  
	/**
	*  set variable smmBatchKey
	*  @param value
	**/
   public void setSmmBatchKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(value);
   } 

     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex);
   	
   }
   
   public void setSmmBatchKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBatchKey with another Field
	 *	@param value
	 */
   public void setSmmBatchKey(Field source) {
      smmRec.getSmmKey().setSmmBatchKey(source);
   }  
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField14
	 *	@return smmField14
	 */
   public char[] getSmmField14() throws CFException  {              
   		return smmRec.getSmmField14();
   }

  
	/**
	*  set variable smmField14
	*  @param value
	**/
   public void setSmmField14(char[] value) throws CFException {
      smmRec.setSmmField14(value);
   } 

     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField14(source, sourceIndex);
   	
   }
   
   public void setSmmField14(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField14(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField14 with another Field
	 *	@param value
	 */
   public void setSmmField14(Field source) {
      smmRec.setSmmField14(source);
   }  
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDataserverId
	 *	@return smmDataserverId
	 */
   public char[] getSmmDataserverId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDataserverId();
   }

  
	/**
	*  set variable smmDataserverId
	*  @param value
	**/
   public void setSmmDataserverId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(value);
   } 

     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex);
   	
   }
   
   public void setSmmDataserverId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDataserverId with another Field
	 *	@param value
	 */
   public void setSmmDataserverId(Field source) {
      smmRec.getSmmKey().setSmmDataserverId(source);
   }  
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmExtCapXptId
	 *	@return smmExtCapXptId
	 */
   public char[] getSmmExtCapXptId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmExtCapXptId();
   }

  
	/**
	*  set variable smmExtCapXptId
	*  @param value
	**/
   public void setSmmExtCapXptId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(value);
   } 

     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex);
   	
   }
   
   public void setSmmExtCapXptId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmExtCapXptId with another Field
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source) {
      smmRec.getSmmKey().setSmmExtCapXptId(source);
   }  
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmCycleDate
	 *	@return smmCycleDate
	 */
   public char[] getSmmCycleDate() throws CFException  {              
   		return smmRec.getSmmCycleDate();
   }

  
	/**
	*  set variable smmCycleDate
	*  @param value
	**/
   public void setSmmCycleDate(char[] value) throws CFException {
      smmRec.setSmmCycleDate(value);
   } 

     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmCycleDate(source, sourceIndex);
   	
   }
   
   public void setSmmCycleDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmCycleDate with another Field
	 *	@param value
	 */
   public void setSmmCycleDate(Field source) {
      smmRec.setSmmCycleDate(source);
   }  
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmSubclass
	 *	@return smmSubclass
	 */
   public char[] getSmmSubclass() throws CFException  {              
   		return smmRec.getSmmSubclass();
   }

  
	/**
	*  set variable smmSubclass
	*  @param value
	**/
   public void setSmmSubclass(char[] value) throws CFException {
      smmRec.setSmmSubclass(value);
   } 

     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmSubclass(source, sourceIndex);
   	
   }
   
   public void setSmmSubclass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmSubclass with another Field
	 *	@param value
	 */
   public void setSmmSubclass(Field source) {
      smmRec.setSmmSubclass(source);
   }  
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmClassification
	 *	@return smmClassification
	 */
   public char[] getSmmClassification() throws CFException  {              
   		return smmRec.getSmmClassification();
   }

  
	/**
	*  set variable smmClassification
	*  @param value
	**/
   public void setSmmClassification(char[] value) throws CFException {
      smmRec.setSmmClassification(value);
   } 

     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmClassification(source, sourceIndex);
   	
   }
   
   public void setSmmClassification(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmClassification with another Field
	 *	@param value
	 */
   public void setSmmClassification(Field source) {
      smmRec.setSmmClassification(source);
   }  
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText2
	 *	@return smmRefText2
	 */
   public char[] getSmmRefText2() throws CFException  {              
   		return smmRec.getSmmRefText2();
   }

  
	/**
	*  set variable smmRefText2
	*  @param value
	**/
   public void setSmmRefText2(char[] value) throws CFException {
      smmRec.setSmmRefText2(value);
   } 

     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText2(source, sourceIndex);
   	
   }
   
   public void setSmmRefText2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText2 with another Field
	 *	@param value
	 */
   public void setSmmRefText2(Field source) {
      smmRec.setSmmRefText2(source);
   }  
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField11
	 *	@return smmField11
	 */
   public char[] getSmmField11() throws CFException  {              
   		return smmRec.getSmmField11();
   }

  
	/**
	*  set variable smmField11
	*  @param value
	**/
   public void setSmmField11(char[] value) throws CFException {
      smmRec.setSmmField11(value);
   } 

     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField11(source, sourceIndex);
   	
   }
   
   public void setSmmField11(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField11(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField11 with another Field
	 *	@param value
	 */
   public void setSmmField11(Field source) {
      smmRec.setSmmField11(source);
   }  
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField13
	 *	@return smmField13
	 */
   public char[] getSmmField13() throws CFException  {              
   		return smmRec.getSmmField13();
   }

  
	/**
	*  set variable smmField13
	*  @param value
	**/
   public void setSmmField13(char[] value) throws CFException {
      smmRec.setSmmField13(value);
   } 

     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField13(source, sourceIndex);
   	
   }
   
   public void setSmmField13(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField13(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField13 with another Field
	 *	@param value
	 */
   public void setSmmField13(Field source) {
      smmRec.setSmmField13(source);
   }  
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmBranch
	 *	@return smmBranch
	 */
   public char[] getSmmBranch() throws CFException  {              
   		return smmRec.getSmmBranch();
   }

  
	/**
	*  set variable smmBranch
	*  @param value
	**/
   public void setSmmBranch(char[] value) throws CFException {
      smmRec.setSmmBranch(value);
   } 

     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmBranch(source, sourceIndex);
   	
   }
   
   public void setSmmBranch(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBranch with another Field
	 *	@param value
	 */
   public void setSmmBranch(Field source) {
      smmRec.setSmmBranch(source);
   }  
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText3
	 *	@return smmRefText3
	 */
   public char[] getSmmRefText3() throws CFException  {              
   		return smmRec.getSmmRefText3();
   }

  
	/**
	*  set variable smmRefText3
	*  @param value
	**/
   public void setSmmRefText3(char[] value) throws CFException {
      smmRec.setSmmRefText3(value);
   } 

     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText3(source, sourceIndex);
   	
   }
   
   public void setSmmRefText3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText3 with another Field
	 *	@param value
	 */
   public void setSmmRefText3(Field source) {
      smmRec.setSmmRefText3(source);
   }  
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField2
	 *	@return smmField2
	 */
   public char[] getSmmField2() throws CFException  {              
   		return smmRec.getSmmField2();
   }

  
	/**
	*  set variable smmField2
	*  @param value
	**/
   public void setSmmField2(char[] value) throws CFException {
      smmRec.setSmmField2(value);
   } 

     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField2(source, sourceIndex);
   	
   }
   
   public void setSmmField2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField2 with another Field
	 *	@param value
	 */
   public void setSmmField2(Field source) {
      smmRec.setSmmField2(source);
   }  
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmAppTypePsetNum
	 *	@return smmAppTypePsetNum
	 */
   public char[] getSmmAppTypePsetNum() throws CFException  {              
   		return smmRec.getSmmAppTypePsetNum();
   }

  
	/**
	*  set variable smmAppTypePsetNum
	*  @param value
	**/
   public void setSmmAppTypePsetNum(char[] value) throws CFException {
      smmRec.setSmmAppTypePsetNum(value);
   } 

     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex);
   	
   }
   
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmAppTypePsetNum with another Field
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source) {
      smmRec.setSmmAppTypePsetNum(source);
   }  
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmTeller
	 *	@return smmTeller
	 */
   public char[] getSmmTeller() throws CFException  {              
   		return smmRec.getSmmTeller();
   }

  
	/**
	*  set variable smmTeller
	*  @param value
	**/
   public void setSmmTeller(char[] value) throws CFException {
      smmRec.setSmmTeller(value);
   } 

     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmTeller(source, sourceIndex);
   	
   }
   
   public void setSmmTeller(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmTeller with another Field
	 *	@param value
	 */
   public void setSmmTeller(Field source) {
      smmRec.setSmmTeller(source);
   }  
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText1
	 *	@return smmRefText1
	 */
   public char[] getSmmRefText1() throws CFException  {              
   		return smmRec.getSmmRefText1();
   }

  
	/**
	*  set variable smmRefText1
	*  @param value
	**/
   public void setSmmRefText1(char[] value) throws CFException {
      smmRec.setSmmRefText1(value);
   } 

     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText1(source, sourceIndex);
   	
   }
   
   public void setSmmRefText1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText1 with another Field
	 *	@param value
	 */
   public void setSmmRefText1(Field source) {
      smmRec.setSmmRefText1(source);
   }  
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmSsDdrKey
	 *	@return smmSsDdrKey
	 */
   public char[] getSmmSsDdrKey() throws CFException  {              
   		return smmRec.getSmmSsDdrKey();
   }

  
	/**
	*  set variable smmSsDdrKey
	*  @param value
	**/
   public void setSmmSsDdrKey(char[] value) throws CFException {
      smmRec.setSmmSsDdrKey(value);
   } 

     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmSsDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmSsDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmSsDdrKey with another Field
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source) {
      smmRec.setSmmSsDdrKey(source);
   }  
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmFlags
	 *	@return smmFlags
	 */
   public char[] getSmmFlags() throws CFException  {              
   		return smmRec.getSmmFlags();
   }

  
	/**
	*  set variable smmFlags
	*  @param value
	**/
   public void setSmmFlags(char[] value) throws CFException {
      smmRec.setSmmFlags(value);
   } 

     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmFlags(source, sourceIndex);
   	
   }
   
   public void setSmmFlags(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmFlags with another Field
	 *	@param value
	 */
   public void setSmmFlags(Field source) {
      smmRec.setSmmFlags(source);
   }  
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField3();
   }

  
	/**
	*  set variable smmField3
	*  @param value
	**/
   public void setSmmField3(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField3(value);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
      smmRec.getSmmKey().setSmmField3(source);
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmType
	 *	@return smmType
	 */
   public char[] getSmmType() throws CFException  {              
   		return smmRec.getSmmType();
   }

  
	/**
	*  set variable smmType
	*  @param value
	**/
   public void setSmmType(char[] value) throws CFException {
      smmRec.setSmmType(value);
   } 

     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmType(source, sourceIndex);
   	
   }
   
   public void setSmmType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmType with another Field
	 *	@param value
	 */
   public void setSmmType(Field source) {
      smmRec.setSmmType(source);
   }  
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField6
	 *	@return smmField6
	 */
   public char[] getSmmField6() throws CFException  {              
   		return smmRec.getSmmField6();
   }

  
	/**
	*  set variable smmField6
	*  @param value
	**/
   public void setSmmField6(char[] value) throws CFException {
      smmRec.setSmmField6(value);
   } 

     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField6(source, sourceIndex);
   	
   }
   
   public void setSmmField6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField6 with another Field
	 *	@param value
	 */
   public void setSmmField6(Field source) {
      smmRec.setSmmField6(source);
   }  
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField10
	 *	@return smmField10
	 */
   public char[] getSmmField10() throws CFException  {              
   		return smmRec.getSmmField10();
   }

  
	/**
	*  set variable smmField10
	*  @param value
	**/
   public void setSmmField10(char[] value) throws CFException {
      smmRec.setSmmField10(value);
   } 

     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField10(source, sourceIndex);
   	
   }
   
   public void setSmmField10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField10 with another Field
	 *	@param value
	 */
   public void setSmmField10(Field source) {
      smmRec.setSmmField10(source);
   }  
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField5
	 *	@return smmField5
	 */
   public char[] getSmmField5() throws CFException  {              
   		return smmRec.getSmmField5();
   }

  
	/**
	*  set variable smmField5
	*  @param value
	**/
   public void setSmmField5(char[] value) throws CFException {
      smmRec.setSmmField5(value);
   } 

     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField5(source, sourceIndex);
   	
   }
   
   public void setSmmField5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField5 with another Field
	 *	@param value
	 */
   public void setSmmField5(Field source) {
      smmRec.setSmmField5(source);
   }  
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField9
	 *	@return smmField9
	 */
   public char[] getSmmField9() throws CFException  {              
   		return smmRec.getSmmField9();
   }

  
	/**
	*  set variable smmField9
	*  @param value
	**/
   public void setSmmField9(char[] value) throws CFException {
      smmRec.setSmmField9(value);
   } 

     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField9(source, sourceIndex);
   	
   }
   
   public void setSmmField9(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField9(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField9 with another Field
	 *	@param value
	 */
   public void setSmmField9(Field source) {
      smmRec.setSmmField9(source);
   }  
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmTransTime
	 *	@return smmTransTime
	 */
   public char[] getSmmTransTime() throws CFException  {              
   		return smmRec.getSmmTransTime();
   }

  
	/**
	*  set variable smmTransTime
	*  @param value
	**/
   public void setSmmTransTime(char[] value) throws CFException {
      smmRec.setSmmTransTime(value);
   } 

     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmTransTime(source, sourceIndex);
   	
   }
   
   public void setSmmTransTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmTransTime with another Field
	 *	@param value
	 */
   public void setSmmTransTime(Field source) {
      smmRec.setSmmTransTime(source);
   }  
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDdrKey
	 *	@return smmDdrKey
	 */
   public char[] getSmmDdrKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDdrKey();
   }

  
	/**
	*  set variable smmDdrKey
	*  @param value
	**/
   public void setSmmDdrKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(value);
   } 

     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDdrKey with another Field
	 *	@param value
	 */
   public void setSmmDdrKey(Field source) {
      smmRec.getSmmKey().setSmmDdrKey(source);
   }  
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmPostingDate
	 *	@return smmPostingDate
	 */
   public char[] getSmmPostingDate() throws CFException  {              
   		return smmRec.getSmmPostingDate();
   }

  
	/**
	*  set variable smmPostingDate
	*  @param value
	**/
   public void setSmmPostingDate(char[] value) throws CFException {
      smmRec.setSmmPostingDate(value);
   } 

     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmPostingDate(source, sourceIndex);
   	
   }
   
   public void setSmmPostingDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmPostingDate with another Field
	 *	@param value
	 */
   public void setSmmPostingDate(Field source) {
      smmRec.setSmmPostingDate(source);
   }  
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefNum1
	 *	@return smmRefNum1
	 */
   public char[] getSmmRefNum1() throws CFException  {              
   		return smmRec.getSmmRefNum1();
   }

  
	/**
	*  set variable smmRefNum1
	*  @param value
	**/
   public void setSmmRefNum1(char[] value) throws CFException {
      smmRec.setSmmRefNum1(value);
   } 

     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefNum1(source, sourceIndex);
   	
   }
   
   public void setSmmRefNum1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefNum1 with another Field
	 *	@param value
	 */
   public void setSmmRefNum1(Field source) {
      smmRec.setSmmRefNum1(source);
   }  
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRecord
	 *	@return smmRecord
	 */   
	 public SmmRecord getSmmRecord() {
   	return smmRecord;
   }


	/**
	 *	Returns the value of smmRefNum2
	 *	@return smmRefNum2
	 */
   public char[] getSmmRefNum2() throws CFException  {              
   		return smmRec.getSmmRefNum2();
   }

  
	/**
	*  set variable smmRefNum2
	*  @param value
	**/
   public void setSmmRefNum2(char[] value) throws CFException {
      smmRec.setSmmRefNum2(value);
   } 

     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefNum2(source, sourceIndex);
   	
   }
   
   public void setSmmRefNum2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefNum2 with another Field
	 *	@param value
	 */
   public void setSmmRefNum2(Field source) {
      smmRec.setSmmRefNum2(source);
   }  
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField7
	 *	@return smmField7
	 */
   public char[] getSmmField7() throws CFException  {              
   		return smmRec.getSmmField7();
   }

  
	/**
	*  set variable smmField7
	*  @param value
	**/
   public void setSmmField7(char[] value) throws CFException {
      smmRec.setSmmField7(value);
   } 

     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField7(source, sourceIndex);
   	
   }
   
   public void setSmmField7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField7 with another Field
	 *	@param value
	 */
   public void setSmmField7(Field source) {
      smmRec.setSmmField7(source);
   }  
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField12
	 *	@return smmField12
	 */
   public char[] getSmmField12() throws CFException  {              
   		return smmRec.getSmmField12();
   }

  
	/**
	*  set variable smmField12
	*  @param value
	**/
   public void setSmmField12(char[] value) throws CFException {
      smmRec.setSmmField12(value);
   } 

     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField12(source, sourceIndex);
   	
   }
   
   public void setSmmField12(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField12(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField12 with another Field
	 *	@param value
	 */
   public void setSmmField12(Field source) {
      smmRec.setSmmField12(source);
   }  
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmCycleNo
	 *	@return smmCycleNo
	 */
   public char[] getSmmCycleNo() throws CFException  {              
   		return smmRec.getSmmCycleNo();
   }

  
	/**
	*  set variable smmCycleNo
	*  @param value
	**/
   public void setSmmCycleNo(char[] value) throws CFException {
      smmRec.setSmmCycleNo(value);
   } 

     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmCycleNo(source, sourceIndex);
   	
   }
   
   public void setSmmCycleNo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmCycleNo with another Field
	 *	@param value
	 */
   public void setSmmCycleNo(Field source) {
      smmRec.setSmmCycleNo(source);
   }  
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRecord.hashCode();
        str += smmRec.hashCode();
       return str.hashCode();
    }

    public UnstringOutCtx clone() {
        UnstringOutCtx cloneObj = new UnstringOutCtx();
        cloneObj.smmRecord = new SmmRecord();
        cloneObj.smmRecord.set(smmRecord.getClonedField());
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        return cloneObj;
    }

    }

    public UnstringOutCtx getUnstringOutCtx() {
            return new UnstringOutCtx();
    }
     public class DisplaySmmRecInCtx implements Cloneable {
     SmmRec smmRec = TmsmmcpyCtx.this.getSmmRec();

	/**
	 *	Returns the value of smmField8
	 *	@return smmField8
	 */
   public char[] getSmmField8() throws CFException  {              
   		return smmRec.getSmmField8();
   }

  
	/**
	*  set variable smmField8
	*  @param value
	**/
   public void setSmmField8(char[] value) throws CFException {
      smmRec.setSmmField8(value);
   } 

     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField8(source, sourceIndex);
   	
   }
   
   public void setSmmField8(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField8(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField8 with another Field
	 *	@param value
	 */
   public void setSmmField8(Field source) {
      smmRec.setSmmField8(source);
   }  
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField1
	 *	@return smmField1
	 */
   public char[] getSmmField1() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField1();
   }

  
	/**
	*  set variable smmField1
	*  @param value
	**/
   public void setSmmField1(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField1(value);
   } 

     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex);
   	
   }
   
   public void setSmmField1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField1 with another Field
	 *	@param value
	 */
   public void setSmmField1(Field source) {
      smmRec.getSmmKey().setSmmField1(source);
   }  
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField4
	 *	@return smmField4
	 */
   public char[] getSmmField4() throws CFException  {              
   		return smmRec.getSmmField4();
   }

  
	/**
	*  set variable smmField4
	*  @param value
	**/
   public void setSmmField4(char[] value) throws CFException {
      smmRec.setSmmField4(value);
   } 

     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField4(source, sourceIndex);
   	
   }
   
   public void setSmmField4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField4 with another Field
	 *	@param value
	 */
   public void setSmmField4(Field source) {
      smmRec.setSmmField4(source);
   }  
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField15
	 *	@return smmField15
	 */
   public char[] getSmmField15() throws CFException  {              
   		return smmRec.getSmmField15();
   }

  
	/**
	*  set variable smmField15
	*  @param value
	**/
   public void setSmmField15(char[] value) throws CFException {
      smmRec.setSmmField15(value);
   } 

     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField15(source, sourceIndex);
   	
   }
   
   public void setSmmField15(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField15(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField15 with another Field
	 *	@param value
	 */
   public void setSmmField15(Field source) {
      smmRec.setSmmField15(source);
   }  
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmHash
	 *	@return smmHash
	 */
   public char[] getSmmHash() throws CFException  {              
   		return smmRec.getSmmHash();
   }

  
	/**
	*  set variable smmHash
	*  @param value
	**/
   public void setSmmHash(char[] value) throws CFException {
      smmRec.setSmmHash(value);
   } 

     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmHash(source, sourceIndex);
   	
   }
   
   public void setSmmHash(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmHash(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmHash with another Field
	 *	@param value
	 */
   public void setSmmHash(Field source) {
      smmRec.setSmmHash(source);
   }  
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmHash(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText5
	 *	@return smmRefText5
	 */
   public char[] getSmmRefText5() throws CFException  {              
   		return smmRec.getSmmRefText5();
   }

  
	/**
	*  set variable smmRefText5
	*  @param value
	**/
   public void setSmmRefText5(char[] value) throws CFException {
      smmRec.setSmmRefText5(value);
   } 

     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText5(source, sourceIndex);
   	
   }
   
   public void setSmmRefText5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText5 with another Field
	 *	@param value
	 */
   public void setSmmRefText5(Field source) {
      smmRec.setSmmRefText5(source);
   }  
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmMatchStatus
	 *	@return smmMatchStatus
	 */
   public char[] getSmmMatchStatus() throws CFException  {              
   		return smmRec.getSmmMatchStatus();
   }

  
	/**
	*  set variable smmMatchStatus
	*  @param value
	**/
   public void setSmmMatchStatus(char[] value) throws CFException {
      smmRec.setSmmMatchStatus(value);
   } 

     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmMatchStatus(source, sourceIndex);
   	
   }
   
   public void setSmmMatchStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmMatchStatus with another Field
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source) {
      smmRec.setSmmMatchStatus(source);
   }  
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmMatchStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText4
	 *	@return smmRefText4
	 */
   public char[] getSmmRefText4() throws CFException  {              
   		return smmRec.getSmmRefText4();
   }

  
	/**
	*  set variable smmRefText4
	*  @param value
	**/
   public void setSmmRefText4(char[] value) throws CFException {
      smmRec.setSmmRefText4(value);
   } 

     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText4(source, sourceIndex);
   	
   }
   
   public void setSmmRefText4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText4 with another Field
	 *	@param value
	 */
   public void setSmmRefText4(Field source) {
      smmRec.setSmmRefText4(source);
   }  
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmEnd
	 *	@return smmEnd
	 */
   public char[] getSmmEnd() throws CFException  {              
   		return smmRec.getSmmEnd();
   }

  
	/**
	*  set variable smmEnd
	*  @param value
	**/
   public void setSmmEnd(char[] value) throws CFException {
      smmRec.setSmmEnd(value);
   } 

     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmEnd(source, sourceIndex);
   	
   }
   
   public void setSmmEnd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmEnd with another Field
	 *	@param value
	 */
   public void setSmmEnd(Field source) {
      smmRec.setSmmEnd(source);
   }  
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmEnd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmBatchKey
	 *	@return smmBatchKey
	 */
   public char[] getSmmBatchKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmBatchKey();
   }

  
	/**
	*  set variable smmBatchKey
	*  @param value
	**/
   public void setSmmBatchKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(value);
   } 

     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex);
   	
   }
   
   public void setSmmBatchKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBatchKey with another Field
	 *	@param value
	 */
   public void setSmmBatchKey(Field source) {
      smmRec.getSmmKey().setSmmBatchKey(source);
   }  
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmBatchKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField14
	 *	@return smmField14
	 */
   public char[] getSmmField14() throws CFException  {              
   		return smmRec.getSmmField14();
   }

  
	/**
	*  set variable smmField14
	*  @param value
	**/
   public void setSmmField14(char[] value) throws CFException {
      smmRec.setSmmField14(value);
   } 

     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField14(source, sourceIndex);
   	
   }
   
   public void setSmmField14(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField14(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField14 with another Field
	 *	@param value
	 */
   public void setSmmField14(Field source) {
      smmRec.setSmmField14(source);
   }  
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDataserverId
	 *	@return smmDataserverId
	 */
   public char[] getSmmDataserverId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDataserverId();
   }

  
	/**
	*  set variable smmDataserverId
	*  @param value
	**/
   public void setSmmDataserverId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(value);
   } 

     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex);
   	
   }
   
   public void setSmmDataserverId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDataserverId with another Field
	 *	@param value
	 */
   public void setSmmDataserverId(Field source) {
      smmRec.getSmmKey().setSmmDataserverId(source);
   }  
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDataserverId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmExtCapXptId
	 *	@return smmExtCapXptId
	 */
   public char[] getSmmExtCapXptId() throws CFException  {              
   		return smmRec.getSmmKey().getSmmExtCapXptId();
   }

  
	/**
	*  set variable smmExtCapXptId
	*  @param value
	**/
   public void setSmmExtCapXptId(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(value);
   } 

     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex);
   	
   }
   
   public void setSmmExtCapXptId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmExtCapXptId with another Field
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source) {
      smmRec.getSmmKey().setSmmExtCapXptId(source);
   }  
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmExtCapXptId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmCycleDate
	 *	@return smmCycleDate
	 */
   public char[] getSmmCycleDate() throws CFException  {              
   		return smmRec.getSmmCycleDate();
   }

  
	/**
	*  set variable smmCycleDate
	*  @param value
	**/
   public void setSmmCycleDate(char[] value) throws CFException {
      smmRec.setSmmCycleDate(value);
   } 

     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmCycleDate(source, sourceIndex);
   	
   }
   
   public void setSmmCycleDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmCycleDate with another Field
	 *	@param value
	 */
   public void setSmmCycleDate(Field source) {
      smmRec.setSmmCycleDate(source);
   }  
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmSubclass
	 *	@return smmSubclass
	 */
   public char[] getSmmSubclass() throws CFException  {              
   		return smmRec.getSmmSubclass();
   }

  
	/**
	*  set variable smmSubclass
	*  @param value
	**/
   public void setSmmSubclass(char[] value) throws CFException {
      smmRec.setSmmSubclass(value);
   } 

     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmSubclass(source, sourceIndex);
   	
   }
   
   public void setSmmSubclass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmSubclass with another Field
	 *	@param value
	 */
   public void setSmmSubclass(Field source) {
      smmRec.setSmmSubclass(source);
   }  
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSubclass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmClassification
	 *	@return smmClassification
	 */
   public char[] getSmmClassification() throws CFException  {              
   		return smmRec.getSmmClassification();
   }

  
	/**
	*  set variable smmClassification
	*  @param value
	**/
   public void setSmmClassification(char[] value) throws CFException {
      smmRec.setSmmClassification(value);
   } 

     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmClassification(source, sourceIndex);
   	
   }
   
   public void setSmmClassification(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmClassification with another Field
	 *	@param value
	 */
   public void setSmmClassification(Field source) {
      smmRec.setSmmClassification(source);
   }  
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmClassification(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText2
	 *	@return smmRefText2
	 */
   public char[] getSmmRefText2() throws CFException  {              
   		return smmRec.getSmmRefText2();
   }

  
	/**
	*  set variable smmRefText2
	*  @param value
	**/
   public void setSmmRefText2(char[] value) throws CFException {
      smmRec.setSmmRefText2(value);
   } 

     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText2(source, sourceIndex);
   	
   }
   
   public void setSmmRefText2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText2 with another Field
	 *	@param value
	 */
   public void setSmmRefText2(Field source) {
      smmRec.setSmmRefText2(source);
   }  
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField11
	 *	@return smmField11
	 */
   public char[] getSmmField11() throws CFException  {              
   		return smmRec.getSmmField11();
   }

  
	/**
	*  set variable smmField11
	*  @param value
	**/
   public void setSmmField11(char[] value) throws CFException {
      smmRec.setSmmField11(value);
   } 

     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField11(source, sourceIndex);
   	
   }
   
   public void setSmmField11(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField11(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField11 with another Field
	 *	@param value
	 */
   public void setSmmField11(Field source) {
      smmRec.setSmmField11(source);
   }  
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField13
	 *	@return smmField13
	 */
   public char[] getSmmField13() throws CFException  {              
   		return smmRec.getSmmField13();
   }

  
	/**
	*  set variable smmField13
	*  @param value
	**/
   public void setSmmField13(char[] value) throws CFException {
      smmRec.setSmmField13(value);
   } 

     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField13(source, sourceIndex);
   	
   }
   
   public void setSmmField13(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField13(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField13 with another Field
	 *	@param value
	 */
   public void setSmmField13(Field source) {
      smmRec.setSmmField13(source);
   }  
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmBranch
	 *	@return smmBranch
	 */
   public char[] getSmmBranch() throws CFException  {              
   		return smmRec.getSmmBranch();
   }

  
	/**
	*  set variable smmBranch
	*  @param value
	**/
   public void setSmmBranch(char[] value) throws CFException {
      smmRec.setSmmBranch(value);
   } 

     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmBranch(source, sourceIndex);
   	
   }
   
   public void setSmmBranch(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmBranch with another Field
	 *	@param value
	 */
   public void setSmmBranch(Field source) {
      smmRec.setSmmBranch(source);
   }  
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmBranch(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText3
	 *	@return smmRefText3
	 */
   public char[] getSmmRefText3() throws CFException  {              
   		return smmRec.getSmmRefText3();
   }

  
	/**
	*  set variable smmRefText3
	*  @param value
	**/
   public void setSmmRefText3(char[] value) throws CFException {
      smmRec.setSmmRefText3(value);
   } 

     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText3(source, sourceIndex);
   	
   }
   
   public void setSmmRefText3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText3 with another Field
	 *	@param value
	 */
   public void setSmmRefText3(Field source) {
      smmRec.setSmmRefText3(source);
   }  
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField2
	 *	@return smmField2
	 */
   public char[] getSmmField2() throws CFException  {              
   		return smmRec.getSmmField2();
   }

  
	/**
	*  set variable smmField2
	*  @param value
	**/
   public void setSmmField2(char[] value) throws CFException {
      smmRec.setSmmField2(value);
   } 

     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField2(source, sourceIndex);
   	
   }
   
   public void setSmmField2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField2 with another Field
	 *	@param value
	 */
   public void setSmmField2(Field source) {
      smmRec.setSmmField2(source);
   }  
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmAppTypePsetNum
	 *	@return smmAppTypePsetNum
	 */
   public char[] getSmmAppTypePsetNum() throws CFException  {              
   		return smmRec.getSmmAppTypePsetNum();
   }

  
	/**
	*  set variable smmAppTypePsetNum
	*  @param value
	**/
   public void setSmmAppTypePsetNum(char[] value) throws CFException {
      smmRec.setSmmAppTypePsetNum(value);
   } 

     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex);
   	
   }
   
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmAppTypePsetNum with another Field
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source) {
      smmRec.setSmmAppTypePsetNum(source);
   }  
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmAppTypePsetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmTeller
	 *	@return smmTeller
	 */
   public char[] getSmmTeller() throws CFException  {              
   		return smmRec.getSmmTeller();
   }

  
	/**
	*  set variable smmTeller
	*  @param value
	**/
   public void setSmmTeller(char[] value) throws CFException {
      smmRec.setSmmTeller(value);
   } 

     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmTeller(source, sourceIndex);
   	
   }
   
   public void setSmmTeller(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmTeller with another Field
	 *	@param value
	 */
   public void setSmmTeller(Field source) {
      smmRec.setSmmTeller(source);
   }  
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefText1
	 *	@return smmRefText1
	 */
   public char[] getSmmRefText1() throws CFException  {              
   		return smmRec.getSmmRefText1();
   }

  
	/**
	*  set variable smmRefText1
	*  @param value
	**/
   public void setSmmRefText1(char[] value) throws CFException {
      smmRec.setSmmRefText1(value);
   } 

     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefText1(source, sourceIndex);
   	
   }
   
   public void setSmmRefText1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefText1 with another Field
	 *	@param value
	 */
   public void setSmmRefText1(Field source) {
      smmRec.setSmmRefText1(source);
   }  
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefText1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmSsDdrKey
	 *	@return smmSsDdrKey
	 */
   public char[] getSmmSsDdrKey() throws CFException  {              
   		return smmRec.getSmmSsDdrKey();
   }

  
	/**
	*  set variable smmSsDdrKey
	*  @param value
	**/
   public void setSmmSsDdrKey(char[] value) throws CFException {
      smmRec.setSmmSsDdrKey(value);
   } 

     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmSsDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmSsDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmSsDdrKey with another Field
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source) {
      smmRec.setSmmSsDdrKey(source);
   }  
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmSsDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmFlags
	 *	@return smmFlags
	 */
   public char[] getSmmFlags() throws CFException  {              
   		return smmRec.getSmmFlags();
   }

  
	/**
	*  set variable smmFlags
	*  @param value
	**/
   public void setSmmFlags(char[] value) throws CFException {
      smmRec.setSmmFlags(value);
   } 

     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmFlags(source, sourceIndex);
   	
   }
   
   public void setSmmFlags(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmFlags with another Field
	 *	@param value
	 */
   public void setSmmFlags(Field source) {
      smmRec.setSmmFlags(source);
   }  
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmFlags(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException  {              
   		return smmRec.getSmmKey().getSmmField3();
   }

  
	/**
	*  set variable smmField3
	*  @param value
	**/
   public void setSmmField3(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmField3(value);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
      smmRec.getSmmKey().setSmmField3(source);
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmField3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmType
	 *	@return smmType
	 */
   public char[] getSmmType() throws CFException  {              
   		return smmRec.getSmmType();
   }

  
	/**
	*  set variable smmType
	*  @param value
	**/
   public void setSmmType(char[] value) throws CFException {
      smmRec.setSmmType(value);
   } 

     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmType(source, sourceIndex);
   	
   }
   
   public void setSmmType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmType with another Field
	 *	@param value
	 */
   public void setSmmType(Field source) {
      smmRec.setSmmType(source);
   }  
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField6
	 *	@return smmField6
	 */
   public char[] getSmmField6() throws CFException  {              
   		return smmRec.getSmmField6();
   }

  
	/**
	*  set variable smmField6
	*  @param value
	**/
   public void setSmmField6(char[] value) throws CFException {
      smmRec.setSmmField6(value);
   } 

     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField6(source, sourceIndex);
   	
   }
   
   public void setSmmField6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField6 with another Field
	 *	@param value
	 */
   public void setSmmField6(Field source) {
      smmRec.setSmmField6(source);
   }  
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField10
	 *	@return smmField10
	 */
   public char[] getSmmField10() throws CFException  {              
   		return smmRec.getSmmField10();
   }

  
	/**
	*  set variable smmField10
	*  @param value
	**/
   public void setSmmField10(char[] value) throws CFException {
      smmRec.setSmmField10(value);
   } 

     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField10(source, sourceIndex);
   	
   }
   
   public void setSmmField10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField10 with another Field
	 *	@param value
	 */
   public void setSmmField10(Field source) {
      smmRec.setSmmField10(source);
   }  
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField5
	 *	@return smmField5
	 */
   public char[] getSmmField5() throws CFException  {              
   		return smmRec.getSmmField5();
   }

  
	/**
	*  set variable smmField5
	*  @param value
	**/
   public void setSmmField5(char[] value) throws CFException {
      smmRec.setSmmField5(value);
   } 

     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField5(source, sourceIndex);
   	
   }
   
   public void setSmmField5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField5 with another Field
	 *	@param value
	 */
   public void setSmmField5(Field source) {
      smmRec.setSmmField5(source);
   }  
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField9
	 *	@return smmField9
	 */
   public char[] getSmmField9() throws CFException  {              
   		return smmRec.getSmmField9();
   }

  
	/**
	*  set variable smmField9
	*  @param value
	**/
   public void setSmmField9(char[] value) throws CFException {
      smmRec.setSmmField9(value);
   } 

     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField9(source, sourceIndex);
   	
   }
   
   public void setSmmField9(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField9(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField9 with another Field
	 *	@param value
	 */
   public void setSmmField9(Field source) {
      smmRec.setSmmField9(source);
   }  
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmTransTime
	 *	@return smmTransTime
	 */
   public char[] getSmmTransTime() throws CFException  {              
   		return smmRec.getSmmTransTime();
   }

  
	/**
	*  set variable smmTransTime
	*  @param value
	**/
   public void setSmmTransTime(char[] value) throws CFException {
      smmRec.setSmmTransTime(value);
   } 

     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmTransTime(source, sourceIndex);
   	
   }
   
   public void setSmmTransTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmTransTime with another Field
	 *	@param value
	 */
   public void setSmmTransTime(Field source) {
      smmRec.setSmmTransTime(source);
   }  
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmTransTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmDdrKey
	 *	@return smmDdrKey
	 */
   public char[] getSmmDdrKey() throws CFException  {              
   		return smmRec.getSmmKey().getSmmDdrKey();
   }

  
	/**
	*  set variable smmDdrKey
	*  @param value
	**/
   public void setSmmDdrKey(char[] value) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(value);
   } 

     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex) throws CFException {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex);
   	
   }
   
   public void setSmmDdrKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmDdrKey with another Field
	 *	@param value
	 */
   public void setSmmDdrKey(Field source) {
      smmRec.getSmmKey().setSmmDdrKey(source);
   }  
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.getSmmKey().setSmmDdrKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmPostingDate
	 *	@return smmPostingDate
	 */
   public char[] getSmmPostingDate() throws CFException  {              
   		return smmRec.getSmmPostingDate();
   }

  
	/**
	*  set variable smmPostingDate
	*  @param value
	**/
   public void setSmmPostingDate(char[] value) throws CFException {
      smmRec.setSmmPostingDate(value);
   } 

     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmPostingDate(source, sourceIndex);
   	
   }
   
   public void setSmmPostingDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmPostingDate with another Field
	 *	@param value
	 */
   public void setSmmPostingDate(Field source) {
      smmRec.setSmmPostingDate(source);
   }  
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmPostingDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefNum1
	 *	@return smmRefNum1
	 */
   public char[] getSmmRefNum1() throws CFException  {              
   		return smmRec.getSmmRefNum1();
   }

  
	/**
	*  set variable smmRefNum1
	*  @param value
	**/
   public void setSmmRefNum1(char[] value) throws CFException {
      smmRec.setSmmRefNum1(value);
   } 

     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefNum1(source, sourceIndex);
   	
   }
   
   public void setSmmRefNum1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefNum1 with another Field
	 *	@param value
	 */
   public void setSmmRefNum1(Field source) {
      smmRec.setSmmRefNum1(source);
   }  
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmRefNum2
	 *	@return smmRefNum2
	 */
   public char[] getSmmRefNum2() throws CFException  {              
   		return smmRec.getSmmRefNum2();
   }

  
	/**
	*  set variable smmRefNum2
	*  @param value
	**/
   public void setSmmRefNum2(char[] value) throws CFException {
      smmRec.setSmmRefNum2(value);
   } 

     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmRefNum2(source, sourceIndex);
   	
   }
   
   public void setSmmRefNum2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmRefNum2 with another Field
	 *	@param value
	 */
   public void setSmmRefNum2(Field source) {
      smmRec.setSmmRefNum2(source);
   }  
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmRefNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField7
	 *	@return smmField7
	 */
   public char[] getSmmField7() throws CFException  {              
   		return smmRec.getSmmField7();
   }

  
	/**
	*  set variable smmField7
	*  @param value
	**/
   public void setSmmField7(char[] value) throws CFException {
      smmRec.setSmmField7(value);
   } 

     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField7(source, sourceIndex);
   	
   }
   
   public void setSmmField7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField7 with another Field
	 *	@param value
	 */
   public void setSmmField7(Field source) {
      smmRec.setSmmField7(source);
   }  
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmField12
	 *	@return smmField12
	 */
   public char[] getSmmField12() throws CFException  {              
   		return smmRec.getSmmField12();
   }

  
	/**
	*  set variable smmField12
	*  @param value
	**/
   public void setSmmField12(char[] value) throws CFException {
      smmRec.setSmmField12(value);
   } 

     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmField12(source, sourceIndex);
   	
   }
   
   public void setSmmField12(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmField12(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmField12 with another Field
	 *	@param value
	 */
   public void setSmmField12(Field source) {
      smmRec.setSmmField12(source);
   }  
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmField12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smmCycleNo
	 *	@return smmCycleNo
	 */
   public char[] getSmmCycleNo() throws CFException  {              
   		return smmRec.getSmmCycleNo();
   }

  
	/**
	*  set variable smmCycleNo
	*  @param value
	**/
   public void setSmmCycleNo(char[] value) throws CFException {
      smmRec.setSmmCycleNo(value);
   } 

     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex) throws CFException {
      smmRec.setSmmCycleNo(source, sourceIndex);
   	
   }
   
   public void setSmmCycleNo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SmmCycleNo with another Field
	 *	@param value
	 */
   public void setSmmCycleNo(Field source) {
      smmRec.setSmmCycleNo(source);
   }  
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      smmRec.setSmmCycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += smmRec.hashCode();
       return str.hashCode();
    }

    public DisplaySmmRecInCtx clone() {
        DisplaySmmRecInCtx cloneObj = new DisplaySmmRecInCtx();
        cloneObj.smmRec = new SmmRec();
        cloneObj.smmRec.set(smmRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplaySmmRecInCtx getDisplaySmmRecInCtx() {
            return new DisplaySmmRecInCtx();
    }
     public class TerminationInCtx implements Cloneable {
     Work work = TmsmmcpyCtx.this.getWork();

public long getWriteSmmCnt() throws CFException {  
        return work.getWriteSmmCnt();
}
	/**
	 * 	Update WriteSmmCnt with the passed value
	 *	@param number
	 */
	public void setWriteSmmCnt(long number)  throws CFException{
		work.setWriteSmmCnt(number);
	}



public long getSmmDupCnt() throws CFException {  
        return work.getSmmDupCnt();
}
	/**
	 * 	Update SmmDupCnt with the passed value
	 *	@param number
	 */
	public void setSmmDupCnt(long number)  throws CFException{
		work.setSmmDupCnt(number);
	}



public long getInvalidSmmCnt() throws CFException {  
        return work.getInvalidSmmCnt();
}
	/**
	 * 	Update InvalidSmmCnt with the passed value
	 *	@param number
	 */
	public void setInvalidSmmCnt(long number)  throws CFException{
		work.setInvalidSmmCnt(number);
	}



public int getSmmRecordsRead() throws CFException {  
        return work.getSmmRecordsRead();
}
	/**
	 * 	Update SmmRecordsRead with the passed value
	 *	@param number
	 */
	public void setSmmRecordsRead(int number)  throws CFException{
		work.setSmmRecordsRead(number);
	}


	public void setSmmRecordsRead(long number)  throws CFException{
	    work.setSmmRecordsRead(number);
	}
	


        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
        }

        public TerminationOutCtx getTerminationOutCtx() {
            return new TerminationOutCtx();
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

    public TerminationInCtx clone() {
        TerminationInCtx cloneObj = new TerminationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminationInCtx getTerminationInCtx() {
            return new TerminationInCtx();
    }
     public class TerminationOutCtx implements Cloneable {
     Work work = TmsmmcpyCtx.this.getWork();


        public TmsmmcpyCtx getTmsmmcpyCtx() {
            return TmsmmcpyCtx.this;
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

    public TerminationOutCtx clone() {
        TerminationOutCtx cloneObj = new TerminationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminationOutCtx getTerminationOutCtx() {
            return new TerminationOutCtx();
    }
}
