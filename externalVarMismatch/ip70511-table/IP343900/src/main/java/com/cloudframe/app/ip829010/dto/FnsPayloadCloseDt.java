package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadCloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayloadCloseDt extends FnsPayloadCloseDtSerialized { 
   

						private char[] fnsPayloadClosedCcyy = Field.fillLowValue(4);

						private char[] fnsPayloadFiller1 = Field.fillLowValue(1);

						private char[] fnsPayloadClosedMm = Field.fillLowValue(2);

						private char[] fnsPayloadFiller2 = Field.fillLowValue(1);

						private char[] fnsPayloadClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPayloadCloseDt
	**/
    public FnsPayloadCloseDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadCloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadCloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fnsPayloadClosedCcyy
	 *	@return fnsPayloadClosedCcyy
	 */
   public char[] getFnsPayloadClosedCcyy() throws CFException{
     if (isFnsPayloadClosedCcyyModified()) { 
        fnsPayloadClosedCcyy = refreshFnsPayloadClosedCcyy();
     }
   		return fnsPayloadClosedCcyy;
   }

  
	/**
	*  set variable fnsPayloadClosedCcyy
	*  Corresponding COBOL Variable is FNS-PAYLOAD-CLOSED-CCYY
	*  @param value
	**/
   public void setFnsPayloadClosedCcyy(char[] value) {
      fnsPayloadClosedCcyy = checkFnsPayloadClosedCcyyConstraints(value);
      serializeFnsPayloadClosedCcyy(fnsPayloadClosedCcyy);
   } 

     /**
	 * 	Update FnsPayloadClosedCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadClosedCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadClosedCcyy,fnsPayloadClosedCcyy.length);
   	
   }
   
   public void setFnsPayloadClosedCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedCcyy,fnsPayloadClosedCcyy.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadClosedCcyy with another Field
	 *	@param value
	 */
   public void setFnsPayloadClosedCcyy(Field source) {
       replace(source,0,source.length(),beginFnsPayloadClosedCcyy,FNS_PAYLOAD_CLOSED_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadClosedCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadClosedCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedCcyy,FNS_PAYLOAD_CLOSED_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedCcyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadFiller1
	 *	@return fnsPayloadFiller1
	 */
   public char[] getFnsPayloadFiller1() throws CFException{
     if (isFnsPayloadFiller1Modified()) { 
        fnsPayloadFiller1 = refreshFnsPayloadFiller1();
     }
   		return fnsPayloadFiller1;
   }

  
	/**
	*  set variable fnsPayloadFiller1
	*  Corresponding COBOL Variable is FNS-PAYLOAD-FILLER1
	*  @param value
	**/
   public void setFnsPayloadFiller1(char[] value) {
      fnsPayloadFiller1 = checkFnsPayloadFiller1Constraints(value);
      serializeFnsPayloadFiller1(fnsPayloadFiller1);
   } 

     /**
	 * 	Update FnsPayloadFiller1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFiller1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadFiller1,fnsPayloadFiller1.length);
   	
   }
   
   public void setFnsPayloadFiller1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller1,fnsPayloadFiller1.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadFiller1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFiller1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadFiller1 with another Field
	 *	@param value
	 */
   public void setFnsPayloadFiller1(Field source) {
       replace(source,0,source.length(),beginFnsPayloadFiller1,FNS_PAYLOAD_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadFiller1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFiller1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller1,FNS_PAYLOAD_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadFiller1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFiller1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadClosedMm
	 *	@return fnsPayloadClosedMm
	 */
   public char[] getFnsPayloadClosedMm() throws CFException{
     if (isFnsPayloadClosedMmModified()) { 
        fnsPayloadClosedMm = refreshFnsPayloadClosedMm();
     }
   		return fnsPayloadClosedMm;
   }

  
	/**
	*  set variable fnsPayloadClosedMm
	*  Corresponding COBOL Variable is FNS-PAYLOAD-CLOSED-MM
	*  @param value
	**/
   public void setFnsPayloadClosedMm(char[] value) {
      fnsPayloadClosedMm = checkFnsPayloadClosedMmConstraints(value);
      serializeFnsPayloadClosedMm(fnsPayloadClosedMm);
   } 

     /**
	 * 	Update FnsPayloadClosedMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadClosedMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadClosedMm,fnsPayloadClosedMm.length);
   	
   }
   
   public void setFnsPayloadClosedMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedMm,fnsPayloadClosedMm.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadClosedMm with another Field
	 *	@param value
	 */
   public void setFnsPayloadClosedMm(Field source) {
       replace(source,0,source.length(),beginFnsPayloadClosedMm,FNS_PAYLOAD_CLOSED_MM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadClosedMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadClosedMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedMm,FNS_PAYLOAD_CLOSED_MM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadFiller2
	 *	@return fnsPayloadFiller2
	 */
   public char[] getFnsPayloadFiller2() throws CFException{
     if (isFnsPayloadFiller2Modified()) { 
        fnsPayloadFiller2 = refreshFnsPayloadFiller2();
     }
   		return fnsPayloadFiller2;
   }

  
	/**
	*  set variable fnsPayloadFiller2
	*  Corresponding COBOL Variable is FNS-PAYLOAD-FILLER2
	*  @param value
	**/
   public void setFnsPayloadFiller2(char[] value) {
      fnsPayloadFiller2 = checkFnsPayloadFiller2Constraints(value);
      serializeFnsPayloadFiller2(fnsPayloadFiller2);
   } 

     /**
	 * 	Update FnsPayloadFiller2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFiller2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadFiller2,fnsPayloadFiller2.length);
   	
   }
   
   public void setFnsPayloadFiller2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller2,fnsPayloadFiller2.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadFiller2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFiller2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadFiller2 with another Field
	 *	@param value
	 */
   public void setFnsPayloadFiller2(Field source) {
       replace(source,0,source.length(),beginFnsPayloadFiller2,FNS_PAYLOAD_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadFiller2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFiller2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller2,FNS_PAYLOAD_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadFiller2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFiller2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFiller2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadClosedDd
	 *	@return fnsPayloadClosedDd
	 */
   public char[] getFnsPayloadClosedDd() throws CFException{
     if (isFnsPayloadClosedDdModified()) { 
        fnsPayloadClosedDd = refreshFnsPayloadClosedDd();
     }
   		return fnsPayloadClosedDd;
   }

  
	/**
	*  set variable fnsPayloadClosedDd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-CLOSED-DD
	*  @param value
	**/
   public void setFnsPayloadClosedDd(char[] value) {
      fnsPayloadClosedDd = checkFnsPayloadClosedDdConstraints(value);
      serializeFnsPayloadClosedDd(fnsPayloadClosedDd);
   } 

     /**
	 * 	Update FnsPayloadClosedDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadClosedDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadClosedDd,fnsPayloadClosedDd.length);
   	
   }
   
   public void setFnsPayloadClosedDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedDd,fnsPayloadClosedDd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadClosedDd with another Field
	 *	@param value
	 */
   public void setFnsPayloadClosedDd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadClosedDd,FNS_PAYLOAD_CLOSED_DD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadClosedDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadClosedDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedDd,FNS_PAYLOAD_CLOSED_DD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadClosedDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadClosedDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadClosedDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPayloadCloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadClosedCcyy(CONSTANTS.SPACE_4);
         setFnsPayloadFiller1(CONSTANTS.SPACE);
         setFnsPayloadClosedMm(CONSTANTS.SPACE_2);
         setFnsPayloadFiller2(CONSTANTS.SPACE);
         setFnsPayloadClosedDd(CONSTANTS.SPACE_2);
   }

		public static int getFnsPayloadCloseDtFieldLength() {
			return FNS_PAYLOAD_CLOSE_DT_LENGTH;
		}

}
  
