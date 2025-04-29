package com.cloudframe.app.sf305120.dto;

/**
*  The class RhInt16810Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RhInt16810Redefined extends RhInt16810RedefinedSerialized { 
   

						private char[] rhInt8810 = Field.fillLowValue(1);
	
	/**
	* Constructor for RhInt16810Redefined
	**/
    public RhInt16810Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RhInt16810Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RhInt16810Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rhInt8810
	 *	@return rhInt8810
	 */
   public char[] getRhInt8810() throws CFException{
     if (isRhInt8810Modified()) { 
        rhInt8810 = refreshRhInt8810();
     }
   		return rhInt8810;
   }

  
	/**
	*  set variable rhInt8810
	*  Corresponding COBOL Variable is 810-RH-INT8
	*  @param value
	**/
   public void setRhInt8810(char[] value) {
      rhInt8810 = checkRhInt8810Constraints(value);
      serializeRhInt8810(rhInt8810);
   } 

     /**
	 * 	Update RhInt8810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhInt8810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhInt8810,rhInt8810.length);
   	
   }
   
   public void setRhInt8810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhInt8810,rhInt8810.length);
   	
   }
   
     /**
	 * 	Update RhInt8810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhInt8810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhInt8810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhInt8810 with another Field
	 *	@param value
	 */
   public void setRhInt8810(Field source) {
       replace(source,0,source.length(),beginRhInt8810,RH_INT_8810_LEN);
   	
   }  
   
     /**
	 * 	Update RhInt8810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhInt8810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhInt8810,RH_INT_8810_LEN);
   	
   }
   
     /**
	 * 	Update RhInt8810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhInt8810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhInt8810+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRhInt16810RedefinedFieldLength() {
			return RH_INT_16810_REDEFINED_LENGTH;
		}

}
  
