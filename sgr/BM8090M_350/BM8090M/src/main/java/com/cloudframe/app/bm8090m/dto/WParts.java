package com.cloudframe.app.bm8090m.dto;

/**
*  The class WParts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WParts extends WPartsSerialized { 
   

						private char[] wPart2 = Field.fillLowValue(6);
	
	/**
	* Constructor for WParts
	**/
    public WParts() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WParts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WParts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wPart2
	 *	@return wPart2
	 */
   public char[] getWPart2() throws CFException{
     if (isWPart2Modified()) { 
        wPart2 = refreshWPart2();
     }
   		return wPart2;
   }

  
	/**
	*  set variable wPart2
	*  Corresponding COBOL Variable is W-PART2
	*  @param value
	**/
   public void setWPart2(char[] value) {
      wPart2 = checkWPart2Constraints(value);
      serializeWPart2(wPart2);
   } 

     /**
	 * 	Update WPart2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPart2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPart2,wPart2.length);
   	
   }
   
   public void setWPart2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPart2,wPart2.length);
   	
   }
   
     /**
	 * 	Update WPart2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPart2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPart2 with another Field
	 *	@param value
	 */
   public void setWPart2(Field source) {
       replace(source,0,source.length(),beginWPart2,W_PART_2_LEN);
   	
   }  
   
     /**
	 * 	Update WPart2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPart2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPart2,W_PART_2_LEN);
   	
   }
   
     /**
	 * 	Update WPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPart2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWPartsFieldLength() {
			return W_PARTS_LENGTH;
		}

}
  
