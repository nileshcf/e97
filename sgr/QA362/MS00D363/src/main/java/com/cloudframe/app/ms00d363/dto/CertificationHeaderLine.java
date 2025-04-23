package com.cloudframe.app.ms00d363.dto;

/**
*  The class CertificationHeaderLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CertificationHeaderLine extends CertificationHeaderLineSerialized { 
   

						private char[] chlTitle1 = Field.fillLowValue(28);
	
	/**
	* Constructor for CertificationHeaderLine
	**/
    public CertificationHeaderLine() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CertificationHeaderLine. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CertificationHeaderLine(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chlTitle1
	 *	@return chlTitle1
	 */
   public char[] getChlTitle1() throws CFException{
     if (isChlTitle1Modified()) { 
        chlTitle1 = refreshChlTitle1();
     }
   		return chlTitle1;
   }

  
	/**
	*  set variable chlTitle1
	*  Corresponding COBOL Variable is CHL-TITLE-1
	*  @param value
	**/
   public void setChlTitle1(char[] value) {
      chlTitle1 = checkChlTitle1Constraints(value);
      serializeChlTitle1(chlTitle1);
   } 

     /**
	 * 	Update ChlTitle1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChlTitle1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChlTitle1,chlTitle1.length);
   	
   }
   
   public void setChlTitle1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChlTitle1,chlTitle1.length);
   	
   }
   
     /**
	 * 	Update ChlTitle1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChlTitle1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChlTitle1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ChlTitle1 with another Field
	 *	@param value
	 */
   public void setChlTitle1(Field source) {
       replace(source,0,source.length(),beginChlTitle1,CHL_TITLE_1_LEN);
   	
   }  
   
     /**
	 * 	Update ChlTitle1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChlTitle1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChlTitle1,CHL_TITLE_1_LEN);
   	
   }
   
     /**
	 * 	Update ChlTitle1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChlTitle1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChlTitle1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCertificationHeaderLineFieldLength() {
			return CERTIFICATION_HEADER_LINE_LENGTH;
		}

}
  
