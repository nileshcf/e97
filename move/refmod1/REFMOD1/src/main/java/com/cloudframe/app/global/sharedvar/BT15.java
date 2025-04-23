package com.cloudframe.app.global.sharedvar;

/**
*  The class BT15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT15 extends BT15Serialized { 
   

						private char[] bTFld115 = Field.fillLowValue(20);

						private char[] bTFld215 = Field.fillLowValue(40);

						private char[] bTFld315 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT15
	**/
    public BT15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld115
	 *	@return bTFld115
	 */
   public char[] getBTFld115() throws CFException{
     if (isBTFld115Modified()) { 
        bTFld115 = refreshBTFld115();
     }
   		return bTFld115;
   }

  
	/**
	*  set variable bTFld115
	*  Corresponding COBOL Variable is WS-15B-T-FLD1
	*  @param value
	**/
   public void setBTFld115(char[] value) {
      bTFld115 = checkBTFld115Constraints(value);
      serializeBTFld115(bTFld115);
   } 

     /**
	 * 	Update BTFld115 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld115(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld115,bTFld115.length);
   	
   }
   
   public void setBTFld115(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld115,bTFld115.length);
   	
   }
   
     /**
	 * 	Update BTFld115 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld115(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld115+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld115 with another Field
	 *	@param value
	 */
   public void setBTFld115(Field source) {
       replace(source,0,source.length(),beginBTFld115,B_TFLD_115_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld115 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld115(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld115,B_TFLD_115_LEN);
   	
   }
   
     /**
	 * 	Update BTFld115 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld115(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld115+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld215
	 *	@return bTFld215
	 */
   public char[] getBTFld215() throws CFException{
     if (isBTFld215Modified()) { 
        bTFld215 = refreshBTFld215();
     }
   		return bTFld215;
   }

  
	/**
	*  set variable bTFld215
	*  Corresponding COBOL Variable is WS-15B-T-FLD2
	*  @param value
	**/
   public void setBTFld215(char[] value) {
      bTFld215 = checkBTFld215Constraints(value);
      serializeBTFld215(bTFld215);
   } 

     /**
	 * 	Update BTFld215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld215,bTFld215.length);
   	
   }
   
   public void setBTFld215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld215,bTFld215.length);
   	
   }
   
     /**
	 * 	Update BTFld215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld215 with another Field
	 *	@param value
	 */
   public void setBTFld215(Field source) {
       replace(source,0,source.length(),beginBTFld215,B_TFLD_215_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld215,B_TFLD_215_LEN);
   	
   }
   
     /**
	 * 	Update BTFld215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld315
	 *	@return bTFld315
	 */
   public char[] getBTFld315() throws CFException{
     if (isBTFld315Modified()) { 
        bTFld315 = refreshBTFld315();
     }
   		return bTFld315;
   }

  
	/**
	*  set variable bTFld315
	*  Corresponding COBOL Variable is WS-15B-T-FLD3
	*  @param value
	**/
   public void setBTFld315(char[] value) {
      bTFld315 = checkBTFld315Constraints(value);
      serializeBTFld315(bTFld315);
   } 

     /**
	 * 	Update BTFld315 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld315(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld315,bTFld315.length);
   	
   }
   
   public void setBTFld315(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld315,bTFld315.length);
   	
   }
   
     /**
	 * 	Update BTFld315 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld315(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld315+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld315 with another Field
	 *	@param value
	 */
   public void setBTFld315(Field source) {
       replace(source,0,source.length(),beginBTFld315,B_TFLD_315_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld315 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld315(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld315,B_TFLD_315_LEN);
   	
   }
   
     /**
	 * 	Update BTFld315 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld315(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld315+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld115(CONSTANTS.SPACE_20);
         setBTFld215(CONSTANTS.SPACE_40);
         setBTFld315(CONSTANTS.SPACE_30);
   }

		public static int getBT15FieldLength() {
			return B_T_15_LENGTH;
		}

}
  
