package com.cloudframe.app.dispif.dto;

/**
*  The class IntX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IntX extends IntXSerialized { 
   

						private char[] intX2 = Field.fillLowValue(2);
	
	/**
	* Constructor for IntX
	**/
    public IntX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IntX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IntX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of intX2
	 *	@return intX2
	 */
   public char[] getIntX2() throws CFException{
     if (isIntX2Modified()) { 
        intX2 = refreshIntX2();
     }
   		return intX2;
   }

  
	/**
	*  set variable intX2
	*  Corresponding COBOL Variable is WS-INT-X2
	*  @param value
	**/
   public void setIntX2(char[] value) {
      intX2 = checkIntX2Constraints(value);
      serializeIntX2(intX2);
   } 

     /**
	 * 	Update IntX2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntX2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIntX2,intX2.length);
   	
   }
   
   public void setIntX2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIntX2,intX2.length);
   	
   }
   
     /**
	 * 	Update IntX2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntX2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntX2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IntX2 with another Field
	 *	@param value
	 */
   public void setIntX2(Field source) {
       replace(source,0,source.length(),beginIntX2,INT_X_2_LEN);
   	
   }  
   
     /**
	 * 	Update IntX2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntX2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIntX2,INT_X_2_LEN);
   	
   }
   
     /**
	 * 	Update IntX2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntX2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntX2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIntXFieldLength() {
			return INT_X_LENGTH;
		}

}
  
