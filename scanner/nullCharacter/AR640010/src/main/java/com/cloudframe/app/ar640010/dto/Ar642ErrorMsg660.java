package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642ErrorMsg660 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar642ErrorMsg660 extends Ar642ErrorMsg660Serialized {
   



								private int ar642ReturnCode660;

							private char[] ar642ErrorMsg660ConditionGroup3 = new char[40];
						
	
	/**
	* Constructor for Ar642ErrorMsg660
	**/
    public Ar642ErrorMsg660() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6000-ERROR ENCOUNTERED IN AR642010").toCharArray()
             , getStartOffset() + 0
             ,34
             );
       replaceValue( // serialize and save the value
             (", RETURN-CODE: ").toCharArray()
             , getStartOffset() + 34
             ,15
             );
								setAr642ReturnCode660(0);
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 53
             ,40
             );
    }


 

	/**
	 *	Returns the value of ar642ReturnCode660
	 *	@return ar642ReturnCode660
	 */
	public int getAr642ReturnCode660() throws CFException {
       if (isAr642ReturnCode660Modified()) { 
           ar642ReturnCode660 = refreshAr642ReturnCode660();
        }
   		return ar642ReturnCode660;
	}
	

	
	   
	/**
	 * 	Update Ar642ReturnCode660 with the passed value
	 *  Corresponding COBOL Variable is 660-AR642-RETURN-CODE
	 *	@param number
	 */
	public void setAr642ReturnCode660(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar642ReturnCode660 = checkAr642ReturnCode660MaxLimit(number); 
		serializeAr642ReturnCode660(ar642ReturnCode660);
	}
	

	public void setAr642ReturnCode660(long number) {
	    number = checkAr642ReturnCode660MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr642ReturnCode660((int)number);
	}
	
	/**
	 * 	Update Ar642ReturnCode660 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr642ReturnCode660(char[] value) throws CFException {
		 ar642ReturnCode660 = serializeAr642ReturnCode660(value);
	}
	/**
	 * 	Update Ar642ReturnCode660 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr642ReturnCode660String(char[] value) throws CFException {
		 setAr642ReturnCode660(value);
	}
	/**
	 *	Returns the value of ar642ErrorMsg660ConditionGroup3
	 *	@return ar642ErrorMsg660ConditionGroup3
	 */
   public char[] getAr642ErrorMsg660ConditionGroup3() throws CFException{
     if (isAr642ErrorMsg660ConditionGroup3Modified()) { 
        ar642ErrorMsg660ConditionGroup3 = refreshAr642ErrorMsg660ConditionGroup3();
     }
   		return ar642ErrorMsg660ConditionGroup3;
   }

  
	/**
	*  set variable ar642ErrorMsg660ConditionGroup3
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setAr642ErrorMsg660ConditionGroup3(char[] value) {
      ar642ErrorMsg660ConditionGroup3 = checkAr642ErrorMsg660ConditionGroup3Constraints(value);
      serializeAr642ErrorMsg660ConditionGroup3(ar642ErrorMsg660ConditionGroup3);
   } 

     /**
	 * 	Update Ar642ErrorMsg660ConditionGroup3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642ErrorMsg660ConditionGroup3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642ErrorMsg660ConditionGroup3,ar642ErrorMsg660ConditionGroup3.length);
   	
   }
   
   public void setAr642ErrorMsg660ConditionGroup3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ErrorMsg660ConditionGroup3,ar642ErrorMsg660ConditionGroup3.length);
   	
   }
   
     /**
	 * 	Update Ar642ErrorMsg660ConditionGroup3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642ErrorMsg660ConditionGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ErrorMsg660ConditionGroup3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642ErrorMsg660ConditionGroup3 with another Field
	 *	@param value
	 */
   public void setAr642ErrorMsg660ConditionGroup3(Field source) {
       replace(source,0,source.length(),beginAr642ErrorMsg660ConditionGroup3,AR_642_ERROR_MSG_660_CONDITION_GROUP_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642ErrorMsg660ConditionGroup3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642ErrorMsg660ConditionGroup3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642ErrorMsg660ConditionGroup3,AR_642_ERROR_MSG_660_CONDITION_GROUP_3_LEN);
   	
   }
   
     /**
	 * 	Update Ar642ErrorMsg660ConditionGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642ErrorMsg660ConditionGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ErrorMsg660ConditionGroup3+targetIndex,targetLen);
    
   }
	char[] ar642Known8866088Value = "                                        ".toCharArray();
	/**
	 *	Test condition " " for isAr642Known88660()
	 *	@return  Returns true if isAr642Known88660() is " "
	 */
   public boolean isAr642Known88660() throws CFException {
      return (  compareChars( getAr642ErrorMsg660ConditionGroup3() , ar642Known8866088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setAr642Known88660True() {  			
    	setAr642ErrorMsg660ConditionGroup3( ar642Known8866088Value);
   	}
	char[] ar642Unknown8866088Value = " (VALUE UNUSUAL OR UNKNOWN TO AR640010) ".toCharArray();
	/**
	 *	Test condition " (VALUE UNUSUAL OR UNKNOWN TO AR640010) " for isAr642Unknown88660()
	 *	@return  Returns true if isAr642Unknown88660() is " (VALUE UNUSUAL OR UNKNOWN TO AR640010) "
	 */
   public boolean isAr642Unknown88660() throws CFException {
      return (  compareChars( getAr642ErrorMsg660ConditionGroup3() , ar642Unknown8866088Value)  == 0  );
   }


	/**
	*  set values " (VALUE UNUSUAL OR UNKNOWN TO AR640010) "
	*/
   	public void setAr642Unknown88660True() {  			
    	setAr642ErrorMsg660ConditionGroup3( ar642Unknown8866088Value);
   	}

	
	
	

		public static int getAr642ErrorMsg660FieldLength() {
			return AR_642_ERROR_MSG_660_LENGTH;
		}

}
  
