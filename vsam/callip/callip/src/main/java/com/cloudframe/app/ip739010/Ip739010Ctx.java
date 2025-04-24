package com.cloudframe.app.ip739010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrRow;
import com.cloudframe.app.ip739010.dto.RowsLoadedMessage630;
import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.ip739010.dto.TableOverflowError600;
import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
import com.cloudframe.app.ip739010.dto.RecNotFoundMsg610;
import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrRow;
import com.cloudframe.app.ip739010.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip000604DeAttrRow;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.ip739010.dto.TableIntegrityError640;
import com.cloudframe.app.ip739010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.ip739010.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrTable;


@Context
public class Ip739010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    AbendParaName900 abendParaName900;
    Ip000704DeSubAttrTable ip000704DeSubAttrTable;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip000604DeAttrTable ip000604DeAttrTable;
    TableIntegrityError640 tableIntegrityError640;
    RowsLoadedMessage630 rowsLoadedMessage630;
    Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup;
    Ip00060aDeAttrTable ip00060aDeAttrTable;
    TableOverflowError600 tableOverflowError600;
    Work work;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip00054TableEntry ip00054TableEntry;
    Ip50005OneDayRec ip50005OneDayRec;
    RecNotFoundMsg610 recNotFoundMsg610;
    AbendMessage900 abendMessage900;

    int ip000704I;
    int ip00060aI;
    int ip000604I;

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


    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
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
    public Ip000704DeSubAttrTable getIp000704DeSubAttrTable() {
        if (ip000704DeSubAttrTable == null) {
            ip000704DeSubAttrTable = globalCtx.getGlobalDto(Ip000704DeSubAttrTable.class);
        }

        return ip000704DeSubAttrTable;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip000604DeAttrTable getIp000604DeAttrTable() {
        if (ip000604DeAttrTable == null) {
            ip000604DeAttrTable = globalCtx.getGlobalDto(Ip000604DeAttrTable.class);
        }

        return ip000604DeAttrTable;
    }

    public TableIntegrityError640 getTableIntegrityError640() {
        if (tableIntegrityError640 == null) {
            tableIntegrityError640 = new TableIntegrityError640();
        }

        return tableIntegrityError640;
    }

    public void setTableIntegrityError640(TableIntegrityError640 tableIntegrityError640) {
        this.tableIntegrityError640 = tableIntegrityError640;
    }
    public RowsLoadedMessage630 getRowsLoadedMessage630() {
        if (rowsLoadedMessage630 == null) {
            rowsLoadedMessage630 = new RowsLoadedMessage630();
        }

        return rowsLoadedMessage630;
    }

    public void setRowsLoadedMessage630(RowsLoadedMessage630 rowsLoadedMessage630) {
        this.rowsLoadedMessage630 = rowsLoadedMessage630;
    }
    public Ip000608ProcessingDateTimeGroup getIp000608ProcessingDateTimeGroup() {
        if (ip000608ProcessingDateTimeGroup == null) {
            ip000608ProcessingDateTimeGroup = globalCtx.getGlobalDto(Ip000608ProcessingDateTimeGroup.class);
        }

        return ip000608ProcessingDateTimeGroup;
    }

    public Ip00060aDeAttrTable getIp00060aDeAttrTable() {
        if (ip00060aDeAttrTable == null) {
            ip00060aDeAttrTable = globalCtx.getGlobalDto(Ip00060aDeAttrTable.class);
        }

        return ip00060aDeAttrTable;
    }

    public TableOverflowError600 getTableOverflowError600() {
        if (tableOverflowError600 == null) {
            tableOverflowError600 = new TableOverflowError600();
        }

        return tableOverflowError600;
    }

    public void setTableOverflowError600(TableOverflowError600 tableOverflowError600) {
        this.tableOverflowError600 = tableOverflowError600;
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
    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip00054TableEntry getIp00054TableEntry() {
        if (ip00054TableEntry == null) {
            ip00054TableEntry = globalCtx.getGlobalDto(Ip00054TableEntry.class);
        }

        return ip00054TableEntry;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public RecNotFoundMsg610 getRecNotFoundMsg610() {
        if (recNotFoundMsg610 == null) {
            recNotFoundMsg610 = new RecNotFoundMsg610();
        }

        return recNotFoundMsg610;
    }

    public void setRecNotFoundMsg610(RecNotFoundMsg610 recNotFoundMsg610) {
        this.recNotFoundMsg610 = recNotFoundMsg610;
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

    public int getIp000704I() {
        return ip000704I;
    }

    public void setIp000704I(int ip000704I) {
        this.ip000704I = ip000704I;
    }
    public int getIp00060aI() {
        return ip00060aI;
    }

    public void setIp00060aI(int ip00060aI) {
        this.ip00060aI = ip00060aI;
    }
    public int getIp000604I() {
        return ip000604I;
    }

    public void setIp000604I(int ip000604I) {
        this.ip000604I = ip000604I;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendParaName900.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += tableIntegrityError640.hashCode();
        str += rowsLoadedMessage630.hashCode();
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += ip00060aDeAttrTable.hashCode();
        str += tableOverflowError600.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip00054TableEntry.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public Ip739010Ctx clone() {
        Ip739010Ctx cloneObj = new Ip739010Ctx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Returns the value of clearingDtTm800
	 *	@return clearingDtTm800
	 */
   public char[] getClearingDtTm800() throws CFException  {              
   		return work.getClearingDtTm800();
   }

  
	/**
	*  set variable clearingDtTm800
	*  @param value
	**/
   public void setClearingDtTm800(char[] value) throws CFException {
      work.setClearingDtTm800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Returns the value of clearingDtTm800
	 *	@return clearingDtTm800
	 */
   public char[] getClearingDtTm800() throws CFException  {              
   		return work.getClearingDtTm800();
   }

  
	/**
	*  set variable clearingDtTm800
	*  @param value
	**/
   public void setClearingDtTm800(char[] value) throws CFException {
      work.setClearingDtTm800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitializationInCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp299010300
	 *	@return pgmIp299010300
	 */
   public char[] getPgmIp299010300() throws CFException  {              
   		return work.getPgmIp299010300();
   }

  
	/**
	*  set variable pgmIp299010300
	*  @param value
	**/
   public void setPgmIp299010300(char[] value) throws CFException {
      work.setPgmIp299010300(value);
   } 

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

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializationInCtx clone() {
        InitializationInCtx cloneObj = new InitializationInCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationInCtx getInitializationInCtx() {
            return new InitializationInCtx();
    }
     public class InitializationOutCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Test condition "N" for isT7NotLoaded88100()
	 *	@return  Returns true if isT7NotLoaded88100() is "N"
	 */
   public boolean isT7NotLoaded88100() throws CFException {
      return work.isT7NotLoaded88100();
   }

	/**
	*  set values "N"
	*/
   	public void setT7NotLoaded88100True()  throws CFException{  			
    	work.setT7NotLoaded88100True();
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
	 *	Returns the value of currentDateTime800
	 *	@return currentDateTime800
	 */
   public char[] getCurrentDateTime800() throws CFException  {              
   		return work.getCurrentDateTime800();
   }

  
	/**
	*  set variable currentDateTime800
	*  @param value
	**/
   public void setCurrentDateTime800(char[] value) throws CFException {
      work.setCurrentDateTime800(value);
   } 

	/**
	 *	Test condition "N" for isT6NotLoaded88100()
	 *	@return  Returns true if isT6NotLoaded88100() is "N"
	 */
   public boolean isT6NotLoaded88100() throws CFException {
      return work.isT6NotLoaded88100();
   }

	/**
	*  set values "N"
	*/
   	public void setT6NotLoaded88100True()  throws CFException{  			
    	work.setT6NotLoaded88100True();
   	}
	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp299010800
	 *	@return ptrIp299010800
	 */
   public char[] getPtrIp299010800() throws CFException  {              
   		return work.getPtrIp299010800();
   }

  
	/**
	*  set variable ptrIp299010800
	*  @param value
	**/
   public void setPtrIp299010800(char[] value) throws CFException {
      work.setPtrIp299010800(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializationOutCtx clone() {
        InitializationOutCtx cloneObj = new InitializationOutCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
    }
     public class LoadTablesIfNeededInCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isT6WasLoaded88100()
	 *	@return  Returns true if isT6WasLoaded88100() is "Y"
	 */
   public boolean isT6WasLoaded88100() throws CFException {
      return work.isT6WasLoaded88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setT6WasLoaded88100True()  throws CFException{  			
    	work.setT6WasLoaded88100True();
   	}
	/**
	 *	Test condition "Y" for isT7WasLoaded88100()
	 *	@return  Returns true if isT7WasLoaded88100() is "Y"
	 */
   public boolean isT7WasLoaded88100() throws CFException {
      return work.isT7WasLoaded88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setT7WasLoaded88100True()  throws CFException{  			
    	work.setT7WasLoaded88100True();
   	}

        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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

    public LoadTablesIfNeededInCtx clone() {
        LoadTablesIfNeededInCtx cloneObj = new LoadTablesIfNeededInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTablesIfNeededInCtx getLoadTablesIfNeededInCtx() {
            return new LoadTablesIfNeededInCtx();
    }
     public class LoadTable6IfNeededInCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

	/**
	 *	Returns the value of table6Id300
	 *	@return table6Id300
	 */
   public char[] getTable6Id300() throws CFException  {              
   		return work.getTable6Id300();
   }

  
	/**
	*  set variable table6Id300
	*  @param value
	**/
   public void setTable6Id300(char[] value) throws CFException {
      work.setTable6Id300(value);
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

	/**
	 *	Returns the value of lastKeyDtTmT6800
	 *	@return lastKeyDtTmT6800
	 */
   public char[] getLastKeyDtTmT6800() throws CFException  {              
   		return work.getLastKeyDtTmT6800();
   }

  
	/**
	*  set variable lastKeyDtTmT6800
	*  @param value
	**/
   public void setLastKeyDtTmT6800(char[] value) throws CFException {
      work.setLastKeyDtTmT6800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public LoadTable6IfNeededOutCtx getLoadTable6IfNeededOutCtx() {
            return new LoadTable6IfNeededOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable6IfNeededInCtx clone() {
        LoadTable6IfNeededInCtx cloneObj = new LoadTable6IfNeededInCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6IfNeededInCtx getLoadTable6IfNeededInCtx() {
            return new LoadTable6IfNeededInCtx();
    }
     public class LoadTable6IfNeededOutCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

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
	 *	Test condition "Y" for isT6WasLoaded88100()
	 *	@return  Returns true if isT6WasLoaded88100() is "Y"
	 */
   public boolean isT6WasLoaded88100() throws CFException {
      return work.isT6WasLoaded88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setT6WasLoaded88100True()  throws CFException{  			
    	work.setT6WasLoaded88100True();
   	}
	/**
	 *	Returns the value of table6Id300
	 *	@return table6Id300
	 */
   public char[] getTable6Id300() throws CFException  {              
   		return work.getTable6Id300();
   }

  
	/**
	*  set variable table6Id300
	*  @param value
	**/
   public void setTable6Id300(char[] value) throws CFException {
      work.setTable6Id300(value);
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

	/**
	 *	Returns the value of lastKeyDtTmT6800
	 *	@return lastKeyDtTmT6800
	 */
   public char[] getLastKeyDtTmT6800() throws CFException  {              
   		return work.getLastKeyDtTmT6800();
   }

  
	/**
	*  set variable lastKeyDtTmT6800
	*  @param value
	**/
   public void setLastKeyDtTmT6800(char[] value) throws CFException {
      work.setLastKeyDtTmT6800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable6IfNeededOutCtx clone() {
        LoadTable6IfNeededOutCtx cloneObj = new LoadTable6IfNeededOutCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6IfNeededOutCtx getLoadTable6IfNeededOutCtx() {
            return new LoadTable6IfNeededOutCtx();
    }
     public class LoadTable6InCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

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
	 *	Returns the value of ip000604DeAttrRow
	 *	@return ip000604DeAttrRow
	 */   
	 public Ip000604DeAttrRow getIp000604DeAttrRow(int index) {
   	return ip000604DeAttrTable.getIp000604DeAttrRow(index);
   }

    public List<Ip000604DeAttrRow> getIp000604DeAttrRow() {
        return ip000604DeAttrTable.getIp000604DeAttrRow();
    }
   /**
	* 	Update Ip000604DeAttrRow with the passed value
	*	@param value
	*/
   public void setIp000604DeAttrRow(int index,char[] value) throws CFException {
      ip000604DeAttrTable.setIp000604DeAttrRow((index),value);
   }   


	/**
	 *	Returns the value of table6Id300
	 *	@return table6Id300
	 */
   public char[] getTable6Id300() throws CFException  {              
   		return work.getTable6Id300();
   }

  
	/**
	*  set variable table6Id300
	*  @param value
	**/
   public void setTable6Id300(char[] value) throws CFException {
      work.setTable6Id300(value);
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

	/**
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}


	/**
	 *	Returns the value of ip000604DeAttrTable
	 *	@return ip000604DeAttrTable
	 */   
	 public Ip000604DeAttrTable getIp000604DeAttrTable() {
   	return ip000604DeAttrTable;
   }



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public LoadTable6OutCtx getLoadTable6OutCtx() {
            return new LoadTable6OutCtx();
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public LoadTable6InCtx clone() {
        LoadTable6InCtx cloneObj = new LoadTable6InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6InCtx getLoadTable6InCtx() {
            return new LoadTable6InCtx();
    }
     public class LoadTable6OutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

	/**
	 *	Returns the value of maxT6RowNo800
	 *	@return maxT6RowNo800
	 */
	public int getMaxT6RowNo800() throws CFException {        
   		return work.getMaxT6RowNo800();
	}
	
	/**
	 * 	Update MaxT6RowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT6RowNo800(int number)  throws CFException{
		work.setMaxT6RowNo800(number);
	}


	public void setMaxT6RowNo800(long number)  throws CFException{
		work.setMaxT6RowNo800((int)number);
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
	 *	Returns the value of table6Id300
	 *	@return table6Id300
	 */
   public char[] getTable6Id300() throws CFException  {              
   		return work.getTable6Id300();
   }

  
	/**
	*  set variable table6Id300
	*  @param value
	**/
   public void setTable6Id300(char[] value) throws CFException {
      work.setTable6Id300(value);
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
	 *	Returns the value of tableMaxLength800
	 *	@return tableMaxLength800
	 */
	public int getTableMaxLength800() throws CFException {        
   		return work.getTableMaxLength800();
	}
	
	/**
	 * 	Update TableMaxLength800 with the passed value
	 *	@param number
	 */
	public void setTableMaxLength800(int number)  throws CFException{
		work.setTableMaxLength800(number);
	}


	public void setTableMaxLength800(long number)  throws CFException{
		work.setTableMaxLength800((int)number);
	}


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
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable6OutCtx clone() {
        LoadTable6OutCtx cloneObj = new LoadTable6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6OutCtx getLoadTable6OutCtx() {
            return new LoadTable6OutCtx();
    }
     public class MoveToTable6InCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

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
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
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



	/**
	 *	Returns the value of ip000604DeAttrTable
	 *	@return ip000604DeAttrTable
	 */   
	 public Ip000604DeAttrTable getIp000604DeAttrTable() {
   	return ip000604DeAttrTable;
   }



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public MoveToTable6OutCtx getMoveToTable6OutCtx() {
            return new MoveToTable6OutCtx();
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
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public MoveToTable6InCtx clone() {
        MoveToTable6InCtx cloneObj = new MoveToTable6InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable6InCtx getMoveToTable6InCtx() {
            return new MoveToTable6InCtx();
    }
     public class MoveToTable6OutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

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



	/**
	 *	Returns the value of ip000604DeAttrTable
	 *	@return ip000604DeAttrTable
	 */   
	 public Ip000604DeAttrTable getIp000604DeAttrTable() {
   	return ip000604DeAttrTable;
   }



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public MoveToTable6OutCtx clone() {
        MoveToTable6OutCtx cloneObj = new MoveToTable6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable6OutCtx getMoveToTable6OutCtx() {
            return new MoveToTable6OutCtx();
    }
     public class LoadTable6aInCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

	/**
	 *	Returns the value of table6aId300
	 *	@return table6aId300
	 */
   public char[] getTable6aId300() throws CFException  {              
   		return work.getTable6aId300();
   }

  
	/**
	*  set variable table6aId300
	*  @param value
	**/
   public void setTable6aId300(char[] value) throws CFException {
      work.setTable6aId300(value);
   } 

	/**
	 *	Returns the value of ip00060aDeAttrRow
	 *	@return ip00060aDeAttrRow
	 */   
	 public Ip00060aDeAttrRow getIp00060aDeAttrRow(int index) {
   	return ip00060aDeAttrTable.getIp00060aDeAttrRow(index);
   }

    public List<Ip00060aDeAttrRow> getIp00060aDeAttrRow() {
        return ip00060aDeAttrTable.getIp00060aDeAttrRow();
    }
   /**
	* 	Update Ip00060aDeAttrRow with the passed value
	*	@param value
	*/
   public void setIp00060aDeAttrRow(int index,char[] value) throws CFException {
      ip00060aDeAttrTable.setIp00060aDeAttrRow((index),value);
   }   


	/**
	 *	Returns the value of ip00060aDeAttrTable
	 *	@return ip00060aDeAttrTable
	 */   
	 public Ip00060aDeAttrTable getIp00060aDeAttrTable() {
   	return ip00060aDeAttrTable;
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


	/**
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public LoadTable6aOutCtx getLoadTable6aOutCtx() {
            return new LoadTable6aOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable6aInCtx clone() {
        LoadTable6aInCtx cloneObj = new LoadTable6aInCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6aInCtx getLoadTable6aInCtx() {
            return new LoadTable6aInCtx();
    }
     public class LoadTable6aOutCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

	/**
	 *	Returns the value of table6aId300
	 *	@return table6aId300
	 */
   public char[] getTable6aId300() throws CFException  {              
   		return work.getTable6aId300();
   }

  
	/**
	*  set variable table6aId300
	*  @param value
	**/
   public void setTable6aId300(char[] value) throws CFException {
      work.setTable6aId300(value);
   } 

	/**
	 *	Returns the value of lastKeyDtTmT6a800
	 *	@return lastKeyDtTmT6a800
	 */
   public char[] getLastKeyDtTmT6a800() throws CFException  {              
   		return work.getLastKeyDtTmT6a800();
   }

  
	/**
	*  set variable lastKeyDtTmT6a800
	*  @param value
	**/
   public void setLastKeyDtTmT6a800(char[] value) throws CFException {
      work.setLastKeyDtTmT6a800(value);
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


	/**
	 *	Test condition new byte[] {(byte)0xFF} " " for isIp00060aUndefinedDe()
	 *	@return  Returns true if isIp00060aUndefinedDe() is new byte[] {(byte)0xFF} " "
	 */
   public boolean isIp00060aUndefinedDe(int index) throws CFException {
      return ip00060aDeAttrTable.getIp00060aDeAttrRow(index).isIp00060aUndefinedDe();
   }

	/**
	*  set values new byte[] {(byte)0xFF} " "
	*/
   	public void setIp00060aUndefinedDeTrue(int index)  throws CFException{  			
    	ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aUndefinedDeTrue();
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
	 *	Returns the value of tableMaxLength800
	 *	@return tableMaxLength800
	 */
	public int getTableMaxLength800() throws CFException {        
   		return work.getTableMaxLength800();
	}
	
	/**
	 * 	Update TableMaxLength800 with the passed value
	 *	@param number
	 */
	public void setTableMaxLength800(int number)  throws CFException{
		work.setTableMaxLength800(number);
	}


	public void setTableMaxLength800(long number)  throws CFException{
		work.setTableMaxLength800((int)number);
	}


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
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}


	/**
	 *	Returns the value of maxT6aRowNo800
	 *	@return maxT6aRowNo800
	 */
	public int getMaxT6aRowNo800() throws CFException {        
   		return work.getMaxT6aRowNo800();
	}
	
	/**
	 * 	Update MaxT6aRowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT6aRowNo800(int number)  throws CFException{
		work.setMaxT6aRowNo800(number);
	}


	public void setMaxT6aRowNo800(long number)  throws CFException{
		work.setMaxT6aRowNo800((int)number);
	}



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable6aOutCtx clone() {
        LoadTable6aOutCtx cloneObj = new LoadTable6aOutCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable6aOutCtx getLoadTable6aOutCtx() {
            return new LoadTable6aOutCtx();
    }
     public class MoveToTable6aInCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

	/**
	 *	Returns the value of ip00060aDeAttrTable
	 *	@return ip00060aDeAttrTable
	 */   
	 public Ip00060aDeAttrTable getIp00060aDeAttrTable() {
   	return ip00060aDeAttrTable;
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
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
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




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public MoveToTable6aOutCtx getMoveToTable6aOutCtx() {
            return new MoveToTable6aOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public MoveToTable6aInCtx clone() {
        MoveToTable6aInCtx cloneObj = new MoveToTable6aInCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable6aInCtx getMoveToTable6aInCtx() {
            return new MoveToTable6aInCtx();
    }
     public class MoveToTable6aOutCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

	/**
	 *	Returns the value of ip00060aDeAttrTable
	 *	@return ip00060aDeAttrTable
	 */   
	 public Ip00060aDeAttrTable getIp00060aDeAttrTable() {
   	return ip00060aDeAttrTable;
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




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public MoveToTable6aOutCtx clone() {
        MoveToTable6aOutCtx cloneObj = new MoveToTable6aOutCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable6aOutCtx getMoveToTable6aOutCtx() {
            return new MoveToTable6aOutCtx();
    }
     public class LoadTable7IfNeededInCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

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

	/**
	 *	Returns the value of lastKeyDtTmT7800
	 *	@return lastKeyDtTmT7800
	 */
   public char[] getLastKeyDtTmT7800() throws CFException  {              
   		return work.getLastKeyDtTmT7800();
   }

  
	/**
	*  set variable lastKeyDtTmT7800
	*  @param value
	**/
   public void setLastKeyDtTmT7800(char[] value) throws CFException {
      work.setLastKeyDtTmT7800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of table7Id300
	 *	@return table7Id300
	 */
   public char[] getTable7Id300() throws CFException  {              
   		return work.getTable7Id300();
   }

  
	/**
	*  set variable table7Id300
	*  @param value
	**/
   public void setTable7Id300(char[] value) throws CFException {
      work.setTable7Id300(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public LoadTable7IfNeededOutCtx getLoadTable7IfNeededOutCtx() {
            return new LoadTable7IfNeededOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable7IfNeededInCtx clone() {
        LoadTable7IfNeededInCtx cloneObj = new LoadTable7IfNeededInCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable7IfNeededInCtx getLoadTable7IfNeededInCtx() {
            return new LoadTable7IfNeededInCtx();
    }
     public class LoadTable7IfNeededOutCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip739010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip739010Ctx.this.getWork();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

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

	/**
	 *	Returns the value of lastKeyDtTmT7800
	 *	@return lastKeyDtTmT7800
	 */
   public char[] getLastKeyDtTmT7800() throws CFException  {              
   		return work.getLastKeyDtTmT7800();
   }

  
	/**
	*  set variable lastKeyDtTmT7800
	*  @param value
	**/
   public void setLastKeyDtTmT7800(char[] value) throws CFException {
      work.setLastKeyDtTmT7800(value);
   } 

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isT7WasLoaded88100()
	 *	@return  Returns true if isT7WasLoaded88100() is "Y"
	 */
   public boolean isT7WasLoaded88100() throws CFException {
      return work.isT7WasLoaded88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setT7WasLoaded88100True()  throws CFException{  			
    	work.setT7WasLoaded88100True();
   	}
	/**
	 *	Returns the value of table7Id300
	 *	@return table7Id300
	 */
   public char[] getTable7Id300() throws CFException  {              
   		return work.getTable7Id300();
   }

  
	/**
	*  set variable table7Id300
	*  @param value
	**/
   public void setTable7Id300(char[] value) throws CFException {
      work.setTable7Id300(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable7IfNeededOutCtx clone() {
        LoadTable7IfNeededOutCtx cloneObj = new LoadTable7IfNeededOutCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable7IfNeededOutCtx getLoadTable7IfNeededOutCtx() {
            return new LoadTable7IfNeededOutCtx();
    }
     public class LoadTable7InCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

	/**
	 *	Returns the value of ip000704DeSubAttrRow
	 *	@return ip000704DeSubAttrRow
	 */   
	 public Ip000704DeSubAttrRow getIp000704DeSubAttrRow(int index) {
   	return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index);
   }

    public List<Ip000704DeSubAttrRow> getIp000704DeSubAttrRow() {
        return ip000704DeSubAttrTable.getIp000704DeSubAttrRow();
    }
   /**
	* 	Update Ip000704DeSubAttrRow with the passed value
	*	@param value
	*/
   public void setIp000704DeSubAttrRow(int index,char[] value) throws CFException {
      ip000704DeSubAttrTable.setIp000704DeSubAttrRow((index),value);
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

	/**
	 *	Returns the value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public short getIp000704DeSubMax() throws CFException {
   		return work.getIp000704DeSubMax();
	}

    /**
	 *	Returns the String value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public char[]  getIp000704DeSubMaxActualString() {
		return work.getIp000704DeSubMaxActualString();
	}

	/**
	 *	Returns String value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public char[]  getIp000704DeSubMaxString() throws CFException {
	     return String.valueOf(work.getIp000704DeSubMaxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip000704DeSubMaxIsNumeric()  throws CFException{
	    return work.ip000704DeSubMaxIsNumeric();
	}

	/**
	 * 	Update Ip000704DeSubMax with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMax(short number)  throws CFException{
		work.setIp000704DeSubMax(number);
	}
	
	public void setIp000704DeSubMax(int number)  throws CFException{
	    work.setIp000704DeSubMax(number);
	}
	public void setIp000704DeSubMax(long number)  throws CFException{
	    work.setIp000704DeSubMax(number);
	}
	

	
	/**
	 * 	Update Ip000704DeSubMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp000704DeSubMax(char[] value)  throws CFException {
		work.setIp000704DeSubMax(value);
	}
	
	/**
	 * 	Update Ip000704DeSubMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp000704DeSubMaxString(char[] value)  throws CFException{
		work.setIp000704DeSubMax(value);
	}	

	/**
	 *	Returns the value of ip000704DeSubAttrTable
	 *	@return ip000704DeSubAttrTable
	 */   
	 public Ip000704DeSubAttrTable getIp000704DeSubAttrTable() {
   	return ip000704DeSubAttrTable;
   }


	/**
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}


	/**
	 *	Returns the value of table7Id300
	 *	@return table7Id300
	 */
   public char[] getTable7Id300() throws CFException  {              
   		return work.getTable7Id300();
   }

  
	/**
	*  set variable table7Id300
	*  @param value
	**/
   public void setTable7Id300(char[] value) throws CFException {
      work.setTable7Id300(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public LoadTable7OutCtx getLoadTable7OutCtx() {
            return new LoadTable7OutCtx();
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable7InCtx clone() {
        LoadTable7InCtx cloneObj = new LoadTable7InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable7InCtx getLoadTable7InCtx() {
            return new LoadTable7InCtx();
    }
     public class LoadTable7OutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     Ip00054TableEntry ip00054TableEntry = Ip739010Ctx.this.getIp00054TableEntry();

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
	 *	Returns the value of maxT7RowNo800
	 *	@return maxT7RowNo800
	 */
	public int getMaxT7RowNo800() throws CFException {        
   		return work.getMaxT7RowNo800();
	}
	
	/**
	 * 	Update MaxT7RowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT7RowNo800(int number)  throws CFException{
		work.setMaxT7RowNo800(number);
	}


	public void setMaxT7RowNo800(long number)  throws CFException{
		work.setMaxT7RowNo800((int)number);
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


	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000704UndefinedDeSubfld()
	 *	@return  Returns true if isIp000704UndefinedDeSubfld() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000704UndefinedDeSubfld(int index) throws CFException {
      return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).isIp000704UndefinedDeSubfld();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000704UndefinedDeSubfldTrue(int index)  throws CFException{  			
    	ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704UndefinedDeSubfldTrue();
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
	 *	Returns the value of tableMaxLength800
	 *	@return tableMaxLength800
	 */
	public int getTableMaxLength800() throws CFException {        
   		return work.getTableMaxLength800();
	}
	
	/**
	 * 	Update TableMaxLength800 with the passed value
	 *	@param number
	 */
	public void setTableMaxLength800(int number)  throws CFException{
		work.setTableMaxLength800(number);
	}


	public void setTableMaxLength800(long number)  throws CFException{
		work.setTableMaxLength800((int)number);
	}


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
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}


	/**
	 *	Returns the value of table7Id300
	 *	@return table7Id300
	 */
   public char[] getTable7Id300() throws CFException  {              
   		return work.getTable7Id300();
   }

  
	/**
	*  set variable table7Id300
	*  @param value
	**/
   public void setTable7Id300(char[] value) throws CFException {
      work.setTable7Id300(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip00054TableEntry.hashCode();
       return str.hashCode();
    }

    public LoadTable7OutCtx clone() {
        LoadTable7OutCtx cloneObj = new LoadTable7OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable7OutCtx getLoadTable7OutCtx() {
            return new LoadTable7OutCtx();
    }
     public class MoveToTable7InCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

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
	 *	Returns the value of ip000704DeSubAttrTable
	 *	@return ip000704DeSubAttrTable
	 */   
	 public Ip000704DeSubAttrTable getIp000704DeSubAttrTable() {
   	return ip000704DeSubAttrTable;
   }


	/**
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
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




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public MoveToTable7OutCtx getMoveToTable7OutCtx() {
            return new MoveToTable7OutCtx();
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
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public MoveToTable7InCtx clone() {
        MoveToTable7InCtx cloneObj = new MoveToTable7InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable7InCtx getMoveToTable7InCtx() {
            return new MoveToTable7InCtx();
    }
     public class MoveToTable7OutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

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
	 *	Returns the value of ip000704DeSubAttrTable
	 *	@return ip000704DeSubAttrTable
	 */   
	 public Ip000704DeSubAttrTable getIp000704DeSubAttrTable() {
   	return ip000704DeSubAttrTable;
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




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public MoveToTable7OutCtx clone() {
        MoveToTable7OutCtx cloneObj = new MoveToTable7OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable7OutCtx getMoveToTable7OutCtx() {
            return new MoveToTable7OutCtx();
    }
     public class ResolveFirstSubfldPtrsInCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

	/**
	 *	Returns the value of maxT7RowNo800
	 *	@return maxT7RowNo800
	 */
	public int getMaxT7RowNo800() throws CFException {        
   		return work.getMaxT7RowNo800();
	}
	
	/**
	 * 	Update MaxT7RowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT7RowNo800(int number)  throws CFException{
		work.setMaxT7RowNo800(number);
	}


	public void setMaxT7RowNo800(long number)  throws CFException{
		work.setMaxT7RowNo800((int)number);
	}



public void setIp000604I(int ip000604I) { 
    Ip739010Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip739010Ctx.this.ip000604I;
}
	/**
	 *	Returns the value of currentDeNo800
	 *	@return currentDeNo800
	 */
	public int getCurrentDeNo800() throws CFException {        
   		return work.getCurrentDeNo800();
	}
	
	/**
	 * 	Update CurrentDeNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentDeNo800(int number)  throws CFException{
		work.setCurrentDeNo800(number);
	}


	public void setCurrentDeNo800(long number)  throws CFException{
		work.setCurrentDeNo800((int)number);
	}



public void setIp000704I(int ip000704I) { 
    Ip739010Ctx.this.ip000704I = ip000704I;
}

public int getIp000704I() { 
    return Ip739010Ctx.this.ip000704I;
}
	/**
	 *	Returns the value of ip000704DeNo
	 *	@return ip000704DeNo
	 */
	public short getIp000704DeNo(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeNo();
	}
	
	/**
	 * 	Update Ip000704DeNo with the passed value
	 *	@param number
	 */
	public void setIp000704DeNo(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo(number);
	}

	public void setIp000704DeNo(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo((short)number);
	}

	public void setIp000704DeNo(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo((short)number);
	}




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public ResolveFirstSubfldPtrsOutCtx getResolveFirstSubfldPtrsOutCtx() {
            return new ResolveFirstSubfldPtrsOutCtx();
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
        str += ip000704DeSubAttrTable.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public ResolveFirstSubfldPtrsInCtx clone() {
        ResolveFirstSubfldPtrsInCtx cloneObj = new ResolveFirstSubfldPtrsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public ResolveFirstSubfldPtrsInCtx getResolveFirstSubfldPtrsInCtx() {
            return new ResolveFirstSubfldPtrsInCtx();
    }
     public class ResolveFirstSubfldPtrsOutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip739010Ctx.this.getIp000704DeSubAttrTable();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();


public void setIp000604I(int ip000604I) { 
    Ip739010Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip739010Ctx.this.ip000604I;
}
	/**
	 *	Returns the value of currentDeNo800
	 *	@return currentDeNo800
	 */
	public int getCurrentDeNo800() throws CFException {        
   		return work.getCurrentDeNo800();
	}
	
	/**
	 * 	Update CurrentDeNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentDeNo800(int number)  throws CFException{
		work.setCurrentDeNo800(number);
	}


	public void setCurrentDeNo800(long number)  throws CFException{
		work.setCurrentDeNo800((int)number);
	}


	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000604NoDeSubflds88()
	 *	@return  Returns true if isIp000604NoDeSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000604NoDeSubflds88(int index) throws CFException {
      return ip000604DeAttrTable.getIp000604DeAttrRow(index).isIp000604NoDeSubflds88();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000604NoDeSubflds88True(int index)  throws CFException{  			
    	ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604NoDeSubflds88True();
   	}
	/**
	 *	Returns the value of ip000604DeFirstSubfld
	 *	@return ip000604DeFirstSubfld
	 */
	public int getIp000604DeFirstSubfld(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeFirstSubfld();
	}
	
	/**
	 * 	Update Ip000604DeFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp000604DeFirstSubfld(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstSubfld(number);
	}


	public void setIp000604DeFirstSubfld(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstSubfld((int)number);
	}



public void setIp000704I(int ip000704I) { 
    Ip739010Ctx.this.ip000704I = ip000704I;
}

public int getIp000704I() { 
    return Ip739010Ctx.this.ip000704I;
}
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000604NoAbValues88()
	 *	@return  Returns true if isIp000604NoAbValues88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000604NoAbValues88(int index) throws CFException {
      return ip000604DeAttrTable.getIp000604DeAttrRow(index).isIp000604NoAbValues88();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000604NoAbValues88True(int index)  throws CFException{  			
    	ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604NoAbValues88True();
   	}
	/**
	 *	Returns the value of ip000704DeNo
	 *	@return ip000704DeNo
	 */
	public short getIp000704DeNo(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeNo();
	}
	
	/**
	 * 	Update Ip000704DeNo with the passed value
	 *	@param number
	 */
	public void setIp000704DeNo(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo(number);
	}

	public void setIp000704DeNo(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo((short)number);
	}

	public void setIp000704DeNo(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeNo((short)number);
	}




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip000704DeSubAttrTable.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public ResolveFirstSubfldPtrsOutCtx clone() {
        ResolveFirstSubfldPtrsOutCtx cloneObj = new ResolveFirstSubfldPtrsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public ResolveFirstSubfldPtrsOutCtx getResolveFirstSubfldPtrsOutCtx() {
            return new ResolveFirstSubfldPtrsOutCtx();
    }
     public class ResolveAccBrandPtrsInCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

	/**
	 *	Returns the value of currentDeNo800
	 *	@return currentDeNo800
	 */
	public int getCurrentDeNo800() throws CFException {        
   		return work.getCurrentDeNo800();
	}
	
	/**
	 * 	Update CurrentDeNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentDeNo800(int number)  throws CFException{
		work.setCurrentDeNo800(number);
	}


	public void setCurrentDeNo800(long number)  throws CFException{
		work.setCurrentDeNo800((int)number);
	}


	/**
	 *	Returns the value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public int getIp00060aDeNo(int index) throws CFException {
   		return ip00060aDeAttrTable.getIp00060aDeAttrRow(index).getIp00060aDeNo();
	}


	/**
	 *	Returns String value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public char[]  getIp00060aDeNoString(int index) throws CFException {
	     return String.valueOf(ip00060aDeAttrTable.getIp00060aDeAttrRow(index).getIp00060aDeNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00060aDeNoIsNumeric(int index)  throws CFException{
	    return ip00060aDeAttrTable.getIp00060aDeAttrRow(index - 1).ip00060aDeNoIsNumeric();
	}

	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *	@param number
	 */
	public void setIp00060aDeNo(int index,int number)  throws CFException{
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(number);
	}
	

	public void setIp00060aDeNo(int index,long number)  throws CFException{
	    ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(number);
	}
	
	
	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNo(int index,char[] value)  throws CFException {
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(value);
	}
	
	/**
	 * 	Update Ip00060aDeNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNoString(int index,char[] value)  throws CFException{
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(value);
	}	


public void setIp00060aI(int ip00060aI) { 
    Ip739010Ctx.this.ip00060aI = ip00060aI;
}

public int getIp00060aI() { 
    return Ip739010Ctx.this.ip00060aI;
}
	/**
	 *	Returns the value of maxT6aRowNo800
	 *	@return maxT6aRowNo800
	 */
	public int getMaxT6aRowNo800() throws CFException {        
   		return work.getMaxT6aRowNo800();
	}
	
	/**
	 * 	Update MaxT6aRowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT6aRowNo800(int number)  throws CFException{
		work.setMaxT6aRowNo800(number);
	}


	public void setMaxT6aRowNo800(long number)  throws CFException{
		work.setMaxT6aRowNo800((int)number);
	}



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public ResolveAccBrandPtrsOutCtx getResolveAccBrandPtrsOutCtx() {
            return new ResolveAccBrandPtrsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public ResolveAccBrandPtrsInCtx clone() {
        ResolveAccBrandPtrsInCtx cloneObj = new ResolveAccBrandPtrsInCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public ResolveAccBrandPtrsInCtx getResolveAccBrandPtrsInCtx() {
            return new ResolveAccBrandPtrsInCtx();
    }
     public class ResolveAccBrandPtrsOutCtx implements Cloneable {
     Ip00060aDeAttrTable ip00060aDeAttrTable = Ip739010Ctx.this.getIp00060aDeAttrTable();
     Work work = Ip739010Ctx.this.getWork();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip739010Ctx.this.getIp000604DeAttrTable();

	/**
	 *	Returns the value of ip000604DeFirstAb
	 *	@return ip000604DeFirstAb
	 */
	public int getIp000604DeFirstAb(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeFirstAb();
	}
	
	/**
	 * 	Update Ip000604DeFirstAb with the passed value
	 *	@param number
	 */
	public void setIp000604DeFirstAb(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstAb(number);
	}


	public void setIp000604DeFirstAb(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstAb((int)number);
	}


	/**
	 *	Returns the value of currentDeNo800
	 *	@return currentDeNo800
	 */
	public int getCurrentDeNo800() throws CFException {        
   		return work.getCurrentDeNo800();
	}
	
	/**
	 * 	Update CurrentDeNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentDeNo800(int number)  throws CFException{
		work.setCurrentDeNo800(number);
	}


	public void setCurrentDeNo800(long number)  throws CFException{
		work.setCurrentDeNo800((int)number);
	}


	/**
	 *	Returns the value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public int getIp00060aDeNo(int index) throws CFException {
   		return ip00060aDeAttrTable.getIp00060aDeAttrRow(index).getIp00060aDeNo();
	}


	/**
	 *	Returns String value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public char[]  getIp00060aDeNoString(int index) throws CFException {
	     return String.valueOf(ip00060aDeAttrTable.getIp00060aDeAttrRow(index).getIp00060aDeNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00060aDeNoIsNumeric(int index)  throws CFException{
	    return ip00060aDeAttrTable.getIp00060aDeAttrRow(index - 1).ip00060aDeNoIsNumeric();
	}

	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *	@param number
	 */
	public void setIp00060aDeNo(int index,int number)  throws CFException{
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(number);
	}
	

	public void setIp00060aDeNo(int index,long number)  throws CFException{
	    ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(number);
	}
	
	
	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNo(int index,char[] value)  throws CFException {
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(value);
	}
	
	/**
	 * 	Update Ip00060aDeNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNoString(int index,char[] value)  throws CFException{
		ip00060aDeAttrTable.getIp00060aDeAttrRow(index).setIp00060aDeNo(value);
	}	


public void setIp00060aI(int ip00060aI) { 
    Ip739010Ctx.this.ip00060aI = ip00060aI;
}

public int getIp00060aI() { 
    return Ip739010Ctx.this.ip00060aI;
}

        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00060aDeAttrTable.hashCode();
        str += work.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public ResolveAccBrandPtrsOutCtx clone() {
        ResolveAccBrandPtrsOutCtx cloneObj = new ResolveAccBrandPtrsOutCtx();
        cloneObj.ip00060aDeAttrTable = new Ip00060aDeAttrTable();
        cloneObj.ip00060aDeAttrTable.set(ip00060aDeAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public ResolveAccBrandPtrsOutCtx getResolveAccBrandPtrsOutCtx() {
            return new ResolveAccBrandPtrsOutCtx();
    }
     public class GetTableKeyDtTmInCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp299010800
	 *	@return ptrIp299010800
	 */
   public char[] getPtrIp299010800() throws CFException  {              
   		return work.getPtrIp299010800();
   }

  
	/**
	*  set variable ptrIp299010800
	*  @param value
	**/
   public void setPtrIp299010800(char[] value) throws CFException {
      work.setPtrIp299010800(value);
   } 


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public GetTableKeyDtTmOutCtx getGetTableKeyDtTmOutCtx() {
            return new GetTableKeyDtTmOutCtx();
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

    public GetTableKeyDtTmInCtx clone() {
        GetTableKeyDtTmInCtx cloneObj = new GetTableKeyDtTmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetTableKeyDtTmInCtx getGetTableKeyDtTmInCtx() {
            return new GetTableKeyDtTmInCtx();
    }
     public class GetTableKeyDtTmOutCtx implements Cloneable {
     Work work = Ip739010Ctx.this.getWork();


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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

    public GetTableKeyDtTmOutCtx clone() {
        GetTableKeyDtTmOutCtx cloneObj = new GetTableKeyDtTmOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetTableKeyDtTmOutCtx getGetTableKeyDtTmOutCtx() {
            return new GetTableKeyDtTmOutCtx();
    }
     public class GetFromOneDayFileInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip739010Ctx.this.getRecNotFoundMsg610();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

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

	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
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
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */   
	 public RecNotFoundMsg610 getRecNotFoundMsg610() {
   	return recNotFoundMsg610;
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


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileInCtx clone() {
        GetFromOneDayFileInCtx cloneObj = new GetFromOneDayFileInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileInCtx getGetFromOneDayFileInCtx() {
            return new GetFromOneDayFileInCtx();
    }
     public class GetFromOneDayFileOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip739010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip739010Ctx.this.getRecNotFoundMsg610();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

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
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
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
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */   
	 public RecNotFoundMsg610 getRecNotFoundMsg610() {
   	return recNotFoundMsg610;
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
	 *	Returns the value of tableId610
	 *	@return tableId610
	 */
   public char[] getTableId610() throws CFException  {              
   		return recNotFoundMsg610.getTableId610();
   }

  
	/**
	*  set variable tableId610
	*  @param value
	**/
   public void setTableId610(char[] value) throws CFException {
      recNotFoundMsg610.setTableId610(value);
   } 

     /**
	 * 	Update TableId610 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId610(char[] source, int sourceIndex) throws CFException {
      recNotFoundMsg610.setTableId610(source, sourceIndex);
   	
   }
   
   public void setTableId610(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      recNotFoundMsg610.setTableId610(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId610 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId610(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recNotFoundMsg610.setTableId610(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId610 with another Field
	 *	@param value
	 */
   public void setTableId610(Field source) {
      recNotFoundMsg610.setTableId610(source);
   }  
   
     /**
	 * 	Update TableId610 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId610(Field source, int sourceIndex,int sourceLen) {
      recNotFoundMsg610.setTableId610(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId610 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId610(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recNotFoundMsg610.setTableId610(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += work.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileOutCtx clone() {
        GetFromOneDayFileOutCtx cloneObj = new GetFromOneDayFileOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileOutCtx getGetFromOneDayFileOutCtx() {
            return new GetFromOneDayFileOutCtx();
    }
     public class CheckTableLimitInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     TableOverflowError600 tableOverflowError600 = Ip739010Ctx.this.getTableOverflowError600();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
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


	/**
	 *	Returns the value of checkLength800
	 *	@return checkLength800
	 */
	public int getCheckLength800() throws CFException {        
   		return work.getCheckLength800();
	}
	
	/**
	 * 	Update CheckLength800 with the passed value
	 *	@param number
	 */
	public void setCheckLength800(int number)  throws CFException{
		work.setCheckLength800(number);
	}


	public void setCheckLength800(long number)  throws CFException{
		work.setCheckLength800((int)number);
	}


	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */   
	 public TableOverflowError600 getTableOverflowError600() {
   	return tableOverflowError600;
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
	 *	Returns the value of tableMaxLength800
	 *	@return tableMaxLength800
	 */
	public int getTableMaxLength800() throws CFException {        
   		return work.getTableMaxLength800();
	}
	
	/**
	 * 	Update TableMaxLength800 with the passed value
	 *	@param number
	 */
	public void setTableMaxLength800(int number)  throws CFException{
		work.setTableMaxLength800(number);
	}


	public void setTableMaxLength800(long number)  throws CFException{
		work.setTableMaxLength800((int)number);
	}


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




        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public CheckTableLimitOutCtx getCheckTableLimitOutCtx() {
            return new CheckTableLimitOutCtx();
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
        str += tableOverflowError600.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CheckTableLimitInCtx clone() {
        CheckTableLimitInCtx cloneObj = new CheckTableLimitInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CheckTableLimitInCtx getCheckTableLimitInCtx() {
            return new CheckTableLimitInCtx();
    }
     public class CheckTableLimitOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     TableOverflowError600 tableOverflowError600 = Ip739010Ctx.this.getTableOverflowError600();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip739010Ctx.this.getIp50005OneDayRecLthGroup();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of checkLength800
	 *	@return checkLength800
	 */
	public int getCheckLength800() throws CFException {        
   		return work.getCheckLength800();
	}
	
	/**
	 * 	Update CheckLength800 with the passed value
	 *	@param number
	 */
	public void setCheckLength800(int number)  throws CFException{
		work.setCheckLength800(number);
	}


	public void setCheckLength800(long number)  throws CFException{
		work.setCheckLength800((int)number);
	}


	/**
	 *	Returns the value of timestamp600
	 *	@return timestamp600
	 */
   public char[] getTimestamp600() throws CFException  {              
   		return tableOverflowError600.getTimestamp600();
   }

  
	/**
	*  set variable timestamp600
	*  @param value
	**/
   public void setTimestamp600(char[] value) throws CFException {
      tableOverflowError600.setTimestamp600(value);
   } 

     /**
	 * 	Update Timestamp600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp600(char[] source, int sourceIndex) throws CFException {
      tableOverflowError600.setTimestamp600(source, sourceIndex);
   	
   }
   
   public void setTimestamp600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableOverflowError600.setTimestamp600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Timestamp600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableOverflowError600.setTimestamp600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Timestamp600 with another Field
	 *	@param value
	 */
   public void setTimestamp600(Field source) {
      tableOverflowError600.setTimestamp600(source);
   }  
   
     /**
	 * 	Update Timestamp600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp600(Field source, int sourceIndex,int sourceLen) {
      tableOverflowError600.setTimestamp600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Timestamp600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableOverflowError600.setTimestamp600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
   } 

	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */   
	 public TableOverflowError600 getTableOverflowError600() {
   	return tableOverflowError600;
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
	 *	Returns the value of tableId600
	 *	@return tableId600
	 */
   public char[] getTableId600() throws CFException  {              
   		return tableOverflowError600.getTableId600();
   }

  
	/**
	*  set variable tableId600
	*  @param value
	**/
   public void setTableId600(char[] value) throws CFException {
      tableOverflowError600.setTableId600(value);
   } 

     /**
	 * 	Update TableId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId600(char[] source, int sourceIndex) throws CFException {
      tableOverflowError600.setTableId600(source, sourceIndex);
   	
   }
   
   public void setTableId600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableOverflowError600.setTableId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableOverflowError600.setTableId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId600 with another Field
	 *	@param value
	 */
   public void setTableId600(Field source) {
      tableOverflowError600.setTableId600(source);
   }  
   
     /**
	 * 	Update TableId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId600(Field source, int sourceIndex,int sourceLen) {
      tableOverflowError600.setTableId600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableOverflowError600.setTableId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += tableOverflowError600.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CheckTableLimitOutCtx clone() {
        CheckTableLimitOutCtx cloneObj = new CheckTableLimitOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CheckTableLimitOutCtx getCheckTableLimitOutCtx() {
            return new CheckTableLimitOutCtx();
    }
     public class CheckForCompleteRowsInCtx implements Cloneable {
     TableIntegrityError640 tableIntegrityError640 = Ip739010Ctx.this.getTableIntegrityError640();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip739010Ctx.this.getWork();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
   } 

	/**
	 *	Returns the value of tableIntegrityError640
	 *	@return tableIntegrityError640
	 */   
	 public TableIntegrityError640 getTableIntegrityError640() {
   	return tableIntegrityError640;
   }


	/**
	 *	Returns the value of tblIntegrityAbendCode300
	 *	@return tblIntegrityAbendCode300
	 */
   public char[] getTblIntegrityAbendCode300() throws CFException  {              
   		return work.getTblIntegrityAbendCode300();
   }

  
	/**
	*  set variable tblIntegrityAbendCode300
	*  @param value
	**/
   public void setTblIntegrityAbendCode300(char[] value) throws CFException {
      work.setTblIntegrityAbendCode300(value);
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



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }

        public CheckForCompleteRowsOutCtx getCheckForCompleteRowsOutCtx() {
            return new CheckForCompleteRowsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableIntegrityError640.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CheckForCompleteRowsInCtx clone() {
        CheckForCompleteRowsInCtx cloneObj = new CheckForCompleteRowsInCtx();
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CheckForCompleteRowsInCtx getCheckForCompleteRowsInCtx() {
            return new CheckForCompleteRowsInCtx();
    }
     public class CheckForCompleteRowsOutCtx implements Cloneable {
     TableIntegrityError640 tableIntegrityError640 = Ip739010Ctx.this.getTableIntegrityError640();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip739010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip739010Ctx.this.getWork();
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of tblIntegrityAbendCode300
	 *	@return tblIntegrityAbendCode300
	 */
   public char[] getTblIntegrityAbendCode300() throws CFException  {              
   		return work.getTblIntegrityAbendCode300();
   }

  
	/**
	*  set variable tblIntegrityAbendCode300
	*  @param value
	**/
   public void setTblIntegrityAbendCode300(char[] value) throws CFException {
      work.setTblIntegrityAbendCode300(value);
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
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
   } 

	/**
	 *	Returns the value of tableIntegrityError640
	 *	@return tableIntegrityError640
	 */   
	 public TableIntegrityError640 getTableIntegrityError640() {
   	return tableIntegrityError640;
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
	 *	Returns the value of tableId640
	 *	@return tableId640
	 */
   public char[] getTableId640() throws CFException  {              
   		return tableIntegrityError640.getTableId640();
   }

  
	/**
	*  set variable tableId640
	*  @param value
	**/
   public void setTableId640(char[] value) throws CFException {
      tableIntegrityError640.setTableId640(value);
   } 

     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex) throws CFException {
      tableIntegrityError640.setTableId640(source, sourceIndex);
   	
   }
   
   public void setTableId640(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableIntegrityError640.setTableId640(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableIntegrityError640.setTableId640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId640 with another Field
	 *	@param value
	 */
   public void setTableId640(Field source) {
      tableIntegrityError640.setTableId640(source);
   }  
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen) {
      tableIntegrityError640.setTableId640(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableIntegrityError640.setTableId640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}


	/**
	 *	Returns the value of timestamp640
	 *	@return timestamp640
	 */
   public char[] getTimestamp640() throws CFException  {              
   		return tableIntegrityError640.getTimestamp640();
   }

  
	/**
	*  set variable timestamp640
	*  @param value
	**/
   public void setTimestamp640(char[] value) throws CFException {
      tableIntegrityError640.setTimestamp640(value);
   } 

     /**
	 * 	Update Timestamp640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp640(char[] source, int sourceIndex) throws CFException {
      tableIntegrityError640.setTimestamp640(source, sourceIndex);
   	
   }
   
   public void setTimestamp640(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableIntegrityError640.setTimestamp640(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Timestamp640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableIntegrityError640.setTimestamp640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Timestamp640 with another Field
	 *	@param value
	 */
   public void setTimestamp640(Field source) {
      tableIntegrityError640.setTimestamp640(source);
   }  
   
     /**
	 * 	Update Timestamp640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp640(Field source, int sourceIndex,int sourceLen) {
      tableIntegrityError640.setTimestamp640(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Timestamp640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableIntegrityError640.setTimestamp640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tableIntegrityError640.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CheckForCompleteRowsOutCtx clone() {
        CheckForCompleteRowsOutCtx cloneObj = new CheckForCompleteRowsOutCtx();
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CheckForCompleteRowsOutCtx getCheckForCompleteRowsOutCtx() {
            return new CheckForCompleteRowsOutCtx();
    }
     public class DisplayCountInCtx implements Cloneable {
     RowsLoadedMessage630 rowsLoadedMessage630 = Ip739010Ctx.this.getRowsLoadedMessage630();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

	/**
	 *	Returns the value of rowsLoadedMessage630
	 *	@return rowsLoadedMessage630
	 */   
	 public RowsLoadedMessage630 getRowsLoadedMessage630() {
   	return rowsLoadedMessage630;
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
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {        
   		return work.getRowCount800();
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *	@param number
	 */
	public void setRowCount800(int number)  throws CFException{
		work.setRowCount800(number);
	}


	public void setRowCount800(long number)  throws CFException{
		work.setRowCount800((int)number);
	}



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
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
        str += rowsLoadedMessage630.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public DisplayCountInCtx clone() {
        DisplayCountInCtx cloneObj = new DisplayCountInCtx();
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountInCtx getDisplayCountInCtx() {
            return new DisplayCountInCtx();
    }
     public class DisplayCountOutCtx implements Cloneable {
     RowsLoadedMessage630 rowsLoadedMessage630 = Ip739010Ctx.this.getRowsLoadedMessage630();
     Work work = Ip739010Ctx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = Ip739010Ctx.this.getIp50005OneDayRec();

	/**
	 *	Returns the value of tableId630
	 *	@return tableId630
	 */
   public char[] getTableId630() throws CFException  {              
   		return rowsLoadedMessage630.getTableId630();
   }

  
	/**
	*  set variable tableId630
	*  @param value
	**/
   public void setTableId630(char[] value) throws CFException {
      rowsLoadedMessage630.setTableId630(value);
   } 

     /**
	 * 	Update TableId630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId630(char[] source, int sourceIndex) throws CFException {
      rowsLoadedMessage630.setTableId630(source, sourceIndex);
   	
   }
   
   public void setTableId630(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rowsLoadedMessage630.setTableId630(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setTableId630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId630 with another Field
	 *	@param value
	 */
   public void setTableId630(Field source) {
      rowsLoadedMessage630.setTableId630(source);
   }  
   
     /**
	 * 	Update TableId630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId630(Field source, int sourceIndex,int sourceLen) {
      rowsLoadedMessage630.setTableId630(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setTableId630(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of tableTimestamp630
	 *	@return tableTimestamp630
	 */
   public char[] getTableTimestamp630() throws CFException  {              
   		return rowsLoadedMessage630.getTableTimestamp630();
   }

  
	/**
	*  set variable tableTimestamp630
	*  @param value
	**/
   public void setTableTimestamp630(char[] value) throws CFException {
      rowsLoadedMessage630.setTableTimestamp630(value);
   } 

     /**
	 * 	Update TableTimestamp630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableTimestamp630(char[] source, int sourceIndex) throws CFException {
      rowsLoadedMessage630.setTableTimestamp630(source, sourceIndex);
   	
   }
   
   public void setTableTimestamp630(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rowsLoadedMessage630.setTableTimestamp630(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableTimestamp630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableTimestamp630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setTableTimestamp630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableTimestamp630 with another Field
	 *	@param value
	 */
   public void setTableTimestamp630(Field source) {
      rowsLoadedMessage630.setTableTimestamp630(source);
   }  
   
     /**
	 * 	Update TableTimestamp630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableTimestamp630(Field source, int sourceIndex,int sourceLen) {
      rowsLoadedMessage630.setTableTimestamp630(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableTimestamp630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableTimestamp630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setTableTimestamp630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rowsLoadedCnt630
	 *	@return rowsLoadedCnt630
	 */
   public char[] getRowsLoadedCnt630() throws CFException  {              
   		return rowsLoadedMessage630.getRowsLoadedCnt630();
   }

  
	/**
	*  set variable rowsLoadedCnt630
	*  @param value
	**/
   public void setRowsLoadedCnt630(char[] value) throws CFException {
      rowsLoadedMessage630.setRowsLoadedCnt630(value);
   } 

     /**
	 * 	Update RowsLoadedCnt630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRowsLoadedCnt630(char[] source, int sourceIndex) throws CFException {
      rowsLoadedMessage630.setRowsLoadedCnt630(source, sourceIndex);
   	
   }
   
   public void setRowsLoadedCnt630(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rowsLoadedMessage630.setRowsLoadedCnt630(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRowsLoadedCnt630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setRowsLoadedCnt630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RowsLoadedCnt630 with another Field
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source) {
      rowsLoadedMessage630.setRowsLoadedCnt630(source);
   }  
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source, int sourceIndex,int sourceLen) {
      rowsLoadedMessage630.setRowsLoadedCnt630(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rowsLoadedMessage630.setRowsLoadedCnt630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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


        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += rowsLoadedMessage630.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public DisplayCountOutCtx clone() {
        DisplayCountOutCtx cloneObj = new DisplayCountOutCtx();
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountOutCtx getDisplayCountOutCtx() {
            return new DisplayCountOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip739010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip739010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }


	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }



        public Ip739010Ctx getIp739010Ctx() {
            return Ip739010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
}
