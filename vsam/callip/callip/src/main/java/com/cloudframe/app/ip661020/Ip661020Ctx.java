package com.cloudframe.app.ip661020;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.ip661020.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.ip661020.dto.ErrorMessage600;
import com.cloudframe.app.ip661020.file.records.IpmMessage;


@Context
public class Ip661020Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    IpmMessage ipmMessage;
    Work work;
    Ip66102IpmFileInformation ip66102IpmFileInformation;
    Ip66102IpmMsg ip66102IpmMsg;
    ErrorMessage600 errorMessage600;


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


    public IpmMessage getIpmMessage() {
        if (ipmMessage == null) {
            ipmMessage = new IpmMessage();
        }

        return ipmMessage;
    }

    public void setIpmMessage(IpmMessage ipmMessage) {
        this.ipmMessage = ipmMessage;
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
    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }

    public Ip66102IpmMsg getIp66102IpmMsg() {
        if (ip66102IpmMsg == null) {
            ip66102IpmMsg = globalCtx.getGlobalDto(Ip66102IpmMsg.class);
        }

        return ip66102IpmMsg;
    }

    public ErrorMessage600 getErrorMessage600() {
        if (errorMessage600 == null) {
            errorMessage600 = new ErrorMessage600();
        }

        return errorMessage600;
    }

    public void setErrorMessage600(ErrorMessage600 errorMessage600) {
        this.errorMessage600 = errorMessage600;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ipmMessage.hashCode();
        str += work.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public Ip661020Ctx clone() {
        Ip661020Ctx cloneObj = new Ip661020Ctx();
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();

	/**
	 *	Test condition "N" for isInputFileIsClosed100()
	 *	@return  Returns true if isInputFileIsClosed100() is "N"
	 */
   public boolean isInputFileIsClosed100() throws CFException {
      return work.isInputFileIsClosed100();
   }

	/**
	*  set values "N"
	*/
   	public void setInputFileIsClosed100True()  throws CFException{  			
    	work.setInputFileIsClosed100True();
   	}

        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();


        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OpenIpmFileInCtx implements Cloneable {
     IpmMessage ipmMessage = Ip661020Ctx.this.getIpmMessage();
     Work work = Ip661020Ctx.this.getWork();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Returns the value of ipmMessage
	 *	@return ipmMessage
	 */   
	 public IpmMessage getIpmMessage() {
   	return ipmMessage;
   }



        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
        }

        public OpenIpmFileOutCtx getOpenIpmFileOutCtx() {
            return new OpenIpmFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ipmMessage.hashCode();
        str += work.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public OpenIpmFileInCtx clone() {
        OpenIpmFileInCtx cloneObj = new OpenIpmFileInCtx();
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public OpenIpmFileInCtx getOpenIpmFileInCtx() {
            return new OpenIpmFileInCtx();
    }
     public class OpenIpmFileOutCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();
     IpmMessage ipmMessage = Ip661020Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Test condition "00" for isIp66102IpmIoWasGood()
	 *	@return  Returns true if isIp66102IpmIoWasGood() is "00"
	 */
   public boolean isIp66102IpmIoWasGood() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmIoWasGood();
   }

	/**
	*  set values "00"
	*/
   	public void setIp66102IpmIoWasGoodTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmIoWasGoodTrue();
   	}
	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgsRead();
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead(number);
	}


	public void setIp66102IpmMsgsRead(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead((int)number);
	}


	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorParagraph600
	 *	@return errorParagraph600
	 */
   public char[] getErrorParagraph600() throws CFException  {              
   		return errorMessage600.getErrorParagraph600();
   }

  
	/**
	*  set variable errorParagraph600
	*  @param value
	**/
   public void setErrorParagraph600(char[] value) throws CFException {
      errorMessage600.setErrorParagraph600(value);
   } 

     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setErrorParagraph600(source, sourceIndex);
   	
   }
   
   public void setErrorParagraph600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorParagraph600 with another Field
	 *	@param value
	 */
   public void setErrorParagraph600(Field source) {
      errorMessage600.setErrorParagraph600(source);
   }  
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "41" for isIp66102IpmFileAlreadyOpen()
	 *	@return  Returns true if isIp66102IpmFileAlreadyOpen() is "41"
	 */
   public boolean isIp66102IpmFileAlreadyOpen() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmFileAlreadyOpen();
   }

	/**
	*  set values "41"
	*/
   	public void setIp66102IpmFileAlreadyOpenTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmFileAlreadyOpenTrue();
   	}
	/**
	 *	Test condition "Y" for isInputFileIsOpen100()
	 *	@return  Returns true if isInputFileIsOpen100() is "Y"
	 */
   public boolean isInputFileIsOpen100() throws CFException {
      return work.isInputFileIsOpen100();
   }

	/**
	*  set values "Y"
	*/
   	public void setInputFileIsOpen100True()  throws CFException{  			
    	work.setInputFileIsOpen100True();
   	}
	/**
	 *	Returns the value of failingAction600
	 *	@return failingAction600
	 */
   public char[] getFailingAction600() throws CFException  {              
   		return errorMessage600.getFailingAction600();
   }

  
	/**
	*  set variable failingAction600
	*  @param value
	**/
   public void setFailingAction600(char[] value) throws CFException {
      errorMessage600.setFailingAction600(value);
   } 

     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setFailingAction600(source, sourceIndex);
   	
   }
   
   public void setFailingAction600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FailingAction600 with another Field
	 *	@param value
	 */
   public void setFailingAction600(Field source) {
      errorMessage600.setFailingAction600(source);
   }  
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
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
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public OpenIpmFileOutCtx clone() {
        OpenIpmFileOutCtx cloneObj = new OpenIpmFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public OpenIpmFileOutCtx getOpenIpmFileOutCtx() {
            return new OpenIpmFileOutCtx();
    }
     public class ReadAMessageInCtx implements Cloneable {
     IpmMessage ipmMessage = Ip661020Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     Ip66102IpmMsg ip66102IpmMsg = Ip661020Ctx.this.getIp66102IpmMsg();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Returns the value of ipmMessage
	 *	@return ipmMessage
	 */   
	 public IpmMessage getIpmMessage() {
   	return ipmMessage;
   }


	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgsRead();
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead(number);
	}


	public void setIp66102IpmMsgsRead(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead((int)number);
	}


	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
        }

        public ReadAMessageOutCtx getReadAMessageOutCtx() {
            return new ReadAMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public ReadAMessageInCtx clone() {
        ReadAMessageInCtx cloneObj = new ReadAMessageInCtx();
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ReadAMessageInCtx getReadAMessageInCtx() {
            return new ReadAMessageInCtx();
    }
     public class ReadAMessageOutCtx implements Cloneable {
     IpmMessage ipmMessage = Ip661020Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     Ip66102IpmMsg ip66102IpmMsg = Ip661020Ctx.this.getIp66102IpmMsg();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Test condition "10" for isIp66102WeHitEndOfFile()
	 *	@return  Returns true if isIp66102WeHitEndOfFile() is "10"
	 */
   public boolean isIp66102WeHitEndOfFile() throws CFException {
      return ip66102IpmFileInformation.isIp66102WeHitEndOfFile();
   }

	/**
	*  set values "10"
	*/
   	public void setIp66102WeHitEndOfFileTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102WeHitEndOfFileTrue();
   	}
	/**
	 *	Returns the value of ipmMessage
	 *	@return ipmMessage
	 */   
	 public IpmMessage getIpmMessage() {
   	return ipmMessage;
   }


	/**
	 *	Test condition "Y" for isIp66102IpmFileIsFinished()
	 *	@return  Returns true if isIp66102IpmFileIsFinished() is "Y"
	 */
   public boolean isIp66102IpmFileIsFinished() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmFileIsFinished();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp66102IpmFileIsFinishedTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmFileIsFinishedTrue();
   	}
	/**
	 *	Test condition "00" for isIp66102IpmIoWasGood()
	 *	@return  Returns true if isIp66102IpmIoWasGood() is "00"
	 */
   public boolean isIp66102IpmIoWasGood() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmIoWasGood();
   }

	/**
	*  set values "00"
	*/
   	public void setIp66102IpmIoWasGoodTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmIoWasGoodTrue();
   	}
	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgsRead();
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead(number);
	}


	public void setIp66102IpmMsgsRead(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead((int)number);
	}


	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isIp66102WeGotAMsg()
	 *	@return  Returns true if isIp66102WeGotAMsg() is "N"
	 */
   public boolean isIp66102WeGotAMsg() throws CFException {
      return ip66102IpmFileInformation.isIp66102WeGotAMsg();
   }

	/**
	*  set values "N"
	*/
   	public void setIp66102WeGotAMsgTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102WeGotAMsgTrue();
   	}
	/**
	 *	Returns the value of errorParagraph600
	 *	@return errorParagraph600
	 */
   public char[] getErrorParagraph600() throws CFException  {              
   		return errorMessage600.getErrorParagraph600();
   }

  
	/**
	*  set variable errorParagraph600
	*  @param value
	**/
   public void setErrorParagraph600(char[] value) throws CFException {
      errorMessage600.setErrorParagraph600(value);
   } 

     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setErrorParagraph600(source, sourceIndex);
   	
   }
   
   public void setErrorParagraph600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorParagraph600 with another Field
	 *	@param value
	 */
   public void setErrorParagraph600(Field source) {
      errorMessage600.setErrorParagraph600(source);
   }  
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of failingAction600
	 *	@return failingAction600
	 */
   public char[] getFailingAction600() throws CFException  {              
   		return errorMessage600.getFailingAction600();
   }

  
	/**
	*  set variable failingAction600
	*  @param value
	**/
   public void setFailingAction600(char[] value) throws CFException {
      errorMessage600.setFailingAction600(value);
   } 

     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setFailingAction600(source, sourceIndex);
   	
   }
   
   public void setFailingAction600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FailingAction600 with another Field
	 *	@param value
	 */
   public void setFailingAction600(Field source) {
      errorMessage600.setFailingAction600(source);
   }  
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public ReadAMessageOutCtx clone() {
        ReadAMessageOutCtx cloneObj = new ReadAMessageOutCtx();
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ReadAMessageOutCtx getReadAMessageOutCtx() {
            return new ReadAMessageOutCtx();
    }
     public class CloseIpmFileInCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Test condition "42" "47" for isIp66102IpmFileIsClosed()
	 *	@return  Returns true if isIp66102IpmFileIsClosed() is "42" "47"
	 */
   public boolean isIp66102IpmFileIsClosed() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmFileIsClosed();
   }

	/**
	*  set values "42" "47"
	*/
   	public void setIp66102IpmFileIsClosedTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmFileIsClosedTrue();
   	}
	/**
	 *	Test condition "00" for isIp66102IpmIoWasGood()
	 *	@return  Returns true if isIp66102IpmIoWasGood() is "00"
	 */
   public boolean isIp66102IpmIoWasGood() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmIoWasGood();
   }

	/**
	*  set values "00"
	*/
   	public void setIp66102IpmIoWasGoodTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmIoWasGoodTrue();
   	}
	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
        }

        public CloseIpmFileOutCtx getCloseIpmFileOutCtx() {
            return new CloseIpmFileOutCtx();
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
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public CloseIpmFileInCtx clone() {
        CloseIpmFileInCtx cloneObj = new CloseIpmFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public CloseIpmFileInCtx getCloseIpmFileInCtx() {
            return new CloseIpmFileInCtx();
    }
     public class CloseIpmFileOutCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorParagraph600
	 *	@return errorParagraph600
	 */
   public char[] getErrorParagraph600() throws CFException  {              
   		return errorMessage600.getErrorParagraph600();
   }

  
	/**
	*  set variable errorParagraph600
	*  @param value
	**/
   public void setErrorParagraph600(char[] value) throws CFException {
      errorMessage600.setErrorParagraph600(value);
   } 

     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setErrorParagraph600(source, sourceIndex);
   	
   }
   
   public void setErrorParagraph600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorParagraph600 with another Field
	 *	@param value
	 */
   public void setErrorParagraph600(Field source) {
      errorMessage600.setErrorParagraph600(source);
   }  
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setErrorParagraph600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of failingAction600
	 *	@return failingAction600
	 */
   public char[] getFailingAction600() throws CFException  {              
   		return errorMessage600.getFailingAction600();
   }

  
	/**
	*  set variable failingAction600
	*  @param value
	**/
   public void setFailingAction600(char[] value) throws CFException {
      errorMessage600.setFailingAction600(value);
   } 

     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setFailingAction600(source, sourceIndex);
   	
   }
   
   public void setFailingAction600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FailingAction600 with another Field
	 *	@param value
	 */
   public void setFailingAction600(Field source) {
      errorMessage600.setFailingAction600(source);
   }  
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setFailingAction600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isInputFileIsClosed100()
	 *	@return  Returns true if isInputFileIsClosed100() is "N"
	 */
   public boolean isInputFileIsClosed100() throws CFException {
      return work.isInputFileIsClosed100();
   }

	/**
	*  set values "N"
	*/
   	public void setInputFileIsClosed100True()  throws CFException{  			
    	work.setInputFileIsClosed100True();
   	}

        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
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
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public CloseIpmFileOutCtx clone() {
        CloseIpmFileOutCtx cloneObj = new CloseIpmFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public CloseIpmFileOutCtx getCloseIpmFileOutCtx() {
            return new CloseIpmFileOutCtx();
    }
     public class TerminateWithErrorInCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of terminatingMessage600
	 *	@return terminatingMessage600
	 */
   public char[] getTerminatingMessage600() throws CFException  {              
   		return work.getTerminatingMessage600();
   }

  
	/**
	*  set variable terminatingMessage600
	*  @param value
	**/
   public void setTerminatingMessage600(char[] value) throws CFException {
      work.setTerminatingMessage600(value);
   } 

	/**
	 *	Returns the value of errorMessage600
	 *	@return errorMessage600
	 */   
	 public ErrorMessage600 getErrorMessage600() {
   	return errorMessage600;
   }



        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
        }

        public TerminateWithErrorOutCtx getTerminateWithErrorOutCtx() {
            return new TerminateWithErrorOutCtx();
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
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public TerminateWithErrorInCtx clone() {
        TerminateWithErrorInCtx cloneObj = new TerminateWithErrorInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public TerminateWithErrorInCtx getTerminateWithErrorInCtx() {
            return new TerminateWithErrorInCtx();
    }
     public class TerminateWithErrorOutCtx implements Cloneable {
     Work work = Ip661020Ctx.this.getWork();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip661020Ctx.this.getIp66102IpmFileInformation();
     ErrorMessage600 errorMessage600 = Ip661020Ctx.this.getErrorMessage600();

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
	public short getAbendCode900() throws CFException {        
   		return work.getAbendCode900();
	}
	
	/**
	 * 	Update AbendCode900 with the passed value
	 *	@param number
	 */
	public void setAbendCode900(short number)  throws CFException{
		work.setAbendCode900(number);
	}

	public void setAbendCode900(int number)  throws CFException{
		work.setAbendCode900((short)number);
	}

	public void setAbendCode900(long number)  throws CFException{
		work.setAbendCode900((short)number);
	}



	/**
	 *	Returns the value of badStatusCode600
	 *	@return badStatusCode600
	 */
   public char[] getBadStatusCode600() throws CFException  {              
   		return errorMessage600.getBadStatusCode600();
   }

  
	/**
	*  set variable badStatusCode600
	*  @param value
	**/
   public void setBadStatusCode600(char[] value) throws CFException {
      errorMessage600.setBadStatusCode600(value);
   } 

     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex) throws CFException {
      errorMessage600.setBadStatusCode600(source, sourceIndex);
   	
   }
   
   public void setBadStatusCode600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMessage600.setBadStatusCode600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setBadStatusCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BadStatusCode600 with another Field
	 *	@param value
	 */
   public void setBadStatusCode600(Field source) {
      errorMessage600.setBadStatusCode600(source);
   }  
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen) {
      errorMessage600.setBadStatusCode600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMessage600.setBadStatusCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException  {              
   		return ip66102IpmFileInformation.getIp66102IpmFileStatus();
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(value);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) throws CFException {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source);
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmFileInformation.setIp66102IpmFileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip661020Ctx getIp661020Ctx() {
            return Ip661020Ctx.this;
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
        str += ip66102IpmFileInformation.hashCode();
        str += errorMessage600.hashCode();
       return str.hashCode();
    }

    public TerminateWithErrorOutCtx clone() {
        TerminateWithErrorOutCtx cloneObj = new TerminateWithErrorOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.errorMessage600 = new ErrorMessage600();
        cloneObj.errorMessage600.set(errorMessage600.getClonedField());
        return cloneObj;
    }

    }

    public TerminateWithErrorOutCtx getTerminateWithErrorOutCtx() {
            return new TerminateWithErrorOutCtx();
    }
}
