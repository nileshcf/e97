package com.cloudframe.app.ip282210;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip282210.dto.OneDayRecLengthError620;
import com.cloudframe.app.ip282210.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip282210.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip02015ImpBulkId;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.ip282210.dto.Work;
import com.cloudframe.app.ip282210.dto.Ip28221PaTableRestart;
import com.cloudframe.app.ip282210.dto.Ip29991TableLoadSizeInfo;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip02014wTable;
import com.cloudframe.app.global.sharedvar.Ip02014wEntriesCntGroup;
import com.cloudframe.app.global.sharedvar.Ip02014wImpBulkId;
import com.cloudframe.app.global.sharedvar.Ip02014lPrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtEntry;


@Context
public class Ip282210Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;
    AbendParaName900 abendParaName900;
    OneDayRecLengthError620 oneDayRecLengthError620;
    Ip00054TableEntry ip00054TableEntry;
    Work work;
    AbendMessage900 abendMessage900;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip02014wEntriesCntGroup ip02014wEntriesCntGroup;
    Ip02014lPrcssAgrmtTable ip02014lPrcssAgrmtTable;
    Ip29991TableLoadSizeInfo ip29991TableLoadSizeInfo;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip02014wTable ip02014wTable;
    Ip28221PaTableRestart ip28221PaTableRestart;
    Ip50005OneDayRec ip50005OneDayRec;

    int ip02015PaIndex;
    int ip02014wPaIndex;

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


    public Ip02014PrcssAgrmtTable getIp02014PrcssAgrmtTable() {
        if (ip02014PrcssAgrmtTable == null) {
            ip02014PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02014PrcssAgrmtTable.class);
        }

        return ip02014PrcssAgrmtTable;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Ip02015PrcssAgrmtTable getIp02015PrcssAgrmtTable() {
        if (ip02015PrcssAgrmtTable == null) {
            ip02015PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02015PrcssAgrmtTable.class);
        }

        return ip02015PrcssAgrmtTable;
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
    public OneDayRecLengthError620 getOneDayRecLengthError620() {
        if (oneDayRecLengthError620 == null) {
            oneDayRecLengthError620 = new OneDayRecLengthError620();
        }

        return oneDayRecLengthError620;
    }

    public void setOneDayRecLengthError620(OneDayRecLengthError620 oneDayRecLengthError620) {
        this.oneDayRecLengthError620 = oneDayRecLengthError620;
    }
    public Ip00054TableEntry getIp00054TableEntry() {
        if (ip00054TableEntry == null) {
            ip00054TableEntry = globalCtx.getGlobalDto(Ip00054TableEntry.class);
        }

        return ip00054TableEntry;
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
    public AbendMessage900 getAbendMessage900() {
        if (abendMessage900 == null) {
            abendMessage900 = new AbendMessage900();
        }

        return abendMessage900;
    }

    public void setAbendMessage900(AbendMessage900 abendMessage900) {
        this.abendMessage900 = abendMessage900;
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

    public Ip02014wEntriesCntGroup getIp02014wEntriesCntGroup() {
        if (ip02014wEntriesCntGroup == null) {
            ip02014wEntriesCntGroup = globalCtx.getGlobalDto(Ip02014wEntriesCntGroup.class);
        }

        return ip02014wEntriesCntGroup;
    }

    public Ip02014lPrcssAgrmtTable getIp02014lPrcssAgrmtTable() {
        if (ip02014lPrcssAgrmtTable == null) {
            ip02014lPrcssAgrmtTable = globalCtx.getGlobalDto(Ip02014lPrcssAgrmtTable.class);
        }

        return ip02014lPrcssAgrmtTable;
    }

    public Ip29991TableLoadSizeInfo getIp29991TableLoadSizeInfo() {
        if (ip29991TableLoadSizeInfo == null) {
            ip29991TableLoadSizeInfo = new Ip29991TableLoadSizeInfo();
        }

        return ip29991TableLoadSizeInfo;
    }

    public void setIp29991TableLoadSizeInfo(Ip29991TableLoadSizeInfo ip29991TableLoadSizeInfo) {
        this.ip29991TableLoadSizeInfo = ip29991TableLoadSizeInfo;
    }
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip02014wTable getIp02014wTable() {
        if (ip02014wTable == null) {
            ip02014wTable = globalCtx.getGlobalDto(Ip02014wTable.class);
        }

        return ip02014wTable;
    }

    public Ip28221PaTableRestart getIp28221PaTableRestart() {
        if (ip28221PaTableRestart == null) {
            ip28221PaTableRestart = new Ip28221PaTableRestart();
        }

        return ip28221PaTableRestart;
    }

    public void setIp28221PaTableRestart(Ip28221PaTableRestart ip28221PaTableRestart) {
        this.ip28221PaTableRestart = ip28221PaTableRestart;
    }
    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }


    public int getIp02015PaIndex() {
        return ip02015PaIndex;
    }

    public void setIp02015PaIndex(int ip02015PaIndex) {
        this.ip02015PaIndex = ip02015PaIndex;
    }
    public int getIp02014wPaIndex() {
        return ip02014wPaIndex;
    }

    public void setIp02014wPaIndex(int ip02014wPaIndex) {
        this.ip02014wPaIndex = ip02014wPaIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += abendParaName900.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
        str += ip02014lPrcssAgrmtTable.hashCode();
        str += ip29991TableLoadSizeInfo.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip02014wTable.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public Ip282210Ctx clone() {
        Ip282210Ctx cloneObj = new Ip282210Ctx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        cloneObj.ip02014lPrcssAgrmtTable = new Ip02014lPrcssAgrmtTable();
        cloneObj.ip02014lPrcssAgrmtTable.set(ip02014lPrcssAgrmtTable.getClonedField());
        cloneObj.ip29991TableLoadSizeInfo = new Ip29991TableLoadSizeInfo();
        cloneObj.ip29991TableLoadSizeInfo.set(ip29991TableLoadSizeInfo.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip02014wTable = new Ip02014wTable();
        cloneObj.ip02014wTable.set(ip02014wTable.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Ip28221PaTableRestart ip28221PaTableRestart = Ip282210Ctx.this.getIp28221PaTableRestart();


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip28221PaTableRestart.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class LoadTableIp0201t1InCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip282210Ctx.this.getIp02014PrcssAgrmtTable();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip282210Ctx.this.getIp50005ClearingDtTm();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip282210Ctx.this.getIp28221PaTableRestart();
     Work work = Ip282210Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of ip02014PrcssAgrmtTable
	 *	@return ip02014PrcssAgrmtTable
	 */   
	 public Ip02014PrcssAgrmtTable getIp02014PrcssAgrmtTable() {
   	return ip02014PrcssAgrmtTable;
   }


	/**
	 *	Returns the value of ip50005ClearingDtTm
	 *	@return ip50005ClearingDtTm
	 */   
	 public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
   	return ip50005ClearingDtTm;
   }


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
	 *	Test condition "R" for isIp28221Ip282210Restart88()
	 *	@return  Returns true if isIp28221Ip282210Restart88() is "R"
	 */
   public boolean isIp28221Ip282210Restart88() throws CFException {
      return ip28221PaTableRestart.isIp28221Ip282210Restart88();
   }

	/**
	*  set values "R"
	*/
   	public void setIp28221Ip282210Restart88True()  throws CFException{  			
    	ip28221PaTableRestart.setIp28221Ip282210Restart88True();
   	}
	/**
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException  {              
   		return work.getAbendPgm300();
   }

  
	/**
	*  set variable abendPgm300
	*  @param value
	**/
   public void setAbendPgm300(char[] value) throws CFException {
      work.setAbendPgm300(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public LoadTableIp0201t1OutCtx getLoadTableIp0201t1OutCtx() {
            return new LoadTableIp0201t1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public LoadTableIp0201t1InCtx clone() {
        LoadTableIp0201t1InCtx cloneObj = new LoadTableIp0201t1InCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public LoadTableIp0201t1InCtx getLoadTableIp0201t1InCtx() {
            return new LoadTableIp0201t1InCtx();
    }
     public class LoadTableIp0201t1OutCtx implements Cloneable {
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip282210Ctx.this.getIp50005ClearingDtTm();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip282210Ctx.this.getIp28221PaTableRestart();
     Work work = Ip282210Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 

	/**
	 *	Returns the value of ip50005ClearingDtTm
	 *	@return ip50005ClearingDtTm
	 */   
	 public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
   	return ip50005ClearingDtTm;
   }


	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ip02014wEntriesCnt
	 *	@return ip02014wEntriesCnt
	 */
	public short getIp02014wEntriesCnt() throws CFException {        
   		return ip02014wEntriesCntGroup.getIp02014wEntriesCnt();
	}
	
	/**
	 * 	Update Ip02014wEntriesCnt with the passed value
	 *	@param number
	 */
	public void setIp02014wEntriesCnt(short number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt(number);
	}

	public void setIp02014wEntriesCnt(int number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
	}

	public void setIp02014wEntriesCnt(long number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005ClearingDtTm.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public LoadTableIp0201t1OutCtx clone() {
        LoadTableIp0201t1OutCtx cloneObj = new LoadTableIp0201t1OutCtx();
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public LoadTableIp0201t1OutCtx getLoadTableIp0201t1OutCtx() {
            return new LoadTableIp0201t1OutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip282210Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return work.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      work.setPgmIp996010300(value);
   } 

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip282210Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of ip996011WhenCompiled
	 *	@return ip996011WhenCompiled
	 */
   public char[] getIp996011WhenCompiled() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011WhenCompiled();
   }

  
	/**
	*  set variable ip996011WhenCompiled
	*  @param value
	**/
   public void setIp996011WhenCompiled(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(value);
   } 

     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex);
   	
   }
   
   public void setIp996011WhenCompiled(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011WhenCompiled with another Field
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source);
   }  
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 

	/**
	 *	Returns the value of ip996011PgmVersion
	 *	@return ip996011PgmVersion
	 */
   public char[] getIp996011PgmVersion() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmVersion();
   }

  
	/**
	*  set variable ip996011PgmVersion
	*  @param value
	**/
   public void setIp996011PgmVersion(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(value);
   } 

     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmVersion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmVersion with another Field
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source);
   }  
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException  {              
   		return work.getPtrIp996010800();
   }

  
	/**
	*  set variable ptrIp996010800
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) throws CFException {
      work.setPtrIp996010800(value);
   } 

	/**
	 *	Returns the value of ip996011PgmId
	 *	@return ip996011PgmId
	 */
   public char[] getIp996011PgmId() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmId();
   }

  
	/**
	*  set variable ip996011PgmId
	*  @param value
	**/
   public void setIp996011PgmId(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(value);
   } 

     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmId with another Field
	 *	@param value
	 */
   public void setIp996011PgmId(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmId(source);
   }  
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class GetTableKeyDtTmInCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();

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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public GetTableKeyDtTmInCtx clone() {
        GetTableKeyDtTmInCtx cloneObj = new GetTableKeyDtTmInCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetTableKeyDtTmInCtx getGetTableKeyDtTmInCtx() {
            return new GetTableKeyDtTmInCtx();
    }
     public class GetTableKeyDtTmOutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();

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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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

    public GetTableKeyDtTmOutCtx clone() {
        GetTableKeyDtTmOutCtx cloneObj = new GetTableKeyDtTmOutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetTableKeyDtTmOutCtx getGetTableKeyDtTmOutCtx() {
            return new GetTableKeyDtTmOutCtx();
    }
     public class LoadLpaTblInCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();

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
	 *	Returns the value of lastKeyDtTm800
	 *	@return lastKeyDtTm800
	 */
   public char[] getLastKeyDtTm800() throws CFException  {              
   		return work.getLastKeyDtTm800();
   }

  
	/**
	*  set variable lastKeyDtTm800
	*  @param value
	**/
   public void setLastKeyDtTm800(char[] value) throws CFException {
      work.setLastKeyDtTm800(value);
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public LoadLpaTblOutCtx getLoadLpaTblOutCtx() {
            return new LoadLpaTblOutCtx();
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

    public LoadLpaTblInCtx clone() {
        LoadLpaTblInCtx cloneObj = new LoadLpaTblInCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadLpaTblInCtx getLoadLpaTblInCtx() {
            return new LoadLpaTblInCtx();
    }
     public class LoadLpaTblOutCtx implements Cloneable {
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();

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


	/**
	 *	Returns the value of lastKeyDtTm800
	 *	@return lastKeyDtTm800
	 */
   public char[] getLastKeyDtTm800() throws CFException  {              
   		return work.getLastKeyDtTm800();
   }

  
	/**
	*  set variable lastKeyDtTm800
	*  @param value
	**/
   public void setLastKeyDtTm800(char[] value) throws CFException {
      work.setLastKeyDtTm800(value);
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
	 *	Returns the value of rowCount400
	 *	@return rowCount400
	 */
	public int getRowCount400() throws CFException {        
   		return work.getRowCount400();
	}
	
	/**
	 * 	Update RowCount400 with the passed value
	 *	@param number
	 */
	public void setRowCount400(int number)  throws CFException{
		work.setRowCount400(number);
	}


	public void setRowCount400(long number)  throws CFException{
		work.setRowCount400((int)number);
	}


	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}



        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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

    public LoadLpaTblOutCtx clone() {
        LoadLpaTblOutCtx cloneObj = new LoadLpaTblOutCtx();
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadLpaTblOutCtx getLoadLpaTblOutCtx() {
            return new LoadLpaTblOutCtx();
    }
     public class LoadLpaEntriesInCtx implements Cloneable {
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = Ip282210Ctx.this.getIp50005OneDayRec();

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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public LoadLpaEntriesOutCtx getLoadLpaEntriesOutCtx() {
            return new LoadLpaEntriesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02015PrcssAgrmtTable.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public LoadLpaEntriesInCtx clone() {
        LoadLpaEntriesInCtx cloneObj = new LoadLpaEntriesInCtx();
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public LoadLpaEntriesInCtx getLoadLpaEntriesInCtx() {
            return new LoadLpaEntriesInCtx();
    }
     public class LoadLpaEntriesOutCtx implements Cloneable {
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Ip00054TableEntry ip00054TableEntry = Ip282210Ctx.this.getIp00054TableEntry();
     Work work = Ip282210Ctx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = Ip282210Ctx.this.getIp50005OneDayRec();

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
	 *	Returns the value of ip02015PasFoundCount
	 *	@return ip02015PasFoundCount
	 */
	public int getIp02015PasFoundCount() throws CFException {        
   		return ip02015PrcssAgrmtTable.getIp02015PasFoundCount();
	}
	
	/**
	 * 	Update Ip02015PasFoundCount with the passed value
	 *	@param number
	 */
	public void setIp02015PasFoundCount(int number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount(number);
	}


	public void setIp02015PasFoundCount(long number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount((int)number);
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
	 *	Test condition "N" for isLpaRecNotOver88100()
	 *	@return  Returns true if isLpaRecNotOver88100() is "N"
	 */
   public boolean isLpaRecNotOver88100() throws CFException {
      return work.isLpaRecNotOver88100();
   }

	/**
	*  set values "N"
	*/
   	public void setLpaRecNotOver88100True()  throws CFException{  			
    	work.setLpaRecNotOver88100True();
   	}
	/**
	 *	Test condition "Y" for isLpaRecOver88100()
	 *	@return  Returns true if isLpaRecOver88100() is "Y"
	 */
   public boolean isLpaRecOver88100() throws CFException {
      return work.isLpaRecOver88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setLpaRecOver88100True()  throws CFException{  			
    	work.setLpaRecOver88100True();
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02015PrcssAgrmtTable.hashCode();
        str += ip00054TableEntry.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public LoadLpaEntriesOutCtx clone() {
        LoadLpaEntriesOutCtx cloneObj = new LoadLpaEntriesOutCtx();
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.ip00054TableEntry = new Ip00054TableEntry();
        cloneObj.ip00054TableEntry.set(ip00054TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public LoadLpaEntriesOutCtx getLoadLpaEntriesOutCtx() {
            return new LoadLpaEntriesOutCtx();
    }
     public class GetFromOneDayFileInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip282210Ctx.this.getIp50005OneDayReadStatusGroup();

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
	 *	Returns the value of table201AbsentInOdf610
	 *	@return table201AbsentInOdf610
	 */
   public char[] getTable201AbsentInOdf610() throws CFException  {              
   		return work.getTable201AbsentInOdf610();
   }

  
	/**
	*  set variable table201AbsentInOdf610
	*  @param value
	**/
   public void setTable201AbsentInOdf610(char[] value) throws CFException {
      work.setTable201AbsentInOdf610(value);
   } 

	/**
	 *	Returns the value of para1311300
	 *	@return para1311300
	 */
   public char[] getPara1311300() throws CFException  {              
   		return work.getPara1311300();
   }

  
	/**
	*  set variable para1311300
	*  @param value
	**/
   public void setPara1311300(char[] value) throws CFException {
      work.setPara1311300(value);
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
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
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
	 *	Returns the value of noTable201InOdf300
	 *	@return noTable201InOdf300
	 */
   public char[] getNoTable201InOdf300() throws CFException  {              
   		return work.getNoTable201InOdf300();
   }

  
	/**
	*  set variable noTable201InOdf300
	*  @param value
	**/
   public void setNoTable201InOdf300(char[] value) throws CFException {
      work.setNoTable201InOdf300(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileInCtx clone() {
        GetFromOneDayFileInCtx cloneObj = new GetFromOneDayFileInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileInCtx getGetFromOneDayFileInCtx() {
            return new GetFromOneDayFileInCtx();
    }
     public class GetFromOneDayFileOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip282210Ctx.this.getIp50005OneDayReadStatusGroup();

	/**
	 *	Returns the value of table201AbsentInOdf610
	 *	@return table201AbsentInOdf610
	 */
   public char[] getTable201AbsentInOdf610() throws CFException  {              
   		return work.getTable201AbsentInOdf610();
   }

  
	/**
	*  set variable table201AbsentInOdf610
	*  @param value
	**/
   public void setTable201AbsentInOdf610(char[] value) throws CFException {
      work.setTable201AbsentInOdf610(value);
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
	 *	Returns the value of para1311300
	 *	@return para1311300
	 */
   public char[] getPara1311300() throws CFException  {              
   		return work.getPara1311300();
   }

  
	/**
	*  set variable para1311300
	*  @param value
	**/
   public void setPara1311300(char[] value) throws CFException {
      work.setPara1311300(value);
   } 

	/**
	 *	Returns the value of rowCount400
	 *	@return rowCount400
	 */
	public int getRowCount400() throws CFException {        
   		return work.getRowCount400();
	}
	
	/**
	 * 	Update RowCount400 with the passed value
	 *	@param number
	 */
	public void setRowCount400(int number)  throws CFException{
		work.setRowCount400(number);
	}


	public void setRowCount400(long number)  throws CFException{
		work.setRowCount400((int)number);
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
	 *	Test condition "Y" for isLpaRecOver88100()
	 *	@return  Returns true if isLpaRecOver88100() is "Y"
	 */
   public boolean isLpaRecOver88100() throws CFException {
      return work.isLpaRecOver88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setLpaRecOver88100True()  throws CFException{  			
    	work.setLpaRecOver88100True();
   	}
	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
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
	 *	Returns the value of noTable201InOdf300
	 *	@return noTable201InOdf300
	 */
   public char[] getNoTable201InOdf300() throws CFException  {              
   		return work.getNoTable201InOdf300();
   }

  
	/**
	*  set variable noTable201InOdf300
	*  @param value
	**/
   public void setNoTable201InOdf300(char[] value) throws CFException {
      work.setNoTable201InOdf300(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
       return str.hashCode();
    }

    public GetFromOneDayFileOutCtx clone() {
        GetFromOneDayFileOutCtx cloneObj = new GetFromOneDayFileOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        return cloneObj;
    }

    }

    public GetFromOneDayFileOutCtx getGetFromOneDayFileOutCtx() {
            return new GetFromOneDayFileOutCtx();
    }
     public class _10LoadToIp0201t1TableInCtx implements Cloneable {
     Ip02014wTable ip02014wTable = Ip282210Ctx.this.getIp02014wTable();
     Ip50005OneDayRec ip50005OneDayRec = Ip282210Ctx.this.getIp50005OneDayRec();
     Work work = Ip282210Ctx.this.getWork();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

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
	 *	Returns the value of ip02014wEntriesCnt
	 *	@return ip02014wEntriesCnt
	 */
	public short getIp02014wEntriesCnt() throws CFException {        
   		return ip02014wEntriesCntGroup.getIp02014wEntriesCnt();
	}
	
	/**
	 * 	Update Ip02014wEntriesCnt with the passed value
	 *	@param number
	 */
	public void setIp02014wEntriesCnt(short number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt(number);
	}

	public void setIp02014wEntriesCnt(int number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
	}

	public void setIp02014wEntriesCnt(long number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
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
	 *	Returns the value of ip02014wTable
	 *	@return ip02014wTable
	 */   
	 public Ip02014wTable getIp02014wTable() {
   	return ip02014wTable;
   }


	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
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
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
   }



        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public _10LoadToIp0201t1TableOutCtx get_10LoadToIp0201t1TableOutCtx() {
            return new _10LoadToIp0201t1TableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014wTable.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public _10LoadToIp0201t1TableInCtx clone() {
        _10LoadToIp0201t1TableInCtx cloneObj = new _10LoadToIp0201t1TableInCtx();
        cloneObj.ip02014wTable = new Ip02014wTable();
        cloneObj.ip02014wTable.set(ip02014wTable.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public _10LoadToIp0201t1TableInCtx get_10LoadToIp0201t1TableInCtx() {
            return new _10LoadToIp0201t1TableInCtx();
    }
     public class _10LoadToIp0201t1TableOutCtx implements Cloneable {
     Ip02014wTable ip02014wTable = Ip282210Ctx.this.getIp02014wTable();
     Work work = Ip282210Ctx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = Ip282210Ctx.this.getIp50005OneDayRec();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

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
	 *	Returns the value of ip02014wEntriesCnt
	 *	@return ip02014wEntriesCnt
	 */
	public short getIp02014wEntriesCnt() throws CFException {        
   		return ip02014wEntriesCntGroup.getIp02014wEntriesCnt();
	}
	
	/**
	 * 	Update Ip02014wEntriesCnt with the passed value
	 *	@param number
	 */
	public void setIp02014wEntriesCnt(short number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt(number);
	}

	public void setIp02014wEntriesCnt(int number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
	}

	public void setIp02014wEntriesCnt(long number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
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
	 *	Returns the value of ip02014wTable
	 *	@return ip02014wTable
	 */   
	 public Ip02014wTable getIp02014wTable() {
   	return ip02014wTable;
   }


	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}



        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014wTable.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public _10LoadToIp0201t1TableOutCtx clone() {
        _10LoadToIp0201t1TableOutCtx cloneObj = new _10LoadToIp0201t1TableOutCtx();
        cloneObj.ip02014wTable = new Ip02014wTable();
        cloneObj.ip02014wTable.set(ip02014wTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public _10LoadToIp0201t1TableOutCtx get_10LoadToIp0201t1TableOutCtx() {
            return new _10LoadToIp0201t1TableOutCtx();
    }
     public class _11CheckOnedayRecLenInCtx implements Cloneable {
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip282210Ctx.this.getIp50005OneDayRecLthGroup();
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     OneDayRecLengthError620 oneDayRecLengthError620 = Ip282210Ctx.this.getOneDayRecLengthError620();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();

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
	 *	Returns the value of para131111300
	 *	@return para131111300
	 */
   public char[] getPara131111300() throws CFException  {              
   		return work.getPara131111300();
   }

  
	/**
	*  set variable para131111300
	*  @param value
	**/
   public void setPara131111300(char[] value) throws CFException {
      work.setPara131111300(value);
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public _11CheckOnedayRecLenOutCtx get_11CheckOnedayRecLenOutCtx() {
            return new _11CheckOnedayRecLenOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendParaName900.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public _11CheckOnedayRecLenInCtx clone() {
        _11CheckOnedayRecLenInCtx cloneObj = new _11CheckOnedayRecLenInCtx();
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public _11CheckOnedayRecLenInCtx get_11CheckOnedayRecLenInCtx() {
            return new _11CheckOnedayRecLenInCtx();
    }
     public class _11CheckOnedayRecLenOutCtx implements Cloneable {
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip282210Ctx.this.getIp50005OneDayRecLthGroup();
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     OneDayRecLengthError620 oneDayRecLengthError620 = Ip282210Ctx.this.getOneDayRecLengthError620();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();

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
	 *	Returns the value of para131111300
	 *	@return para131111300
	 */
   public char[] getPara131111300() throws CFException  {              
   		return work.getPara131111300();
   }

  
	/**
	*  set variable para131111300
	*  @param value
	**/
   public void setPara131111300(char[] value) throws CFException {
      work.setPara131111300(value);
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
	 *	Returns the value of oneDayRecLengthError620
	 *	@return oneDayRecLengthError620
	 */   
	 public OneDayRecLengthError620 getOneDayRecLengthError620() {
   	return oneDayRecLengthError620;
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayRecLthGroup.hashCode();
        str += abendParaName900.hashCode();
        str += oneDayRecLengthError620.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public _11CheckOnedayRecLenOutCtx clone() {
        _11CheckOnedayRecLenOutCtx cloneObj = new _11CheckOnedayRecLenOutCtx();
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.oneDayRecLengthError620 = new OneDayRecLengthError620();
        cloneObj.oneDayRecLengthError620.set(oneDayRecLengthError620.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public _11CheckOnedayRecLenOutCtx get_11CheckOnedayRecLenOutCtx() {
            return new _11CheckOnedayRecLenOutCtx();
    }
     public class _12CheckTableLimitInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();

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
	 *	Returns the value of para131112300
	 *	@return para131112300
	 */
   public char[] getPara131112300() throws CFException  {              
   		return work.getPara131112300();
   }

  
	/**
	*  set variable para131112300
	*  @param value
	**/
   public void setPara131112300(char[] value) throws CFException {
      work.setPara131112300(value);
   } 

	/**
	 *	Returns the value of ip02014wEntries
	 *	@return ip02014wEntries
	 */
	public short getIp02014wEntries() throws CFException {        
   		return work.getIp02014wEntries();
	}
	
	/**
	 * 	Update Ip02014wEntries with the passed value
	 *	@param number
	 */
	public void setIp02014wEntries(short number)  throws CFException{
		work.setIp02014wEntries(number);
	}

	public void setIp02014wEntries(int number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}

	public void setIp02014wEntries(long number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}



	/**
	 *	Returns the value of ip02014TblOverflowErr600
	 *	@return ip02014TblOverflowErr600
	 */
   public char[] getIp02014TblOverflowErr600() throws CFException  {              
   		return work.getIp02014TblOverflowErr600();
   }

  
	/**
	*  set variable ip02014TblOverflowErr600
	*  @param value
	**/
   public void setIp02014TblOverflowErr600(char[] value) throws CFException {
      work.setIp02014TblOverflowErr600(value);
   } 

	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public _12CheckTableLimitOutCtx get_12CheckTableLimitOutCtx() {
            return new _12CheckTableLimitOutCtx();
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
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public _12CheckTableLimitInCtx clone() {
        _12CheckTableLimitInCtx cloneObj = new _12CheckTableLimitInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public _12CheckTableLimitInCtx get_12CheckTableLimitInCtx() {
            return new _12CheckTableLimitInCtx();
    }
     public class _12CheckTableLimitOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();

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
	 *	Returns the value of para131112300
	 *	@return para131112300
	 */
   public char[] getPara131112300() throws CFException  {              
   		return work.getPara131112300();
   }

  
	/**
	*  set variable para131112300
	*  @param value
	**/
   public void setPara131112300(char[] value) throws CFException {
      work.setPara131112300(value);
   } 

	/**
	 *	Returns the value of ip02014TblOverflowErr600
	 *	@return ip02014TblOverflowErr600
	 */
   public char[] getIp02014TblOverflowErr600() throws CFException  {              
   		return work.getIp02014TblOverflowErr600();
   }

  
	/**
	*  set variable ip02014TblOverflowErr600
	*  @param value
	**/
   public void setIp02014TblOverflowErr600(char[] value) throws CFException {
      work.setIp02014TblOverflowErr600(value);
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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public _12CheckTableLimitOutCtx clone() {
        _12CheckTableLimitOutCtx cloneObj = new _12CheckTableLimitOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public _12CheckTableLimitOutCtx get_12CheckTableLimitOutCtx() {
            return new _12CheckTableLimitOutCtx();
    }
     public class LoadToIp02015t1TableInCtx implements Cloneable {
     Ip02014wTable ip02014wTable = Ip282210Ctx.this.getIp02014wTable();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Work work = Ip282210Ctx.this.getWork();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

	/**
	 *	Returns the value of ip02014wCurrSplitCd
	 *	@return ip02014wCurrSplitCd
	 */
   public char[] getIp02014wCurrSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCurrSplitCd();
   }

  
	/**
	*  set variable ip02014wCurrSplitCd
	*  @param value
	**/
   public void setIp02014wCurrSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wCurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wHostInd
	 *	@return ip02014wHostInd
	 */
   public char[] getIp02014wHostInd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wHostInd();
   }

  
	/**
	*  set variable ip02014wHostInd
	*  @param value
	**/
   public void setIp02014wHostInd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(value);
   } 

     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex);
   	
   }
   
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wHostInd with another Field
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source);
   }  
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMrchntSplitCd
	 *	@return ip02014wMrchntSplitCd
	 */
   public char[] getIp02014wMrchntSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMrchntSplitCd();
   }

  
	/**
	*  set variable ip02014wMrchntSplitCd
	*  @param value
	**/
   public void setIp02014wMrchntSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wGftOnsoilSw
	 *	@return ip02014wGftOnsoilSw
	 */
   public char[] getIp02014wGftOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGftOnsoilSw();
   }

  
	/**
	*  set variable ip02014wGftOnsoilSw
	*  @param value
	**/
   public void setIp02014wGftOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wGftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wAcquirerSplitCd
	 *	@return ip02014wAcquirerSplitCd
	 */
   public char[] getIp02014wAcquirerSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAcquirerSplitCd();
   }

  
	/**
	*  set variable ip02014wAcquirerSplitCd
	*  @param value
	**/
   public void setIp02014wAcquirerSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wBllngOnsoilSw
	 *	@return ip02014wBllngOnsoilSw
	 */
   public char[] getIp02014wBllngOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBllngOnsoilSw();
   }

  
	/**
	*  set variable ip02014wBllngOnsoilSw
	*  @param value
	**/
   public void setIp02014wBllngOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wBllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrPrcssCd
	 *	@return ip02014wClrPrcssCd
	 */
   public char[] getIp02014wClrPrcssCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrPrcssCd();
   }

  
	/**
	*  set variable ip02014wClrPrcssCd
	*  @param value
	**/
   public void setIp02014wClrPrcssCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(value);
   } 

     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source);
   }  
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wPushOnsoilSw
	 *	@return ip02014wPushOnsoilSw
	 */
   public char[] getIp02014wPushOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wPushOnsoilSw();
   }

  
	/**
	*  set variable ip02014wPushOnsoilSw
	*  @param value
	**/
   public void setIp02014wPushOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wPushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDtaWrhsOnsoilSw
	 *	@return ip02014wDtaWrhsOnsoilSw
	 */
   public char[] getIp02014wDtaWrhsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDtaWrhsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wDtaWrhsOnsoilSw
	*  @param value
	**/
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDomCollOnlyCd
	 *	@return ip02014wDomCollOnlyCd
	 */
   public char[] getIp02014wDomCollOnlyCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDomCollOnlyCd();
   }

  
	/**
	*  set variable ip02014wDomCollOnlyCd
	*  @param value
	**/
   public void setIp02014wDomCollOnlyCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(value);
   } 

     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source);
   }  
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wRptHdrName
	 *	@return ip02014wRptHdrName
	 */
   public char[] getIp02014wRptHdrName(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wRptHdrName();
   }

  
	/**
	*  set variable ip02014wRptHdrName
	*  @param value
	**/
   public void setIp02014wRptHdrName(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(value);
   } 

     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex);
   	
   }
   
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wRptHdrName with another Field
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source);
   }  
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wSetlOnsoilSw
	 *	@return ip02014wSetlOnsoilSw
	 */
   public char[] getIp02014wSetlOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wSetlOnsoilSw();
   }

  
	/**
	*  set variable ip02014wSetlOnsoilSw
	*  @param value
	**/
   public void setIp02014wSetlOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wSetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wEsrvcOnsoilSw
	 *	@return ip02014wEsrvcOnsoilSw
	 */
   public char[] getIp02014wEsrvcOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wEsrvcOnsoilSw();
   }

  
	/**
	*  set variable ip02014wEsrvcOnsoilSw
	*  @param value
	**/
   public void setIp02014wEsrvcOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wEsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrOnsoilSw
	 *	@return ip02014wClrOnsoilSw
	 */
   public char[] getIp02014wClrOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrOnsoilSw();
   }

  
	/**
	*  set variable ip02014wClrOnsoilSw
	*  @param value
	**/
   public void setIp02014wClrOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMdesOnsoilSw
	 *	@return ip02014wMdesOnsoilSw
	 */
   public char[] getIp02014wMdesOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdesOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMdesOnsoilSw
	*  @param value
	**/
   public void setIp02014wMdesOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDbId
	 *	@return ip02014wDbId
	 */
   public char[] getIp02014wDbId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDbId();
   }

  
	/**
	*  set variable ip02014wDbId
	*  @param value
	**/
   public void setIp02014wDbId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(value);
   } 

     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDbId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex);
   	
   }
   
   public void setIp02014wDbId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDbId with another Field
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source);
   }  
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip282210Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip282210Ctx.this.ip02015PaIndex;
}
	/**
	 *	Returns the value of ip02014wMcomOnsoilSw
	 *	@return ip02014wMcomOnsoilSw
	 */
   public char[] getIp02014wMcomOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMcomOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMcomOnsoilSw
	*  @param value
	**/
   public void setIp02014wMcomOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMcomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wStndInOnsoilSw
	 *	@return ip02014wStndInOnsoilSw
	 */
   public char[] getIp02014wStndInOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wStndInOnsoilSw();
   }

  
	/**
	*  set variable ip02014wStndInOnsoilSw
	*  @param value
	**/
   public void setIp02014wStndInOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wStndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wAuthOnsoilSw
	 *	@return ip02014wAuthOnsoilSw
	 */
   public char[] getIp02014wAuthOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAuthOnsoilSw();
   }

  
	/**
	*  set variable ip02014wAuthOnsoilSw
	*  @param value
	**/
   public void setIp02014wAuthOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOnsoilDataShrSw
	 *	@return ip02014wOnsoilDataShrSw
	 */
   public char[] getIp02014wOnsoilDataShrSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnsoilDataShrSw();
   }

  
	/**
	*  set variable ip02014wOnsoilDataShrSw
	*  @param value
	**/
   public void setIp02014wOnsoilDataShrSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(value);
   } 

     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source);
   }  
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOnUsPrcssAgrmtId
	 *	@return ip02014wOnUsPrcssAgrmtId
	 */
   public char[] getIp02014wOnUsPrcssAgrmtId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnUsPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014wOnUsPrcssAgrmtId
	*  @param value
	**/
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isIp02014wPaIsHost88()
	 *	@return  Returns true if isIp02014wPaIsHost88() is "Y"
	 */
   public boolean isIp02014wPaIsHost88(int index) throws CFException {
      return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().isIp02014wPaIsHost88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp02014wPaIsHost88True(int index)  throws CFException{  			
    	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPaIsHost88True();
   	}

public void setIp02014wPaIndex(int ip02014wPaIndex) { 
    Ip282210Ctx.this.ip02014wPaIndex = ip02014wPaIndex;
}

public int getIp02014wPaIndex() { 
    return Ip282210Ctx.this.ip02014wPaIndex;
}
	/**
	 *	Returns the value of ip02014wOfsoilDataTypCd
	 *	@return ip02014wOfsoilDataTypCd
	 */
   public char[] getIp02014wOfsoilDataTypCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOfsoilDataTypCd();
   }

  
	/**
	*  set variable ip02014wOfsoilDataTypCd
	*  @param value
	**/
   public void setIp02014wOfsoilDataTypCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(value);
   } 

     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source);
   }  
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wImpBulkId
	 *	@return ip02014wImpBulkId
	 */   
	 public Ip02014wImpBulkId getIp02014wImpBulkId(int index) {
   	return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wImpBulkId();
   }

   /**
	* 	Update Ip02014wImpBulkId with the passed value
	*	@param value
	*/
   public void setIp02014wImpBulkId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(value);
   }   

     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source);
   }  
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source, int sourceIndex,int sourceLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wZappOnsoilSw
	 *	@return ip02014wZappOnsoilSw
	 */
   public char[] getIp02014wZappOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wZappOnsoilSw();
   }

  
	/**
	*  set variable ip02014wZappOnsoilSw
	*  @param value
	**/
   public void setIp02014wZappOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOperSysId
	 *	@return ip02014wOperSysId
	 */
   public char[] getIp02014wOperSysId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOperSysId();
   }

  
	/**
	*  set variable ip02014wOperSysId
	*  @param value
	**/
   public void setIp02014wOperSysId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(value);
   } 

     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex);
   	
   }
   
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOperSysId with another Field
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source);
   }  
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wCemOnsoilSw
	 *	@return ip02014wCemOnsoilSw
	 */
   public char[] getIp02014wCemOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCemOnsoilSw();
   }

  
	/**
	*  set variable ip02014wCemOnsoilSw
	*  @param value
	**/
   public void setIp02014wCemOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wCemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public int getIp02014wNumCurrCd(int index) throws CFException {
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wNumCurrCd();
	}


	/**
	 *	Returns String value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public char[]  getIp02014wNumCurrCdString(int index) throws CFException {
	     return String.valueOf(ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wNumCurrCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wNumCurrCdIsNumeric(int index)  throws CFException{
	    return ip02014wTable.getIp02014wPrcsAgrmtTable(index - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().ip02014wNumCurrCdIsNumeric();
	}

	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *	@param number
	 */
	public void setIp02014wNumCurrCd(int index,int number)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(number);
	}
	

	public void setIp02014wNumCurrCd(int index,long number)  throws CFException{
	    ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(number);
	}
	
	
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCd(int index,char[] value)  throws CFException {
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(value);
	}
	
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCdString(int index,char[] value)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(value);
	}	

	/**
	 *	Returns the value of ip02014wAmsOnsoilSw
	 *	@return ip02014wAmsOnsoilSw
	 */
   public char[] getIp02014wAmsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAmsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wAmsOnsoilSw
	*  @param value
	**/
   public void setIp02014wAmsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wGeoScopeCode
	 *	@return ip02014wGeoScopeCode
	 */
   public char[] getIp02014wGeoScopeCode(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGeoScopeCode();
   }

  
	/**
	*  set variable ip02014wGeoScopeCode
	*  @param value
	**/
   public void setIp02014wGeoScopeCode(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(value);
   } 

     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex);
   	
   }
   
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source);
   }  
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wEntriesCnt
	 *	@return ip02014wEntriesCnt
	 */
	public short getIp02014wEntriesCnt() throws CFException {        
   		return ip02014wEntriesCntGroup.getIp02014wEntriesCnt();
	}
	
	/**
	 * 	Update Ip02014wEntriesCnt with the passed value
	 *	@param number
	 */
	public void setIp02014wEntriesCnt(short number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt(number);
	}

	public void setIp02014wEntriesCnt(int number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
	}

	public void setIp02014wEntriesCnt(long number)  throws CFException{
		ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short)number);
	}



	/**
	 *	Returns the value of ip02014wBnknetOnsoilSw
	 *	@return ip02014wBnknetOnsoilSw
	 */
   public char[] getIp02014wBnknetOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBnknetOnsoilSw();
   }

  
	/**
	*  set variable ip02014wBnknetOnsoilSw
	*  @param value
	**/
   public void setIp02014wBnknetOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wBnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public int getIp02014wClrCycleNum(int index) throws CFException {
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrCycleNum();
	}


	/**
	 *	Returns String value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public char[]  getIp02014wClrCycleNumString(int index) throws CFException {
	     return String.valueOf(ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrCycleNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wClrCycleNumIsNumeric(int index)  throws CFException{
	    return ip02014wTable.getIp02014wPrcsAgrmtTable(index - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().ip02014wClrCycleNumIsNumeric();
	}

	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *	@param number
	 */
	public void setIp02014wClrCycleNum(int index,int number)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(number);
	}
	

	public void setIp02014wClrCycleNum(int index,long number)  throws CFException{
	    ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(number);
	}
	
	
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNum(int index,char[] value)  throws CFException {
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(value);
	}
	
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNumString(int index,char[] value)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(value);
	}	

	/**
	 *	Returns the value of ip02014wPrcssAgrmtId
	 *	@return ip02014wPrcssAgrmtId
	 */
   public char[] getIp02014wPrcssAgrmtId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().getIp02014wPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014wPrcssAgrmtId
	*  @param value
	**/
   public void setIp02014wPrcssAgrmtId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMdsOnsoilSw
	 *	@return ip02014wMdsOnsoilSw
	 */
   public char[] getIp02014wMdsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMdsOnsoilSw
	*  @param value
	**/
   public void setIp02014wMdsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip02014wIncontrolOnsoilSw
	 *	@return ip02014wIncontrolOnsoilSw
	 */
   public char[] getIp02014wIncontrolOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wIncontrolOnsoilSw();
   }

  
	/**
	*  set variable ip02014wIncontrolOnsoilSw
	*  @param value
	**/
   public void setIp02014wIncontrolOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wIncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public LoadToIp02015t1TableOutCtx getLoadToIp02015t1TableOutCtx() {
            return new LoadToIp02015t1TableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014wTable.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += work.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public LoadToIp02015t1TableInCtx clone() {
        LoadToIp02015t1TableInCtx cloneObj = new LoadToIp02015t1TableInCtx();
        cloneObj.ip02014wTable = new Ip02014wTable();
        cloneObj.ip02014wTable.set(ip02014wTable.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public LoadToIp02015t1TableInCtx getLoadToIp02015t1TableInCtx() {
            return new LoadToIp02015t1TableInCtx();
    }
     public class LoadToIp02015t1TableOutCtx implements Cloneable {
     Ip02014wTable ip02014wTable = Ip282210Ctx.this.getIp02014wTable();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Work work = Ip282210Ctx.this.getWork();
     Ip02014wEntriesCntGroup ip02014wEntriesCntGroup = Ip282210Ctx.this.getIp02014wEntriesCntGroup();

	/**
	 *	Returns the value of ip02015MrchntSplitCd
	 *	@return ip02015MrchntSplitCd
	 */
   public char[] getIp02015MrchntSplitCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015MrchntSplitCd();
   }

  
	/**
	*  set variable ip02015MrchntSplitCd
	*  @param value
	**/
   public void setIp02015MrchntSplitCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(value);
   } 

     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02015MrchntSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015MrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015HostPrcssAgrmtId
	 *	@return ip02015HostPrcssAgrmtId
	 */
   public char[] getIp02015HostPrcssAgrmtId() throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015HostPrcssAgrmtId
	*  @param value
	**/
   public void setIp02015HostPrcssAgrmtId(char[] value) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ClrCycleNum
	 *	@return ip02015ClrCycleNum
	 */
	public int getIp02015ClrCycleNum(int index) throws CFException {
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ClrCycleNum();
	}


	/**
	 *	Returns String value of ip02015ClrCycleNum
	 *	@return ip02015ClrCycleNum
	 */
	public char[]  getIp02015ClrCycleNumString(int index) throws CFException {
	     return String.valueOf(ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ClrCycleNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02015ClrCycleNumIsNumeric(int index)  throws CFException{
	    return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index - 1).ip02015ClrCycleNumIsNumeric();
	}

	/**
	 * 	Update Ip02015ClrCycleNum with the passed value
	 *	@param number
	 */
	public void setIp02015ClrCycleNum(int index,int number)  throws CFException{
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrCycleNum(number);
	}
	

	public void setIp02015ClrCycleNum(int index,long number)  throws CFException{
	    ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrCycleNum(number);
	}
	
	
	/**
	 * 	Update Ip02015ClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02015ClrCycleNum(int index,char[] value)  throws CFException {
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrCycleNum(value);
	}
	
	/**
	 * 	Update Ip02015ClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02015ClrCycleNumString(int index,char[] value)  throws CFException{
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrCycleNum(value);
	}	

	/**
	 *	Returns the value of ip02015AcquirerSplitCd
	 *	@return ip02015AcquirerSplitCd
	 */
   public char[] getIp02015AcquirerSplitCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015AcquirerSplitCd();
   }

  
	/**
	*  set variable ip02015AcquirerSplitCd
	*  @param value
	**/
   public void setIp02015AcquirerSplitCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(value);
   } 

     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02015AcquirerSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015AcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrPrcssCd
	 *	@return ip02014wClrPrcssCd
	 */
   public char[] getIp02014wClrPrcssCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrPrcssCd();
   }

  
	/**
	*  set variable ip02014wClrPrcssCd
	*  @param value
	**/
   public void setIp02014wClrPrcssCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(value);
   } 

     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source);
   }  
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wPushOnsoilSw
	 *	@return ip02014wPushOnsoilSw
	 */
   public char[] getIp02014wPushOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wPushOnsoilSw();
   }

  
	/**
	*  set variable ip02014wPushOnsoilSw
	*  @param value
	**/
   public void setIp02014wPushOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wPushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wPushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015BllngOnsoilSw
	 *	@return ip02015BllngOnsoilSw
	 */
   public char[] getIp02015BllngOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015BllngOnsoilSw();
   }

  
	/**
	*  set variable ip02015BllngOnsoilSw
	*  @param value
	**/
   public void setIp02015BllngOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015BllngOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015BllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wRptHdrName
	 *	@return ip02014wRptHdrName
	 */
   public char[] getIp02014wRptHdrName(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wRptHdrName();
   }

  
	/**
	*  set variable ip02014wRptHdrName
	*  @param value
	**/
   public void setIp02014wRptHdrName(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(value);
   } 

     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex);
   	
   }
   
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wRptHdrName with another Field
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source);
   }  
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wRptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015EsrvcOnsoilSw
	 *	@return ip02015EsrvcOnsoilSw
	 */
   public char[] getIp02015EsrvcOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015EsrvcOnsoilSw();
   }

  
	/**
	*  set variable ip02015EsrvcOnsoilSw
	*  @param value
	**/
   public void setIp02015EsrvcOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015EsrvcOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015EsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015EsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wEsrvcOnsoilSw
	 *	@return ip02014wEsrvcOnsoilSw
	 */
   public char[] getIp02014wEsrvcOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wEsrvcOnsoilSw();
   }

  
	/**
	*  set variable ip02014wEsrvcOnsoilSw
	*  @param value
	**/
   public void setIp02014wEsrvcOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wEsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wEsrvcOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015SetlOnsoilSw
	 *	@return ip02015SetlOnsoilSw
	 */
   public char[] getIp02015SetlOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015SetlOnsoilSw();
   }

  
	/**
	*  set variable ip02015SetlOnsoilSw
	*  @param value
	**/
   public void setIp02015SetlOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015SetlOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015SetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015SetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMdesOnsoilSw
	 *	@return ip02014wMdesOnsoilSw
	 */
   public char[] getIp02014wMdesOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdesOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMdesOnsoilSw
	*  @param value
	**/
   public void setIp02014wMdesOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDbId
	 *	@return ip02014wDbId
	 */
   public char[] getIp02014wDbId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDbId();
   }

  
	/**
	*  set variable ip02014wDbId
	*  @param value
	**/
   public void setIp02014wDbId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(value);
   } 

     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDbId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex);
   	
   }
   
   public void setIp02014wDbId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDbId with another Field
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source);
   }  
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip282210Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip282210Ctx.this.ip02015PaIndex;
}
	/**
	 *	Returns the value of ip02015CemOnsoilSw
	 *	@return ip02015CemOnsoilSw
	 */
   public char[] getIp02015CemOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015CemOnsoilSw();
   }

  
	/**
	*  set variable ip02015CemOnsoilSw
	*  @param value
	**/
   public void setIp02015CemOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015CemOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015CemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015DomCollOnlyCd
	 *	@return ip02015DomCollOnlyCd
	 */
   public char[] getIp02015DomCollOnlyCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015DomCollOnlyCd();
   }

  
	/**
	*  set variable ip02015DomCollOnlyCd
	*  @param value
	**/
   public void setIp02015DomCollOnlyCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(value);
   } 

     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source, sourceIndex);
   	
   }
   
   public void setIp02015DomCollOnlyCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015DomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source);
   }  
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015GeoScopeCode
	 *	@return ip02015GeoScopeCode
	 */
   public char[] getIp02015GeoScopeCode(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015GeoScopeCode();
   }

  
	/**
	*  set variable ip02015GeoScopeCode
	*  @param value
	**/
   public void setIp02015GeoScopeCode(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(value);
   } 

     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source, sourceIndex);
   	
   }
   
   public void setIp02015GeoScopeCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015GeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source);
   }  
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015MdsOnsoilSw
	 *	@return ip02015MdsOnsoilSw
	 */
   public char[] getIp02015MdsOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015MdsOnsoilSw();
   }

  
	/**
	*  set variable ip02015MdsOnsoilSw
	*  @param value
	**/
   public void setIp02015MdsOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015MdsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015MdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015McomOnsoilSw
	 *	@return ip02015McomOnsoilSw
	 */
   public char[] getIp02015McomOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015McomOnsoilSw();
   }

  
	/**
	*  set variable ip02015McomOnsoilSw
	*  @param value
	**/
   public void setIp02015McomOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015McomOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015McomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015McomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015OfsoilDataTypCd
	 *	@return ip02015OfsoilDataTypCd
	 */
   public char[] getIp02015OfsoilDataTypCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015OfsoilDataTypCd();
   }

  
	/**
	*  set variable ip02015OfsoilDataTypCd
	*  @param value
	**/
   public void setIp02015OfsoilDataTypCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(value);
   } 

     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source, sourceIndex);
   	
   }
   
   public void setIp02015OfsoilDataTypCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015OfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source);
   }  
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOfsoilDataTypCd
	 *	@return ip02014wOfsoilDataTypCd
	 */
   public char[] getIp02014wOfsoilDataTypCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOfsoilDataTypCd();
   }

  
	/**
	*  set variable ip02014wOfsoilDataTypCd
	*  @param value
	**/
   public void setIp02014wOfsoilDataTypCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(value);
   } 

     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source);
   }  
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOfsoilDataTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015CurrSplitCd
	 *	@return ip02015CurrSplitCd
	 */
   public char[] getIp02015CurrSplitCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015CurrSplitCd();
   }

  
	/**
	*  set variable ip02015CurrSplitCd
	*  @param value
	**/
   public void setIp02015CurrSplitCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(value);
   } 

     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02015CurrSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015CurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015CurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wImpBulkId
	 *	@return ip02014wImpBulkId
	 */   
	 public Ip02014wImpBulkId getIp02014wImpBulkId(int index) {
   	return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wImpBulkId();
   }

   /**
	* 	Update Ip02014wImpBulkId with the passed value
	*	@param value
	*/
   public void setIp02014wImpBulkId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(value);
   }   

     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source);
   }  
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source, int sourceIndex,int sourceLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wZappOnsoilSw
	 *	@return ip02014wZappOnsoilSw
	 */
   public char[] getIp02014wZappOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wZappOnsoilSw();
   }

  
	/**
	*  set variable ip02014wZappOnsoilSw
	*  @param value
	**/
   public void setIp02014wZappOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOperSysId
	 *	@return ip02014wOperSysId
	 */
   public char[] getIp02014wOperSysId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOperSysId();
   }

  
	/**
	*  set variable ip02014wOperSysId
	*  @param value
	**/
   public void setIp02014wOperSysId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(value);
   } 

     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex);
   	
   }
   
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOperSysId with another Field
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source);
   }  
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wCemOnsoilSw
	 *	@return ip02014wCemOnsoilSw
	 */
   public char[] getIp02014wCemOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCemOnsoilSw();
   }

  
	/**
	*  set variable ip02014wCemOnsoilSw
	*  @param value
	**/
   public void setIp02014wCemOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wCemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCemOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015HostInd
	 *	@return ip02015HostInd
	 */
   public char[] getIp02015HostInd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015HostInd();
   }

  
	/**
	*  set variable ip02015HostInd
	*  @param value
	**/
   public void setIp02015HostInd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(value);
   } 

     /**
	 * 	Update Ip02015HostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostInd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source, sourceIndex);
   	
   }
   
   public void setIp02015HostInd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostInd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostInd with another Field
	 *	@param value
	 */
   public void setIp02015HostInd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source);
   }  
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostInd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostInd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015HostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015MdesOnsoilSw
	 *	@return ip02015MdesOnsoilSw
	 */
   public char[] getIp02015MdesOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015MdesOnsoilSw();
   }

  
	/**
	*  set variable ip02015MdesOnsoilSw
	*  @param value
	**/
   public void setIp02015MdesOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015MdesOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015MdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015MdesOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wGeoScopeCode
	 *	@return ip02014wGeoScopeCode
	 */
   public char[] getIp02014wGeoScopeCode(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGeoScopeCode();
   }

  
	/**
	*  set variable ip02014wGeoScopeCode
	*  @param value
	**/
   public void setIp02014wGeoScopeCode(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(value);
   } 

     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex);
   	
   }
   
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source);
   }  
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015PasFoundCount
	 *	@return ip02015PasFoundCount
	 */
	public int getIp02015PasFoundCount() throws CFException {        
   		return ip02015PrcssAgrmtTable.getIp02015PasFoundCount();
	}
	
	/**
	 * 	Update Ip02015PasFoundCount with the passed value
	 *	@param number
	 */
	public void setIp02015PasFoundCount(int number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount(number);
	}


	public void setIp02015PasFoundCount(long number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount((int)number);
	}


	/**
	 *	Returns the value of ip02015AmsOnsoilSw
	 *	@return ip02015AmsOnsoilSw
	 */
   public char[] getIp02015AmsOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015AmsOnsoilSw();
   }

  
	/**
	*  set variable ip02015AmsOnsoilSw
	*  @param value
	**/
   public void setIp02015AmsOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015AmsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015AmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wPrcssAgrmtId
	 *	@return ip02014wPrcssAgrmtId
	 */
   public char[] getIp02014wPrcssAgrmtId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().getIp02014wPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014wPrcssAgrmtId
	*  @param value
	**/
   public void setIp02014wPrcssAgrmtId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().setIp02014wPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wIncontrolOnsoilSw
	 *	@return ip02014wIncontrolOnsoilSw
	 */
   public char[] getIp02014wIncontrolOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wIncontrolOnsoilSw();
   }

  
	/**
	*  set variable ip02014wIncontrolOnsoilSw
	*  @param value
	**/
   public void setIp02014wIncontrolOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wIncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wIncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wCurrSplitCd
	 *	@return ip02014wCurrSplitCd
	 */
   public char[] getIp02014wCurrSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCurrSplitCd();
   }

  
	/**
	*  set variable ip02014wCurrSplitCd
	*  @param value
	**/
   public void setIp02014wCurrSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wCurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wCurrSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015BnknetOnsoilSw
	 *	@return ip02015BnknetOnsoilSw
	 */
   public char[] getIp02015BnknetOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015BnknetOnsoilSw();
   }

  
	/**
	*  set variable ip02015BnknetOnsoilSw
	*  @param value
	**/
   public void setIp02015BnknetOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015BnknetOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015BnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015BnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wHostInd
	 *	@return ip02014wHostInd
	 */
   public char[] getIp02014wHostInd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wHostInd();
   }

  
	/**
	*  set variable ip02014wHostInd
	*  @param value
	**/
   public void setIp02014wHostInd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(value);
   } 

     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex);
   	
   }
   
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wHostInd with another Field
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source);
   }  
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wHostInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMrchntSplitCd
	 *	@return ip02014wMrchntSplitCd
	 */
   public char[] getIp02014wMrchntSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMrchntSplitCd();
   }

  
	/**
	*  set variable ip02014wMrchntSplitCd
	*  @param value
	**/
   public void setIp02014wMrchntSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMrchntSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015PrcssAgrmtId
	 *	@return ip02015PrcssAgrmtId
	 */
   public char[] getIp02015PrcssAgrmtId(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015PrcssAgrmtId
	*  @param value
	**/
   public void setIp02015PrcssAgrmtId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wGftOnsoilSw
	 *	@return ip02014wGftOnsoilSw
	 */
   public char[] getIp02014wGftOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGftOnsoilSw();
   }

  
	/**
	*  set variable ip02014wGftOnsoilSw
	*  @param value
	**/
   public void setIp02014wGftOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wGftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wGftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wAcquirerSplitCd
	 *	@return ip02014wAcquirerSplitCd
	 */
   public char[] getIp02014wAcquirerSplitCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAcquirerSplitCd();
   }

  
	/**
	*  set variable ip02014wAcquirerSplitCd
	*  @param value
	**/
   public void setIp02014wAcquirerSplitCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(value);
   } 

     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source);
   }  
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAcquirerSplitCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wBllngOnsoilSw
	 *	@return ip02014wBllngOnsoilSw
	 */
   public char[] getIp02014wBllngOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBllngOnsoilSw();
   }

  
	/**
	*  set variable ip02014wBllngOnsoilSw
	*  @param value
	**/
   public void setIp02014wBllngOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wBllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBllngOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015DtaWrhsOnsoilSw
	 *	@return ip02015DtaWrhsOnsoilSw
	 */
   public char[] getIp02015DtaWrhsOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015DtaWrhsOnsoilSw();
   }

  
	/**
	*  set variable ip02015DtaWrhsOnsoilSw
	*  @param value
	**/
   public void setIp02015DtaWrhsOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015DtaWrhsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015DtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015OnUsPrcssAgrmtId
	 *	@return ip02015OnUsPrcssAgrmtId
	 */
   public char[] getIp02015OnUsPrcssAgrmtId(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015OnUsPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015OnUsPrcssAgrmtId
	*  @param value
	**/
   public void setIp02015OnUsPrcssAgrmtId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015OnUsPrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015OnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015IncontrolOnsoilSw
	 *	@return ip02015IncontrolOnsoilSw
	 */
   public char[] getIp02015IncontrolOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015IncontrolOnsoilSw();
   }

  
	/**
	*  set variable ip02015IncontrolOnsoilSw
	*  @param value
	**/
   public void setIp02015IncontrolOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015IncontrolOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015IncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015IncontrolOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015OnsoilDataShrSw
	 *	@return ip02015OnsoilDataShrSw
	 */
   public char[] getIp02015OnsoilDataShrSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015OnsoilDataShrSw();
   }

  
	/**
	*  set variable ip02015OnsoilDataShrSw
	*  @param value
	**/
   public void setIp02015OnsoilDataShrSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(value);
   } 

     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source, sourceIndex);
   	
   }
   
   public void setIp02015OnsoilDataShrSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015OnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source);
   }  
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ZappOnsoilSw
	 *	@return ip02015ZappOnsoilSw
	 */
   public char[] getIp02015ZappOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ZappOnsoilSw();
   }

  
	/**
	*  set variable ip02015ZappOnsoilSw
	*  @param value
	**/
   public void setIp02015ZappOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015ZappOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015ZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ZappOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDtaWrhsOnsoilSw
	 *	@return ip02014wDtaWrhsOnsoilSw
	 */
   public char[] getIp02014wDtaWrhsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDtaWrhsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wDtaWrhsOnsoilSw
	*  @param value
	**/
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDtaWrhsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wDomCollOnlyCd
	 *	@return ip02014wDomCollOnlyCd
	 */
   public char[] getIp02014wDomCollOnlyCd(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDomCollOnlyCd();
   }

  
	/**
	*  set variable ip02014wDomCollOnlyCd
	*  @param value
	**/
   public void setIp02014wDomCollOnlyCd(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(value);
   } 

     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex);
   	
   }
   
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wDomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source);
   }  
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wDomCollOnlyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ClrPrcssCd
	 *	@return ip02015ClrPrcssCd
	 */
   public char[] getIp02015ClrPrcssCd(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ClrPrcssCd();
   }

  
	/**
	*  set variable ip02015ClrPrcssCd
	*  @param value
	**/
   public void setIp02015ClrPrcssCd(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(value);
   } 

     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source, sourceIndex);
   	
   }
   
   public void setIp02015ClrPrcssCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015ClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source);
   }  
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wSetlOnsoilSw
	 *	@return ip02014wSetlOnsoilSw
	 */
   public char[] getIp02014wSetlOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wSetlOnsoilSw();
   }

  
	/**
	*  set variable ip02014wSetlOnsoilSw
	*  @param value
	**/
   public void setIp02014wSetlOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wSetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wSetlOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrOnsoilSw
	 *	@return ip02014wClrOnsoilSw
	 */
   public char[] getIp02014wClrOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrOnsoilSw();
   }

  
	/**
	*  set variable ip02014wClrOnsoilSw
	*  @param value
	**/
   public void setIp02014wClrOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015GftOnsoilSw
	 *	@return ip02015GftOnsoilSw
	 */
   public char[] getIp02015GftOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015GftOnsoilSw();
   }

  
	/**
	*  set variable ip02015GftOnsoilSw
	*  @param value
	**/
   public void setIp02015GftOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015GftOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015GftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015GftOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ImpBulkId
	 *	@return ip02015ImpBulkId
	 */   
	 public Ip02015ImpBulkId getIp02015ImpBulkId(int index) {
   	return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ImpBulkId();
   }

   /**
	* 	Update Ip02015ImpBulkId with the passed value
	*	@param value
	*/
   public void setIp02015ImpBulkId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(value);
   }   

     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02015ImpBulkId(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ImpBulkId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015ImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02015ImpBulkId(int index,Field source) {
   	ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(source);
   }  
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02015ImpBulkId(int index,Field source, int sourceIndex,int sourceLen) {
   	ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ImpBulkId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ImpBulkId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ClrOnsoilSw
	 *	@return ip02015ClrOnsoilSw
	 */
   public char[] getIp02015ClrOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015ClrOnsoilSw();
   }

  
	/**
	*  set variable ip02015ClrOnsoilSw
	*  @param value
	**/
   public void setIp02015ClrOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015ClrOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015ClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015ClrOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wMcomOnsoilSw
	 *	@return ip02014wMcomOnsoilSw
	 */
   public char[] getIp02014wMcomOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMcomOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMcomOnsoilSw
	*  @param value
	**/
   public void setIp02014wMcomOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMcomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMcomOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015RptHdrName
	 *	@return ip02015RptHdrName
	 */
   public char[] getIp02015RptHdrName(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015RptHdrName();
   }

  
	/**
	*  set variable ip02015RptHdrName
	*  @param value
	**/
   public void setIp02015RptHdrName(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(value);
   } 

     /**
	 * 	Update Ip02015RptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015RptHdrName(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source, sourceIndex);
   	
   }
   
   public void setIp02015RptHdrName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015RptHdrName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015RptHdrName with another Field
	 *	@param value
	 */
   public void setIp02015RptHdrName(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source);
   }  
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015RptHdrName(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015RptHdrName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015RptHdrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wStndInOnsoilSw
	 *	@return ip02014wStndInOnsoilSw
	 */
   public char[] getIp02014wStndInOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wStndInOnsoilSw();
   }

  
	/**
	*  set variable ip02014wStndInOnsoilSw
	*  @param value
	**/
   public void setIp02014wStndInOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wStndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wStndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wAuthOnsoilSw
	 *	@return ip02014wAuthOnsoilSw
	 */
   public char[] getIp02014wAuthOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAuthOnsoilSw();
   }

  
	/**
	*  set variable ip02014wAuthOnsoilSw
	*  @param value
	**/
   public void setIp02014wAuthOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015NumCurrCd
	 *	@return ip02015NumCurrCd
	 */
	public int getIp02015NumCurrCd(int index) throws CFException {
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015NumCurrCd();
	}


	/**
	 *	Returns String value of ip02015NumCurrCd
	 *	@return ip02015NumCurrCd
	 */
	public char[]  getIp02015NumCurrCdString(int index) throws CFException {
	     return String.valueOf(ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015NumCurrCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02015NumCurrCdIsNumeric(int index)  throws CFException{
	    return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index - 1).ip02015NumCurrCdIsNumeric();
	}

	/**
	 * 	Update Ip02015NumCurrCd with the passed value
	 *	@param number
	 */
	public void setIp02015NumCurrCd(int index,int number)  throws CFException{
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015NumCurrCd(number);
	}
	

	public void setIp02015NumCurrCd(int index,long number)  throws CFException{
	    ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015NumCurrCd(number);
	}
	
	
	/**
	 * 	Update Ip02015NumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02015NumCurrCd(int index,char[] value)  throws CFException {
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015NumCurrCd(value);
	}
	
	/**
	 * 	Update Ip02015NumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02015NumCurrCdString(int index,char[] value)  throws CFException{
		ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015NumCurrCd(value);
	}	

	/**
	 *	Returns the value of ip02014wOnsoilDataShrSw
	 *	@return ip02014wOnsoilDataShrSw
	 */
   public char[] getIp02014wOnsoilDataShrSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnsoilDataShrSw();
   }

  
	/**
	*  set variable ip02014wOnsoilDataShrSw
	*  @param value
	**/
   public void setIp02014wOnsoilDataShrSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(value);
   } 

     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source);
   }  
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnsoilDataShrSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wOnUsPrcssAgrmtId
	 *	@return ip02014wOnUsPrcssAgrmtId
	 */
   public char[] getIp02014wOnUsPrcssAgrmtId(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnUsPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014wOnUsPrcssAgrmtId
	*  @param value
	**/
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wOnUsPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015StndInOnsoilSw
	 *	@return ip02015StndInOnsoilSw
	 */
   public char[] getIp02015StndInOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015StndInOnsoilSw();
   }

  
	/**
	*  set variable ip02015StndInOnsoilSw
	*  @param value
	**/
   public void setIp02015StndInOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015StndInOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015StndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015StndInOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015OperSysId
	 *	@return ip02015OperSysId
	 */
   public char[] getIp02015OperSysId(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015OperSysId();
   }

  
	/**
	*  set variable ip02015OperSysId
	*  @param value
	**/
   public void setIp02015OperSysId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(value);
   } 

     /**
	 * 	Update Ip02015OperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OperSysId(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source, sourceIndex);
   	
   }
   
   public void setIp02015OperSysId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OperSysId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015OperSysId with another Field
	 *	@param value
	 */
   public void setIp02015OperSysId(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source);
   }  
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OperSysId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OperSysId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015OperSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp02014wPaIndex(int ip02014wPaIndex) { 
    Ip282210Ctx.this.ip02014wPaIndex = ip02014wPaIndex;
}

