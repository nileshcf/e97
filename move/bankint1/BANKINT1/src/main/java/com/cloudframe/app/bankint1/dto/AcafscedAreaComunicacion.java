package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedAreaComunicacion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.bankint1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcafscedAreaComunicacion extends AcafscedAreaComunicacionSerialized { 
   
				private AcafscedSalida acafscedSalida = new AcafscedSalida();
	
	/**
	* Constructor for AcafscedAreaComunicacion
	**/
    public AcafscedAreaComunicacion() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			acafscedSalida.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of acafscedSalida
	 *	@return acafscedSalida
	 */   
	 public AcafscedSalida getAcafscedSalida() {
   	return acafscedSalida;
   }
   /**
	* 	Update AcafscedSalida with the passed value
	*   Corresponding COBOL Variable is ACAFSCED-SALIDA
	*	@param value
	*/
   public void setAcafscedSalida(char[] value) {
      acafscedSalida.setString(value); 
   }   
    
     /**
	 * 	Update AcafscedSalida 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSalida(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedSalida.begin,acafscedSalida.length());
   }
   
     /**
	 * 	Update AcafscedSalida 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSalida(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedSalida.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcafscedSalida with another Field
	 *	@param value
	 */
   public void setAcafscedSalida(Field source) {
   	replace(source,0,source.length(),acafscedSalida.begin,acafscedSalida.length());
   }  
   
     /**
	 * 	Update AcafscedSalida 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSalida(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedSalida.begin,acafscedSalida.length());
   }
   
     /**
	 * 	Update AcafscedSalida 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSalida(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedSalida.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes AcafscedAreaComunicacion
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          acafscedSalida.initialize();
     
   }

		public static int getAcafscedAreaComunicacionFieldLength() {
			return ACAFSCED_AREA_COMUNICACION_LENGTH;
		}

}
  
