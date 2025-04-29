package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedControl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.bankint1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AcafscedControl extends AcafscedControlSerialized { 
   

						private char[] acafscedNombreRutinaError = Field.fillLowValue(8);
				private AcafscedMensajeError acafscedMensajeError = new AcafscedMensajeError();
				private AcafscedErrorDb2 acafscedErrorDb2 = new AcafscedErrorDb2();

						private char[] acafscedCodigoRetorno = Field.fillLowValue(2);
	
	/**
	* Constructor for AcafscedControl
	**/
    public AcafscedControl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcafscedControl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedControl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			acafscedMensajeError.setParent(this,getStartOffset() + 8);
	       			acafscedErrorDb2.setParent(this,getStartOffset() + 88);
    } 

	/**
	 *	Returns the value of acafscedNombreRutinaError
	 *	@return acafscedNombreRutinaError
	 */
   public char[] getAcafscedNombreRutinaError() throws CFException{
     if (isAcafscedNombreRutinaErrorModified()) { 
        acafscedNombreRutinaError = refreshAcafscedNombreRutinaError();
     }
   		return acafscedNombreRutinaError;
   }

  
	/**
	*  set variable acafscedNombreRutinaError
	*  Corresponding COBOL Variable is ACAFSCED-NOMBRE-RUTINA-ERROR
	*  @param value
	**/
   public void setAcafscedNombreRutinaError(char[] value) {
      acafscedNombreRutinaError = checkAcafscedNombreRutinaErrorConstraints(value);
      serializeAcafscedNombreRutinaError(acafscedNombreRutinaError);
   } 

     /**
	 * 	Update AcafscedNombreRutinaError 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedNombreRutinaError(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedNombreRutinaError,acafscedNombreRutinaError.length);
   	
   }
   
   public void setAcafscedNombreRutinaError(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedNombreRutinaError,acafscedNombreRutinaError.length);
   	
   }
   
     /**
	 * 	Update AcafscedNombreRutinaError 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedNombreRutinaError(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedNombreRutinaError+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedNombreRutinaError with another Field
	 *	@param value
	 */
   public void setAcafscedNombreRutinaError(Field source) {
       replace(source,0,source.length(),beginAcafscedNombreRutinaError,ACAFSCED_NOMBRE_RUTINA_ERROR_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedNombreRutinaError 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedNombreRutinaError(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedNombreRutinaError,ACAFSCED_NOMBRE_RUTINA_ERROR_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedNombreRutinaError 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedNombreRutinaError(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedNombreRutinaError+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedMensajeError
	 *	@return acafscedMensajeError
	 */   
	 public AcafscedMensajeError getAcafscedMensajeError() {
   	return acafscedMensajeError;
   }
   /**
	* 	Update AcafscedMensajeError with the passed value
	*   Corresponding COBOL Variable is ACAFSCED-MENSAJE-ERROR
	*	@param value
	*/
   public void setAcafscedMensajeError(char[] value) {
      acafscedMensajeError.setString(value); 
   }   
    
     /**
	 * 	Update AcafscedMensajeError 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcafscedMensajeError(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedMensajeError.begin,acafscedMensajeError.length());
   }
   
     /**
	 * 	Update AcafscedMensajeError 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedMensajeError(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedMensajeError.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcafscedMensajeError with another Field
	 *	@param value
	 */
   public void setAcafscedMensajeError(Field source) {
   	replace(source,0,source.length(),acafscedMensajeError.begin,acafscedMensajeError.length());
   }  
   
     /**
	 * 	Update AcafscedMensajeError 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcafscedMensajeError(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedMensajeError.begin,acafscedMensajeError.length());
   }
   
     /**
	 * 	Update AcafscedMensajeError 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedMensajeError(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedMensajeError.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of acafscedErrorDb2
	 *	@return acafscedErrorDb2
	 */   
	 public AcafscedErrorDb2 getAcafscedErrorDb2() {
   	return acafscedErrorDb2;
   }
   /**
	* 	Update AcafscedErrorDb2 with the passed value
	*   Corresponding COBOL Variable is ACAFSCED-ERROR-DB2
	*	@param value
	*/
   public void setAcafscedErrorDb2(char[] value) {
      acafscedErrorDb2.setString(value); 
   }   
    
     /**
	 * 	Update AcafscedErrorDb2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcafscedErrorDb2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedErrorDb2.begin,acafscedErrorDb2.length());
   }
   
     /**
	 * 	Update AcafscedErrorDb2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedErrorDb2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedErrorDb2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcafscedErrorDb2 with another Field
	 *	@param value
	 */
   public void setAcafscedErrorDb2(Field source) {
   	replace(source,0,source.length(),acafscedErrorDb2.begin,acafscedErrorDb2.length());
   }  
   
     /**
	 * 	Update AcafscedErrorDb2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcafscedErrorDb2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedErrorDb2.begin,acafscedErrorDb2.length());
   }
   
     /**
	 * 	Update AcafscedErrorDb2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedErrorDb2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedErrorDb2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of acafscedCodigoRetorno
	 *	@return acafscedCodigoRetorno
	 */
   public char[] getAcafscedCodigoRetorno() throws CFException{
     if (isAcafscedCodigoRetornoModified()) { 
        acafscedCodigoRetorno = refreshAcafscedCodigoRetorno();
     }
   		return acafscedCodigoRetorno;
   }

  
	/**
	*  set variable acafscedCodigoRetorno
	*  Corresponding COBOL Variable is ACAFSCED-CODIGO-RETORNO
	*  @param value
	**/
   public void setAcafscedCodigoRetorno(char[] value) {
      acafscedCodigoRetorno = checkAcafscedCodigoRetornoConstraints(value);
      serializeAcafscedCodigoRetorno(acafscedCodigoRetorno);
   } 

     /**
	 * 	Update AcafscedCodigoRetorno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedCodigoRetorno(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedCodigoRetorno,acafscedCodigoRetorno.length);
   	
   }
   
   public void setAcafscedCodigoRetorno(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedCodigoRetorno,acafscedCodigoRetorno.length);
   	
   }
   
     /**
	 * 	Update AcafscedCodigoRetorno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedCodigoRetorno(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedCodigoRetorno+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedCodigoRetorno with another Field
	 *	@param value
	 */
   public void setAcafscedCodigoRetorno(Field source) {
       replace(source,0,source.length(),beginAcafscedCodigoRetorno,ACAFSCED_CODIGO_RETORNO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedCodigoRetorno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedCodigoRetorno(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedCodigoRetorno,ACAFSCED_CODIGO_RETORNO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedCodigoRetorno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedCodigoRetorno(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedCodigoRetorno+targetIndex,targetLen);
    
   }
	char[] acafscedCrBien88Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isAcafscedCrBien()
	 *	@return  Returns true if isAcafscedCrBien() is "00"
	 */
   public boolean isAcafscedCrBien() throws CFException {
      return (  compareChars( getAcafscedCodigoRetorno() , acafscedCrBien88Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setAcafscedCrBienTrue() {  			
    	setAcafscedCodigoRetorno( acafscedCrBien88Value);
   	}
	char[] acafscedCrErrorLogico88Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isAcafscedCrErrorLogico()
	 *	@return  Returns true if isAcafscedCrErrorLogico() is "10"
	 */
   public boolean isAcafscedCrErrorLogico() throws CFException {
      return (  compareChars( getAcafscedCodigoRetorno() , acafscedCrErrorLogico88Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setAcafscedCrErrorLogicoTrue() {  			
    	setAcafscedCodigoRetorno( acafscedCrErrorLogico88Value);
   	}
	char[] acafscedCrErrorEntrada88Value = "15".toCharArray();
	/**
	 *	Test condition "15" for isAcafscedCrErrorEntrada()
	 *	@return  Returns true if isAcafscedCrErrorEntrada() is "15"
	 */
   public boolean isAcafscedCrErrorEntrada() throws CFException {
      return (  compareChars( getAcafscedCodigoRetorno() , acafscedCrErrorEntrada88Value)  == 0  );
   }


	/**
	*  set values "15"
	*/
   	public void setAcafscedCrErrorEntradaTrue() {  			
    	setAcafscedCodigoRetorno( acafscedCrErrorEntrada88Value);
   	}
	char[] acafscedCrErrorDb288Value = "20".toCharArray();
	/**
	 *	Test condition "20" for isAcafscedCrErrorDb2()
	 *	@return  Returns true if isAcafscedCrErrorDb2() is "20"
	 */
   public boolean isAcafscedCrErrorDb2() throws CFException {
      return (  compareChars( getAcafscedCodigoRetorno() , acafscedCrErrorDb288Value)  == 0  );
   }


	/**
	*  set values "20"
	*/
   	public void setAcafscedCrErrorDb2True() {  			
    	setAcafscedCodigoRetorno( acafscedCrErrorDb288Value);
   	}
	char[] acafscedCrErrorCics88Value = "30".toCharArray();
	/**
	 *	Test condition "30" for isAcafscedCrErrorCics()
	 *	@return  Returns true if isAcafscedCrErrorCics() is "30"
	 */
   public boolean isAcafscedCrErrorCics() throws CFException {
      return (  compareChars( getAcafscedCodigoRetorno() , acafscedCrErrorCics88Value)  == 0  );
   }


	/**
	*  set values "30"
	*/
   	public void setAcafscedCrErrorCicsTrue() {  			
    	setAcafscedCodigoRetorno( acafscedCrErrorCics88Value);
   	}

	
	
	
	/**
	 * 	initializes AcafscedControl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAcafscedNombreRutinaError(CONSTANTS.SPACE_8);
          acafscedMensajeError.initialize();
     
          acafscedErrorDb2.initialize();
     
         setAcafscedCodigoRetorno(CONSTANTS.SPACE_2);
   }

		public static int getAcafscedControlFieldLength() {
			return ACAFSCED_CONTROL_LENGTH;
		}

}
  
