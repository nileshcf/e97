package com.cloudframe.app.divide0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.divide0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private short ip20004ItemLength;

								private short tmpLth800;

								private BigDecimal decimal = BigDecimal.ZERO;

								private char[] editFld1 = Field.fillLowValue(5);

								private char[] editFld2 = Field.fillLowValue(6);

								private long fbTotalVolume;

								private char[] daPcntHoldDisp = Field.fillLowValue(8);

								private char[] daPercentDisp = Field.fillLowValue(6);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip20004ItemLength
	 *	@return ip20004ItemLength
	 */
	public short getIp20004ItemLength() throws CFException {
   		return ip20004ItemLength;
	}
	
	/**
	 * 	Update Ip20004ItemLength with the passed value
	 *  Corresponding COBOL Variable is IP20004-ITEM-LENGTH
	 *	@param number
	 */
	public void setIp20004ItemLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip20004ItemLength = checkIp20004ItemLengthMaxLimit(number); 
	}

	public void setIp20004ItemLength(int number) {
	    number = checkIp20004ItemLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp20004ItemLength((short)number);
	}
	public void setIp20004ItemLength(long number) {
	    number = checkIp20004ItemLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp20004ItemLength((short)number);
	}
	

	/**
	 *	Returns the value of tmpLth800
	 *	@return tmpLth800
	 */
	public short getTmpLth800() throws CFException {
   		return tmpLth800;
	}
	
	/**
	 * 	Update TmpLth800 with the passed value
	 *  Corresponding COBOL Variable is 800-TMP-LTH
	 *	@param number
	 */
	public void setTmpLth800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tmpLth800 = checkTmpLth800MaxLimit(number); 
	}

	public void setTmpLth800(int number) {
	    number = checkTmpLth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTmpLth800((short)number);
	}
	public void setTmpLth800(long number) {
	    number = checkTmpLth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTmpLth800((short)number);
	}
	

	public BigDecimal getDecimal() throws CFException {
        if (isDecimalModified()) { 
           decimal = refreshDecimal();
        }
   		return decimal;
	}

    public char[] getDecimalString() {
          return  decimalString();
    }
	
	/**
	 * 	Update Decimal with the passed number
	 *  Corresponding COBOL Variable is WS-DECIMAL
	 *	@param number
	 */
	public void setDecimal(BigDecimal number) {	
     decimal = checkDecimalMaxLimit(number);
	    serializeDecimal(decimal);
   }
	/**
	 *	Returns the value of editFld1
	 *	@return editFld1
	 */
   public char[] getEditFld1() throws CFException{
     if (isEditFld1Modified()) { 
        editFld1 = refreshEditFld1();
     }
   		return editFld1;
   }

  
	/**
	*  set variable editFld1
	*  Corresponding COBOL Variable is WS-EDIT-FLD1
	*  @param value
	**/
   public void setEditFld1(char[] value) {
      editFld1 = checkEditFld1Constraints(value);
      serializeEditFld1(editFld1);
   } 

     /**
	 * 	Update EditFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEditFld1,editFld1.length);
   	
   }
   
   public void setEditFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld1,editFld1.length);
   	
   }
   
     /**
	 * 	Update EditFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EditFld1 with another Field
	 *	@param value
	 */
   public void setEditFld1(Field source) {
       replace(source,0,source.length(),beginEditFld1,EDIT_FLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update EditFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEditFld1,EDIT_FLD_1_LEN);
   	
   }
   
     /**
	 * 	Update EditFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of editFld2
	 *	@return editFld2
	 */
   public char[] getEditFld2() throws CFException{
     if (isEditFld2Modified()) { 
        editFld2 = refreshEditFld2();
     }
   		return editFld2;
   }

  
	/**
	*  set variable editFld2
	*  Corresponding COBOL Variable is WS-EDIT-FLD2
	*  @param value
	**/
   public void setEditFld2(char[] value) {
      editFld2 = checkEditFld2Constraints(value);
      serializeEditFld2(editFld2);
   } 

     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEditFld2,editFld2.length);
   	
   }
   
   public void setEditFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld2,editFld2.length);
   	
   }
   
     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EditFld2 with another Field
	 *	@param value
	 */
   public void setEditFld2(Field source) {
       replace(source,0,source.length(),beginEditFld2,EDIT_FLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEditFld2,EDIT_FLD_2_LEN);
   	
   }
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fbTotalVolume
	 *	@return fbTotalVolume
	 */
	public long getFbTotalVolume() throws CFException {
       if (isFbTotalVolumeModified()) { 
           fbTotalVolume = refreshFbTotalVolume();
        }
   		return fbTotalVolume;
	}
	

	
	   
	/**
	 * 	Update FbTotalVolume with the passed value
	 *  Corresponding COBOL Variable is FB-TOTAL-VOLUME
	 *	@param number
	 */
	public void setFbTotalVolume(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fbTotalVolume = checkFbTotalVolumeMaxLimit(number); 
		serializeFbTotalVolume(fbTotalVolume);
	}
	

	/**
	 * 	Update FbTotalVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setFbTotalVolume(char[] value) throws CFException {
		 fbTotalVolume = serializeFbTotalVolume(value);
	}
	/**
	 * 	Update FbTotalVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFbTotalVolumeString(char[] value) throws CFException {
		 setFbTotalVolume(value);
	}
	/**
	 *	Returns the value of daPcntHoldDisp
	 *	@return daPcntHoldDisp
	 */
   public char[] getDaPcntHoldDisp() throws CFException{
     if (isDaPcntHoldDispModified()) { 
        daPcntHoldDisp = refreshDaPcntHoldDisp();
     }
   		return daPcntHoldDisp;
   }

  
	/**
	*  set variable daPcntHoldDisp
	*  Corresponding COBOL Variable is DA-PCNT-HOLD-DISP
	*  @param value
	**/
   public void setDaPcntHoldDisp(char[] value) {
      daPcntHoldDisp = checkDaPcntHoldDispConstraints(value);
      serializeDaPcntHoldDisp(daPcntHoldDisp);
   } 

     /**
	 * 	Update DaPcntHoldDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaPcntHoldDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDaPcntHoldDisp,daPcntHoldDisp.length);
   	
   }
   
   public void setDaPcntHoldDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDaPcntHoldDisp,daPcntHoldDisp.length);
   	
   }
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaPcntHoldDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaPcntHoldDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DaPcntHoldDisp with another Field
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source) {
       replace(source,0,source.length(),beginDaPcntHoldDisp,DA_PCNT_HOLD_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDaPcntHoldDisp,DA_PCNT_HOLD_DISP_LEN);
   	
   }
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaPcntHoldDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of daPercentDisp
	 *	@return daPercentDisp
	 */
   public char[] getDaPercentDisp() throws CFException{
     if (isDaPercentDispModified()) { 
        daPercentDisp = refreshDaPercentDisp();
     }
   		return daPercentDisp;
   }

  
	/**
	*  set variable daPercentDisp
	*  Corresponding COBOL Variable is DA-PERCENT-DISP
	*  @param value
	**/
   public void setDaPercentDisp(char[] value) {
      daPercentDisp = checkDaPercentDispConstraints(value);
      serializeDaPercentDisp(daPercentDisp);
   } 

     /**
	 * 	Update DaPercentDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaPercentDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDaPercentDisp,daPercentDisp.length);
   	
   }
   
   public void setDaPercentDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDaPercentDisp,daPercentDisp.length);
   	
   }
   
     /**
	 * 	Update DaPercentDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaPercentDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaPercentDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DaPercentDisp with another Field
	 *	@param value
	 */
   public void setDaPercentDisp(Field source) {
       replace(source,0,source.length(),beginDaPercentDisp,DA_PERCENT_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update DaPercentDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaPercentDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDaPercentDisp,DA_PERCENT_DISP_LEN);
   	
   }
   
     /**
	 * 	Update DaPercentDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaPercentDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaPercentDisp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
