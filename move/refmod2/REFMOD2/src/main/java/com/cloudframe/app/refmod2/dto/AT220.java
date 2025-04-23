package com.cloudframe.app.refmod2.dto;

/**
*  The class AT220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT220 extends AT220Serialized { 
   

						private char[] aTFld1220 = Field.fillLowValue(20);

						private char[] aTFld2220 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT220
	**/
    public AT220() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT220. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT220(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1220
	 *	@return aTFld1220
	 */
   public char[] getATFld1220() throws CFException{
     if (isATFld1220Modified()) { 
        aTFld1220 = refreshATFld1220();
     }
   		return aTFld1220;
   }

  
	/**
	*  set variable aTFld1220
	*  Corresponding COBOL Variable is WS-2-20A-T-FLD1
	*  @param value
	**/
   public void setATFld1220(char[] value) {
      aTFld1220 = checkATFld1220Constraints(value);
      serializeATFld1220(aTFld1220);
   } 

     /**
	 * 	Update ATFld1220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1220,aTFld1220.length);
   	
   }
   
   public void setATFld1220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1220,aTFld1220.length);
   	
   }
   
     /**
	 * 	Update ATFld1220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1220 with another Field
	 *	@param value
	 */
   public void setATFld1220(Field source) {
       replace(source,0,source.length(),beginATFld1220,A_TFLD_1220_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1220,A_TFLD_1220_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1220+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2220
	 *	@return aTFld2220
	 */
   public char[] getATFld2220() throws CFException{
     if (isATFld2220Modified()) { 
        aTFld2220 = refreshATFld2220();
     }
   		return aTFld2220;
   }

  
	/**
	*  set variable aTFld2220
	*  Corresponding COBOL Variable is WS-2-20A-T-FLD2
	*  @param value
	**/
   public void setATFld2220(char[] value) {
      aTFld2220 = checkATFld2220Constraints(value);
      serializeATFld2220(aTFld2220);
   } 

     /**
	 * 	Update ATFld2220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2220,aTFld2220.length);
   	
   }
   
   public void setATFld2220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2220,aTFld2220.length);
   	
   }
   
     /**
	 * 	Update ATFld2220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2220 with another Field
	 *	@param value
	 */
   public void setATFld2220(Field source) {
       replace(source,0,source.length(),beginATFld2220,A_TFLD_2220_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2220,A_TFLD_2220_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2220+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT220
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1220(CONSTANTS.SPACE_20);
         setATFld2220(CONSTANTS.SPACE_40);
   }

		public static int getAT220FieldLength() {
			return A_T_220_LENGTH;
		}

}
  
