package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdCloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPldRdCloseDt extends FnsPldRdCloseDtSerialized { 
   

						private char[] fnsPldRdClosedCcyy = Field.fillLowValue(4);

						private char[] fnsPldRdFiller1 = Field.fillLowValue(1);

						private char[] fnsPldRdClosedMm = Field.fillLowValue(2);

						private char[] fnsPldRdFiller2 = Field.fillLowValue(1);

						private char[] fnsPldRdClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPldRdCloseDt
	**/
    public FnsPldRdCloseDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdCloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdCloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fnsPldRdClosedCcyy
	 *	@return fnsPldRdClosedCcyy
	 */
   public char[] getFnsPldRdClosedCcyy() throws CFException{
     if (isFnsPldRdClosedCcyyModified()) { 
        fnsPldRdClosedCcyy = refreshFnsPldRdClosedCcyy();
     }
   		return fnsPldRdClosedCcyy;
   }

  
	/**
	*  set variable fnsPldRdClosedCcyy
	*  Corresponding COBOL Variable is FNS-PLD-RD-CLOSED-CCYY
	*  @param value
	**/
   public void setFnsPldRdClosedCcyy(char[] value) {
      fnsPldRdClosedCcyy = checkFnsPldRdClosedCcyyConstraints(value);
      serializeFnsPldRdClosedCcyy(fnsPldRdClosedCcyy);
   } 

     /**
	 * 	Update FnsPldRdClosedCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdClosedCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdClosedCcyy,fnsPldRdClosedCcyy.length);
   	
   }
   
   public void setFnsPldRdClosedCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedCcyy,fnsPldRdClosedCcyy.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdClosedCcyy with another Field
	 *	@param value
	 */
   public void setFnsPldRdClosedCcyy(Field source) {
       replace(source,0,source.length(),beginFnsPldRdClosedCcyy,FNS_PLD_RD_CLOSED_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdClosedCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdClosedCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedCcyy,FNS_PLD_RD_CLOSED_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedCcyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdFiller1
	 *	@return fnsPldRdFiller1
	 */
   public char[] getFnsPldRdFiller1() throws CFException{
     if (isFnsPldRdFiller1Modified()) { 
        fnsPldRdFiller1 = refreshFnsPldRdFiller1();
     }
   		return fnsPldRdFiller1;
   }

  
	/**
	*  set variable fnsPldRdFiller1
	*  Corresponding COBOL Variable is FNS-PLD-RD-FILLER1
	*  @param value
	**/
   public void setFnsPldRdFiller1(char[] value) {
      fnsPldRdFiller1 = checkFnsPldRdFiller1Constraints(value);
      serializeFnsPldRdFiller1(fnsPldRdFiller1);
   } 

     /**
	 * 	Update FnsPldRdFiller1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFiller1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdFiller1,fnsPldRdFiller1.length);
   	
   }
   
   public void setFnsPldRdFiller1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller1,fnsPldRdFiller1.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdFiller1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFiller1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdFiller1 with another Field
	 *	@param value
	 */
   public void setFnsPldRdFiller1(Field source) {
       replace(source,0,source.length(),beginFnsPldRdFiller1,FNS_PLD_RD_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdFiller1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdFiller1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller1,FNS_PLD_RD_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdFiller1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFiller1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdClosedMm
	 *	@return fnsPldRdClosedMm
	 */
   public char[] getFnsPldRdClosedMm() throws CFException{
     if (isFnsPldRdClosedMmModified()) { 
        fnsPldRdClosedMm = refreshFnsPldRdClosedMm();
     }
   		return fnsPldRdClosedMm;
   }

  
	/**
	*  set variable fnsPldRdClosedMm
	*  Corresponding COBOL Variable is FNS-PLD-RD-CLOSED-MM
	*  @param value
	**/
   public void setFnsPldRdClosedMm(char[] value) {
      fnsPldRdClosedMm = checkFnsPldRdClosedMmConstraints(value);
      serializeFnsPldRdClosedMm(fnsPldRdClosedMm);
   } 

     /**
	 * 	Update FnsPldRdClosedMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdClosedMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdClosedMm,fnsPldRdClosedMm.length);
   	
   }
   
   public void setFnsPldRdClosedMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedMm,fnsPldRdClosedMm.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdClosedMm with another Field
	 *	@param value
	 */
   public void setFnsPldRdClosedMm(Field source) {
       replace(source,0,source.length(),beginFnsPldRdClosedMm,FNS_PLD_RD_CLOSED_MM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdClosedMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdClosedMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedMm,FNS_PLD_RD_CLOSED_MM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdFiller2
	 *	@return fnsPldRdFiller2
	 */
   public char[] getFnsPldRdFiller2() throws CFException{
     if (isFnsPldRdFiller2Modified()) { 
        fnsPldRdFiller2 = refreshFnsPldRdFiller2();
     }
   		return fnsPldRdFiller2;
   }

  
	/**
	*  set variable fnsPldRdFiller2
	*  Corresponding COBOL Variable is FNS-PLD-RD-FILLER2
	*  @param value
	**/
   public void setFnsPldRdFiller2(char[] value) {
      fnsPldRdFiller2 = checkFnsPldRdFiller2Constraints(value);
      serializeFnsPldRdFiller2(fnsPldRdFiller2);
   } 

     /**
	 * 	Update FnsPldRdFiller2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFiller2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdFiller2,fnsPldRdFiller2.length);
   	
   }
   
   public void setFnsPldRdFiller2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller2,fnsPldRdFiller2.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdFiller2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFiller2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdFiller2 with another Field
	 *	@param value
	 */
   public void setFnsPldRdFiller2(Field source) {
       replace(source,0,source.length(),beginFnsPldRdFiller2,FNS_PLD_RD_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdFiller2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdFiller2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller2,FNS_PLD_RD_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdFiller2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFiller2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFiller2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdClosedDd
	 *	@return fnsPldRdClosedDd
	 */
   public char[] getFnsPldRdClosedDd() throws CFException{
     if (isFnsPldRdClosedDdModified()) { 
        fnsPldRdClosedDd = refreshFnsPldRdClosedDd();
     }
   		return fnsPldRdClosedDd;
   }

  
	/**
	*  set variable fnsPldRdClosedDd
	*  Corresponding COBOL Variable is FNS-PLD-RD-CLOSED-DD
	*  @param value
	**/
   public void setFnsPldRdClosedDd(char[] value) {
      fnsPldRdClosedDd = checkFnsPldRdClosedDdConstraints(value);
      serializeFnsPldRdClosedDd(fnsPldRdClosedDd);
   } 

     /**
	 * 	Update FnsPldRdClosedDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdClosedDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdClosedDd,fnsPldRdClosedDd.length);
   	
   }
   
   public void setFnsPldRdClosedDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedDd,fnsPldRdClosedDd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdClosedDd with another Field
	 *	@param value
	 */
   public void setFnsPldRdClosedDd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdClosedDd,FNS_PLD_RD_CLOSED_DD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdClosedDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdClosedDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedDd,FNS_PLD_RD_CLOSED_DD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdClosedDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdClosedDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdClosedDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPldRdCloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdClosedCcyy(CONSTANTS.SPACE_4);
         setFnsPldRdFiller1(CONSTANTS.SPACE);
         setFnsPldRdClosedMm(CONSTANTS.SPACE_2);
         setFnsPldRdFiller2(CONSTANTS.SPACE);
         setFnsPldRdClosedDd(CONSTANTS.SPACE_2);
   }

		public static int getFnsPldRdCloseDtFieldLength() {
			return FNS_PLD_RD_CLOSE_DT_LENGTH;
		}

}
  
