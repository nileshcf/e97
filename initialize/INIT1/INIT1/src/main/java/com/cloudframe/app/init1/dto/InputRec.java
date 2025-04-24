package com.cloudframe.app.init1.dto;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.math.RoundingMode;
import com.cloudframe.app.common.CONSTANTS;


public class InputRec extends InputRecSerialized { 
   

						private char[] inputEmplId = Field.fillLowValue(7);

						private char[] inputLastName = Field.fillLowValue(15);

						private char[] inputFirstName = Field.fillLowValue(15);

						private char[] inputEmplType = Field.fillLowValue(2);

						private char[] inputEmplClass = Field.fillLowValue(17);

						private char[] inputEmplSsn = Field.fillLowValue(9);


						private char[] inputEmplStartDate = Field.fillLowValue(8);


								private BigDecimal inputEmplRate = BigDecimal.ZERO;

						private char[] inputEmplStatus = Field.fillLowValue(1);
      private List<BigDecimal> inputDeductions; 

	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputEmplId
	 *	@return inputEmplId
	 */
   public char[] getInputEmplId() throws CFException{
     if (isInputEmplIdModified()) { 
        inputEmplId = refreshInputEmplId();
     }
   		return inputEmplId;
   }

  
	/**
	*  set variable inputEmplId
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-ID
	*  @param value
	**/
   public void setInputEmplId(char[] value) {
      inputEmplId = checkInputEmplIdConstraints(value);
      serializeInputEmplId(inputEmplId);
   } 

