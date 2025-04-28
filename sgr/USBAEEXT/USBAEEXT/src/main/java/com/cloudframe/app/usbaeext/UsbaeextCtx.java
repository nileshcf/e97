package com.cloudframe.app.usbaeext;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.usbaeext.file.records.Adjtable;
import com.cloudframe.app.usbaeext.file.records.Ov4ParameterList;
import com.cloudframe.app.usbaeext.dto.WaCurrentDateGroup;
import com.cloudframe.app.usbaeext.file.records.TmRecord;
import com.cloudframe.app.usbaeext.file.records.Ov4Aba;
import com.cloudframe.app.usbaeext.dto.TableAreas;
import com.cloudframe.app.usbaeext.dto.Work;
import com.cloudframe.app.usbaeext.dto.TmAdjDate;


@Context
public class UsbaeextCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    TableAreas tableAreas;
    Adjtable adjtable;
    TmAdjDate tmAdjDate;
    Ov4ParameterList ov4ParameterList;
    Work work;
    TmRecord tmRecord;
    WaCurrentDateGroup waCurrentDateGroup;

    int taAdjIndex;

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

    boolean doNotSkipProcessAdjTable = true;

    public boolean getDoNotSkipProcessAdjTable() {
        return this.doNotSkipProcessAdjTable;
    }

    public void setDoNotSkipProcessAdjTable(boolean doNotSkipProcessAdjTable) {
            this.doNotSkipProcessAdjTable = doNotSkipProcessAdjTable;
        }
    boolean doNotSkipExit = true;

    public boolean getDoNotSkipExit() {
        return this.doNotSkipExit;
    }

    public void setDoNotSkipExit(boolean doNotSkipExit) {
            this.doNotSkipExit = doNotSkipExit;
        }
    boolean loopReadAdjTable = true;

    public boolean getLoopReadAdjTable() {
        return this.loopReadAdjTable;
    }

    public void setLoopReadAdjTable(boolean loopReadAdjTable) {
            this.loopReadAdjTable = loopReadAdjTable;
        }

    public TableAreas getTableAreas() {
        if (tableAreas == null) {
            tableAreas = new TableAreas();
        }

        return tableAreas;
    }

    public void setTableAreas(TableAreas tableAreas) {
        this.tableAreas = tableAreas;
    }
    public Adjtable getAdjtable() {
        if (adjtable == null) {
            adjtable = new Adjtable();
        }

        return adjtable;
    }

    public void setAdjtable(Adjtable adjtable) {
        this.adjtable = adjtable;
    }
    public TmAdjDate getTmAdjDate() {
        if (tmAdjDate == null) {
            tmAdjDate = new TmAdjDate();
        }

        return tmAdjDate;
    }

    public void setTmAdjDate(TmAdjDate tmAdjDate) {
        this.tmAdjDate = tmAdjDate;
    }
    public Ov4ParameterList getOv4ParameterList() {
        if (ov4ParameterList == null) {
            ov4ParameterList = new Ov4ParameterList();
        }

        return ov4ParameterList;
    }

    public void setOv4ParameterList(Ov4ParameterList ov4ParameterList) {
        this.ov4ParameterList = ov4ParameterList;
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
    public TmRecord getTmRecord() {
        if (tmRecord == null) {
            tmRecord = new TmRecord();
        }

        return tmRecord;
    }

    public void setTmRecord(TmRecord tmRecord) {
        this.tmRecord = tmRecord;
    }
    public WaCurrentDateGroup getWaCurrentDateGroup() {
        if (waCurrentDateGroup == null) {
            waCurrentDateGroup = new WaCurrentDateGroup();
        }

        return waCurrentDateGroup;
    }

    public void setWaCurrentDateGroup(WaCurrentDateGroup waCurrentDateGroup) {
        this.waCurrentDateGroup = waCurrentDateGroup;
    }

    public int getTaAdjIndex() {
        return taAdjIndex;
    }

    public void setTaAdjIndex(int taAdjIndex) {
        this.taAdjIndex = taAdjIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableAreas.hashCode();
        str += adjtable.hashCode();
        str += tmAdjDate.hashCode();
        str += ov4ParameterList.hashCode();
        str += work.hashCode();
        str += tmRecord.hashCode();
        str += waCurrentDateGroup.hashCode();
       return str.hashCode();
    }

    public UsbaeextCtx clone() {
        UsbaeextCtx cloneObj = new UsbaeextCtx();
        cloneObj.tableAreas = new TableAreas();
        cloneObj.tableAreas.set(tableAreas.getClonedField());
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        cloneObj.tmAdjDate = new TmAdjDate();
        cloneObj.tmAdjDate.set(tmAdjDate.getClonedField());
        cloneObj.ov4ParameterList = new Ov4ParameterList();
        cloneObj.ov4ParameterList.set(ov4ParameterList.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tmRecord = new TmRecord();
        cloneObj.tmRecord.set(tmRecord.getClonedField());
        cloneObj.waCurrentDateGroup = new WaCurrentDateGroup();
        cloneObj.waCurrentDateGroup.set(waCurrentDateGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = UsbaeextCtx.this.getWork();

	/**
	 *	Returns the value of waReturnCode
	 *	@return waReturnCode
	 */
	public int getWaReturnCode() throws CFException {        
   		return work.getWaReturnCode();
	}
	
	/**
	 * 	Update WaReturnCode with the passed value
	 *	@param number
	 */
	public void setWaReturnCode(int number)  throws CFException{
		work.setWaReturnCode(number);
	}


	public void setWaReturnCode(long number)  throws CFException{
		work.setWaReturnCode((int)number);
	}


	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException  {              
   		return work.getWaEndSw();
   }

  
	/**
	*  set variable waEndSw
	*  @param value
	**/
   public void setWaEndSw(char[] value) throws CFException {
      work.setWaEndSw(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
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

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = UsbaeextCtx.this.getWork();

	/**
	 *	Returns the value of waReturnCode
	 *	@return waReturnCode
	 */
	public int getWaReturnCode() throws CFException {        
   		return work.getWaReturnCode();
	}
	
	/**
	 * 	Update WaReturnCode with the passed value
	 *	@param number
	 */
	public void setWaReturnCode(int number)  throws CFException{
		work.setWaReturnCode(number);
	}


	public void setWaReturnCode(long number)  throws CFException{
		work.setWaReturnCode((int)number);
	}



        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class InitializationInCtx implements Cloneable {
     Adjtable adjtable = UsbaeextCtx.this.getAdjtable();
     Work work = UsbaeextCtx.this.getWork();

	/**
	 *	Returns the value of adjtable
	 *	@return adjtable
	 */   
	 public Adjtable getAdjtable() {
   	return adjtable;
   }



        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }

        public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += adjtable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializationInCtx clone() {
        InitializationInCtx cloneObj = new InitializationInCtx();
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationInCtx getInitializationInCtx() {
            return new InitializationInCtx();
    }
     public class InitializationOutCtx implements Cloneable {
     Adjtable adjtable = UsbaeextCtx.this.getAdjtable();
     Work work = UsbaeextCtx.this.getWork();


public void setTaAdjIndex(int taAdjIndex) { 
    UsbaeextCtx.this.taAdjIndex = taAdjIndex;
}

public int getTaAdjIndex() { 
    return UsbaeextCtx.this.taAdjIndex;
}
	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException  {              
   		return work.getWaEndSw();
   }

  
	/**
	*  set variable waEndSw
	*  @param value
	**/
   public void setWaEndSw(char[] value) throws CFException {
      work.setWaEndSw(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += adjtable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializationOutCtx clone() {
        InitializationOutCtx cloneObj = new InitializationOutCtx();
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     Ov4ParameterList ov4ParameterList = UsbaeextCtx.this.getOv4ParameterList();
     TmRecord tmRecord = UsbaeextCtx.this.getTmRecord();

	/**
	 *	Returns the value of ov4ParameterList
	 *	@return ov4ParameterList
	 */   
	 public Ov4ParameterList getOv4ParameterList() {
   	return ov4ParameterList;
   }


	/**
	 *	Returns the value of tmRecord
	 *	@return tmRecord
	 */   
	 public TmRecord getTmRecord() {
   	return tmRecord;
   }



        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ov4ParameterList.hashCode();
        str += tmRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.ov4ParameterList = new Ov4ParameterList();
        cloneObj.ov4ParameterList.set(ov4ParameterList.getClonedField());
        cloneObj.tmRecord = new TmRecord();
        cloneObj.tmRecord.set(tmRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class ReadTmFileOutCtx implements Cloneable {
     Work work = UsbaeextCtx.this.getWork();
     TmRecord tmRecord = UsbaeextCtx.this.getTmRecord();

	/**
	 *	Returns the value of tmRecord
	 *	@return tmRecord
	 */   
	 public TmRecord getTmRecord() {
   	return tmRecord;
   }


	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException  {              
   		return work.getWaEndSw();
   }

  
	/**
	*  set variable waEndSw
	*  @param value
	**/
   public void setWaEndSw(char[] value) throws CFException {
      work.setWaEndSw(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
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
        str += tmRecord.hashCode();
       return str.hashCode();
    }

    public ReadTmFileOutCtx clone() {
        ReadTmFileOutCtx cloneObj = new ReadTmFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tmRecord = new TmRecord();
        cloneObj.tmRecord.set(tmRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReadTmFileOutCtx getReadTmFileOutCtx() {
            return new ReadTmFileOutCtx();
    }
     public class ProcessFileInCtx implements Cloneable {
     Work work = UsbaeextCtx.this.getWork();

	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException  {              
   		return work.getWaEndSw();
   }

  
	/**
	*  set variable waEndSw
	*  @param value
	**/
   public void setWaEndSw(char[] value) throws CFException {
      work.setWaEndSw(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
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

    public ProcessFileInCtx clone() {
        ProcessFileInCtx cloneObj = new ProcessFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessFileInCtx getProcessFileInCtx() {
            return new ProcessFileInCtx();
    }
     public class ProcessTmInCtx implements Cloneable {
     TmAdjDate tmAdjDate = UsbaeextCtx.this.getTmAdjDate();
     Work work = UsbaeextCtx.this.getWork();
     TmRecord tmRecord = UsbaeextCtx.this.getTmRecord();

	/**
	 *	Returns the value of tmRecord
	 *	@return tmRecord
	 */   
	 public TmRecord getTmRecord() {
   	return tmRecord;
   }



        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }

        public ProcessTmOutCtx getProcessTmOutCtx() {
            return new ProcessTmOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tmAdjDate.hashCode();
        str += work.hashCode();
        str += tmRecord.hashCode();
       return str.hashCode();
    }

    public ProcessTmInCtx clone() {
        ProcessTmInCtx cloneObj = new ProcessTmInCtx();
        cloneObj.tmAdjDate = new TmAdjDate();
        cloneObj.tmAdjDate.set(tmAdjDate.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tmRecord = new TmRecord();
        cloneObj.tmRecord.set(tmRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTmInCtx getProcessTmInCtx() {
            return new ProcessTmInCtx();
    }
     public class ProcessTmOutCtx implements Cloneable {
     TmAdjDate tmAdjDate = UsbaeextCtx.this.getTmAdjDate();
     Work work = UsbaeextCtx.this.getWork();
     TmRecord tmRecord = UsbaeextCtx.this.getTmRecord();

	/**
	 *	Returns the value of tmAdjFirstDrn
	 *	@return tmAdjFirstDrn
	 */
   public char[] getTmAdjFirstDrn() throws CFException  {              
   		return work.getTmAdjFirstDrn();
   }

  
	/**
	*  set variable tmAdjFirstDrn
	*  @param value
	**/
   public void setTmAdjFirstDrn(char[] value) throws CFException {
      work.setTmAdjFirstDrn(value);
   } 

	/**
	 *	Returns the value of tmAdjPset
	 *	@return tmAdjPset
	 */
   public char[] getTmAdjPset() throws CFException  {              
   		return work.getTmAdjPset();
   }

  
	/**
	*  set variable tmAdjPset
	*  @param value
	**/
   public void setTmAdjPset(char[] value) throws CFException {
      work.setTmAdjPset(value);
   } 

	/**
	 *	Returns the value of tmAdjAcct
	 *	@return tmAdjAcct
	 */
   public char[] getTmAdjAcct() throws CFException  {              
   		return work.getTmAdjAcct();
   }

  
	/**
	*  set variable tmAdjAcct
	*  @param value
	**/
   public void setTmAdjAcct(char[] value) throws CFException {
      work.setTmAdjAcct(value);
   } 

	/**
	 *	Returns the value of tmAdjDrn
	 *	@return tmAdjDrn
	 */
   public char[] getTmAdjDrn() throws CFException  {              
   		return work.getTmAdjDrn();
   }

  
	/**
	*  set variable tmAdjDrn
	*  @param value
	**/
   public void setTmAdjDrn(char[] value) throws CFException {
      work.setTmAdjDrn(value);
   } 

	/**
	 *	Returns the value of tmAdjAdviceKey
	 *	@return tmAdjAdviceKey
	 */
   public char[] getTmAdjAdviceKey() throws CFException  {              
   		return work.getTmAdjAdviceKey();
   }

  
	/**
	*  set variable tmAdjAdviceKey
	*  @param value
	**/
   public void setTmAdjAdviceKey(char[] value) throws CFException {
      work.setTmAdjAdviceKey(value);
   } 

	/**
	 *	Returns the value of tmAdjAppInstance
	 *	@return tmAdjAppInstance
	 */
   public char[] getTmAdjAppInstance() throws CFException  {              
   		return work.getTmAdjAppInstance();
   }

  
	/**
	*  set variable tmAdjAppInstance
	*  @param value
	**/
   public void setTmAdjAppInstance(char[] value) throws CFException {
      work.setTmAdjAppInstance(value);
   } 

	/**
	 *	Returns the value of tmAdjDepAcct
	 *	@return tmAdjDepAcct
	 */
   public char[] getTmAdjDepAcct() throws CFException  {              
   		return work.getTmAdjDepAcct();
   }

  
	/**
	*  set variable tmAdjDepAcct
	*  @param value
	**/
   public void setTmAdjDepAcct(char[] value) throws CFException {
      work.setTmAdjDepAcct(value);
   } 

	/**
	 *	Returns the value of tmAdjDepDdrKey
	 *	@return tmAdjDepDdrKey
	 */
   public char[] getTmAdjDepDdrKey() throws CFException  {              
   		return work.getTmAdjDepDdrKey();
   }

  
	/**
	*  set variable tmAdjDepDdrKey
	*  @param value
	**/
   public void setTmAdjDepDdrKey(char[] value) throws CFException {
      work.setTmAdjDepDdrKey(value);
   } 

	/**
	 *	Returns the value of tmAdjDdrKey
	 *	@return tmAdjDdrKey
	 */
   public char[] getTmAdjDdrKey() throws CFException  {              
   		return work.getTmAdjDdrKey();
   }

  
	/**
	*  set variable tmAdjDdrKey
	*  @param value
	**/
   public void setTmAdjDdrKey(char[] value) throws CFException {
      work.setTmAdjDdrKey(value);
   } 

	/**
	 *	Returns the value of tmAdjCode
	 *	@return tmAdjCode
	 */
   public char[] getTmAdjCode() throws CFException  {              
   		return work.getTmAdjCode();
   }

  
	/**
	*  set variable tmAdjCode
	*  @param value
	**/
   public void setTmAdjCode(char[] value) throws CFException {
      work.setTmAdjCode(value);
   } 

	/**
	 *	Returns the value of tmAdjCorrF5
	 *	@return tmAdjCorrF5
	 */
   public char[] getTmAdjCorrF5() throws CFException  {              
   		return work.getTmAdjCorrF5();
   }

  
	/**
	*  set variable tmAdjCorrF5
	*  @param value
	**/
   public void setTmAdjCorrF5(char[] value) throws CFException {
      work.setTmAdjCorrF5(value);
   } 

	/**
	 *	Returns the value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public long getTmAdjTime() throws CFException {
   		return work.getTmAdjTime();
	}


	/**
	 *	Returns String value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public char[]  getTmAdjTimeString() throws CFException {
	     return String.valueOf(work.getTmAdjTimeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjTimeIsNumeric()  throws CFException{
	    return work.tmAdjTimeIsNumeric();
	}

	/**
	 * 	Update TmAdjTime with the passed value
	 *	@param number
	 */
	public void setTmAdjTime(long number)  throws CFException{
		work.setTmAdjTime(number);
	}
	

	
	/**
	 * 	Update TmAdjTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjTime(char[] value)  throws CFException {
		work.setTmAdjTime(value);
	}
	
	/**
	 * 	Update TmAdjTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjTimeString(char[] value)  throws CFException{
		work.setTmAdjTime(value);
	}	

	/**
	 *	Returns the value of tmAdjComment
	 *	@return tmAdjComment
	 */
   public char[] getTmAdjComment() throws CFException  {              
   		return work.getTmAdjComment();
   }

  
	/**
	*  set variable tmAdjComment
	*  @param value
	**/
   public void setTmAdjComment(char[] value) throws CFException {
      work.setTmAdjComment(value);
   } 

	/**
	 *	Returns the value of tmAdjItemClass
	 *	@return tmAdjItemClass
	 */
   public char[] getTmAdjItemClass() throws CFException  {              
   		return work.getTmAdjItemClass();
   }

  
	/**
	*  set variable tmAdjItemClass
	*  @param value
	**/
   public void setTmAdjItemClass(char[] value) throws CFException {
      work.setTmAdjItemClass(value);
   } 

	/**
	 *	Returns the value of tmAdjClass
	 *	@return tmAdjClass
	 */
   public char[] getTmAdjClass() throws CFException  {              
   		return work.getTmAdjClass();
   }

  
	/**
	*  set variable tmAdjClass
	*  @param value
	**/
   public void setTmAdjClass(char[] value) throws CFException {
      work.setTmAdjClass(value);
   } 

	/**
	 *	Returns the value of tmAdjAmt
	 *	@return tmAdjAmt
	 */
	public BigDecimal getTmAdjAmt() throws CFException {
   		return work.getTmAdjAmt();
	}


	 /**
     *	Returns String value of tmAdjAmt
     *	@return tmAdjAmt
     */
    public char[]  getTmAdjAmtString() throws CFException {
         return work.getTmAdjAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjAmtIsNumeric() {
        return work.tmAdjAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjAmt(BigDecimal number)  throws CFException{
		work.setTmAdjAmt(number);
   }

	/**
	 * 	Update TmAdjAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjAmt(char[] value)  throws CFException{
		work.setTmAdjAmt(value);
	}   

	/**
	 *	Returns the value of tmAdjDepAmt
	 *	@return tmAdjDepAmt
	 */
	public BigDecimal getTmAdjDepAmt() throws CFException {
   		return work.getTmAdjDepAmt();
	}


	 /**
     *	Returns String value of tmAdjDepAmt
     *	@return tmAdjDepAmt
     */
    public char[]  getTmAdjDepAmtString() throws CFException {
         return work.getTmAdjDepAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjDepAmtIsNumeric() {
        return work.tmAdjDepAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjDepAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjDepAmt(BigDecimal number)  throws CFException{
		work.setTmAdjDepAmt(number);
   }

	/**
	 * 	Update TmAdjDepAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjDepAmt(char[] value)  throws CFException{
		work.setTmAdjDepAmt(value);
	}   

	/**
	 *	Returns the value of tmAdjOperNo
	 *	@return tmAdjOperNo
	 */
   public char[] getTmAdjOperNo() throws CFException  {              
   		return work.getTmAdjOperNo();
   }

  
	/**
	*  set variable tmAdjOperNo
	*  @param value
	**/
   public void setTmAdjOperNo(char[] value) throws CFException {
      work.setTmAdjOperNo(value);
   } 

	/**
	 *	Returns the value of tmAdjName
	 *	@return tmAdjName
	 */
   public char[] getTmAdjName() throws CFException  {              
   		return work.getTmAdjName();
   }

  
	/**
	*  set variable tmAdjName
	*  @param value
	**/
   public void setTmAdjName(char[] value) throws CFException {
      work.setTmAdjName(value);
   } 

	/**
	 *	Returns the value of tmAdjRt
	 *	@return tmAdjRt
	 */
   public char[] getTmAdjRt() throws CFException  {              
   		return work.getTmAdjRt();
   }

  
	/**
	*  set variable tmAdjRt
	*  @param value
	**/
   public void setTmAdjRt(char[] value) throws CFException {
      work.setTmAdjRt(value);
   } 

	/**
	 *	Returns the value of tmAdjCycle
	 *	@return tmAdjCycle
	 */
   public char[] getTmAdjCycle() throws CFException  {              
   		return work.getTmAdjCycle();
   }

  
	/**
	*  set variable tmAdjCycle
	*  @param value
	**/
   public void setTmAdjCycle(char[] value) throws CFException {
      work.setTmAdjCycle(value);
   } 

	/**
	 *	Returns the value of tmAdjCorrAmt
	 *	@return tmAdjCorrAmt
	 */
	public BigDecimal getTmAdjCorrAmt() throws CFException {
   		return work.getTmAdjCorrAmt();
	}


	 /**
     *	Returns String value of tmAdjCorrAmt
     *	@return tmAdjCorrAmt
     */
    public char[]  getTmAdjCorrAmtString() throws CFException {
         return work.getTmAdjCorrAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjCorrAmtIsNumeric() {
        return work.tmAdjCorrAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjCorrAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjCorrAmt(BigDecimal number)  throws CFException{
		work.setTmAdjCorrAmt(number);
   }

	/**
	 * 	Update TmAdjCorrAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjCorrAmt(char[] value)  throws CFException{
		work.setTmAdjCorrAmt(value);
	}   

	/**
	 *	Returns the value of tmAdjEntry
	 *	@return tmAdjEntry
	 */
   public char[] getTmAdjEntry() throws CFException  {              
   		return work.getTmAdjEntry();
   }

  
	/**
	*  set variable tmAdjEntry
	*  @param value
	**/
   public void setTmAdjEntry(char[] value) throws CFException {
      work.setTmAdjEntry(value);
   } 

	/**
	 *	Returns the value of tmAdjEnd
	 *	@return tmAdjEnd
	 */
   public char[] getTmAdjEnd() throws CFException  {              
   		return work.getTmAdjEnd();
   }

  
	/**
	*  set variable tmAdjEnd
	*  @param value
	**/
   public void setTmAdjEnd(char[] value) throws CFException {
      work.setTmAdjEnd(value);
   } 

	/**
	 *	Returns the value of tmAdjDate
	 *	@return tmAdjDate
	 */   
	 public TmAdjDate getTmAdjDate() {
   	return tmAdjDate;
   }


	/**
	 *	Returns the value of tmAdjLookupText
	 *	@return tmAdjLookupText
	 */
   public char[] getTmAdjLookupText() throws CFException  {              
   		return work.getTmAdjLookupText();
   }

  
	/**
	*  set variable tmAdjLookupText
	*  @param value
	**/
   public void setTmAdjLookupText(char[] value) throws CFException {
      work.setTmAdjLookupText(value);
   } 

	/**
	 *	Returns the value of tmRecord
	 *	@return tmRecord
	 */   
	 public TmRecord getTmRecord() {
   	return tmRecord;
   }


	/**
	 *	Returns the value of tmAdjEntryKey
	 *	@return tmAdjEntryKey
	 */
   public char[] getTmAdjEntryKey() throws CFException  {              
   		return work.getTmAdjEntryKey();
   }

  
	/**
	*  set variable tmAdjEntryKey
	*  @param value
	**/
   public void setTmAdjEntryKey(char[] value) throws CFException {
      work.setTmAdjEntryKey(value);
   } 

	/**
	 *	Returns the value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public long getTmAdjNo() throws CFException {
   		return work.getTmAdjNo();
	}


	/**
	 *	Returns String value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public char[]  getTmAdjNoString() throws CFException {
	     return String.valueOf(work.getTmAdjNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjNoIsNumeric()  throws CFException{
	    return work.tmAdjNoIsNumeric();
	}

	/**
	 * 	Update TmAdjNo with the passed value
	 *	@param number
	 */
	public void setTmAdjNo(long number)  throws CFException{
		work.setTmAdjNo(number);
	}
	

	
	/**
	 * 	Update TmAdjNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjNo(char[] value)  throws CFException {
		work.setTmAdjNo(value);
	}
	
	/**
	 * 	Update TmAdjNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjNoString(char[] value)  throws CFException{
		work.setTmAdjNo(value);
	}	

	/**
	 *	Returns the value of tmAdjDepF5
	 *	@return tmAdjDepF5
	 */
   public char[] getTmAdjDepF5() throws CFException  {              
   		return work.getTmAdjDepF5();
   }

  
	/**
	*  set variable tmAdjDepF5
	*  @param value
	**/
   public void setTmAdjDepF5(char[] value) throws CFException {
      work.setTmAdjDepF5(value);
   } 

	/**
	 *	Returns the value of tmAdjState
	 *	@return tmAdjState
	 */
   public char[] getTmAdjState() throws CFException  {              
   		return work.getTmAdjState();
   }

  
	/**
	*  set variable tmAdjState
	*  @param value
	**/
   public void setTmAdjState(char[] value) throws CFException {
      work.setTmAdjState(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tmAdjDate.hashCode();
        str += work.hashCode();
        str += tmRecord.hashCode();
       return str.hashCode();
    }

    public ProcessTmOutCtx clone() {
        ProcessTmOutCtx cloneObj = new ProcessTmOutCtx();
        cloneObj.tmAdjDate = new TmAdjDate();
        cloneObj.tmAdjDate.set(tmAdjDate.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tmRecord = new TmRecord();
        cloneObj.tmRecord.set(tmRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTmOutCtx getProcessTmOutCtx() {
            return new ProcessTmOutCtx();
    }
     public class CreateAeOutputRecordInCtx implements Cloneable {
     TableAreas tableAreas = UsbaeextCtx.this.getTableAreas();
     TmAdjDate tmAdjDate = UsbaeextCtx.this.getTmAdjDate();
     Ov4ParameterList ov4ParameterList = UsbaeextCtx.this.getOv4ParameterList();
     Work work = UsbaeextCtx.this.getWork();
     WaCurrentDateGroup waCurrentDateGroup = UsbaeextCtx.this.getWaCurrentDateGroup();

public int getTaAdjIndexMax() throws CFException {  
        return tableAreas.getTaAdjIndexMax();
}
	/**
	 * 	Update TaAdjIndexMax with the passed value
	 *	@param number
	 */
	public void setTaAdjIndexMax(int number)  throws CFException{
		tableAreas.setTaAdjIndexMax(number);
	}


	public void setTaAdjIndexMax(long number)  throws CFException{
	    tableAreas.setTaAdjIndexMax(number);
	}
	

	/**
	 *	Returns the value of taClerkId
	 *	@return taClerkId
	 */
   public char[] getTaClerkId(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaClerkId();
   }

  
	/**
	*  set variable taClerkId
	*  @param value
	**/
   public void setTaClerkId(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(value);
   } 

     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex);
   	
   }
   
   public void setTaClerkId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaClerkId with another Field
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source);
   }  
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjFirstDrn
	 *	@return tmAdjFirstDrn
	 */
   public char[] getTmAdjFirstDrn() throws CFException  {              
   		return work.getTmAdjFirstDrn();
   }

  
	/**
	*  set variable tmAdjFirstDrn
	*  @param value
	**/
   public void setTmAdjFirstDrn(char[] value) throws CFException {
      work.setTmAdjFirstDrn(value);
   } 

	/**
	 *	Returns the value of tmAdjPset
	 *	@return tmAdjPset
	 */
   public char[] getTmAdjPset() throws CFException  {              
   		return work.getTmAdjPset();
   }

  
	/**
	*  set variable tmAdjPset
	*  @param value
	**/
   public void setTmAdjPset(char[] value) throws CFException {
      work.setTmAdjPset(value);
   } 

	/**
	 *	Returns the value of tmAdjDateYyyy
	 *	@return tmAdjDateYyyy
	 */
   public char[] getTmAdjDateYyyy() throws CFException  {              
   		return tmAdjDate.getTmAdjDateYyyy();
   }

  
	/**
	*  set variable tmAdjDateYyyy
	*  @param value
	**/
   public void setTmAdjDateYyyy(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateYyyy(value);
   } 

     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateYyyy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateYyyy with another Field
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source) {
      tmAdjDate.setTmAdjDateYyyy(source);
   }  
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjAcct
	 *	@return tmAdjAcct
	 */
   public char[] getTmAdjAcct() throws CFException  {              
   		return work.getTmAdjAcct();
   }

  
	/**
	*  set variable tmAdjAcct
	*  @param value
	**/
   public void setTmAdjAcct(char[] value) throws CFException {
      work.setTmAdjAcct(value);
   } 

	/**
	 *	Returns the value of tmAdjDrn
	 *	@return tmAdjDrn
	 */
   public char[] getTmAdjDrn() throws CFException  {              
   		return work.getTmAdjDrn();
   }

  
	/**
	*  set variable tmAdjDrn
	*  @param value
	**/
   public void setTmAdjDrn(char[] value) throws CFException {
      work.setTmAdjDrn(value);
   } 

	/**
	 *	Returns the value of waCdYyyy
	 *	@return waCdYyyy
	 */
   public char[] getWaCdYyyy() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdYyyy();
   }

  
	/**
	*  set variable waCdYyyy
	*  @param value
	**/
   public void setWaCdYyyy(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(value);
   } 

     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex);
   	
   }
   
   public void setWaCdYyyy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdYyyy with another Field
	 *	@param value
	 */
   public void setWaCdYyyy(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source);
   }  
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSrcErrorCd
	 *	@return taSrcErrorCd
	 */
   public char[] getTaSrcErrorCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcErrorCd();
   }

  
	/**
	*  set variable taSrcErrorCd
	*  @param value
	**/
   public void setTaSrcErrorCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(value);
   } 

     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcErrorCd with another Field
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source);
   }  
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjAdviceKey
	 *	@return tmAdjAdviceKey
	 */
   public char[] getTmAdjAdviceKey() throws CFException  {              
   		return work.getTmAdjAdviceKey();
   }

  
	/**
	*  set variable tmAdjAdviceKey
	*  @param value
	**/
   public void setTmAdjAdviceKey(char[] value) throws CFException {
      work.setTmAdjAdviceKey(value);
   } 

	/**
	 *	Returns the value of tmAdjAppInstance
	 *	@return tmAdjAppInstance
	 */
   public char[] getTmAdjAppInstance() throws CFException  {              
   		return work.getTmAdjAppInstance();
   }

  
	/**
	*  set variable tmAdjAppInstance
	*  @param value
	**/
   public void setTmAdjAppInstance(char[] value) throws CFException {
      work.setTmAdjAppInstance(value);
   } 

	/**
	 *	Returns the value of taAcctCd
	 *	@return taAcctCd
	 */
   public char[] getTaAcctCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaAcctCd();
   }

  
	/**
	*  set variable taAcctCd
	*  @param value
	**/
   public void setTaAcctCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(value);
   } 

     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex);
   	
   }
   
   public void setTaAcctCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaAcctCd with another Field
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source);
   }  
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjDepAcct
	 *	@return tmAdjDepAcct
	 */
   public char[] getTmAdjDepAcct() throws CFException  {              
   		return work.getTmAdjDepAcct();
   }

  
	/**
	*  set variable tmAdjDepAcct
	*  @param value
	**/
   public void setTmAdjDepAcct(char[] value) throws CFException {
      work.setTmAdjDepAcct(value);
   } 

	/**
	 *	Returns the value of tmAdjDepDdrKey
	 *	@return tmAdjDepDdrKey
	 */
   public char[] getTmAdjDepDdrKey() throws CFException  {              
   		return work.getTmAdjDepDdrKey();
   }

  
	/**
	*  set variable tmAdjDepDdrKey
	*  @param value
	**/
   public void setTmAdjDepDdrKey(char[] value) throws CFException {
      work.setTmAdjDepDdrKey(value);
   } 

	/**
	 *	Returns the value of taSrcReceiptCd
	 *	@return taSrcReceiptCd
	 */
   public char[] getTaSrcReceiptCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcReceiptCd();
   }

  
	/**
	*  set variable taSrcReceiptCd
	*  @param value
	**/
   public void setTaSrcReceiptCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(value);
   } 

     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source);
   }  
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjDdrKey
	 *	@return tmAdjDdrKey
	 */
   public char[] getTmAdjDdrKey() throws CFException  {              
   		return work.getTmAdjDdrKey();
   }

  
	/**
	*  set variable tmAdjDdrKey
	*  @param value
	**/
   public void setTmAdjDdrKey(char[] value) throws CFException {
      work.setTmAdjDdrKey(value);
   } 

	/**
	 *	Returns the value of tmAdjDateDd
	 *	@return tmAdjDateDd
	 */
   public char[] getTmAdjDateDd() throws CFException  {              
   		return tmAdjDate.getTmAdjDateDd();
   }

  
	/**
	*  set variable tmAdjDateDd
	*  @param value
	**/
   public void setTmAdjDateDd(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateDd(value);
   } 

     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateDd with another Field
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source) {
      tmAdjDate.setTmAdjDateDd(source);
   }  
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjCode
	 *	@return tmAdjCode
	 */
   public char[] getTmAdjCode() throws CFException  {              
   		return work.getTmAdjCode();
   }

  
	/**
	*  set variable tmAdjCode
	*  @param value
	**/
   public void setTmAdjCode(char[] value) throws CFException {
      work.setTmAdjCode(value);
   } 

	/**
	 *	Returns the value of tmAdjCorrF5
	 *	@return tmAdjCorrF5
	 */
   public char[] getTmAdjCorrF5() throws CFException  {              
   		return work.getTmAdjCorrF5();
   }

  
	/**
	*  set variable tmAdjCorrF5
	*  @param value
	**/
   public void setTmAdjCorrF5(char[] value) throws CFException {
      work.setTmAdjCorrF5(value);
   } 

	/**
	 *	Returns the value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public long getTmAdjTime() throws CFException {
   		return work.getTmAdjTime();
	}


	/**
	 *	Returns String value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public char[]  getTmAdjTimeString() throws CFException {
	     return String.valueOf(work.getTmAdjTimeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjTimeIsNumeric()  throws CFException{
	    return work.tmAdjTimeIsNumeric();
	}

	/**
	 * 	Update TmAdjTime with the passed value
	 *	@param number
	 */
	public void setTmAdjTime(long number)  throws CFException{
		work.setTmAdjTime(number);
	}
	

	
	/**
	 * 	Update TmAdjTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjTime(char[] value)  throws CFException {
		work.setTmAdjTime(value);
	}
	
	/**
	 * 	Update TmAdjTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjTimeString(char[] value)  throws CFException{
		work.setTmAdjTime(value);
	}	

	/**
	 *	Returns the value of tmAdjComment
	 *	@return tmAdjComment
	 */
   public char[] getTmAdjComment() throws CFException  {              
   		return work.getTmAdjComment();
   }

  
	/**
	*  set variable tmAdjComment
	*  @param value
	**/
   public void setTmAdjComment(char[] value) throws CFException {
      work.setTmAdjComment(value);
   } 

	/**
	 *	Returns the value of tmAdjItemClass
	 *	@return tmAdjItemClass
	 */
   public char[] getTmAdjItemClass() throws CFException  {              
   		return work.getTmAdjItemClass();
   }

  
	/**
	*  set variable tmAdjItemClass
	*  @param value
	**/
   public void setTmAdjItemClass(char[] value) throws CFException {
      work.setTmAdjItemClass(value);
   } 

	/**
	 *	Returns the value of waCdMm
	 *	@return waCdMm
	 */
   public char[] getWaCdMm() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdMm();
   }

  
	/**
	*  set variable waCdMm
	*  @param value
	**/
   public void setWaCdMm(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(value);
   } 

     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex);
   	
   }
   
   public void setWaCdMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdMm with another Field
	 *	@param value
	 */
   public void setWaCdMm(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source);
   }  
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of waCurrentDateGroup
	 *	@return waCurrentDateGroup
	 */   
	 public WaCurrentDateGroup getWaCurrentDateGroup() {
   	return waCurrentDateGroup;
   }



public void setTaAdjIndex(int taAdjIndex) { 
    UsbaeextCtx.this.taAdjIndex = taAdjIndex;
}

public int getTaAdjIndex() { 
    return UsbaeextCtx.this.taAdjIndex;
}
	/**
	 *	Returns the value of tmAdjClass
	 *	@return tmAdjClass
	 */
   public char[] getTmAdjClass() throws CFException  {              
   		return work.getTmAdjClass();
   }

  
	/**
	*  set variable tmAdjClass
	*  @param value
	**/
   public void setTmAdjClass(char[] value) throws CFException {
      work.setTmAdjClass(value);
   } 

	/**
	 *	Returns the value of tmAdjAmt
	 *	@return tmAdjAmt
	 */
	public BigDecimal getTmAdjAmt() throws CFException {
   		return work.getTmAdjAmt();
	}


	 /**
     *	Returns String value of tmAdjAmt
     *	@return tmAdjAmt
     */
    public char[]  getTmAdjAmtString() throws CFException {
         return work.getTmAdjAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjAmtIsNumeric() {
        return work.tmAdjAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjAmt(BigDecimal number)  throws CFException{
		work.setTmAdjAmt(number);
   }

	/**
	 * 	Update TmAdjAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjAmt(char[] value)  throws CFException{
		work.setTmAdjAmt(value);
	}   

	/**
	 *	Returns the value of taDeptNo
	 *	@return taDeptNo
	 */
   public char[] getTaDeptNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaDeptNo();
   }

  
	/**
	*  set variable taDeptNo
	*  @param value
	**/
   public void setTaDeptNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(value);
   } 

     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex);
   	
   }
   
   public void setTaDeptNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaDeptNo with another Field
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source);
   }  
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjDepAmt
	 *	@return tmAdjDepAmt
	 */
	public BigDecimal getTmAdjDepAmt() throws CFException {
   		return work.getTmAdjDepAmt();
	}


	 /**
     *	Returns String value of tmAdjDepAmt
     *	@return tmAdjDepAmt
     */
    public char[]  getTmAdjDepAmtString() throws CFException {
         return work.getTmAdjDepAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjDepAmtIsNumeric() {
        return work.tmAdjDepAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjDepAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjDepAmt(BigDecimal number)  throws CFException{
		work.setTmAdjDepAmt(number);
   }

	/**
	 * 	Update TmAdjDepAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjDepAmt(char[] value)  throws CFException{
		work.setTmAdjDepAmt(value);
	}   

	/**
	 *	Returns the value of tmAdjOperNo
	 *	@return tmAdjOperNo
	 */
   public char[] getTmAdjOperNo() throws CFException  {              
   		return work.getTmAdjOperNo();
   }

  
	/**
	*  set variable tmAdjOperNo
	*  @param value
	**/
   public void setTmAdjOperNo(char[] value) throws CFException {
      work.setTmAdjOperNo(value);
   } 

	/**
	 *	Returns the value of tmAdjName
	 *	@return tmAdjName
	 */
   public char[] getTmAdjName() throws CFException  {              
   		return work.getTmAdjName();
   }

  
	/**
	*  set variable tmAdjName
	*  @param value
	**/
   public void setTmAdjName(char[] value) throws CFException {
      work.setTmAdjName(value);
   } 

	/**
	 *	Returns the value of tmAdjRt
	 *	@return tmAdjRt
	 */
   public char[] getTmAdjRt() throws CFException  {              
   		return work.getTmAdjRt();
   }

  
	/**
	*  set variable tmAdjRt
	*  @param value
	**/
   public void setTmAdjRt(char[] value) throws CFException {
      work.setTmAdjRt(value);
   } 

	/**
	 *	Returns the value of tmAdjCycle
	 *	@return tmAdjCycle
	 */
   public char[] getTmAdjCycle() throws CFException  {              
   		return work.getTmAdjCycle();
   }

  
	/**
	*  set variable tmAdjCycle
	*  @param value
	**/
   public void setTmAdjCycle(char[] value) throws CFException {
      work.setTmAdjCycle(value);
   } 

	/**
	 *	Returns the value of taBankNo
	 *	@return taBankNo
	 */
   public char[] getTaBankNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaBankNo();
   }

  
	/**
	*  set variable taBankNo
	*  @param value
	**/
   public void setTaBankNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(value);
   } 

     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex);
   	
   }
   
   public void setTaBankNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaBankNo with another Field
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source);
   }  
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taTypeCd
	 *	@return taTypeCd
	 */
   public char[] getTaTypeCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaTypeCd();
   }

  
	/**
	*  set variable taTypeCd
	*  @param value
	**/
   public void setTaTypeCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(value);
   } 

     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex);
   	
   }
   
   public void setTaTypeCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaTypeCd with another Field
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source);
   }  
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjCorrAmt
	 *	@return tmAdjCorrAmt
	 */
	public BigDecimal getTmAdjCorrAmt() throws CFException {
   		return work.getTmAdjCorrAmt();
	}


	 /**
     *	Returns String value of tmAdjCorrAmt
     *	@return tmAdjCorrAmt
     */
    public char[]  getTmAdjCorrAmtString() throws CFException {
         return work.getTmAdjCorrAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tmAdjCorrAmtIsNumeric() {
        return work.tmAdjCorrAmtIsNumeric();
    }
	/**
	 * 	Update TmAdjCorrAmt with the passed number
	 *	@param number
	 */
	public void setTmAdjCorrAmt(BigDecimal number)  throws CFException{
		work.setTmAdjCorrAmt(number);
   }

	/**
	 * 	Update TmAdjCorrAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTmAdjCorrAmt(char[] value)  throws CFException{
		work.setTmAdjCorrAmt(value);
	}   

	/**
	 *	Returns the value of tmAdjEntry
	 *	@return tmAdjEntry
	 */
   public char[] getTmAdjEntry() throws CFException  {              
   		return work.getTmAdjEntry();
   }

  
	/**
	*  set variable tmAdjEntry
	*  @param value
	**/
   public void setTmAdjEntry(char[] value) throws CFException {
      work.setTmAdjEntry(value);
   } 

	/**
	 *	Returns the value of waCdDd
	 *	@return waCdDd
	 */
   public char[] getWaCdDd() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdDd();
   }

  
	/**
	*  set variable waCdDd
	*  @param value
	**/
   public void setWaCdDd(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(value);
   } 

     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex);
   	
   }
   
   public void setWaCdDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdDd with another Field
	 *	@param value
	 */
   public void setWaCdDd(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source);
   }  
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjEnd
	 *	@return tmAdjEnd
	 */
   public char[] getTmAdjEnd() throws CFException  {              
   		return work.getTmAdjEnd();
   }

  
	/**
	*  set variable tmAdjEnd
	*  @param value
	**/
   public void setTmAdjEnd(char[] value) throws CFException {
      work.setTmAdjEnd(value);
   } 

	/**
	 *	Returns the value of ov4ParameterList
	 *	@return ov4ParameterList
	 */   
	 public Ov4ParameterList getOv4ParameterList() {
   	return ov4ParameterList;
   }


	/**
	 *	Returns the value of tmAdjDate
	 *	@return tmAdjDate
	 */   
	 public TmAdjDate getTmAdjDate() {
   	return tmAdjDate;
   }


	/**
	 *	Returns the value of tmAdjLookupText
	 *	@return tmAdjLookupText
	 */
   public char[] getTmAdjLookupText() throws CFException  {              
   		return work.getTmAdjLookupText();
   }

  
	/**
	*  set variable tmAdjLookupText
	*  @param value
	**/
   public void setTmAdjLookupText(char[] value) throws CFException {
      work.setTmAdjLookupText(value);
   } 

	/**
	 *	Returns the value of taAdjCode
	 *	@return taAdjCode
	 */
   public char[] getTaAdjCode(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaAdjCode();
   }

  
	/**
	*  set variable taAdjCode
	*  @param value
	**/
   public void setTaAdjCode(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(value);
   } 

     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAdjCode(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex);
   	
   }
   
   public void setTaAdjCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaAdjCode with another Field
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source);
   }  
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjDateMm
	 *	@return tmAdjDateMm
	 */
   public char[] getTmAdjDateMm() throws CFException  {              
   		return tmAdjDate.getTmAdjDateMm();
   }

  
	/**
	*  set variable tmAdjDateMm
	*  @param value
	**/
   public void setTmAdjDateMm(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateMm(value);
   } 

     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateMm with another Field
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source) {
      tmAdjDate.setTmAdjDateMm(source);
   }  
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjEntryKey
	 *	@return tmAdjEntryKey
	 */
   public char[] getTmAdjEntryKey() throws CFException  {              
   		return work.getTmAdjEntryKey();
   }

  
	/**
	*  set variable tmAdjEntryKey
	*  @param value
	**/
   public void setTmAdjEntryKey(char[] value) throws CFException {
      work.setTmAdjEntryKey(value);
   } 

	/**
	 *	Returns the value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public long getTmAdjNo() throws CFException {
   		return work.getTmAdjNo();
	}


	/**
	 *	Returns String value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public char[]  getTmAdjNoString() throws CFException {
	     return String.valueOf(work.getTmAdjNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjNoIsNumeric()  throws CFException{
	    return work.tmAdjNoIsNumeric();
	}

	/**
	 * 	Update TmAdjNo with the passed value
	 *	@param number
	 */
	public void setTmAdjNo(long number)  throws CFException{
		work.setTmAdjNo(number);
	}
	

	
	/**
	 * 	Update TmAdjNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjNo(char[] value)  throws CFException {
		work.setTmAdjNo(value);
	}
	
	/**
	 * 	Update TmAdjNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjNoString(char[] value)  throws CFException{
		work.setTmAdjNo(value);
	}	

	/**
	 *	Returns the value of tmAdjDepF5
	 *	@return tmAdjDepF5
	 */
   public char[] getTmAdjDepF5() throws CFException  {              
   		return work.getTmAdjDepF5();
   }

  
	/**
	*  set variable tmAdjDepF5
	*  @param value
	**/
   public void setTmAdjDepF5(char[] value) throws CFException {
      work.setTmAdjDepF5(value);
   } 

	/**
	 *	Returns the value of tmAdjState
	 *	@return tmAdjState
	 */
   public char[] getTmAdjState() throws CFException  {              
   		return work.getTmAdjState();
   }

  
	/**
	*  set variable tmAdjState
	*  @param value
	**/
   public void setTmAdjState(char[] value) throws CFException {
      work.setTmAdjState(value);
   } 


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }

        public CreateAeOutputRecordOutCtx getCreateAeOutputRecordOutCtx() {
            return new CreateAeOutputRecordOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableAreas.hashCode();
        str += tmAdjDate.hashCode();
        str += ov4ParameterList.hashCode();
        str += work.hashCode();
        str += waCurrentDateGroup.hashCode();
       return str.hashCode();
    }

    public CreateAeOutputRecordInCtx clone() {
        CreateAeOutputRecordInCtx cloneObj = new CreateAeOutputRecordInCtx();
        cloneObj.tableAreas = new TableAreas();
        cloneObj.tableAreas.set(tableAreas.getClonedField());
        cloneObj.tmAdjDate = new TmAdjDate();
        cloneObj.tmAdjDate.set(tmAdjDate.getClonedField());
        cloneObj.ov4ParameterList = new Ov4ParameterList();
        cloneObj.ov4ParameterList.set(ov4ParameterList.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.waCurrentDateGroup = new WaCurrentDateGroup();
        cloneObj.waCurrentDateGroup.set(waCurrentDateGroup.getClonedField());
        return cloneObj;
    }

    }

    public CreateAeOutputRecordInCtx getCreateAeOutputRecordInCtx() {
            return new CreateAeOutputRecordInCtx();
    }
     public class CreateAeOutputRecordOutCtx implements Cloneable {
     TableAreas tableAreas = UsbaeextCtx.this.getTableAreas();
     Ov4ParameterList ov4ParameterList = UsbaeextCtx.this.getOv4ParameterList();
     TmAdjDate tmAdjDate = UsbaeextCtx.this.getTmAdjDate();
     Work work = UsbaeextCtx.this.getWork();
     WaCurrentDateGroup waCurrentDateGroup = UsbaeextCtx.this.getWaCurrentDateGroup();

	/**
	 *	Returns the value of ov4Md2CrTc
	 *	@return ov4Md2CrTc
	 */
   public char[] getOv4Md2CrTc() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData2().getOv4Md2CrTc();
   }

  
	/**
	*  set variable ov4Md2CrTc
	*  @param value
	**/
   public void setOv4Md2CrTc(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(value);
   } 

     /**
	 * 	Update Ov4Md2CrTc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md2CrTc(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source, sourceIndex);
   	
   }
   
   public void setOv4Md2CrTc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md2CrTc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md2CrTc with another Field
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source) {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source);
   }  
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData2().setOv4Md2CrTc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4IclShouldBe
	 *	@return ov4IclShouldBe
	 */
	public BigDecimal getOv4IclShouldBe() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclShouldBe();
	}


	 /**
     *	Returns String value of ov4IclShouldBe
     *	@return ov4IclShouldBe
     */
    public char[]  getOv4IclShouldBeString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclShouldBeString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclShouldBeIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclShouldBeIsNumeric();
    }
	/**
	 * 	Update Ov4IclShouldBe with the passed number
	 *	@param number
	 */
	public void setOv4IclShouldBe(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclShouldBe(number);
   }

	/**
	 * 	Update Ov4IclShouldBe with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclShouldBe(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclShouldBe(value);
	}   

	/**
	 *	Returns the value of ov4IclListedAs
	 *	@return ov4IclListedAs
	 */
	public BigDecimal getOv4IclListedAs() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclListedAs();
	}


	 /**
     *	Returns String value of ov4IclListedAs
     *	@return ov4IclListedAs
     */
    public char[]  getOv4IclListedAsString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclListedAsString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclListedAsIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclListedAsIsNumeric();
    }
	/**
	 * 	Update Ov4IclListedAs with the passed number
	 *	@param number
	 */
	public void setOv4IclListedAs(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclListedAs(number);
   }

	/**
	 * 	Update Ov4IclListedAs with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclListedAs(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclListedAs(value);
	}   

	/**
	 *	Returns the value of ov4ClerkId
	 *	@return ov4ClerkId
	 */
   public char[] getOv4ClerkId() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4ClerkId();
   }

  
	/**
	*  set variable ov4ClerkId
	*  @param value
	**/
   public void setOv4ClerkId(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(value);
   } 

     /**
	 * 	Update Ov4ClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4ClerkId(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source, sourceIndex);
   	
   }
   
   public void setOv4ClerkId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4ClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4ClerkId with another Field
	 *	@param value
	 */
   public void setOv4ClerkId(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source);
   }  
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4ClerkId(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4ClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4ClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4CycleDateYy
	 *	@return ov4CycleDateYy
	 */
	public int getOv4CycleDateYy() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateYy();
	}


	/**
	 *	Returns String value of ov4CycleDateYy
	 *	@return ov4CycleDateYy
	 */
	public char[]  getOv4CycleDateYyString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateYyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateYyIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().ov4CycleDateYyIsNumeric();
	}

	/**
	 * 	Update Ov4CycleDateYy with the passed value
	 *	@param number
	 */
	public void setOv4CycleDateYy(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateYy(number);
	}
	

	public void setOv4CycleDateYy(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateYy(number);
	}
	
	
	/**
	 * 	Update Ov4CycleDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateYy(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateYy(value);
	}
	
	/**
	 * 	Update Ov4CycleDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateYyString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateYy(value);
	}	

	/**
	 *	Returns the value of ov4IclAmt
	 *	@return ov4IclAmt
	 */
	public BigDecimal getOv4IclAmt() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclAmt();
	}


	 /**
     *	Returns String value of ov4IclAmt
     *	@return ov4IclAmt
     */
    public char[]  getOv4IclAmtString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclAmtIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclAmtIsNumeric();
    }
	/**
	 * 	Update Ov4IclAmt with the passed number
	 *	@param number
	 */
	public void setOv4IclAmt(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclAmt(number);
   }

	/**
	 * 	Update Ov4IclAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclAmt(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclAmt(value);
	}   

	/**
	 *	Returns the value of ov4CycleDate
	 *	@return ov4CycleDate
	 */
	public long getOv4CycleDate() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDate();
	}


	/**
	 *	Returns String value of ov4CycleDate
	 *	@return ov4CycleDate
	 */
	public char[]  getOv4CycleDateString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().ov4CycleDateIsNumeric();
	}

	/**
	 * 	Update Ov4CycleDate with the passed value
	 *	@param number
	 */
	public void setOv4CycleDate(long number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4CycleDate(number);
	}
	

	
	/**
	 * 	Update Ov4CycleDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDate(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().setOv4CycleDate(value);
	}
	
	/**
	 * 	Update Ov4CycleDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4CycleDate(value);
	}	

	/**
	 *	Returns the value of taClerkId
	 *	@return taClerkId
	 */
   public char[] getTaClerkId(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaClerkId();
   }

  
	/**
	*  set variable taClerkId
	*  @param value
	**/
   public void setTaClerkId(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(value);
   } 

     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex);
   	
   }
   
   public void setTaClerkId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaClerkId with another Field
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source);
   }  
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4AcctCd
	 *	@return ov4AcctCd
	 */
   public char[] getOv4AcctCd() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4AcctCd();
   }

  
	/**
	*  set variable ov4AcctCd
	*  @param value
	**/
   public void setOv4AcctCd(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(value);
   } 

     /**
	 * 	Update Ov4AcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AcctCd(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source, sourceIndex);
   	
   }
   
   public void setOv4AcctCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4AcctCd with another Field
	 *	@param value
	 */
   public void setOv4AcctCd(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source);
   }  
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AcctCd(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4AcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4AmntSign
	 *	@return ov4AmntSign
	 */
   public char[] getOv4AmntSign() throws CFException  {              
   		return ov4ParameterList.getOv4MicrLineInfo().getOv4AmntSign();
   }

  
	/**
	*  set variable ov4AmntSign
	*  @param value
	**/
   public void setOv4AmntSign(char[] value) throws CFException {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(value);
   } 

     /**
	 * 	Update Ov4AmntSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AmntSign(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source, sourceIndex);
   	
   }
   
   public void setOv4AmntSign(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AmntSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4AmntSign with another Field
	 *	@param value
	 */
   public void setOv4AmntSign(Field source) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source);
   }  
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AmntSign(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AmntSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AmntSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4CurrentDate
	 *	@return ov4CurrentDate
	 */
   public char[] getOv4CurrentDate() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4CurrentDate();
   }

  
	/**
	*  set variable ov4CurrentDate
	*  @param value
	**/
   public void setOv4CurrentDate(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(value);
   } 

     /**
	 * 	Update Ov4CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4CurrentDate(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source, sourceIndex);
   	
   }
   
   public void setOv4CurrentDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4CurrentDate with another Field
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source);
   }  
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4CurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4IclSerialNo
	 *	@return ov4IclSerialNo
	 */
	public long getOv4IclSerialNo() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclSerialNo();
	}


	/**
	 *	Returns String value of ov4IclSerialNo
	 *	@return ov4IclSerialNo
	 */
	public char[]  getOv4IclSerialNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclSerialNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclSerialNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclSerialNoIsNumeric();
	}

	/**
	 * 	Update Ov4IclSerialNo with the passed value
	 *	@param number
	 */
	public void setOv4IclSerialNo(long number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclSerialNo(number);
	}
	

	
	/**
	 * 	Update Ov4IclSerialNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclSerialNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclSerialNo(value);
	}
	
	/**
	 * 	Update Ov4IclSerialNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclSerialNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclSerialNo(value);
	}	

	/**
	 *	Returns the value of tmAdjDateYyyy
	 *	@return tmAdjDateYyyy
	 */
   public char[] getTmAdjDateYyyy() throws CFException  {              
   		return tmAdjDate.getTmAdjDateYyyy();
   }

  
	/**
	*  set variable tmAdjDateYyyy
	*  @param value
	**/
   public void setTmAdjDateYyyy(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateYyyy(value);
   } 

     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateYyyy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateYyyy with another Field
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source) {
      tmAdjDate.setTmAdjDateYyyy(source);
   }  
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4IclPrevious
	 *	@return ov4IclPrevious
	 */
	public BigDecimal getOv4IclPrevious() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclPrevious();
	}


	 /**
     *	Returns String value of ov4IclPrevious
     *	@return ov4IclPrevious
     */
    public char[]  getOv4IclPreviousString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclPreviousString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclPreviousIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclPreviousIsNumeric();
    }
	/**
	 * 	Update Ov4IclPrevious with the passed number
	 *	@param number
	 */
	public void setOv4IclPrevious(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclPrevious(number);
   }

	/**
	 * 	Update Ov4IclPrevious with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclPrevious(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclPrevious(value);
	}   

	/**
	 *	Returns the value of tmAdjAcct
	 *	@return tmAdjAcct
	 */
   public char[] getTmAdjAcct() throws CFException  {              
   		return work.getTmAdjAcct();
   }

  
	/**
	*  set variable tmAdjAcct
	*  @param value
	**/
   public void setTmAdjAcct(char[] value) throws CFException {
      work.setTmAdjAcct(value);
   } 

	/**
	 *	Returns the value of tmAdjDrn
	 *	@return tmAdjDrn
	 */
   public char[] getTmAdjDrn() throws CFException  {              
   		return work.getTmAdjDrn();
   }

  
	/**
	*  set variable tmAdjDrn
	*  @param value
	**/
   public void setTmAdjDrn(char[] value) throws CFException {
      work.setTmAdjDrn(value);
   } 

	/**
	 *	Returns the value of taSrcErrorCd
	 *	@return taSrcErrorCd
	 */
   public char[] getTaSrcErrorCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcErrorCd();
   }

  
	/**
	*  set variable taSrcErrorCd
	*  @param value
	**/
   public void setTaSrcErrorCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(value);
   } 

     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcErrorCd with another Field
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source);
   }  
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taAcctCd
	 *	@return taAcctCd
	 */
   public char[] getTaAcctCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaAcctCd();
   }

  
	/**
	*  set variable taAcctCd
	*  @param value
	**/
   public void setTaAcctCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(value);
   } 

     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex);
   	
   }
   
   public void setTaAcctCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaAcctCd with another Field
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source);
   }  
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4AcctAppl
	 *	@return ov4AcctAppl
	 */
   public char[] getOv4AcctAppl() throws CFException  {              
   		return ov4ParameterList.getOv4MicrLineInfo().getOv4AcctAppl();
   }

  
	/**
	*  set variable ov4AcctAppl
	*  @param value
	**/
   public void setOv4AcctAppl(char[] value) throws CFException {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(value);
   } 

     /**
	 * 	Update Ov4AcctAppl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AcctAppl(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source, sourceIndex);
   	
   }
   
   public void setOv4AcctAppl(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctAppl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4AcctAppl with another Field
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source);
   }  
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MicrLineInfo().setOv4AcctAppl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSrcReceiptCd
	 *	@return taSrcReceiptCd
	 */
   public char[] getTaSrcReceiptCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcReceiptCd();
   }

  
	/**
	*  set variable taSrcReceiptCd
	*  @param value
	**/
   public void setTaSrcReceiptCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(value);
   } 

     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source);
   }  
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4SrcErrorCd
	 *	@return ov4SrcErrorCd
	 */
   public char[] getOv4SrcErrorCd() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4SrcErrorCd();
   }

  
	/**
	*  set variable ov4SrcErrorCd
	*  @param value
	**/
   public void setOv4SrcErrorCd(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(value);
   } 

     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4SrcErrorCd(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setOv4SrcErrorCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4SrcErrorCd with another Field
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source);
   }  
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4IclTapeTotal
	 *	@return ov4IclTapeTotal
	 */
	public BigDecimal getOv4IclTapeTotal() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclTapeTotal();
	}


	 /**
     *	Returns String value of ov4IclTapeTotal
     *	@return ov4IclTapeTotal
     */
    public char[]  getOv4IclTapeTotalString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclTapeTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclTapeTotalIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclTapeTotalIsNumeric();
    }
	/**
	 * 	Update Ov4IclTapeTotal with the passed number
	 *	@param number
	 */
	public void setOv4IclTapeTotal(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclTapeTotal(number);
   }

	/**
	 * 	Update Ov4IclTapeTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclTapeTotal(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclTapeTotal(value);
	}   

	/**
	 *	Returns the value of ov4AbaNo
	 *	@return ov4AbaNo
	 */
	public long getOv4AbaNo() throws CFException {
   		return ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().getOv4AbaNo();
	}


	/**
	 *	Returns String value of ov4AbaNo
	 *	@return ov4AbaNo
	 */
	public char[]  getOv4AbaNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().getOv4AbaNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AbaNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().ov4AbaNoIsNumeric();
	}

	/**
	 * 	Update Ov4AbaNo with the passed value
	 *	@param number
	 */
	public void setOv4AbaNo(long number)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().setOv4AbaNo(number);
	}
	

	
	/**
	 * 	Update Ov4AbaNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4AbaNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().setOv4AbaNo(value);
	}
	
	/**
	 * 	Update Ov4AbaNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4AbaNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().getOv4Aba().setOv4AbaNo(value);
	}	

	/**
	 *	Returns the value of ov4InSeqInBat
	 *	@return ov4InSeqInBat
	 */
	public int getOv4InSeqInBat() throws CFException {
   		return ov4ParameterList.getOv4ItemNo().getOv4InSeqInBat();
	}


	/**
	 *	Returns String value of ov4InSeqInBat
	 *	@return ov4InSeqInBat
	 */
	public char[]  getOv4InSeqInBatString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4ItemNo().getOv4InSeqInBatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InSeqInBatIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4ItemNo().ov4InSeqInBatIsNumeric();
	}

	/**
	 * 	Update Ov4InSeqInBat with the passed value
	 *	@param number
	 */
	public void setOv4InSeqInBat(int number)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InSeqInBat(number);
	}
	

	public void setOv4InSeqInBat(long number)  throws CFException{
	    ov4ParameterList.getOv4ItemNo().setOv4InSeqInBat(number);
	}
	
	
	/**
	 * 	Update Ov4InSeqInBat with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InSeqInBat(char[] value)  throws CFException {
		ov4ParameterList.getOv4ItemNo().setOv4InSeqInBat(value);
	}
	
	/**
	 * 	Update Ov4InSeqInBat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InSeqInBatString(char[] value)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InSeqInBat(value);
	}	

	/**
	 *	Returns the value of ov4BlkNo
	 *	@return ov4BlkNo
	 */
	public int getOv4BlkNo() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4BlkNo();
	}


	/**
	 *	Returns String value of ov4BlkNo
	 *	@return ov4BlkNo
	 */
	public char[]  getOv4BlkNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4BlkNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4BlkNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().ov4BlkNoIsNumeric();
	}

	/**
	 * 	Update Ov4BlkNo with the passed value
	 *	@param number
	 */
	public void setOv4BlkNo(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4BlkNo(number);
	}
	

	public void setOv4BlkNo(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().setOv4BlkNo(number);
	}
	
	
	/**
	 * 	Update Ov4BlkNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4BlkNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().setOv4BlkNo(value);
	}
	
	/**
	 * 	Update Ov4BlkNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4BlkNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4BlkNo(value);
	}	

	/**
	 *	Returns the value of ov4Md1RrKblk
	 *	@return ov4Md1RrKblk
	 */
   public char[] getOv4Md1RrKblk() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData1().getOv4Md1RrKblk();
   }

  
	/**
	*  set variable ov4Md1RrKblk
	*  @param value
	**/
   public void setOv4Md1RrKblk(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(value);
   } 

     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1RrKblk(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source, sourceIndex);
   	
   }
   
   public void setOv4Md1RrKblk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1RrKblk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md1RrKblk with another Field
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source);
   }  
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1RrKblk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4CycleDateDd
	 *	@return ov4CycleDateDd
	 */
	public int getOv4CycleDateDd() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateDd();
	}


	/**
	 *	Returns String value of ov4CycleDateDd
	 *	@return ov4CycleDateDd
	 */
	public char[]  getOv4CycleDateDdString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateDdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateDdIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().ov4CycleDateDdIsNumeric();
	}

	/**
	 * 	Update Ov4CycleDateDd with the passed value
	 *	@param number
	 */
	public void setOv4CycleDateDd(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateDd(number);
	}
	

	public void setOv4CycleDateDd(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateDd(number);
	}
	
	
	/**
	 * 	Update Ov4CycleDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateDd(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateDd(value);
	}
	
	/**
	 * 	Update Ov4CycleDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateDdString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateDd(value);
	}	

	/**
	 *	Returns the value of ov4AdjAmnt
	 *	@return ov4AdjAmnt
	 */
	public BigDecimal getOv4AdjAmnt() throws CFException {
   		return ov4ParameterList.getOv4AdjustmentAmount().getOv4AdjAmnt();
	}


	 /**
     *	Returns String value of ov4AdjAmnt
     *	@return ov4AdjAmnt
     */
    public char[]  getOv4AdjAmntString() throws CFException {
         return ov4ParameterList.getOv4AdjustmentAmount().getOv4AdjAmntString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4AdjAmntIsNumeric() {
        return ov4ParameterList.getOv4AdjustmentAmount().ov4AdjAmntIsNumeric();
    }
	/**
	 * 	Update Ov4AdjAmnt with the passed number
	 *	@param number
	 */
	public void setOv4AdjAmnt(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjAmnt(number);
   }

	/**
	 * 	Update Ov4AdjAmnt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4AdjAmnt(char[] value)  throws CFException{
		ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjAmnt(value);
	}   

	/**
	 *	Returns the value of ov4DeptNo
	 *	@return ov4DeptNo
	 */
	public int getOv4DeptNo() throws CFException {
   		return ov4ParameterList.getOv4DeptNo();
	}


	/**
	 *	Returns String value of ov4DeptNo
	 *	@return ov4DeptNo
	 */
	public char[]  getOv4DeptNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4DeptNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4DeptNoIsNumeric()  throws CFException{
	    return ov4ParameterList.ov4DeptNoIsNumeric();
	}

	/**
	 * 	Update Ov4DeptNo with the passed value
	 *	@param number
	 */
	public void setOv4DeptNo(int number)  throws CFException{
		ov4ParameterList.setOv4DeptNo(number);
	}
	

	public void setOv4DeptNo(long number)  throws CFException{
	    ov4ParameterList.setOv4DeptNo(number);
	}
	
	
	/**
	 * 	Update Ov4DeptNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4DeptNo(char[] value)  throws CFException {
		ov4ParameterList.setOv4DeptNo(value);
	}
	
	/**
	 * 	Update Ov4DeptNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4DeptNoString(char[] value)  throws CFException{
		ov4ParameterList.setOv4DeptNo(value);
	}	

	/**
	 *	Returns the value of ov4Aba
	 *	@return ov4Aba
	 */   
	 public Ov4Aba getOv4Aba() {
   	return ov4ParameterList.getOv4MicrLineInfo().getOv4Aba();
   }

   /**
	* 	Update Ov4Aba with the passed value
	*	@param value
	*/
   public void setOv4Aba(char[] value) throws CFException {
      ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(value);
   }   

     /**
	 * 	Update Ov4Aba 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4Aba(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Aba 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Aba(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Aba with another Field
	 *	@param value
	 */
   public void setOv4Aba(Field source) {
   	ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(source);
   }  
   
     /**
	 * 	Update Ov4Aba 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4Aba(Field source, int sourceIndex,int sourceLen) {
   	ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Aba 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Aba(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ov4ParameterList.getOv4MicrLineInfo().setOv4Aba(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4TypeCd
	 *	@return ov4TypeCd
	 */
   public char[] getOv4TypeCd() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4TypeCd();
   }

  
	/**
	*  set variable ov4TypeCd
	*  @param value
	**/
   public void setOv4TypeCd(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(value);
   } 

     /**
	 * 	Update Ov4TypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4TypeCd(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source, sourceIndex);
   	
   }
   
   public void setOv4TypeCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4TypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4TypeCd with another Field
	 *	@param value
	 */
   public void setOv4TypeCd(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source);
   }  
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4TypeCd(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4TypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4TypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4Md2CrAcct
	 *	@return ov4Md2CrAcct
	 */
	public long getOv4Md2CrAcct() throws CFException {
   		return ov4ParameterList.getOv4MiscData2().getOv4Md2CrAcct();
	}


	/**
	 *	Returns String value of ov4Md2CrAcct
	 *	@return ov4Md2CrAcct
	 */
	public char[]  getOv4Md2CrAcctString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4MiscData2().getOv4Md2CrAcctString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4Md2CrAcctIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4MiscData2().ov4Md2CrAcctIsNumeric();
	}

	/**
	 * 	Update Ov4Md2CrAcct with the passed value
	 *	@param number
	 */
	public void setOv4Md2CrAcct(long number)  throws CFException{
		ov4ParameterList.getOv4MiscData2().setOv4Md2CrAcct(number);
	}
	

	
	/**
	 * 	Update Ov4Md2CrAcct with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4Md2CrAcct(char[] value)  throws CFException {
		ov4ParameterList.getOv4MiscData2().setOv4Md2CrAcct(value);
	}
	
	/**
	 * 	Update Ov4Md2CrAcct with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4Md2CrAcctString(char[] value)  throws CFException{
		ov4ParameterList.getOv4MiscData2().setOv4Md2CrAcct(value);
	}	

	/**
	 *	Returns the value of tmAdjRt
	 *	@return tmAdjRt
	 */
   public char[] getTmAdjRt() throws CFException  {              
   		return work.getTmAdjRt();
   }

  
	/**
	*  set variable tmAdjRt
	*  @param value
	**/
   public void setTmAdjRt(char[] value) throws CFException {
      work.setTmAdjRt(value);
   } 

	/**
	 *	Returns the value of ov4Md2CrAmt
	 *	@return ov4Md2CrAmt
	 */
	public BigDecimal getOv4Md2CrAmt() throws CFException {
   		return ov4ParameterList.getOv4MiscData2().getOv4Md2CrAmt();
	}


	 /**
     *	Returns String value of ov4Md2CrAmt
     *	@return ov4Md2CrAmt
     */
    public char[]  getOv4Md2CrAmtString() throws CFException {
         return ov4ParameterList.getOv4MiscData2().getOv4Md2CrAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4Md2CrAmtIsNumeric() {
        return ov4ParameterList.getOv4MiscData2().ov4Md2CrAmtIsNumeric();
    }
	/**
	 * 	Update Ov4Md2CrAmt with the passed number
	 *	@param number
	 */
	public void setOv4Md2CrAmt(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4MiscData2().setOv4Md2CrAmt(number);
   }

	/**
	 * 	Update Ov4Md2CrAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4Md2CrAmt(char[] value)  throws CFException{
		ov4ParameterList.getOv4MiscData2().setOv4Md2CrAmt(value);
	}   

	/**
	 *	Returns the value of ov4CycleNo
	 *	@return ov4CycleNo
	 */
   public char[] getOv4CycleNo() throws CFException  {              
   		return ov4ParameterList.getOv4CpcsInfo().getOv4CycleNo();
   }

  
	/**
	*  set variable ov4CycleNo
	*  @param value
	**/
   public void setOv4CycleNo(char[] value) throws CFException {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(value);
   } 

     /**
	 * 	Update Ov4CycleNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4CycleNo(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source, sourceIndex);
   	
   }
   
   public void setOv4CycleNo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4CycleNo with another Field
	 *	@param value
	 */
   public void setOv4CycleNo(Field source) {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source);
   }  
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4CycleNo(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4CpcsInfo().setOv4CycleNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4Amnt
	 *	@return ov4Amnt
	 */
	public BigDecimal getOv4Amnt() throws CFException {
   		return ov4ParameterList.getOv4MicrLineInfo().getOv4Amnt();
	}


	 /**
     *	Returns String value of ov4Amnt
     *	@return ov4Amnt
     */
    public char[]  getOv4AmntString() throws CFException {
         return ov4ParameterList.getOv4MicrLineInfo().getOv4AmntString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4AmntIsNumeric() {
        return ov4ParameterList.getOv4MicrLineInfo().ov4AmntIsNumeric();
    }
	/**
	 * 	Update Ov4Amnt with the passed number
	 *	@param number
	 */
	public void setOv4Amnt(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().setOv4Amnt(number);
   }

	/**
	 * 	Update Ov4Amnt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4Amnt(char[] value)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().setOv4Amnt(value);
	}   

	/**
	 *	Returns the value of ov4IclNext
	 *	@return ov4IclNext
	 */
	public BigDecimal getOv4IclNext() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclNext();
	}


	 /**
     *	Returns String value of ov4IclNext
     *	@return ov4IclNext
     */
    public char[]  getOv4IclNextString() throws CFException {
         return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclNextString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ov4IclNextIsNumeric() {
        return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclNextIsNumeric();
    }
	/**
	 * 	Update Ov4IclNext with the passed number
	 *	@param number
	 */
	public void setOv4IclNext(BigDecimal number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclNext(number);
   }

	/**
	 * 	Update Ov4IclNext with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOv4IclNext(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclNext(value);
	}   

	/**
	 *	Returns the value of ov4IclFromAba
	 *	@return ov4IclFromAba
	 */
	public long getOv4IclFromAba() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclFromAba();
	}


	/**
	 *	Returns String value of ov4IclFromAba
	 *	@return ov4IclFromAba
	 */
	public char[]  getOv4IclFromAbaString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclFromAbaString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclFromAbaIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclFromAbaIsNumeric();
	}

	/**
	 * 	Update Ov4IclFromAba with the passed value
	 *	@param number
	 */
	public void setOv4IclFromAba(long number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclFromAba(number);
	}
	

	
	/**
	 * 	Update Ov4IclFromAba with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclFromAba(char[] value)  throws CFException {
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclFromAba(value);
	}
	
	/**
	 * 	Update Ov4IclFromAba with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclFromAbaString(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclFromAba(value);
	}	

	/**
	 *	Returns the value of ov4Md1Oper
	 *	@return ov4Md1Oper
	 */
   public char[] getOv4Md1Oper() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData1().getOv4Md1Oper();
   }

  
	/**
	*  set variable ov4Md1Oper
	*  @param value
	**/
   public void setOv4Md1Oper(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(value);
   } 

     /**
	 * 	Update Ov4Md1Oper 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Oper(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source, sourceIndex);
   	
   }
   
   public void setOv4Md1Oper(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Oper(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md1Oper with another Field
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source);
   }  
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Oper(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4EntryNumber
	 *	@return ov4EntryNumber
	 */
	public int getOv4EntryNumber() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4EntryNumber();
	}


	/**
	 *	Returns String value of ov4EntryNumber
	 *	@return ov4EntryNumber
	 */
	public char[]  getOv4EntryNumberString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4EntryNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4EntryNumberIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().ov4EntryNumberIsNumeric();
	}

	/**
	 * 	Update Ov4EntryNumber with the passed value
	 *	@param number
	 */
	public void setOv4EntryNumber(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4EntryNumber(number);
	}
	

	public void setOv4EntryNumber(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().setOv4EntryNumber(number);
	}
	
	
	/**
	 * 	Update Ov4EntryNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4EntryNumber(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().setOv4EntryNumber(value);
	}
	
	/**
	 * 	Update Ov4EntryNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4EntryNumberString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4EntryNumber(value);
	}	

	/**
	 *	Returns the value of ov4SrcReceiptCd
	 *	@return ov4SrcReceiptCd
	 */
   public char[] getOv4SrcReceiptCd() throws CFException  {              
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4SrcReceiptCd();
   }

  
	/**
	*  set variable ov4SrcReceiptCd
	*  @param value
	**/
   public void setOv4SrcReceiptCd(char[] value) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(value);
   } 

     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4SrcReceiptCd with another Field
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source);
   }  
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4V4BaseInfo().setOv4SrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4GlAccountNumber
	 *	@return ov4GlAccountNumber
	 */
	public long getOv4GlAccountNumber() throws CFException {
   		return ov4ParameterList.getOv4V4BaseInfo().getOv4GlAccountNumber();
	}


	/**
	 *	Returns String value of ov4GlAccountNumber
	 *	@return ov4GlAccountNumber
	 */
	public char[]  getOv4GlAccountNumberString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4V4BaseInfo().getOv4GlAccountNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4GlAccountNumberIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4V4BaseInfo().ov4GlAccountNumberIsNumeric();
	}

	/**
	 * 	Update Ov4GlAccountNumber with the passed value
	 *	@param number
	 */
	public void setOv4GlAccountNumber(long number)  throws CFException{
		ov4ParameterList.getOv4V4BaseInfo().setOv4GlAccountNumber(number);
	}
	

	
	/**
	 * 	Update Ov4GlAccountNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4GlAccountNumber(char[] value)  throws CFException {
		ov4ParameterList.getOv4V4BaseInfo().setOv4GlAccountNumber(value);
	}
	
	/**
	 * 	Update Ov4GlAccountNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4GlAccountNumberString(char[] value)  throws CFException{
		ov4ParameterList.getOv4V4BaseInfo().setOv4GlAccountNumber(value);
	}	

	/**
	 *	Returns the value of waCdYyyy
	 *	@return waCdYyyy
	 */
   public char[] getWaCdYyyy() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdYyyy();
   }

  
	/**
	*  set variable waCdYyyy
	*  @param value
	**/
   public void setWaCdYyyy(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(value);
   } 

     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex);
   	
   }
   
   public void setWaCdYyyy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdYyyy with another Field
	 *	@param value
	 */
   public void setWaCdYyyy(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source);
   }  
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4Md1Block
	 *	@return ov4Md1Block
	 */
   public char[] getOv4Md1Block() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData1().getOv4Md1Block();
   }

  
	/**
	*  set variable ov4Md1Block
	*  @param value
	**/
   public void setOv4Md1Block(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(value);
   } 

     /**
	 * 	Update Ov4Md1Block 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Block(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source, sourceIndex);
   	
   }
   
   public void setOv4Md1Block(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Block(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md1Block with another Field
	 *	@param value
	 */
   public void setOv4Md1Block(Field source) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source);
   }  
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Block(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Block(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Block(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4Md1SortType
	 *	@return ov4Md1SortType
	 */
   public char[] getOv4Md1SortType() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData1().getOv4Md1SortType();
   }

  
	/**
	*  set variable ov4Md1SortType
	*  @param value
	**/
   public void setOv4Md1SortType(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(value);
   } 

     /**
	 * 	Update Ov4Md1SortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1SortType(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source, sourceIndex);
   	
   }
   
   public void setOv4Md1SortType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1SortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md1SortType with another Field
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source);
   }  
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1SortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tmAdjDateDd
	 *	@return tmAdjDateDd
	 */
   public char[] getTmAdjDateDd() throws CFException  {              
   		return tmAdjDate.getTmAdjDateDd();
   }

  
	/**
	*  set variable tmAdjDateDd
	*  @param value
	**/
   public void setTmAdjDateDd(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateDd(value);
   } 

     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateDd with another Field
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source) {
      tmAdjDate.setTmAdjDateDd(source);
   }  
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4IclToAba
	 *	@return ov4IclToAba
	 */
	public long getOv4IclToAba() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclToAba();
	}


	/**
	 *	Returns String value of ov4IclToAba
	 *	@return ov4IclToAba
	 */
	public char[]  getOv4IclToAbaString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclToAbaString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclToAbaIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclToAbaIsNumeric();
	}

	/**
	 * 	Update Ov4IclToAba with the passed value
	 *	@param number
	 */
	public void setOv4IclToAba(long number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclToAba(number);
	}
	

	
	/**
	 * 	Update Ov4IclToAba with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclToAba(char[] value)  throws CFException {
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclToAba(value);
	}
	
	/**
	 * 	Update Ov4IclToAba with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclToAbaString(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclToAba(value);
	}	

	/**
	 *	Returns the value of waCdMm
	 *	@return waCdMm
	 */
   public char[] getWaCdMm() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdMm();
   }

  
	/**
	*  set variable waCdMm
	*  @param value
	**/
   public void setWaCdMm(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(value);
   } 

     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex);
   	
   }
   
   public void setWaCdMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdMm with another Field
	 *	@param value
	 */
   public void setWaCdMm(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source);
   }  
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setTaAdjIndex(int taAdjIndex) { 
    UsbaeextCtx.this.taAdjIndex = taAdjIndex;
}

