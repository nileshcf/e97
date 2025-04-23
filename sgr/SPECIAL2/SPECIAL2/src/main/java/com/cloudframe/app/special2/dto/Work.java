package com.cloudframe.app.special2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.special2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

								private int cnt1r;

								private char[] edit = Field.fillLowValue(11);

								private BigDecimal cnt2r = BigDecimal.ZERO;

								private char[] edit2 = Field.fillLowValue(12);

								private BigDecimal cnt3r = BigDecimal.ZERO;

								private char[] edit3 = Field.fillLowValue(8);

								private char[] bhDisplay = Field.fillLowValue(11);

								private BigDecimal bodyHeight = BigDecimal.ZERO;

								private BigDecimal numericFlag = BigDecimal.ZERO;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCnt3r(BigDecimal.valueOf(9876.25).setScale(2));
								setBodyHeight(BigDecimal.ZERO);
    }


 

	/**
	 *	Returns the value of cnt1r
	 *	@return cnt1r
	 */
	public int getCnt1r() throws CFException {
   		return cnt1r;
	}
	
	/**
	 * 	Update Cnt1r with the passed value
	 *  Corresponding COBOL Variable is WS-CNT-1R
	 *	@param number
	 */
	public void setCnt1r(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cnt1r = checkCnt1rMaxLimit(number); 
	}


	public void setCnt1r(long number) {
	    number = checkCnt1rMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCnt1r((int)number);
	}
	
	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException{
     if (isEditModified()) { 
        edit = refreshEdit();
     }
   		return edit;
   }

  
	/**
	*  set variable edit
	*  Corresponding COBOL Variable is WS-EDIT
	*  @param value
	**/
   public void setEdit(char[] value) {
      edit = checkEditConstraints(value);
      serializeEdit(edit);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEdit,edit.length);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEdit,edit.length);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
       replace(source,0,source.length(),beginEdit,EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEdit,EDIT_LEN);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
    
   }
	public BigDecimal getCnt2r() throws CFException {
        if (isCnt2rModified()) { 
           cnt2r = refreshCnt2r();
        }
   		return cnt2r;
	}

    public char[] getCnt2rString() {
          return  cnt2rString();
    }
	
	/**
	 * 	Update Cnt2r with the passed number
	 *  Corresponding COBOL Variable is WS-CNT-2R
	 *	@param number
	 */
	public void setCnt2r(BigDecimal number) {	
     cnt2r = checkCnt2rMaxLimit(number);
	    serializeCnt2r(cnt2r);
   }
	/**
	 *	Returns the value of edit2
	 *	@return edit2
	 */
   public char[] getEdit2() throws CFException{
     if (isEdit2Modified()) { 
        edit2 = refreshEdit2();
     }
   		return edit2;
   }

  
	/**
	*  set variable edit2
	*  Corresponding COBOL Variable is WS-EDIT2
	*  @param value
	**/
   public void setEdit2(char[] value) {
      edit2 = checkEdit2Constraints(value);
      serializeEdit2(edit2);
   } 

     /**
	 * 	Update Edit2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEdit2,edit2.length);
   	
   }
   
   public void setEdit2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEdit2,edit2.length);
   	
   }
   
     /**
	 * 	Update Edit2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Edit2 with another Field
	 *	@param value
	 */
   public void setEdit2(Field source) {
       replace(source,0,source.length(),beginEdit2,EDIT_2_LEN);
   	
   }  
   
     /**
	 * 	Update Edit2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEdit2,EDIT_2_LEN);
   	
   }
   
     /**
	 * 	Update Edit2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cnt3r
	 *	@return cnt3r
	 */
	public BigDecimal getCnt3r() throws CFException {
       if (isCnt3rModified()) { 
           cnt3r = refreshCnt3r();
        }
   		return cnt3r;
	}
	

	
	   
	/**
	 * 	Update Cnt3r with the passed number
	 *  Corresponding COBOL Variable is WS-CNT-3R
	 *	@param number
	 */
	public void setCnt3r(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       cnt3r = checkCnt3rMaxLimit(number);
	    serializeCnt3r(cnt3r);
   }
	/**
	 * 	Update Cnt3r with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt3r(char[] value) throws CFException {
		 cnt3r = serializeCnt3r(value);
	}   
	/**
	 *	Returns the value of edit3
	 *	@return edit3
	 */
   public char[] getEdit3() throws CFException{
     if (isEdit3Modified()) { 
        edit3 = refreshEdit3();
     }
   		return edit3;
   }

  
	/**
	*  set variable edit3
	*  Corresponding COBOL Variable is WS-EDIT3
	*  @param value
	**/
   public void setEdit3(char[] value) {
      edit3 = checkEdit3Constraints(value);
      serializeEdit3(edit3);
   } 

     /**
	 * 	Update Edit3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEdit3,edit3.length);
   	
   }
   
   public void setEdit3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEdit3,edit3.length);
   	
   }
   
     /**
	 * 	Update Edit3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Edit3 with another Field
	 *	@param value
	 */
   public void setEdit3(Field source) {
       replace(source,0,source.length(),beginEdit3,EDIT_3_LEN);
   	
   }  
   
     /**
	 * 	Update Edit3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEdit3,EDIT_3_LEN);
   	
   }
   
     /**
	 * 	Update Edit3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bhDisplay
	 *	@return bhDisplay
	 */
   public char[] getBhDisplay() throws CFException{
     if (isBhDisplayModified()) { 
        bhDisplay = refreshBhDisplay();
     }
   		return bhDisplay;
   }

  
	/**
	*  set variable bhDisplay
	*  Corresponding COBOL Variable is WS-BH-DISPLAY
	*  @param value
	**/
   public void setBhDisplay(char[] value) {
      bhDisplay = checkBhDisplayConstraints(value);
      serializeBhDisplay(bhDisplay);
   } 

     /**
	 * 	Update BhDisplay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBhDisplay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBhDisplay,bhDisplay.length);
   	
   }
   
   public void setBhDisplay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBhDisplay,bhDisplay.length);
   	
   }
   
     /**
	 * 	Update BhDisplay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBhDisplay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBhDisplay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BhDisplay with another Field
	 *	@param value
	 */
   public void setBhDisplay(Field source) {
       replace(source,0,source.length(),beginBhDisplay,BH_DISPLAY_LEN);
   	
   }  
   
     /**
	 * 	Update BhDisplay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBhDisplay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBhDisplay,BH_DISPLAY_LEN);
   	
   }
   
     /**
	 * 	Update BhDisplay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBhDisplay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBhDisplay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bodyHeight
	 *	@return bodyHeight
	 */
	public BigDecimal getBodyHeight() throws CFException {
       if (isBodyHeightModified()) { 
           bodyHeight = refreshBodyHeight();
        }
   		return bodyHeight;
	}
	

    /**
	 *	Returns the String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightActualString() {
	    String value = String.valueOf(bodyHeight).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BodyHeight with the passed number
	 *  Corresponding COBOL Variable is WS-BODY-HEIGHT
	 *	@param number
	 */
	public void setBodyHeight(BigDecimal number) {
       bodyHeight = checkBodyHeightMaxLimit(number);
	    serializeBodyHeight(bodyHeight);
   }
	/**
	 * 	Update BodyHeight with the passed value
	 *	@param value (String or char[])
	 */
	public void setBodyHeight(char[] value) throws CFException {
		 bodyHeight = serializeBodyHeight(value);
	}   
	/**
	 *	Returns the value of numericFlag
	 *	@return numericFlag
	 */
	public BigDecimal getNumericFlag() throws CFException {
       if (isNumericFlagModified()) { 
           numericFlag = refreshNumericFlag();
        }
   		return numericFlag;
	}
	

	
	   
	/**
	 * 	Update NumericFlag with the passed number
	 *  Corresponding COBOL Variable is WS-NUMERIC-FLAG
	 *	@param number
	 */
	public void setNumericFlag(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       numericFlag = checkNumericFlagMaxLimit(number);
	    serializeNumericFlag(numericFlag);
   }
	/**
	 * 	Update NumericFlag with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumericFlag(char[] value) throws CFException {
		 numericFlag = serializeNumericFlag(value);
	}   
	
	/**
	 *	Test condition 1234.56 THRU 5000.00 for isValidNumeric()
	 *	@return  Returns true if isValidNumeric() is 1234.56 THRU 5000.00
	 */
   public boolean isValidNumeric() throws CFException {
      return (   (getNumericFlag() .compareTo( BigDecimal.valueOf(1234.56 )) > -1 )   &&   (getNumericFlag() .compareTo( BigDecimal.valueOf(5000.00 )) < 1 )   );
   }


	/**
	*  set values 1234.56 THRU 5000.00
	*/
   	public void setValidNumericTrue() {  			
    	setNumericFlag( BigDecimal.valueOf(1234.56));
   	}
	
	/**
	 *	Test condition 5000.00 THRU 9999.99 for isInvalidNumeric()
	 *	@return  Returns true if isInvalidNumeric() is 5000.00 THRU 9999.99
	 */
   public boolean isInvalidNumeric() throws CFException {
      return (   (getNumericFlag() .compareTo( BigDecimal.valueOf(5000.00 )) > -1 )   &&   (getNumericFlag() .compareTo( BigDecimal.valueOf(9999.99 )) < 1 )   );
   }


	/**
	*  set values 5000.00 THRU 9999.99
	*/
   	public void setInvalidNumericTrue() {  			
    	setNumericFlag( BigDecimal.valueOf(5000.00));
   	}
	
	/**
	 *	Test condition 3456.78 for isExactMatch()
	 *	@return  Returns true if isExactMatch() is 3456.78
	 */
   public boolean isExactMatch() throws CFException {
      return (  getNumericFlag() .compareTo( BigDecimal.valueOf(3456.78) ) == 0  );
   }


	/**
	*  set values 3456.78
	*/
   	public void setExactMatchTrue() {  			
    	setNumericFlag( BigDecimal.valueOf(3456.78));
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