     /**
	 * 	Update InputEmplId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplId,inputEmplId.length);
   	
   }
   
   public void setInputEmplId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplId,inputEmplId.length);
   	
   }
   
     /**
	 * 	Update InputEmplId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplId with another Field
	 *	@param value
	 */
   public void setInputEmplId(Field source) {
       replace(source,0,source.length(),beginInputEmplId,INPUT_EMPL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplId,INPUT_EMPL_ID_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputLastName
	 *	@return inputLastName
	 */
   public char[] getInputLastName() throws CFException{
     if (isInputLastNameModified()) { 
        inputLastName = refreshInputLastName();
     }
   		return inputLastName;
   }

  
	/**
	*  set variable inputLastName
	*  Corresponding COBOL Variable is WS-INPUT-LAST-NAME
	*  @param value
	**/
   public void setInputLastName(char[] value) {
      inputLastName = checkInputLastNameConstraints(value);
      serializeInputLastName(inputLastName);
   } 

     /**
	 * 	Update InputLastName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputLastName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputLastName,inputLastName.length);
   	
   }
   
   public void setInputLastName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputLastName,inputLastName.length);
   	
   }
   
     /**
	 * 	Update InputLastName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputLastName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputLastName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputLastName with another Field
	 *	@param value
	 */
   public void setInputLastName(Field source) {
       replace(source,0,source.length(),beginInputLastName,INPUT_LAST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update InputLastName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputLastName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputLastName,INPUT_LAST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update InputLastName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputLastName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputLastName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputFirstName
	 *	@return inputFirstName
	 */
   public char[] getInputFirstName() throws CFException{
     if (isInputFirstNameModified()) { 
        inputFirstName = refreshInputFirstName();
     }
   		return inputFirstName;
   }

  
	/**
	*  set variable inputFirstName
	*  Corresponding COBOL Variable is WS-INPUT-FIRST-NAME
	*  @param value
	**/
   public void setInputFirstName(char[] value) {
      inputFirstName = checkInputFirstNameConstraints(value);
      serializeInputFirstName(inputFirstName);
   } 

     /**
	 * 	Update InputFirstName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputFirstName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputFirstName,inputFirstName.length);
   	
   }
   
   public void setInputFirstName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputFirstName,inputFirstName.length);
   	
   }
   
     /**
	 * 	Update InputFirstName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputFirstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputFirstName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputFirstName with another Field
	 *	@param value
	 */
   public void setInputFirstName(Field source) {
       replace(source,0,source.length(),beginInputFirstName,INPUT_FIRST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update InputFirstName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputFirstName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputFirstName,INPUT_FIRST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update InputFirstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputFirstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputFirstName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputEmplType
	 *	@return inputEmplType
	 */
   public char[] getInputEmplType() throws CFException{
     if (isInputEmplTypeModified()) { 
        inputEmplType = refreshInputEmplType();
     }
   		return inputEmplType;
   }

  
	/**
	*  set variable inputEmplType
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-TYPE
	*  @param value
	**/
   public void setInputEmplType(char[] value) {
      inputEmplType = checkInputEmplTypeConstraints(value);
      serializeInputEmplType(inputEmplType);
   } 

     /**
	 * 	Update InputEmplType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplType,inputEmplType.length);
   	
   }
   
   public void setInputEmplType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplType,inputEmplType.length);
   	
   }
   
     /**
	 * 	Update InputEmplType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplType with another Field
	 *	@param value
	 */
   public void setInputEmplType(Field source) {
       replace(source,0,source.length(),beginInputEmplType,INPUT_EMPL_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplType,INPUT_EMPL_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputEmplClass
	 *	@return inputEmplClass
	 */
   public char[] getInputEmplClass() throws CFException{
     if (isInputEmplClassModified()) { 
        inputEmplClass = refreshInputEmplClass();
     }
   		return inputEmplClass;
   }

  
	/**
	*  set variable inputEmplClass
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-CLASS
	*  @param value
	**/
   public void setInputEmplClass(char[] value) {
      inputEmplClass = checkInputEmplClassConstraints(value);
      serializeInputEmplClass(inputEmplClass);
   } 

     /**
	 * 	Update InputEmplClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplClass,inputEmplClass.length);
   	
   }
   
   public void setInputEmplClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplClass,inputEmplClass.length);
   	
   }
   
     /**
	 * 	Update InputEmplClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplClass with another Field
	 *	@param value
	 */
   public void setInputEmplClass(Field source) {
       replace(source,0,source.length(),beginInputEmplClass,INPUT_EMPL_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplClass,INPUT_EMPL_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputEmplSsn
	 *	@return inputEmplSsn
	 */
   public char[] getInputEmplSsn() throws CFException{
     if (isInputEmplSsnModified()) { 
        inputEmplSsn = refreshInputEmplSsn();
     }
   		return inputEmplSsn;
   }

  
	/**
	*  set variable inputEmplSsn
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-SSN
	*  @param value
	**/
   public void setInputEmplSsn(char[] value) {
      inputEmplSsn = checkInputEmplSsnConstraints(value);
      serializeInputEmplSsn(inputEmplSsn);
   } 

     /**
	 * 	Update InputEmplSsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplSsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplSsn,inputEmplSsn.length);
   	
   }
   
   public void setInputEmplSsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplSsn,inputEmplSsn.length);
   	
   }
   
     /**
	 * 	Update InputEmplSsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplSsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplSsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplSsn with another Field
	 *	@param value
	 */
   public void setInputEmplSsn(Field source) {
       replace(source,0,source.length(),beginInputEmplSsn,INPUT_EMPL_SSN_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplSsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplSsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplSsn,INPUT_EMPL_SSN_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplSsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplSsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplSsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputEmplStartDate
	 *	@return inputEmplStartDate
	 */
   public char[] getInputEmplStartDate() throws CFException{
     if (isInputEmplStartDateModified()) { 
        inputEmplStartDate = refreshInputEmplStartDate();
     }
   		return inputEmplStartDate;
   }

  
	/**
	*  set variable inputEmplStartDate
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-START-DATE
	*  @param value
	**/
   public void setInputEmplStartDate(char[] value) {
      inputEmplStartDate = checkInputEmplStartDateConstraints(value);
      serializeInputEmplStartDate(inputEmplStartDate);
   } 

     /**
	 * 	Update InputEmplStartDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplStartDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplStartDate,inputEmplStartDate.length);
   	
   }
   
   public void setInputEmplStartDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStartDate,inputEmplStartDate.length);
   	
   }
   
     /**
	 * 	Update InputEmplStartDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplStartDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStartDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplStartDate with another Field
	 *	@param value
	 */
   public void setInputEmplStartDate(Field source) {
       replace(source,0,source.length(),beginInputEmplStartDate,INPUT_EMPL_START_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplStartDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplStartDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplStartDate,INPUT_EMPL_START_DATE_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplStartDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplStartDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStartDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputEmplRate
	 *	@return inputEmplRate
	 */
	public BigDecimal getInputEmplRate() throws CFException {
       if (isInputEmplRateModified()) { 
           inputEmplRate = refreshInputEmplRate();
        }
   		return inputEmplRate;
	}
	

	
	   
	/**
	 * 	Update InputEmplRate with the passed number
	 *  Corresponding COBOL Variable is WS-INPUT-EMPL-RATE
	 *	@param number
	 */
	public void setInputEmplRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       inputEmplRate = checkInputEmplRateMaxLimit(number);
	    serializeInputEmplRate(inputEmplRate);
   }
	/**
	 * 	Update InputEmplRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputEmplRate(char[] value) throws CFException {
		 inputEmplRate = serializeInputEmplRate(value);
	}   
	/**
	 *	Returns the value of inputEmplStatus
	 *	@return inputEmplStatus
	 */
   public char[] getInputEmplStatus() throws CFException{
     if (isInputEmplStatusModified()) { 
        inputEmplStatus = refreshInputEmplStatus();
     }
   		return inputEmplStatus;
   }

  
	/**
	*  set variable inputEmplStatus
	*  Corresponding COBOL Variable is WS-INPUT-EMPL-STATUS
	*  @param value
	**/
   public void setInputEmplStatus(char[] value) {
      inputEmplStatus = checkInputEmplStatusConstraints(value);
      serializeInputEmplStatus(inputEmplStatus);
   } 

     /**
	 * 	Update InputEmplStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputEmplStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputEmplStatus,inputEmplStatus.length);
   	
   }
   
   public void setInputEmplStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStatus,inputEmplStatus.length);
   	
   }
   
     /**
	 * 	Update InputEmplStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputEmplStatus with another Field
	 *	@param value
	 */
   public void setInputEmplStatus(Field source) {
       replace(source,0,source.length(),beginInputEmplStatus,INPUT_EMPL_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update InputEmplStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputEmplStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputEmplStatus,INPUT_EMPL_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update InputEmplStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputEmplStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputEmplStatus+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of inputDeductions
	 *  Corresponding COBOL Variable is WS-INPUT-DEDUCTIONS
	 *	@return inputDeductions
	 */
	public List<BigDecimal> getInputDeductions() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < INPUT_DEDUCTIONS_SIZE;index++) {
        	list.add( getInputDeductions( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return inputDeductions
	 */
	public BigDecimal getInputDeductions(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getInputDeductions(), resetting it to 0",index);
		    index = 0;
        } else if (index >= INPUT_DEDUCTIONS_SIZE) {
             	index = INPUT_DEDUCTIONS_SIZE -1; // can't exceed max array size
             	logger.trace("inputDeductions - Array index exceeded max Size {}, resetting it to max allowed",INPUT_DEDUCTIONS_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginInputDeductions+ index*INPUT_DEDUCTIONS_LEN 
			                 ,INPUT_DEDUCTIONS_LEN
			                 ,INPUT_DEDUCTIONS_SCALE
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("inputDeductions", beginInputDeductions+ index*INPUT_DEDUCTIONS_LEN,INPUT_DEDUCTIONS_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean inputDeductionsIsNumeric(int index) {
	    return isNumeric(106 + index*5 
	                    ,106 + (index+1)*5 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of inputDeductions
     *  @param index
	 *  @return inputDeductions
	 */
	public char[] getInputDeductionsString(int index) {
	      return toCharArray( (beginInputDeductions + index*INPUT_DEDUCTIONS_LEN) , INPUT_DEDUCTIONS_LEN );
	}

	/**
	 *	Update InputDeductions at index with the passed value
	 *  Corresponding COBOL Variable is WS-INPUT-DEDUCTIONS
	 *  @param index
	 *	@param number
	 */
	public void setInputDeductions(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setInputDeductions(index,number, true);
	}

	 /**
	 *	Update InputDeductions at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setInputDeductions(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setInputDeductions(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= INPUT_DEDUCTIONS_SIZE) {
             	index = INPUT_DEDUCTIONS_SIZE -1; // can't exceed max array size
             	logger.trace("inputDeductions - Array index exceeded max Size {}, resetting it to max allowed",INPUT_DEDUCTIONS_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 5) value =   truncate(value,5) ;
		if (setModified) {
			serializeInputDeductions(index,value);
		}
   }
   
   	/**
	 *  Update InputDeductions at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setInputDeductions(int index,String value) {
			setInputDeductions(index,value, true);
	}

	/**
	 *  Update InputDeductions at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setInputDeductions(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,false/*isSigned?*/)
			       ,(beginInputDeductions + index*INPUT_DEDUCTIONS_LEN)
			       ,INPUT_DEDUCTIONS_LEN
			       );	
                      			
		}
   }

	
	
	
	/**
	 * 	initializes InputRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setInputEmplId(CONSTANTS.SPACE_7);
         setInputLastName(CONSTANTS.SPACE_15);
         setInputFirstName(CONSTANTS.SPACE_15);
         setInputEmplType(CONSTANTS.SPACE_2);
         setInputEmplClass(CONSTANTS.SPACE_17);
         setInputEmplSsn(CONSTANTS.SPACE_9);
         setInputEmplStartDate(CONSTANTS.SPACE_8);
			setInputEmplRate(BigDecimal.ZERO);
         setInputEmplStatus(CONSTANTS.SPACE);
            for (int index =0; index < INPUT_DEDUCTIONS_SIZE;index++) {
             setInputDeductions(index, BigDecimal.ZERO);
            }
   }

		public static int getInputRecFieldLength() {
			return INPUT_REC_LENGTH;
		}

}
  
