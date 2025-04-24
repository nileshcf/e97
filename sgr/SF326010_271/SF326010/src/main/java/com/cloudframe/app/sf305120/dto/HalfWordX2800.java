package com.cloudframe.app.sf305120.dto;

/**
*  The class HalfWordX2800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HalfWordX2800 extends HalfWordX2800Serialized { 
   

						private char[] loByte800 = Field.fillLowValue(1);
	
	/**
	* Constructor for HalfWordX2800
	**/
    public HalfWordX2800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HalfWordX2800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HalfWordX2800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of loByte800
	 *	@return loByte800
	 */
   public char[] getLoByte800() throws CFException{
     if (isLoByte800Modified()) { 
        loByte800 = refreshLoByte800();
     }
   		return loByte800;
   }

  
	/**
	*  set variable loByte800
	*  Corresponding COBOL Variable is 800-LO-BYTE
	*  @param value
	**/
   public void setLoByte800(char[] value) {
      loByte800 = checkLoByte800Constraints(value);
      serializeLoByte800(loByte800);
   } 

     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLoByte800,loByte800.length);
   	
   }
   
   public void setLoByte800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLoByte800,loByte800.length);
   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLoByte800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LoByte800 with another Field
	 *	@param value
	 */
   public void setLoByte800(Field source) {
       replace(source,0,source.length(),beginLoByte800,LO_BYTE_800_LEN);
   	
   }  
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLoByte800,LO_BYTE_800_LEN);
   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLoByte800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHalfWordX2800FieldLength() {
			return HALF_WORD_X_2800_LENGTH;
		}

}
  
