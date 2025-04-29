package com.cloudframe.app.move0.dto;

/**
*  The class Parent21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class Parent21 extends Parent21Serialized { 
   

								private char[] child11 = Field.fillLowValue(1);
	
	/**
	* Constructor for Parent21
	**/
    public Parent21() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parent21. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent21(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of child11
	 *	@return child11
	 */
   public char[] getChild11() throws CFException{
     if (isChild11Modified()) { 
        child11 = refreshChild11();
     }
   		return child11;
   }

  
	/**
	*  set variable child11
	*  Corresponding COBOL Variable is WS-CHILD-11
	*  @param value
	**/
   public void setChild11(char[] value) {
      child11 = checkChild11Constraints(value);
      serializeChild11(child11);
   } 

     /**
	 * 	Update Child11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChild11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChild11,child11.length);
   	
   }
   
   public void setChild11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChild11,child11.length);
   	
   }
   
     /**
	 * 	Update Child11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChild11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Child11 with another Field
	 *	@param value
	 */
   public void setChild11(Field source) {
       replace(source,0,source.length(),beginChild11,CHILD_11_LEN);
   	
   }  
   
     /**
	 * 	Update Child11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChild11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChild11,CHILD_11_LEN);
   	
   }
   
     /**
	 * 	Update Child11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChild11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild11+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Parent21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setChild11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_35498,"0".toCharArray()));
   }

		public static int getParent21FieldLength() {
			return PARENT_21_LENGTH;
		}

}
  
