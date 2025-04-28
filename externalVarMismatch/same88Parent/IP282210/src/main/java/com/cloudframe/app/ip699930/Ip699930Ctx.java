package com.cloudframe.app.ip699930;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip699930.dto.ProcessAgrmntNotFndMsg600;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip699930.dto.SystemApplNotFoundMsg600;
import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip69931Linkage;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.ip699930.dto.Ip28221PaTableRestart;
import com.cloudframe.app.ip699930.dto.Work;


@Context
public class Ip699930Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip28221PaTableRestart ip28221PaTableRestart;
    Work work;
    Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable;
    Ip69931Linkage ip69931Linkage;
    ProcessAgrmntNotFndMsg600 processAgrmntNotFndMsg600;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    SystemApplNotFoundMsg600 systemApplNotFoundMsg600;
    Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;

    int ip02015SysIndex;
    int ip02015PaIndex;

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


    public Ip28221PaTableRestart getIp28221PaTableRestart() {
        if (ip28221PaTableRestart == null) {
            ip28221PaTableRestart = new Ip28221PaTableRestart();
        }

        return ip28221PaTableRestart;
    }

    public void setIp28221PaTableRestart(Ip28221PaTableRestart ip28221PaTableRestart) {
        this.ip28221PaTableRestart = ip28221PaTableRestart;
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
    public Ip02014PrcssAgrmtTable getIp02014PrcssAgrmtTable() {
        if (ip02014PrcssAgrmtTable == null) {
            ip02014PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02014PrcssAgrmtTable.class);
        }

        return ip02014PrcssAgrmtTable;
    }

    public Ip69931Linkage getIp69931Linkage() {
        if (ip69931Linkage == null) {
            ip69931Linkage = globalCtx.getGlobalDto(Ip69931Linkage.class);
        }

        return ip69931Linkage;
    }

    public ProcessAgrmntNotFndMsg600 getProcessAgrmntNotFndMsg600() {
        if (processAgrmntNotFndMsg600 == null) {
            processAgrmntNotFndMsg600 = new ProcessAgrmntNotFndMsg600();
        }

        return processAgrmntNotFndMsg600;
    }

    public void setProcessAgrmntNotFndMsg600(ProcessAgrmntNotFndMsg600 processAgrmntNotFndMsg600) {
        this.processAgrmntNotFndMsg600 = processAgrmntNotFndMsg600;
    }
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public SystemApplNotFoundMsg600 getSystemApplNotFoundMsg600() {
        if (systemApplNotFoundMsg600 == null) {
            systemApplNotFoundMsg600 = new SystemApplNotFoundMsg600();
        }

        return systemApplNotFoundMsg600;
    }

    public void setSystemApplNotFoundMsg600(SystemApplNotFoundMsg600 systemApplNotFoundMsg600) {
        this.systemApplNotFoundMsg600 = systemApplNotFoundMsg600;
    }
    public Ip02015PrcssAgrmtTable getIp02015PrcssAgrmtTable() {
        if (ip02015PrcssAgrmtTable == null) {
            ip02015PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02015PrcssAgrmtTable.class);
        }

        return ip02015PrcssAgrmtTable;
    }


    public int getIp02015SysIndex() {
        return ip02015SysIndex;
    }

    public void setIp02015SysIndex(int ip02015SysIndex) {
        this.ip02015SysIndex = ip02015SysIndex;
    }
    public int getIp02015PaIndex() {
        return ip02015PaIndex;
    }

    public void setIp02015PaIndex(int ip02015PaIndex) {
        this.ip02015PaIndex = ip02015PaIndex;
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
        str += work.hashCode();
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip69931Linkage.hashCode();
        str += processAgrmntNotFndMsg600.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += systemApplNotFoundMsg600.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public Ip699930Ctx clone() {
        Ip699930Ctx cloneObj = new Ip699930Ctx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.processAgrmntNotFndMsg600 = new ProcessAgrmntNotFndMsg600();
        cloneObj.processAgrmntNotFndMsg600.set(processAgrmntNotFndMsg600.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.systemApplNotFoundMsg600 = new SystemApplNotFoundMsg600();
        cloneObj.systemApplNotFoundMsg600.set(systemApplNotFoundMsg600.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class SetProcedurePointersInCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp282210300
	 *	@return pgmIp282210300
	 */
   public char[] getPgmIp282210300() throws CFException  {              
   		return work.getPgmIp282210300();
   }

  
	/**
	*  set variable pgmIp282210300
	*  @param value
	**/
   public void setPgmIp282210300(char[] value) throws CFException {
      work.setPgmIp282210300(value);
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
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

    public SetProcedurePointersInCtx clone() {
        SetProcedurePointersInCtx cloneObj = new SetProcedurePointersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersInCtx getSetProcedurePointersInCtx() {
            return new SetProcedurePointersInCtx();
    }
     public class SetProcedurePointersOutCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();

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
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException  {              
   		return work.getPtrIp282210800();
   }

  
	/**
	*  set variable ptrIp282210800
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) throws CFException {
      work.setPtrIp282210800(value);
   } 


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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

    public SetProcedurePointersOutCtx clone() {
        SetProcedurePointersOutCtx cloneObj = new SetProcedurePointersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
    }
     public class DisplayExecutionMessageInCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip699930Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of pgmIp699930300
	 *	@return pgmIp699930300
	 */
   public char[] getPgmIp699930300() throws CFException  {              
   		return work.getPgmIp699930300();
   }

  
	/**
	*  set variable pgmIp699930300
	*  @param value
	**/
   public void setPgmIp699930300(char[] value) throws CFException {
      work.setPgmIp699930300(value);
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public DisplayExecutionMessageOutCtx getDisplayExecutionMessageOutCtx() {
            return new DisplayExecutionMessageOutCtx();
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
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecutionMessageInCtx clone() {
        DisplayExecutionMessageInCtx cloneObj = new DisplayExecutionMessageInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecutionMessageInCtx getDisplayExecutionMessageInCtx() {
            return new DisplayExecutionMessageInCtx();
    }
     public class DisplayExecutionMessageOutCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip699930Ctx.this.getIp996011ProgramStartMessage();

	/**
	 *	Returns the value of pgmIp699930300
	 *	@return pgmIp699930300
	 */
   public char[] getPgmIp699930300() throws CFException  {              
   		return work.getPgmIp699930300();
   }

  
	/**
	*  set variable pgmIp699930300
	*  @param value
	**/
   public void setPgmIp699930300(char[] value) throws CFException {
      work.setPgmIp699930300(value);
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecutionMessageOutCtx clone() {
        DisplayExecutionMessageOutCtx cloneObj = new DisplayExecutionMessageOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecutionMessageOutCtx getDisplayExecutionMessageOutCtx() {
            return new DisplayExecutionMessageOutCtx();
    }
     public class InitializeFieldsOutCtx implements Cloneable {
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();

	/**
	 *	Test condition 0 for isIp69931RequestSuccessful88()
	 *	@return  Returns true if isIp69931RequestSuccessful88() is 0
	 */
   public boolean isIp69931RequestSuccessful88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931RequestSuccessful88();
   }

	/**
	*  set values 0
	*/
   	public void setIp69931RequestSuccessful88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931RequestSuccessful88True();
   	}
	/**
	 *	Returns the value of ip69931CollectionId
	 *	@return ip69931CollectionId
	 */
   public char[] getIp69931CollectionId() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931CollectionId();
   }

  
	/**
	*  set variable ip69931CollectionId
	*  @param value
	**/
   public void setIp69931CollectionId(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(value);
   } 

     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex);
   	
   }
   
   public void setIp69931CollectionId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931CollectionId with another Field
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source);
   }  
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931ErrorMsg();
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(value);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 99 for isIp69931PaProcessUnknown88()
	 *	@return  Returns true if isIp69931PaProcessUnknown88() is 99
	 */
   public boolean isIp69931PaProcessUnknown88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931PaProcessUnknown88();
   }

	/**
	*  set values 99
	*/
   	public void setIp69931PaProcessUnknown88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931PaProcessUnknown88True();
   	}
	/**
	 *	Returns the value of ip69931DatabaseId
	 *	@return ip69931DatabaseId
	 */
   public char[] getIp69931DatabaseId() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931DatabaseId();
   }

  
	/**
	*  set variable ip69931DatabaseId
	*  @param value
	**/
   public void setIp69931DatabaseId(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(value);
   } 

     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex);
   	
   }
   
   public void setIp69931DatabaseId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931DatabaseId with another Field
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source);
   }  
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip69931Linkage.hashCode();
       return str.hashCode();
    }

    public InitializeFieldsOutCtx clone() {
        InitializeFieldsOutCtx cloneObj = new InitializeFieldsOutCtx();
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        return cloneObj;
    }

    }

    public InitializeFieldsOutCtx getInitializeFieldsOutCtx() {
            return new InitializeFieldsOutCtx();
    }
     public class EditIncomingValuesInCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931ApplicationSystemId
	 *	@return ip69931ApplicationSystemId
	 */
   public char[] getIp69931ApplicationSystemId() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ApplicationSystemId();
   }

  
	/**
	*  set variable ip69931ApplicationSystemId
	*  @param value
	**/
   public void setIp69931ApplicationSystemId(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(value);
   } 

     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex);
   	
   }
   
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ApplicationSystemId with another Field
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source);
   }  
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of missingProcessAgrmtMsg600
	 *	@return missingProcessAgrmtMsg600
	 */
   public char[] getMissingProcessAgrmtMsg600() throws CFException  {              
   		return work.getMissingProcessAgrmtMsg600();
   }

  
	/**
	*  set variable missingProcessAgrmtMsg600
	*  @param value
	**/
   public void setMissingProcessAgrmtMsg600(char[] value) throws CFException {
      work.setMissingProcessAgrmtMsg600(value);
   } 

	/**
	 *	Returns the value of missingApplSystemIdMsg600
	 *	@return missingApplSystemIdMsg600
	 */
   public char[] getMissingApplSystemIdMsg600() throws CFException  {              
   		return work.getMissingApplSystemIdMsg600();
   }

  
	/**
	*  set variable missingApplSystemIdMsg600
	*  @param value
	**/
   public void setMissingApplSystemIdMsg600(char[] value) throws CFException {
      work.setMissingApplSystemIdMsg600(value);
   } 


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public EditIncomingValuesOutCtx getEditIncomingValuesOutCtx() {
            return new EditIncomingValuesOutCtx();
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
        str += ip69931Linkage.hashCode();
       return str.hashCode();
    }

    public EditIncomingValuesInCtx clone() {
        EditIncomingValuesInCtx cloneObj = new EditIncomingValuesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        return cloneObj;
    }

    }

    public EditIncomingValuesInCtx getEditIncomingValuesInCtx() {
            return new EditIncomingValuesInCtx();
    }
     public class EditIncomingValuesOutCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();

	/**
	 *	Test condition 1 for isIp69931RequestFailed88()
	 *	@return  Returns true if isIp69931RequestFailed88() is 1
	 */
   public boolean isIp69931RequestFailed88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931RequestFailed88();
   }

	/**
	*  set values 1
	*/
   	public void setIp69931RequestFailed88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931RequestFailed88True();
   	}
	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931ErrorMsg();
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(value);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of missingProcessAgrmtMsg600
	 *	@return missingProcessAgrmtMsg600
	 */
   public char[] getMissingProcessAgrmtMsg600() throws CFException  {              
   		return work.getMissingProcessAgrmtMsg600();
   }

  
	/**
	*  set variable missingProcessAgrmtMsg600
	*  @param value
	**/
   public void setMissingProcessAgrmtMsg600(char[] value) throws CFException {
      work.setMissingProcessAgrmtMsg600(value);
   } 

	/**
	 *	Returns the value of missingApplSystemIdMsg600
	 *	@return missingApplSystemIdMsg600
	 */
   public char[] getMissingApplSystemIdMsg600() throws CFException  {              
   		return work.getMissingApplSystemIdMsg600();
   }

  
	/**
	*  set variable missingApplSystemIdMsg600
	*  @param value
	**/
   public void setMissingApplSystemIdMsg600(char[] value) throws CFException {
      work.setMissingApplSystemIdMsg600(value);
   } 


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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
        str += ip69931Linkage.hashCode();
       return str.hashCode();
    }

    public EditIncomingValuesOutCtx clone() {
        EditIncomingValuesOutCtx cloneObj = new EditIncomingValuesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        return cloneObj;
    }

    }

    public EditIncomingValuesOutCtx getEditIncomingValuesOutCtx() {
            return new EditIncomingValuesOutCtx();
    }
     public class GetPasFromOneDayFileInCtx implements Cloneable {
     Ip28221PaTableRestart ip28221PaTableRestart = Ip699930Ctx.this.getIp28221PaTableRestart();
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
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
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException  {              
   		return work.getPtrIp282210800();
   }

  
	/**
	*  set variable ptrIp282210800
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) throws CFException {
      work.setPtrIp282210800(value);
   } 

	/**
	 *	Returns the value of noProcessingAgrmntsMsg600
	 *	@return noProcessingAgrmntsMsg600
	 */
   public char[] getNoProcessingAgrmntsMsg600() throws CFException  {              
   		return work.getNoProcessingAgrmntsMsg600();
   }

  
	/**
	*  set variable noProcessingAgrmntsMsg600
	*  @param value
	**/
   public void setNoProcessingAgrmntsMsg600(char[] value) throws CFException {
      work.setNoProcessingAgrmntsMsg600(value);
   } 


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public GetPasFromOneDayFileOutCtx getGetPasFromOneDayFileOutCtx() {
            return new GetPasFromOneDayFileOutCtx();
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
        str += work.hashCode();
        str += ip69931Linkage.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetPasFromOneDayFileInCtx clone() {
        GetPasFromOneDayFileInCtx cloneObj = new GetPasFromOneDayFileInCtx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetPasFromOneDayFileInCtx getGetPasFromOneDayFileInCtx() {
            return new GetPasFromOneDayFileInCtx();
    }
     public class GetPasFromOneDayFileOutCtx implements Cloneable {
     Ip28221PaTableRestart ip28221PaTableRestart = Ip699930Ctx.this.getIp28221PaTableRestart();
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Test condition 1 for isIp69931RequestFailed88()
	 *	@return  Returns true if isIp69931RequestFailed88() is 1
	 */
   public boolean isIp69931RequestFailed88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931RequestFailed88();
   }

	/**
	*  set values 1
	*/
   	public void setIp69931RequestFailed88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931RequestFailed88True();
   	}
	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931ErrorMsg();
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(value);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isIp28221Ip282210NoRestrt88()
	 *	@return  Returns true if isIp28221Ip282210NoRestrt88() is "N"
	 */
   public boolean isIp28221Ip282210NoRestrt88() throws CFException {
      return ip28221PaTableRestart.isIp28221Ip282210NoRestrt88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp28221Ip282210NoRestrt88True()  throws CFException{  			
    	ip28221PaTableRestart.setIp28221Ip282210NoRestrt88True();
   	}
	/**
	 *	Returns the value of noProcessingAgrmntsMsg600
	 *	@return noProcessingAgrmntsMsg600
	 */
   public char[] getNoProcessingAgrmntsMsg600() throws CFException  {              
   		return work.getNoProcessingAgrmntsMsg600();
   }

  
	/**
	*  set variable noProcessingAgrmntsMsg600
	*  @param value
	**/
   public void setNoProcessingAgrmntsMsg600(char[] value) throws CFException {
      work.setNoProcessingAgrmntsMsg600(value);
   } 


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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
        str += work.hashCode();
        str += ip69931Linkage.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetPasFromOneDayFileOutCtx clone() {
        GetPasFromOneDayFileOutCtx cloneObj = new GetPasFromOneDayFileOutCtx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetPasFromOneDayFileOutCtx getGetPasFromOneDayFileOutCtx() {
            return new GetPasFromOneDayFileOutCtx();
    }
     public class GetWherePaIsProcessedInCtx implements Cloneable {
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public GetWherePaIsProcessedOutCtx getGetWherePaIsProcessedOutCtx() {
            return new GetWherePaIsProcessedOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip69931Linkage.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetWherePaIsProcessedInCtx clone() {
        GetWherePaIsProcessedInCtx cloneObj = new GetWherePaIsProcessedInCtx();
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetWherePaIsProcessedInCtx getGetWherePaIsProcessedInCtx() {
            return new GetWherePaIsProcessedInCtx();
    }
     public class GetWherePaIsProcessedOutCtx implements Cloneable {
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Test condition 1 for isIp69931PaProcesRemotely88()
	 *	@return  Returns true if isIp69931PaProcesRemotely88() is 1
	 */
   public boolean isIp69931PaProcesRemotely88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931PaProcesRemotely88();
   }

	/**
	*  set values 1
	*/
   	public void setIp69931PaProcesRemotely88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931PaProcesRemotely88True();
   	}
	/**
	 *	Test condition 0 for isIp69931PaProcessLocally88()
	 *	@return  Returns true if isIp69931PaProcessLocally88() is 0
	 */
   public boolean isIp69931PaProcessLocally88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931PaProcessLocally88();
   }

	/**
	*  set values 0
	*/
   	public void setIp69931PaProcessLocally88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931PaProcessLocally88True();
   	}

        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip69931Linkage.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetWherePaIsProcessedOutCtx clone() {
        GetWherePaIsProcessedOutCtx cloneObj = new GetWherePaIsProcessedOutCtx();
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetWherePaIsProcessedOutCtx getGetWherePaIsProcessedOutCtx() {
            return new GetWherePaIsProcessedOutCtx();
    }
     public class GetDesiredPrcssngAgrmtInCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip699930Ctx.this.getIp02014PrcssAgrmtTable();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     ProcessAgrmntNotFndMsg600 processAgrmntNotFndMsg600 = Ip699930Ctx.this.getProcessAgrmntNotFndMsg600();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip699930Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip699930Ctx.this.ip02015PaIndex;
}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}


	public void setValue1300(long number)  throws CFException{
		work.setValue1300((int)number);
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
	 *	Returns the value of processAgrmntNotFndMsg600
	 *	@return processAgrmntNotFndMsg600
	 */   
	 public ProcessAgrmntNotFndMsg600 getProcessAgrmntNotFndMsg600() {
   	return processAgrmntNotFndMsg600;
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public GetDesiredPrcssngAgrmtOutCtx getGetDesiredPrcssngAgrmtOutCtx() {
            return new GetDesiredPrcssngAgrmtOutCtx();
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
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip69931Linkage.hashCode();
        str += processAgrmntNotFndMsg600.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetDesiredPrcssngAgrmtInCtx clone() {
        GetDesiredPrcssngAgrmtInCtx cloneObj = new GetDesiredPrcssngAgrmtInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.processAgrmntNotFndMsg600 = new ProcessAgrmntNotFndMsg600();
        cloneObj.processAgrmntNotFndMsg600.set(processAgrmntNotFndMsg600.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetDesiredPrcssngAgrmtInCtx getGetDesiredPrcssngAgrmtInCtx() {
            return new GetDesiredPrcssngAgrmtInCtx();
    }
     public class GetDesiredPrcssngAgrmtOutCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip699930Ctx.this.getIp02014PrcssAgrmtTable();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     ProcessAgrmntNotFndMsg600 processAgrmntNotFndMsg600 = Ip699930Ctx.this.getProcessAgrmntNotFndMsg600();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

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

	/**
	 *	Test condition "Y" for isProcessAgrmntFound88100()
	 *	@return  Returns true if isProcessAgrmntFound88100() is "Y"
	 */
   public boolean isProcessAgrmntFound88100() throws CFException {
      return work.isProcessAgrmntFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setProcessAgrmntFound88100True()  throws CFException{  			
    	work.setProcessAgrmntFound88100True();
   	}
	/**
	 *	Test condition "N" for isProcessAgrmtNotFound88100()
	 *	@return  Returns true if isProcessAgrmtNotFound88100() is "N"
	 */
   public boolean isProcessAgrmtNotFound88100() throws CFException {
      return work.isProcessAgrmtNotFound88100();
   }

	/**
	*  set values "N"
	*/
   	public void setProcessAgrmtNotFound88100True()  throws CFException{  			
    	work.setProcessAgrmtNotFound88100True();
   	}
	/**
	 *	Test condition 1 for isIp69931RequestFailed88()
	 *	@return  Returns true if isIp69931RequestFailed88() is 1
	 */
   public boolean isIp69931RequestFailed88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931RequestFailed88();
   }

	/**
	*  set values 1
	*/
   	public void setIp69931RequestFailed88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931RequestFailed88True();
   	}
	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931ErrorMsg();
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(value);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02014ClrPrcssCd
	 *	@return ip02014ClrPrcssCd
	 */
   public char[] getIp02014ClrPrcssCd() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataFields().getIp02014ClrPrcssCd();
   }

  
	/**
	*  set variable ip02014ClrPrcssCd
	*  @param value
	**/
   public void setIp02014ClrPrcssCd(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(value);
   } 

     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source, sourceIndex);
   	
   }
   
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014ClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source);
   }  
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014ClrPrcssCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip699930Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip699930Ctx.this.ip02015PaIndex;
}
	/**
	 *	Test condition "Y" for isStartLoop88100()
	 *	@return  Returns true if isStartLoop88100() is "Y"
	 */
   public boolean isStartLoop88100() throws CFException {
      return work.isStartLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setStartLoop88100True()  throws CFException{  			
    	work.setStartLoop88100True();
   	}
	/**
	 *	Returns the value of processAgrmntNotFndPa600
	 *	@return processAgrmntNotFndPa600
	 */
   public char[] getProcessAgrmntNotFndPa600() throws CFException  {              
   		return processAgrmntNotFndMsg600.getProcessAgrmntNotFndPa600();
   }

  
	/**
	*  set variable processAgrmntNotFndPa600
	*  @param value
	**/
   public void setProcessAgrmntNotFndPa600(char[] value) throws CFException {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(value);
   } 

     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex) throws CFException {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source, sourceIndex);
   	
   }
   
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProcessAgrmntNotFndPa600 with another Field
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source) {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source);
   }  
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source, int sourceIndex,int sourceLen) {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      processAgrmntNotFndMsg600.setProcessAgrmntNotFndPa600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isStopLoop88100()
	 *	@return  Returns true if isStopLoop88100() is "N"
	 */
   public boolean isStopLoop88100() throws CFException {
      return work.isStopLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setStopLoop88100True()  throws CFException{  			
    	work.setStopLoop88100True();
   	}
	/**
	 *	Returns the value of ip02014DbId
	 *	@return ip02014DbId
	 */
   public char[] getIp02014DbId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataFields().getIp02014DbId();
   }

  
	/**
	*  set variable ip02014DbId
	*  @param value
	**/
   public void setIp02014DbId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(value);
   } 

     /**
	 * 	Update Ip02014DbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014DbId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source, sourceIndex);
   	
   }
   
   public void setIp02014DbId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014DbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DbId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014DbId with another Field
	 *	@param value
	 */
   public void setIp02014DbId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source);
   }  
   
     /**
	 * 	Update Ip02014DbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014DbId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014DbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DbId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014DbId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of processAgrmntNotFndMsg600
	 *	@return processAgrmntNotFndMsg600
	 */   
	 public ProcessAgrmntNotFndMsg600 getProcessAgrmntNotFndMsg600() {
   	return processAgrmntNotFndMsg600;
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


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip69931Linkage.hashCode();
        str += processAgrmntNotFndMsg600.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetDesiredPrcssngAgrmtOutCtx clone() {
        GetDesiredPrcssngAgrmtOutCtx cloneObj = new GetDesiredPrcssngAgrmtOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.processAgrmntNotFndMsg600 = new ProcessAgrmntNotFndMsg600();
        cloneObj.processAgrmntNotFndMsg600.set(processAgrmntNotFndMsg600.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetDesiredPrcssngAgrmtOutCtx getGetDesiredPrcssngAgrmtOutCtx() {
            return new GetDesiredPrcssngAgrmtOutCtx();
    }
     public class GetDesiredSystemApplInCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     SystemApplNotFoundMsg600 systemApplNotFoundMsg600 = Ip699930Ctx.this.getSystemApplNotFoundMsg600();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip69931ApplicationSystemId
	 *	@return ip69931ApplicationSystemId
	 */
   public char[] getIp69931ApplicationSystemId() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ApplicationSystemId();
   }

  
	/**
	*  set variable ip69931ApplicationSystemId
	*  @param value
	**/
   public void setIp69931ApplicationSystemId(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(value);
   } 

     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex);
   	
   }
   
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ApplicationSystemId with another Field
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source);
   }  
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}


	public void setValue1300(long number)  throws CFException{
		work.setValue1300((int)number);
	}



