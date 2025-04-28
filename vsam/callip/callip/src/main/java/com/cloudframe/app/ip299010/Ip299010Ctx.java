package com.cloudframe.app.ip299010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip299010.dto.OneDayRecLengthError620;
import com.cloudframe.app.ip299010.dto.AbendParaName900;
import com.cloudframe.app.ip299010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip299010.dto.Ip00054wTable;
import com.cloudframe.app.ip299010.dto.AbendMessage900;
import com.cloudframe.app.ip299010.dto.TblEntryNotFoundMsg650;
import com.cloudframe.app.ip299010.dto.RecordsLoadedMessage630;
import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.ip299010.dto.Ip00054wEntry;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.ip299010.dto.Table5Key1800;
import com.cloudframe.app.ip299010.dto.Ip00054wTable5Key1;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;


@Context
public class Ip299010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip00054wTable ip00054wTable;
    AbendParaName900 abendParaName900;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    TblEntryNotFoundMsg650 tblEntryNotFoundMsg650;
    Ip50005OneDayRec ip50005OneDayRec;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    RecordsLoadedMessage630 recordsLoadedMessage630;
    AbendMessage900 abendMessage900;
    Ip00054TableEntry ip00054TableEntry;
    OneDayRecLengthError620 oneDayRecLengthError620;
    Work work;
    Table5Key1800 table5Key1800;
    Ip50005ClearingDtTm ip50005ClearingDtTm;

    int ip00054wIdx;

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


    public Ip00054wTable getIp00054wTable() {
        if (ip00054wTable == null) {
            ip00054wTable = new Ip00054wTable();
        }

        return ip00054wTable;
    }

    public void setIp00054wTable(Ip00054wTable ip00054wTable) {
        this.ip00054wTable = ip00054wTable;
    }
    public AbendParaName900 getAbendParaName900() {
        if (abendParaName900 == null) {
            abendParaName900 = new AbendParaName900();
        }

        return abendParaName900;
    }

    public void setAbendParaName900(AbendParaName900 abendParaName900) {
        this.abendParaName900 = abendParaName900;
    }
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public TblEntryNotFoundMsg650 getTblEntryNotFoundMsg650() {
        if (tblEntryNotFoundMsg650 == null) {
            tblEntryNotFoundMsg650 = new TblEntryNotFoundMsg650();
        }

        return tblEntryNotFoundMsg650;
    }

    public void setTblEntryNotFoundMsg650(TblEntryNotFoundMsg650 tblEntryNotFoundMsg650) {
        this.tblEntryNotFoundMsg650 = tblEntryNotFoundMsg650;
    }
    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public RecordsLoadedMessage630 getRecordsLoadedMessage630() {
        if (recordsLoadedMessage630 == null) {
            recordsLoadedMessage630 = new RecordsLoadedMessage630();
        }

        return recordsLoadedMessage630;
    }

    public void setRecordsLoadedMessage630(RecordsLoadedMessage630 recordsLoadedMessage630) {
        this.recordsLoadedMessage630 = recordsLoadedMessage630;
    }
    public AbendMessage900 getAbendMessage900() {
        if (abendMessage900 == null) {
            abendMessage900 = new AbendMessage900();
        }

        return abendMessage900;
    }

    public void setAbendMessage900(AbendMessage900 abendMessage900) {
        this.abendMessage900 = abendMessage900;
    }
    public Ip00054TableEntry getIp00054TableEntry() {
        if (ip00054TableEntry == null) {
            ip00054TableEntry = globalCtx.getGlobalDto(Ip00054TableEntry.class);
        }

        return ip00054TableEntry;
    }

    public OneDayRecLengthError620 getOneDayRecLengthError620() {
        if (oneDayRecLengthError620 == null) {
            oneDayRecLengthError620 = new OneDayRecLengthError620();
        }

        return oneDayRecLengthError620;
    }

    public void setOneDayRecLengthError620(OneDayRecLengthError620 oneDayRecLengthError620) {
        this.oneDayRecLengthError620 = oneDayRecLengthError620;
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
    public Table5Key1800 getTable5Key1800() {
        if (table5Key1800 == null) {
            table5Key1800 = new Table5Key1800();
        }

        return table5Key1800;
    }

    public void setTable5Key1800(Table5Key1800 table5Key1800) {
        this.table5Key1800 = table5Key1800;
    }
    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }


    public int getIp00054wIdx() {
        return ip00054wIdx;
    }

    public void setIp00054wIdx(int ip00054wIdx) {
        this.ip00054wIdx = ip00054wIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054wTable.hashCode();
        str += abendParaName900.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += tblEntryNotFoundMsg650.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += recordsLoadedMessage630.hashCode();
        str += abendMessage900.hashCode();
        str += ip00054TableEntry.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
        str += ip50005ClearingDtTm.hashCode();
       return str.hashCode();
    }

    public Ip299010Ctx clone() {
        Ip299010Ctx cloneObj = new Ip299010Ctx();
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.tblEntryNotFoundMsg650 = new TblEntryNotFoundMsg650();
        cloneObj.tblEntryNotFoundMsg650.set(tblEntryNotFoundMsg650.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.recordsLoadedMessage630 = new RecordsLoadedMessage630();
        cloneObj.recordsLoadedMessage630.set(recordsLoadedMessage630.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class LoadTableIp0005t1InCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return work.isItIsFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True()  throws CFException{  			
    	work.setItIsFirstTime88100True();
   	}
	/**
	 *	Returns the value of ip00054TableEntry
	 *	@return ip00054TableEntry
	 */   
	 public Ip00054TableEntry getIp00054TableEntry() {
   	return ip00054TableEntry;
   }


	/**
	 *	Returns the value of pgmIp650010300
	 *	@return pgmIp650010300
	 */
   public char[] getPgmIp650010300() throws CFException  {              
   		return work.getPgmIp650010300();
   }

  
	/**
	*  set variable pgmIp650010300
	*  @param value
	**/
   public void setPgmIp650010300(char[] value) throws CFException {
      work.setPgmIp650010300(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public LoadTableIp0005t1OutCtx getLoadTableIp0005t1OutCtx() {
            return new LoadTableIp0005t1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTableIp0005t1InCtx clone() {
        LoadTableIp0005t1InCtx cloneObj = new LoadTableIp0005t1InCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTableIp0005t1InCtx getLoadTableIp0005t1InCtx() {
            return new LoadTableIp0005t1InCtx();
    }
     public class LoadTableIp0005t1OutCtx implements Cloneable {
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of rowLength800
	 *	@return rowLength800
	 */
	public int getRowLength800() throws CFException {        
   		return work.getRowLength800();
	}
	
	/**
	 * 	Update RowLength800 with the passed value
	 *	@param number
	 */
	public void setRowLength800(int number)  throws CFException{
		work.setRowLength800(number);
	}


	public void setRowLength800(long number)  throws CFException{
		work.setRowLength800((int)number);
	}


	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}
	/**
	 *	Returns the value of ptrIp650010800
	 *	@return ptrIp650010800
	 */
   public char[] getPtrIp650010800() throws CFException  {              
   		return work.getPtrIp650010800();
   }

  
	/**
	*  set variable ptrIp650010800
	*  @param value
	**/
   public void setPtrIp650010800(char[] value) throws CFException {
      work.setPtrIp650010800(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
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

    public LoadTableIp0005t1OutCtx clone() {
        LoadTableIp0005t1OutCtx cloneObj = new LoadTableIp0005t1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTableIp0005t1OutCtx getLoadTableIp0005t1OutCtx() {
            return new LoadTableIp0005t1OutCtx();
    }
     public class LoadTbl5TableInCtx implements Cloneable {
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isTableRecOver88100()
	 *	@return  Returns true if isTableRecOver88100() is "Y"
	 */
   public boolean isTableRecOver88100() throws CFException {
      return work.isTableRecOver88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTableRecOver88100True()  throws CFException{  			
    	work.setTableRecOver88100True();
   	}

        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
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

    public LoadTbl5TableInCtx clone() {
        LoadTbl5TableInCtx cloneObj = new LoadTbl5TableInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTbl5TableInCtx getLoadTbl5TableInCtx() {
            return new LoadTbl5TableInCtx();
    }
     public class InitializeLoadInCtx implements Cloneable {
     Ip50005OneDayRec ip50005OneDayRec = Ip299010Ctx.this.getIp50005OneDayRec();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException  {              
   		return work.getTableId300();
   }

  
	/**
	*  set variable tableId300
	*  @param value
	**/
   public void setTableId300(char[] value) throws CFException {
      work.setTableId300(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public InitializeLoadOutCtx getInitializeLoadOutCtx() {
            return new InitializeLoadOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializeLoadInCtx clone() {
        InitializeLoadInCtx cloneObj = new InitializeLoadInCtx();
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeLoadInCtx getInitializeLoadInCtx() {
            return new InitializeLoadInCtx();
    }
     public class InitializeLoadOutCtx implements Cloneable {
     Ip50005OneDayRec ip50005OneDayRec = Ip299010Ctx.this.getIp50005OneDayRec();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public long getIp50005EffDate() throws CFException {
   		return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005EffDate();
	}


	/**
	 *	Returns String value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public char[]  getIp50005EffDateString() throws CFException {
	     return String.valueOf(ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005EffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005EffDateIsNumeric()  throws CFException{
	    return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().ip50005EffDateIsNumeric();
	}

	/**
	 * 	Update Ip50005EffDate with the passed value
	 *	@param number
	 */
	public void setIp50005EffDate(long number)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(number);
	}
	

	
	/**
	 * 	Update Ip50005EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDate(char[] value)  throws CFException {
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(value);
	}
	
	/**
	 * 	Update Ip50005EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDateString(char[] value)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(value);
	}	

	/**
	 *	Test condition "N" for isTableRecNotOver88100()
	 *	@return  Returns true if isTableRecNotOver88100() is "N"
	 */
   public boolean isTableRecNotOver88100() throws CFException {
      return work.isTableRecNotOver88100();
   }

	/**
	*  set values "N"
	*/
   	public void setTableRecNotOver88100True()  throws CFException{  			
    	work.setTableRecNotOver88100True();
   	}
	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip50005ReadTableId
	 *	@return ip50005ReadTableId
	 */
   public char[] getIp50005ReadTableId() throws CFException  {              
   		return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005ReadTableId();
   }

  
	/**
	*  set variable ip50005ReadTableId
	*  @param value
	**/
   public void setIp50005ReadTableId(char[] value) throws CFException {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(value);
   } 

     /**
	 * 	Update Ip50005ReadTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ReadTableId(char[] source, int sourceIndex) throws CFException {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source, sourceIndex);
   	
   }
   
   public void setIp50005ReadTableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ReadTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005ReadTableId with another Field
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source) {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source);
   }  
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source, int sourceIndex,int sourceLen) {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005ReadTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException  {              
   		return work.getTableId300();
   }

  
	/**
	*  set variable tableId300
	*  @param value
	**/
   public void setTableId300(char[] value) throws CFException {
      work.setTableId300(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializeLoadOutCtx clone() {
        InitializeLoadOutCtx cloneObj = new InitializeLoadOutCtx();
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeLoadOutCtx getInitializeLoadOutCtx() {
            return new InitializeLoadOutCtx();
    }
     public class GetFromOneDayFileInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip299010Ctx.this.getIp50005OneDayReadStatusGroup();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */
   public char[] getRecNotFoundMsg610() throws CFException  {              
   		return work.getRecNotFoundMsg610();
   }

  
	/**
	*  set variable recNotFoundMsg610
	*  @param value
	**/
   public void setRecNotFoundMsg610(char[] value) throws CFException {
      work.setRecNotFoundMsg610(value);
   } 

	/**
	 *	Returns the value of recAbsentAbendCode300
	 *	@return recAbsentAbendCode300
	 */
   public char[] getRecAbsentAbendCode300() throws CFException  {              
   		return work.getRecAbsentAbendCode300();
   }

  
	/**
	*  set variable recAbsentAbendCode300
	*  @param value
	**/
   public void setRecAbsentAbendCode300(char[] value) throws CFException {
      work.setRecAbsentAbendCode300(value);
   } 

	/**
	 *	Test condition "00" for isIp50005TblLastRecY88()
	 *	@return  Returns true if isIp50005TblLastRecY88() is "00"
	 */
   public boolean isIp50005TblLastRecY88() throws CFException {
      return ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88();
   }

	/**
	*  set values "00"
	*/
   	public void setIp50005TblLastRecY88True()  throws CFException{  			
    	ip50005OneDayReadStatusGroup.setIp50005TblLastRecY88True();
   	}
	/**
	 *	Returns the value of para1220300
	 *	@return para1220300
	 */
   public char[] getPara1220300() throws CFException  {              
   		return work.getPara1220300();
   }

  
	/**
	*  set variable para1220300
	*  @param value
	**/
   public void setPara1220300(char[] value) throws CFException {
      work.setPara1220300(value);
   } 

	/**
	 *	Test condition "00" "02" for isIp50005OneDayIoGood88()
	 *	@return  Returns true if isIp50005OneDayIoGood88() is "00" "02"
	 */
   public boolean isIp50005OneDayIoGood88() throws CFException {
      return ip50005OneDayReadStatusGroup.isIp50005OneDayIoGood88();
   }

	/**
	*  set values "00" "02"
	*/
   	public void setIp50005OneDayIoGood88True()  throws CFException{  			
    	ip50005OneDayReadStatusGroup.setIp50005OneDayIoGood88True();
   	}
	/**
	 *	Returns the value of ptrIp650010800
	 *	@return ptrIp650010800
	 */
   public char[] getPtrIp650010800() throws CFException  {              
   		return work.getPtrIp650010800();
   }

  
	/**
	*  set variable ptrIp650010800
	*  @param value
	**/
   public void setPtrIp650010800(char[] value) throws CFException {
      work.setPtrIp650010800(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public GetFromOneDayFileOutCtx getGetFromOneDayFileOutCtx() {
            return new GetFromOneDayFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileInCtx clone() {
        GetFromOneDayFileInCtx cloneObj = new GetFromOneDayFileInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileInCtx getGetFromOneDayFileInCtx() {
            return new GetFromOneDayFileInCtx();
    }
     public class GetFromOneDayFileOutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip299010Ctx.this.getIp50005OneDayReadStatusGroup();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */
   public char[] getRecNotFoundMsg610() throws CFException  {              
   		return work.getRecNotFoundMsg610();
   }

  
	/**
	*  set variable recNotFoundMsg610
	*  @param value
	**/
   public void setRecNotFoundMsg610(char[] value) throws CFException {
      work.setRecNotFoundMsg610(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recAbsentAbendCode300
	 *	@return recAbsentAbendCode300
	 */
   public char[] getRecAbsentAbendCode300() throws CFException  {              
   		return work.getRecAbsentAbendCode300();
   }

  
	/**
	*  set variable recAbsentAbendCode300
	*  @param value
	**/
   public void setRecAbsentAbendCode300(char[] value) throws CFException {
      work.setRecAbsentAbendCode300(value);
   } 

	/**
	 *	Returns the value of para1220300
	 *	@return para1220300
	 */
   public char[] getPara1220300() throws CFException  {              
   		return work.getPara1220300();
   }

  
	/**
	*  set variable para1220300
	*  @param value
	**/
   public void setPara1220300(char[] value) throws CFException {
      work.setPara1220300(value);
   } 

	/**
	 *	Test condition "Y" for isTableRecOver88100()
	 *	@return  Returns true if isTableRecOver88100() is "Y"
	 */
   public boolean isTableRecOver88100() throws CFException {
      return work.isTableRecOver88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTableRecOver88100True()  throws CFException{  			
    	work.setTableRecOver88100True();
   	}

        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileOutCtx clone() {
        GetFromOneDayFileOutCtx cloneObj = new GetFromOneDayFileOutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileOutCtx getGetFromOneDayFileOutCtx() {
            return new GetFromOneDayFileOutCtx();
    }
     public class LoadToIp0005t1TableInCtx implements Cloneable {
     Ip50005OneDayRec ip50005OneDayRec = Ip299010Ctx.this.getIp50005OneDayRec();
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
   }


	/**
	 *	Returns the value of ip50005TableData
	 *	@return ip50005TableData
	 */
   public char[] getIp50005TableData() throws CFException  {              
   		return ip50005OneDayRec.getIp50005TableData();
   }

  
	/**
	*  set variable ip50005TableData
	*  @param value
	**/
   public void setIp50005TableData(char[] value) throws CFException {
      ip50005OneDayRec.setIp50005TableData(value);
   } 

     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex) throws CFException {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex);
   	
   }
   
   public void setIp50005TableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableData with another Field
	 *	@param value
	 */
   public void setIp50005TableData(Field source) {
      ip50005OneDayRec.setIp50005TableData(source);
   }  
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recordCount800
	 *	@return recordCount800
	 */
	public int getRecordCount800() throws CFException {        
   		return work.getRecordCount800();
	}
	
	/**
	 * 	Update RecordCount800 with the passed value
	 *	@param number
	 */
	public void setRecordCount800(int number)  throws CFException{
		work.setRecordCount800(number);
	}


	public void setRecordCount800(long number)  throws CFException{
		work.setRecordCount800((int)number);
	}


	/**
	 *	Returns the value of ip00054wTable
	 *	@return ip00054wTable
	 */   
	 public Ip00054wTable getIp00054wTable() {
   	return ip00054wTable;
   }


	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of recordLength800
	 *	@return recordLength800
	 */
	public int getRecordLength800() throws CFException {        
   		return work.getRecordLength800();
	}
	
	/**
	 * 	Update RecordLength800 with the passed value
	 *	@param number
	 */
	public void setRecordLength800(int number)  throws CFException{
		work.setRecordLength800(number);
	}


	public void setRecordLength800(long number)  throws CFException{
		work.setRecordLength800((int)number);
	}


	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}


	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((int)number);
	}


	/**
	 *	Returns the value of startPoint400
	 *	@return startPoint400
	 */
	public int getStartPoint400() throws CFException {        
   		return work.getStartPoint400();
	}
	
	/**
	 * 	Update StartPoint400 with the passed value
	 *	@param number
	 */
	public void setStartPoint400(int number)  throws CFException{
		work.setStartPoint400(number);
	}


	public void setStartPoint400(long number)  throws CFException{
		work.setStartPoint400((int)number);
	}



        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public LoadToIp0005t1TableOutCtx getLoadToIp0005t1TableOutCtx() {
            return new LoadToIp0005t1TableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRec.hashCode();
        str += ip00054wTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadToIp0005t1TableInCtx clone() {
        LoadToIp0005t1TableInCtx cloneObj = new LoadToIp0005t1TableInCtx();
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadToIp0005t1TableInCtx getLoadToIp0005t1TableInCtx() {
            return new LoadToIp0005t1TableInCtx();
    }
     public class LoadToIp0005t1TableOutCtx implements Cloneable {
     Ip50005OneDayRec ip50005OneDayRec = Ip299010Ctx.this.getIp50005OneDayRec();
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of ip50005TableData
	 *	@return ip50005TableData
	 */
   public char[] getIp50005TableData() throws CFException  {              
   		return ip50005OneDayRec.getIp50005TableData();
   }

  
	/**
	*  set variable ip50005TableData
	*  @param value
	**/
   public void setIp50005TableData(char[] value) throws CFException {
      ip50005OneDayRec.setIp50005TableData(value);
   } 

     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex) throws CFException {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex);
   	
   }
   
   public void setIp50005TableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableData with another Field
	 *	@param value
	 */
   public void setIp50005TableData(Field source) {
      ip50005OneDayRec.setIp50005TableData(source);
   }  
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005OneDayRec.setIp50005TableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00054wTable
	 *	@return ip00054wTable
	 */   
	 public Ip00054wTable getIp00054wTable() {
   	return ip00054wTable;
   }


	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of recordLength800
	 *	@return recordLength800
	 */
	public int getRecordLength800() throws CFException {        
   		return work.getRecordLength800();
	}
	
	/**
	 * 	Update RecordLength800 with the passed value
	 *	@param number
	 */
	public void setRecordLength800(int number)  throws CFException{
		work.setRecordLength800(number);
	}


	public void setRecordLength800(long number)  throws CFException{
		work.setRecordLength800((int)number);
	}


	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}


	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((int)number);
	}


	/**
	 *	Returns the value of startPoint400
	 *	@return startPoint400
	 */
	public int getStartPoint400() throws CFException {        
   		return work.getStartPoint400();
	}
	
	/**
	 * 	Update StartPoint400 with the passed value
	 *	@param number
	 */
	public void setStartPoint400(int number)  throws CFException{
		work.setStartPoint400(number);
	}


	public void setStartPoint400(long number)  throws CFException{
		work.setStartPoint400((int)number);
	}



        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRec.hashCode();
        str += ip00054wTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadToIp0005t1TableOutCtx clone() {
        LoadToIp0005t1TableOutCtx cloneObj = new LoadToIp0005t1TableOutCtx();
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadToIp0005t1TableOutCtx getLoadToIp0005t1TableOutCtx() {
            return new LoadToIp0005t1TableOutCtx();
    }
     public class _10CheckOnedayRecLenInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     OneDayRecLengthError620 oneDayRecLengthError620 = Ip299010Ctx.this.getOneDayRecLengthError620();
     Work work = Ip299010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip299010Ctx.this.getIp50005OneDayRecLthGroup();

	/**
	 *	Returns the value of remainder800
	 *	@return remainder800
	 */
	public int getRemainder800() throws CFException {        
   		return work.getRemainder800();
	}
	
	/**
	 * 	Update Remainder800 with the passed value
	 *	@param number
	 */
	public void setRemainder800(int number)  throws CFException{
		work.setRemainder800(number);
	}


	public void setRemainder800(long number)  throws CFException{
		work.setRemainder800((int)number);
	}


	/**
	 *	Returns the value of para122110300
	 *	@return para122110300
	 */
   public char[] getPara122110300() throws CFException  {              
   		return work.getPara122110300();
   }

  
	/**
	*  set variable para122110300
	*  @param value
	**/
   public void setPara122110300(char[] value) throws CFException {
      work.setPara122110300(value);
   } 

	/**
	 *	Returns the value of oneDayRecLengthError620
	 *	@return oneDayRecLengthError620
	 */   
	 public OneDayRecLengthError620 getOneDayRecLengthError620() {
   	return oneDayRecLengthError620;
   }


	/**
	 *	Returns the value of rowLength800
	 *	@return rowLength800
	 */
	public int getRowLength800() throws CFException {        
   		return work.getRowLength800();
	}
	
	/**
	 * 	Update RowLength800 with the passed value
	 *	@param number
	 */
	public void setRowLength800(int number)  throws CFException{
		work.setRowLength800(number);
	}


	public void setRowLength800(long number)  throws CFException{
		work.setRowLength800((int)number);
	}


	/**
	 *	Returns the value of ip50005OneDayRecLth
	 *	@return ip50005OneDayRecLth
	 */
	public long getIp50005OneDayRecLth() throws CFException {        
   		return ip50005OneDayRecLthGroup.getIp50005OneDayRecLth();
	}
	
	/**
	 * 	Update Ip50005OneDayRecLth with the passed value
	 *	@param number
	 */
	public void setIp50005OneDayRecLth(long number)  throws CFException{
		ip50005OneDayRecLthGroup.setIp50005OneDayRecLth(number);
	}



	/**
	 *	Returns the value of recLengthAbendCode300
	 *	@return recLengthAbendCode300
	 */
   public char[] getRecLengthAbendCode300() throws CFException  {              
   		return work.getRecLengthAbendCode300();
   }

  
	/**
	*  set variable recLengthAbendCode300
	*  @param value
	**/
   public void setRecLengthAbendCode300(char[] value) throws CFException {
      work.setRecLengthAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip50005TableDataLength
	 *	@return ip50005TableDataLength
	 */
	public long getIp50005TableDataLength() throws CFException {        
   		return ip50005OneDayRecLthGroup.getIp50005TableDataLength();
	}
	
	/**
	 * 	Update Ip50005TableDataLength with the passed value
	 *	@param number
	 */
	public void setIp50005TableDataLength(long number)  throws CFException{
		ip50005OneDayRecLthGroup.setIp50005TableDataLength(number);
	}




        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public _10CheckOnedayRecLenOutCtx get_10CheckOnedayRecLenOutCtx() {
            return new _10CheckOnedayRecLenOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
       return str.hashCode();
    }

    public _10CheckOnedayRecLenInCtx clone() {
        _10CheckOnedayRecLenInCtx cloneObj = new _10CheckOnedayRecLenInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        return cloneObj;
    }

    }

    public _10CheckOnedayRecLenInCtx get_10CheckOnedayRecLenInCtx() {
            return new _10CheckOnedayRecLenInCtx();
    }
     public class _10CheckOnedayRecLenOutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     OneDayRecLengthError620 oneDayRecLengthError620 = Ip299010Ctx.this.getOneDayRecLengthError620();
     Work work = Ip299010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip299010Ctx.this.getIp50005OneDayRecLthGroup();

	/**
	 *	Returns the value of errorLength620
	 *	@return errorLength620
	 */
   public char[] getErrorLength620() throws CFException  {              
   		return oneDayRecLengthError620.getErrorLength620();
   }

  
	/**
	*  set variable errorLength620
	*  @param value
	**/
   public void setErrorLength620(char[] value) throws CFException {
      oneDayRecLengthError620.setErrorLength620(value);
   } 

     /**
	 * 	Update ErrorLength620 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorLength620(char[] source, int sourceIndex) throws CFException {
      oneDayRecLengthError620.setErrorLength620(source, sourceIndex);
   	
   }
   
   public void setErrorLength620(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      oneDayRecLengthError620.setErrorLength620(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorLength620 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorLength620(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      oneDayRecLengthError620.setErrorLength620(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorLength620 with another Field
	 *	@param value
	 */
   public void setErrorLength620(Field source) {
      oneDayRecLengthError620.setErrorLength620(source);
   }  
   
     /**
	 * 	Update ErrorLength620 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorLength620(Field source, int sourceIndex,int sourceLen) {
      oneDayRecLengthError620.setErrorLength620(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorLength620 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorLength620(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      oneDayRecLengthError620.setErrorLength620(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of remainder800
	 *	@return remainder800
	 */
	public int getRemainder800() throws CFException {        
   		return work.getRemainder800();
	}
	
	/**
	 * 	Update Remainder800 with the passed value
	 *	@param number
	 */
	public void setRemainder800(int number)  throws CFException{
		work.setRemainder800(number);
	}


	public void setRemainder800(long number)  throws CFException{
		work.setRemainder800((int)number);
	}


	/**
	 *	Returns the value of recordCount800
	 *	@return recordCount800
	 */
	public int getRecordCount800() throws CFException {        
   		return work.getRecordCount800();
	}
	
	/**
	 * 	Update RecordCount800 with the passed value
	 *	@param number
	 */
	public void setRecordCount800(int number)  throws CFException{
		work.setRecordCount800(number);
	}


	public void setRecordCount800(long number)  throws CFException{
		work.setRecordCount800((int)number);
	}


	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para122110300
	 *	@return para122110300
	 */
   public char[] getPara122110300() throws CFException  {              
   		return work.getPara122110300();
   }

  
	/**
	*  set variable para122110300
	*  @param value
	**/
   public void setPara122110300(char[] value) throws CFException {
      work.setPara122110300(value);
   } 

	/**
	 *	Returns the value of oneDayRecLengthError620
	 *	@return oneDayRecLengthError620
	 */   
	 public OneDayRecLengthError620 getOneDayRecLengthError620() {
   	return oneDayRecLengthError620;
   }


	/**
	 *	Returns the value of recLengthAbendCode300
	 *	@return recLengthAbendCode300
	 */
   public char[] getRecLengthAbendCode300() throws CFException  {              
   		return work.getRecLengthAbendCode300();
   }

  
	/**
	*  set variable recLengthAbendCode300
	*  @param value
	**/
   public void setRecLengthAbendCode300(char[] value) throws CFException {
      work.setRecLengthAbendCode300(value);
   } 

	/**
	 *	Returns the value of recordLength800
	 *	@return recordLength800
	 */
	public int getRecordLength800() throws CFException {        
   		return work.getRecordLength800();
	}
	
	/**
	 * 	Update RecordLength800 with the passed value
	 *	@param number
	 */
	public void setRecordLength800(int number)  throws CFException{
		work.setRecordLength800(number);
	}


	public void setRecordLength800(long number)  throws CFException{
		work.setRecordLength800((int)number);
	}


	/**
	 *	Returns the value of ip50005TableDataLength
	 *	@return ip50005TableDataLength
	 */
	public long getIp50005TableDataLength() throws CFException {        
   		return ip50005OneDayRecLthGroup.getIp50005TableDataLength();
	}
	
	/**
	 * 	Update Ip50005TableDataLength with the passed value
	 *	@param number
	 */
	public void setIp50005TableDataLength(long number)  throws CFException{
		ip50005OneDayRecLthGroup.setIp50005TableDataLength(number);
	}




        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
       return str.hashCode();
    }

    public _10CheckOnedayRecLenOutCtx clone() {
        _10CheckOnedayRecLenOutCtx cloneObj = new _10CheckOnedayRecLenOutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        return cloneObj;
    }

    }

    public _10CheckOnedayRecLenOutCtx get_10CheckOnedayRecLenOutCtx() {
            return new _10CheckOnedayRecLenOutCtx();
    }
     public class _11CheckTableLimitInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of checkCount400
	 *	@return checkCount400
	 */
	public int getCheckCount400() throws CFException {        
   		return work.getCheckCount400();
	}
	
	/**
	 * 	Update CheckCount400 with the passed value
	 *	@param number
	 */
	public void setCheckCount400(int number)  throws CFException{
		work.setCheckCount400(number);
	}


	public void setCheckCount400(long number)  throws CFException{
		work.setCheckCount400((int)number);
	}


	/**
	 *	Returns the value of recordCount800
	 *	@return recordCount800
	 */
	public int getRecordCount800() throws CFException {        
   		return work.getRecordCount800();
	}
	
	/**
	 * 	Update RecordCount800 with the passed value
	 *	@param number
	 */
	public void setRecordCount800(int number)  throws CFException{
		work.setRecordCount800(number);
	}


	public void setRecordCount800(long number)  throws CFException{
		work.setRecordCount800((int)number);
	}


	/**
	 *	Returns the value of para122111300
	 *	@return para122111300
	 */
   public char[] getPara122111300() throws CFException  {              
   		return work.getPara122111300();
   }

  
	/**
	*  set variable para122111300
	*  @param value
	**/
   public void setPara122111300(char[] value) throws CFException {
      work.setPara122111300(value);
   } 

	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException  {              
   		return work.getTblOverflowAbendCode300();
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) throws CFException {
      work.setTblOverflowAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip00054wEntries
	 *	@return ip00054wEntries
	 */
	public short getIp00054wEntries() throws CFException {        
   		return work.getIp00054wEntries();
	}
	
	/**
	 * 	Update Ip00054wEntries with the passed value
	 *	@param number
	 */
	public void setIp00054wEntries(short number)  throws CFException{
		work.setIp00054wEntries(number);
	}

	public void setIp00054wEntries(int number)  throws CFException{
		work.setIp00054wEntries((short)number);
	}

	public void setIp00054wEntries(long number)  throws CFException{
		work.setIp00054wEntries((short)number);
	}



	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException  {              
   		return work.getTableOverflowError600();
   }

  
	/**
	*  set variable tableOverflowError600
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) throws CFException {
      work.setTableOverflowError600(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public _11CheckTableLimitOutCtx get_11CheckTableLimitOutCtx() {
            return new _11CheckTableLimitOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public _11CheckTableLimitInCtx clone() {
        _11CheckTableLimitInCtx cloneObj = new _11CheckTableLimitInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public _11CheckTableLimitInCtx get_11CheckTableLimitInCtx() {
            return new _11CheckTableLimitInCtx();
    }
     public class _11CheckTableLimitOutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of checkCount400
	 *	@return checkCount400
	 */
	public int getCheckCount400() throws CFException {        
   		return work.getCheckCount400();
	}
	
	/**
	 * 	Update CheckCount400 with the passed value
	 *	@param number
	 */
	public void setCheckCount400(int number)  throws CFException{
		work.setCheckCount400(number);
	}


	public void setCheckCount400(long number)  throws CFException{
		work.setCheckCount400((int)number);
	}


	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para122111300
	 *	@return para122111300
	 */
   public char[] getPara122111300() throws CFException  {              
   		return work.getPara122111300();
   }

  
	/**
	*  set variable para122111300
	*  @param value
	**/
   public void setPara122111300(char[] value) throws CFException {
      work.setPara122111300(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException  {              
   		return work.getTblOverflowAbendCode300();
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) throws CFException {
      work.setTblOverflowAbendCode300(value);
   } 

	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException  {              
   		return work.getTableOverflowError600();
   }

  
	/**
	*  set variable tableOverflowError600
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) throws CFException {
      work.setTableOverflowError600(value);
   } 


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public _11CheckTableLimitOutCtx clone() {
        _11CheckTableLimitOutCtx cloneObj = new _11CheckTableLimitOutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public _11CheckTableLimitOutCtx get_11CheckTableLimitOutCtx() {
            return new _11CheckTableLimitOutCtx();
    }
     public class DisplayCountInCtx implements Cloneable {
     RecordsLoadedMessage630 recordsLoadedMessage630 = Ip299010Ctx.this.getRecordsLoadedMessage630();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of recordsLoadedMessage630
	 *	@return recordsLoadedMessage630
	 */   
	 public RecordsLoadedMessage630 getRecordsLoadedMessage630() {
   	return recordsLoadedMessage630;
   }


	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}



        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public DisplayCountOutCtx getDisplayCountOutCtx() {
            return new DisplayCountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += recordsLoadedMessage630.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountInCtx clone() {
        DisplayCountInCtx cloneObj = new DisplayCountInCtx();
        cloneObj.recordsLoadedMessage630 = new RecordsLoadedMessage630();
        cloneObj.recordsLoadedMessage630.set(recordsLoadedMessage630.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountInCtx getDisplayCountInCtx() {
            return new DisplayCountInCtx();
    }
     public class DisplayCountOutCtx implements Cloneable {
     RecordsLoadedMessage630 recordsLoadedMessage630 = Ip299010Ctx.this.getRecordsLoadedMessage630();
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Returns the value of recLoadedCnt630
	 *	@return recLoadedCnt630
	 */
   public char[] getRecLoadedCnt630() throws CFException  {              
   		return recordsLoadedMessage630.getRecLoadedCnt630();
   }

  
	/**
	*  set variable recLoadedCnt630
	*  @param value
	**/
   public void setRecLoadedCnt630(char[] value) throws CFException {
      recordsLoadedMessage630.setRecLoadedCnt630(value);
   } 

     /**
	 * 	Update RecLoadedCnt630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecLoadedCnt630(char[] source, int sourceIndex) throws CFException {
      recordsLoadedMessage630.setRecLoadedCnt630(source, sourceIndex);
   	
   }
   
   public void setRecLoadedCnt630(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      recordsLoadedMessage630.setRecLoadedCnt630(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecLoadedCnt630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsLoadedMessage630.setRecLoadedCnt630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecLoadedCnt630 with another Field
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source) {
      recordsLoadedMessage630.setRecLoadedCnt630(source);
   }  
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source, int sourceIndex,int sourceLen) {
      recordsLoadedMessage630.setRecLoadedCnt630(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsLoadedMessage630.setRecLoadedCnt630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += recordsLoadedMessage630.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountOutCtx clone() {
        DisplayCountOutCtx cloneObj = new DisplayCountOutCtx();
        cloneObj.recordsLoadedMessage630 = new RecordsLoadedMessage630();
        cloneObj.recordsLoadedMessage630.set(recordsLoadedMessage630.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountOutCtx getDisplayCountOutCtx() {
            return new DisplayCountOutCtx();
    }
     public class SearchForValueInCtx implements Cloneable {
     Work work = Ip299010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isTableidFound88100()
	 *	@return  Returns true if isTableidFound88100() is "Y"
	 */
   public boolean isTableidFound88100() throws CFException {
      return work.isTableidFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTableidFound88100True()  throws CFException{  			
    	work.setTableidFound88100True();
   	}

        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
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

    public SearchForValueInCtx clone() {
        SearchForValueInCtx cloneObj = new SearchForValueInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchForValueInCtx getSearchForValueInCtx() {
            return new SearchForValueInCtx();
    }
     public class LocateTableIdOnTbl5InCtx implements Cloneable {
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Returns the value of ip00054KeyTableId
	 *	@return ip00054KeyTableId
	 */
   public char[] getIp00054KeyTableId() throws CFException  {              
   		return ip00054TableEntry.getIp00054Table5Key1().getIp00054KeyTableId();
   }

  
	/**
	*  set variable ip00054KeyTableId
	*  @param value
	**/
   public void setIp00054KeyTableId(char[] value) throws CFException {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(value);
   } 

     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex) throws CFException {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex);
   	
   }
   
   public void setIp00054KeyTableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054KeyTableId with another Field
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source);
   }  
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00054wEntry
	 *	@return ip00054wEntry
	 */   
	 public Ip00054wEntry getIp00054wEntry(int index) {
   	return ip00054wTable.getIp00054wEntry(index);
   }

    public List<Ip00054wEntry> getIp00054wEntry() {
        return ip00054wTable.getIp00054wEntry();
    }
   /**
	* 	Update Ip00054wEntry with the passed value
	*	@param value
	*/
   public void setIp00054wEntry(int index,char[] value) throws CFException {
      ip00054wTable.setIp00054wEntry((index),value);
   }   


	/**
	 *	Returns the value of ip00054wTable
	 *	@return ip00054wTable
	 */   
	 public Ip00054wTable getIp00054wTable() {
   	return ip00054wTable;
   }


	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip00054wTable5Key1
	 *	@return ip00054wTable5Key1
	 */   
	 public Ip00054wTable5Key1 getIp00054wTable5Key1(int index) {
   	return ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1();
   }

   /**
	* 	Update Ip00054wTable5Key1 with the passed value
	*	@param value
	*/
   public void setIp00054wTable5Key1(int index,char[] value) throws CFException {
      ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(value);
   }   

     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00054wTable5Key1(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wTable5Key1(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054wTable5Key1 with another Field
	 *	@param value
	 */
   public void setIp00054wTable5Key1(int index,Field source) {
   	ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(source);
   }  
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00054wTable5Key1(int index,Field source, int sourceIndex,int sourceLen) {
   	ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wTable5Key1(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00054wTable.getIp00054wEntry(index).setIp00054wTable5Key1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of table5Key1800
	 *	@return table5Key1800
	 */   
	 public Table5Key1800 getTable5Key1800() {
   	return table5Key1800;
   }



        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public LocateTableIdOnTbl5OutCtx getLocateTableIdOnTbl5OutCtx() {
            return new LocateTableIdOnTbl5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054wTable.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public LocateTableIdOnTbl5InCtx clone() {
        LocateTableIdOnTbl5InCtx cloneObj = new LocateTableIdOnTbl5InCtx();
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public LocateTableIdOnTbl5InCtx getLocateTableIdOnTbl5InCtx() {
            return new LocateTableIdOnTbl5InCtx();
    }
     public class LocateTableIdOnTbl5OutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Test condition "Y" for isTableidFound88100()
	 *	@return  Returns true if isTableidFound88100() is "Y"
	 */
   public boolean isTableidFound88100() throws CFException {
      return work.isTableidFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTableidFound88100True()  throws CFException{  			
    	work.setTableidFound88100True();
   	}
	/**
	 *	Returns the value of ip00054KeyTableId
	 *	@return ip00054KeyTableId
	 */
   public char[] getIp00054KeyTableId() throws CFException  {              
   		return ip00054TableEntry.getIp00054Table5Key1().getIp00054KeyTableId();
   }

  
	/**
	*  set variable ip00054KeyTableId
	*  @param value
	**/
   public void setIp00054KeyTableId(char[] value) throws CFException {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(value);
   } 

     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex) throws CFException {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex);
   	
   }
   
   public void setIp00054KeyTableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054KeyTableId with another Field
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source);
   }  
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.getIp00054Table5Key1().setIp00054KeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableId800
	 *	@return tableId800
	 */
   public char[] getTableId800() throws CFException  {              
   		return table5Key1800.getTableId800();
   }

  
	/**
	*  set variable tableId800
	*  @param value
	**/
   public void setTableId800(char[] value) throws CFException {
      table5Key1800.setTableId800(value);
   } 

     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex) throws CFException {
      table5Key1800.setTableId800(source, sourceIndex);
   	
   }
   
   public void setTableId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId800 with another Field
	 *	@param value
	 */
   public void setTableId800(Field source) {
      table5Key1800.setTableId800(source);
   }  
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp00054wIdx(int ip00054wIdx) { 
    Ip299010Ctx.this.ip00054wIdx = ip00054wIdx;
}

public int getIp00054wIdx() { 
    return Ip299010Ctx.this.ip00054wIdx;
}
	/**
	 *	Test condition "N" for isTableidNotFound88100()
	 *	@return  Returns true if isTableidNotFound88100() is "N"
	 */
   public boolean isTableidNotFound88100() throws CFException {
      return work.isTableidNotFound88100();
   }

	/**
	*  set values "N"
	*/
   	public void setTableidNotFound88100True()  throws CFException{  			
    	work.setTableidNotFound88100True();
   	}

        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054TableEntry.hashCode();
        str += ip00054wTable.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public LocateTableIdOnTbl5OutCtx clone() {
        LocateTableIdOnTbl5OutCtx cloneObj = new LocateTableIdOnTbl5OutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public LocateTableIdOnTbl5OutCtx getLocateTableIdOnTbl5OutCtx() {
            return new LocateTableIdOnTbl5OutCtx();
    }
     public class SearchTableIp0005t1InCtx implements Cloneable {
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Returns the value of ip00054wKeyTableId
	 *	@return ip00054wKeyTableId
	 */
   public char[] getIp00054wKeyTableId(int index) throws CFException  {              
   		return ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().getIp00054wKeyTableId();
   }

  
	/**
	*  set variable ip00054wKeyTableId
	*  @param value
	**/
   public void setIp00054wKeyTableId(int index,char[] value) throws CFException {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(value);
   } 

     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054wKeyTableId(int index,char[] source, int sourceIndex) throws CFException {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source, sourceIndex);
   	
   }
   
   public void setIp00054wKeyTableId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wKeyTableId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054wKeyTableId with another Field
	 *	@param value
	 */
   public void setIp00054wKeyTableId(int index,Field source) {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source);
   }  
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054wKeyTableId(int index,Field source, int sourceIndex,int sourceLen) {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wKeyTableId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054wTable.getIp00054wEntry(index).getIp00054wTable5Key1().setIp00054wKeyTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00054wEntry
	 *	@return ip00054wEntry
	 */   
	 public Ip00054wEntry getIp00054wEntry(int index) {
   	return ip00054wTable.getIp00054wEntry(index);
   }

    public List<Ip00054wEntry> getIp00054wEntry() {
        return ip00054wTable.getIp00054wEntry();
    }
   /**
	* 	Update Ip00054wEntry with the passed value
	*	@param value
	*/
   public void setIp00054wEntry(int index,char[] value) throws CFException {
      ip00054wTable.setIp00054wEntry((index),value);
   }   


	/**
	 *	Returns the value of ip00054wReloadDtTm
	 *	@return ip00054wReloadDtTm
	 */
   public char[] getIp00054wReloadDtTm(int index) throws CFException  {              
   		return ip00054wTable.getIp00054wEntry(index).getIp00054wReloadDtTm();
   }

  
	/**
	*  set variable ip00054wReloadDtTm
	*  @param value
	**/
   public void setIp00054wReloadDtTm(int index,char[] value) throws CFException {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(value);
   } 

     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(int index,char[] source, int sourceIndex) throws CFException {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source, sourceIndex);
   	
   }
   
   public void setIp00054wReloadDtTm(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054wReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(int index,Field source) {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source);
   }  
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(int index,Field source, int sourceIndex,int sourceLen) {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054wTable.getIp00054wEntry(index).setIp00054wReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableId800
	 *	@return tableId800
	 */
   public char[] getTableId800() throws CFException  {              
   		return table5Key1800.getTableId800();
   }

  
	/**
	*  set variable tableId800
	*  @param value
	**/
   public void setTableId800(char[] value) throws CFException {
      table5Key1800.setTableId800(value);
   } 

     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex) throws CFException {
      table5Key1800.setTableId800(source, sourceIndex);
   	
   }
   
   public void setTableId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId800 with another Field
	 *	@param value
	 */
   public void setTableId800(Field source) {
      table5Key1800.setTableId800(source);
   }  
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}


	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((int)number);
	}



public void setIp00054wIdx(int ip00054wIdx) { 
    Ip299010Ctx.this.ip00054wIdx = ip00054wIdx;
}

public int getIp00054wIdx() { 
    return Ip299010Ctx.this.ip00054wIdx;
}
	/**
	 *	Returns the value of ip00054ReloadDtTm
	 *	@return ip00054ReloadDtTm
	 */
   public char[] getIp00054ReloadDtTm() throws CFException  {              
   		return ip00054TableEntry.getIp00054ReloadDtTm();
   }

  
	/**
	*  set variable ip00054ReloadDtTm
	*  @param value
	**/
   public void setIp00054ReloadDtTm(char[] value) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(value);
   } 

     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex);
   	
   }
   
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054ReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source) {
      ip00054TableEntry.setIp00054ReloadDtTm(source);
   }  
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public SearchTableIp0005t1OutCtx getSearchTableIp0005t1OutCtx() {
            return new SearchTableIp0005t1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054wTable.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public SearchTableIp0005t1InCtx clone() {
        SearchTableIp0005t1InCtx cloneObj = new SearchTableIp0005t1InCtx();
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public SearchTableIp0005t1InCtx getSearchTableIp0005t1InCtx() {
            return new SearchTableIp0005t1InCtx();
    }
     public class SearchTableIp0005t1OutCtx implements Cloneable {
     Ip00054wTable ip00054wTable = Ip299010Ctx.this.getIp00054wTable();
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Test condition "Y" for isTableKeyFound88100()
	 *	@return  Returns true if isTableKeyFound88100() is "Y"
	 */
   public boolean isTableKeyFound88100() throws CFException {
      return work.isTableKeyFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTableKeyFound88100True()  throws CFException{  			
    	work.setTableKeyFound88100True();
   	}
	/**
	 *	Test condition "N" for isTableKeyNotFound88100()
	 *	@return  Returns true if isTableKeyNotFound88100() is "N"
	 */
   public boolean isTableKeyNotFound88100() throws CFException {
      return work.isTableKeyNotFound88100();
   }

	/**
	*  set values "N"
	*/
   	public void setTableKeyNotFound88100True()  throws CFException{  			
    	work.setTableKeyNotFound88100True();
   	}
	/**
	 *	Returns the value of ip00054wEntry
	 *	@return ip00054wEntry
	 */   
	 public Ip00054wEntry getIp00054wEntry(int index) {
   	return ip00054wTable.getIp00054wEntry(index);
   }

    public List<Ip00054wEntry> getIp00054wEntry() {
        return ip00054wTable.getIp00054wEntry();
    }
   /**
	* 	Update Ip00054wEntry with the passed value
	*	@param value
	*/
   public void setIp00054wEntry(int index,char[] value) throws CFException {
      ip00054wTable.setIp00054wEntry((index),value);
   }   


	/**
	 *	Returns the value of ip00054TableEntry
	 *	@return ip00054TableEntry
	 */   
	 public Ip00054TableEntry getIp00054TableEntry() {
   	return ip00054TableEntry;
   }



public void setIp00054wIdx(int ip00054wIdx) { 
    Ip299010Ctx.this.ip00054wIdx = ip00054wIdx;
}

public int getIp00054wIdx() { 
    return Ip299010Ctx.this.ip00054wIdx;
}

        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00054wTable.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public SearchTableIp0005t1OutCtx clone() {
        SearchTableIp0005t1OutCtx cloneObj = new SearchTableIp0005t1OutCtx();
        cloneObj.ip00054wTable = new Ip00054wTable();
        cloneObj.ip00054wTable.set(ip00054wTable.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public SearchTableIp0005t1OutCtx getSearchTableIp0005t1OutCtx() {
            return new SearchTableIp0005t1OutCtx();
    }
     public class AbendForTblAbsentInCtx implements Cloneable {
     TblEntryNotFoundMsg650 tblEntryNotFoundMsg650 = Ip299010Ctx.this.getTblEntryNotFoundMsg650();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip299010Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Returns the value of tblEntryNotFoundMsg650
	 *	@return tblEntryNotFoundMsg650
	 */   
	 public TblEntryNotFoundMsg650 getTblEntryNotFoundMsg650() {
   	return tblEntryNotFoundMsg650;
   }


	/**
	 *	Returns the value of tblEntryAbendCode300
	 *	@return tblEntryAbendCode300
	 */
   public char[] getTblEntryAbendCode300() throws CFException  {              
   		return work.getTblEntryAbendCode300();
   }

  
	/**
	*  set variable tblEntryAbendCode300
	*  @param value
	**/
   public void setTblEntryAbendCode300(char[] value) throws CFException {
      work.setTblEntryAbendCode300(value);
   } 

	/**
	 *	Returns the value of para2210300
	 *	@return para2210300
	 */
   public char[] getPara2210300() throws CFException  {              
   		return work.getPara2210300();
   }

  
	/**
	*  set variable para2210300
	*  @param value
	**/
   public void setPara2210300(char[] value) throws CFException {
      work.setPara2210300(value);
   } 

	/**
	 *	Returns the value of tableId800
	 *	@return tableId800
	 */
   public char[] getTableId800() throws CFException  {              
   		return table5Key1800.getTableId800();
   }

  
	/**
	*  set variable tableId800
	*  @param value
	**/
   public void setTableId800(char[] value) throws CFException {
      table5Key1800.setTableId800(value);
   } 

     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex) throws CFException {
      table5Key1800.setTableId800(source, sourceIndex);
   	
   }
   
   public void setTableId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId800 with another Field
	 *	@param value
	 */
   public void setTableId800(Field source) {
      table5Key1800.setTableId800(source);
   }  
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00054ReloadDtTm
	 *	@return ip00054ReloadDtTm
	 */
   public char[] getIp00054ReloadDtTm() throws CFException  {              
   		return ip00054TableEntry.getIp00054ReloadDtTm();
   }

  
	/**
	*  set variable ip00054ReloadDtTm
	*  @param value
	**/
   public void setIp00054ReloadDtTm(char[] value) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(value);
   } 

     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex);
   	
   }
   
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054ReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source) {
      ip00054TableEntry.setIp00054ReloadDtTm(source);
   }  
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public AbendForTblAbsentOutCtx getAbendForTblAbsentOutCtx() {
            return new AbendForTblAbsentOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tblEntryNotFoundMsg650.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += ip00054TableEntry.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public AbendForTblAbsentInCtx clone() {
        AbendForTblAbsentInCtx cloneObj = new AbendForTblAbsentInCtx();
        cloneObj.tblEntryNotFoundMsg650 = new TblEntryNotFoundMsg650();
        cloneObj.tblEntryNotFoundMsg650.set(tblEntryNotFoundMsg650.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public AbendForTblAbsentInCtx getAbendForTblAbsentInCtx() {
            return new AbendForTblAbsentInCtx();
    }
     public class AbendForTblAbsentOutCtx implements Cloneable {
     TblEntryNotFoundMsg650 tblEntryNotFoundMsg650 = Ip299010Ctx.this.getTblEntryNotFoundMsg650();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip299010Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     Ip00054TableEntry ip00054TableEntry = Ip299010Ctx.this.getIp00054TableEntry();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();
     Work work = Ip299010Ctx.this.getWork();
     Table5Key1800 table5Key1800 = Ip299010Ctx.this.getTable5Key1800();

	/**
	 *	Returns the value of tblEntryNotFoundMsg650
	 *	@return tblEntryNotFoundMsg650
	 */   
	 public TblEntryNotFoundMsg650 getTblEntryNotFoundMsg650() {
   	return tblEntryNotFoundMsg650;
   }


	/**
	 *	Returns the value of tblEntryAbendCode300
	 *	@return tblEntryAbendCode300
	 */
   public char[] getTblEntryAbendCode300() throws CFException  {              
   		return work.getTblEntryAbendCode300();
   }

  
	/**
	*  set variable tblEntryAbendCode300
	*  @param value
	**/
   public void setTblEntryAbendCode300(char[] value) throws CFException {
      work.setTblEntryAbendCode300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para2210300
	 *	@return para2210300
	 */
   public char[] getPara2210300() throws CFException  {              
   		return work.getPara2210300();
   }

  
	/**
	*  set variable para2210300
	*  @param value
	**/
   public void setPara2210300(char[] value) throws CFException {
      work.setPara2210300(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorMsg
	 *	@return ip60001EventErrorMsg
	 */
   public char[] getIp60001EventErrorMsg() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorMsg();
   }

  
	/**
	*  set variable ip60001EventErrorMsg
	*  @param value
	**/
   public void setIp60001EventErrorMsg(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(value);
   } 

     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorMsg with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableId800
	 *	@return tableId800
	 */
   public char[] getTableId800() throws CFException  {              
   		return table5Key1800.getTableId800();
   }

  
	/**
	*  set variable tableId800
	*  @param value
	**/
   public void setTableId800(char[] value) throws CFException {
      table5Key1800.setTableId800(value);
   } 

     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex) throws CFException {
      table5Key1800.setTableId800(source, sourceIndex);
   	
   }
   
   public void setTableId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId800 with another Field
	 *	@param value
	 */
   public void setTableId800(Field source) {
      table5Key1800.setTableId800(source);
   }  
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      table5Key1800.setTableId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorCode
	 *	@return ip60001EventErrorCode
	 */
   public char[] getIp60001EventErrorCode() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorCode();
   }

  
	/**
	*  set variable ip60001EventErrorCode
	*  @param value
	**/
   public void setIp60001EventErrorCode(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(value);
   } 

     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorCode with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableId650
	 *	@return tableId650
	 */
   public char[] getTableId650() throws CFException  {              
   		return tblEntryNotFoundMsg650.getTableId650();
   }

  
	/**
	*  set variable tableId650
	*  @param value
	**/
   public void setTableId650(char[] value) throws CFException {
      tblEntryNotFoundMsg650.setTableId650(value);
   } 

     /**
	 * 	Update TableId650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId650(char[] source, int sourceIndex) throws CFException {
      tblEntryNotFoundMsg650.setTableId650(source, sourceIndex);
   	
   }
   
   public void setTableId650(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tblEntryNotFoundMsg650.setTableId650(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tblEntryNotFoundMsg650.setTableId650(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId650 with another Field
	 *	@param value
	 */
   public void setTableId650(Field source) {
      tblEntryNotFoundMsg650.setTableId650(source);
   }  
   
     /**
	 * 	Update TableId650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId650(Field source, int sourceIndex,int sourceLen) {
      tblEntryNotFoundMsg650.setTableId650(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tblEntryNotFoundMsg650.setTableId650(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of effDtTm650
	 *	@return effDtTm650
	 */
   public char[] getEffDtTm650() throws CFException  {              
   		return tblEntryNotFoundMsg650.getEffDtTm650();
   }

  
	/**
	*  set variable effDtTm650
	*  @param value
	**/
   public void setEffDtTm650(char[] value) throws CFException {
      tblEntryNotFoundMsg650.setEffDtTm650(value);
   } 

     /**
	 * 	Update EffDtTm650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffDtTm650(char[] source, int sourceIndex) throws CFException {
      tblEntryNotFoundMsg650.setEffDtTm650(source, sourceIndex);
   	
   }
   
   public void setEffDtTm650(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tblEntryNotFoundMsg650.setEffDtTm650(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EffDtTm650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffDtTm650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tblEntryNotFoundMsg650.setEffDtTm650(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EffDtTm650 with another Field
	 *	@param value
	 */
   public void setEffDtTm650(Field source) {
      tblEntryNotFoundMsg650.setEffDtTm650(source);
   }  
   
     /**
	 * 	Update EffDtTm650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffDtTm650(Field source, int sourceIndex,int sourceLen) {
      tblEntryNotFoundMsg650.setEffDtTm650(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EffDtTm650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffDtTm650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tblEntryNotFoundMsg650.setEffDtTm650(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00054ReloadDtTm
	 *	@return ip00054ReloadDtTm
	 */
   public char[] getIp00054ReloadDtTm() throws CFException  {              
   		return ip00054TableEntry.getIp00054ReloadDtTm();
   }

  
	/**
	*  set variable ip00054ReloadDtTm
	*  @param value
	**/
   public void setIp00054ReloadDtTm(char[] value) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(value);
   } 

     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex) throws CFException {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex);
   	
   }
   
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00054ReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source) {
      ip00054TableEntry.setIp00054ReloadDtTm(source);
   }  
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00054TableEntry.setIp00054ReloadDtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tblEntryNotFoundMsg650.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += ip00054TableEntry.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += table5Key1800.hashCode();
       return str.hashCode();
    }

    public AbendForTblAbsentOutCtx clone() {
        AbendForTblAbsentOutCtx cloneObj = new AbendForTblAbsentOutCtx();
        cloneObj.tblEntryNotFoundMsg650 = new TblEntryNotFoundMsg650();
        cloneObj.tblEntryNotFoundMsg650.set(tblEntryNotFoundMsg650.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.table5Key1800 = new Table5Key1800();
        cloneObj.table5Key1800.set(table5Key1800.getClonedField());
        return cloneObj;
    }

    }

    public AbendForTblAbsentOutCtx getAbendForTblAbsentOutCtx() {
            return new AbendForTblAbsentOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip299010Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }



        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }

        public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip299010Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Ip299010Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip299010Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorMsg
	 *	@return ip60001EventErrorMsg
	 */
   public char[] getIp60001EventErrorMsg() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorMsg();
   }

  
	/**
	*  set variable ip60001EventErrorMsg
	*  @param value
	**/
   public void setIp60001EventErrorMsg(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(value);
   } 

     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorMsg with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorCode
	 *	@return ip60001EventErrorCode
	 */
   public char[] getIp60001EventErrorCode() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorCode();
   }

  
	/**
	*  set variable ip60001EventErrorCode
	*  @param value
	**/
   public void setIp60001EventErrorCode(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(value);
   } 

     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorCode with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip299010Ctx getIp299010Ctx() {
            return Ip299010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
}