public int getIp02014wPaIndex() { 
    return Ip282210Ctx.this.ip02014wPaIndex;
}
	/**
	 *	Returns the value of ip02015HostClrPrcssCd
	 *	@return ip02015HostClrPrcssCd
	 */
   public char[] getIp02015HostClrPrcssCd() throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015HostClrPrcssCd();
   }

  
	/**
	*  set variable ip02015HostClrPrcssCd
	*  @param value
	**/
   public void setIp02015HostClrPrcssCd(char[] value) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(value);
   } 

     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source, sourceIndex);
   	
   }
   
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source) {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source);
   }  
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015DbId
	 *	@return ip02015DbId
	 */
   public char[] getIp02015DbId(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015DbId();
   }

  
	/**
	*  set variable ip02015DbId
	*  @param value
	**/
   public void setIp02015DbId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(value);
   } 

     /**
	 * 	Update Ip02015DbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DbId(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source, sourceIndex);
   	
   }
   
   public void setIp02015DbId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015DbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DbId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015DbId with another Field
	 *	@param value
	 */
   public void setIp02015DbId(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source);
   }  
   
     /**
	 * 	Update Ip02015DbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DbId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015DbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DbId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015DbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015HostGeoScopeCode
	 *	@return ip02015HostGeoScopeCode
	 */
   public char[] getIp02015HostGeoScopeCode() throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015HostGeoScopeCode();
   }

  
	/**
	*  set variable ip02015HostGeoScopeCode
	*  @param value
	**/
   public void setIp02015HostGeoScopeCode(char[] value) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(value);
   } 

     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source, sourceIndex);
   	
   }
   
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source) {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source);
   }  
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public int getIp02014wNumCurrCd(int index) throws CFException {
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wNumCurrCd();
	}


	/**
	 *	Returns String value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public char[]  getIp02014wNumCurrCdString(int index) throws CFException {
	     return String.valueOf(ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wNumCurrCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wNumCurrCdIsNumeric(int index)  throws CFException{
	    return ip02014wTable.getIp02014wPrcsAgrmtTable(index - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().ip02014wNumCurrCdIsNumeric();
	}

	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *	@param number
	 */
	public void setIp02014wNumCurrCd(int index,int number)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(number);
	}
	

	public void setIp02014wNumCurrCd(int index,long number)  throws CFException{
	    ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(number);
	}
	
	
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCd(int index,char[] value)  throws CFException {
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(value);
	}
	
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCdString(int index,char[] value)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wNumCurrCd(value);
	}	

	/**
	 *	Returns the value of ip02014wAmsOnsoilSw
	 *	@return ip02014wAmsOnsoilSw
	 */
   public char[] getIp02014wAmsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAmsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wAmsOnsoilSw
	*  @param value
	**/
   public void setIp02014wAmsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wAmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wAmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015AuthOnsoilSw
	 *	@return ip02015AuthOnsoilSw
	 */
   public char[] getIp02015AuthOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015AuthOnsoilSw();
   }

  
	/**
	*  set variable ip02015AuthOnsoilSw
	*  @param value
	**/
   public void setIp02015AuthOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015AuthOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015AuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015AuthOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wBnknetOnsoilSw
	 *	@return ip02014wBnknetOnsoilSw
	 */
   public char[] getIp02014wBnknetOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBnknetOnsoilSw();
   }

  
	/**
	*  set variable ip02014wBnknetOnsoilSw
	*  @param value
	**/
   public void setIp02014wBnknetOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wBnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wBnknetOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public int getIp02014wClrCycleNum(int index) throws CFException {
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrCycleNum();
	}


	/**
	 *	Returns String value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public char[]  getIp02014wClrCycleNumString(int index) throws CFException {
	     return String.valueOf(ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrCycleNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wClrCycleNumIsNumeric(int index)  throws CFException{
	    return ip02014wTable.getIp02014wPrcsAgrmtTable(index - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().ip02014wClrCycleNumIsNumeric();
	}

	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *	@param number
	 */
	public void setIp02014wClrCycleNum(int index,int number)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(number);
	}
	

	public void setIp02014wClrCycleNum(int index,long number)  throws CFException{
	    ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(number);
	}
	
	
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNum(int index,char[] value)  throws CFException {
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(value);
	}
	
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNumString(int index,char[] value)  throws CFException{
		ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wClrCycleNum(value);
	}	

	/**
	 *	Returns the value of ip02014wMdsOnsoilSw
	 *	@return ip02014wMdsOnsoilSw
	 */
   public char[] getIp02014wMdsOnsoilSw(int index) throws CFException  {              
   		return ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdsOnsoilSw();
   }

  
	/**
	*  set variable ip02014wMdsOnsoilSw
	*  @param value
	**/
   public void setIp02014wMdsOnsoilSw(int index,char[] value) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014wMdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014wTable.getIp02014wPrcsAgrmtTable(index).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().setIp02014wMdsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip02015PushOnsoilSw
	 *	@return ip02015PushOnsoilSw
	 */
   public char[] getIp02015PushOnsoilSw(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015PushOnsoilSw();
   }

  
	/**
	*  set variable ip02015PushOnsoilSw
	*  @param value
	**/
   public void setIp02015PushOnsoilSw(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02015PushOnsoilSw(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015PushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PushOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014wTable.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += work.hashCode();
        str += ip02014wEntriesCntGroup.hashCode();
       return str.hashCode();
    }

    public LoadToIp02015t1TableOutCtx clone() {
        LoadToIp02015t1TableOutCtx cloneObj = new LoadToIp02015t1TableOutCtx();
        cloneObj.ip02014wTable = new Ip02014wTable();
        cloneObj.ip02014wTable.set(ip02014wTable.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014wEntriesCntGroup = new Ip02014wEntriesCntGroup();
        cloneObj.ip02014wEntriesCntGroup.set(ip02014wEntriesCntGroup.getClonedField());
        return cloneObj;
    }

    }

    public LoadToIp02015t1TableOutCtx getLoadToIp02015t1TableOutCtx() {
            return new LoadToIp02015t1TableOutCtx();
    }
     public class LoadSizeInfoTableInCtx implements Cloneable {
     Ip29991TableLoadSizeInfo ip29991TableLoadSizeInfo = Ip282210Ctx.this.getIp29991TableLoadSizeInfo();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of ip29991TableLoadSizeInfo
	 *	@return ip29991TableLoadSizeInfo
	 */   
	 public Ip29991TableLoadSizeInfo getIp29991TableLoadSizeInfo() {
   	return ip29991TableLoadSizeInfo;
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

	/**
	 *	Returns the value of ip02014wEntries
	 *	@return ip02014wEntries
	 */
	public short getIp02014wEntries() throws CFException {        
   		return work.getIp02014wEntries();
	}
	
	/**
	 * 	Update Ip02014wEntries with the passed value
	 *	@param number
	 */
	public void setIp02014wEntries(short number)  throws CFException{
		work.setIp02014wEntries(number);
	}

	public void setIp02014wEntries(int number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}

	public void setIp02014wEntries(long number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}



	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}


	/**
	 *	Returns the value of tableName300
	 *	@return tableName300
	 */
   public char[] getTableName300() throws CFException  {              
   		return work.getTableName300();
   }

  
	/**
	*  set variable tableName300
	*  @param value
	**/
   public void setTableName300(char[] value) throws CFException {
      work.setTableName300(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public LoadSizeInfoTableOutCtx getLoadSizeInfoTableOutCtx() {
            return new LoadSizeInfoTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip29991TableLoadSizeInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadSizeInfoTableInCtx clone() {
        LoadSizeInfoTableInCtx cloneObj = new LoadSizeInfoTableInCtx();
        cloneObj.ip29991TableLoadSizeInfo = new Ip29991TableLoadSizeInfo();
        cloneObj.ip29991TableLoadSizeInfo.set(ip29991TableLoadSizeInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadSizeInfoTableInCtx getLoadSizeInfoTableInCtx() {
            return new LoadSizeInfoTableInCtx();
    }
     public class LoadSizeInfoTableOutCtx implements Cloneable {
     Ip29991TableLoadSizeInfo ip29991TableLoadSizeInfo = Ip282210Ctx.this.getIp29991TableLoadSizeInfo();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException  {              
   		return work.getLpaLoader300();
   }

  
	/**
	*  set variable lpaLoader300
	*  @param value
	**/
   public void setLpaLoader300(char[] value) throws CFException {
      work.setLpaLoader300(value);
   } 

	/**
	 *	Returns the value of ip29991TableName
	 *	@return ip29991TableName
	 */
   public char[] getIp29991TableName() throws CFException  {              
   		return ip29991TableLoadSizeInfo.getIp29991TableName();
   }

  
	/**
	*  set variable ip29991TableName
	*  @param value
	**/
   public void setIp29991TableName(char[] value) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991TableName(value);
   } 

     /**
	 * 	Update Ip29991TableName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991TableName(char[] source, int sourceIndex) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991TableName(source, sourceIndex);
   	
   }
   
   public void setIp29991TableName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip29991TableLoadSizeInfo.setIp29991TableName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip29991TableName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991TableName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip29991TableName with another Field
	 *	@param value
	 */
   public void setIp29991TableName(Field source) {
      ip29991TableLoadSizeInfo.setIp29991TableName(source);
   }  
   
     /**
	 * 	Update Ip29991TableName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991TableName(Field source, int sourceIndex,int sourceLen) {
      ip29991TableLoadSizeInfo.setIp29991TableName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip29991TableName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991TableName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip29991LoadSearchPgm
	 *	@return ip29991LoadSearchPgm
	 */
   public char[] getIp29991LoadSearchPgm() throws CFException  {              
   		return ip29991TableLoadSizeInfo.getIp29991LoadSearchPgm();
   }

  
	/**
	*  set variable ip29991LoadSearchPgm
	*  @param value
	**/
   public void setIp29991LoadSearchPgm(char[] value) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(value);
   } 

     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source, sourceIndex);
   	
   }
   
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip29991LoadSearchPgm with another Field
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source) {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source);
   }  
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source, int sourceIndex,int sourceLen) {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip29991TableRowOccurs
	 *	@return ip29991TableRowOccurs
	 */
	public long getIp29991TableRowOccurs() throws CFException {
   		return ip29991TableLoadSizeInfo.getIp29991TableRowOccurs();
	}


	/**
	 *	Returns String value of ip29991TableRowOccurs
	 *	@return ip29991TableRowOccurs
	 */
	public char[]  getIp29991TableRowOccursString() throws CFException {
	     return String.valueOf(ip29991TableLoadSizeInfo.getIp29991TableRowOccursString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip29991TableRowOccursIsNumeric()  throws CFException{
	    return ip29991TableLoadSizeInfo.ip29991TableRowOccursIsNumeric();
	}

	/**
	 * 	Update Ip29991TableRowOccurs with the passed value
	 *	@param number
	 */
	public void setIp29991TableRowOccurs(long number)  throws CFException{
		ip29991TableLoadSizeInfo.setIp29991TableRowOccurs(number);
	}
	

	
	/**
	 * 	Update Ip29991TableRowOccurs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowOccurs(char[] value)  throws CFException {
		ip29991TableLoadSizeInfo.setIp29991TableRowOccurs(value);
	}
	
	/**
	 * 	Update Ip29991TableRowOccurs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowOccursString(char[] value)  throws CFException{
		ip29991TableLoadSizeInfo.setIp29991TableRowOccurs(value);
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

	/**
	 *	Returns the value of ip02014wEntries
	 *	@return ip02014wEntries
	 */
	public short getIp02014wEntries() throws CFException {        
   		return work.getIp02014wEntries();
	}
	
	/**
	 * 	Update Ip02014wEntries with the passed value
	 *	@param number
	 */
	public void setIp02014wEntries(short number)  throws CFException{
		work.setIp02014wEntries(number);
	}

	public void setIp02014wEntries(int number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}

	public void setIp02014wEntries(long number)  throws CFException{
		work.setIp02014wEntries((short)number);
	}



	/**
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {        
   		return work.getRowsLoaded400();
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRowsLoaded400(int number)  throws CFException{
		work.setRowsLoaded400(number);
	}


	public void setRowsLoaded400(long number)  throws CFException{
		work.setRowsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip29991TableRowsLoaded
	 *	@return ip29991TableRowsLoaded
	 */
	public long getIp29991TableRowsLoaded() throws CFException {
   		return ip29991TableLoadSizeInfo.getIp29991TableRowsLoaded();
	}


	/**
	 *	Returns String value of ip29991TableRowsLoaded
	 *	@return ip29991TableRowsLoaded
	 */
	public char[]  getIp29991TableRowsLoadedString() throws CFException {
	     return String.valueOf(ip29991TableLoadSizeInfo.getIp29991TableRowsLoadedString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip29991TableRowsLoadedIsNumeric()  throws CFException{
	    return ip29991TableLoadSizeInfo.ip29991TableRowsLoadedIsNumeric();
	}

	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value
	 *	@param number
	 */
	public void setIp29991TableRowsLoaded(long number)  throws CFException{
		ip29991TableLoadSizeInfo.setIp29991TableRowsLoaded(number);
	}
	

	
	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowsLoaded(char[] value)  throws CFException {
		ip29991TableLoadSizeInfo.setIp29991TableRowsLoaded(value);
	}
	
	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowsLoadedString(char[] value)  throws CFException{
		ip29991TableLoadSizeInfo.setIp29991TableRowsLoaded(value);
	}	

	/**
	 *	Returns the value of tableName300
	 *	@return tableName300
	 */
   public char[] getTableName300() throws CFException  {              
   		return work.getTableName300();
   }

  
	/**
	*  set variable tableName300
	*  @param value
	**/
   public void setTableName300(char[] value) throws CFException {
      work.setTableName300(value);
   } 

	/**
	 *	Returns the value of ip29991TableId
	 *	@return ip29991TableId
	 */
   public char[] getIp29991TableId() throws CFException  {              
   		return ip29991TableLoadSizeInfo.getIp29991TableId();
   }

  
	/**
	*  set variable ip29991TableId
	*  @param value
	**/
   public void setIp29991TableId(char[] value) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991TableId(value);
   } 

     /**
	 * 	Update Ip29991TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991TableId(char[] source, int sourceIndex) throws CFException {
      ip29991TableLoadSizeInfo.setIp29991TableId(source, sourceIndex);
   	
   }
   
   public void setIp29991TableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip29991TableLoadSizeInfo.setIp29991TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip29991TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip29991TableId with another Field
	 *	@param value
	 */
   public void setIp29991TableId(Field source) {
      ip29991TableLoadSizeInfo.setIp29991TableId(source);
   }  
   
     /**
	 * 	Update Ip29991TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991TableId(Field source, int sourceIndex,int sourceLen) {
      ip29991TableLoadSizeInfo.setIp29991TableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip29991TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip29991TableLoadSizeInfo.setIp29991TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip29991TableLoadSizeInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadSizeInfoTableOutCtx clone() {
        LoadSizeInfoTableOutCtx cloneObj = new LoadSizeInfoTableOutCtx();
        cloneObj.ip29991TableLoadSizeInfo = new Ip29991TableLoadSizeInfo();
        cloneObj.ip29991TableLoadSizeInfo.set(ip29991TableLoadSizeInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadSizeInfoTableOutCtx getLoadSizeInfoTableOutCtx() {
            return new LoadSizeInfoTableOutCtx();
    }
     public class PopulateLpaEntryInCtx implements Cloneable {
     Ip02014lPrcssAgrmtTable ip02014lPrcssAgrmtTable = Ip282210Ctx.this.getIp02014lPrcssAgrmtTable();
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip282210Ctx.this.getIp02014PrcssAgrmtTable();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isEntryFoundY88100()
	 *	@return  Returns true if isEntryFoundY88100() is "Y"
	 */
   public boolean isEntryFoundY88100() throws CFException {
      return work.isEntryFoundY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEntryFoundY88100True()  throws CFException{  			
    	work.setEntryFoundY88100True();
   	}
	/**
	 *	Returns the value of ip02014lPrcssAgrmtId
	 *	@return ip02014lPrcssAgrmtId
	 */
   public char[] getIp02014lPrcssAgrmtId() throws CFException  {              
   		return ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().getIp02014lPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014lPrcssAgrmtId
	*  @param value
	**/
   public void setIp02014lPrcssAgrmtId(char[] value) throws CFException {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014lPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source) {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014lPrcssAgrmtTable.getIp02014lTableDataKey().setIp02014lPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataKey().getIp02014PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014lPrcssAgrmtTable.hashCode();
        str += ip02014PrcssAgrmtTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PopulateLpaEntryInCtx clone() {
        PopulateLpaEntryInCtx cloneObj = new PopulateLpaEntryInCtx();
        cloneObj.ip02014lPrcssAgrmtTable = new Ip02014lPrcssAgrmtTable();
        cloneObj.ip02014lPrcssAgrmtTable.set(ip02014lPrcssAgrmtTable.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PopulateLpaEntryInCtx getPopulateLpaEntryInCtx() {
            return new PopulateLpaEntryInCtx();
    }
     public class SearchLpaEntriesInCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip282210Ctx.this.getIp02014PrcssAgrmtTable();
     Ip02014lPrcssAgrmtTable ip02014lPrcssAgrmtTable = Ip282210Ctx.this.getIp02014lPrcssAgrmtTable();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of ip02015PrcssAgrmtEntry
	 *	@return ip02015PrcssAgrmtEntry
	 */   
	 public Ip02015PrcssAgrmtEntry getIp02015PrcssAgrmtEntry(int index) {
   	return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index);
   }

    public List<Ip02015PrcssAgrmtEntry> getIp02015PrcssAgrmtEntry() {
        return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry();
    }
   /**
	* 	Update Ip02015PrcssAgrmtEntry with the passed value
	*	@param value
	*/
   public void setIp02015PrcssAgrmtEntry(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().setIp02015PrcssAgrmtEntry((index),value);
   }   


	/**
	 *	Returns the value of ip02015PrcssAgrmtId
	 *	@return ip02015PrcssAgrmtId
	 */
   public char[] getIp02015PrcssAgrmtId(int index) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015PrcssAgrmtId
	*  @param value
	**/
   public void setIp02015PrcssAgrmtId(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).setIp02015PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015PasFoundCount
	 *	@return ip02015PasFoundCount
	 */
	public int getIp02015PasFoundCount() throws CFException {        
   		return ip02015PrcssAgrmtTable.getIp02015PasFoundCount();
	}
	
	/**
	 * 	Update Ip02015PasFoundCount with the passed value
	 *	@param number
	 */
	public void setIp02015PasFoundCount(int number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount(number);
	}


	public void setIp02015PasFoundCount(long number)  throws CFException{
		ip02015PrcssAgrmtTable.setIp02015PasFoundCount((int)number);
	}



public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip282210Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip282210Ctx.this.ip02015PaIndex;
}
	/**
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataKey().getIp02014PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public SearchLpaEntriesOutCtx getSearchLpaEntriesOutCtx() {
            return new SearchLpaEntriesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip02014lPrcssAgrmtTable.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchLpaEntriesInCtx clone() {
        SearchLpaEntriesInCtx cloneObj = new SearchLpaEntriesInCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip02014lPrcssAgrmtTable = new Ip02014lPrcssAgrmtTable();
        cloneObj.ip02014lPrcssAgrmtTable.set(ip02014lPrcssAgrmtTable.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchLpaEntriesInCtx getSearchLpaEntriesInCtx() {
            return new SearchLpaEntriesInCtx();
    }
     public class SearchLpaEntriesOutCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip282210Ctx.this.getIp02014PrcssAgrmtTable();
     Ip02014lPrcssAgrmtTable ip02014lPrcssAgrmtTable = Ip282210Ctx.this.getIp02014lPrcssAgrmtTable();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip282210Ctx.this.getIp02015PrcssAgrmtTable();
     Work work = Ip282210Ctx.this.getWork();

	/**
	 *	Returns the value of ip02015PrcssAgrmtEntry
	 *	@return ip02015PrcssAgrmtEntry
	 */   
	 public Ip02015PrcssAgrmtEntry getIp02015PrcssAgrmtEntry(int index) {
   	return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index);
   }

    public List<Ip02015PrcssAgrmtEntry> getIp02015PrcssAgrmtEntry() {
        return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry();
    }
   /**
	* 	Update Ip02015PrcssAgrmtEntry with the passed value
	*	@param value
	*/
   public void setIp02015PrcssAgrmtEntry(int index,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().setIp02015PrcssAgrmtEntry((index),value);
   }   


	/**
	 *	Returns the value of ip02014PrcssAgrmtTable
	 *	@return ip02014PrcssAgrmtTable
	 */   
	 public Ip02014PrcssAgrmtTable getIp02014PrcssAgrmtTable() {
   	return ip02014PrcssAgrmtTable;
   }


	/**
	 *	Returns the value of ip02014lPrcssAgrmtTable
	 *	@return ip02014lPrcssAgrmtTable
	 */   
	 public Ip02014lPrcssAgrmtTable getIp02014lPrcssAgrmtTable() {
   	return ip02014lPrcssAgrmtTable;
   }


	/**
	 *	Test condition "Y" for isEntryFoundY88100()
	 *	@return  Returns true if isEntryFoundY88100() is "Y"
	 */
   public boolean isEntryFoundY88100() throws CFException {
      return work.isEntryFoundY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEntryFoundY88100True()  throws CFException{  			
    	work.setEntryFoundY88100True();
   	}

public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip282210Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip282210Ctx.this.ip02015PaIndex;
}
	/**
	 *	Test condition "N" for isEntryFoundN88100()
	 *	@return  Returns true if isEntryFoundN88100() is "N"
	 */
   public boolean isEntryFoundN88100() throws CFException {
      return work.isEntryFoundN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setEntryFoundN88100True()  throws CFException{  			
    	work.setEntryFoundN88100True();
   	}

        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip02014lPrcssAgrmtTable.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchLpaEntriesOutCtx clone() {
        SearchLpaEntriesOutCtx cloneObj = new SearchLpaEntriesOutCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip02014lPrcssAgrmtTable = new Ip02014lPrcssAgrmtTable();
        cloneObj.ip02014lPrcssAgrmtTable.set(ip02014lPrcssAgrmtTable.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchLpaEntriesOutCtx getSearchLpaEntriesOutCtx() {
            return new SearchLpaEntriesOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 

	/**
	 *	Returns the value of astriskLine900
	 *	@return astriskLine900
	 */
   public char[] getAstriskLine900() throws CFException  {              
   		return work.getAstriskLine900();
   }

  
	/**
	*  set variable astriskLine900
	*  @param value
	**/
   public void setAstriskLine900(char[] value) throws CFException {
      work.setAstriskLine900(value);
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
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
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
	 *	Returns the value of abendAbend900
	 *	@return abendAbend900
	 */
   public char[] getAbendAbend900() throws CFException  {              
   		return work.getAbendAbend900();
   }

  
	/**
	*  set variable abendAbend900
	*  @param value
	**/
   public void setAbendAbend900(char[] value) throws CFException {
      work.setAbendAbend900(value);
   } 

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendAbendPgm900
	 *	@return abendAbendPgm900
	 */
   public char[] getAbendAbendPgm900() throws CFException  {              
   		return work.getAbendAbendPgm900();
   }

  
	/**
	*  set variable abendAbendPgm900
	*  @param value
	**/
   public void setAbendAbendPgm900(char[] value) throws CFException {
      work.setAbendAbendPgm900(value);
   } 


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip282210Ctx.this.getAbendParaName900();
     Work work = Ip282210Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip282210Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return ip60001EventLogWorkArea.isIp60001LogEvent88();
   }

	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True()  throws CFException{  			
    	ip60001EventLogWorkArea.setIp60001LogEvent88True();
   	}

        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
        }

        public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
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
       return str.hashCode();
    }

    public UpdateEventLogInCtx clone() {
        UpdateEventLogInCtx cloneObj = new UpdateEventLogInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogInCtx getUpdateEventLogInCtx() {
            return new UpdateEventLogInCtx();
    }
     public class UpdateEventLogOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip282210Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Returns the value of ip60001PgmName
	 *	@return ip60001PgmName
	 */
   public char[] getIp60001PgmName(int index) throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventEntry(index).getIp60001PgmName();
   }

  
	/**
	*  set variable ip60001PgmName
	*  @param value
	**/
   public void setIp60001PgmName(int index,char[] value) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(value);
   } 

     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001PgmName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001PgmName with another Field
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source);
   }  
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip282210Ctx getIp282210Ctx() {
            return Ip282210Ctx.this;
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
       return str.hashCode();
    }

    public UpdateEventLogOutCtx clone() {
        UpdateEventLogOutCtx cloneObj = new UpdateEventLogOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
    }
}
