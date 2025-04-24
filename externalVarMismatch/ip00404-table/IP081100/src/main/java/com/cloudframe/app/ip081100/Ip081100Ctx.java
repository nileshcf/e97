package com.cloudframe.app.ip081100;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.IsIndiaAcctRngGroup100;
import com.cloudframe.app.global.sharedvar.Ip08151PartnEndGroup;
import com.cloudframe.app.global.sharedvar.Ip08151ReturnParms;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip08151PartnStrtGroup;
import com.cloudframe.app.global.sharedvar.Ip00404Table;
import com.cloudframe.app.global.sharedvar.Ip08151PassedParms;
import com.cloudframe.app.ip081100.dto.Work;


@Context
public class Ip081100Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip00404Table ip00404Table;
    IsIndiaAcctRngGroup100 isIndiaAcctRngGroup100;
    Ip08151PartnStrtGroup ip08151PartnStrtGroup;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip08151PartnEndGroup ip08151PartnEndGroup;
    Ip08151PassedParms ip08151PassedParms;
    Ip08151ReturnParms ip08151ReturnParms;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
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


    public Ip00404Table getIp00404Table() {
        if (ip00404Table == null) {
            ip00404Table = globalCtx.getGlobalDto(Ip00404Table.class);
        }

        return ip00404Table;
    }

    public IsIndiaAcctRngGroup100 getIsIndiaAcctRngGroup100() {
        if (isIndiaAcctRngGroup100 == null) {
            isIndiaAcctRngGroup100 = globalCtx.getGlobalDto(IsIndiaAcctRngGroup100.class);
        }

        return isIndiaAcctRngGroup100;
    }

    public Ip08151PartnStrtGroup getIp08151PartnStrtGroup() {
        if (ip08151PartnStrtGroup == null) {
            ip08151PartnStrtGroup = globalCtx.getGlobalDto(Ip08151PartnStrtGroup.class);
        }

        return ip08151PartnStrtGroup;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip08151PartnEndGroup getIp08151PartnEndGroup() {
        if (ip08151PartnEndGroup == null) {
            ip08151PartnEndGroup = globalCtx.getGlobalDto(Ip08151PartnEndGroup.class);
        }

        return ip08151PartnEndGroup;
    }

    public Ip08151PassedParms getIp08151PassedParms() {
        if (ip08151PassedParms == null) {
            ip08151PassedParms = globalCtx.getGlobalDto(Ip08151PassedParms.class);
        }

        return ip08151PassedParms;
    }

    public Ip08151ReturnParms getIp08151ReturnParms() {
        if (ip08151ReturnParms == null) {
            ip08151ReturnParms = globalCtx.getGlobalDto(Ip08151ReturnParms.class);
        }

        return ip08151ReturnParms;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
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
        str += ip00404Table.hashCode();
        str += isIndiaAcctRngGroup100.hashCode();
        str += ip08151PartnStrtGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip08151PartnEndGroup.hashCode();
        str += ip08151PassedParms.hashCode();
        str += ip08151ReturnParms.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip081100Ctx clone() {
        Ip081100Ctx cloneObj = new Ip081100Ctx();
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.isIndiaAcctRngGroup100 = new IsIndiaAcctRngGroup100();
        cloneObj.isIndiaAcctRngGroup100.set(isIndiaAcctRngGroup100.getClonedField());
        cloneObj.ip08151PartnStrtGroup = new Ip08151PartnStrtGroup();
        cloneObj.ip08151PartnStrtGroup.set(ip08151PartnStrtGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip08151PartnEndGroup = new Ip08151PartnEndGroup();
        cloneObj.ip08151PartnEndGroup.set(ip08151PartnEndGroup.getClonedField());
        cloneObj.ip08151PassedParms = new Ip08151PassedParms();
        cloneObj.ip08151PassedParms.set(ip08151PassedParms.getClonedField());
        cloneObj.ip08151ReturnParms = new Ip08151ReturnParms();
        cloneObj.ip08151ReturnParms.set(ip08151ReturnParms.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     IsIndiaAcctRngGroup100 isIndiaAcctRngGroup100 = Ip081100Ctx.this.getIsIndiaAcctRngGroup100();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip081100Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip081100Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp081100300
	 *	@return pgmIp081100300
	 */
   public char[] getPgmIp081100300() throws CFException  {              
   		return work.getPgmIp081100300();
   }

  
	/**
	*  set variable pgmIp081100300
	*  @param value
	**/
   public void setPgmIp081100300(char[] value) throws CFException {
      work.setPgmIp081100300(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
        str += isIndiaAcctRngGroup100.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.isIndiaAcctRngGroup100 = new IsIndiaAcctRngGroup100();
        cloneObj.isIndiaAcctRngGroup100.set(isIndiaAcctRngGroup100.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     IsIndiaAcctRngGroup100 isIndiaAcctRngGroup100 = Ip081100Ctx.this.getIsIndiaAcctRngGroup100();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip081100Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip081100Ctx.this.getWork();

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
	 *	Test condition "N" for isAccRngIndiaN88100()
	 *	@return  Returns true if isAccRngIndiaN88100() is "N"
	 */
   public boolean isAccRngIndiaN88100() throws CFException {
      return isIndiaAcctRngGroup100.isAccRngIndiaN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setAccRngIndiaN88100True()  throws CFException{  			
    	isIndiaAcctRngGroup100.setAccRngIndiaN88100True();
   	}
	/**
	 *	Returns the value of pgmIp081100300
	 *	@return pgmIp081100300
	 */
   public char[] getPgmIp081100300() throws CFException  {              
   		return work.getPgmIp081100300();
   }

  
	/**
	*  set variable pgmIp081100300
	*  @param value
	**/
   public void setPgmIp081100300(char[] value) throws CFException {
      work.setPgmIp081100300(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += isIndiaAcctRngGroup100.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.isIndiaAcctRngGroup100 = new IsIndiaAcctRngGroup100();
        cloneObj.isIndiaAcctRngGroup100.set(isIndiaAcctRngGroup100.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class DoInitializationInCtx implements Cloneable {
     Work work = Ip081100Ctx.this.getWork();

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

        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
        }

        public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
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

    public DoInitializationInCtx clone() {
        DoInitializationInCtx cloneObj = new DoInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationInCtx getDoInitializationInCtx() {
            return new DoInitializationInCtx();
    }
     public class DoInitializationOutCtx implements Cloneable {
     Work work = Ip081100Ctx.this.getWork();

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

        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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

    public DoInitializationOutCtx clone() {
        DoInitializationOutCtx cloneObj = new DoInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip081100Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip081100Ctx.this.getWork();

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
	 *	Returns the value of pgmIp081100300
	 *	@return pgmIp081100300
	 */
   public char[] getPgmIp081100300() throws CFException  {              
   		return work.getPgmIp081100300();
   }

  
	/**
	*  set variable pgmIp081100300
	*  @param value
	**/
   public void setPgmIp081100300(char[] value) throws CFException {
      work.setPgmIp081100300(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip081100Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip081100Ctx.this.getWork();

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
	 *	Returns the value of pgmIp081100300
	 *	@return pgmIp081100300
	 */
   public char[] getPgmIp081100300() throws CFException  {              
   		return work.getPgmIp081100300();
   }

  
	/**
	*  set variable pgmIp081100300
	*  @param value
	**/
   public void setPgmIp081100300(char[] value) throws CFException {
      work.setPgmIp081100300(value);
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


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
     public class SetProcedurePointersInCtx implements Cloneable {
     Work work = Ip081100Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp081050300
	 *	@return pgmIp081050300
	 */
   public char[] getPgmIp081050300() throws CFException  {              
   		return work.getPgmIp081050300();
   }

  
	/**
	*  set variable pgmIp081050300
	*  @param value
	**/
   public void setPgmIp081050300(char[] value) throws CFException {
      work.setPgmIp081050300(value);
   } 

	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException  {              
   		return work.getPgmIp280010300();
   }

  
	/**
	*  set variable pgmIp280010300
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) throws CFException {
      work.setPgmIp280010300(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
     Work work = Ip081100Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException  {              
   		return work.getPtrIp280010800();
   }

  
	/**
	*  set variable ptrIp280010800
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) throws CFException {
      work.setPtrIp280010800(value);
   } 

	/**
	 *	Returns the value of ptrIp081050800
	 *	@return ptrIp081050800
	 */
   public char[] getPtrIp081050800() throws CFException  {              
   		return work.getPtrIp081050800();
   }

  
	/**
	*  set variable ptrIp081050800
	*  @param value
	**/
   public void setPtrIp081050800(char[] value) throws CFException {
      work.setPtrIp081050800(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
     public class ScanTbl40OccurrenceInCtx implements Cloneable {
     Ip00404Table ip00404Table = Ip081100Ctx.this.getIp00404Table();
     IsIndiaAcctRngGroup100 isIndiaAcctRngGroup100 = Ip081100Ctx.this.getIsIndiaAcctRngGroup100();
     Ip08151PassedParms ip08151PassedParms = Ip081100Ctx.this.getIp08151PassedParms();
     Ip08151ReturnParms ip08151ReturnParms = Ip081100Ctx.this.getIp08151ReturnParms();
     Work work = Ip081100Ctx.this.getWork();

	/**
	 *	Returns the value of ip00404Table
	 *	@return ip00404Table
	 */   
	 public Ip00404Table getIp00404Table() {
   	return ip00404Table;
   }


	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException  {              
   		return work.getPtrIp280010800();
   }

  
	/**
	*  set variable ptrIp280010800
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) throws CFException {
      work.setPtrIp280010800(value);
   } 

	/**
	 *	Returns the value of ip00404EntriesFoundCount
	 *	@return ip00404EntriesFoundCount
	 */
	public int getIp00404EntriesFoundCount() throws CFException {        
   		return ip00404Table.getIp00404EntriesFoundCount();
	}
	
	/**
	 * 	Update Ip00404EntriesFoundCount with the passed value
	 *	@param number
	 */
	public void setIp00404EntriesFoundCount(int number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount(number);
	}


	public void setIp00404EntriesFoundCount(long number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount((int)number);
	}


	/**
	 *	Returns the value of ip08151PassedParms
	 *	@return ip08151PassedParms
	 */   
	 public Ip08151PassedParms getIp08151PassedParms() {
   	return ip08151PassedParms;
   }


	/**
	 *	Returns the value of ip00404Country
	 *	@return ip00404Country
	 */
   public char[] getIp00404Country(int index) throws CFException  {              
   		return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().getIp00404Country();
   }

  
	/**
	*  set variable ip00404Country
	*  @param value
	**/
   public void setIp00404Country(int index,char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(value);
   } 

     /**
	 * 	Update Ip00404Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Country(int index,char[] source, int sourceIndex) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source, sourceIndex);
   	
   }
   
   public void setIp00404Country(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00404Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Country(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00404Country with another Field
	 *	@param value
	 */
   public void setIp00404Country(int index,Field source) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source);
   }  
   
     /**
	 * 	Update Ip00404Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Country(int index,Field source, int sourceIndex,int sourceLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00404Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Country(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404Country(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08151PassedAcctNbr
	 *	@return ip08151PassedAcctNbr
	 */
   public char[] getIp08151PassedAcctNbr() throws CFException  {              
   		return ip08151PassedParms.getIp08151PassedAcctNbr();
   }

  
	/**
	*  set variable ip08151PassedAcctNbr
	*  @param value
	**/
   public void setIp08151PassedAcctNbr(char[] value) throws CFException {
      ip08151PassedParms.setIp08151PassedAcctNbr(value);
   } 

     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex) throws CFException {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex);
   	
   }
   
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08151PassedAcctNbr with another Field
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source);
   }  
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08151ReturnAcctNbrL
	 *	@return ip08151ReturnAcctNbrL
	 */
	public short getIp08151ReturnAcctNbrL() throws CFException {        
   		return ip08151ReturnParms.getIp08151ReturnAcctNbrL();
	}
	
	/**
	 * 	Update Ip08151ReturnAcctNbrL with the passed value
	 *	@param number
	 */
	public void setIp08151ReturnAcctNbrL(short number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL(number);
	}

	public void setIp08151ReturnAcctNbrL(int number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL((short)number);
	}

	public void setIp08151ReturnAcctNbrL(long number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL((short)number);
	}



	/**
	 *	Returns the value of ptrIp081050800
	 *	@return ptrIp081050800
	 */
   public char[] getPtrIp081050800() throws CFException  {              
   		return work.getPtrIp081050800();
   }

  
	/**
	*  set variable ptrIp081050800
	*  @param value
	**/
   public void setPtrIp081050800(char[] value) throws CFException {
      work.setPtrIp081050800(value);
   } 


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
        }

        public ScanTbl40OccurrenceOutCtx getScanTbl40OccurrenceOutCtx() {
            return new ScanTbl40OccurrenceOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00404Table.hashCode();
        str += isIndiaAcctRngGroup100.hashCode();
        str += ip08151PassedParms.hashCode();
        str += ip08151ReturnParms.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ScanTbl40OccurrenceInCtx clone() {
        ScanTbl40OccurrenceInCtx cloneObj = new ScanTbl40OccurrenceInCtx();
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.isIndiaAcctRngGroup100 = new IsIndiaAcctRngGroup100();
        cloneObj.isIndiaAcctRngGroup100.set(isIndiaAcctRngGroup100.getClonedField());
        cloneObj.ip08151PassedParms = new Ip08151PassedParms();
        cloneObj.ip08151PassedParms.set(ip08151PassedParms.getClonedField());
        cloneObj.ip08151ReturnParms = new Ip08151ReturnParms();
        cloneObj.ip08151ReturnParms.set(ip08151ReturnParms.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ScanTbl40OccurrenceInCtx getScanTbl40OccurrenceInCtx() {
            return new ScanTbl40OccurrenceInCtx();
    }
     public class ScanTbl40OccurrenceOutCtx implements Cloneable {
     Ip00404Table ip00404Table = Ip081100Ctx.this.getIp00404Table();
     IsIndiaAcctRngGroup100 isIndiaAcctRngGroup100 = Ip081100Ctx.this.getIsIndiaAcctRngGroup100();
     Ip08151PassedParms ip08151PassedParms = Ip081100Ctx.this.getIp08151PassedParms();
     Ip08151ReturnParms ip08151ReturnParms = Ip081100Ctx.this.getIp08151ReturnParms();
     Work work = Ip081100Ctx.this.getWork();

	/**
	 *	Returns the value of ip00404Table
	 *	@return ip00404Table
	 */   
	 public Ip00404Table getIp00404Table() {
   	return ip00404Table;
   }


	/**
	 *	Returns the value of ip00404EntriesFoundCount
	 *	@return ip00404EntriesFoundCount
	 */
	public int getIp00404EntriesFoundCount() throws CFException {        
   		return ip00404Table.getIp00404EntriesFoundCount();
	}
	
	/**
	 * 	Update Ip00404EntriesFoundCount with the passed value
	 *	@param number
	 */
	public void setIp00404EntriesFoundCount(int number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount(number);
	}


	public void setIp00404EntriesFoundCount(long number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount((int)number);
	}


	/**
	 *	Test condition "Y" for isAccRngIndiaY88100()
	 *	@return  Returns true if isAccRngIndiaY88100() is "Y"
	 */
   public boolean isAccRngIndiaY88100() throws CFException {
      return isIndiaAcctRngGroup100.isAccRngIndiaY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setAccRngIndiaY88100True()  throws CFException{  			
    	isIndiaAcctRngGroup100.setAccRngIndiaY88100True();
   	}
	/**
	 *	Returns the value of ip08151PassedAcctNbr
	 *	@return ip08151PassedAcctNbr
	 */
   public char[] getIp08151PassedAcctNbr() throws CFException  {              
   		return ip08151PassedParms.getIp08151PassedAcctNbr();
   }

  
	/**
	*  set variable ip08151PassedAcctNbr
	*  @param value
	**/
   public void setIp08151PassedAcctNbr(char[] value) throws CFException {
      ip08151PassedParms.setIp08151PassedAcctNbr(value);
   } 

     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex) throws CFException {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex);
   	
   }
   
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08151PassedAcctNbr with another Field
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source);
   }  
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08151PassedParms.setIp08151PassedAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08151ReturnAcctNbrL
	 *	@return ip08151ReturnAcctNbrL
	 */
	public short getIp08151ReturnAcctNbrL() throws CFException {        
   		return ip08151ReturnParms.getIp08151ReturnAcctNbrL();
	}
	
	/**
	 * 	Update Ip08151ReturnAcctNbrL with the passed value
	 *	@param number
	 */
	public void setIp08151ReturnAcctNbrL(short number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL(number);
	}

	public void setIp08151ReturnAcctNbrL(int number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL((short)number);
	}

	public void setIp08151ReturnAcctNbrL(long number)  throws CFException{
		ip08151ReturnParms.setIp08151ReturnAcctNbrL((short)number);
	}



	/**
	 *	Returns the value of ip00404Tbl40ArH
	 *	@return ip00404Tbl40ArH
	 */
   public char[] getIp00404Tbl40ArH() throws CFException  {              
   		return ip00404Table.getIp00404ArRangeGrp().getIp00404Tbl40ArH();
   }

  
	/**
	*  set variable ip00404Tbl40ArH
	*  @param value
	**/
   public void setIp00404Tbl40ArH(char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(value);
   } 

     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex) throws CFException {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex);
   	
   }
   
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00404Tbl40ArH with another Field
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source);
   }  
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00404Table.hashCode();
        str += isIndiaAcctRngGroup100.hashCode();
        str += ip08151PassedParms.hashCode();
        str += ip08151ReturnParms.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ScanTbl40OccurrenceOutCtx clone() {
        ScanTbl40OccurrenceOutCtx cloneObj = new ScanTbl40OccurrenceOutCtx();
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.isIndiaAcctRngGroup100 = new IsIndiaAcctRngGroup100();
        cloneObj.isIndiaAcctRngGroup100.set(isIndiaAcctRngGroup100.getClonedField());
        cloneObj.ip08151PassedParms = new Ip08151PassedParms();
        cloneObj.ip08151PassedParms.set(ip08151PassedParms.getClonedField());
        cloneObj.ip08151ReturnParms = new Ip08151ReturnParms();
        cloneObj.ip08151ReturnParms.set(ip08151ReturnParms.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ScanTbl40OccurrenceOutCtx getScanTbl40OccurrenceOutCtx() {
            return new ScanTbl40OccurrenceOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip081100Ctx.this.getIp60001EventLogWorkArea();

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




        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip081100Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip081100Ctx getIp081100Ctx() {
            return Ip081100Ctx.this;
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
