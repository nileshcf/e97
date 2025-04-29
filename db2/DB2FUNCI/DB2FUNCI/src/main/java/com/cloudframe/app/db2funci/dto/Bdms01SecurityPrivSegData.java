package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01SecurityPrivSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01SecurityPrivSegData extends Bdms01SecurityPrivSegDataSerialized { 
   

						private char[] bdms01PrivateSecInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01SecurityPrivSegData
	**/
    public Bdms01SecurityPrivSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SecurityPrivSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityPrivSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01PrivateSecInd
	 *	@return bdms01PrivateSecInd
	 */
   public char[] getBdms01PrivateSecInd() throws CFException{
     if (isBdms01PrivateSecIndModified()) { 
        bdms01PrivateSecInd = refreshBdms01PrivateSecInd();
     }
   		return bdms01PrivateSecInd;
   }

  
	/**
	*  set variable bdms01PrivateSecInd
	*  Corresponding COBOL Variable is BDMS01-PRIVATE-SEC-IND
	*  @param value
	**/
   public void setBdms01PrivateSecInd(char[] value) {
      bdms01PrivateSecInd = checkBdms01PrivateSecIndConstraints(value);
      serializeBdms01PrivateSecInd(bdms01PrivateSecInd);
   } 

     /**
	 * 	Update Bdms01PrivateSecInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrivateSecInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrivateSecInd,bdms01PrivateSecInd.length);
   	
   }
   
   public void setBdms01PrivateSecInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrivateSecInd,bdms01PrivateSecInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrivateSecInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrivateSecInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrivateSecInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrivateSecInd with another Field
	 *	@param value
	 */
   public void setBdms01PrivateSecInd(Field source) {
       replace(source,0,source.length(),beginBdms01PrivateSecInd,BDMS_01_PRIVATE_SEC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrivateSecInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrivateSecInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrivateSecInd,BDMS_01_PRIVATE_SEC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrivateSecInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrivateSecInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrivateSecInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01SecurityPrivSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01PrivateSecInd(CONSTANTS.SPACE);
   }

		public static int getBdms01SecurityPrivSegDataFieldLength() {
			return BDMS_01_SECURITY_PRIV_SEG_DATA_LENGTH;
		}

}
  
