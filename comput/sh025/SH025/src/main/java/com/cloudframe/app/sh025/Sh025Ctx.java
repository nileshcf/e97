package com.cloudframe.app.sh025;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sh025.dto.Work;


@Context
public class Sh025Ctx implements ProgramContext, Cloneable {
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

    public Sh025Ctx clone() {
        Sh025Ctx cloneObj = new Sh025Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainSplit0OutCtx implements Cloneable {
     Work work = Sh025Ctx.this.getWork();

	public BigDecimal getPcstlogUsdCostValue() throws CFException{      
   		return work.getPcstlogUsdCostValue();
	}

    public char[] getPcstlogUsdCostValueString() throws CFException {
          return  work.getPcstlogUsdCostValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PcstlogUsdCostValue with the passed number
	 *	@param number
	 */
	public void setPcstlogUsdCostValue(BigDecimal number)  throws CFException{
		work.setPcstlogUsdCostValue(number);
   }

	public BigDecimal getWvVolExposed() throws CFException{      
   		return work.getWvVolExposed();
	}

    public char[] getWvVolExposedString() throws CFException {
          return  work.getWvVolExposed().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvVolExposed with the passed number
	 *	@param number
	 */
	public void setWvVolExposed(BigDecimal number)  throws CFException{
		work.setWvVolExposed(number);
   }

	public BigDecimal getDealgpalAllocWgtnNum() throws CFException{      
   		return work.getDealgpalAllocWgtnNum();
	}

    public char[] getDealgpalAllocWgtnNumString() throws CFException {
          return  work.getDealgpalAllocWgtnNum().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number)  throws CFException{
		work.setDealgpalAllocWgtnNum(number);
   }

	/**
	 *	Returns the value of wvVolExposedEdit
	 *	@return wvVolExposedEdit
	 */
   public char[] getWvVolExposedEdit() throws CFException  {              
   		return work.getWvVolExposedEdit();
   }

  
	/**
	*  set variable wvVolExposedEdit
	*  @param value
	**/
   public void setWvVolExposedEdit(char[] value) throws CFException {
      work.setWvVolExposedEdit(value);
   } 

     /**
	 * 	Update WvVolExposedEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvVolExposedEdit(char[] source, int sourceIndex) throws CFException {
      work.setWvVolExposedEdit(source, sourceIndex);
   	
   }
   
   public void setWvVolExposedEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvVolExposedEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvVolExposedEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvVolExposedEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvVolExposedEdit with another Field
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source) {
      work.setWvVolExposedEdit(source);
   }  
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source, int sourceIndex,int sourceLen) {
      work.setWvVolExposedEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvVolExposedEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvExtrOUsdValue2
	 *	@return wvExtrOUsdValue2
	 */
   public char[] getWvExtrOUsdValue2() throws CFException  {              
   		return work.getWvExtrOUsdValue2();
   }

  
	/**
	*  set variable wvExtrOUsdValue2
	*  @param value
	**/
   public void setWvExtrOUsdValue2(char[] value) throws CFException {
      work.setWvExtrOUsdValue2(value);
   } 

     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex) throws CFException {
      work.setWvExtrOUsdValue2(source, sourceIndex);
   	
   }
   
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrOUsdValue2 with another Field
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source) {
      work.setWvExtrOUsdValue2(source);
   }  
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvExtrOUsdValue
	 *	@return wvExtrOUsdValue
	 */
   public char[] getWvExtrOUsdValue() throws CFException  {              
   		return work.getWvExtrOUsdValue();
   }

  
	/**
	*  set variable wvExtrOUsdValue
	*  @param value
	**/
   public void setWvExtrOUsdValue(char[] value) throws CFException {
      work.setWvExtrOUsdValue(value);
   } 

     /**
	 * 	Update WvExtrOUsdValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOUsdValue(char[] source, int sourceIndex) throws CFException {
      work.setWvExtrOUsdValue(source, sourceIndex);
   	
   }
   
   public void setWvExtrOUsdValue(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvExtrOUsdValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrOUsdValue with another Field
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source) {
      work.setWvExtrOUsdValue(source);
   }  
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source, int sourceIndex,int sourceLen) {
      work.setWvExtrOUsdValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sh025Ctx getSh025Ctx() {
            return Sh025Ctx.this;
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

    public MainSplit0OutCtx clone() {
        MainSplit0OutCtx cloneObj = new MainSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
    }
     public class MainSplit1InCtx implements Cloneable {
     Work work = Sh025Ctx.this.getWork();

	/**
	 *	Returns the value of wvExtrOUsdValue2
	 *	@return wvExtrOUsdValue2
	 */
   public char[] getWvExtrOUsdValue2() throws CFException  {              
   		return work.getWvExtrOUsdValue2();
   }

  
	/**
	*  set variable wvExtrOUsdValue2
	*  @param value
	**/
   public void setWvExtrOUsdValue2(char[] value) throws CFException {
      work.setWvExtrOUsdValue2(value);
   } 

     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex) throws CFException {
      work.setWvExtrOUsdValue2(source, sourceIndex);
   	
   }
   
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrOUsdValue2 with another Field
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source) {
      work.setWvExtrOUsdValue2(source);
   }  
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrOUsdValue2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sh025Ctx getSh025Ctx() {
            return Sh025Ctx.this;
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

    public MainSplit1InCtx clone() {
        MainSplit1InCtx cloneObj = new MainSplit1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1InCtx getMainSplit1InCtx() {
            return new MainSplit1InCtx();
    }
}
