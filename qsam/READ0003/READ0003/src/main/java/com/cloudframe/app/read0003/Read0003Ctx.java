package com.cloudframe.app.read0003;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip66102BitMap;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.read0003.dto.Work;
import com.cloudframe.app.global.shared.file.records.IpmMessage;


@Context
public class Read0003Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip66102IpmMsg ip66102IpmMsg;
    Work work;
    IpmMessage ipmMessage;
    Ip66102IpmFileInformation ip66102IpmFileInformation;


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


    public Ip66102IpmMsg getIp66102IpmMsg() {
        if (ip66102IpmMsg == null) {
            ip66102IpmMsg = globalCtx.getGlobalDto(Ip66102IpmMsg.class);
        }

        return ip66102IpmMsg;
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
    public IpmMessage getIpmMessage() {
        if (ipmMessage == null) {
            ipmMessage = new IpmMessage();
        }

        return ipmMessage;
    }

    public void setIpmMessage(IpmMessage ipmMessage) {
        this.ipmMessage = ipmMessage;
    }
    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public Read0003Ctx clone() {
        Read0003Ctx cloneObj = new Read0003Ctx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Read0003Ctx.this.getWork();

	/**
	 *	Returns the value of read000401
	 *	@return read000401
	 */
   public char[] getRead000401() throws CFException  {              
   		return work.getRead000401();
   }

  
	/**
	*  set variable read000401
	*  @param value
	**/
   public void setRead000401(char[] value) throws CFException {
      work.setRead000401(value);
   } 


        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
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
     Work work = Read0003Ctx.this.getWork();


        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
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
     public class OpenReadClose1stTimeInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }

        public OpenReadClose1stTimeOutCtx getOpenReadClose1stTimeOutCtx() {
            return new OpenReadClose1stTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose1stTimeInCtx clone() {
        OpenReadClose1stTimeInCtx cloneObj = new OpenReadClose1stTimeInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose1stTimeInCtx getOpenReadClose1stTimeInCtx() {
            return new OpenReadClose1stTimeInCtx();
    }
     public class OpenReadClose1stTimeOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

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
	 *	Returns the value of ip66102IpmFileInformation
	 *	@return ip66102IpmFileInformation
	 */   
	 public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
   	return ip66102IpmFileInformation;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose1stTimeOutCtx clone() {
        OpenReadClose1stTimeOutCtx cloneObj = new OpenReadClose1stTimeOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose1stTimeOutCtx getOpenReadClose1stTimeOutCtx() {
            return new OpenReadClose1stTimeOutCtx();
    }
     public class OpenReadClose2ndTimeInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }

        public OpenReadClose2ndTimeOutCtx getOpenReadClose2ndTimeOutCtx() {
            return new OpenReadClose2ndTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose2ndTimeInCtx clone() {
        OpenReadClose2ndTimeInCtx cloneObj = new OpenReadClose2ndTimeInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose2ndTimeInCtx getOpenReadClose2ndTimeInCtx() {
            return new OpenReadClose2ndTimeInCtx();
    }
     public class OpenReadClose2ndTimeOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

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
	 *	Returns the value of ip66102IpmFileInformation
	 *	@return ip66102IpmFileInformation
	 */   
	 public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
   	return ip66102IpmFileInformation;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose2ndTimeOutCtx clone() {
        OpenReadClose2ndTimeOutCtx cloneObj = new OpenReadClose2ndTimeOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose2ndTimeOutCtx getOpenReadClose2ndTimeOutCtx() {
            return new OpenReadClose2ndTimeOutCtx();
    }
     public class OpenReadClose3rdTimeInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }

        public OpenReadClose3rdTimeOutCtx getOpenReadClose3rdTimeOutCtx() {
            return new OpenReadClose3rdTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose3rdTimeInCtx clone() {
        OpenReadClose3rdTimeInCtx cloneObj = new OpenReadClose3rdTimeInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose3rdTimeInCtx getOpenReadClose3rdTimeInCtx() {
            return new OpenReadClose3rdTimeInCtx();
    }
     public class OpenReadClose3rdTimeOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     IpmMessage ipmMessage = Read0003Ctx.this.getIpmMessage();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Read0003Ctx.this.getIp66102IpmFileInformation();

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
	 *	Returns the value of ip66102IpmFileInformation
	 *	@return ip66102IpmFileInformation
	 */   
	 public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
   	return ip66102IpmFileInformation;
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




        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ipmMessage.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public OpenReadClose3rdTimeOutCtx clone() {
        OpenReadClose3rdTimeOutCtx cloneObj = new OpenReadClose3rdTimeOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ipmMessage = new IpmMessage();
        cloneObj.ipmMessage.set(ipmMessage.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose3rdTimeOutCtx getOpenReadClose3rdTimeOutCtx() {
            return new OpenReadClose3rdTimeOutCtx();
    }
     public class ValidateBitMapInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Read0003Ctx.this.getIp66102IpmMsg();
     Work work = Read0003Ctx.this.getWork();

	/**
	 *	Returns the value of bitmap1240
	 *	@return bitmap1240
	 */
   public char[] getBitmap1240() throws CFException  {              
   		return work.getBitmap1240();
   }

  
	/**
	*  set variable bitmap1240
	*  @param value
	**/
   public void setBitmap1240(char[] value) throws CFException {
      work.setBitmap1240(value);
   } 

	/**
	 *	Returns the value of ip66102BitMap
	 *	@return ip66102BitMap
	 */   
	 public Ip66102BitMap getIp66102BitMap() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap();
   }

   /**
	* 	Update Ip66102BitMap with the passed value
	*	@param value
	*/
   public void setIp66102BitMap(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(value);
   }   

     /**
	 * 	Update Ip66102BitMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitMap(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitMap with another Field
	 *	@param value
	 */
   public void setIp66102BitMap(Field source) {
   	ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(source);
   }  
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitMap(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102BitMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102Mti
	 *	@return ip66102Mti
	 */
   public char[] getIp66102Mti() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102Mti();
   }

  
	/**
	*  set variable ip66102Mti
	*  @param value
	**/
   public void setIp66102Mti(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(value);
   } 

     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex);
   	
   }
   
   public void setIp66102Mti(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102Mti with another Field
	 *	@param value
	 */
   public void setIp66102Mti(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source);
   }  
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitmap1644
	 *	@return bitmap1644
	 */
   public char[] getBitmap1644() throws CFException  {              
   		return work.getBitmap1644();
   }

  
	/**
	*  set variable bitmap1644
	*  @param value
	**/
   public void setBitmap1644(char[] value) throws CFException {
      work.setBitmap1644(value);
   } 


        public Read0003Ctx getRead0003Ctx() {
            return Read0003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ValidateBitMapInCtx clone() {
        ValidateBitMapInCtx cloneObj = new ValidateBitMapInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ValidateBitMapInCtx getValidateBitMapInCtx() {
            return new ValidateBitMapInCtx();
    }
}
