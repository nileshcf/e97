package com.cloudframe.app.sf311010.dto;

/**
*  The class BkntData110860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BkntData110860 extends BkntData110860Serialized { 
   

						private char[] finNetwork110860 = Field.fillLowValue(3);
	
	/**
	* Constructor for BkntData110860
	**/
    public BkntData110860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BkntData110860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData110860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of finNetwork110860
	 *	@return finNetwork110860
	 */
   public char[] getFinNetwork110860() throws CFException{
     if (isFinNetwork110860Modified()) { 
        finNetwork110860 = refreshFinNetwork110860();
     }
   		return finNetwork110860;
   }

  
	/**
	*  set variable finNetwork110860
	*  Corresponding COBOL Variable is 860-FIN-NETWORK-110
	*  @param value
	**/
   public void setFinNetwork110860(char[] value) {
      finNetwork110860 = checkFinNetwork110860Constraints(value);
      serializeFinNetwork110860(finNetwork110860);
   } 

     /**
	 * 	Update FinNetwork110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFinNetwork110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFinNetwork110860,finNetwork110860.length);
   	
   }
   
   public void setFinNetwork110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetwork110860,finNetwork110860.length);
   	
   }
   
     /**
	 * 	Update FinNetwork110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFinNetwork110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetwork110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FinNetwork110860 with another Field
	 *	@param value
	 */
   public void setFinNetwork110860(Field source) {
       replace(source,0,source.length(),beginFinNetwork110860,FIN_NETWORK_110860_LEN);
   	
   }  
   
     /**
	 * 	Update FinNetwork110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFinNetwork110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFinNetwork110860,FIN_NETWORK_110860_LEN);
   	
   }
   
     /**
	 * 	Update FinNetwork110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFinNetwork110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetwork110860+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBkntData110860FieldLength() {
			return BKNT_DATA_110860_LENGTH;
		}

}
  
