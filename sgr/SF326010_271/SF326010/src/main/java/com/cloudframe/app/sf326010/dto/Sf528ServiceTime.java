package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf528ServiceTime extends Sf528ServiceTimeSerialized { 
   

						private char[] sf528ServiceHr = Field.fillLowValue(2);

						private char[] sf528ServiceMn = Field.fillLowValue(2);

						private char[] sf528ServiceSc = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf528ServiceTime
	**/
    public Sf528ServiceTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf528ServiceTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf528ServiceHr
	 *	@return sf528ServiceHr
	 */
   public char[] getSf528ServiceHr() throws CFException{
     if (isSf528ServiceHrModified()) { 
        sf528ServiceHr = refreshSf528ServiceHr();
     }
   		return sf528ServiceHr;
   }

  
	/**
	*  set variable sf528ServiceHr
	*  Corresponding COBOL Variable is SF528-SERVICE-HR
	*  @param value
	**/
   public void setSf528ServiceHr(char[] value) {
      sf528ServiceHr = checkSf528ServiceHrConstraints(value);
      serializeSf528ServiceHr(sf528ServiceHr);
   } 

     /**
	 * 	Update Sf528ServiceHr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceHr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceHr,sf528ServiceHr.length);
   	
   }
   
   public void setSf528ServiceHr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceHr,sf528ServiceHr.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceHr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceHr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceHr with another Field
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source) {
       replace(source,0,source.length(),beginSf528ServiceHr,SF_528_SERVICE_HR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceHr,SF_528_SERVICE_HR_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceHr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceMn
	 *	@return sf528ServiceMn
	 */
   public char[] getSf528ServiceMn() throws CFException{
     if (isSf528ServiceMnModified()) { 
        sf528ServiceMn = refreshSf528ServiceMn();
     }
   		return sf528ServiceMn;
   }

  
	/**
	*  set variable sf528ServiceMn
	*  Corresponding COBOL Variable is SF528-SERVICE-MN
	*  @param value
	**/
   public void setSf528ServiceMn(char[] value) {
      sf528ServiceMn = checkSf528ServiceMnConstraints(value);
      serializeSf528ServiceMn(sf528ServiceMn);
   } 

     /**
	 * 	Update Sf528ServiceMn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceMn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceMn,sf528ServiceMn.length);
   	
   }
   
   public void setSf528ServiceMn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMn,sf528ServiceMn.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceMn with another Field
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source) {
       replace(source,0,source.length(),beginSf528ServiceMn,SF_528_SERVICE_MN_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceMn,SF_528_SERVICE_MN_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceSc
	 *	@return sf528ServiceSc
	 */
   public char[] getSf528ServiceSc() throws CFException{
     if (isSf528ServiceScModified()) { 
        sf528ServiceSc = refreshSf528ServiceSc();
     }
   		return sf528ServiceSc;
   }

  
	/**
	*  set variable sf528ServiceSc
	*  Corresponding COBOL Variable is SF528-SERVICE-SC
	*  @param value
	**/
   public void setSf528ServiceSc(char[] value) {
      sf528ServiceSc = checkSf528ServiceScConstraints(value);
      serializeSf528ServiceSc(sf528ServiceSc);
   } 

     /**
	 * 	Update Sf528ServiceSc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceSc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceSc,sf528ServiceSc.length);
   	
   }
   
   public void setSf528ServiceSc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceSc,sf528ServiceSc.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceSc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceSc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceSc with another Field
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source) {
       replace(source,0,source.length(),beginSf528ServiceSc,SF_528_SERVICE_SC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceSc,SF_528_SERVICE_SC_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceSc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf528ServiceTimeFieldLength() {
			return SF_528_SERVICE_TIME_LENGTH;
		}

}
  
