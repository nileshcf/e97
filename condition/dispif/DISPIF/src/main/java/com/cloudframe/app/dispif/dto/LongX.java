package com.cloudframe.app.dispif.dto;

/**
*  The class LongX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LongX extends LongXSerialized { 
   

						private char[] longX2 = Field.fillLowValue(4);
	
	/**
	* Constructor for LongX
	**/
    public LongX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LongX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LongX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of longX2
	 *	@return longX2
	 */
   public char[] getLongX2() throws CFException{
     if (isLongX2Modified()) { 
        longX2 = refreshLongX2();
     }
   		return longX2;
   }

  
	/**
	*  set variable longX2
	*  Corresponding COBOL Variable is WS-LONG-X2
	*  @param value
	**/
   public void setLongX2(char[] value) {
      longX2 = checkLongX2Constraints(value);
      serializeLongX2(longX2);
   } 

     /**
	 * 	Update LongX2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLongX2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLongX2,longX2.length);
   	
   }
   
   public void setLongX2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLongX2,longX2.length);
   	
   }
   
     /**
	 * 	Update LongX2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLongX2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLongX2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LongX2 with another Field
	 *	@param value
	 */
   public void setLongX2(Field source) {
       replace(source,0,source.length(),beginLongX2,LONG_X_2_LEN);
   	
   }  
   
     /**
	 * 	Update LongX2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLongX2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLongX2,LONG_X_2_LEN);
   	
   }
   
     /**
	 * 	Update LongX2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLongX2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLongX2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLongXFieldLength() {
			return LONG_X_LENGTH;
		}

}
  
