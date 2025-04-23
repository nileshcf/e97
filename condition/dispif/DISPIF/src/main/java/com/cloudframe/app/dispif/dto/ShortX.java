package com.cloudframe.app.dispif.dto;

/**
*  The class ShortX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ShortX extends ShortXSerialized { 
   

						private char[] shortX2 = Field.fillLowValue(1);
	
	/**
	* Constructor for ShortX
	**/
    public ShortX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ShortX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ShortX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of shortX2
	 *	@return shortX2
	 */
   public char[] getShortX2() throws CFException{
     if (isShortX2Modified()) { 
        shortX2 = refreshShortX2();
     }
   		return shortX2;
   }

  
	/**
	*  set variable shortX2
	*  Corresponding COBOL Variable is WS-SHORT-X2
	*  @param value
	**/
   public void setShortX2(char[] value) {
      shortX2 = checkShortX2Constraints(value);
      serializeShortX2(shortX2);
   } 

     /**
	 * 	Update ShortX2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setShortX2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginShortX2,shortX2.length);
   	
   }
   
   public void setShortX2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginShortX2,shortX2.length);
   	
   }
   
     /**
	 * 	Update ShortX2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setShortX2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginShortX2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ShortX2 with another Field
	 *	@param value
	 */
   public void setShortX2(Field source) {
       replace(source,0,source.length(),beginShortX2,SHORT_X_2_LEN);
   	
   }  
   
     /**
	 * 	Update ShortX2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setShortX2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginShortX2,SHORT_X_2_LEN);
   	
   }
   
     /**
	 * 	Update ShortX2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setShortX2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginShortX2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getShortXFieldLength() {
			return SHORT_X_LENGTH;
		}

}
  
