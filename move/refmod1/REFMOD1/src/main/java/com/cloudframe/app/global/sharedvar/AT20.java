package com.cloudframe.app.global.sharedvar;

/**
*  The class AT20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT20 extends AT20Serialized { 
   

						private char[] aTFld120 = Field.fillLowValue(20);

						private char[] aTFld220 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT20
	**/
    public AT20() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld120
	 *	@return aTFld120
	 */
   public char[] getATFld120() throws CFException{
     if (isATFld120Modified()) { 
        aTFld120 = refreshATFld120();
     }
   		return aTFld120;
   }

  
	/**
	*  set variable aTFld120
	*  Corresponding COBOL Variable is WS-20A-T-FLD1
	*  @param value
	**/
   public void setATFld120(char[] value) {
      aTFld120 = checkATFld120Constraints(value);
      serializeATFld120(aTFld120);
   } 

     /**
	 * 	Update ATFld120 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld120(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld120,aTFld120.length);
   	
   }
   
   public void setATFld120(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld120,aTFld120.length);
   	
   }
   
     /**
	 * 	Update ATFld120 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld120(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld120+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld120 with another Field
	 *	@param value
	 */
   public void setATFld120(Field source) {
       replace(source,0,source.length(),beginATFld120,A_TFLD_120_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld120 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld120(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld120,A_TFLD_120_LEN);
   	
   }
   
     /**
	 * 	Update ATFld120 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld120(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld120+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld220
	 *	@return aTFld220
	 */
   public char[] getATFld220() throws CFException{
     if (isATFld220Modified()) { 
        aTFld220 = refreshATFld220();
     }
   		return aTFld220;
   }

  
	/**
	*  set variable aTFld220
	*  Corresponding COBOL Variable is WS-20A-T-FLD2
	*  @param value
	**/
   public void setATFld220(char[] value) {
      aTFld220 = checkATFld220Constraints(value);
      serializeATFld220(aTFld220);
   } 

     /**
	 * 	Update ATFld220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld220,aTFld220.length);
   	
   }
   
   public void setATFld220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld220,aTFld220.length);
   	
   }
   
     /**
	 * 	Update ATFld220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld220 with another Field
	 *	@param value
	 */
   public void setATFld220(Field source) {
       replace(source,0,source.length(),beginATFld220,A_TFLD_220_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld220,A_TFLD_220_LEN);
   	
   }
   
     /**
	 * 	Update ATFld220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld220+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld120(CONSTANTS.SPACE_20);
         setATFld220(CONSTANTS.SPACE_40);
   }

		public static int getAT20FieldLength() {
			return A_T_20_LENGTH;
		}

}
  
