package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPldRdExprYear extends FnsPldRdExprYearSerialized { 
   

						private char[] fnsPldRdExprCc = Field.fillLowValue(2);

						private char[] fnsPldRdExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPldRdExprYear
	**/
    public FnsPldRdExprYear() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fnsPldRdExprCc
	 *	@return fnsPldRdExprCc
	 */
   public char[] getFnsPldRdExprCc() throws CFException{
     if (isFnsPldRdExprCcModified()) { 
        fnsPldRdExprCc = refreshFnsPldRdExprCc();
     }
   		return fnsPldRdExprCc;
   }

  
	/**
	*  set variable fnsPldRdExprCc
	*  Corresponding COBOL Variable is FNS-PLD-RD-EXPR-CC
	*  @param value
	**/
   public void setFnsPldRdExprCc(char[] value) {
      fnsPldRdExprCc = checkFnsPldRdExprCcConstraints(value);
      serializeFnsPldRdExprCc(fnsPldRdExprCc);
   } 

     /**
	 * 	Update FnsPldRdExprCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExprCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdExprCc,fnsPldRdExprCc.length);
   	
   }
   
   public void setFnsPldRdExprCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprCc,fnsPldRdExprCc.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdExprCc with another Field
	 *	@param value
	 */
   public void setFnsPldRdExprCc(Field source) {
       replace(source,0,source.length(),beginFnsPldRdExprCc,FNS_PLD_RD_EXPR_CC_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdExprCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdExprCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdExprCc,FNS_PLD_RD_EXPR_CC_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdExprYy
	 *	@return fnsPldRdExprYy
	 */
   public char[] getFnsPldRdExprYy() throws CFException{
     if (isFnsPldRdExprYyModified()) { 
        fnsPldRdExprYy = refreshFnsPldRdExprYy();
     }
   		return fnsPldRdExprYy;
   }

  
	/**
	*  set variable fnsPldRdExprYy
	*  Corresponding COBOL Variable is FNS-PLD-RD-EXPR-YY
	*  @param value
	**/
   public void setFnsPldRdExprYy(char[] value) {
      fnsPldRdExprYy = checkFnsPldRdExprYyConstraints(value);
      serializeFnsPldRdExprYy(fnsPldRdExprYy);
   } 

     /**
	 * 	Update FnsPldRdExprYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExprYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdExprYy,fnsPldRdExprYy.length);
   	
   }
   
   public void setFnsPldRdExprYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprYy,fnsPldRdExprYy.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdExprYy with another Field
	 *	@param value
	 */
   public void setFnsPldRdExprYy(Field source) {
       replace(source,0,source.length(),beginFnsPldRdExprYy,FNS_PLD_RD_EXPR_YY_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdExprYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdExprYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdExprYy,FNS_PLD_RD_EXPR_YY_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPldRdExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdExprCc(CONSTANTS.SPACE_2);
         setFnsPldRdExprYy(CONSTANTS.SPACE_2);
   }

		public static int getFnsPldRdExprYearFieldLength() {
			return FNS_PLD_RD_EXPR_YEAR_LENGTH;
		}

}
  
