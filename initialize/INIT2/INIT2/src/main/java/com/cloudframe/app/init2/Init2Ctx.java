package com.cloudframe.app.init2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.init2.dto.Work;
import com.cloudframe.app.init2.dto.L6560DbscInfo;
import com.cloudframe.app.init2.dto.L6560OutputParmInfo;
import com.cloudframe.app.init2.dto.L6560ParmInfo;
import com.cloudframe.app.init2.dto.L6560InputParmInfo;


@Context
public class Init2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    L6560ParmInfo l6560ParmInfo;


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
    public L6560ParmInfo getL6560ParmInfo() {
        if (l6560ParmInfo == null) {
            l6560ParmInfo = new L6560ParmInfo();
        }

        return l6560ParmInfo;
    }

    public void setL6560ParmInfo(L6560ParmInfo l6560ParmInfo) {
        this.l6560ParmInfo = l6560ParmInfo;
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
        str += l6560ParmInfo.hashCode();
       return str.hashCode();
    }

    public Init2Ctx clone() {
        Init2Ctx cloneObj = new Init2Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.l6560ParmInfo = new L6560ParmInfo();
        cloneObj.l6560ParmInfo.set(l6560ParmInfo.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializeOutCtx implements Cloneable {
     L6560ParmInfo l6560ParmInfo = Init2Ctx.this.getL6560ParmInfo();

	/**
	 *	Returns the value of l6560DbscApplicableInd
	 *	@return l6560DbscApplicableInd
	 */
   public char[] getL6560DbscApplicableInd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscApplicableInd();
   }

  
	/**
	*  set variable l6560DbscApplicableInd
	*  @param value
	**/
   public void setL6560DbscApplicableInd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(value);
   } 

     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source, sourceIndex);
   	
   }
   
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560DbscApplicableInd with another Field
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source);
   }  
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscApplicableInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560DbscAssSurrAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssSurrAmt();
	}

    public char[] getL6560DbscAssSurrAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssSurrAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscAssSurrAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscAssSurrAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscAssSurrAmt(number);
   }

	public BigDecimal getL6560DbscAssChrgAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssChrgAmt();
	}

    public char[] getL6560DbscAssChrgAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssChrgAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscAssChrgAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscAssChrgAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscAssChrgAmt(number);
   }

	/**
	 *	Returns the value of l6560EffDt
	 *	@return l6560EffDt
	 */
   public char[] getL6560EffDt() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560EffDt();
   }

  
	/**
	*  set variable l6560EffDt
	*  @param value
	**/
   public void setL6560EffDt(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(value);
   } 

     /**
	 * 	Update L6560EffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560EffDt(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source, sourceIndex);
   	
   }
   
   public void setL6560EffDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560EffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560EffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560EffDt with another Field
	 *	@param value
	 */
   public void setL6560EffDt(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source);
   }  
   
     /**
	 * 	Update L6560EffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560EffDt(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560EffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560EffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560EffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560FreeWthdrwAmt() throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560FreeWthdrwAmt();
	}

    public char[] getL6560FreeWthdrwAmtString() throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560FreeWthdrwAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560FreeWthdrwAmt with the passed number
	 *	@param number
	 */
	public void setL6560FreeWthdrwAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560FreeWthdrwAmt(number);
   }

	/**
	 *	Returns the value of l6560RetrnCd
	 *	@return l6560RetrnCd
	 */
	public short getL6560RetrnCd() throws CFException {        
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560RetrnCd();
	}
	
	/**
	 * 	Update L6560RetrnCd with the passed value
	 *	@param number
	 */
	public void setL6560RetrnCd(short number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560RetrnCd(number);
	}

	public void setL6560RetrnCd(int number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560RetrnCd((short)number);
	}

	public void setL6560RetrnCd(long number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560RetrnCd((short)number);
	}



	/**
	 *	Returns the value of l6560SurrChrgOvridInd
	 *	@return l6560SurrChrgOvridInd
	 */
   public char[] getL6560SurrChrgOvridInd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560SurrChrgOvridInd();
   }

  
	/**
	*  set variable l6560SurrChrgOvridInd
	*  @param value
	**/
   public void setL6560SurrChrgOvridInd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(value);
   } 

     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source, sourceIndex);
   	
   }
   
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560SurrChrgOvridInd with another Field
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source);
   }  
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgOvridInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l6560CalcIfTerminatedSw
	 *	@return l6560CalcIfTerminatedSw
	 */
   public char[] getL6560CalcIfTerminatedSw() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560CalcIfTerminatedSw();
   }

  
	/**
	*  set variable l6560CalcIfTerminatedSw
	*  @param value
	**/
   public void setL6560CalcIfTerminatedSw(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(value);
   } 

     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source, sourceIndex);
   	
   }
   
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560CalcIfTerminatedSw with another Field
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source);
   }  
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560CalcIfTerminatedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l6560SurrChrgTypCd
	 *	@return l6560SurrChrgTypCd
	 */
   public char[] getL6560SurrChrgTypCd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560SurrChrgTypCd();
   }

  
	/**
	*  set variable l6560SurrChrgTypCd
	*  @param value
	**/
   public void setL6560SurrChrgTypCd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(value);
   } 

     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source, sourceIndex);
   	
   }
   
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560SurrChrgTypCd with another Field
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source);
   }  
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560SurrChrgTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560CvgAcumValuAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560CvgAcumValuAmt();
	}

    public char[] getL6560CvgAcumValuAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560CvgAcumValuAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560CvgAcumValuAmt with the passed number
	 *	@param number
	 */
	public void setL6560CvgAcumValuAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560CvgAcumValuAmt(number);
   }

	/**
	 *	Returns the value of l6560IoParmInfo
	 *	@return l6560IoParmInfo
	 */
   public char[] getL6560IoParmInfo() throws CFException  {              
   		return l6560ParmInfo.getL6560IoParmInfo();
   }

  
	/**
	*  set variable l6560IoParmInfo
	*  @param value
	**/
   public void setL6560IoParmInfo(char[] value) throws CFException {
      l6560ParmInfo.setL6560IoParmInfo(value);
   } 

     /**
	 * 	Update L6560IoParmInfo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560IoParmInfo(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.setL6560IoParmInfo(source, sourceIndex);
   	
   }
   
   public void setL6560IoParmInfo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.setL6560IoParmInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560IoParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.setL6560IoParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560IoParmInfo with another Field
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source) {
      l6560ParmInfo.setL6560IoParmInfo(source);
   }  
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.setL6560IoParmInfo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.setL6560IoParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560SurrSaleLoadAmt(int index) throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrSaleLoadInfo(index).getL6560SurrSaleLoadAmt();
	}

    public char[] getL6560SurrSaleLoadAmtString(int index) throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrSaleLoadInfo(index).getL6560SurrSaleLoadAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560SurrSaleLoadAmt with the passed number
	 *	@param number
	 */
	public void setL6560SurrSaleLoadAmt(int index,BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrSaleLoadInfo(index).setL6560SurrSaleLoadAmt(number);
   }

	public BigDecimal getL6560SurrAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560SurrAmt();
	}

    public char[] getL6560SurrAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560SurrAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560SurrAmt with the passed number
	 *	@param number
	 */
	public void setL6560SurrAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560SurrAmt(number);
   }

	public BigDecimal getL6560SurrChrgAmt() throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgAmt();
	}

    public char[] getL6560SurrChrgAmtString() throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560SurrChrgAmt with the passed number
	 *	@param number
	 */
	public void setL6560SurrChrgAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560SurrChrgAmt(number);
   }

	public BigDecimal getL6560DbscAssFreeAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssFreeAmt();
	}

    public char[] getL6560DbscAssFreeAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscAssFreeAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscAssFreeAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscAssFreeAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscAssFreeAmt(number);
   }

	public BigDecimal getL6560MktvalAdjAmt() throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560MktvalAdjAmt();
	}

    public char[] getL6560MktvalAdjAmtString() throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560MktvalAdjAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560MktvalAdjAmt with the passed number
	 *	@param number
	 */
	public void setL6560MktvalAdjAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560MktvalAdjAmt(number);
   }

	/**
	 *	Returns the value of l6560DbscInfo
	 *	@return l6560DbscInfo
	 */   
	 public L6560DbscInfo getL6560DbscInfo() {
   	return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo();
   }

   /**
	* 	Update L6560DbscInfo with the passed value
	*	@param value
	*/
   public void setL6560DbscInfo(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(value);
   }   

     /**
	 * 	Update L6560DbscInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscInfo(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560DbscInfo with another Field
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source) {
   	l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(source);
   }  
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source, int sourceIndex,int sourceLen) {
   	l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.getL6560InputParmInfo().setL6560DbscInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560MktvalAdjPct() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560MktvalAdjPct();
	}

    public char[] getL6560MktvalAdjPctString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560MktvalAdjPct().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560MktvalAdjPct with the passed number
	 *	@param number
	 */
	public void setL6560MktvalAdjPct(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560MktvalAdjPct(number);
   }

	/**
	 *	Returns the value of l6560Cvg
	 *	@return l6560Cvg
	 */
	public short getL6560Cvg() throws CFException {        
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560Cvg();
	}
	
	/**
	 * 	Update L6560Cvg with the passed value
	 *	@param number
	 */
	public void setL6560Cvg(short number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560Cvg(number);
	}

	public void setL6560Cvg(int number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560Cvg((short)number);
	}

	public void setL6560Cvg(long number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560Cvg((short)number);
	}



	public BigDecimal getL6560DbscTotSurrAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotSurrAmt();
	}

    public char[] getL6560DbscTotSurrAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotSurrAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscTotSurrAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscTotSurrAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscTotSurrAmt(number);
   }

	public BigDecimal getL6560SurrChrgPct() throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgPct();
	}

    public char[] getL6560SurrChrgPctString() throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgPct().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560SurrChrgPct with the passed number
	 *	@param number
	 */
	public void setL6560SurrChrgPct(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560SurrChrgPct(number);
   }

	public BigDecimal getL6560PolAcumValuAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560PolAcumValuAmt();
	}

    public char[] getL6560PolAcumValuAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560PolAcumValuAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560PolAcumValuAmt with the passed number
	 *	@param number
	 */
	public void setL6560PolAcumValuAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560PolAcumValuAmt(number);
   }

	/**
	 *	Returns the value of l6560RqstCd
	 *	@return l6560RqstCd
	 */
   public char[] getL6560RqstCd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560RqstCd();
   }

  
	/**
	*  set variable l6560RqstCd
	*  @param value
	**/
   public void setL6560RqstCd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(value);
   } 

     /**
	 * 	Update L6560RqstCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560RqstCd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source, sourceIndex);
   	
   }
   
   public void setL6560RqstCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560RqstCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560RqstCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560RqstCd with another Field
	 *	@param value
	 */
   public void setL6560RqstCd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source);
   }  
   
     /**
	 * 	Update L6560RqstCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560RqstCd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560RqstCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560RqstCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560RqstCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l6560OutputParmInfo
	 *	@return l6560OutputParmInfo
	 */   
	 public L6560OutputParmInfo getL6560OutputParmInfo() {
   	return l6560ParmInfo.getL6560OutputParmInfo();
   }

   /**
	* 	Update L6560OutputParmInfo with the passed value
	*	@param value
	*/
   public void setL6560OutputParmInfo(char[] value) throws CFException {
      l6560ParmInfo.setL6560OutputParmInfo(value);
   }   

     /**
	 * 	Update L6560OutputParmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560OutputParmInfo(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	l6560ParmInfo.setL6560OutputParmInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560OutputParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.setL6560OutputParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560OutputParmInfo with another Field
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source) {
   	l6560ParmInfo.setL6560OutputParmInfo(source);
   }  
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source, int sourceIndex,int sourceLen) {
   	l6560ParmInfo.setL6560OutputParmInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.setL6560OutputParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l6560InputParmInfo
	 *	@return l6560InputParmInfo
	 */   
	 public L6560InputParmInfo getL6560InputParmInfo() {
   	return l6560ParmInfo.getL6560InputParmInfo();
   }

   /**
	* 	Update L6560InputParmInfo with the passed value
	*	@param value
	*/
   public void setL6560InputParmInfo(char[] value) throws CFException {
      l6560ParmInfo.setL6560InputParmInfo(value);
   }   

     /**
	 * 	Update L6560InputParmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560InputParmInfo(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	l6560ParmInfo.setL6560InputParmInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560InputParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.setL6560InputParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560InputParmInfo with another Field
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source) {
   	l6560ParmInfo.setL6560InputParmInfo(source);
   }  
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source, int sourceIndex,int sourceLen) {
   	l6560ParmInfo.setL6560InputParmInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	l6560ParmInfo.setL6560InputParmInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560SurrChrgFlatAmt() throws CFException{      
   		return l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgFlatAmt();
	}

    public char[] getL6560SurrChrgFlatAmtString() throws CFException {
          return  l6560ParmInfo.getL6560OutputParmInfo().getL6560SurrChrgFlatAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560SurrChrgFlatAmt with the passed number
	 *	@param number
	 */
	public void setL6560SurrChrgFlatAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560OutputParmInfo().setL6560SurrChrgFlatAmt(number);
   }

	public BigDecimal getL6560MthvAdjAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560MthvAdjAmt();
	}

    public char[] getL6560MthvAdjAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560MthvAdjAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560MthvAdjAmt with the passed number
	 *	@param number
	 */
	public void setL6560MthvAdjAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().setL6560MthvAdjAmt(number);
   }

	public BigDecimal getL6560DbscTotChrgAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotChrgAmt();
	}

    public char[] getL6560DbscTotChrgAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotChrgAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscTotChrgAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscTotChrgAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscTotChrgAmt(number);
   }

	/**
	 *	Returns the value of l6560PlanFndTypCd
	 *	@return l6560PlanFndTypCd
	 */
   public char[] getL6560PlanFndTypCd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560PlanFndTypCd();
   }

  
	/**
	*  set variable l6560PlanFndTypCd
	*  @param value
	**/
   public void setL6560PlanFndTypCd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(value);
   } 

     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source, sourceIndex);
   	
   }
   
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560PlanFndTypCd with another Field
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source);
   }  
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560PlanFndTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l6560FreeWthAppliedInd
	 *	@return l6560FreeWthAppliedInd
	 */
   public char[] getL6560FreeWthAppliedInd() throws CFException  {              
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560FreeWthAppliedInd();
   }

  
	/**
	*  set variable l6560FreeWthAppliedInd
	*  @param value
	**/
   public void setL6560FreeWthAppliedInd(char[] value) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(value);
   } 

     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex) throws CFException {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source, sourceIndex);
   	
   }
   
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update L6560FreeWthAppliedInd with another Field
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source);
   }  
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source, int sourceIndex,int sourceLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      l6560ParmInfo.getL6560InputParmInfo().setL6560FreeWthAppliedInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getL6560DbscTotFreeAmt() throws CFException{      
   		return l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotFreeAmt();
	}

    public char[] getL6560DbscTotFreeAmtString() throws CFException {
          return  l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().getL6560DbscTotFreeAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update L6560DbscTotFreeAmt with the passed number
	 *	@param number
	 */
	public void setL6560DbscTotFreeAmt(BigDecimal number)  throws CFException{
		l6560ParmInfo.getL6560InputParmInfo().getL6560DbscInfo().setL6560DbscTotFreeAmt(number);
   }


        public Init2Ctx getInit2Ctx() {
            return Init2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += l6560ParmInfo.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.l6560ParmInfo = new L6560ParmInfo();
        cloneObj.l6560ParmInfo.set(l6560ParmInfo.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
}