public void setIp02015PaIndex(int ip02015PaIndex) { 
    Ip699930Ctx.this.ip02015PaIndex = ip02015PaIndex;
}

public int getIp02015PaIndex() { 
    return Ip699930Ctx.this.ip02015PaIndex;
}

public void setIp02015SysIndex(int ip02015SysIndex) { 
    Ip699930Ctx.this.ip02015SysIndex = ip02015SysIndex;
}

public int getIp02015SysIndex() { 
    return Ip699930Ctx.this.ip02015SysIndex;
}
	/**
	 *	Returns the value of ip02015SrvrNam
	 *	@return ip02015SrvrNam
	 */
   public char[] getIp02015SrvrNam(int index,int index2) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).getIp02015SrvrNam();
   }

  
	/**
	*  set variable ip02015SrvrNam
	*  @param value
	**/
   public void setIp02015SrvrNam(int index,int index2,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(value);
   } 

     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex);
   	
   }
   
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015SrvrNam with another Field
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source);
   }  
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015ApplSysId
	 *	@return ip02015ApplSysId
	 */
   public char[] getIp02015ApplSysId(int index,int index2) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).getIp02015ApplSysId();
   }

  
	/**
	*  set variable ip02015ApplSysId
	*  @param value
	**/
   public void setIp02015ApplSysId(int index,int index2,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(value);
   } 

     /**
	 * 	Update Ip02015ApplSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ApplSysId(int index,int index2,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source, sourceIndex);
   	
   }
   
   public void setIp02015ApplSysId(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ApplSysId(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015ApplSysId with another Field
	 *	@param value
	 */
   public void setIp02015ApplSysId(int index,int index2,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source);
   }  
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ApplSysId(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ApplSysId(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015ApplSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of systemApplNotFoundMsg600
	 *	@return systemApplNotFoundMsg600
	 */   
	 public SystemApplNotFoundMsg600 getSystemApplNotFoundMsg600() {
   	return systemApplNotFoundMsg600;
   }


	/**
	 *	Returns the value of ip02015PkgSetNam
	 *	@return ip02015PkgSetNam
	 */
   public char[] getIp02015PkgSetNam(int index,int index2) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).getIp02015PkgSetNam();
   }

  
	/**
	*  set variable ip02015PkgSetNam
	*  @param value
	**/
   public void setIp02015PkgSetNam(int index,int index2,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(value);
   } 

     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex);
   	
   }
   
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015PkgSetNam with another Field
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source);
   }  
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
        }

        public GetDesiredSystemApplOutCtx getGetDesiredSystemApplOutCtx() {
            return new GetDesiredSystemApplOutCtx();
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
        str += ip69931Linkage.hashCode();
        str += systemApplNotFoundMsg600.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetDesiredSystemApplInCtx clone() {
        GetDesiredSystemApplInCtx cloneObj = new GetDesiredSystemApplInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.systemApplNotFoundMsg600 = new SystemApplNotFoundMsg600();
        cloneObj.systemApplNotFoundMsg600.set(systemApplNotFoundMsg600.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetDesiredSystemApplInCtx getGetDesiredSystemApplInCtx() {
            return new GetDesiredSystemApplInCtx();
    }
     public class GetDesiredSystemApplOutCtx implements Cloneable {
     Work work = Ip699930Ctx.this.getWork();
     Ip69931Linkage ip69931Linkage = Ip699930Ctx.this.getIp69931Linkage();
     SystemApplNotFoundMsg600 systemApplNotFoundMsg600 = Ip699930Ctx.this.getSystemApplNotFoundMsg600();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip699930Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of noSystemApplIdsApplId600
	 *	@return noSystemApplIdsApplId600
	 */
   public char[] getNoSystemApplIdsApplId600() throws CFException  {              
   		return systemApplNotFoundMsg600.getNoSystemApplIdsApplId600();
   }

  
	/**
	*  set variable noSystemApplIdsApplId600
	*  @param value
	**/
   public void setNoSystemApplIdsApplId600(char[] value) throws CFException {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(value);
   } 

     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex) throws CFException {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source, sourceIndex);
   	
   }
   
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NoSystemApplIdsApplId600 with another Field
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source) {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source);
   }  
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source, int sourceIndex,int sourceLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsApplId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931CollectionId
	 *	@return ip69931CollectionId
	 */
   public char[] getIp69931CollectionId() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931CollectionId();
   }

  
	/**
	*  set variable ip69931CollectionId
	*  @param value
	**/
   public void setIp69931CollectionId(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(value);
   } 

     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex);
   	
   }
   
   public void setIp69931CollectionId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931CollectionId with another Field
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source);
   }  
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931CollectionId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 1 for isIp69931RequestFailed88()
	 *	@return  Returns true if isIp69931RequestFailed88() is 1
	 */
   public boolean isIp69931RequestFailed88() throws CFException {
      return ip69931Linkage.getIp69931OutputFields().isIp69931RequestFailed88();
   }

	/**
	*  set values 1
	*/
   	public void setIp69931RequestFailed88True()  throws CFException{  			
    	ip69931Linkage.getIp69931OutputFields().setIp69931RequestFailed88True();
   	}
	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931ErrorMsg();
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(value);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931ErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip02015SrvrNam
	 *	@return ip02015SrvrNam
	 */
   public char[] getIp02015SrvrNam(int index,int index2) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).getIp02015SrvrNam();
   }

  
	/**
	*  set variable ip02015SrvrNam
	*  @param value
	**/
   public void setIp02015SrvrNam(int index,int index2,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(value);
   } 

     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex);
   	
   }
   
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015SrvrNam with another Field
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source);
   }  
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015SrvrNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noSystemApplIdsPa600
	 *	@return noSystemApplIdsPa600
	 */
   public char[] getNoSystemApplIdsPa600() throws CFException  {              
   		return systemApplNotFoundMsg600.getNoSystemApplIdsPa600();
   }

  
	/**
	*  set variable noSystemApplIdsPa600
	*  @param value
	**/
   public void setNoSystemApplIdsPa600(char[] value) throws CFException {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(value);
   } 

     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex) throws CFException {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source, sourceIndex);
   	
   }
   
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NoSystemApplIdsPa600 with another Field
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source) {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source);
   }  
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source, int sourceIndex,int sourceLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      systemApplNotFoundMsg600.setNoSystemApplIdsPa600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isSystemApplNotFound88100()
	 *	@return  Returns true if isSystemApplNotFound88100() is "N"
	 */
   public boolean isSystemApplNotFound88100() throws CFException {
      return work.isSystemApplNotFound88100();
   }

	/**
	*  set values "N"
	*/
   	public void setSystemApplNotFound88100True()  throws CFException{  			
    	work.setSystemApplNotFound88100True();
   	}
	/**
	 *	Returns the value of ip69931DatabaseId
	 *	@return ip69931DatabaseId
	 */
   public char[] getIp69931DatabaseId() throws CFException  {              
   		return ip69931Linkage.getIp69931OutputFields().getIp69931DatabaseId();
   }

  
	/**
	*  set variable ip69931DatabaseId
	*  @param value
	**/
   public void setIp69931DatabaseId(char[] value) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(value);
   } 

     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex);
   	
   }
   
   public void setIp69931DatabaseId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931DatabaseId with another Field
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source);
   }  
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931OutputFields().setIp69931DatabaseId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of systemApplNotFoundMsg600
	 *	@return systemApplNotFoundMsg600
	 */   
	 public SystemApplNotFoundMsg600 getSystemApplNotFoundMsg600() {
   	return systemApplNotFoundMsg600;
   }


	/**
	 *	Returns the value of ip02015PkgSetNam
	 *	@return ip02015PkgSetNam
	 */
   public char[] getIp02015PkgSetNam(int index,int index2) throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).getIp02015PkgSetNam();
   }

  
	/**
	*  set variable ip02015PkgSetNam
	*  @param value
	**/
   public void setIp02015PkgSetNam(int index,int index2,char[] value) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(value);
   } 

     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex);
   	
   }
   
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015PkgSetNam with another Field
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source);
   }  
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(index).getIp02015Db2Table(index2).setIp02015PkgSetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931ApplicationSystemId
	 *	@return ip69931ApplicationSystemId
	 */
   public char[] getIp69931ApplicationSystemId() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ApplicationSystemId();
   }

  
	/**
	*  set variable ip69931ApplicationSystemId
	*  @param value
	**/
   public void setIp69931ApplicationSystemId(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(value);
   } 

     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex);
   	
   }
   
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ApplicationSystemId with another Field
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source);
   }  
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ApplicationSystemId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException  {              
   		return ip69931Linkage.getIp69931InputFields().getIp69931ProcessingAgreement();
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(value);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) throws CFException {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source);
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip69931Linkage.getIp69931InputFields().setIp69931ProcessingAgreement(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isStartLoop88100()
	 *	@return  Returns true if isStartLoop88100() is "Y"
	 */
   public boolean isStartLoop88100() throws CFException {
      return work.isStartLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setStartLoop88100True()  throws CFException{  			
    	work.setStartLoop88100True();
   	}

public void setIp02015SysIndex(int ip02015SysIndex) { 
    Ip699930Ctx.this.ip02015SysIndex = ip02015SysIndex;
}

public int getIp02015SysIndex() { 
    return Ip699930Ctx.this.ip02015SysIndex;
}
	/**
	 *	Test condition "N" for isStopLoop88100()
	 *	@return  Returns true if isStopLoop88100() is "N"
	 */
   public boolean isStopLoop88100() throws CFException {
      return work.isStopLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setStopLoop88100True()  throws CFException{  			
    	work.setStopLoop88100True();
   	}
	/**
	 *	Test condition "Y" for isSystemApplFound88100()
	 *	@return  Returns true if isSystemApplFound88100() is "Y"
	 */
   public boolean isSystemApplFound88100() throws CFException {
      return work.isSystemApplFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSystemApplFound88100True()  throws CFException{  			
    	work.setSystemApplFound88100True();
   	}

        public Ip699930Ctx getIp699930Ctx() {
            return Ip699930Ctx.this;
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
        str += ip69931Linkage.hashCode();
        str += systemApplNotFoundMsg600.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetDesiredSystemApplOutCtx clone() {
        GetDesiredSystemApplOutCtx cloneObj = new GetDesiredSystemApplOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip69931Linkage = new Ip69931Linkage();
        cloneObj.ip69931Linkage.set(ip69931Linkage.getClonedField());
        cloneObj.systemApplNotFoundMsg600 = new SystemApplNotFoundMsg600();
        cloneObj.systemApplNotFoundMsg600.set(systemApplNotFoundMsg600.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetDesiredSystemApplOutCtx getGetDesiredSystemApplOutCtx() {
            return new GetDesiredSystemApplOutCtx();
    }
}
