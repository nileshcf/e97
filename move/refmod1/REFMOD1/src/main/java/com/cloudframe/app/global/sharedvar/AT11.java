package com.cloudframe.app.global.sharedvar;

/**
*  The class AT11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT11 extends AT11Serialized { 
   

						private char[] aTFld111 = Field.fillLowValue(20);

						private char[] aTFld211 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT11
	**/
    public AT11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld111
	 *	@return aTFld111
	 */
   public char[] getATFld111() throws CFException{
     if (isATFld111Modified()) { 
        aTFld111 = refreshATFld111();
     }
   		return aTFld111;
   }

  
	/**
	*  set variable aTFld111
	*  Corresponding COBOL Variable is WS-11A-T-FLD1
	*  @param value
	**/
   public void setATFld111(char[] value) {
      aTFld111 = checkATFld111Constraints(value);
      serializeATFld111(aTFld111);
   } 

     /**
	 * 	Update ATFld111 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld111(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld111,aTFld111.length);
   	
   }
   
   public void setATFld111(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld111,aTFld111.length);
   	
   }
   
     /**
	 * 	Update ATFld111 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld111(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld111+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld111 with another Field
	 *	@param value
	 */
   public void setATFld111(Field source) {
       replace(source,0,source.length(),beginATFld111,A_TFLD_111_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld111 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld111(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld111,A_TFLD_111_LEN);
   	
   }
   
     /**
	 * 	Update ATFld111 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld111(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld111+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld211
	 *	@return aTFld211
	 */
   public char[] getATFld211() throws CFException{
     if (isATFld211Modified()) { 
        aTFld211 = refreshATFld211();
     }
   		return aTFld211;
   }

  
	/**
	*  set variable aTFld211
	*  Corresponding COBOL Variable is WS-11A-T-FLD2
	*  @param value
	**/
   public void setATFld211(char[] value) {
      aTFld211 = checkATFld211Constraints(value);
      serializeATFld211(aTFld211);
   } 

     /**
	 * 	Update ATFld211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld211,aTFld211.length);
   	
   }
   
   public void setATFld211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld211,aTFld211.length);
   	
   }
   
     /**
	 * 	Update ATFld211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld211 with another Field
	 *	@param value
	 */
   public void setATFld211(Field source) {
       replace(source,0,source.length(),beginATFld211,A_TFLD_211_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld211,A_TFLD_211_LEN);
   	
   }
   
     /**
	 * 	Update ATFld211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld111(CONSTANTS.SPACE_20);
         setATFld211(CONSTANTS.SPACE_40);
   }

		public static int getAT11FieldLength() {
			return A_T_11_LENGTH;
		}

}
  
