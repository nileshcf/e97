package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedMensajeError is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bankint1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AcafscedMensajeError extends AcafscedMensajeErrorSerialized { 
   

						private char[] acafscedSituacion = Field.fillLowValue(4);

						private char[] acafscedFiller = Field.fillLowValue(1);

						private char[] acafscedRestoMensaje = Field.fillLowValue(75);
	
	/**
	* Constructor for AcafscedMensajeError
	**/
    public AcafscedMensajeError() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcafscedMensajeError. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedMensajeError(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of acafscedSituacion
	 *	@return acafscedSituacion
	 */
   public char[] getAcafscedSituacion() throws CFException{
     if (isAcafscedSituacionModified()) { 
        acafscedSituacion = refreshAcafscedSituacion();
     }
   		return acafscedSituacion;
   }

  
	/**
	*  set variable acafscedSituacion
	*  Corresponding COBOL Variable is ACAFSCED-SITUACION
	*  @param value
	**/
   public void setAcafscedSituacion(char[] value) {
      acafscedSituacion = checkAcafscedSituacionConstraints(value);
      serializeAcafscedSituacion(acafscedSituacion);
   } 

     /**
	 * 	Update AcafscedSituacion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSituacion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSituacion,acafscedSituacion.length);
   	
   }
   
   public void setAcafscedSituacion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSituacion,acafscedSituacion.length);
   	
   }
   
     /**
	 * 	Update AcafscedSituacion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSituacion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSituacion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSituacion with another Field
	 *	@param value
	 */
   public void setAcafscedSituacion(Field source) {
       replace(source,0,source.length(),beginAcafscedSituacion,ACAFSCED_SITUACION_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSituacion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSituacion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSituacion,ACAFSCED_SITUACION_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSituacion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSituacion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSituacion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedFiller
	 *	@return acafscedFiller
	 */
   public char[] getAcafscedFiller() throws CFException{
     if (isAcafscedFillerModified()) { 
        acafscedFiller = refreshAcafscedFiller();
     }
   		return acafscedFiller;
   }

  
	/**
	*  set variable acafscedFiller
	*  Corresponding COBOL Variable is ACAFSCED-FILLER
	*  @param value
	**/
   public void setAcafscedFiller(char[] value) {
      acafscedFiller = checkAcafscedFillerConstraints(value);
      serializeAcafscedFiller(acafscedFiller);
   } 

     /**
	 * 	Update AcafscedFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedFiller,acafscedFiller.length);
   	
   }
   
   public void setAcafscedFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedFiller,acafscedFiller.length);
   	
   }
   
     /**
	 * 	Update AcafscedFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedFiller with another Field
	 *	@param value
	 */
   public void setAcafscedFiller(Field source) {
       replace(source,0,source.length(),beginAcafscedFiller,ACAFSCED_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedFiller,ACAFSCED_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedRestoMensaje
	 *	@return acafscedRestoMensaje
	 */
   public char[] getAcafscedRestoMensaje() throws CFException{
     if (isAcafscedRestoMensajeModified()) { 
        acafscedRestoMensaje = refreshAcafscedRestoMensaje();
     }
   		return acafscedRestoMensaje;
   }

  
	/**
	*  set variable acafscedRestoMensaje
	*  Corresponding COBOL Variable is ACAFSCED-RESTO-MENSAJE
	*  @param value
	**/
   public void setAcafscedRestoMensaje(char[] value) {
      acafscedRestoMensaje = checkAcafscedRestoMensajeConstraints(value);
      serializeAcafscedRestoMensaje(acafscedRestoMensaje);
   } 

     /**
	 * 	Update AcafscedRestoMensaje 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedRestoMensaje(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedRestoMensaje,acafscedRestoMensaje.length);
   	
   }
   
   public void setAcafscedRestoMensaje(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedRestoMensaje,acafscedRestoMensaje.length);
   	
   }
   
     /**
	 * 	Update AcafscedRestoMensaje 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedRestoMensaje(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedRestoMensaje+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedRestoMensaje with another Field
	 *	@param value
	 */
   public void setAcafscedRestoMensaje(Field source) {
       replace(source,0,source.length(),beginAcafscedRestoMensaje,ACAFSCED_RESTO_MENSAJE_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedRestoMensaje 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedRestoMensaje(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedRestoMensaje,ACAFSCED_RESTO_MENSAJE_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedRestoMensaje 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedRestoMensaje(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedRestoMensaje+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AcafscedMensajeError
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAcafscedSituacion(CONSTANTS.SPACE_4);
         setAcafscedFiller(CONSTANTS.SPACE);
         setAcafscedRestoMensaje(CONSTANTS.SPACE_75);
   }

		public static int getAcafscedMensajeErrorFieldLength() {
			return ACAFSCED_MENSAJE_ERROR_LENGTH;
		}

}
  
