package com.cloudframe.app.multi0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.multi0.dto.Work;


@Context
public class Multi0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

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
        str += work.hashCode();
       return str.hashCode();
    }

    public Multi0Ctx clone() {
        Multi0Ctx cloneObj = new Multi0Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainOutCtx implements Cloneable {
     Work work = Multi0Ctx.this.getWork();

	/**
	 *	Returns the value of wrkDb1dayFltDisp
	 *	@return wrkDb1dayFltDisp
	 */
   public char[] getWrkDb1dayFltDisp() throws CFException  {              
   		return work.getWrkDb1dayFltDisp();
   }

  
	/**
	*  set variable wrkDb1dayFltDisp
	*  @param value
	**/
   public void setWrkDb1dayFltDisp(char[] value) throws CFException {
      work.setWrkDb1dayFltDisp(value);
   } 

     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex) throws CFException {
      work.setWrkDb1dayFltDisp(source, sourceIndex);
   	
   }
   
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWrkDb1dayFltDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWrkDb1dayFltDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WrkDb1dayFltDisp with another Field
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source) {
      work.setWrkDb1dayFltDisp(source);
   }  
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source, int sourceIndex,int sourceLen) {
      work.setWrkDb1dayFltDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWrkDb1dayFltDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public BigDecimal getAxisWpCoiAccum() throws CFException {
   		return work.getAxisWpCoiAccum();
	}

    /**
	 *	Returns the String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumActualString()  throws CFException{
	    return work.getAxisWpCoiAccumActualString();
	}

	 /**
     *	Returns String value of axisWpCoiAccum
     *	@return axisWpCoiAccum
     */
    public char[]  getAxisWpCoiAccumString() throws CFException {
         return work.getAxisWpCoiAccumString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean axisWpCoiAccumIsNumeric() {
        return work.axisWpCoiAccumIsNumeric();
    }
	/**
	 * 	Update AxisWpCoiAccum with the passed number
	 *	@param number
	 */
	public void setAxisWpCoiAccum(BigDecimal number)  throws CFException{
		work.setAxisWpCoiAccum(number);
   }

	/**
	 * 	Update AxisWpCoiAccum with the passed value
	 *	@param value (String or char[]);
	 */
	public void setAxisWpCoiAccum(char[] value)  throws CFException{
		work.setAxisWpCoiAccum(value);
	}   

	/**
	 *	Returns the value of axisWpCoiRoundDisp
	 *	@return axisWpCoiRoundDisp
	 */
   public char[] getAxisWpCoiRoundDisp() throws CFException  {              
   		return work.getAxisWpCoiRoundDisp();
   }

  
	/**
	*  set variable axisWpCoiRoundDisp
	*  @param value
	**/
   public void setAxisWpCoiRoundDisp(char[] value) throws CFException {
      work.setAxisWpCoiRoundDisp(value);
   } 

     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex) throws CFException {
      work.setAxisWpCoiRoundDisp(source, sourceIndex);
   	
   }
   
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AxisWpCoiRoundDisp with another Field
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source) {
      work.setAxisWpCoiRoundDisp(source);
   }  
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public int getAxisWpCoiRound() throws CFException {
   		return work.getAxisWpCoiRound();
	}

    /**
	 *	Returns the String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundActualString() {
		return work.getAxisWpCoiRoundActualString();
	}

	/**
	 *	Returns String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundString() throws CFException {
	     return String.valueOf(work.getAxisWpCoiRoundString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiRoundIsNumeric()  throws CFException{
	    return work.axisWpCoiRoundIsNumeric();
	}

	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param number
	 */
	public void setAxisWpCoiRound(int number)  throws CFException{
		work.setAxisWpCoiRound(number);
	}
	

	public void setAxisWpCoiRound(long number)  throws CFException{
	    work.setAxisWpCoiRound(number);
	}
	
	
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRound(char[] value)  throws CFException {
		work.setAxisWpCoiRound(value);
	}
	
	/**
	 * 	Update AxisWpCoiRound with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRoundString(char[] value)  throws CFException{
		work.setAxisWpCoiRound(value);
	}	

	public BigDecimal getWrkDb1dayFlt() throws CFException{      
   		return work.getWrkDb1dayFlt();
	}

    public char[] getWrkDb1dayFltString() throws CFException {
          return  work.getWrkDb1dayFlt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WrkDb1dayFlt with the passed number
	 *	@param number
	 */
	public void setWrkDb1dayFlt(BigDecimal number)  throws CFException{
		work.setWrkDb1dayFlt(number);
   }


        public Multi0Ctx getMulti0Ctx() {
            return Multi0Ctx.this;
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

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
}
