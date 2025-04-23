package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedErrorDb2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.bankint1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AcafscedErrorDb2 extends AcafscedErrorDb2Serialized { 
   

								private int acafscedSqlcode;

						private char[] acafscedSqlca = Field.fillLowValue(136);

						private char[] acafscedClaveAcceso = Field.fillLowValue(200);
	
	/**
	* Constructor for AcafscedErrorDb2
	**/
    public AcafscedErrorDb2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcafscedErrorDb2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedErrorDb2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of acafscedSqlcode
	 *	@return acafscedSqlcode
	 */
	public int getAcafscedSqlcode() throws CFException {
        if (isAcafscedSqlcodeModified()) { 
           acafscedSqlcode = refreshAcafscedSqlcode();
        }
   		return acafscedSqlcode;
	}
	
	/**
	 * 	Update AcafscedSqlcode with the passed value
	 *  Corresponding COBOL Variable is ACAFSCED-SQLCODE
	 *	@param number
	 */
	public void setAcafscedSqlcode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    acafscedSqlcode = checkAcafscedSqlcodeMaxLimit(number); 
		serializeAcafscedSqlcode(acafscedSqlcode);
	}


	public void setAcafscedSqlcode(long number) {
	    number = checkAcafscedSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAcafscedSqlcode((int)number);
	}
	
	/**
	 *	Returns the value of acafscedSqlca
	 *	@return acafscedSqlca
	 */
   public char[] getAcafscedSqlca() throws CFException{
     if (isAcafscedSqlcaModified()) { 
        acafscedSqlca = refreshAcafscedSqlca();
     }
   		return acafscedSqlca;
   }

  
	/**
	*  set variable acafscedSqlca
	*  Corresponding COBOL Variable is ACAFSCED-SQLCA
	*  @param value
	**/
   public void setAcafscedSqlca(char[] value) {
      acafscedSqlca = checkAcafscedSqlcaConstraints(value);
      serializeAcafscedSqlca(acafscedSqlca);
   } 

     /**
	 * 	Update AcafscedSqlca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSqlca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSqlca,acafscedSqlca.length);
   	
   }
   
   public void setAcafscedSqlca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSqlca,acafscedSqlca.length);
   	
   }
   
     /**
	 * 	Update AcafscedSqlca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSqlca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSqlca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSqlca with another Field
	 *	@param value
	 */
   public void setAcafscedSqlca(Field source) {
       replace(source,0,source.length(),beginAcafscedSqlca,ACAFSCED_SQLCA_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSqlca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSqlca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSqlca,ACAFSCED_SQLCA_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSqlca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSqlca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSqlca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedClaveAcceso
	 *	@return acafscedClaveAcceso
	 */
   public char[] getAcafscedClaveAcceso() throws CFException{
     if (isAcafscedClaveAccesoModified()) { 
        acafscedClaveAcceso = refreshAcafscedClaveAcceso();
     }
   		return acafscedClaveAcceso;
   }

  
	/**
	*  set variable acafscedClaveAcceso
	*  Corresponding COBOL Variable is ACAFSCED-CLAVE-ACCESO
	*  @param value
	**/
   public void setAcafscedClaveAcceso(char[] value) {
      acafscedClaveAcceso = checkAcafscedClaveAccesoConstraints(value);
      serializeAcafscedClaveAcceso(acafscedClaveAcceso);
   } 

     /**
	 * 	Update AcafscedClaveAcceso 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedClaveAcceso(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedClaveAcceso,acafscedClaveAcceso.length);
   	
   }
   
   public void setAcafscedClaveAcceso(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedClaveAcceso,acafscedClaveAcceso.length);
   	
   }
   
     /**
	 * 	Update AcafscedClaveAcceso 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedClaveAcceso(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedClaveAcceso+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedClaveAcceso with another Field
	 *	@param value
	 */
   public void setAcafscedClaveAcceso(Field source) {
       replace(source,0,source.length(),beginAcafscedClaveAcceso,ACAFSCED_CLAVE_ACCESO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedClaveAcceso 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedClaveAcceso(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedClaveAcceso,ACAFSCED_CLAVE_ACCESO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedClaveAcceso 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedClaveAcceso(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedClaveAcceso+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AcafscedErrorDb2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setAcafscedSqlcode(0);
         setAcafscedSqlca(CONSTANTS.SPACE_136);
         setAcafscedClaveAcceso(CONSTANTS.SPACE_200);
   }

		public static int getAcafscedErrorDb2FieldLength() {
			return ACAFSCED_ERROR_DB_2_LENGTH;
		}

}
  
