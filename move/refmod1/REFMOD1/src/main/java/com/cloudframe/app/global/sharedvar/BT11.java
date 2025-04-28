package com.cloudframe.app.global.sharedvar;

/**
*  The class BT11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT11 extends BT11Serialized { 
   

						private char[] bTFld111 = Field.fillLowValue(20);

						private char[] bTFld211 = Field.fillLowValue(40);

						private char[] bTFld311 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT11
	**/
    public BT11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld111
	 *	@return bTFld111
	 */
   public char[] getBTFld111() throws CFException{
     if (isBTFld111Modified()) { 
        bTFld111 = refreshBTFld111();
     }
   		return bTFld111;
   }

  
	/**
	*  set variable bTFld111
	*  Corresponding COBOL Variable is WS-11B-T-FLD1
	*  @param value
	**/
   public void setBTFld111(char[] value) {
      bTFld111 = checkBTFld111Constraints(value);
      serializeBTFld111(bTFld111);
   } 

     /**
	 * 	Update BTFld111 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld111(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld111,bTFld111.length);
   	
   }
   
   public void setBTFld111(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld111,bTFld111.length);
   	
   }
   
     /**
	 * 	Update BTFld111 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld111(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld111+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld111 with another Field
	 *	@param value
	 */
   public void setBTFld111(Field source) {
       replace(source,0,source.length(),beginBTFld111,B_TFLD_111_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld111 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld111(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld111,B_TFLD_111_LEN);
   	
   }
   
     /**
	 * 	Update BTFld111 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld111(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld111+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld211
	 *	@return bTFld211
	 */
   public char[] getBTFld211() throws CFException{
     if (isBTFld211Modified()) { 
        bTFld211 = refreshBTFld211();
     }
   		return bTFld211;
   }

  
	/**
	*  set variable bTFld211
	*  Corresponding COBOL Variable is WS-11B-T-FLD2
	*  @param value
	**/
   public void setBTFld211(char[] value) {
      bTFld211 = checkBTFld211Constraints(value);
      serializeBTFld211(bTFld211);
   } 

     /**
	 * 	Update BTFld211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld211,bTFld211.length);
   	
   }
   
   public void setBTFld211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld211,bTFld211.length);
   	
   }
   
     /**
	 * 	Update BTFld211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld211 with another Field
	 *	@param value
	 */
   public void setBTFld211(Field source) {
       replace(source,0,source.length(),beginBTFld211,B_TFLD_211_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld211,B_TFLD_211_LEN);
   	
   }
   
     /**
	 * 	Update BTFld211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld311
	 *	@return bTFld311
	 */
   public char[] getBTFld311() throws CFException{
     if (isBTFld311Modified()) { 
        bTFld311 = refreshBTFld311();
     }
   		return bTFld311;
   }

  
	/**
	*  set variable bTFld311
	*  Corresponding COBOL Variable is WS-11B-T-FLD3
	*  @param value
	**/
   public void setBTFld311(char[] value) {
      bTFld311 = checkBTFld311Constraints(value);
      serializeBTFld311(bTFld311);
   } 

     /**
	 * 	Update BTFld311 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld311(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld311,bTFld311.length);
   	
   }
   
   public void setBTFld311(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld311,bTFld311.length);
   	
   }
   
     /**
	 * 	Update BTFld311 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld311(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld311+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld311 with another Field
	 *	@param value
	 */
   public void setBTFld311(Field source) {
       replace(source,0,source.length(),beginBTFld311,B_TFLD_311_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld311 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld311(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld311,B_TFLD_311_LEN);
   	
   }
   
     /**
	 * 	Update BTFld311 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld311(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld311+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld111(CONSTANTS.SPACE_20);
         setBTFld211(CONSTANTS.SPACE_40);
         setBTFld311(CONSTANTS.SPACE_30);
   }

		public static int getBT11FieldLength() {
			return B_T_11_LENGTH;
		}

}
  
