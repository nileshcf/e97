package com.cloudframe.app.init1.dto;

/**
*  The class CpduPrvMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CpduPrvMtn extends CpduPrvMtnSerialized { 
   

						private char[] cpduPrvNpa = new char[3];

						private char[] cpduPrvNxx = new char[3];

						private char[] cpduPrvTln = new char[4];
	
	/**
	* Constructor for CpduPrvMtn
	**/
    public CpduPrvMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CpduPrvMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCpduPrvNpa(fillSpace(3));
								setCpduPrvNxx(fillSpace(3));
								setCpduPrvTln(fillSpace(4));
    } 

	/**
	 *	Returns the value of cpduPrvNpa
	 *	@return cpduPrvNpa
	 */
   public char[] getCpduPrvNpa() throws CFException{
     if (isCpduPrvNpaModified()) { 
        cpduPrvNpa = refreshCpduPrvNpa();
     }
   		return cpduPrvNpa;
   }

  
	/**
	*  set variable cpduPrvNpa
	*  Corresponding COBOL Variable is WS-CPDU-PRV-NPA
	*  @param value
	**/
   public void setCpduPrvNpa(char[] value) {
      cpduPrvNpa = checkCpduPrvNpaConstraints(value);
      serializeCpduPrvNpa(cpduPrvNpa);
   } 

     /**
	 * 	Update CpduPrvNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvNpa,cpduPrvNpa.length);
   	
   }
   
   public void setCpduPrvNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNpa,cpduPrvNpa.length);
   	
   }
   
     /**
	 * 	Update CpduPrvNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvNpa with another Field
	 *	@param value
	 */
   public void setCpduPrvNpa(Field source) {
       replace(source,0,source.length(),beginCpduPrvNpa,CPDU_PRV_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvNpa,CPDU_PRV_NPA_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvNxx
	 *	@return cpduPrvNxx
	 */
   public char[] getCpduPrvNxx() throws CFException{
     if (isCpduPrvNxxModified()) { 
        cpduPrvNxx = refreshCpduPrvNxx();
     }
   		return cpduPrvNxx;
   }

  
	/**
	*  set variable cpduPrvNxx
	*  Corresponding COBOL Variable is WS-CPDU-PRV-NXX
	*  @param value
	**/
   public void setCpduPrvNxx(char[] value) {
      cpduPrvNxx = checkCpduPrvNxxConstraints(value);
      serializeCpduPrvNxx(cpduPrvNxx);
   } 

     /**
	 * 	Update CpduPrvNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvNxx,cpduPrvNxx.length);
   	
   }
   
   public void setCpduPrvNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNxx,cpduPrvNxx.length);
   	
   }
   
     /**
	 * 	Update CpduPrvNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvNxx with another Field
	 *	@param value
	 */
   public void setCpduPrvNxx(Field source) {
       replace(source,0,source.length(),beginCpduPrvNxx,CPDU_PRV_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvNxx,CPDU_PRV_NXX_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvTln
	 *	@return cpduPrvTln
	 */
   public char[] getCpduPrvTln() throws CFException{
     if (isCpduPrvTlnModified()) { 
        cpduPrvTln = refreshCpduPrvTln();
     }
   		return cpduPrvTln;
   }

  
	/**
	*  set variable cpduPrvTln
	*  Corresponding COBOL Variable is WS-CPDU-PRV-TLN
	*  @param value
	**/
   public void setCpduPrvTln(char[] value) {
      cpduPrvTln = checkCpduPrvTlnConstraints(value);
      serializeCpduPrvTln(cpduPrvTln);
   } 

     /**
	 * 	Update CpduPrvTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvTln,cpduPrvTln.length);
   	
   }
   
   public void setCpduPrvTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvTln,cpduPrvTln.length);
   	
   }
   
     /**
	 * 	Update CpduPrvTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvTln with another Field
	 *	@param value
	 */
   public void setCpduPrvTln(Field source) {
       replace(source,0,source.length(),beginCpduPrvTln,CPDU_PRV_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvTln,CPDU_PRV_TLN_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes CpduPrvMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduPrvNpa(CONSTANTS.SPACE_3);
         setCpduPrvNxx(CONSTANTS.SPACE_3);
         setCpduPrvTln(CONSTANTS.SPACE_4);
   }

		public static int getCpduPrvMtnFieldLength() {
			return CPDU_PRV_MTN_LENGTH;
		}

}
  
