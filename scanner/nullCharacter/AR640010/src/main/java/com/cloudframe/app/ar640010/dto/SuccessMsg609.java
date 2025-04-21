package com.cloudframe.app.ar640010.dto;

/**
*  The class SuccessMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SuccessMsg609 extends SuccessMsg609Serialized {
   


								private long successRequest609;


							private char[] successMsg609ConditionGroup3 = new char[10];
						
	
	/**
	* Constructor for SuccessMsg609
	**/
    public SuccessMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0090-REQUEST NBR: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setSuccessRequest609(0L);
       replaceValue( // serialize and save the value
             (" SUCCESSFUL ").toCharArray()
             , getStartOffset() + 27
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 39
             ,10
             );
    }


 

	/**
	 *	Returns the value of successRequest609
	 *	@return successRequest609
	 */
	public long getSuccessRequest609() throws CFException {
       if (isSuccessRequest609Modified()) { 
           successRequest609 = refreshSuccessRequest609();
        }
   		return successRequest609;
	}
	

	
	   
	/**
	 * 	Update SuccessRequest609 with the passed value
	 *  Corresponding COBOL Variable is 609-SUCCESS-REQUEST
	 *	@param number
	 */
	public void setSuccessRequest609(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    successRequest609 = checkSuccessRequest609MaxLimit(number); 
		serializeSuccessRequest609(successRequest609);
	}
	

	/**
	 * 	Update SuccessRequest609 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSuccessRequest609(char[] value) throws CFException {
		 successRequest609 = serializeSuccessRequest609(value);
	}
	/**
	 * 	Update SuccessRequest609 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSuccessRequest609String(char[] value) throws CFException {
		 setSuccessRequest609(value);
	}
	/**
	 *	Returns the value of successMsg609ConditionGroup3
	 *	@return successMsg609ConditionGroup3
	 */
   public char[] getSuccessMsg609ConditionGroup3() throws CFException{
     if (isSuccessMsg609ConditionGroup3Modified()) { 
        successMsg609ConditionGroup3 = refreshSuccessMsg609ConditionGroup3();
     }
   		return successMsg609ConditionGroup3;
   }

  
	/**
	*  set variable successMsg609ConditionGroup3
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setSuccessMsg609ConditionGroup3(char[] value) {
      successMsg609ConditionGroup3 = checkSuccessMsg609ConditionGroup3Constraints(value);
      serializeSuccessMsg609ConditionGroup3(successMsg609ConditionGroup3);
   } 

     /**
	 * 	Update SuccessMsg609ConditionGroup3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessMsg609ConditionGroup3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessMsg609ConditionGroup3,successMsg609ConditionGroup3.length);
   	
   }
   
   public void setSuccessMsg609ConditionGroup3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessMsg609ConditionGroup3,successMsg609ConditionGroup3.length);
   	
   }
   
     /**
	 * 	Update SuccessMsg609ConditionGroup3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessMsg609ConditionGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessMsg609ConditionGroup3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessMsg609ConditionGroup3 with another Field
	 *	@param value
	 */
   public void setSuccessMsg609ConditionGroup3(Field source) {
       replace(source,0,source.length(),beginSuccessMsg609ConditionGroup3,SUCCESS_MSG_609_CONDITION_GROUP_3_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessMsg609ConditionGroup3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessMsg609ConditionGroup3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessMsg609ConditionGroup3,SUCCESS_MSG_609_CONDITION_GROUP_3_LEN);
   	
   }
   
     /**
	 * 	Update SuccessMsg609ConditionGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessMsg609ConditionGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessMsg609ConditionGroup3+targetIndex,targetLen);
    
   }
	char[] successComplete8860988Value = "COMPLETION".toCharArray();
	/**
	 *	Test condition "COMPLETION" for isSuccessComplete88609()
	 *	@return  Returns true if isSuccessComplete88609() is "COMPLETION"
	 */
   public boolean isSuccessComplete88609() throws CFException {
      return (  compareChars( getSuccessMsg609ConditionGroup3() , successComplete8860988Value)  == 0  );
   }


	/**
	*  set values "COMPLETION"
	*/
   	public void setSuccessComplete88609True() {  			
    	setSuccessMsg609ConditionGroup3( successComplete8860988Value);
   	}
	char[] successWarning8860988Value = "W/WARNING ".toCharArray();
	/**
	 *	Test condition "W/WARNING " for isSuccessWarning88609()
	 *	@return  Returns true if isSuccessWarning88609() is "W/WARNING "
	 */
   public boolean isSuccessWarning88609() throws CFException {
      return (  compareChars( getSuccessMsg609ConditionGroup3() , successWarning8860988Value)  == 0  );
   }


	/**
	*  set values "W/WARNING "
	*/
   	public void setSuccessWarning88609True() {  			
    	setSuccessMsg609ConditionGroup3( successWarning8860988Value);
   	}

	
	
	
	/**
	 * 	initializes SuccessMsg609
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSuccessRequest609(0);
   }

		public static int getSuccessMsg609FieldLength() {
			return SUCCESS_MSG_609_LENGTH;
		}

}
  
