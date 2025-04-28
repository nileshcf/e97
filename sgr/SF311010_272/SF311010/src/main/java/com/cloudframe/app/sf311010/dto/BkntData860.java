package com.cloudframe.app.sf311010.dto;

/**
*  The class BkntData860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BkntData860 extends BkntData860Serialized { 
   

						private char[] finNetworkCode860 = Field.fillLowValue(3);
	
	/**
	* Constructor for BkntData860
	**/
    public BkntData860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BkntData860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of finNetworkCode860
	 *	@return finNetworkCode860
	 */
   public char[] getFinNetworkCode860() throws CFException{
     if (isFinNetworkCode860Modified()) { 
        finNetworkCode860 = refreshFinNetworkCode860();
     }
   		return finNetworkCode860;
   }

  
	/**
	*  set variable finNetworkCode860
	*  Corresponding COBOL Variable is 860-FIN-NETWORK-CODE
	*  @param value
	**/
   public void setFinNetworkCode860(char[] value) {
      finNetworkCode860 = checkFinNetworkCode860Constraints(value);
      serializeFinNetworkCode860(finNetworkCode860);
   } 

     /**
	 * 	Update FinNetworkCode860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFinNetworkCode860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFinNetworkCode860,finNetworkCode860.length);
   	
   }
   
   public void setFinNetworkCode860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetworkCode860,finNetworkCode860.length);
   	
   }
   
     /**
	 * 	Update FinNetworkCode860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFinNetworkCode860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetworkCode860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FinNetworkCode860 with another Field
	 *	@param value
	 */
   public void setFinNetworkCode860(Field source) {
       replace(source,0,source.length(),beginFinNetworkCode860,FIN_NETWORK_CODE_860_LEN);
   	
   }  
   
     /**
	 * 	Update FinNetworkCode860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFinNetworkCode860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFinNetworkCode860,FIN_NETWORK_CODE_860_LEN);
   	
   }
   
     /**
	 * 	Update FinNetworkCode860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFinNetworkCode860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinNetworkCode860+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBkntData860FieldLength() {
			return BKNT_DATA_860_LENGTH;
		}

}
  
