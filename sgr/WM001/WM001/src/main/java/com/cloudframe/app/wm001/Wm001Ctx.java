package com.cloudframe.app.wm001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.wm001.dto.Work;
import com.cloudframe.app.wm001.dto.Hdr;


@Context
public class Wm001Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Hdr hdr;


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
    public Hdr getHdr() {
        if (hdr == null) {
            hdr = new Hdr();
        }

        return hdr;
    }

    public void setHdr(Hdr hdr) {
        this.hdr = hdr;
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
        str += hdr.hashCode();
       return str.hashCode();
    }

    public Wm001Ctx clone() {
        Wm001Ctx cloneObj = new Wm001Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdr = new Hdr();
        cloneObj.hdr.set(hdr.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class StartPgmInCtx implements Cloneable {
     Work work = Wm001Ctx.this.getWork();
     Hdr hdr = Wm001Ctx.this.getHdr();

	/**
	 *	Returns the value of hdr
	 *	@return hdr
	 */   
	 public Hdr getHdr() {
   	return hdr;
   }


	/**
	 *	Returns the value of hdrCnt
	 *	@return hdrCnt
	 */
	public int getHdrCnt() throws CFException {
   		return hdr.getHdrCnt();
	}


	/**
	 *	Returns String value of hdrCnt
	 *	@return hdrCnt
	 */
	public char[]  getHdrCntString() throws CFException {
	     return String.valueOf(hdr.getHdrCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hdrCntIsNumeric()  throws CFException{
	    return hdr.hdrCntIsNumeric();
	}

	/**
	 * 	Update HdrCnt with the passed value
	 *	@param number
	 */
	public void setHdrCnt(int number)  throws CFException{
		hdr.setHdrCnt(number);
	}
	

	public void setHdrCnt(long number)  throws CFException{
	    hdr.setHdrCnt(number);
	}
	
	
	/**
	 * 	Update HdrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setHdrCnt(char[] value)  throws CFException {
		hdr.setHdrCnt(value);
	}
	
	/**
	 * 	Update HdrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHdrCntString(char[] value)  throws CFException{
		hdr.setHdrCnt(value);
	}	

	/**
	 *	Returns the value of callProg
	 *	@return callProg
	 */
   public char[] getCallProg() throws CFException  {              
   		return work.getCallProg();
   }

  
	/**
	*  set variable callProg
	*  @param value
	**/
   public void setCallProg(char[] value) throws CFException {
      work.setCallProg(value);
   } 


        public Wm001Ctx getWm001Ctx() {
            return Wm001Ctx.this;
        }

        public StartPgmOutCtx getStartPgmOutCtx() {
            return new StartPgmOutCtx();
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
        str += hdr.hashCode();
       return str.hashCode();
    }

    public StartPgmInCtx clone() {
        StartPgmInCtx cloneObj = new StartPgmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdr = new Hdr();
        cloneObj.hdr.set(hdr.getClonedField());
        return cloneObj;
    }

    }

    public StartPgmInCtx getStartPgmInCtx() {
            return new StartPgmInCtx();
    }
     public class StartPgmOutCtx implements Cloneable {
     Work work = Wm001Ctx.this.getWork();
     Hdr hdr = Wm001Ctx.this.getHdr();

	/**
	 *	Returns the value of hdrL2
	 *	@return hdrL2
	 */
   public char[] getHdrL2() throws CFException  {              
   		return hdr.getHdrL2();
   }

  
	/**
	*  set variable hdrL2
	*  @param value
	**/
   public void setHdrL2(char[] value) throws CFException {
      hdr.setHdrL2(value);
   } 

     /**
	 * 	Update HdrL2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHdrL2(char[] source, int sourceIndex) throws CFException {
      hdr.setHdrL2(source, sourceIndex);
   	
   }
   
   public void setHdrL2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdr.setHdrL2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HdrL2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdrL2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdr.setHdrL2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HdrL2 with another Field
	 *	@param value
	 */
   public void setHdrL2(Field source) {
      hdr.setHdrL2(source);
   }  
   
     /**
	 * 	Update HdrL2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHdrL2(Field source, int sourceIndex,int sourceLen) {
      hdr.setHdrL2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HdrL2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdrL2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdr.setHdrL2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hdrCnt
	 *	@return hdrCnt
	 */
	public int getHdrCnt() throws CFException {
   		return hdr.getHdrCnt();
	}


	/**
	 *	Returns String value of hdrCnt
	 *	@return hdrCnt
	 */
	public char[]  getHdrCntString() throws CFException {
	     return String.valueOf(hdr.getHdrCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hdrCntIsNumeric()  throws CFException{
	    return hdr.hdrCntIsNumeric();
	}

	/**
	 * 	Update HdrCnt with the passed value
	 *	@param number
	 */
	public void setHdrCnt(int number)  throws CFException{
		hdr.setHdrCnt(number);
	}
	

	public void setHdrCnt(long number)  throws CFException{
	    hdr.setHdrCnt(number);
	}
	
	
	/**
	 * 	Update HdrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setHdrCnt(char[] value)  throws CFException {
		hdr.setHdrCnt(value);
	}
	
	/**
	 * 	Update HdrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHdrCntString(char[] value)  throws CFException{
		hdr.setHdrCnt(value);
	}	

	/**
	 *	Returns the value of hdrL3
	 *	@return hdrL3
	 */
   public char[] getHdrL3() throws CFException  {              
   		return hdr.getHdrL3();
   }

  
	/**
	*  set variable hdrL3
	*  @param value
	**/
   public void setHdrL3(char[] value) throws CFException {
      hdr.setHdrL3(value);
   } 

     /**
	 * 	Update HdrL3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHdrL3(char[] source, int sourceIndex) throws CFException {
      hdr.setHdrL3(source, sourceIndex);
   	
   }
   
   public void setHdrL3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdr.setHdrL3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HdrL3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdrL3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdr.setHdrL3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HdrL3 with another Field
	 *	@param value
	 */
   public void setHdrL3(Field source) {
      hdr.setHdrL3(source);
   }  
   
     /**
	 * 	Update HdrL3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHdrL3(Field source, int sourceIndex,int sourceLen) {
      hdr.setHdrL3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HdrL3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdrL3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdr.setHdrL3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Wm001Ctx getWm001Ctx() {
            return Wm001Ctx.this;
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
        str += hdr.hashCode();
       return str.hashCode();
    }

    public StartPgmOutCtx clone() {
        StartPgmOutCtx cloneObj = new StartPgmOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdr = new Hdr();
        cloneObj.hdr.set(hdr.getClonedField());
        return cloneObj;
    }

    }

    public StartPgmOutCtx getStartPgmOutCtx() {
            return new StartPgmOutCtx();
    }
}
