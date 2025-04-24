package com.cloudframe.app.cpsc4;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cpsc4.dto.S0v3DtlCatAvGeData;
import com.cloudframe.app.cpsc4.dto.S0v3DtlDriftData;
import com.cloudframe.app.cpsc4.dto.Work;
import com.cloudframe.app.cpsc4.dto.S0v3DtlRsrchData;
import com.cloudframe.app.cpsc4.dto.S0v3DtlMdlData;


@Context
public class Cpsc4Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    S0v3DtlDriftData s0v3DtlDriftData;
    S0v3DtlMdlData s0v3DtlMdlData;
    Work work;
    S0v3DtlCatAvGeData s0v3DtlCatAvGeData;
    S0v3DtlRsrchData s0v3DtlRsrchData;


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


    public S0v3DtlDriftData getS0v3DtlDriftData() {
        if (s0v3DtlDriftData == null) {
            s0v3DtlDriftData = new S0v3DtlDriftData();
        }

        return s0v3DtlDriftData;
    }

    public void setS0v3DtlDriftData(S0v3DtlDriftData s0v3DtlDriftData) {
        this.s0v3DtlDriftData = s0v3DtlDriftData;
    }
    public S0v3DtlMdlData getS0v3DtlMdlData() {
        if (s0v3DtlMdlData == null) {
            s0v3DtlMdlData = new S0v3DtlMdlData();
        }

        return s0v3DtlMdlData;
    }

    public void setS0v3DtlMdlData(S0v3DtlMdlData s0v3DtlMdlData) {
        this.s0v3DtlMdlData = s0v3DtlMdlData;
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
    public S0v3DtlCatAvGeData getS0v3DtlCatAvGeData() {
        if (s0v3DtlCatAvGeData == null) {
            s0v3DtlCatAvGeData = new S0v3DtlCatAvGeData();
        }

        return s0v3DtlCatAvGeData;
    }

    public void setS0v3DtlCatAvGeData(S0v3DtlCatAvGeData s0v3DtlCatAvGeData) {
        this.s0v3DtlCatAvGeData = s0v3DtlCatAvGeData;
    }
    public S0v3DtlRsrchData getS0v3DtlRsrchData() {
        if (s0v3DtlRsrchData == null) {
            s0v3DtlRsrchData = new S0v3DtlRsrchData();
        }

        return s0v3DtlRsrchData;
    }

    public void setS0v3DtlRsrchData(S0v3DtlRsrchData s0v3DtlRsrchData) {
        this.s0v3DtlRsrchData = s0v3DtlRsrchData;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += s0v3DtlDriftData.hashCode();
        str += s0v3DtlMdlData.hashCode();
        str += work.hashCode();
        str += s0v3DtlCatAvGeData.hashCode();
        str += s0v3DtlRsrchData.hashCode();
       return str.hashCode();
    }

    public Cpsc4Ctx clone() {
        Cpsc4Ctx cloneObj = new Cpsc4Ctx();
        cloneObj.s0v3DtlDriftData = new S0v3DtlDriftData();
        cloneObj.s0v3DtlDriftData.set(s0v3DtlDriftData.getClonedField());
        cloneObj.s0v3DtlMdlData = new S0v3DtlMdlData();
        cloneObj.s0v3DtlMdlData.set(s0v3DtlMdlData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.s0v3DtlCatAvGeData = new S0v3DtlCatAvGeData();
        cloneObj.s0v3DtlCatAvGeData.set(s0v3DtlCatAvGeData.getClonedField());
        cloneObj.s0v3DtlRsrchData = new S0v3DtlRsrchData();
        cloneObj.s0v3DtlRsrchData.set(s0v3DtlRsrchData.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     S0v3DtlDriftData s0v3DtlDriftData = Cpsc4Ctx.this.getS0v3DtlDriftData();
     S0v3DtlMdlData s0v3DtlMdlData = Cpsc4Ctx.this.getS0v3DtlMdlData();
     Work work = Cpsc4Ctx.this.getWork();
     S0v3DtlCatAvGeData s0v3DtlCatAvGeData = Cpsc4Ctx.this.getS0v3DtlCatAvGeData();
     S0v3DtlRsrchData s0v3DtlRsrchData = Cpsc4Ctx.this.getS0v3DtlRsrchData();

	/**
	 *	Returns the value of s0v3DtlDriftData
	 *	@return s0v3DtlDriftData
	 */   
	 public S0v3DtlDriftData getS0v3DtlDriftData() {
   	return s0v3DtlDriftData;
   }


	/**
	 *	Returns the value of s0v3DtlMdlData
	 *	@return s0v3DtlMdlData
	 */   
	 public S0v3DtlMdlData getS0v3DtlMdlData() {
   	return s0v3DtlMdlData;
   }


	/**
	 *	Returns the value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public int getDriftDataCnt() throws CFException {
   		return work.getDriftDataCnt();
	}


	/**
	 *	Returns String value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public char[]  getDriftDataCntString() throws CFException {
	     return String.valueOf(work.getDriftDataCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean driftDataCntIsNumeric()  throws CFException{
	    return work.driftDataCntIsNumeric();
	}

	/**
	 * 	Update DriftDataCnt with the passed value
	 *	@param number
	 */
	public void setDriftDataCnt(int number)  throws CFException{
		work.setDriftDataCnt(number);
	}
	

	public void setDriftDataCnt(long number)  throws CFException{
	    work.setDriftDataCnt(number);
	}
	
	
	/**
	 * 	Update DriftDataCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDriftDataCnt(char[] value)  throws CFException {
		work.setDriftDataCnt(value);
	}
	
	/**
	 * 	Update DriftDataCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDriftDataCntString(char[] value)  throws CFException{
		work.setDriftDataCnt(value);
	}	

	/**
	 *	Returns the value of s0v3DtlCatAvGeData
	 *	@return s0v3DtlCatAvGeData
	 */   
	 public S0v3DtlCatAvGeData getS0v3DtlCatAvGeData() {
   	return s0v3DtlCatAvGeData;
   }


	/**
	 *	Returns the value of s0v3DtlRsrchData
	 *	@return s0v3DtlRsrchData
	 */   
	 public S0v3DtlRsrchData getS0v3DtlRsrchData() {
   	return s0v3DtlRsrchData;
   }



        public Cpsc4Ctx getCpsc4Ctx() {
            return Cpsc4Ctx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += s0v3DtlDriftData.hashCode();
        str += s0v3DtlMdlData.hashCode();
        str += work.hashCode();
        str += s0v3DtlCatAvGeData.hashCode();
        str += s0v3DtlRsrchData.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.s0v3DtlDriftData = new S0v3DtlDriftData();
        cloneObj.s0v3DtlDriftData.set(s0v3DtlDriftData.getClonedField());
        cloneObj.s0v3DtlMdlData = new S0v3DtlMdlData();
        cloneObj.s0v3DtlMdlData.set(s0v3DtlMdlData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.s0v3DtlCatAvGeData = new S0v3DtlCatAvGeData();
        cloneObj.s0v3DtlCatAvGeData.set(s0v3DtlCatAvGeData.getClonedField());
        cloneObj.s0v3DtlRsrchData = new S0v3DtlRsrchData();
        cloneObj.s0v3DtlRsrchData.set(s0v3DtlRsrchData.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     S0v3DtlDriftData s0v3DtlDriftData = Cpsc4Ctx.this.getS0v3DtlDriftData();
     S0v3DtlMdlData s0v3DtlMdlData = Cpsc4Ctx.this.getS0v3DtlMdlData();
     Work work = Cpsc4Ctx.this.getWork();
     S0v3DtlCatAvGeData s0v3DtlCatAvGeData = Cpsc4Ctx.this.getS0v3DtlCatAvGeData();
     S0v3DtlRsrchData s0v3DtlRsrchData = Cpsc4Ctx.this.getS0v3DtlRsrchData();

	/**
	 *	Returns the value of advsryMdlNa
	 *	@return advsryMdlNa
	 */
   public char[] getAdvsryMdlNa() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryMdlNa();
   }

  
	/**
	*  set variable advsryMdlNa
	*  @param value
	**/
   public void setAdvsryMdlNa(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlNa(value);
   } 

     /**
	 * 	Update AdvsryMdlNa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlNa(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlNa(source, sourceIndex);
   	
   }
   
   public void setAdvsryMdlNa(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryMdlNa(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlNa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlNa(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryMdlNa with another Field
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source) {
      s0v3DtlMdlData.setAdvsryMdlNa(source);
   }  
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryMdlNa(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlNa(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodInvstAllocPct
	 *	@return prodInvstAllocPct
	 */
   public char[] getProdInvstAllocPct(int index) throws CFException  {              
   		return s0v3DtlRsrchData.getRsrchData(index).getProdInvstAllocPct();
   }

  
	/**
	*  set variable prodInvstAllocPct
	*  @param value
	**/
   public void setProdInvstAllocPct(int index,char[] value) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(value);
   } 

     /**
	 * 	Update ProdInvstAllocPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdInvstAllocPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source, sourceIndex);
   	
   }
   
   public void setProdInvstAllocPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstAllocPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdInvstAllocPct with another Field
	 *	@param value
	 */
   public void setProdInvstAllocPct(int index,Field source) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source);
   }  
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdInvstAllocPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstAllocPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstAllocPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mdlDriftBandTyCd
	 *	@return mdlDriftBandTyCd
	 */
   public char[] getMdlDriftBandTyCd(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getMdlDriftBandTyCd();
   }

  
	/**
	*  set variable mdlDriftBandTyCd
	*  @param value
	**/
   public void setMdlDriftBandTyCd(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(value);
   } 

     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source, sourceIndex);
   	
   }
   
   public void setMdlDriftBandTyCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MdlDriftBandTyCd with another Field
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source);
   }  
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftBandTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of invstPct
	 *	@return invstPct
	 */
   public char[] getInvstPct(int index) throws CFException  {              
   		return s0v3DtlCatAvGeData.getCatAvGeData(index).getInvstPct();
   }

  
	/**
	*  set variable invstPct
	*  @param value
	**/
   public void setInvstPct(int index,char[] value) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(value);
   } 

     /**
	 * 	Update InvstPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvstPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source, sourceIndex);
   	
   }
   
   public void setInvstPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InvstPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvstPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InvstPct with another Field
	 *	@param value
	 */
   public void setInvstPct(int index,Field source) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source);
   }  
   
     /**
	 * 	Update InvstPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvstPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InvstPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvstPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maxTrgtDriftPct
	 *	@return maxTrgtDriftPct
	 */
   public char[] getMaxTrgtDriftPct(int index) throws CFException  {              
   		return s0v3DtlCatAvGeData.getCatAvGeData(index).getMaxTrgtDriftPct();
   }

  
	/**
	*  set variable maxTrgtDriftPct
	*  @param value
	**/
   public void setMaxTrgtDriftPct(int index,char[] value) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(value);
   } 

     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source, sourceIndex);
   	
   }
   
   public void setMaxTrgtDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MaxTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(int index,Field source) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source);
   }  
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMaxTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodMaxTrgtDriftPct
	 *	@return prodMaxTrgtDriftPct
	 */
   public char[] getProdMaxTrgtDriftPct(int index) throws CFException  {              
   		return s0v3DtlRsrchData.getRsrchData(index).getProdMaxTrgtDriftPct();
   }

  
	/**
	*  set variable prodMaxTrgtDriftPct
	*  @param value
	**/
   public void setProdMaxTrgtDriftPct(int index,char[] value) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(value);
   } 

     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source, sourceIndex);
   	
   }
   
   public void setProdMaxTrgtDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdMaxTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(int index,Field source) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source);
   }  
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMaxTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of advsryMdlId
	 *	@return advsryMdlId
	 */
   public char[] getAdvsryMdlId() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryMdlId();
   }

  
	/**
	*  set variable advsryMdlId
	*  @param value
	**/
   public void setAdvsryMdlId(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlId(value);
   } 

     /**
	 * 	Update AdvsryMdlId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlId(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlId(source, sourceIndex);
   	
   }
   
   public void setAdvsryMdlId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryMdlId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryMdlId with another Field
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source) {
      s0v3DtlMdlData.setAdvsryMdlId(source);
   }  
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryMdlId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodInvstObjCd
	 *	@return prodInvstObjCd
	 */
   public char[] getProdInvstObjCd(int index) throws CFException  {              
   		return s0v3DtlRsrchData.getRsrchData(index).getProdInvstObjCd();
   }

  
	/**
	*  set variable prodInvstObjCd
	*  @param value
	**/
   public void setProdInvstObjCd(int index,char[] value) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(value);
   } 

     /**
	 * 	Update ProdInvstObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdInvstObjCd(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source, sourceIndex);
   	
   }
   
   public void setProdInvstObjCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstObjCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdInvstObjCd with another Field
	 *	@param value
	 */
   public void setProdInvstObjCd(int index,Field source) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source);
   }  
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdInvstObjCd(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstObjCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdInvstObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isDriftFound()
	 *	@return  Returns true if isDriftFound() is "Y"
	 */
   public boolean isDriftFound() throws CFException {
      return work.isDriftFound();
   }

	/**
	*  set values "Y"
	*/
   	public void setDriftFoundTrue()  throws CFException{  			
    	work.setDriftFoundTrue();
   	}
	/**
	 *	Returns the value of rebalAtmptCnt
	 *	@return rebalAtmptCnt
	 */
   public char[] getRebalAtmptCnt() throws CFException  {              
   		return s0v3DtlMdlData.getRebalAtmptCnt();
   }

  
	/**
	*  set variable rebalAtmptCnt
	*  @param value
	**/
   public void setRebalAtmptCnt(char[] value) throws CFException {
      s0v3DtlMdlData.setRebalAtmptCnt(value);
   } 

     /**
	 * 	Update RebalAtmptCnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRebalAtmptCnt(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setRebalAtmptCnt(source, sourceIndex);
   	
   }
   
   public void setRebalAtmptCnt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setRebalAtmptCnt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRebalAtmptCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setRebalAtmptCnt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RebalAtmptCnt with another Field
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source) {
      s0v3DtlMdlData.setRebalAtmptCnt(source);
   }  
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setRebalAtmptCnt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setRebalAtmptCnt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mdlDriftTyCd
	 *	@return mdlDriftTyCd
	 */
   public char[] getMdlDriftTyCd(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getMdlDriftTyCd();
   }

  
	/**
	*  set variable mdlDriftTyCd
	*  @param value
	**/
   public void setMdlDriftTyCd(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(value);
   } 

     /**
	 * 	Update MdlDriftTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlDriftTyCd(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source, sourceIndex);
   	
   }
   
   public void setMdlDriftTyCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftTyCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MdlDriftTyCd with another Field
	 *	@param value
	 */
   public void setMdlDriftTyCd(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source);
   }  
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlDriftTyCd(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftTyCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMdlDriftTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of begEffDate
	 *	@return begEffDate
	 */
   public char[] getBegEffDate() throws CFException  {              
   		return s0v3DtlMdlData.getBegEffDate();
   }

  
	/**
	*  set variable begEffDate
	*  @param value
	**/
   public void setBegEffDate(char[] value) throws CFException {
      s0v3DtlMdlData.setBegEffDate(value);
   } 

     /**
	 * 	Update BegEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBegEffDate(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setBegEffDate(source, sourceIndex);
   	
   }
   
   public void setBegEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setBegEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BegEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBegEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setBegEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BegEffDate with another Field
	 *	@param value
	 */
   public void setBegEffDate(Field source) {
      s0v3DtlMdlData.setBegEffDate(source);
   }  
   
     /**
	 * 	Update BegEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBegEffDate(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setBegEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BegEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBegEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setBegEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of acctSvcTyCd
	 *	@return acctSvcTyCd
	 */
   public char[] getAcctSvcTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getAcctSvcTyCd();
   }

  
	/**
	*  set variable acctSvcTyCd
	*  @param value
	**/
   public void setAcctSvcTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAcctSvcTyCd(value);
   } 

     /**
	 * 	Update AcctSvcTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcctSvcTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAcctSvcTyCd(source, sourceIndex);
   	
   }
   
   public void setAcctSvcTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAcctSvcTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcctSvcTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAcctSvcTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AcctSvcTyCd with another Field
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source) {
      s0v3DtlMdlData.setAcctSvcTyCd(source);
   }  
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAcctSvcTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAcctSvcTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of allocTrgtFromPct
	 *	@return allocTrgtFromPct
	 */
   public char[] getAllocTrgtFromPct(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getAllocTrgtFromPct();
   }

  
	/**
	*  set variable allocTrgtFromPct
	*  @param value
	**/
   public void setAllocTrgtFromPct(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(value);
   } 

     /**
	 * 	Update AllocTrgtFromPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocTrgtFromPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source, sourceIndex);
   	
   }
   
   public void setAllocTrgtFromPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtFromPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AllocTrgtFromPct with another Field
	 *	@param value
	 */
   public void setAllocTrgtFromPct(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source);
   }  
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocTrgtFromPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtFromPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtFromPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public int getDriftDataCnt() throws CFException {
   		return work.getDriftDataCnt();
	}


	/**
	 *	Returns String value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public char[]  getDriftDataCntString() throws CFException {
	     return String.valueOf(work.getDriftDataCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean driftDataCntIsNumeric()  throws CFException{
	    return work.driftDataCntIsNumeric();
	}

	/**
	 * 	Update DriftDataCnt with the passed value
	 *	@param number
	 */
	public void setDriftDataCnt(int number)  throws CFException{
		work.setDriftDataCnt(number);
	}
	

	public void setDriftDataCnt(long number)  throws CFException{
	    work.setDriftDataCnt(number);
	}
	
	
	/**
	 * 	Update DriftDataCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDriftDataCnt(char[] value)  throws CFException {
		work.setDriftDataCnt(value);
	}
	
	/**
	 * 	Update DriftDataCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDriftDataCntString(char[] value)  throws CFException{
		work.setDriftDataCnt(value);
	}	

	/**
	 *	Returns the value of mdlTmpltTyCd
	 *	@return mdlTmpltTyCd
	 */
   public char[] getMdlTmpltTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getMdlTmpltTyCd();
   }

  
	/**
	*  set variable mdlTmpltTyCd
	*  @param value
	**/
   public void setMdlTmpltTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setMdlTmpltTyCd(value);
   } 

     /**
	 * 	Update MdlTmpltTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlTmpltTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setMdlTmpltTyCd(source, sourceIndex);
   	
   }
   
   public void setMdlTmpltTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setMdlTmpltTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlTmpltTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlTmpltTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MdlTmpltTyCd with another Field
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source) {
      s0v3DtlMdlData.setMdlTmpltTyCd(source);
   }  
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setMdlTmpltTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlTmpltTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of advsryRsrchTyCd
	 *	@return advsryRsrchTyCd
	 */
   public char[] getAdvsryRsrchTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryRsrchTyCd();
   }

  
	/**
	*  set variable advsryRsrchTyCd
	*  @param value
	**/
   public void setAdvsryRsrchTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(value);
   } 

     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source, sourceIndex);
   	
   }
   
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryRsrchTyCd with another Field
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source) {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source);
   }  
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryRsrchTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of endEffDa
	 *	@return endEffDa
	 */
   public char[] getEndEffDa() throws CFException  {              
   		return s0v3DtlMdlData.getEndEffDa();
   }

  
	/**
	*  set variable endEffDa
	*  @param value
	**/
   public void setEndEffDa(char[] value) throws CFException {
      s0v3DtlMdlData.setEndEffDa(value);
   } 

     /**
	 * 	Update EndEffDa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndEffDa(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setEndEffDa(source, sourceIndex);
   	
   }
   
   public void setEndEffDa(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setEndEffDa(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EndEffDa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndEffDa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setEndEffDa(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EndEffDa with another Field
	 *	@param value
	 */
   public void setEndEffDa(Field source) {
      s0v3DtlMdlData.setEndEffDa(source);
   }  
   
     /**
	 * 	Update EndEffDa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndEffDa(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setEndEffDa(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EndEffDa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndEffDa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setEndEffDa(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mdlThresTyCd
	 *	@return mdlThresTyCd
	 */
   public char[] getMdlThresTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getMdlThresTyCd();
   }

  
	/**
	*  set variable mdlThresTyCd
	*  @param value
	**/
   public void setMdlThresTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setMdlThresTyCd(value);
   } 

     /**
	 * 	Update MdlThresTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlThresTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setMdlThresTyCd(source, sourceIndex);
   	
   }
   
   public void setMdlThresTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setMdlThresTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlThresTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlThresTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MdlThresTyCd with another Field
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source) {
      s0v3DtlMdlData.setMdlThresTyCd(source);
   }  
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setMdlThresTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlThresTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of invstObjCd
	 *	@return invstObjCd
	 */
   public char[] getInvstObjCd(int index) throws CFException  {              
   		return s0v3DtlCatAvGeData.getCatAvGeData(index).getInvstObjCd();
   }

  
	/**
	*  set variable invstObjCd
	*  @param value
	**/
   public void setInvstObjCd(int index,char[] value) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(value);
   } 

     /**
	 * 	Update InvstObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvstObjCd(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source, sourceIndex);
   	
   }
   
   public void setInvstObjCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InvstObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvstObjCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InvstObjCd with another Field
	 *	@param value
	 */
   public void setInvstObjCd(int index,Field source) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source);
   }  
   
     /**
	 * 	Update InvstObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvstObjCd(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InvstObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvstObjCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setInvstObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minInvstAmt
	 *	@return minInvstAmt
	 */
	public long getMinInvstAmt() throws CFException {
   		return s0v3DtlMdlData.getMinInvstAmt();
	}


	/**
	 *	Returns String value of minInvstAmt
	 *	@return minInvstAmt
	 */
	public char[]  getMinInvstAmtString() throws CFException {
	     return String.valueOf(s0v3DtlMdlData.getMinInvstAmtString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minInvstAmtIsNumeric()  throws CFException{
	    return s0v3DtlMdlData.minInvstAmtIsNumeric();
	}

	/**
	 * 	Update MinInvstAmt with the passed value
	 *	@param number
	 */
	public void setMinInvstAmt(long number)  throws CFException{
		s0v3DtlMdlData.setMinInvstAmt(number);
	}
	

	
	/**
	 * 	Update MinInvstAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinInvstAmt(char[] value)  throws CFException {
		s0v3DtlMdlData.setMinInvstAmt(value);
	}
	
	/**
	 * 	Update MinInvstAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMinInvstAmtString(char[] value)  throws CFException{
		s0v3DtlMdlData.setMinInvstAmt(value);
	}	

	/**
	 *	Returns the value of advsryMdlTyCd
	 *	@return advsryMdlTyCd
	 */
   public char[] getAdvsryMdlTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryMdlTyCd();
   }

  
	/**
	*  set variable advsryMdlTyCd
	*  @param value
	**/
   public void setAdvsryMdlTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlTyCd(value);
   } 

     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source, sourceIndex);
   	
   }
   
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryMdlTyCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source) {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source);
   }  
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cusipOrSmaId
	 *	@return cusipOrSmaId
	 */
   public char[] getCusipOrSmaId(int index) throws CFException  {              
   		return s0v3DtlRsrchData.getRsrchData(index).getCusipOrSmaId();
   }

  
	/**
	*  set variable cusipOrSmaId
	*  @param value
	**/
   public void setCusipOrSmaId(int index,char[] value) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(value);
   } 

     /**
	 * 	Update CusipOrSmaId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusipOrSmaId(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source, sourceIndex);
   	
   }
   
   public void setCusipOrSmaId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusipOrSmaId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusipOrSmaId with another Field
	 *	@param value
	 */
   public void setCusipOrSmaId(int index,Field source) {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source);
   }  
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusipOrSmaId(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusipOrSmaId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setCusipOrSmaId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodMinTrgtDriftPct
	 *	@return prodMinTrgtDriftPct
	 */
   public char[] getProdMinTrgtDriftPct(int index) throws CFException  {              
   		return s0v3DtlRsrchData.getRsrchData(index).getProdMinTrgtDriftPct();
   }

  
	/**
	*  set variable prodMinTrgtDriftPct
	*  @param value
	**/
   public void setProdMinTrgtDriftPct(int index,char[] value) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(value);
   } 

     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source, sourceIndex);
   	
   }
   
   public void setProdMinTrgtDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdMinTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(int index,Field source) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source);
   }  
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlRsrchData.getRsrchData(index).setProdMinTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mdlSerTyCd
	 *	@return mdlSerTyCd
	 */
   public char[] getMdlSerTyCd() throws CFException  {              
   		return s0v3DtlMdlData.getMdlSerTyCd();
   }

  
	/**
	*  set variable mdlSerTyCd
	*  @param value
	**/
   public void setMdlSerTyCd(char[] value) throws CFException {
      s0v3DtlMdlData.setMdlSerTyCd(value);
   } 

     /**
	 * 	Update MdlSerTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlSerTyCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setMdlSerTyCd(source, sourceIndex);
   	
   }
   
   public void setMdlSerTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setMdlSerTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlSerTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlSerTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MdlSerTyCd with another Field
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source) {
      s0v3DtlMdlData.setMdlSerTyCd(source);
   }  
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setMdlSerTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setMdlSerTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of advsryMdlVerCd
	 *	@return advsryMdlVerCd
	 */
   public char[] getAdvsryMdlVerCd() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryMdlVerCd();
   }

  
	/**
	*  set variable advsryMdlVerCd
	*  @param value
	**/
   public void setAdvsryMdlVerCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlVerCd(value);
   } 

     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source, sourceIndex);
   	
   }
   
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryMdlVerCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source) {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source);
   }  
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlVerCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minDriftPct
	 *	@return minDriftPct
	 */
   public char[] getMinDriftPct(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getMinDriftPct();
   }

  
	/**
	*  set variable minDriftPct
	*  @param value
	**/
   public void setMinDriftPct(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(value);
   } 

     /**
	 * 	Update MinDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMinDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source, sourceIndex);
   	
   }
   
   public void setMinDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MinDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMinDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MinDriftPct with another Field
	 *	@param value
	 */
   public void setMinDriftPct(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source);
   }  
   
     /**
	 * 	Update MinDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMinDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MinDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMinDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMinDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taxSnstvInd
	 *	@return taxSnstvInd
	 */
   public char[] getTaxSnstvInd() throws CFException  {              
   		return s0v3DtlMdlData.getTaxSnstvInd();
   }

  
	/**
	*  set variable taxSnstvInd
	*  @param value
	**/
   public void setTaxSnstvInd(char[] value) throws CFException {
      s0v3DtlMdlData.setTaxSnstvInd(value);
   } 

     /**
	 * 	Update TaxSnstvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaxSnstvInd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setTaxSnstvInd(source, sourceIndex);
   	
   }
   
   public void setTaxSnstvInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setTaxSnstvInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaxSnstvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setTaxSnstvInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TaxSnstvInd with another Field
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source) {
      s0v3DtlMdlData.setTaxSnstvInd(source);
   }  
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setTaxSnstvInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setTaxSnstvInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maxDriftPct
	 *	@return maxDriftPct
	 */
   public char[] getMaxDriftPct(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getMaxDriftPct();
   }

  
	/**
	*  set variable maxDriftPct
	*  @param value
	**/
   public void setMaxDriftPct(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(value);
   } 

     /**
	 * 	Update MaxDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaxDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source, sourceIndex);
   	
   }
   
   public void setMaxDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MaxDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MaxDriftPct with another Field
	 *	@param value
	 */
   public void setMaxDriftPct(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source);
   }  
   
     /**
	 * 	Update MaxDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaxDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MaxDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setMaxDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of advsryMdlBnchmkCd
	 *	@return advsryMdlBnchmkCd
	 */
   public char[] getAdvsryMdlBnchmkCd() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsryMdlBnchmkCd();
   }

  
	/**
	*  set variable advsryMdlBnchmkCd
	*  @param value
	**/
   public void setAdvsryMdlBnchmkCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(value);
   } 

     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source, sourceIndex);
   	
   }
   
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsryMdlBnchmkCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source) {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source);
   }  
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsryMdlBnchmkCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of s0v3DtlRec
	 *	@return s0v3DtlRec
	 */
   public char[] getS0v3DtlRec() throws CFException  {              
   		return work.getS0v3DtlRec();
   }

  
	/**
	*  set variable s0v3DtlRec
	*  @param value
	**/
   public void setS0v3DtlRec(char[] value) throws CFException {
      work.setS0v3DtlRec(value);
   } 

	/**
	 *	Returns the value of portObjCd
	 *	@return portObjCd
	 */
   public char[] getPortObjCd() throws CFException  {              
   		return s0v3DtlMdlData.getPortObjCd();
   }

  
	/**
	*  set variable portObjCd
	*  @param value
	**/
   public void setPortObjCd(char[] value) throws CFException {
      s0v3DtlMdlData.setPortObjCd(value);
   } 

     /**
	 * 	Update PortObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPortObjCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setPortObjCd(source, sourceIndex);
   	
   }
   
   public void setPortObjCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setPortObjCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PortObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPortObjCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setPortObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PortObjCd with another Field
	 *	@param value
	 */
   public void setPortObjCd(Field source) {
      s0v3DtlMdlData.setPortObjCd(source);
   }  
   
     /**
	 * 	Update PortObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPortObjCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setPortObjCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PortObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPortObjCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setPortObjCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minTrgtDriftPct
	 *	@return minTrgtDriftPct
	 */
   public char[] getMinTrgtDriftPct(int index) throws CFException  {              
   		return s0v3DtlCatAvGeData.getCatAvGeData(index).getMinTrgtDriftPct();
   }

  
	/**
	*  set variable minTrgtDriftPct
	*  @param value
	**/
   public void setMinTrgtDriftPct(int index,char[] value) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(value);
   } 

     /**
	 * 	Update MinTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMinTrgtDriftPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source, sourceIndex);
   	
   }
   
   public void setMinTrgtDriftPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMinTrgtDriftPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MinTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setMinTrgtDriftPct(int index,Field source) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source);
   }  
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMinTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMinTrgtDriftPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlCatAvGeData.getCatAvGeData(index).setMinTrgtDriftPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of advsrySubAdviseCd
	 *	@return advsrySubAdviseCd
	 */
   public char[] getAdvsrySubAdviseCd() throws CFException  {              
   		return s0v3DtlMdlData.getAdvsrySubAdviseCd();
   }

  
	/**
	*  set variable advsrySubAdviseCd
	*  @param value
	**/
   public void setAdvsrySubAdviseCd(char[] value) throws CFException {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(value);
   } 

     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source, sourceIndex);
   	
   }
   
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdvsrySubAdviseCd with another Field
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source) {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source);
   }  
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setAdvsrySubAdviseCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of allocTrgtToPct
	 *	@return allocTrgtToPct
	 */
   public char[] getAllocTrgtToPct(int index) throws CFException  {              
   		return s0v3DtlDriftData.getDriftData(index).getAllocTrgtToPct();
   }

  
	/**
	*  set variable allocTrgtToPct
	*  @param value
	**/
   public void setAllocTrgtToPct(int index,char[] value) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(value);
   } 

     /**
	 * 	Update AllocTrgtToPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocTrgtToPct(int index,char[] source, int sourceIndex) throws CFException {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source, sourceIndex);
   	
   }
   
   public void setAllocTrgtToPct(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtToPct(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AllocTrgtToPct with another Field
	 *	@param value
	 */
   public void setAllocTrgtToPct(int index,Field source) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source);
   }  
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocTrgtToPct(int index,Field source, int sourceIndex,int sourceLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtToPct(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlDriftData.getDriftData(index).setAllocTrgtToPct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of clsNewMnyInd
	 *	@return clsNewMnyInd
	 */
   public char[] getClsNewMnyInd() throws CFException  {              
   		return s0v3DtlMdlData.getClsNewMnyInd();
   }

  
	/**
	*  set variable clsNewMnyInd
	*  @param value
	**/
   public void setClsNewMnyInd(char[] value) throws CFException {
      s0v3DtlMdlData.setClsNewMnyInd(value);
   } 

     /**
	 * 	Update ClsNewMnyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClsNewMnyInd(char[] source, int sourceIndex) throws CFException {
      s0v3DtlMdlData.setClsNewMnyInd(source, sourceIndex);
   	
   }
   
   public void setClsNewMnyInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      s0v3DtlMdlData.setClsNewMnyInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClsNewMnyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setClsNewMnyInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClsNewMnyInd with another Field
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source) {
      s0v3DtlMdlData.setClsNewMnyInd(source);
   }  
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source, int sourceIndex,int sourceLen) {
      s0v3DtlMdlData.setClsNewMnyInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      s0v3DtlMdlData.setClsNewMnyInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cpsc4Ctx getCpsc4Ctx() {
            return Cpsc4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += s0v3DtlDriftData.hashCode();
        str += s0v3DtlMdlData.hashCode();
        str += work.hashCode();
        str += s0v3DtlCatAvGeData.hashCode();
        str += s0v3DtlRsrchData.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.s0v3DtlDriftData = new S0v3DtlDriftData();
        cloneObj.s0v3DtlDriftData.set(s0v3DtlDriftData.getClonedField());
        cloneObj.s0v3DtlMdlData = new S0v3DtlMdlData();
        cloneObj.s0v3DtlMdlData.set(s0v3DtlMdlData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.s0v3DtlCatAvGeData = new S0v3DtlCatAvGeData();
        cloneObj.s0v3DtlCatAvGeData.set(s0v3DtlCatAvGeData.getClonedField());
        cloneObj.s0v3DtlRsrchData = new S0v3DtlRsrchData();
        cloneObj.s0v3DtlRsrchData.set(s0v3DtlRsrchData.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1InCtx implements Cloneable {
     Work work = Cpsc4Ctx.this.getWork();

	/**
	 *	Returns the value of s0v3DtlRec
	 *	@return s0v3DtlRec
	 */
   public char[] getS0v3DtlRec() throws CFException  {              
   		return work.getS0v3DtlRec();
   }

  
	/**
	*  set variable s0v3DtlRec
	*  @param value
	**/
   public void setS0v3DtlRec(char[] value) throws CFException {
      work.setS0v3DtlRec(value);
   } 


        public Cpsc4Ctx getCpsc4Ctx() {
            return Cpsc4Ctx.this;
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

    public Process1InCtx clone() {
        Process1InCtx cloneObj = new Process1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1InCtx getProcess1InCtx() {
            return new Process1InCtx();
    }
}
