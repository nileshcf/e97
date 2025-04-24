package com.cloudframe.app.mcsearch;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcsearch.dto.Work;
import com.cloudframe.app.global.sharedvar.McIpmMsg;
import com.cloudframe.app.global.sharedvar.Ip30331FinAddndmEntries;


@Context
public class McsearchCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Ip30331FinAddndmEntries ip30331FinAddndmEntries;
    McIpmMsg mcIpmMsg;


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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Ip30331FinAddndmEntries getIp30331FinAddndmEntries() {
        if (ip30331FinAddndmEntries == null) {
            ip30331FinAddndmEntries = globalCtx.getGlobalDto(Ip30331FinAddndmEntries.class);
        }

        return ip30331FinAddndmEntries;
    }

    public McIpmMsg getMcIpmMsg() {
        if (mcIpmMsg == null) {
            mcIpmMsg = globalCtx.getGlobalDto(McIpmMsg.class);
        }

        return mcIpmMsg;
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
        str += ip30331FinAddndmEntries.hashCode();
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public McsearchCtx clone() {
        McsearchCtx cloneObj = new McsearchCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip30331FinAddndmEntries = new Ip30331FinAddndmEntries();
        cloneObj.ip30331FinAddndmEntries.set(ip30331FinAddndmEntries.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineSplit0InCtx implements Cloneable {
     Work work = McsearchCtx.this.getWork();
     Ip30331FinAddndmEntries ip30331FinAddndmEntries = McsearchCtx.this.getIp30331FinAddndmEntries();
     McIpmMsg mcIpmMsg = McsearchCtx.this.getMcIpmMsg();

	/**
	 *	Returns the value of ip22462001
	 *	@return ip22462001
	 */
   public char[] getIp22462001() throws CFException  {              
   		return work.getIp22462001();
   }

  
	/**
	*  set variable ip22462001
	*  @param value
	**/
   public void setIp22462001(char[] value) throws CFException {
      work.setIp22462001(value);
   } 

	/**
	 *	Returns the value of ip22462101
	 *	@return ip22462101
	 */
   public char[] getIp22462101() throws CFException  {              
   		return work.getIp22462101();
   }

  
	/**
	*  set variable ip22462101
	*  @param value
	**/
   public void setIp22462101(char[] value) throws CFException {
      work.setIp22462101(value);
   } 


        public McsearchCtx getMcsearchCtx() {
            return McsearchCtx.this;
        }

        public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
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
        str += ip30331FinAddndmEntries.hashCode();
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0InCtx clone() {
        MainlineSplit0InCtx cloneObj = new MainlineSplit0InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip30331FinAddndmEntries = new Ip30331FinAddndmEntries();
        cloneObj.ip30331FinAddndmEntries.set(ip30331FinAddndmEntries.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0InCtx getMainlineSplit0InCtx() {
            return new MainlineSplit0InCtx();
    }
     public class MainlineSplit0OutCtx implements Cloneable {
     Work work = McsearchCtx.this.getWork();
     Ip30331FinAddndmEntries ip30331FinAddndmEntries = McsearchCtx.this.getIp30331FinAddndmEntries();
     McIpmMsg mcIpmMsg = McsearchCtx.this.getMcIpmMsg();

	/**
	 *	Returns the value of ip30331Subscript
	 *	@return ip30331Subscript
	 */
	public int getIp30331Subscript() throws CFException {        
   		return ip30331FinAddndmEntries.getIp30331Subscript();
	}
	
	/**
	 * 	Update Ip30331Subscript with the passed value
	 *	@param number
	 */
	public void setIp30331Subscript(int number)  throws CFException{
		ip30331FinAddndmEntries.setIp30331Subscript(number);
	}


	public void setIp30331Subscript(long number)  throws CFException{
		ip30331FinAddndmEntries.setIp30331Subscript((int)number);
	}


	/**
	 *	Returns the value of mcIpmMsgTxt
	 *	@return mcIpmMsgTxt
	 */
   public char[] getMcIpmMsgTxt() throws CFException  {              
   		return mcIpmMsg.getMcIpmMsgTxt();
   }

  
	/**
	*  set variable mcIpmMsgTxt
	*  @param value
	**/
   public void setMcIpmMsgTxt(char[] value) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(value);
   } 

     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex);
   	
   }
   
   public void setMcIpmMsgTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update McIpmMsgTxt with another Field
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source) {
      mcIpmMsg.setMcIpmMsgTxt(source);
   }  
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McsearchCtx getMcsearchCtx() {
            return McsearchCtx.this;
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
        str += ip30331FinAddndmEntries.hashCode();
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0OutCtx clone() {
        MainlineSplit0OutCtx cloneObj = new MainlineSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip30331FinAddndmEntries = new Ip30331FinAddndmEntries();
        cloneObj.ip30331FinAddndmEntries.set(ip30331FinAddndmEntries.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
    }
     public class MainlineSplit1InCtx implements Cloneable {
     Work work = McsearchCtx.this.getWork();
     McIpmMsg mcIpmMsg = McsearchCtx.this.getMcIpmMsg();

	/**
	 *	Returns the value of ip22462101
	 *	@return ip22462101
	 */
   public char[] getIp22462101() throws CFException  {              
   		return work.getIp22462101();
   }

  
	/**
	*  set variable ip22462101
	*  @param value
	**/
   public void setIp22462101(char[] value) throws CFException {
      work.setIp22462101(value);
   } 

	/**
	 *	Returns the value of mcIpmMsgTxt
	 *	@return mcIpmMsgTxt
	 */
   public char[] getMcIpmMsgTxt() throws CFException  {              
   		return mcIpmMsg.getMcIpmMsgTxt();
   }

  
	/**
	*  set variable mcIpmMsgTxt
	*  @param value
	**/
   public void setMcIpmMsgTxt(char[] value) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(value);
   } 

     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex);
   	
   }
   
   public void setMcIpmMsgTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update McIpmMsgTxt with another Field
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source) {
      mcIpmMsg.setMcIpmMsgTxt(source);
   }  
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McsearchCtx getMcsearchCtx() {
            return McsearchCtx.this;
        }

        public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
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
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1InCtx clone() {
        MainlineSplit1InCtx cloneObj = new MainlineSplit1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1InCtx getMainlineSplit1InCtx() {
            return new MainlineSplit1InCtx();
    }
     public class MainlineSplit1OutCtx implements Cloneable {
     Work work = McsearchCtx.this.getWork();
     McIpmMsg mcIpmMsg = McsearchCtx.this.getMcIpmMsg();


        public McsearchCtx getMcsearchCtx() {
            return McsearchCtx.this;
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
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1OutCtx clone() {
        MainlineSplit1OutCtx cloneObj = new MainlineSplit1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
    }
}