public int getTaAdjIndex() { 
    return UsbaeextCtx.this.taAdjIndex;
}
	/**
	 *	Returns the value of ov4IclDate
	 *	@return ov4IclDate
	 */
	public long getOv4IclDate() throws CFException {
   		return ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclDate();
	}


	/**
	 *	Returns String value of ov4IclDate
	 *	@return ov4IclDate
	 */
	public char[]  getOv4IclDateString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4IncomingCashLetterInfo().getOv4IclDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclDateIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4IncomingCashLetterInfo().ov4IclDateIsNumeric();
	}

	/**
	 * 	Update Ov4IclDate with the passed value
	 *	@param number
	 */
	public void setOv4IclDate(long number)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclDate(number);
	}
	

	
	/**
	 * 	Update Ov4IclDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclDate(char[] value)  throws CFException {
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclDate(value);
	}
	
	/**
	 * 	Update Ov4IclDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclDateString(char[] value)  throws CFException{
		ov4ParameterList.getOv4IncomingCashLetterInfo().setOv4IclDate(value);
	}	

	/**
	 *	Returns the value of taDeptNo
	 *	@return taDeptNo
	 */
   public char[] getTaDeptNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaDeptNo();
   }

  
	/**
	*  set variable taDeptNo
	*  @param value
	**/
   public void setTaDeptNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(value);
   } 

     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex);
   	
   }
   
   public void setTaDeptNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaDeptNo with another Field
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source);
   }  
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4InJulYear
	 *	@return ov4InJulYear
	 */
	public int getOv4InJulYear() throws CFException {
   		return ov4ParameterList.getOv4ItemNo().getOv4InJulYear();
	}


	/**
	 *	Returns String value of ov4InJulYear
	 *	@return ov4InJulYear
	 */
	public char[]  getOv4InJulYearString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4ItemNo().getOv4InJulYearString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InJulYearIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4ItemNo().ov4InJulYearIsNumeric();
	}

	/**
	 * 	Update Ov4InJulYear with the passed value
	 *	@param number
	 */
	public void setOv4InJulYear(int number)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InJulYear(number);
	}
	

	public void setOv4InJulYear(long number)  throws CFException{
	    ov4ParameterList.getOv4ItemNo().setOv4InJulYear(number);
	}
	
	
	/**
	 * 	Update Ov4InJulYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InJulYear(char[] value)  throws CFException {
		ov4ParameterList.getOv4ItemNo().setOv4InJulYear(value);
	}
	
	/**
	 * 	Update Ov4InJulYear with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InJulYearString(char[] value)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InJulYear(value);
	}	

	/**
	 *	Returns the value of tmAdjCycle
	 *	@return tmAdjCycle
	 */
   public char[] getTmAdjCycle() throws CFException  {              
   		return work.getTmAdjCycle();
   }

  
	/**
	*  set variable tmAdjCycle
	*  @param value
	**/
   public void setTmAdjCycle(char[] value) throws CFException {
      work.setTmAdjCycle(value);
   } 

	/**
	 *	Returns the value of taBankNo
	 *	@return taBankNo
	 */
   public char[] getTaBankNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaBankNo();
   }

  
	/**
	*  set variable taBankNo
	*  @param value
	**/
   public void setTaBankNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(value);
   } 

     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex);
   	
   }
   
   public void setTaBankNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaBankNo with another Field
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source);
   }  
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4BankNo
	 *	@return ov4BankNo
	 */
	public int getOv4BankNo() throws CFException {
   		return ov4ParameterList.getOv4BankNo();
	}


	/**
	 *	Returns String value of ov4BankNo
	 *	@return ov4BankNo
	 */
	public char[]  getOv4BankNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4BankNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4BankNoIsNumeric()  throws CFException{
	    return ov4ParameterList.ov4BankNoIsNumeric();
	}

	/**
	 * 	Update Ov4BankNo with the passed value
	 *	@param number
	 */
	public void setOv4BankNo(int number)  throws CFException{
		ov4ParameterList.setOv4BankNo(number);
	}
	

	public void setOv4BankNo(long number)  throws CFException{
	    ov4ParameterList.setOv4BankNo(number);
	}
	
	
	/**
	 * 	Update Ov4BankNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4BankNo(char[] value)  throws CFException {
		ov4ParameterList.setOv4BankNo(value);
	}
	
	/**
	 * 	Update Ov4BankNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4BankNoString(char[] value)  throws CFException{
		ov4ParameterList.setOv4BankNo(value);
	}	

	/**
	 *	Returns the value of taTypeCd
	 *	@return taTypeCd
	 */
   public char[] getTaTypeCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaTypeCd();
   }

  
	/**
	*  set variable taTypeCd
	*  @param value
	**/
   public void setTaTypeCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(value);
   } 

     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex);
   	
   }
   
   public void setTaTypeCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaTypeCd with another Field
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source);
   }  
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4InBatch
	 *	@return ov4InBatch
	 */
	public int getOv4InBatch() throws CFException {
   		return ov4ParameterList.getOv4ItemNo().getOv4InBatch();
	}


	/**
	 *	Returns String value of ov4InBatch
	 *	@return ov4InBatch
	 */
	public char[]  getOv4InBatchString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4ItemNo().getOv4InBatchString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InBatchIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4ItemNo().ov4InBatchIsNumeric();
	}

	/**
	 * 	Update Ov4InBatch with the passed value
	 *	@param number
	 */
	public void setOv4InBatch(int number)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InBatch(number);
	}
	

	public void setOv4InBatch(long number)  throws CFException{
	    ov4ParameterList.getOv4ItemNo().setOv4InBatch(number);
	}
	
	
	/**
	 * 	Update Ov4InBatch with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InBatch(char[] value)  throws CFException {
		ov4ParameterList.getOv4ItemNo().setOv4InBatch(value);
	}
	
	/**
	 * 	Update Ov4InBatch with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InBatchString(char[] value)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InBatch(value);
	}	

	/**
	 *	Returns the value of ov4AcctNo
	 *	@return ov4AcctNo
	 */
	public long getOv4AcctNo() throws CFException {
   		return ov4ParameterList.getOv4MicrLineInfo().getOv4AcctNo();
	}


	/**
	 *	Returns String value of ov4AcctNo
	 *	@return ov4AcctNo
	 */
	public char[]  getOv4AcctNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4MicrLineInfo().getOv4AcctNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AcctNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4MicrLineInfo().ov4AcctNoIsNumeric();
	}

	/**
	 * 	Update Ov4AcctNo with the passed value
	 *	@param number
	 */
	public void setOv4AcctNo(long number)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().setOv4AcctNo(number);
	}
	

	
	/**
	 * 	Update Ov4AcctNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4AcctNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4MicrLineInfo().setOv4AcctNo(value);
	}
	
	/**
	 * 	Update Ov4AcctNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4AcctNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4MicrLineInfo().setOv4AcctNo(value);
	}	

	/**
	 *	Returns the value of tmAdjEntry
	 *	@return tmAdjEntry
	 */
   public char[] getTmAdjEntry() throws CFException  {              
   		return work.getTmAdjEntry();
   }

  
	/**
	*  set variable tmAdjEntry
	*  @param value
	**/
   public void setTmAdjEntry(char[] value) throws CFException {
      work.setTmAdjEntry(value);
   } 

	/**
	 *	Returns the value of waCdDd
	 *	@return waCdDd
	 */
   public char[] getWaCdDd() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDateRedefined().getWaCdDd();
   }

  
	/**
	*  set variable waCdDd
	*  @param value
	**/
   public void setWaCdDd(char[] value) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(value);
   } 

     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex);
   	
   }
   
   public void setWaCdDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCdDd with another Field
	 *	@param value
	 */
   public void setWaCdDd(Field source) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source);
   }  
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.getWaCurrentDateRedefined().setWaCdDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4ParameterList
	 *	@return ov4ParameterList
	 */   
	 public Ov4ParameterList getOv4ParameterList() {
   	return ov4ParameterList;
   }


	/**
	 *	Returns the value of ov4AdjSign
	 *	@return ov4AdjSign
	 */
   public char[] getOv4AdjSign() throws CFException  {              
   		return ov4ParameterList.getOv4AdjustmentAmount().getOv4AdjSign();
   }

  
	/**
	*  set variable ov4AdjSign
	*  @param value
	**/
   public void setOv4AdjSign(char[] value) throws CFException {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(value);
   } 

     /**
	 * 	Update Ov4AdjSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AdjSign(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source, sourceIndex);
   	
   }
   
   public void setOv4AdjSign(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4AdjSign with another Field
	 *	@param value
	 */
   public void setOv4AdjSign(Field source) {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source);
   }  
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AdjSign(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4AdjustmentAmount().setOv4AdjSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4SeqNo
	 *	@return ov4SeqNo
	 */
	public long getOv4SeqNo() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4SeqNo();
	}


	/**
	 *	Returns String value of ov4SeqNo
	 *	@return ov4SeqNo
	 */
	public char[]  getOv4SeqNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4SeqNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4SeqNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().ov4SeqNoIsNumeric();
	}

	/**
	 * 	Update Ov4SeqNo with the passed value
	 *	@param number
	 */
	public void setOv4SeqNo(long number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4SeqNo(number);
	}
	

	
	/**
	 * 	Update Ov4SeqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4SeqNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().setOv4SeqNo(value);
	}
	
	/**
	 * 	Update Ov4SeqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4SeqNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4SeqNo(value);
	}	

	/**
	 *	Returns the value of tmAdjDateMm
	 *	@return tmAdjDateMm
	 */
   public char[] getTmAdjDateMm() throws CFException  {              
   		return tmAdjDate.getTmAdjDateMm();
   }

  
	/**
	*  set variable tmAdjDateMm
	*  @param value
	**/
   public void setTmAdjDateMm(char[] value) throws CFException {
      tmAdjDate.setTmAdjDateMm(value);
   } 

     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex) throws CFException {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex);
   	
   }
   
   public void setTmAdjDateMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TmAdjDateMm with another Field
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source) {
      tmAdjDate.setTmAdjDateMm(source);
   }  
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmAdjDate.setTmAdjDateMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4TrcrNo
	 *	@return ov4TrcrNo
	 */
	public int getOv4TrcrNo() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4TrcrNo();
	}


	/**
	 *	Returns String value of ov4TrcrNo
	 *	@return ov4TrcrNo
	 */
	public char[]  getOv4TrcrNoString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4TrcrNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4TrcrNoIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().ov4TrcrNoIsNumeric();
	}

	/**
	 * 	Update Ov4TrcrNo with the passed value
	 *	@param number
	 */
	public void setOv4TrcrNo(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4TrcrNo(number);
	}
	

	public void setOv4TrcrNo(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().setOv4TrcrNo(number);
	}
	
	
	/**
	 * 	Update Ov4TrcrNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4TrcrNo(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().setOv4TrcrNo(value);
	}
	
	/**
	 * 	Update Ov4TrcrNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4TrcrNoString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().setOv4TrcrNo(value);
	}	

	/**
	 *	Returns the value of ov4Md1Tracer
	 *	@return ov4Md1Tracer
	 */
   public char[] getOv4Md1Tracer() throws CFException  {              
   		return ov4ParameterList.getOv4MiscData1().getOv4Md1Tracer();
   }

  
	/**
	*  set variable ov4Md1Tracer
	*  @param value
	**/
   public void setOv4Md1Tracer(char[] value) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(value);
   } 

     /**
	 * 	Update Ov4Md1Tracer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Tracer(char[] source, int sourceIndex) throws CFException {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source, sourceIndex);
   	
   }
   
   public void setOv4Md1Tracer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Tracer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ov4Md1Tracer with another Field
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source);
   }  
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source, int sourceIndex,int sourceLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ov4ParameterList.getOv4MiscData1().setOv4Md1Tracer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ov4InJulDay
	 *	@return ov4InJulDay
	 */
	public int getOv4InJulDay() throws CFException {
   		return ov4ParameterList.getOv4ItemNo().getOv4InJulDay();
	}


	/**
	 *	Returns String value of ov4InJulDay
	 *	@return ov4InJulDay
	 */
	public char[]  getOv4InJulDayString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4ItemNo().getOv4InJulDayString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InJulDayIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4ItemNo().ov4InJulDayIsNumeric();
	}

	/**
	 * 	Update Ov4InJulDay with the passed value
	 *	@param number
	 */
	public void setOv4InJulDay(int number)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InJulDay(number);
	}
	

	public void setOv4InJulDay(long number)  throws CFException{
	    ov4ParameterList.getOv4ItemNo().setOv4InJulDay(number);
	}
	
	
	/**
	 * 	Update Ov4InJulDay with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InJulDay(char[] value)  throws CFException {
		ov4ParameterList.getOv4ItemNo().setOv4InJulDay(value);
	}
	
	/**
	 * 	Update Ov4InJulDay with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InJulDayString(char[] value)  throws CFException{
		ov4ParameterList.getOv4ItemNo().setOv4InJulDay(value);
	}	

	/**
	 *	Returns the value of ov4CycleDateMm
	 *	@return ov4CycleDateMm
	 */
	public int getOv4CycleDateMm() throws CFException {
   		return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateMm();
	}


	/**
	 *	Returns String value of ov4CycleDateMm
	 *	@return ov4CycleDateMm
	 */
	public char[]  getOv4CycleDateMmString() throws CFException {
	     return String.valueOf(ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().getOv4CycleDateMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateMmIsNumeric()  throws CFException{
	    return ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().ov4CycleDateMmIsNumeric();
	}

	/**
	 * 	Update Ov4CycleDateMm with the passed value
	 *	@param number
	 */
	public void setOv4CycleDateMm(int number)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateMm(number);
	}
	

	public void setOv4CycleDateMm(long number)  throws CFException{
	    ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateMm(number);
	}
	
	
	/**
	 * 	Update Ov4CycleDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateMm(char[] value)  throws CFException {
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateMm(value);
	}
	
	/**
	 * 	Update Ov4CycleDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateMmString(char[] value)  throws CFException{
		ov4ParameterList.getOv4CpcsInfo().getOv4CycleDateRedefined().setOv4CycleDateMm(value);
	}	

	/**
	 *	Returns the value of waCurrentDate
	 *	@return waCurrentDate
	 */
   public char[] getWaCurrentDate() throws CFException  {              
   		return waCurrentDateGroup.getWaCurrentDate();
   }

  
	/**
	*  set variable waCurrentDate
	*  @param value
	**/
   public void setWaCurrentDate(char[] value) throws CFException {
      waCurrentDateGroup.setWaCurrentDate(value);
   } 

     /**
	 * 	Update WaCurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCurrentDate(char[] source, int sourceIndex) throws CFException {
      waCurrentDateGroup.setWaCurrentDate(source, sourceIndex);
   	
   }
   
   public void setWaCurrentDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      waCurrentDateGroup.setWaCurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WaCurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.setWaCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WaCurrentDate with another Field
	 *	@param value
	 */
   public void setWaCurrentDate(Field source) {
      waCurrentDateGroup.setWaCurrentDate(source);
   }  
   
     /**
	 * 	Update WaCurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCurrentDate(Field source, int sourceIndex,int sourceLen) {
      waCurrentDateGroup.setWaCurrentDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WaCurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      waCurrentDateGroup.setWaCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableAreas.hashCode();
        str += ov4ParameterList.hashCode();
        str += tmAdjDate.hashCode();
        str += work.hashCode();
        str += waCurrentDateGroup.hashCode();
       return str.hashCode();
    }

    public CreateAeOutputRecordOutCtx clone() {
        CreateAeOutputRecordOutCtx cloneObj = new CreateAeOutputRecordOutCtx();
        cloneObj.tableAreas = new TableAreas();
        cloneObj.tableAreas.set(tableAreas.getClonedField());
        cloneObj.ov4ParameterList = new Ov4ParameterList();
        cloneObj.ov4ParameterList.set(ov4ParameterList.getClonedField());
        cloneObj.tmAdjDate = new TmAdjDate();
        cloneObj.tmAdjDate.set(tmAdjDate.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.waCurrentDateGroup = new WaCurrentDateGroup();
        cloneObj.waCurrentDateGroup.set(waCurrentDateGroup.getClonedField());
        return cloneObj;
    }

    }

    public CreateAeOutputRecordOutCtx getCreateAeOutputRecordOutCtx() {
            return new CreateAeOutputRecordOutCtx();
    }
     public class ReadAdjTableOutCtx implements Cloneable {
     Adjtable adjtable = UsbaeextCtx.this.getAdjtable();
     Work work = UsbaeextCtx.this.getWork();

	/**
	 *	Returns the value of adjtable
	 *	@return adjtable
	 */   
	 public Adjtable getAdjtable() {
   	return adjtable;
   }


	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException  {              
   		return work.getWaEndSw();
   }

  
	/**
	*  set variable waEndSw
	*  @param value
	**/
   public void setWaEndSw(char[] value) throws CFException {
      work.setWaEndSw(value);
   } 

	/**
	 *	Test condition "*" for isAdjtblCommentLine()
	 *	@return  Returns true if isAdjtblCommentLine() is "*"
	 */
   public boolean isAdjtblCommentLine() throws CFException {
      return adjtable.isAdjtblCommentLine();
   }

	/**
	*  set values "*"
	*/
   	public void setAdjtblCommentLineTrue()  throws CFException{  			
    	adjtable.setAdjtblCommentLineTrue();
   	}

        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += adjtable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadAdjTableOutCtx clone() {
        ReadAdjTableOutCtx cloneObj = new ReadAdjTableOutCtx();
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadAdjTableOutCtx getReadAdjTableOutCtx() {
            return new ReadAdjTableOutCtx();
    }
     public class ProcessAdjTableInCtx implements Cloneable {
     TableAreas tableAreas = UsbaeextCtx.this.getTableAreas();
     Adjtable adjtable = UsbaeextCtx.this.getAdjtable();


public void setTaAdjIndex(int taAdjIndex) { 
    UsbaeextCtx.this.taAdjIndex = taAdjIndex;
}

public int getTaAdjIndex() { 
    return UsbaeextCtx.this.taAdjIndex;
}
	/**
	 *	Returns the value of adjtblSortType
	 *	@return adjtblSortType
	 */
   public char[] getAdjtblSortType() throws CFException  {              
   		return adjtable.getAdjtblSortType();
   }

  
	/**
	*  set variable adjtblSortType
	*  @param value
	**/
   public void setAdjtblSortType(char[] value) throws CFException {
      adjtable.setAdjtblSortType(value);
   } 

     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSortType(source, sourceIndex);
   	
   }
   
   public void setAdjtblSortType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSortType with another Field
	 *	@param value
	 */
   public void setAdjtblSortType(Field source) {
      adjtable.setAdjtblSortType(source);
   }  
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblSrcReceiptCd
	 *	@return adjtblSrcReceiptCd
	 */
   public char[] getAdjtblSrcReceiptCd() throws CFException  {              
   		return adjtable.getAdjtblSrcReceiptCd();
   }

  
	/**
	*  set variable adjtblSrcReceiptCd
	*  @param value
	**/
   public void setAdjtblSrcReceiptCd(char[] value) throws CFException {
      adjtable.setAdjtblSrcReceiptCd(value);
   } 

     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source) {
      adjtable.setAdjtblSrcReceiptCd(source);
   }  
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblDeptNumber
	 *	@return adjtblDeptNumber
	 */
   public char[] getAdjtblDeptNumber() throws CFException  {              
   		return adjtable.getAdjtblDeptNumber();
   }

  
	/**
	*  set variable adjtblDeptNumber
	*  @param value
	**/
   public void setAdjtblDeptNumber(char[] value) throws CFException {
      adjtable.setAdjtblDeptNumber(value);
   } 

     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblDeptNumber(source, sourceIndex);
   	
   }
   
   public void setAdjtblDeptNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblDeptNumber with another Field
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source) {
      adjtable.setAdjtblDeptNumber(source);
   }  
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getTaAdjIndexMax() throws CFException {  
        return tableAreas.getTaAdjIndexMax();
}
	/**
	 * 	Update TaAdjIndexMax with the passed value
	 *	@param number
	 */
	public void setTaAdjIndexMax(int number)  throws CFException{
		tableAreas.setTaAdjIndexMax(number);
	}


	public void setTaAdjIndexMax(long number)  throws CFException{
	    tableAreas.setTaAdjIndexMax(number);
	}
	

	/**
	 *	Returns the value of adjtblCpcsSite
	 *	@return adjtblCpcsSite
	 */
   public char[] getAdjtblCpcsSite() throws CFException  {              
   		return adjtable.getAdjtblCpcsSite();
   }

  
	/**
	*  set variable adjtblCpcsSite
	*  @param value
	**/
   public void setAdjtblCpcsSite(char[] value) throws CFException {
      adjtable.setAdjtblCpcsSite(value);
   } 

     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblCpcsSite(source, sourceIndex);
   	
   }
   
   public void setAdjtblCpcsSite(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblCpcsSite with another Field
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source) {
      adjtable.setAdjtblCpcsSite(source);
   }  
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblAccountCode
	 *	@return adjtblAccountCode
	 */
   public char[] getAdjtblAccountCode() throws CFException  {              
   		return adjtable.getAdjtblAccountCode();
   }

  
	/**
	*  set variable adjtblAccountCode
	*  @param value
	**/
   public void setAdjtblAccountCode(char[] value) throws CFException {
      adjtable.setAdjtblAccountCode(value);
   } 

     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblAccountCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblAccountCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblAccountCode with another Field
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source) {
      adjtable.setAdjtblAccountCode(source);
   }  
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblSrcErrorCd
	 *	@return adjtblSrcErrorCd
	 */
   public char[] getAdjtblSrcErrorCd() throws CFException  {              
   		return adjtable.getAdjtblSrcErrorCd();
   }

  
	/**
	*  set variable adjtblSrcErrorCd
	*  @param value
	**/
   public void setAdjtblSrcErrorCd(char[] value) throws CFException {
      adjtable.setAdjtblSrcErrorCd(value);
   } 

     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSrcErrorCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source) {
      adjtable.setAdjtblSrcErrorCd(source);
   }  
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblAdjustmentCode
	 *	@return adjtblAdjustmentCode
	 */
   public char[] getAdjtblAdjustmentCode() throws CFException  {              
   		return adjtable.getAdjtblAdjustmentCode();
   }

  
	/**
	*  set variable adjtblAdjustmentCode
	*  @param value
	**/
   public void setAdjtblAdjustmentCode(char[] value) throws CFException {
      adjtable.setAdjtblAdjustmentCode(value);
   } 

     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblAdjustmentCode with another Field
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source) {
      adjtable.setAdjtblAdjustmentCode(source);
   }  
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblBankNumber
	 *	@return adjtblBankNumber
	 */
   public char[] getAdjtblBankNumber() throws CFException  {              
   		return adjtable.getAdjtblBankNumber();
   }

  
	/**
	*  set variable adjtblBankNumber
	*  @param value
	**/
   public void setAdjtblBankNumber(char[] value) throws CFException {
      adjtable.setAdjtblBankNumber(value);
   } 

     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblBankNumber(source, sourceIndex);
   	
   }
   
   public void setAdjtblBankNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblBankNumber with another Field
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source) {
      adjtable.setAdjtblBankNumber(source);
   }  
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblClerkId
	 *	@return adjtblClerkId
	 */
   public char[] getAdjtblClerkId() throws CFException  {              
   		return adjtable.getAdjtblClerkId();
   }

  
	/**
	*  set variable adjtblClerkId
	*  @param value
	**/
   public void setAdjtblClerkId(char[] value) throws CFException {
      adjtable.setAdjtblClerkId(value);
   } 

     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblClerkId(source, sourceIndex);
   	
   }
   
   public void setAdjtblClerkId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblClerkId with another Field
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source) {
      adjtable.setAdjtblClerkId(source);
   }  
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblTypeCode
	 *	@return adjtblTypeCode
	 */
   public char[] getAdjtblTypeCode() throws CFException  {              
   		return adjtable.getAdjtblTypeCode();
   }

  
	/**
	*  set variable adjtblTypeCode
	*  @param value
	**/
   public void setAdjtblTypeCode(char[] value) throws CFException {
      adjtable.setAdjtblTypeCode(value);
   } 

     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblTypeCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblTypeCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblTypeCode with another Field
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source) {
      adjtable.setAdjtblTypeCode(source);
   }  
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }

        public ProcessAdjTableOutCtx getProcessAdjTableOutCtx() {
            return new ProcessAdjTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableAreas.hashCode();
        str += adjtable.hashCode();
       return str.hashCode();
    }

    public ProcessAdjTableInCtx clone() {
        ProcessAdjTableInCtx cloneObj = new ProcessAdjTableInCtx();
        cloneObj.tableAreas = new TableAreas();
        cloneObj.tableAreas.set(tableAreas.getClonedField());
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        return cloneObj;
    }

    }

    public ProcessAdjTableInCtx getProcessAdjTableInCtx() {
            return new ProcessAdjTableInCtx();
    }
     public class ProcessAdjTableOutCtx implements Cloneable {
     TableAreas tableAreas = UsbaeextCtx.this.getTableAreas();
     Adjtable adjtable = UsbaeextCtx.this.getAdjtable();


public void setTaAdjIndex(int taAdjIndex) { 
    UsbaeextCtx.this.taAdjIndex = taAdjIndex;
}

public int getTaAdjIndex() { 
    return UsbaeextCtx.this.taAdjIndex;
}
	/**
	 *	Returns the value of adjtblSortType
	 *	@return adjtblSortType
	 */
   public char[] getAdjtblSortType() throws CFException  {              
   		return adjtable.getAdjtblSortType();
   }

  
	/**
	*  set variable adjtblSortType
	*  @param value
	**/
   public void setAdjtblSortType(char[] value) throws CFException {
      adjtable.setAdjtblSortType(value);
   } 

     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSortType(source, sourceIndex);
   	
   }
   
   public void setAdjtblSortType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSortType with another Field
	 *	@param value
	 */
   public void setAdjtblSortType(Field source) {
      adjtable.setAdjtblSortType(source);
   }  
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taDeptNo
	 *	@return taDeptNo
	 */
   public char[] getTaDeptNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaDeptNo();
   }

  
	/**
	*  set variable taDeptNo
	*  @param value
	**/
   public void setTaDeptNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(value);
   } 

     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex);
   	
   }
   
   public void setTaDeptNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaDeptNo with another Field
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source);
   }  
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaDeptNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblSrcReceiptCd
	 *	@return adjtblSrcReceiptCd
	 */
   public char[] getAdjtblSrcReceiptCd() throws CFException  {              
   		return adjtable.getAdjtblSrcReceiptCd();
   }

  
	/**
	*  set variable adjtblSrcReceiptCd
	*  @param value
	**/
   public void setAdjtblSrcReceiptCd(char[] value) throws CFException {
      adjtable.setAdjtblSrcReceiptCd(value);
   } 

     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source) {
      adjtable.setAdjtblSrcReceiptCd(source);
   }  
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getTaAdjIndexMax() throws CFException {  
        return tableAreas.getTaAdjIndexMax();
}
	/**
	 * 	Update TaAdjIndexMax with the passed value
	 *	@param number
	 */
	public void setTaAdjIndexMax(int number)  throws CFException{
		tableAreas.setTaAdjIndexMax(number);
	}


	public void setTaAdjIndexMax(long number)  throws CFException{
	    tableAreas.setTaAdjIndexMax(number);
	}
	

	/**
	 *	Returns the value of adjtblCpcsSite
	 *	@return adjtblCpcsSite
	 */
   public char[] getAdjtblCpcsSite() throws CFException  {              
   		return adjtable.getAdjtblCpcsSite();
   }

  
	/**
	*  set variable adjtblCpcsSite
	*  @param value
	**/
   public void setAdjtblCpcsSite(char[] value) throws CFException {
      adjtable.setAdjtblCpcsSite(value);
   } 

     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblCpcsSite(source, sourceIndex);
   	
   }
   
   public void setAdjtblCpcsSite(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblCpcsSite with another Field
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source) {
      adjtable.setAdjtblCpcsSite(source);
   }  
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblCpcsSite(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblAccountCode
	 *	@return adjtblAccountCode
	 */
   public char[] getAdjtblAccountCode() throws CFException  {              
   		return adjtable.getAdjtblAccountCode();
   }

  
	/**
	*  set variable adjtblAccountCode
	*  @param value
	**/
   public void setAdjtblAccountCode(char[] value) throws CFException {
      adjtable.setAdjtblAccountCode(value);
   } 

     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblAccountCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblAccountCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblAccountCode with another Field
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source) {
      adjtable.setAdjtblAccountCode(source);
   }  
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAccountCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taClerkId
	 *	@return taClerkId
	 */
   public char[] getTaClerkId(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaClerkId();
   }

  
	/**
	*  set variable taClerkId
	*  @param value
	**/
   public void setTaClerkId(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(value);
   } 

     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex);
   	
   }
   
   public void setTaClerkId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaClerkId with another Field
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source);
   }  
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taBankNo
	 *	@return taBankNo
	 */
   public char[] getTaBankNo(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaBankNo();
   }

  
	/**
	*  set variable taBankNo
	*  @param value
	**/
   public void setTaBankNo(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(value);
   } 

     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex);
   	
   }
   
   public void setTaBankNo(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaBankNo with another Field
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source);
   }  
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaBankNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taTypeCd
	 *	@return taTypeCd
	 */
   public char[] getTaTypeCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaTypeCd();
   }

  
	/**
	*  set variable taTypeCd
	*  @param value
	**/
   public void setTaTypeCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(value);
   } 

     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex);
   	
   }
   
   public void setTaTypeCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaTypeCd with another Field
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source);
   }  
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblAdjustmentCode
	 *	@return adjtblAdjustmentCode
	 */
   public char[] getAdjtblAdjustmentCode() throws CFException  {              
   		return adjtable.getAdjtblAdjustmentCode();
   }

  
	/**
	*  set variable adjtblAdjustmentCode
	*  @param value
	**/
   public void setAdjtblAdjustmentCode(char[] value) throws CFException {
      adjtable.setAdjtblAdjustmentCode(value);
   } 

     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblAdjustmentCode with another Field
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source) {
      adjtable.setAdjtblAdjustmentCode(source);
   }  
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblAdjustmentCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblBankNumber
	 *	@return adjtblBankNumber
	 */
   public char[] getAdjtblBankNumber() throws CFException  {              
   		return adjtable.getAdjtblBankNumber();
   }

  
	/**
	*  set variable adjtblBankNumber
	*  @param value
	**/
   public void setAdjtblBankNumber(char[] value) throws CFException {
      adjtable.setAdjtblBankNumber(value);
   } 

     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblBankNumber(source, sourceIndex);
   	
   }
   
   public void setAdjtblBankNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblBankNumber with another Field
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source) {
      adjtable.setAdjtblBankNumber(source);
   }  
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblBankNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblClerkId
	 *	@return adjtblClerkId
	 */
   public char[] getAdjtblClerkId() throws CFException  {              
   		return adjtable.getAdjtblClerkId();
   }

  
	/**
	*  set variable adjtblClerkId
	*  @param value
	**/
   public void setAdjtblClerkId(char[] value) throws CFException {
      adjtable.setAdjtblClerkId(value);
   } 

     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblClerkId(source, sourceIndex);
   	
   }
   
   public void setAdjtblClerkId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblClerkId with another Field
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source) {
      adjtable.setAdjtblClerkId(source);
   }  
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblClerkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getTaAdjCodeCnt(int index) throws CFException {  
        return tableAreas.getTaAdjTableRedefined(index).getTaAdjCodeCnt();
}
	/**
	 * 	Update TaAdjCodeCnt with the passed value
	 *	@param number
	 */
	public void setTaAdjCodeCnt(int index,int number)  throws CFException{
		tableAreas.getTaAdjTableRedefined(index).setTaAdjCodeCnt(number);
	}


	public void setTaAdjCodeCnt(int index,long number)  throws CFException{
	    tableAreas.getTaAdjTableRedefined(index).setTaAdjCodeCnt(number);
	}
	

	/**
	 *	Returns the value of adjtblTypeCode
	 *	@return adjtblTypeCode
	 */
   public char[] getAdjtblTypeCode() throws CFException  {              
   		return adjtable.getAdjtblTypeCode();
   }

  
	/**
	*  set variable adjtblTypeCode
	*  @param value
	**/
   public void setAdjtblTypeCode(char[] value) throws CFException {
      adjtable.setAdjtblTypeCode(value);
   } 

     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblTypeCode(source, sourceIndex);
   	
   }
   
   public void setAdjtblTypeCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblTypeCode with another Field
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source) {
      adjtable.setAdjtblTypeCode(source);
   }  
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblTypeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSrcErrorCd
	 *	@return taSrcErrorCd
	 */
   public char[] getTaSrcErrorCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcErrorCd();
   }

  
	/**
	*  set variable taSrcErrorCd
	*  @param value
	**/
   public void setTaSrcErrorCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(value);
   } 

     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcErrorCd with another Field
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source);
   }  
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taAcctCd
	 *	@return taAcctCd
	 */
   public char[] getTaAcctCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaAcctCd();
   }

  
	/**
	*  set variable taAcctCd
	*  @param value
	**/
   public void setTaAcctCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(value);
   } 

     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex);
   	
   }
   
   public void setTaAcctCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaAcctCd with another Field
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source);
   }  
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAcctCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblDeptNumber
	 *	@return adjtblDeptNumber
	 */
   public char[] getAdjtblDeptNumber() throws CFException  {              
   		return adjtable.getAdjtblDeptNumber();
   }

  
	/**
	*  set variable adjtblDeptNumber
	*  @param value
	**/
   public void setAdjtblDeptNumber(char[] value) throws CFException {
      adjtable.setAdjtblDeptNumber(value);
   } 

     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblDeptNumber(source, sourceIndex);
   	
   }
   
   public void setAdjtblDeptNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblDeptNumber with another Field
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source) {
      adjtable.setAdjtblDeptNumber(source);
   }  
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblDeptNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSrcReceiptCd
	 *	@return taSrcReceiptCd
	 */
   public char[] getTaSrcReceiptCd(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSrcReceiptCd();
   }

  
	/**
	*  set variable taSrcReceiptCd
	*  @param value
	**/
   public void setTaSrcReceiptCd(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(value);
   } 

     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex);
   	
   }
   
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source);
   }  
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSrcReceiptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taAdjCode
	 *	@return taAdjCode
	 */
   public char[] getTaAdjCode(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaAdjCode();
   }

  
	/**
	*  set variable taAdjCode
	*  @param value
	**/
   public void setTaAdjCode(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(value);
   } 

     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAdjCode(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex);
   	
   }
   
   public void setTaAdjCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaAdjCode with another Field
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source);
   }  
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaAdjCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSiteCode
	 *	@return taSiteCode
	 */
   public char[] getTaSiteCode(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSiteCode();
   }

  
	/**
	*  set variable taSiteCode
	*  @param value
	**/
   public void setTaSiteCode(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(value);
   } 

     /**
	 * 	Update TaSiteCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSiteCode(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source, sourceIndex);
   	
   }
   
   public void setTaSiteCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSiteCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSiteCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSiteCode with another Field
	 *	@param value
	 */
   public void setTaSiteCode(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source);
   }  
   
     /**
	 * 	Update TaSiteCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSiteCode(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSiteCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSiteCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSiteCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of adjtblSrcErrorCd
	 *	@return adjtblSrcErrorCd
	 */
   public char[] getAdjtblSrcErrorCd() throws CFException  {              
   		return adjtable.getAdjtblSrcErrorCd();
   }

  
	/**
	*  set variable adjtblSrcErrorCd
	*  @param value
	**/
   public void setAdjtblSrcErrorCd(char[] value) throws CFException {
      adjtable.setAdjtblSrcErrorCd(value);
   } 

     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex) throws CFException {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex);
   	
   }
   
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdjtblSrcErrorCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source) {
      adjtable.setAdjtblSrcErrorCd(source);
   }  
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      adjtable.setAdjtblSrcErrorCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taSortType
	 *	@return taSortType
	 */
   public char[] getTaSortType(int index) throws CFException  {              
   		return tableAreas.getTaAdjTableRedefined(index).getTaSortType();
   }

  
	/**
	*  set variable taSortType
	*  @param value
	**/
   public void setTaSortType(int index,char[] value) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(value);
   } 

     /**
	 * 	Update TaSortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSortType(int index,char[] source, int sourceIndex) throws CFException {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source, sourceIndex);
   	
   }
   
   public void setTaSortType(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaSortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSortType(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaSortType with another Field
	 *	@param value
	 */
   public void setTaSortType(int index,Field source) {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source);
   }  
   
     /**
	 * 	Update TaSortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSortType(int index,Field source, int sourceIndex,int sourceLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaSortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSortType(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableAreas.getTaAdjTableRedefined(index).setTaSortType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public UsbaeextCtx getUsbaeextCtx() {
            return UsbaeextCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableAreas.hashCode();
        str += adjtable.hashCode();
       return str.hashCode();
    }

    public ProcessAdjTableOutCtx clone() {
        ProcessAdjTableOutCtx cloneObj = new ProcessAdjTableOutCtx();
        cloneObj.tableAreas = new TableAreas();
        cloneObj.tableAreas.set(tableAreas.getClonedField());
        cloneObj.adjtable = new Adjtable();
        cloneObj.adjtable.set(adjtable.getClonedField());
        return cloneObj;
    }

    }

    public ProcessAdjTableOutCtx getProcessAdjTableOutCtx() {
            return new ProcessAdjTableOutCtx();
    }
}
