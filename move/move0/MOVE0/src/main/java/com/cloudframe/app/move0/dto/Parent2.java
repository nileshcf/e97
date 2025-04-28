package com.cloudframe.app.move0.dto;

/**
*  The class Parent2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class Parent2 extends Parent2Serialized { 
   

								private char[] child1 = Field.fillLowValue(1);
	
	/**
	* Constructor for Parent2
	**/
    public Parent2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parent2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of child1
	 *	@return child1
	 */
   public char[] getChild1() throws CFException{
     if (isChild1Modified()) { 
        child1 = refreshChild1();
     }
   		return child1;
   }

  
	/**
	*  set variable child1
	*  Corresponding COBOL Variable is WS-CHILD-1
	*  @param value
	**/
   public void setChild1(char[] value) {
      child1 = checkChild1Constraints(value);
      serializeChild1(child1);
   } 

     /**
	 * 	Update Child1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChild1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChild1,child1.length);
   	
   }
   
   public void setChild1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChild1,child1.length);
   	
   }
   
     /**
	 * 	Update Child1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChild1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Child1 with another Field
	 *	@param value
	 */
   public void setChild1(Field source) {
       replace(source,0,source.length(),beginChild1,CHILD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Child1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChild1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChild1,CHILD_1_LEN);
   	
   }
   
     /**
	 * 	Update Child1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChild1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild1+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Parent2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setChild1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_35498,"0".toCharArray()));
   }

		public static int getParent2FieldLength() {
			return PARENT_2_LENGTH;
		}

}
  
