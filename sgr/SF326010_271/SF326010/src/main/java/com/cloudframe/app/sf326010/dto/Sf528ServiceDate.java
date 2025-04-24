package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf528ServiceDate extends Sf528ServiceDateSerialized { 
   

						private char[] sf528ServiceCc = Field.fillLowValue(2);

						private char[] sf528ServiceYy = Field.fillLowValue(2);

						private char[] sf528ServiceMm = Field.fillLowValue(2);

						private char[] sf528ServiceDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf528ServiceDate
	**/
    public Sf528ServiceDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf528ServiceDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf528ServiceCc
	 *	@return sf528ServiceCc
	 */
   public char[] getSf528ServiceCc() throws CFException{
     if (isSf528ServiceCcModified()) { 
        sf528ServiceCc = refreshSf528ServiceCc();
     }
   		return sf528ServiceCc;
   }

  
	/**
	*  set variable sf528ServiceCc
	*  Corresponding COBOL Variable is SF528-SERVICE-CC
	*  @param value
	**/
   public void setSf528ServiceCc(char[] value) {
      sf528ServiceCc = checkSf528ServiceCcConstraints(value);
      serializeSf528ServiceCc(sf528ServiceCc);
   } 

     /**
	 * 	Update Sf528ServiceCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceCc,sf528ServiceCc.length);
   	
   }
   
   public void setSf528ServiceCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceCc,sf528ServiceCc.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceCc with another Field
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source) {
       replace(source,0,source.length(),beginSf528ServiceCc,SF_528_SERVICE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceCc,SF_528_SERVICE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceYy
	 *	@return sf528ServiceYy
	 */
   public char[] getSf528ServiceYy() throws CFException{
     if (isSf528ServiceYyModified()) { 
        sf528ServiceYy = refreshSf528ServiceYy();
     }
   		return sf528ServiceYy;
   }

  
	/**
	*  set variable sf528ServiceYy
	*  Corresponding COBOL Variable is SF528-SERVICE-YY
	*  @param value
	**/
   public void setSf528ServiceYy(char[] value) {
      sf528ServiceYy = checkSf528ServiceYyConstraints(value);
      serializeSf528ServiceYy(sf528ServiceYy);
   } 

     /**
	 * 	Update Sf528ServiceYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceYy,sf528ServiceYy.length);
   	
   }
   
   public void setSf528ServiceYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceYy,sf528ServiceYy.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceYy with another Field
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source) {
       replace(source,0,source.length(),beginSf528ServiceYy,SF_528_SERVICE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceYy,SF_528_SERVICE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceMm
	 *	@return sf528ServiceMm
	 */
   public char[] getSf528ServiceMm() throws CFException{
     if (isSf528ServiceMmModified()) { 
        sf528ServiceMm = refreshSf528ServiceMm();
     }
   		return sf528ServiceMm;
   }

  
	/**
	*  set variable sf528ServiceMm
	*  Corresponding COBOL Variable is SF528-SERVICE-MM
	*  @param value
	**/
   public void setSf528ServiceMm(char[] value) {
      sf528ServiceMm = checkSf528ServiceMmConstraints(value);
      serializeSf528ServiceMm(sf528ServiceMm);
   } 

     /**
	 * 	Update Sf528ServiceMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceMm,sf528ServiceMm.length);
   	
   }
   
   public void setSf528ServiceMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMm,sf528ServiceMm.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceMm with another Field
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source) {
       replace(source,0,source.length(),beginSf528ServiceMm,SF_528_SERVICE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceMm,SF_528_SERVICE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceDd
	 *	@return sf528ServiceDd
	 */
   public char[] getSf528ServiceDd() throws CFException{
     if (isSf528ServiceDdModified()) { 
        sf528ServiceDd = refreshSf528ServiceDd();
     }
   		return sf528ServiceDd;
   }

  
	/**
	*  set variable sf528ServiceDd
	*  Corresponding COBOL Variable is SF528-SERVICE-DD
	*  @param value
	**/
   public void setSf528ServiceDd(char[] value) {
      sf528ServiceDd = checkSf528ServiceDdConstraints(value);
      serializeSf528ServiceDd(sf528ServiceDd);
   } 

     /**
	 * 	Update Sf528ServiceDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceDd,sf528ServiceDd.length);
   	
   }
   
   public void setSf528ServiceDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDd,sf528ServiceDd.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceDd with another Field
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source) {
       replace(source,0,source.length(),beginSf528ServiceDd,SF_528_SERVICE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceDd,SF_528_SERVICE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf528ServiceDateFieldLength() {
			return SF_528_SERVICE_DATE_LENGTH;
		}

}
  
