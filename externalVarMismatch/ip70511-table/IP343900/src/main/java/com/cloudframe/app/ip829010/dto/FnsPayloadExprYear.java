package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayloadExprYear extends FnsPayloadExprYearSerialized { 
   

						private char[] fnsPayloadExprCc = Field.fillLowValue(2);

						private char[] fnsPayloadExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPayloadExprYear
	**/
    public FnsPayloadExprYear() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fnsPayloadExprCc
	 *	@return fnsPayloadExprCc
	 */
   public char[] getFnsPayloadExprCc() throws CFException{
     if (isFnsPayloadExprCcModified()) { 
        fnsPayloadExprCc = refreshFnsPayloadExprCc();
     }
   		return fnsPayloadExprCc;
   }

  
	/**
	*  set variable fnsPayloadExprCc
	*  Corresponding COBOL Variable is FNS-PAYLOAD-EXPR-CC
	*  @param value
	**/
   public void setFnsPayloadExprCc(char[] value) {
      fnsPayloadExprCc = checkFnsPayloadExprCcConstraints(value);
      serializeFnsPayloadExprCc(fnsPayloadExprCc);
   } 

     /**
	 * 	Update FnsPayloadExprCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExprCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadExprCc,fnsPayloadExprCc.length);
   	
   }
   
   public void setFnsPayloadExprCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprCc,fnsPayloadExprCc.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadExprCc with another Field
	 *	@param value
	 */
   public void setFnsPayloadExprCc(Field source) {
       replace(source,0,source.length(),beginFnsPayloadExprCc,FNS_PAYLOAD_EXPR_CC_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadExprCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadExprCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadExprCc,FNS_PAYLOAD_EXPR_CC_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadExprYy
	 *	@return fnsPayloadExprYy
	 */
   public char[] getFnsPayloadExprYy() throws CFException{
     if (isFnsPayloadExprYyModified()) { 
        fnsPayloadExprYy = refreshFnsPayloadExprYy();
     }
   		return fnsPayloadExprYy;
   }

  
	/**
	*  set variable fnsPayloadExprYy
	*  Corresponding COBOL Variable is FNS-PAYLOAD-EXPR-YY
	*  @param value
	**/
   public void setFnsPayloadExprYy(char[] value) {
      fnsPayloadExprYy = checkFnsPayloadExprYyConstraints(value);
      serializeFnsPayloadExprYy(fnsPayloadExprYy);
   } 

     /**
	 * 	Update FnsPayloadExprYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExprYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadExprYy,fnsPayloadExprYy.length);
   	
   }
   
   public void setFnsPayloadExprYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprYy,fnsPayloadExprYy.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadExprYy with another Field
	 *	@param value
	 */
   public void setFnsPayloadExprYy(Field source) {
       replace(source,0,source.length(),beginFnsPayloadExprYy,FNS_PAYLOAD_EXPR_YY_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadExprYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadExprYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadExprYy,FNS_PAYLOAD_EXPR_YY_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPayloadExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadExprCc(CONSTANTS.SPACE_2);
         setFnsPayloadExprYy(CONSTANTS.SPACE_2);
   }

		public static int getFnsPayloadExprYearFieldLength() {
			return FNS_PAYLOAD_EXPR_YEAR_LENGTH;
		}

}
  
