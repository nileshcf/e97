package com.cloudframe.app.ip741010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip741010.dto.TableIntegrityError640;
import com.cloudframe.app.ip741010.dto.RowsLoadedMessage630;
import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip741010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
import com.cloudframe.app.ip741010.dto.TableOverflowError600;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.ip741010.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrRow;
import com.cloudframe.app.ip741010.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrTable;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrRow;
import com.cloudframe.app.ip741010.dto.RecNotFoundMsg610;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;


@Context
public class Ip741010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    RowsLoadedMessage630 rowsLoadedMessage630;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    TableIntegrityError640 tableIntegrityError640;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip00054TableEntry ip00054TableEntry;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip000904PdsSubAttrTable ip000904PdsSubAttrTable;
    AbendParaName900 abendParaName900;
    Ip000804PdsAttributes ip000804PdsAttributes;
    Ip50005OneDayRec ip50005OneDayRec;
    AbendMessage900 abendMessage900;
    RecNotFoundMsg610 recNotFoundMsg610;
    TableOverflowError600 tableOverflowError600;
    Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup;
    Work work;

    int ip000904I;
    int ip000804I;

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


    public RowsLoadedMessage630 getRowsLoadedMessage630() {
        if (rowsLoadedMessage630 == null) {
            rowsLoadedMessage630 = new RowsLoadedMessage630();
        }

        return rowsLoadedMessage630;
    }

    public void setRowsLoadedMessage630(RowsLoadedMessage630 rowsLoadedMessage630) {
        this.rowsLoadedMessage630 = rowsLoadedMessage630;
    }
    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
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
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip00054TableEntry getIp00054TableEntry() {
        if (ip00054TableEntry == null) {
            ip00054TableEntry = globalCtx.getGlobalDto(Ip00054TableEntry.class);
        }

        return ip00054TableEntry;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip000904PdsSubAttrTable getIp000904PdsSubAttrTable() {
        if (ip000904PdsSubAttrTable == null) {
            ip000904PdsSubAttrTable = globalCtx.getGlobalDto(Ip000904PdsSubAttrTable.class);
        }

        return ip000904PdsSubAttrTable;
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
    public Ip000804PdsAttributes getIp000804PdsAttributes() {
        if (ip000804PdsAttributes == null) {
            ip000804PdsAttributes = globalCtx.getGlobalDto(Ip000804PdsAttributes.class);
        }

        return ip000804PdsAttributes;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
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
    public RecNotFoundMsg610 getRecNotFoundMsg610() {
        if (recNotFoundMsg610 == null) {
            recNotFoundMsg610 = new RecNotFoundMsg610();
        }

        return recNotFoundMsg610;
    }

    public void setRecNotFoundMsg610(RecNotFoundMsg610 recNotFoundMsg610) {
        this.recNotFoundMsg610 = recNotFoundMsg610;
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
    public Ip000608ProcessingDateTimeGroup getIp000608ProcessingDateTimeGroup() {
        if (ip000608ProcessingDateTimeGroup == null) {
            ip000608ProcessingDateTimeGroup = globalCtx.getGlobalDto(Ip000608ProcessingDateTimeGroup.class);
        }

        return ip000608ProcessingDateTimeGroup;
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

    public int getIp000904I() {
        return ip000904I;
    }

    public void setIp000904I(int ip000904I) {
        this.ip000904I = ip000904I;
    }
    public int getIp000804I() {
        return ip000804I;
    }

    public void setIp000804I(int ip000804I) {
        this.ip000804I = ip000804I;
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
        str += ip50005OneDayRecLthGroup.hashCode();
        str += tableIntegrityError640.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip00054TableEntry.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += abendParaName900.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += tableOverflowError600.hashCode();
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip741010Ctx clone() {
        Ip741010Ctx cloneObj = new Ip741010Ctx();
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip00054TableEntry.hashCode();
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
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
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
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
     Work work = Ip741010Ctx.this.getWork();

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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializationInCtx clone() {
        InitializationInCtx cloneObj = new InitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationInCtx getInitializationInCtx() {
            return new InitializationInCtx();
    }
     public class InitializationOutCtx implements Cloneable {
     Work work = Ip741010Ctx.this.getWork();

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

	/**
	 *	Test condition "N" for isNoTableWasLoaded88100()
	 *	@return  Returns true if isNoTableWasLoaded88100() is "N"
	 */
   public boolean isNoTableWasLoaded88100() throws CFException {
      return work.isNoTableWasLoaded88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNoTableWasLoaded88100True()  throws CFException{  			
    	work.setNoTableWasLoaded88100True();
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

        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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

    public InitializationOutCtx clone() {
        InitializationOutCtx cloneObj = new InitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
    }
     public class LoadTablesIfNeededInCtx implements Cloneable {
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isWeLoadedATable88100()
	 *	@return  Returns true if isWeLoadedATable88100() is "Y"
	 */
   public boolean isWeLoadedATable88100() throws CFException {
      return work.isWeLoadedATable88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setWeLoadedATable88100True()  throws CFException{  			
    	work.setWeLoadedATable88100True();
   	}

        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
     public class LoadTable8IfNeededInCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of table8Id300
	 *	@return table8Id300
	 */
   public char[] getTable8Id300() throws CFException  {              
   		return work.getTable8Id300();
   }

  
	/**
	*  set variable table8Id300
	*  @param value
	**/
   public void setTable8Id300(char[] value) throws CFException {
      work.setTable8Id300(value);
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
	 *	Returns the value of lastKeyDtTmT8800
	 *	@return lastKeyDtTmT8800
	 */
   public char[] getLastKeyDtTmT8800() throws CFException  {              
   		return work.getLastKeyDtTmT8800();
   }

  
	/**
	*  set variable lastKeyDtTmT8800
	*  @param value
	**/
   public void setLastKeyDtTmT8800(char[] value) throws CFException {
      work.setLastKeyDtTmT8800(value);
   } 


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public LoadTable8IfNeededOutCtx getLoadTable8IfNeededOutCtx() {
            return new LoadTable8IfNeededOutCtx();
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable8IfNeededInCtx clone() {
        LoadTable8IfNeededInCtx cloneObj = new LoadTable8IfNeededInCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable8IfNeededInCtx getLoadTable8IfNeededInCtx() {
            return new LoadTable8IfNeededInCtx();
    }
     public class LoadTable8IfNeededOutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of table8Id300
	 *	@return table8Id300
	 */
   public char[] getTable8Id300() throws CFException  {              
   		return work.getTable8Id300();
   }

  
	/**
	*  set variable table8Id300
	*  @param value
	**/
   public void setTable8Id300(char[] value) throws CFException {
      work.setTable8Id300(value);
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
	 *	Test condition "Y" for isWeLoadedATable88100()
	 *	@return  Returns true if isWeLoadedATable88100() is "Y"
	 */
   public boolean isWeLoadedATable88100() throws CFException {
      return work.isWeLoadedATable88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setWeLoadedATable88100True()  throws CFException{  			
    	work.setWeLoadedATable88100True();
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
	 *	Returns the value of lastKeyDtTmT8800
	 *	@return lastKeyDtTmT8800
	 */
   public char[] getLastKeyDtTmT8800() throws CFException  {              
   		return work.getLastKeyDtTmT8800();
   }

  
	/**
	*  set variable lastKeyDtTmT8800
	*  @param value
	**/
   public void setLastKeyDtTmT8800(char[] value) throws CFException {
      work.setLastKeyDtTmT8800(value);
   } 


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable8IfNeededOutCtx clone() {
        LoadTable8IfNeededOutCtx cloneObj = new LoadTable8IfNeededOutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable8IfNeededOutCtx getLoadTable8IfNeededOutCtx() {
            return new LoadTable8IfNeededOutCtx();
    }
     public class LoadTable8InCtx implements Cloneable {
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of table8Id300
	 *	@return table8Id300
	 */
   public char[] getTable8Id300() throws CFException  {              
   		return work.getTable8Id300();
   }

  
	/**
	*  set variable table8Id300
	*  @param value
	**/
   public void setTable8Id300(char[] value) throws CFException {
      work.setTable8Id300(value);
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
	 *	Returns the value of ip000804PdsAttrRow
	 *	@return ip000804PdsAttrRow
	 */   
	 public Ip000804PdsAttrRow getIp000804PdsAttrRow(int index) {
   	return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index);
   }

    public List<Ip000804PdsAttrRow> getIp000804PdsAttrRow() {
        return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow();
    }
   /**
	* 	Update Ip000804PdsAttrRow with the passed value
	*	@param value
	*/
   public void setIp000804PdsAttrRow(int index,char[] value) throws CFException {
      ip000804PdsAttributes.getIp000804PdsAttrTable().setIp000804PdsAttrRow((index),value);
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
	 *	Returns the value of ip000804PdsAttrTable
	 *	@return ip000804PdsAttrTable
	 */   
	 public Ip000804PdsAttrTable getIp000804PdsAttrTable() {
   	return ip000804PdsAttributes.getIp000804PdsAttrTable();
   }

   /**
	* 	Update Ip000804PdsAttrTable with the passed value
	*	@param value
	*/
   public void setIp000804PdsAttrTable(char[] value) throws CFException {
      ip000804PdsAttributes.setIp000804PdsAttrTable(value);
   }   

     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000804PdsAttrTable with another Field
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source);
   }  
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public LoadTable8OutCtx getLoadTable8OutCtx() {
            return new LoadTable8OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip00054TableEntry.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable8InCtx clone() {
        LoadTable8InCtx cloneObj = new LoadTable8InCtx();
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable8InCtx getLoadTable8InCtx() {
            return new LoadTable8InCtx();
    }
     public class LoadTable8OutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of table8Id300
	 *	@return table8Id300
	 */
   public char[] getTable8Id300() throws CFException  {              
   		return work.getTable8Id300();
   }

  
	/**
	*  set variable table8Id300
	*  @param value
	**/
   public void setTable8Id300(char[] value) throws CFException {
      work.setTable8Id300(value);
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
	 *	Returns the value of ip000804MaxPdsNo
	 *	@return ip000804MaxPdsNo
	 */
	public short getIp000804MaxPdsNo() throws CFException {        
   		return ip000804PdsAttributes.getIp000804MaxPdsNo();
	}
	
	/**
	 * 	Update Ip000804MaxPdsNo with the passed value
	 *	@param number
	 */
	public void setIp000804MaxPdsNo(short number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo(number);
	}

	public void setIp000804MaxPdsNo(int number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
	}

	public void setIp000804MaxPdsNo(long number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable8OutCtx clone() {
        LoadTable8OutCtx cloneObj = new LoadTable8OutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable8OutCtx getLoadTable8OutCtx() {
            return new LoadTable8OutCtx();
    }
     public class MoveToTable8InCtx implements Cloneable {
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of ip000804PdsAttributes
	 *	@return ip000804PdsAttributes
	 */   
	 public Ip000804PdsAttributes getIp000804PdsAttributes() {
   	return ip000804PdsAttributes;
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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public MoveToTable8OutCtx getMoveToTable8OutCtx() {
            return new MoveToTable8OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000804PdsAttributes.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveToTable8InCtx clone() {
        MoveToTable8InCtx cloneObj = new MoveToTable8InCtx();
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable8InCtx getMoveToTable8InCtx() {
            return new MoveToTable8InCtx();
    }
     public class MoveToTable8OutCtx implements Cloneable {
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of ip000804PdsAttributes
	 *	@return ip000804PdsAttributes
	 */   
	 public Ip000804PdsAttributes getIp000804PdsAttributes() {
   	return ip000804PdsAttributes;
   }


	/**
	 *	Returns the value of ip000804PdsAttrTable
	 *	@return ip000804PdsAttrTable
	 */   
	 public Ip000804PdsAttrTable getIp000804PdsAttrTable() {
   	return ip000804PdsAttributes.getIp000804PdsAttrTable();
   }

   /**
	* 	Update Ip000804PdsAttrTable with the passed value
	*	@param value
	*/
   public void setIp000804PdsAttrTable(char[] value) throws CFException {
      ip000804PdsAttributes.setIp000804PdsAttrTable(value);
   }   

     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000804PdsAttrTable with another Field
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source);
   }  
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip000804PdsAttributes.setIp000804PdsAttrTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000804PdsAttributes.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveToTable8OutCtx clone() {
        MoveToTable8OutCtx cloneObj = new MoveToTable8OutCtx();
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable8OutCtx getMoveToTable8OutCtx() {
            return new MoveToTable8OutCtx();
    }
     public class LoadTable9IfNeededInCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of table9Id300
	 *	@return table9Id300
	 */
   public char[] getTable9Id300() throws CFException  {              
   		return work.getTable9Id300();
   }

  
	/**
	*  set variable table9Id300
	*  @param value
	**/
   public void setTable9Id300(char[] value) throws CFException {
      work.setTable9Id300(value);
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
	 *	Returns the value of lastKeyDtTmT9800
	 *	@return lastKeyDtTmT9800
	 */
   public char[] getLastKeyDtTmT9800() throws CFException  {              
   		return work.getLastKeyDtTmT9800();
   }

  
	/**
	*  set variable lastKeyDtTmT9800
	*  @param value
	**/
   public void setLastKeyDtTmT9800(char[] value) throws CFException {
      work.setLastKeyDtTmT9800(value);
   } 


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public LoadTable9IfNeededOutCtx getLoadTable9IfNeededOutCtx() {
            return new LoadTable9IfNeededOutCtx();
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable9IfNeededInCtx clone() {
        LoadTable9IfNeededInCtx cloneObj = new LoadTable9IfNeededInCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable9IfNeededInCtx getLoadTable9IfNeededInCtx() {
            return new LoadTable9IfNeededInCtx();
    }
     public class LoadTable9IfNeededOutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip741010Ctx.this.getIp000608ProcessingDateTimeGroup();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of table9Id300
	 *	@return table9Id300
	 */
   public char[] getTable9Id300() throws CFException  {              
   		return work.getTable9Id300();
   }

  
	/**
	*  set variable table9Id300
	*  @param value
	**/
   public void setTable9Id300(char[] value) throws CFException {
      work.setTable9Id300(value);
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
	 *	Returns the value of lastKeyDtTmT9800
	 *	@return lastKeyDtTmT9800
	 */
   public char[] getLastKeyDtTmT9800() throws CFException  {              
   		return work.getLastKeyDtTmT9800();
   }

  
	/**
	*  set variable lastKeyDtTmT9800
	*  @param value
	**/
   public void setLastKeyDtTmT9800(char[] value) throws CFException {
      work.setLastKeyDtTmT9800(value);
   } 

	/**
	 *	Test condition "Y" for isWeLoadedATable88100()
	 *	@return  Returns true if isWeLoadedATable88100() is "Y"
	 */
   public boolean isWeLoadedATable88100() throws CFException {
      return work.isWeLoadedATable88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setWeLoadedATable88100True()  throws CFException{  			
    	work.setWeLoadedATable88100True();
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable9IfNeededOutCtx clone() {
        LoadTable9IfNeededOutCtx cloneObj = new LoadTable9IfNeededOutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable9IfNeededOutCtx getLoadTable9IfNeededOutCtx() {
            return new LoadTable9IfNeededOutCtx();
    }
     public class LoadTable9InCtx implements Cloneable {
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of table9Id300
	 *	@return table9Id300
	 */
   public char[] getTable9Id300() throws CFException  {              
   		return work.getTable9Id300();
   }

  
	/**
	*  set variable table9Id300
	*  @param value
	**/
   public void setTable9Id300(char[] value) throws CFException {
      work.setTable9Id300(value);
   } 

	/**
	 *	Returns the value of ip000904PdsSubAttrRow
	 *	@return ip000904PdsSubAttrRow
	 */   
	 public Ip000904PdsSubAttrRow getIp000904PdsSubAttrRow(int index) {
   	return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index);
   }

    public List<Ip000904PdsSubAttrRow> getIp000904PdsSubAttrRow() {
        return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow();
    }
   /**
	* 	Update Ip000904PdsSubAttrRow with the passed value
	*	@param value
	*/
   public void setIp000904PdsSubAttrRow(int index,char[] value) throws CFException {
      ip000904PdsSubAttrTable.setIp000904PdsSubAttrRow((index),value);
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
	 *	Returns the value of ip000904PdsSubAttrTable
	 *	@return ip000904PdsSubAttrTable
	 */   
	 public Ip000904PdsSubAttrTable getIp000904PdsSubAttrTable() {
   	return ip000904PdsSubAttrTable;
   }


	/**
	 *	Returns the value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public short getIp000904PdsSubMax() throws CFException {
   		return work.getIp000904PdsSubMax();
	}

    /**
	 *	Returns the String value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public char[]  getIp000904PdsSubMaxActualString() {
		return work.getIp000904PdsSubMaxActualString();
	}

	/**
	 *	Returns String value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public char[]  getIp000904PdsSubMaxString() throws CFException {
	     return String.valueOf(work.getIp000904PdsSubMaxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip000904PdsSubMaxIsNumeric()  throws CFException{
	    return work.ip000904PdsSubMaxIsNumeric();
	}

	/**
	 * 	Update Ip000904PdsSubMax with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMax(short number)  throws CFException{
		work.setIp000904PdsSubMax(number);
	}
	
	public void setIp000904PdsSubMax(int number)  throws CFException{
	    work.setIp000904PdsSubMax(number);
	}
	public void setIp000904PdsSubMax(long number)  throws CFException{
	    work.setIp000904PdsSubMax(number);
	}
	

	
	/**
	 * 	Update Ip000904PdsSubMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp000904PdsSubMax(char[] value)  throws CFException {
		work.setIp000904PdsSubMax(value);
	}
	
	/**
	 * 	Update Ip000904PdsSubMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp000904PdsSubMaxString(char[] value)  throws CFException{
		work.setIp000904PdsSubMax(value);
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

        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public LoadTable9OutCtx getLoadTable9OutCtx() {
            return new LoadTable9OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip00054TableEntry.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable9InCtx clone() {
        LoadTable9InCtx cloneObj = new LoadTable9InCtx();
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable9InCtx getLoadTable9InCtx() {
            return new LoadTable9InCtx();
    }
     public class LoadTable9OutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip741010Ctx.this.getIp00054TableEntry();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of table9Id300
	 *	@return table9Id300
	 */
   public char[] getTable9Id300() throws CFException  {              
   		return work.getTable9Id300();
   }

  
	/**
	*  set variable table9Id300
	*  @param value
	**/
   public void setTable9Id300(char[] value) throws CFException {
      work.setTable9Id300(value);
   } 

	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000904UndefinedPdsSubfld()
	 *	@return  Returns true if isIp000904UndefinedPdsSubfld() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000904UndefinedPdsSubfld(int index) throws CFException {
      return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).isIp000904UndefinedPdsSubfld();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000904UndefinedPdsSubfldTrue(int index)  throws CFException{  			
    	ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904UndefinedPdsSubfldTrue();
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
	 *	Returns the value of maxT9RowNo800
	 *	@return maxT9RowNo800
	 */
	public int getMaxT9RowNo800() throws CFException {        
   		return work.getMaxT9RowNo800();
	}
	
	/**
	 * 	Update MaxT9RowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT9RowNo800(int number)  throws CFException{
		work.setMaxT9RowNo800(number);
	}


	public void setMaxT9RowNo800(long number)  throws CFException{
		work.setMaxT9RowNo800((int)number);
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadTable9OutCtx clone() {
        LoadTable9OutCtx cloneObj = new LoadTable9OutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadTable9OutCtx getLoadTable9OutCtx() {
            return new LoadTable9OutCtx();
    }
     public class MoveToTable9InCtx implements Cloneable {
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of ip000904PdsSubAttrTable
	 *	@return ip000904PdsSubAttrTable
	 */   
	 public Ip000904PdsSubAttrTable getIp000904PdsSubAttrTable() {
   	return ip000904PdsSubAttrTable;
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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }

        public MoveToTable9OutCtx getMoveToTable9OutCtx() {
            return new MoveToTable9OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveToTable9InCtx clone() {
        MoveToTable9InCtx cloneObj = new MoveToTable9InCtx();
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable9InCtx getMoveToTable9InCtx() {
            return new MoveToTable9InCtx();
    }
     public class MoveToTable9OutCtx implements Cloneable {
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of ip000904PdsSubAttrTable
	 *	@return ip000904PdsSubAttrTable
	 */   
	 public Ip000904PdsSubAttrTable getIp000904PdsSubAttrTable() {
   	return ip000904PdsSubAttrTable;
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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveToTable9OutCtx clone() {
        MoveToTable9OutCtx cloneObj = new MoveToTable9OutCtx();
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveToTable9OutCtx getMoveToTable9OutCtx() {
            return new MoveToTable9OutCtx();
    }
     public class ResolveFirstSubfldPtrsInCtx implements Cloneable {
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of currentPdsNo800
	 *	@return currentPdsNo800
	 */
	public int getCurrentPdsNo800() throws CFException {        
   		return work.getCurrentPdsNo800();
	}
	
	/**
	 * 	Update CurrentPdsNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentPdsNo800(int number)  throws CFException{
		work.setCurrentPdsNo800(number);
	}


	public void setCurrentPdsNo800(long number)  throws CFException{
		work.setCurrentPdsNo800((int)number);
	}



public void setIp000804I(int ip000804I) { 
    Ip741010Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip741010Ctx.this.ip000804I;
}
	/**
	 *	Returns the value of maxT9RowNo800
	 *	@return maxT9RowNo800
	 */
	public int getMaxT9RowNo800() throws CFException {        
   		return work.getMaxT9RowNo800();
	}
	
	/**
	 * 	Update MaxT9RowNo800 with the passed value
	 *	@param number
	 */
	public void setMaxT9RowNo800(int number)  throws CFException{
		work.setMaxT9RowNo800(number);
	}


	public void setMaxT9RowNo800(long number)  throws CFException{
		work.setMaxT9RowNo800((int)number);
	}



public void setIp000904I(int ip000904I) { 
    Ip741010Ctx.this.ip000904I = ip000904I;
}

public int getIp000904I() { 
    return Ip741010Ctx.this.ip000904I;
}
	/**
	 *	Returns the value of ip000904PdsNo
	 *	@return ip000904PdsNo
	 */
	public short getIp000904PdsNo(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsNo();
	}
	
	/**
	 * 	Update Ip000904PdsNo with the passed value
	 *	@param number
	 */
	public void setIp000904PdsNo(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo(number);
	}

	public void setIp000904PdsNo(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo((short)number);
	}

	public void setIp000904PdsNo(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo((short)number);
	}



	/**
	 *	Returns the value of ip000804MaxPdsNo
	 *	@return ip000804MaxPdsNo
	 */
	public short getIp000804MaxPdsNo() throws CFException {        
   		return ip000804PdsAttributes.getIp000804MaxPdsNo();
	}
	
	/**
	 * 	Update Ip000804MaxPdsNo with the passed value
	 *	@param number
	 */
	public void setIp000804MaxPdsNo(short number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo(number);
	}

	public void setIp000804MaxPdsNo(int number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
	}

	public void setIp000804MaxPdsNo(long number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
	}




        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ResolveFirstSubfldPtrsInCtx clone() {
        ResolveFirstSubfldPtrsInCtx cloneObj = new ResolveFirstSubfldPtrsInCtx();
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ResolveFirstSubfldPtrsInCtx getResolveFirstSubfldPtrsInCtx() {
            return new ResolveFirstSubfldPtrsInCtx();
    }
     public class ResolveFirstSubfldPtrsOutCtx implements Cloneable {
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip741010Ctx.this.getIp000904PdsSubAttrTable();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip741010Ctx.this.getIp000804PdsAttributes();
     Work work = Ip741010Ctx.this.getWork();

	/**
	 *	Returns the value of currentPdsNo800
	 *	@return currentPdsNo800
	 */
	public int getCurrentPdsNo800() throws CFException {        
   		return work.getCurrentPdsNo800();
	}
	
	/**
	 * 	Update CurrentPdsNo800 with the passed value
	 *	@param number
	 */
	public void setCurrentPdsNo800(int number)  throws CFException{
		work.setCurrentPdsNo800(number);
	}


	public void setCurrentPdsNo800(long number)  throws CFException{
		work.setCurrentPdsNo800((int)number);
	}



public void setIp000804I(int ip000804I) { 
    Ip741010Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip741010Ctx.this.ip000804I;
}
	/**
	 *	Returns the value of ip000804PdsFirstSubfld
	 *	@return ip000804PdsFirstSubfld
	 */
	public int getIp000804PdsFirstSubfld(int index) throws CFException {        
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsFirstSubfld();
	}
	
	/**
	 * 	Update Ip000804PdsFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp000804PdsFirstSubfld(int index,int number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFirstSubfld(number);
	}


	public void setIp000804PdsFirstSubfld(int index,long number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFirstSubfld((int)number);
	}


	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000804NoPdsSubflds88()
	 *	@return  Returns true if isIp000804NoPdsSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000804NoPdsSubflds88(int index) throws CFException {
      return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).isIp000804NoPdsSubflds88();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000804NoPdsSubflds88True(int index)  throws CFException{  			
    	ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804NoPdsSubflds88True();
   	}

public void setIp000904I(int ip000904I) { 
    Ip741010Ctx.this.ip000904I = ip000904I;
}

public int getIp000904I() { 
    return Ip741010Ctx.this.ip000904I;
}
	/**
	 *	Returns the value of ip000904PdsNo
	 *	@return ip000904PdsNo
	 */
	public short getIp000904PdsNo(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsNo();
	}
	
	/**
	 * 	Update Ip000904PdsNo with the passed value
	 *	@param number
	 */
	public void setIp000904PdsNo(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo(number);
	}

	public void setIp000904PdsNo(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo((short)number);
	}

	public void setIp000904PdsNo(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsNo((short)number);
	}




        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ResolveFirstSubfldPtrsOutCtx clone() {
        ResolveFirstSubfldPtrsOutCtx cloneObj = new ResolveFirstSubfldPtrsOutCtx();
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ResolveFirstSubfldPtrsOutCtx getResolveFirstSubfldPtrsOutCtx() {
            return new ResolveFirstSubfldPtrsOutCtx();
    }
     public class GetTableKeyDtTmInCtx implements Cloneable {
     Work work = Ip741010Ctx.this.getWork();

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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
     Work work = Ip741010Ctx.this.getWork();


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */   
	 public RecNotFoundMsg610 getRecNotFoundMsg610() {
   	return recNotFoundMsg610;
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

        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileInCtx clone() {
        GetFromOneDayFileInCtx cloneObj = new GetFromOneDayFileInCtx();
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileInCtx getGetFromOneDayFileInCtx() {
            return new GetFromOneDayFileInCtx();
    }
     public class GetFromOneDayFileOutCtx implements Cloneable {
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip741010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     RecNotFoundMsg610 recNotFoundMsg610 = Ip741010Ctx.this.getRecNotFoundMsg610();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */   
	 public RecNotFoundMsg610 getRecNotFoundMsg610() {
   	return recNotFoundMsg610;
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += recNotFoundMsg610.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileOutCtx clone() {
        GetFromOneDayFileOutCtx cloneObj = new GetFromOneDayFileOutCtx();
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.recNotFoundMsg610 = new RecNotFoundMsg610();
        cloneObj.recNotFoundMsg610.set(recNotFoundMsg610.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileOutCtx getGetFromOneDayFileOutCtx() {
            return new GetFromOneDayFileOutCtx();
    }
     public class CheckTableLimitInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     TableOverflowError600 tableOverflowError600 = Ip741010Ctx.this.getTableOverflowError600();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendMessage900.hashCode();
        str += tableOverflowError600.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CheckTableLimitInCtx clone() {
        CheckTableLimitInCtx cloneObj = new CheckTableLimitInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckTableLimitInCtx getCheckTableLimitInCtx() {
            return new CheckTableLimitInCtx();
    }
     public class CheckTableLimitOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip741010Ctx.this.getIp50005OneDayRecLthGroup();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     TableOverflowError600 tableOverflowError600 = Ip741010Ctx.this.getTableOverflowError600();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */   
	 public TableOverflowError600 getTableOverflowError600() {
   	return tableOverflowError600;
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendMessage900.hashCode();
        str += tableOverflowError600.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CheckTableLimitOutCtx clone() {
        CheckTableLimitOutCtx cloneObj = new CheckTableLimitOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.tableOverflowError600 = new TableOverflowError600();
        cloneObj.tableOverflowError600.set(tableOverflowError600.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckTableLimitOutCtx getCheckTableLimitOutCtx() {
            return new CheckTableLimitOutCtx();
    }
     public class CheckForCompleteRowsInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     TableIntegrityError640 tableIntegrityError640 = Ip741010Ctx.this.getTableIntegrityError640();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += abendParaName900.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
        str += tableIntegrityError640.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CheckForCompleteRowsInCtx clone() {
        CheckForCompleteRowsInCtx cloneObj = new CheckForCompleteRowsInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckForCompleteRowsInCtx getCheckForCompleteRowsInCtx() {
            return new CheckForCompleteRowsInCtx();
    }
     public class CheckForCompleteRowsOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();
     TableIntegrityError640 tableIntegrityError640 = Ip741010Ctx.this.getTableIntegrityError640();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip741010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of tableIntegrityError640
	 *	@return tableIntegrityError640
	 */   
	 public TableIntegrityError640 getTableIntegrityError640() {
   	return tableIntegrityError640;
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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayRec.hashCode();
        str += abendMessage900.hashCode();
        str += tableIntegrityError640.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CheckForCompleteRowsOutCtx clone() {
        CheckForCompleteRowsOutCtx cloneObj = new CheckForCompleteRowsOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.tableIntegrityError640 = new TableIntegrityError640();
        cloneObj.tableIntegrityError640.set(tableIntegrityError640.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckForCompleteRowsOutCtx getCheckForCompleteRowsOutCtx() {
            return new CheckForCompleteRowsOutCtx();
    }
     public class DisplayCountInCtx implements Cloneable {
     RowsLoadedMessage630 rowsLoadedMessage630 = Ip741010Ctx.this.getRowsLoadedMessage630();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Work work = Ip741010Ctx.this.getWork();

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
	 *	Returns the value of rowsLoadedMessage630
	 *	@return rowsLoadedMessage630
	 */   
	 public RowsLoadedMessage630 getRowsLoadedMessage630() {
   	return rowsLoadedMessage630;
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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountInCtx clone() {
        DisplayCountInCtx cloneObj = new DisplayCountInCtx();
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountInCtx getDisplayCountInCtx() {
            return new DisplayCountInCtx();
    }
     public class DisplayCountOutCtx implements Cloneable {
     RowsLoadedMessage630 rowsLoadedMessage630 = Ip741010Ctx.this.getRowsLoadedMessage630();
     Ip50005OneDayRec ip50005OneDayRec = Ip741010Ctx.this.getIp50005OneDayRec();
     Work work = Ip741010Ctx.this.getWork();

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


        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountOutCtx clone() {
        DisplayCountOutCtx cloneObj = new DisplayCountOutCtx();
        cloneObj.rowsLoadedMessage630 = new RowsLoadedMessage630();
        cloneObj.rowsLoadedMessage630.set(rowsLoadedMessage630.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountOutCtx getDisplayCountOutCtx() {
            return new DisplayCountOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip741010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip741010Ctx.this.getAbendMessage900();

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



        public Ip741010Ctx getIp741010Ctx() {
            return Ip741010Ctx.this;
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
