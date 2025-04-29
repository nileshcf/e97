package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeValidInput extends CmnTimeValidInputSerialized { 
   

						private char[] cmnTimeValidHh = Field.fillLowValue(2);

						private char[] cmnTimeValidSep1 = Field.fillLowValue(1);

						private char[] cmnTimeValidMm = Field.fillLowValue(2);

						private char[] cmnTimeValidSep2 = Field.fillLowValue(1);

						private char[] cmnTimeValidSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnTimeValidInput
	**/
    public CmnTimeValidInput() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeValidInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeValidHh
	 *	@return cmnTimeValidHh
	 */
   public char[] getCmnTimeValidHh() throws CFException{
     if (isCmnTimeValidHhModified()) { 
        cmnTimeValidHh = refreshCmnTimeValidHh();
     }
   		return cmnTimeValidHh;
   }

  
	/**
	*  set variable cmnTimeValidHh
	*  Corresponding COBOL Variable is CMN-TIME-VALID-HH
	*  @param value
	**/
   public void setCmnTimeValidHh(char[] value) {
      cmnTimeValidHh = checkCmnTimeValidHhConstraints(value);
      serializeCmnTimeValidHh(cmnTimeValidHh);
   } 

     /**
	 * 	Update CmnTimeValidHh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidHh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidHh,cmnTimeValidHh.length);
   	
   }
   
   public void setCmnTimeValidHh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidHh,cmnTimeValidHh.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidHh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidHh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidHh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidHh with another Field
	 *	@param value
	 */
   public void setCmnTimeValidHh(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidHh,CMN_TIME_VALID_HH_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidHh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidHh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidHh,CMN_TIME_VALID_HH_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidHh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidHh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidHh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeValidSep1
	 *	@return cmnTimeValidSep1
	 */
   public char[] getCmnTimeValidSep1() throws CFException{
     if (isCmnTimeValidSep1Modified()) { 
        cmnTimeValidSep1 = refreshCmnTimeValidSep1();
     }
   		return cmnTimeValidSep1;
   }

  
	/**
	*  set variable cmnTimeValidSep1
	*  Corresponding COBOL Variable is CMN-TIME-VALID-SEP1
	*  @param value
	**/
   public void setCmnTimeValidSep1(char[] value) {
      cmnTimeValidSep1 = checkCmnTimeValidSep1Constraints(value);
      serializeCmnTimeValidSep1(cmnTimeValidSep1);
   } 

     /**
	 * 	Update CmnTimeValidSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidSep1,cmnTimeValidSep1.length);
   	
   }
   
   public void setCmnTimeValidSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep1,cmnTimeValidSep1.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidSep1 with another Field
	 *	@param value
	 */
   public void setCmnTimeValidSep1(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidSep1,CMN_TIME_VALID_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep1,CMN_TIME_VALID_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeValidMm
	 *	@return cmnTimeValidMm
	 */
   public char[] getCmnTimeValidMm() throws CFException{
     if (isCmnTimeValidMmModified()) { 
        cmnTimeValidMm = refreshCmnTimeValidMm();
     }
   		return cmnTimeValidMm;
   }

  
	/**
	*  set variable cmnTimeValidMm
	*  Corresponding COBOL Variable is CMN-TIME-VALID-MM
	*  @param value
	**/
   public void setCmnTimeValidMm(char[] value) {
      cmnTimeValidMm = checkCmnTimeValidMmConstraints(value);
      serializeCmnTimeValidMm(cmnTimeValidMm);
   } 

     /**
	 * 	Update CmnTimeValidMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidMm,cmnTimeValidMm.length);
   	
   }
   
   public void setCmnTimeValidMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidMm,cmnTimeValidMm.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidMm with another Field
	 *	@param value
	 */
   public void setCmnTimeValidMm(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidMm,CMN_TIME_VALID_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidMm,CMN_TIME_VALID_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeValidSep2
	 *	@return cmnTimeValidSep2
	 */
   public char[] getCmnTimeValidSep2() throws CFException{
     if (isCmnTimeValidSep2Modified()) { 
        cmnTimeValidSep2 = refreshCmnTimeValidSep2();
     }
   		return cmnTimeValidSep2;
   }

  
	/**
	*  set variable cmnTimeValidSep2
	*  Corresponding COBOL Variable is CMN-TIME-VALID-SEP2
	*  @param value
	**/
   public void setCmnTimeValidSep2(char[] value) {
      cmnTimeValidSep2 = checkCmnTimeValidSep2Constraints(value);
      serializeCmnTimeValidSep2(cmnTimeValidSep2);
   } 

     /**
	 * 	Update CmnTimeValidSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidSep2,cmnTimeValidSep2.length);
   	
   }
   
   public void setCmnTimeValidSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep2,cmnTimeValidSep2.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidSep2 with another Field
	 *	@param value
	 */
   public void setCmnTimeValidSep2(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidSep2,CMN_TIME_VALID_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep2,CMN_TIME_VALID_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeValidSs
	 *	@return cmnTimeValidSs
	 */
   public char[] getCmnTimeValidSs() throws CFException{
     if (isCmnTimeValidSsModified()) { 
        cmnTimeValidSs = refreshCmnTimeValidSs();
     }
   		return cmnTimeValidSs;
   }

  
	/**
	*  set variable cmnTimeValidSs
	*  Corresponding COBOL Variable is CMN-TIME-VALID-SS
	*  @param value
	**/
   public void setCmnTimeValidSs(char[] value) {
      cmnTimeValidSs = checkCmnTimeValidSsConstraints(value);
      serializeCmnTimeValidSs(cmnTimeValidSs);
   } 

     /**
	 * 	Update CmnTimeValidSs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidSs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidSs,cmnTimeValidSs.length);
   	
   }
   
   public void setCmnTimeValidSs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSs,cmnTimeValidSs.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidSs with another Field
	 *	@param value
	 */
   public void setCmnTimeValidSs(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidSs,CMN_TIME_VALID_SS_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidSs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidSs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidSs,CMN_TIME_VALID_SS_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidSs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidSs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidSs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnTimeValidInputFieldLength() {
			return CMN_TIME_VALID_INPUT_LENGTH;
		}

}
  
