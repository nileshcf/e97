package com.cloudframe.app.ip650010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip650010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.ip650010.dto.AbendMessage900;
import com.cloudframe.app.ip650010.dto.FileCloseError630;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.ip650010.file.records.Sys007OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.ip650010.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
import com.cloudframe.app.global.sharedvar.CurrentTableKey800;
import com.cloudframe.app.ip650010.dto.FileStartError610;
import com.cloudframe.app.ip650010.dto.FileOpenError600;
import com.cloudframe.app.ip650010.file.records.Sys007OptimizedParmRec;
import com.cloudframe.app.ip650010.file.records.Sys007TableKeyAll;
import com.cloudframe.app.ip650010.dto.FileReadError620;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.ip650010.file.records.Sys007OptimizedParmRecGroup;
import com.cloudframe.app.ip650010.dto.RecordsReadMessage640;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip50005TableKeyAll;


@Context
public class Ip650010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    FileOpenError600 fileOpenError600;
    FileReadError620 fileReadError620;
    AbendParaName900 abendParaName900;
    FileCloseError630 fileCloseError630;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    CurrentTableKey800 currentTableKey800;
    Ip50005OneDayRec ip50005OneDayRec;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    FileStartError610 fileStartError610;
    RecordsReadMessage640 recordsReadMessage640;
    AbendMessage900 abendMessage900;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
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


    public FileOpenError600 getFileOpenError600() {
        if (fileOpenError600 == null) {
            fileOpenError600 = new FileOpenError600();
        }

        return fileOpenError600;
    }

    public void setFileOpenError600(FileOpenError600 fileOpenError600) {
        this.fileOpenError600 = fileOpenError600;
    }
    public FileReadError620 getFileReadError620() {
        if (fileReadError620 == null) {
            fileReadError620 = new FileReadError620();
        }

        return fileReadError620;
    }

    public void setFileReadError620(FileReadError620 fileReadError620) {
        this.fileReadError620 = fileReadError620;
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
    public FileCloseError630 getFileCloseError630() {
        if (fileCloseError630 == null) {
            fileCloseError630 = new FileCloseError630();
        }

        return fileCloseError630;
    }

    public void setFileCloseError630(FileCloseError630 fileCloseError630) {
        this.fileCloseError630 = fileCloseError630;
    }
    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Sys007OptimizedParmRecGroup getSys007OptimizedParmRecGroup() {
        if (sys007OptimizedParmRecGroup == null) {
            sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        }

        return sys007OptimizedParmRecGroup;
    }

    public void setSys007OptimizedParmRecGroup(Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup) {
        this.sys007OptimizedParmRecGroup = sys007OptimizedParmRecGroup;
    }
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public CurrentTableKey800 getCurrentTableKey800() {
        if (currentTableKey800 == null) {
            currentTableKey800 = globalCtx.getGlobalDto(CurrentTableKey800.class);
        }

        return currentTableKey800;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public FileStartError610 getFileStartError610() {
        if (fileStartError610 == null) {
            fileStartError610 = new FileStartError610();
        }

        return fileStartError610;
    }

    public void setFileStartError610(FileStartError610 fileStartError610) {
        this.fileStartError610 = fileStartError610;
    }
    public RecordsReadMessage640 getRecordsReadMessage640() {
        if (recordsReadMessage640 == null) {
            recordsReadMessage640 = new RecordsReadMessage640();
        }

        return recordsReadMessage640;
    }

    public void setRecordsReadMessage640(RecordsReadMessage640 recordsReadMessage640) {
        this.recordsReadMessage640 = recordsReadMessage640;
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
    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
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
        str += fileOpenError600.hashCode();
        str += fileReadError620.hashCode();
        str += abendParaName900.hashCode();
        str += fileCloseError630.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += currentTableKey800.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += fileStartError610.hashCode();
        str += recordsReadMessage640.hashCode();
        str += abendMessage900.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip650010Ctx clone() {
        Ip650010Ctx cloneObj = new Ip650010Ctx();
        cloneObj.fileOpenError600 = new FileOpenError600();
        cloneObj.fileOpenError600.set(fileOpenError600.getClonedField());
        cloneObj.fileReadError620 = new FileReadError620();
        cloneObj.fileReadError620.set(fileReadError620.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.fileCloseError630 = new FileCloseError630();
        cloneObj.fileCloseError630.set(fileCloseError630.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.fileStartError610 = new FileStartError610();
        cloneObj.fileStartError610.set(fileStartError610.getClonedField());
        cloneObj.recordsReadMessage640 = new RecordsReadMessage640();
        cloneObj.recordsReadMessage640.set(recordsReadMessage640.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();

	/**
	 *	Test condition "99999999" for isIp50005CloseIndicator88()
	 *	@return  Returns true if isIp50005CloseIndicator88() is "99999999"
	 */
   public boolean isIp50005CloseIndicator88() throws CFException {
      return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().isIp50005CloseIndicator88();
   }

	/**
	*  set values "99999999"
	*/
   	public void setIp50005CloseIndicator88True()  throws CFException{  			
    	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005CloseIndicator88True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class InitializeInCtx implements Cloneable {
     Work work = Ip650010Ctx.this.getWork();

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

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
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

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Work work = Ip650010Ctx.this.getWork();

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

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class OpenOptParmFileInCtx implements Cloneable {
     FileOpenError600 fileOpenError600 = Ip650010Ctx.this.getFileOpenError600();
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip650010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of fileOpenError600
	 *	@return fileOpenError600
	 */   
	 public FileOpenError600 getFileOpenError600() {
   	return fileOpenError600;
   }


	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll();
   }

   /**
	* 	Update Sys007TableKeyAll with the passed value
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(value);
   }   

     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source);
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys007OptimizedParmRec
	 *	@return sys007OptimizedParmRec
	 */   
	 public Sys007OptimizedParmRec getSys007OptimizedParmRec() {
   	return sys007OptimizedParmRecGroup.getSys007OptimizedParmRec();
   }

   /**
	* 	Update Sys007OptimizedParmRec with the passed value
	*	@param value
	*/
   public void setSys007OptimizedParmRec(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(value);
   }   

     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007OptimizedParmRec with another Field
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source);
   }  
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fileOpenAbendCode300
	 *	@return fileOpenAbendCode300
	 */
   public char[] getFileOpenAbendCode300() throws CFException  {              
   		return work.getFileOpenAbendCode300();
   }

  
	/**
	*  set variable fileOpenAbendCode300
	*  @param value
	**/
   public void setFileOpenAbendCode300(char[] value) throws CFException {
      work.setFileOpenAbendCode300(value);
   } 


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public OpenOptParmFileOutCtx getOpenOptParmFileOutCtx() {
            return new OpenOptParmFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fileOpenError600.hashCode();
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenOptParmFileInCtx clone() {
        OpenOptParmFileInCtx cloneObj = new OpenOptParmFileInCtx();
        cloneObj.fileOpenError600 = new FileOpenError600();
        cloneObj.fileOpenError600.set(fileOpenError600.getClonedField());
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenOptParmFileInCtx getOpenOptParmFileInCtx() {
            return new OpenOptParmFileInCtx();
    }
     public class OpenOptParmFileOutCtx implements Cloneable {
     FileOpenError600 fileOpenError600 = Ip650010Ctx.this.getFileOpenError600();
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip650010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of fileOpenError600
	 *	@return fileOpenError600
	 */   
	 public FileOpenError600 getFileOpenError600() {
   	return fileOpenError600;
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
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
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
	 *	Returns the value of badStatusCode600
	 *	@return badStatusCode600
	 */
   public char[] getBadStatusCode600() throws CFException  {              
   		return fileOpenError600.getBadStatusCode600();
   }

  
	/**
	*  set variable badStatusCode600
	*  @param value
	**/
   public void setBadStatusCode600(char[] value) throws CFException {
      fileOpenError600.setBadStatusCode600(value);
   } 

     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex) throws CFException {
      fileOpenError600.setBadStatusCode600(source, sourceIndex);
   	
   }
   
   public void setBadStatusCode600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fileOpenError600.setBadStatusCode600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileOpenError600.setBadStatusCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BadStatusCode600 with another Field
	 *	@param value
	 */
   public void setBadStatusCode600(Field source) {
      fileOpenError600.setBadStatusCode600(source);
   }  
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen) {
      fileOpenError600.setBadStatusCode600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileOpenError600.setBadStatusCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "1200-OPEN-OPT-PARM-FILE" for isPara120088900()
	 *	@return  Returns true if isPara120088900() is "1200-OPEN-OPT-PARM-FILE"
	 */
   public boolean isPara120088900() throws CFException {
      return abendParaName900.isPara120088900();
   }

	/**
	*  set values "1200-OPEN-OPT-PARM-FILE"
	*/
   	public void setPara120088900True()  throws CFException{  			
    	abendParaName900.setPara120088900True();
   	}
	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
   	}
	/**
	 *	Returns the value of fileOpenAbendCode300
	 *	@return fileOpenAbendCode300
	 */
   public char[] getFileOpenAbendCode300() throws CFException  {              
   		return work.getFileOpenAbendCode300();
   }

  
	/**
	*  set variable fileOpenAbendCode300
	*  @param value
	**/
   public void setFileOpenAbendCode300(char[] value) throws CFException {
      work.setFileOpenAbendCode300(value);
   } 

	/**
	 *	Test condition "N" for isFileIsOpen88100()
	 *	@return  Returns true if isFileIsOpen88100() is "N"
	 */
   public boolean isFileIsOpen88100() throws CFException {
      return work.isFileIsOpen88100();
   }

	/**
	*  set values "N"
	*/
   	public void setFileIsOpen88100True()  throws CFException{  			
    	work.setFileIsOpen88100True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fileOpenError600.hashCode();
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenOptParmFileOutCtx clone() {
        OpenOptParmFileOutCtx cloneObj = new OpenOptParmFileOutCtx();
        cloneObj.fileOpenError600 = new FileOpenError600();
        cloneObj.fileOpenError600.set(fileOpenError600.getClonedField());
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenOptParmFileOutCtx getOpenOptParmFileOutCtx() {
            return new OpenOptParmFileOutCtx();
    }
     public class ReadBuildReturnDataInCtx implements Cloneable {
     CurrentTableKey800 currentTableKey800 = Ip650010Ctx.this.getCurrentTableKey800();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of currentTableKey800
	 *	@return currentTableKey800
	 */   
	 public CurrentTableKey800 getCurrentTableKey800() {
   	return currentTableKey800;
   }


	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
   	}
	/**
	 *	Returns the value of ip50005TableKey
	 *	@return ip50005TableKey
	 */   
	 public Ip50005TableKey getIp50005TableKey() {
   	return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
   }

   /**
	* 	Update Ip50005TableKey with the passed value
	*	@param value
	*/
   public void setIp50005TableKey(char[] value) throws CFException {
      ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(value);
   }   

     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKey with another Field
	 *	@param value
	 */
   public void setIp50005TableKey(Field source) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source);
   }  
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "02" for isIp50005TblLastRecN88()
	 *	@return  Returns true if isIp50005TblLastRecN88() is "02"
	 */
   public boolean isIp50005TblLastRecN88() throws CFException {
      return ip50005OneDayReadStatusGroup.isIp50005TblLastRecN88();
   }

	/**
	*  set values "02"
	*/
   	public void setIp50005TblLastRecN88True()  throws CFException{  			
    	ip50005OneDayReadStatusGroup.setIp50005TblLastRecN88True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public ReadBuildReturnDataOutCtx getReadBuildReturnDataOutCtx() {
            return new ReadBuildReturnDataOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += currentTableKey800.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadBuildReturnDataInCtx clone() {
        ReadBuildReturnDataInCtx cloneObj = new ReadBuildReturnDataInCtx();
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadBuildReturnDataInCtx getReadBuildReturnDataInCtx() {
            return new ReadBuildReturnDataInCtx();
    }
     public class ReadBuildReturnDataOutCtx implements Cloneable {
     CurrentTableKey800 currentTableKey800 = Ip650010Ctx.this.getCurrentTableKey800();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of currentTableKey800
	 *	@return currentTableKey800
	 */   
	 public CurrentTableKey800 getCurrentTableKey800() {
   	return currentTableKey800;
   }


	/**
	 *	Returns the value of ip50005TableKey
	 *	@return ip50005TableKey
	 */   
	 public Ip50005TableKey getIp50005TableKey() {
   	return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
   }

   /**
	* 	Update Ip50005TableKey with the passed value
	*	@param value
	*/
   public void setIp50005TableKey(char[] value) throws CFException {
      ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(value);
   }   

     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKey with another Field
	 *	@param value
	 */
   public void setIp50005TableKey(Field source) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source);
   }  
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().setIp50005TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += currentTableKey800.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadBuildReturnDataOutCtx clone() {
        ReadBuildReturnDataOutCtx cloneObj = new ReadBuildReturnDataOutCtx();
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadBuildReturnDataOutCtx getReadBuildReturnDataOutCtx() {
            return new ReadBuildReturnDataOutCtx();
    }
     public class PositionOptParmFileInCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     FileStartError610 fileStartError610 = Ip650010Ctx.this.getFileStartError610();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Test condition "23" for isNoTblRecords88200()
	 *	@return  Returns true if isNoTblRecords88200() is "23"
	 */
   public boolean isNoTblRecords88200() throws CFException {
      return work.isNoTblRecords88200();
   }

	/**
	*  set values "23"
	*/
   	public void setNoTblRecords88200True()  throws CFException{  			
    	work.setNoTblRecords88200True();
   	}
	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll();
   }

   /**
	* 	Update Sys007TableKeyAll with the passed value
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(value);
   }   

     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source);
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Returns the value of fileStartAbendCode300
	 *	@return fileStartAbendCode300
	 */
   public char[] getFileStartAbendCode300() throws CFException  {              
   		return work.getFileStartAbendCode300();
   }

  
	/**
	*  set variable fileStartAbendCode300
	*  @param value
	**/
   public void setFileStartAbendCode300(char[] value) throws CFException {
      work.setFileStartAbendCode300(value);
   } 

	/**
	 *	Returns the value of fileStartError610
	 *	@return fileStartError610
	 */   
	 public FileStartError610 getFileStartError610() {
   	return fileStartError610;
   }


	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
   	}
	/**
	 *	Returns the value of ip50005TableKeyAll
	 *	@return ip50005TableKeyAll
	 */   
	 public Ip50005TableKeyAll getIp50005TableKeyAll() {
   	return ip50005OneDayRec.getIp50005TableKeyAll();
   }

   /**
	* 	Update Ip50005TableKeyAll with the passed value
	*	@param value
	*/
   public void setIp50005TableKeyAll(char[] value) throws CFException {
      ip50005OneDayRec.setIp50005TableKeyAll(value);
   }   

     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKeyAll with another Field
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source);
   }  
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public PositionOptParmFileOutCtx getPositionOptParmFileOutCtx() {
            return new PositionOptParmFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += fileStartError610.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PositionOptParmFileInCtx clone() {
        PositionOptParmFileInCtx cloneObj = new PositionOptParmFileInCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.fileStartError610 = new FileStartError610();
        cloneObj.fileStartError610.set(fileStartError610.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PositionOptParmFileInCtx getPositionOptParmFileInCtx() {
            return new PositionOptParmFileInCtx();
    }
     public class PositionOptParmFileOutCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     FileStartError610 fileStartError610 = Ip650010Ctx.this.getFileStartError610();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll();
   }

   /**
	* 	Update Sys007TableKeyAll with the passed value
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(value);
   }   

     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source);
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Returns the value of badStatusCode610
	 *	@return badStatusCode610
	 */
   public char[] getBadStatusCode610() throws CFException  {              
   		return fileStartError610.getBadStatusCode610();
   }

  
	/**
	*  set variable badStatusCode610
	*  @param value
	**/
   public void setBadStatusCode610(char[] value) throws CFException {
      fileStartError610.setBadStatusCode610(value);
   } 

     /**
	 * 	Update BadStatusCode610 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode610(char[] source, int sourceIndex) throws CFException {
      fileStartError610.setBadStatusCode610(source, sourceIndex);
   	
   }
   
   public void setBadStatusCode610(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fileStartError610.setBadStatusCode610(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BadStatusCode610 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode610(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileStartError610.setBadStatusCode610(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BadStatusCode610 with another Field
	 *	@param value
	 */
   public void setBadStatusCode610(Field source) {
      fileStartError610.setBadStatusCode610(source);
   }  
   
     /**
	 * 	Update BadStatusCode610 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode610(Field source, int sourceIndex,int sourceLen) {
      fileStartError610.setBadStatusCode610(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BadStatusCode610 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode610(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileStartError610.setBadStatusCode610(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of fileStartAbendCode300
	 *	@return fileStartAbendCode300
	 */
   public char[] getFileStartAbendCode300() throws CFException  {              
   		return work.getFileStartAbendCode300();
   }

  
	/**
	*  set variable fileStartAbendCode300
	*  @param value
	**/
   public void setFileStartAbendCode300(char[] value) throws CFException {
      work.setFileStartAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip50005TableKeyAll
	 *	@return ip50005TableKeyAll
	 */   
	 public Ip50005TableKeyAll getIp50005TableKeyAll() {
   	return ip50005OneDayRec.getIp50005TableKeyAll();
   }

   /**
	* 	Update Ip50005TableKeyAll with the passed value
	*	@param value
	*/
   public void setIp50005TableKeyAll(char[] value) throws CFException {
      ip50005OneDayRec.setIp50005TableKeyAll(value);
   }   

     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKeyAll with another Field
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source);
   }  
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.setIp50005TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ip50005Seq
	 *	@return ip50005Seq
	 */
	public long getIp50005Seq() throws CFException {        
   		return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005Seq();
	}
	
	/**
	 * 	Update Ip50005Seq with the passed value
	 *	@param number
	 */
	public void setIp50005Seq(long number)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().setIp50005Seq(number);
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
	 *	Returns the value of sys007OptimizedParmRec
	 *	@return sys007OptimizedParmRec
	 */   
	 public Sys007OptimizedParmRec getSys007OptimizedParmRec() {
   	return sys007OptimizedParmRecGroup.getSys007OptimizedParmRec();
   }

   /**
	* 	Update Sys007OptimizedParmRec with the passed value
	*	@param value
	*/
   public void setSys007OptimizedParmRec(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(value);
   }   

     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007OptimizedParmRec with another Field
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source);
   }  
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "23" for isIp50005NoReqTblRecs88()
	 *	@return  Returns true if isIp50005NoReqTblRecs88() is "23"
	 */
   public boolean isIp50005NoReqTblRecs88() throws CFException {
      return ip50005OneDayReadStatusGroup.isIp50005NoReqTblRecs88();
   }

	/**
	*  set values "23"
	*/
   	public void setIp50005NoReqTblRecs88True()  throws CFException{  			
    	ip50005OneDayReadStatusGroup.setIp50005NoReqTblRecs88True();
   	}
	/**
	 *	Returns the value of fileStartError610
	 *	@return fileStartError610
	 */   
	 public FileStartError610 getFileStartError610() {
   	return fileStartError610;
   }



        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += fileStartError610.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PositionOptParmFileOutCtx clone() {
        PositionOptParmFileOutCtx cloneObj = new PositionOptParmFileOutCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.fileStartError610 = new FileStartError610();
        cloneObj.fileStartError610.set(fileStartError610.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PositionOptParmFileOutCtx getPositionOptParmFileOutCtx() {
            return new PositionOptParmFileOutCtx();
    }
     public class ReadOptParmFileInCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     FileReadError620 fileReadError620 = Ip650010Ctx.this.getFileReadError620();
     CurrentTableKey800 currentTableKey800 = Ip650010Ctx.this.getCurrentTableKey800();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of optParmRecLngth400
	 *	@return optParmRecLngth400
	 */
	public long getOptParmRecLngth400() throws CFException {        
   		return work.getOptParmRecLngth400();
	}
	
	/**
	 * 	Update OptParmRecLngth400 with the passed value
	 *	@param number
	 */
	public void setOptParmRecLngth400(long number)  throws CFException{
		work.setOptParmRecLngth400(number);
	}



	/**
	 *	Returns the value of fileReadError620
	 *	@return fileReadError620
	 */   
	 public FileReadError620 getFileReadError620() {
   	return fileReadError620;
   }


	/**
	 *	Returns the value of currentTableKey800
	 *	@return currentTableKey800
	 */   
	 public CurrentTableKey800 getCurrentTableKey800() {
   	return currentTableKey800;
   }


	/**
	 *	Returns the value of fileReadAbendCode300
	 *	@return fileReadAbendCode300
	 */
   public char[] getFileReadAbendCode300() throws CFException  {              
   		return work.getFileReadAbendCode300();
   }

  
	/**
	*  set variable fileReadAbendCode300
	*  @param value
	**/
   public void setFileReadAbendCode300(char[] value) throws CFException {
      work.setFileReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return work.getValueOne300();
	}


	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() throws CFException {
	     return String.valueOf(work.getValueOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric()  throws CFException{
	    return work.valueOne300IsNumeric();
	}

	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}
	

	public void setValueOne300(long number)  throws CFException{
	    work.setValueOne300(number);
	}
	
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value)  throws CFException {
		work.setValueOne300(value);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value)  throws CFException{
		work.setValueOne300(value);
	}	

	/**
	 *	Returns the value of recordsRead400
	 *	@return recordsRead400
	 */
	public int getRecordsRead400() throws CFException {        
   		return work.getRecordsRead400();
	}
	
	/**
	 * 	Update RecordsRead400 with the passed value
	 *	@param number
	 */
	public void setRecordsRead400(int number)  throws CFException{
		work.setRecordsRead400(number);
	}


	public void setRecordsRead400(long number)  throws CFException{
		work.setRecordsRead400((int)number);
	}



        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public ReadOptParmFileOutCtx getReadOptParmFileOutCtx() {
            return new ReadOptParmFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += fileReadError620.hashCode();
        str += currentTableKey800.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadOptParmFileInCtx clone() {
        ReadOptParmFileInCtx cloneObj = new ReadOptParmFileInCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.fileReadError620 = new FileReadError620();
        cloneObj.fileReadError620.set(fileReadError620.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadOptParmFileInCtx getReadOptParmFileInCtx() {
            return new ReadOptParmFileInCtx();
    }
     public class ReadOptParmFileOutCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     FileReadError620 fileReadError620 = Ip650010Ctx.this.getFileReadError620();
     CurrentTableKey800 currentTableKey800 = Ip650010Ctx.this.getCurrentTableKey800();
     Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup = Ip650010Ctx.this.getIp50005OneDayReadStatusGroup();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll();
   }

   /**
	* 	Update Sys007TableKeyAll with the passed value
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(value);
   }   

     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source);
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Returns the value of fileReadError620
	 *	@return fileReadError620
	 */   
	 public FileReadError620 getFileReadError620() {
   	return fileReadError620;
   }


	/**
	 *	Returns the value of fileReadAbendCode300
	 *	@return fileReadAbendCode300
	 */
   public char[] getFileReadAbendCode300() throws CFException  {              
   		return work.getFileReadAbendCode300();
   }

  
	/**
	*  set variable fileReadAbendCode300
	*  @param value
	**/
   public void setFileReadAbendCode300(char[] value) throws CFException {
      work.setFileReadAbendCode300(value);
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
	 *	Test condition "10" for isEndOfFile88200()
	 *	@return  Returns true if isEndOfFile88200() is "10"
	 */
   public boolean isEndOfFile88200() throws CFException {
      return work.isEndOfFile88200();
   }

	/**
	*  set values "10"
	*/
   	public void setEndOfFile88200True()  throws CFException{  			
    	work.setEndOfFile88200True();
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
	 *	Returns the value of sys007OptimizedParmRec
	 *	@return sys007OptimizedParmRec
	 */   
	 public Sys007OptimizedParmRec getSys007OptimizedParmRec() {
   	return sys007OptimizedParmRecGroup.getSys007OptimizedParmRec();
   }

   /**
	* 	Update Sys007OptimizedParmRec with the passed value
	*	@param value
	*/
   public void setSys007OptimizedParmRec(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(value);
   }   

     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007OptimizedParmRec with another Field
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source);
   }  
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OptimizedParmRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recordsRead400
	 *	@return recordsRead400
	 */
	public int getRecordsRead400() throws CFException {        
   		return work.getRecordsRead400();
	}
	
	/**
	 * 	Update RecordsRead400 with the passed value
	 *	@param number
	 */
	public void setRecordsRead400(int number)  throws CFException{
		work.setRecordsRead400(number);
	}


	public void setRecordsRead400(long number)  throws CFException{
		work.setRecordsRead400((int)number);
	}


	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
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
	 *	Returns the value of badStatusCode620
	 *	@return badStatusCode620
	 */
   public char[] getBadStatusCode620() throws CFException  {              
   		return fileReadError620.getBadStatusCode620();
   }

  
	/**
	*  set variable badStatusCode620
	*  @param value
	**/
   public void setBadStatusCode620(char[] value) throws CFException {
      fileReadError620.setBadStatusCode620(value);
   } 

     /**
	 * 	Update BadStatusCode620 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode620(char[] source, int sourceIndex) throws CFException {
      fileReadError620.setBadStatusCode620(source, sourceIndex);
   	
   }
   
   public void setBadStatusCode620(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fileReadError620.setBadStatusCode620(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BadStatusCode620 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode620(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileReadError620.setBadStatusCode620(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BadStatusCode620 with another Field
	 *	@param value
	 */
   public void setBadStatusCode620(Field source) {
      fileReadError620.setBadStatusCode620(source);
   }  
   
     /**
	 * 	Update BadStatusCode620 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode620(Field source, int sourceIndex,int sourceLen) {
      fileReadError620.setBadStatusCode620(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BadStatusCode620 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode620(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileReadError620.setBadStatusCode620(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "02" for isIp50005TblLastRecN88()
	 *	@return  Returns true if isIp50005TblLastRecN88() is "02"
	 */
   public boolean isIp50005TblLastRecN88() throws CFException {
      return ip50005OneDayReadStatusGroup.isIp50005TblLastRecN88();
   }

	/**
	*  set values "02"
	*/
   	public void setIp50005TblLastRecN88True()  throws CFException{  			
    	ip50005OneDayReadStatusGroup.setIp50005TblLastRecN88True();
   	}
	/**
	 *	Returns the value of sys007TableKey
	 *	@return sys007TableKey
	 */
   public char[] getSys007TableKey() throws CFException  {              
   		return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().getSys007TableKey();
   }

  
	/**
	*  set variable sys007TableKey
	*  @param value
	**/
   public void setSys007TableKey(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(value);
   } 

     /**
	 * 	Update Sys007TableKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKey(char[] source, int sourceIndex) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source, sourceIndex);
   	
   }
   
   public void setSys007TableKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKey with another Field
	 *	@param value
	 */
   public void setSys007TableKey(Field source) {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source);
   }  
   
     /**
	 * 	Update Sys007TableKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys007TableKey(Field source, int sourceIndex,int sourceLen) {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys007TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll().setSys007TableKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += fileReadError620.hashCode();
        str += currentTableKey800.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadOptParmFileOutCtx clone() {
        ReadOptParmFileOutCtx cloneObj = new ReadOptParmFileOutCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.fileReadError620 = new FileReadError620();
        cloneObj.fileReadError620.set(fileReadError620.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadOptParmFileOutCtx getReadOptParmFileOutCtx() {
            return new ReadOptParmFileOutCtx();
    }
     public class ReturnSegToCallerInCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip650010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of sys007OptimizedParmRecGroup
	 *	@return sys007OptimizedParmRecGroup
	 */   
	 public Sys007OptimizedParmRecGroup getSys007OptimizedParmRecGroup() {
   	return sys007OptimizedParmRecGroup;
   }


	/**
	 *	Returns the value of optParmRecLngth400
	 *	@return optParmRecLngth400
	 */
	public long getOptParmRecLngth400() throws CFException {        
   		return work.getOptParmRecLngth400();
	}
	
	/**
	 * 	Update OptParmRecLngth400 with the passed value
	 *	@param number
	 */
	public void setOptParmRecLngth400(long number)  throws CFException{
		work.setOptParmRecLngth400(number);
	}



	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec().getSys007TableKeyAll();
   }

   /**
	* 	Update Sys007TableKeyAll with the passed value
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(value);
   }   

     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source);
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.getSys007OneDayRec().setSys007TableKeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys007OneDayRec
	 *	@return sys007OneDayRec
	 */   
	 public Sys007OneDayRec getSys007OneDayRec() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec();
   }

   /**
	* 	Update Sys007OneDayRec with the passed value
	*	@param value
	*/
   public void setSys007OneDayRec(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.setSys007OneDayRec(value);
   }   

     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007OneDayRec with another Field
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source);
   }  
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
   }


	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return work.getValueOne300();
	}


	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() throws CFException {
	     return String.valueOf(work.getValueOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric()  throws CFException{
	    return work.valueOne300IsNumeric();
	}

	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}
	

	public void setValueOne300(long number)  throws CFException{
	    work.setValueOne300(number);
	}
	
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value)  throws CFException {
		work.setValueOne300(value);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value)  throws CFException{
		work.setValueOne300(value);
	}	


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public ReturnSegToCallerOutCtx getReturnSegToCallerOutCtx() {
            return new ReturnSegToCallerOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReturnSegToCallerInCtx clone() {
        ReturnSegToCallerInCtx cloneObj = new ReturnSegToCallerInCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReturnSegToCallerInCtx getReturnSegToCallerInCtx() {
            return new ReturnSegToCallerInCtx();
    }
     public class ReturnSegToCallerOutCtx implements Cloneable {
     Sys007OptimizedParmRecGroup sys007OptimizedParmRecGroup = Ip650010Ctx.this.getSys007OptimizedParmRecGroup();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup = Ip650010Ctx.this.getIp50005OneDayRecLthGroup();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of optParmRecLngth400
	 *	@return optParmRecLngth400
	 */
	public long getOptParmRecLngth400() throws CFException {        
   		return work.getOptParmRecLngth400();
	}
	
	/**
	 * 	Update OptParmRecLngth400 with the passed value
	 *	@param number
	 */
	public void setOptParmRecLngth400(long number)  throws CFException{
		work.setOptParmRecLngth400(number);
	}



	/**
	 *	Returns the value of sys007OneDayRec
	 *	@return sys007OneDayRec
	 */   
	 public Sys007OneDayRec getSys007OneDayRec() {
   	return sys007OptimizedParmRecGroup.getSys007OneDayRec();
   }

   /**
	* 	Update Sys007OneDayRec with the passed value
	*	@param value
	*/
   public void setSys007OneDayRec(char[] value) throws CFException {
      sys007OptimizedParmRecGroup.setSys007OneDayRec(value);
   }   

     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys007OneDayRec with another Field
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source);
   }  
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys007OptimizedParmRecGroup.setSys007OneDayRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005OneDayRec
	 *	@return ip50005OneDayRec
	 */   
	 public Ip50005OneDayRec getIp50005OneDayRec() {
   	return ip50005OneDayRec;
   }


	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return work.getValueOne300();
	}


	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() throws CFException {
	     return String.valueOf(work.getValueOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric()  throws CFException{
	    return work.valueOne300IsNumeric();
	}

	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}
	

	public void setValueOne300(long number)  throws CFException{
	    work.setValueOne300(number);
	}
	
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value)  throws CFException {
		work.setValueOne300(value);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value)  throws CFException{
		work.setValueOne300(value);
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




        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys007OptimizedParmRecGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReturnSegToCallerOutCtx clone() {
        ReturnSegToCallerOutCtx cloneObj = new ReturnSegToCallerOutCtx();
        cloneObj.sys007OptimizedParmRecGroup = new Sys007OptimizedParmRecGroup();
        cloneObj.sys007OptimizedParmRecGroup.set(sys007OptimizedParmRecGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReturnSegToCallerOutCtx getReturnSegToCallerOutCtx() {
            return new ReturnSegToCallerOutCtx();
    }
     public class CloseFileCheckStatusInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip650010Ctx.this.getAbendParaName900();
     FileCloseError630 fileCloseError630 = Ip650010Ctx.this.getFileCloseError630();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Returns the value of fileCloseError630
	 *	@return fileCloseError630
	 */   
	 public FileCloseError630 getFileCloseError630() {
   	return fileCloseError630;
   }


	/**
	 *	Returns the value of fileCloseAbendCode300
	 *	@return fileCloseAbendCode300
	 */
   public char[] getFileCloseAbendCode300() throws CFException  {              
   		return work.getFileCloseAbendCode300();
   }

  
	/**
	*  set variable fileCloseAbendCode300
	*  @param value
	**/
   public void setFileCloseAbendCode300(char[] value) throws CFException {
      work.setFileCloseAbendCode300(value);
   } 

	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public CloseFileCheckStatusOutCtx getCloseFileCheckStatusOutCtx() {
            return new CloseFileCheckStatusOutCtx();
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
        str += abendParaName900.hashCode();
        str += fileCloseError630.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseFileCheckStatusInCtx clone() {
        CloseFileCheckStatusInCtx cloneObj = new CloseFileCheckStatusInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.fileCloseError630 = new FileCloseError630();
        cloneObj.fileCloseError630.set(fileCloseError630.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseFileCheckStatusInCtx getCloseFileCheckStatusInCtx() {
            return new CloseFileCheckStatusInCtx();
    }
     public class CloseFileCheckStatusOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip650010Ctx.this.getAbendParaName900();
     FileCloseError630 fileCloseError630 = Ip650010Ctx.this.getFileCloseError630();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();
     Work work = Ip650010Ctx.this.getWork();

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
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Returns the value of fileCloseError630
	 *	@return fileCloseError630
	 */   
	 public FileCloseError630 getFileCloseError630() {
   	return fileCloseError630;
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

	/**
	 *	Returns the value of badStatusCode630
	 *	@return badStatusCode630
	 */
   public char[] getBadStatusCode630() throws CFException  {              
   		return fileCloseError630.getBadStatusCode630();
   }

  
	/**
	*  set variable badStatusCode630
	*  @param value
	**/
   public void setBadStatusCode630(char[] value) throws CFException {
      fileCloseError630.setBadStatusCode630(value);
   } 

     /**
	 * 	Update BadStatusCode630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode630(char[] source, int sourceIndex) throws CFException {
      fileCloseError630.setBadStatusCode630(source, sourceIndex);
   	
   }
   
   public void setBadStatusCode630(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fileCloseError630.setBadStatusCode630(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BadStatusCode630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileCloseError630.setBadStatusCode630(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BadStatusCode630 with another Field
	 *	@param value
	 */
   public void setBadStatusCode630(Field source) {
      fileCloseError630.setBadStatusCode630(source);
   }  
   
     /**
	 * 	Update BadStatusCode630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode630(Field source, int sourceIndex,int sourceLen) {
      fileCloseError630.setBadStatusCode630(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BadStatusCode630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fileCloseError630.setBadStatusCode630(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Test condition "8300-CLOSE-OPT-PARM-FILE" for isPara830088900()
	 *	@return  Returns true if isPara830088900() is "8300-CLOSE-OPT-PARM-FILE"
	 */
   public boolean isPara830088900() throws CFException {
      return abendParaName900.isPara830088900();
   }

	/**
	*  set values "8300-CLOSE-OPT-PARM-FILE"
	*/
   	public void setPara830088900True()  throws CFException{  			
    	abendParaName900.setPara830088900True();
   	}
	/**
	 *	Returns the value of fileCloseAbendCode300
	 *	@return fileCloseAbendCode300
	 */
   public char[] getFileCloseAbendCode300() throws CFException  {              
   		return work.getFileCloseAbendCode300();
   }

  
	/**
	*  set variable fileCloseAbendCode300
	*  @param value
	**/
   public void setFileCloseAbendCode300(char[] value) throws CFException {
      work.setFileCloseAbendCode300(value);
   } 

	/**
	 *	Test condition "Y" for isFileIsClosed88100()
	 *	@return  Returns true if isFileIsClosed88100() is "Y"
	 */
   public boolean isFileIsClosed88100() throws CFException {
      return work.isFileIsClosed88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setFileIsClosed88100True()  throws CFException{  			
    	work.setFileIsClosed88100True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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
        str += abendParaName900.hashCode();
        str += fileCloseError630.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseFileCheckStatusOutCtx clone() {
        CloseFileCheckStatusOutCtx cloneObj = new CloseFileCheckStatusOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.fileCloseError630 = new FileCloseError630();
        cloneObj.fileCloseError630.set(fileCloseError630.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseFileCheckStatusOutCtx getCloseFileCheckStatusOutCtx() {
            return new CloseFileCheckStatusOutCtx();
    }
     public class CloseOneDayFileInCtx implements Cloneable {
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Test condition "N" for isFileIsOpen88100()
	 *	@return  Returns true if isFileIsOpen88100() is "N"
	 */
   public boolean isFileIsOpen88100() throws CFException {
      return work.isFileIsOpen88100();
   }

	/**
	*  set values "N"
	*/
   	public void setFileIsOpen88100True()  throws CFException{  			
    	work.setFileIsOpen88100True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
        }

        public CloseOneDayFileOutCtx getCloseOneDayFileOutCtx() {
            return new CloseOneDayFileOutCtx();
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

    public CloseOneDayFileInCtx clone() {
        CloseOneDayFileInCtx cloneObj = new CloseOneDayFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseOneDayFileInCtx getCloseOneDayFileInCtx() {
            return new CloseOneDayFileInCtx();
    }
     public class CloseOneDayFileOutCtx implements Cloneable {
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException  {              
   		return work.getOptParmFileStatus200();
   }

  
	/**
	*  set variable optParmFileStatus200
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) throws CFException {
      work.setOptParmFileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return work.isOptParmIoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True()  throws CFException{  			
    	work.setOptParmIoGood88200True();
   	}

        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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

    public CloseOneDayFileOutCtx clone() {
        CloseOneDayFileOutCtx cloneObj = new CloseOneDayFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseOneDayFileOutCtx getCloseOneDayFileOutCtx() {
            return new CloseOneDayFileOutCtx();
    }
     public class DisplayCountInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     RecordsReadMessage640 recordsReadMessage640 = Ip650010Ctx.this.getRecordsReadMessage640();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of recordsRead400
	 *	@return recordsRead400
	 */
	public int getRecordsRead400() throws CFException {        
   		return work.getRecordsRead400();
	}
	
	/**
	 * 	Update RecordsRead400 with the passed value
	 *	@param number
	 */
	public void setRecordsRead400(int number)  throws CFException{
		work.setRecordsRead400(number);
	}


	public void setRecordsRead400(long number)  throws CFException{
		work.setRecordsRead400((int)number);
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
	 *	Returns the value of recordsReadMessage640
	 *	@return recordsReadMessage640
	 */   
	 public RecordsReadMessage640 getRecordsReadMessage640() {
   	return recordsReadMessage640;
   }



        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += recordsReadMessage640.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountInCtx clone() {
        DisplayCountInCtx cloneObj = new DisplayCountInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recordsReadMessage640 = new RecordsReadMessage640();
        cloneObj.recordsReadMessage640.set(recordsReadMessage640.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountInCtx getDisplayCountInCtx() {
            return new DisplayCountInCtx();
    }
     public class DisplayCountOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip650010Ctx.this.getIp60001EventLogWorkArea();
     Ip50005OneDayRec ip50005OneDayRec = Ip650010Ctx.this.getIp50005OneDayRec();
     RecordsReadMessage640 recordsReadMessage640 = Ip650010Ctx.this.getRecordsReadMessage640();
     Work work = Ip650010Ctx.this.getWork();

	/**
	 *	Returns the value of tableId640
	 *	@return tableId640
	 */
   public char[] getTableId640() throws CFException  {              
   		return recordsReadMessage640.getTableId640();
   }

  
	/**
	*  set variable tableId640
	*  @param value
	**/
   public void setTableId640(char[] value) throws CFException {
      recordsReadMessage640.setTableId640(value);
   } 

     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex) throws CFException {
      recordsReadMessage640.setTableId640(source, sourceIndex);
   	
   }
   
   public void setTableId640(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      recordsReadMessage640.setTableId640(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setTableId640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId640 with another Field
	 *	@param value
	 */
   public void setTableId640(Field source) {
      recordsReadMessage640.setTableId640(source);
   }  
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen) {
      recordsReadMessage640.setTableId640(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setTableId640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of effDate640
	 *	@return effDate640
	 */
   public char[] getEffDate640() throws CFException  {              
   		return recordsReadMessage640.getEffDate640();
   }

  
	/**
	*  set variable effDate640
	*  @param value
	**/
   public void setEffDate640(char[] value) throws CFException {
      recordsReadMessage640.setEffDate640(value);
   } 

     /**
	 * 	Update EffDate640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffDate640(char[] source, int sourceIndex) throws CFException {
      recordsReadMessage640.setEffDate640(source, sourceIndex);
   	
   }
   
   public void setEffDate640(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      recordsReadMessage640.setEffDate640(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EffDate640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffDate640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setEffDate640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EffDate640 with another Field
	 *	@param value
	 */
   public void setEffDate640(Field source) {
      recordsReadMessage640.setEffDate640(source);
   }  
   
     /**
	 * 	Update EffDate640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffDate640(Field source, int sourceIndex,int sourceLen) {
      recordsReadMessage640.setEffDate640(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EffDate640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffDate640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setEffDate640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recordsRead400
	 *	@return recordsRead400
	 */
	public int getRecordsRead400() throws CFException {        
   		return work.getRecordsRead400();
	}
	
	/**
	 * 	Update RecordsRead400 with the passed value
	 *	@param number
	 */
	public void setRecordsRead400(int number)  throws CFException{
		work.setRecordsRead400(number);
	}


	public void setRecordsRead400(long number)  throws CFException{
		work.setRecordsRead400((int)number);
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
	 *	Returns the value of recReadCnt640
	 *	@return recReadCnt640
	 */
   public char[] getRecReadCnt640() throws CFException  {              
   		return recordsReadMessage640.getRecReadCnt640();
   }

  
	/**
	*  set variable recReadCnt640
	*  @param value
	**/
   public void setRecReadCnt640(char[] value) throws CFException {
      recordsReadMessage640.setRecReadCnt640(value);
   } 

     /**
	 * 	Update RecReadCnt640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecReadCnt640(char[] source, int sourceIndex) throws CFException {
      recordsReadMessage640.setRecReadCnt640(source, sourceIndex);
   	
   }
   
   public void setRecReadCnt640(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      recordsReadMessage640.setRecReadCnt640(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecReadCnt640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecReadCnt640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setRecReadCnt640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecReadCnt640 with another Field
	 *	@param value
	 */
   public void setRecReadCnt640(Field source) {
      recordsReadMessage640.setRecReadCnt640(source);
   }  
   
     /**
	 * 	Update RecReadCnt640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecReadCnt640(Field source, int sourceIndex,int sourceLen) {
      recordsReadMessage640.setRecReadCnt640(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecReadCnt640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecReadCnt640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      recordsReadMessage640.setRecReadCnt640(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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
        str += ip50005OneDayRec.hashCode();
        str += recordsReadMessage640.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayCountOutCtx clone() {
        DisplayCountOutCtx cloneObj = new DisplayCountOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.recordsReadMessage640 = new RecordsReadMessage640();
        cloneObj.recordsReadMessage640.set(recordsReadMessage640.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayCountOutCtx getDisplayCountOutCtx() {
            return new DisplayCountOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip650010Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip650010Ctx.this.getAbendMessage900();

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



        public Ip650010Ctx getIp650010Ctx() {
            return Ip650010Ctx.this;
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
