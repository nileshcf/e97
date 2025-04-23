package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsgPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyLsgPrev extends KeyLsgPrevSerialized { 
   

								private int lsgPrvCustIdNo;

								private int lsgPrvAcctNo;

						private char[] lsgPrvShrGrpCompTyp = Field.fillLowValue(1);

						private char[] lsgPrvBlPerFromDt = Field.fillLowValue(10);

						private char[] lsgPrvBlPerToDt = Field.fillLowValue(10);

								private int lsgPrvShrGrpNo;
	
	/**
	* Constructor for KeyLsgPrev
	**/
    public KeyLsgPrev() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyLsgPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsgPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLsgPrvCustIdNo(0);
								setLsgPrvAcctNo(0);
								setLsgPrvShrGrpNo(0);
    } 

	/**
	 *	Returns the value of lsgPrvCustIdNo
	 *	@return lsgPrvCustIdNo
	 */
	public int getLsgPrvCustIdNo() throws CFException {
        if (isLsgPrvCustIdNoModified()) { 
           lsgPrvCustIdNo = refreshLsgPrvCustIdNo();
        }
   		return lsgPrvCustIdNo;
	}
	
	/**
	 * 	Update LsgPrvCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSG-PRV-CUST-ID-NO
	 *	@param number
	 */
	public void setLsgPrvCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsgPrvCustIdNo = checkLsgPrvCustIdNoMaxLimit(number); 
		serializeLsgPrvCustIdNo(lsgPrvCustIdNo);
	}


	public void setLsgPrvCustIdNo(long number) {
	    number = checkLsgPrvCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsgPrvCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of lsgPrvAcctNo
	 *	@return lsgPrvAcctNo
	 */
	public int getLsgPrvAcctNo() throws CFException {
        if (isLsgPrvAcctNoModified()) { 
           lsgPrvAcctNo = refreshLsgPrvAcctNo();
        }
   		return lsgPrvAcctNo;
	}
	
	/**
	 * 	Update LsgPrvAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSG-PRV-ACCT-NO
	 *	@param number
	 */
	public void setLsgPrvAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsgPrvAcctNo = checkLsgPrvAcctNoMaxLimit(number); 
		serializeLsgPrvAcctNo(lsgPrvAcctNo);
	}


	public void setLsgPrvAcctNo(long number) {
	    number = checkLsgPrvAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsgPrvAcctNo((int)number);
	}
	
	/**
	 *	Returns the value of lsgPrvShrGrpCompTyp
	 *	@return lsgPrvShrGrpCompTyp
	 */
   public char[] getLsgPrvShrGrpCompTyp() throws CFException{
     if (isLsgPrvShrGrpCompTypModified()) { 
        lsgPrvShrGrpCompTyp = refreshLsgPrvShrGrpCompTyp();
     }
   		return lsgPrvShrGrpCompTyp;
   }

  
	/**
	*  set variable lsgPrvShrGrpCompTyp
	*  Corresponding COBOL Variable is WS-LSG-PRV-SHR-GRP-COMP-TYP
	*  @param value
	**/
   public void setLsgPrvShrGrpCompTyp(char[] value) {
      lsgPrvShrGrpCompTyp = checkLsgPrvShrGrpCompTypConstraints(value);
      serializeLsgPrvShrGrpCompTyp(lsgPrvShrGrpCompTyp);
   } 

     /**
	 * 	Update LsgPrvShrGrpCompTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsgPrvShrGrpCompTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsgPrvShrGrpCompTyp,lsgPrvShrGrpCompTyp.length);
   	
   }
   
   public void setLsgPrvShrGrpCompTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvShrGrpCompTyp,lsgPrvShrGrpCompTyp.length);
   	
   }
   
     /**
	 * 	Update LsgPrvShrGrpCompTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvShrGrpCompTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvShrGrpCompTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsgPrvShrGrpCompTyp with another Field
	 *	@param value
	 */
   public void setLsgPrvShrGrpCompTyp(Field source) {
       replace(source,0,source.length(),beginLsgPrvShrGrpCompTyp,LSG_PRV_SHR_GRP_COMP_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update LsgPrvShrGrpCompTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsgPrvShrGrpCompTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsgPrvShrGrpCompTyp,LSG_PRV_SHR_GRP_COMP_TYP_LEN);
   	
   }
   
     /**
	 * 	Update LsgPrvShrGrpCompTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvShrGrpCompTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvShrGrpCompTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsgPrvBlPerFromDt
	 *	@return lsgPrvBlPerFromDt
	 */
   public char[] getLsgPrvBlPerFromDt() throws CFException{
     if (isLsgPrvBlPerFromDtModified()) { 
        lsgPrvBlPerFromDt = refreshLsgPrvBlPerFromDt();
     }
   		return lsgPrvBlPerFromDt;
   }

  
	/**
	*  set variable lsgPrvBlPerFromDt
	*  Corresponding COBOL Variable is WS-LSG-PRV-BL-PER-FROM-DT
	*  @param value
	**/
   public void setLsgPrvBlPerFromDt(char[] value) {
      lsgPrvBlPerFromDt = checkLsgPrvBlPerFromDtConstraints(value);
      serializeLsgPrvBlPerFromDt(lsgPrvBlPerFromDt);
   } 

     /**
	 * 	Update LsgPrvBlPerFromDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsgPrvBlPerFromDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsgPrvBlPerFromDt,lsgPrvBlPerFromDt.length);
   	
   }
   
   public void setLsgPrvBlPerFromDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerFromDt,lsgPrvBlPerFromDt.length);
   	
   }
   
     /**
	 * 	Update LsgPrvBlPerFromDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvBlPerFromDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerFromDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsgPrvBlPerFromDt with another Field
	 *	@param value
	 */
   public void setLsgPrvBlPerFromDt(Field source) {
       replace(source,0,source.length(),beginLsgPrvBlPerFromDt,LSG_PRV_BL_PER_FROM_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LsgPrvBlPerFromDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsgPrvBlPerFromDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerFromDt,LSG_PRV_BL_PER_FROM_DT_LEN);
   	
   }
   
     /**
	 * 	Update LsgPrvBlPerFromDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvBlPerFromDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerFromDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsgPrvBlPerToDt
	 *	@return lsgPrvBlPerToDt
	 */
   public char[] getLsgPrvBlPerToDt() throws CFException{
     if (isLsgPrvBlPerToDtModified()) { 
        lsgPrvBlPerToDt = refreshLsgPrvBlPerToDt();
     }
   		return lsgPrvBlPerToDt;
   }

  
	/**
	*  set variable lsgPrvBlPerToDt
	*  Corresponding COBOL Variable is WS-LSG-PRV-BL-PER-TO-DT
	*  @param value
	**/
   public void setLsgPrvBlPerToDt(char[] value) {
      lsgPrvBlPerToDt = checkLsgPrvBlPerToDtConstraints(value);
      serializeLsgPrvBlPerToDt(lsgPrvBlPerToDt);
   } 

     /**
	 * 	Update LsgPrvBlPerToDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsgPrvBlPerToDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsgPrvBlPerToDt,lsgPrvBlPerToDt.length);
   	
   }
   
   public void setLsgPrvBlPerToDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerToDt,lsgPrvBlPerToDt.length);
   	
   }
   
     /**
	 * 	Update LsgPrvBlPerToDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvBlPerToDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerToDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsgPrvBlPerToDt with another Field
	 *	@param value
	 */
   public void setLsgPrvBlPerToDt(Field source) {
       replace(source,0,source.length(),beginLsgPrvBlPerToDt,LSG_PRV_BL_PER_TO_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LsgPrvBlPerToDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsgPrvBlPerToDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerToDt,LSG_PRV_BL_PER_TO_DT_LEN);
   	
   }
   
     /**
	 * 	Update LsgPrvBlPerToDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsgPrvBlPerToDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsgPrvBlPerToDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsgPrvShrGrpNo
	 *	@return lsgPrvShrGrpNo
	 */
	public int getLsgPrvShrGrpNo() throws CFException {
        if (isLsgPrvShrGrpNoModified()) { 
           lsgPrvShrGrpNo = refreshLsgPrvShrGrpNo();
        }
   		return lsgPrvShrGrpNo;
	}
	
	/**
	 * 	Update LsgPrvShrGrpNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSG-PRV-SHR-GRP-NO
	 *	@param number
	 */
	public void setLsgPrvShrGrpNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsgPrvShrGrpNo = checkLsgPrvShrGrpNoMaxLimit(number); 
		serializeLsgPrvShrGrpNo(lsgPrvShrGrpNo);
	}


	public void setLsgPrvShrGrpNo(long number) {
	    number = checkLsgPrvShrGrpNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsgPrvShrGrpNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyLsgPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsgPrvCustIdNo(0);
                     setLsgPrvAcctNo(0);
         setLsgPrvShrGrpCompTyp(CONSTANTS.SPACE);
         setLsgPrvBlPerFromDt(CONSTANTS.SPACE_10);
         setLsgPrvBlPerToDt(CONSTANTS.SPACE_10);
                     setLsgPrvShrGrpNo(0);
   }

		public static int getKeyLsgPrevFieldLength() {
			return KEY_LSG_PREV_LENGTH;
		}

}
  
