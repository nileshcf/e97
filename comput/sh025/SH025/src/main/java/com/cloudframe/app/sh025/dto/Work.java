package com.cloudframe.app.sh025.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.sh025.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private BigDecimal wvVolExposed = BigDecimal.ZERO;

								private BigDecimal dealgpalAllocWgtnNum = BigDecimal.ZERO;

								private char[] wvVolExposedEdit = Field.fillLowValue(15);

								private char[] wvExtrOUsdValue = Field.fillLowValue(10);

								private BigDecimal pcstlogUsdCostValue = BigDecimal.ZERO;

								private char[] wvExtrOUsdValue2 = Field.fillLowValue(12);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getWvVolExposed() throws CFException {
        if (isWvVolExposedModified()) { 
           wvVolExposed = refreshWvVolExposed();
        }
   		return wvVolExposed;
	}

    public char[] getWvVolExposedString() {
          return  wvVolExposedString();
    }
	
	/**
	 * 	Update WvVolExposed with the passed number
	 *  Corresponding COBOL Variable is WV-VOL-EXPOSED
	 *	@param number
	 */
	public void setWvVolExposed(BigDecimal number) {	
     wvVolExposed = checkWvVolExposedMaxLimit(number);
	    serializeWvVolExposed(wvVolExposed);
   }
	public BigDecimal getDealgpalAllocWgtnNum() throws CFException {
        if (isDealgpalAllocWgtnNumModified()) { 
           dealgpalAllocWgtnNum = refreshDealgpalAllocWgtnNum();
        }
   		return dealgpalAllocWgtnNum;
	}

    public char[] getDealgpalAllocWgtnNumString() {
          return  dealgpalAllocWgtnNumString();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *  Corresponding COBOL Variable is DEALGPAL-ALLOC-WGTN-NUM
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number) {	
     dealgpalAllocWgtnNum = checkDealgpalAllocWgtnNumMaxLimit(number);
	    serializeDealgpalAllocWgtnNum(dealgpalAllocWgtnNum);
   }
	/**
	 *	Returns the value of wvVolExposedEdit
	 *	@return wvVolExposedEdit
	 */
   public char[] getWvVolExposedEdit() throws CFException{
     if (isWvVolExposedEditModified()) { 
        wvVolExposedEdit = refreshWvVolExposedEdit();
     }
   		return wvVolExposedEdit;
   }

  
	/**
	*  set variable wvVolExposedEdit
	*  Corresponding COBOL Variable is WV-VOL-EXPOSED-EDIT
	*  @param value
	**/
   public void setWvVolExposedEdit(char[] value) {
      wvVolExposedEdit = checkWvVolExposedEditConstraints(value);
      serializeWvVolExposedEdit(wvVolExposedEdit);
   } 

     /**
	 * 	Update WvVolExposedEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvVolExposedEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvVolExposedEdit,wvVolExposedEdit.length);
   	
   }
   
   public void setWvVolExposedEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvVolExposedEdit,wvVolExposedEdit.length);
   	
   }
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvVolExposedEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvVolExposedEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvVolExposedEdit with another Field
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source) {
       replace(source,0,source.length(),beginWvVolExposedEdit,WV_VOL_EXPOSED_EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvVolExposedEdit,WV_VOL_EXPOSED_EDIT_LEN);
   	
   }
   
     /**
	 * 	Update WvVolExposedEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvVolExposedEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvVolExposedEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrOUsdValue
	 *	@return wvExtrOUsdValue
	 */
   public char[] getWvExtrOUsdValue() throws CFException{
     if (isWvExtrOUsdValueModified()) { 
        wvExtrOUsdValue = refreshWvExtrOUsdValue();
     }
   		return wvExtrOUsdValue;
   }

  
	/**
	*  set variable wvExtrOUsdValue
	*  Corresponding COBOL Variable is WV-EXTR-O-USD-VALUE
	*  @param value
	**/
   public void setWvExtrOUsdValue(char[] value) {
      wvExtrOUsdValue = checkWvExtrOUsdValueConstraints(value);
      serializeWvExtrOUsdValue(wvExtrOUsdValue);
   } 

     /**
	 * 	Update WvExtrOUsdValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOUsdValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrOUsdValue,wvExtrOUsdValue.length);
   	
   }
   
   public void setWvExtrOUsdValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue,wvExtrOUsdValue.length);
   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrOUsdValue with another Field
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source) {
       replace(source,0,source.length(),beginWvExtrOUsdValue,WV_EXTR_OUSD_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue,WV_EXTR_OUSD_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue+targetIndex,targetLen);
    
   }
	public BigDecimal getPcstlogUsdCostValue() throws CFException {
        if (isPcstlogUsdCostValueModified()) { 
           pcstlogUsdCostValue = refreshPcstlogUsdCostValue();
        }
   		return pcstlogUsdCostValue;
	}

    public char[] getPcstlogUsdCostValueString() {
          return  pcstlogUsdCostValueString();
    }
	
	/**
	 * 	Update PcstlogUsdCostValue with the passed number
	 *  Corresponding COBOL Variable is PCSTLOG-USD-COST-VALUE
	 *	@param number
	 */
	public void setPcstlogUsdCostValue(BigDecimal number) {	
     pcstlogUsdCostValue = checkPcstlogUsdCostValueMaxLimit(number);
	    serializePcstlogUsdCostValue(pcstlogUsdCostValue);
   }
	/**
	 *	Returns the value of wvExtrOUsdValue2
	 *	@return wvExtrOUsdValue2
	 */
   public char[] getWvExtrOUsdValue2() throws CFException{
     if (isWvExtrOUsdValue2Modified()) { 
        wvExtrOUsdValue2 = refreshWvExtrOUsdValue2();
     }
   		return wvExtrOUsdValue2;
   }

  
	/**
	*  set variable wvExtrOUsdValue2
	*  Corresponding COBOL Variable is WV-EXTR-O-USD-VALUE2
	*  @param value
	**/
   public void setWvExtrOUsdValue2(char[] value) {
      wvExtrOUsdValue2 = checkWvExtrOUsdValue2Constraints(value);
      serializeWvExtrOUsdValue2(wvExtrOUsdValue2);
   } 

     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrOUsdValue2,wvExtrOUsdValue2.length);
   	
   }
   
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue2,wvExtrOUsdValue2.length);
   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrOUsdValue2 with another Field
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source) {
       replace(source,0,source.length(),beginWvExtrOUsdValue2,WV_EXTR_OUSD_VALUE_2_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue2,WV_EXTR_OUSD_VALUE_2_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrOUsdValue2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOUsdValue2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOUsdValue2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
