package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedSalida is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.bankint1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class AcafscedSalida extends AcafscedSalidaSerialized { 
   

								private char[] acafscedSSaldoCedido = Field.fillLowValue(16);

								private char[] acafscedSSaldoTomado = Field.fillLowValue(16);

								private char[] acafscedSSalPrcedido = Field.fillLowValue(16);

								private char[] acafscedSSalPrtomado = Field.fillLowValue(16);

								private char[] acafscedSSalTraspaso = Field.fillLowValue(16);
				private AcafscedControl acafscedControl = new AcafscedControl();
	
	/**
	* Constructor for AcafscedSalida
	**/
    public AcafscedSalida() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcafscedSalida. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedSalida(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			acafscedControl.setParent(this,getStartOffset() + 80);
    } 

	/**
	 *	Returns the value of acafscedSSaldoCedido
	 *	@return acafscedSSaldoCedido
	 */
   public char[] getAcafscedSSaldoCedido() throws CFException{
     if (isAcafscedSSaldoCedidoModified()) { 
        acafscedSSaldoCedido = refreshAcafscedSSaldoCedido();
     }
   		return acafscedSSaldoCedido;
   }

  
	/**
	*  set variable acafscedSSaldoCedido
	*  Corresponding COBOL Variable is ACAFSCED-S-SALDO-CEDIDO
	*  @param value
	**/
   public void setAcafscedSSaldoCedido(char[] value) {
      acafscedSSaldoCedido = checkAcafscedSSaldoCedidoConstraints(value);
      serializeAcafscedSSaldoCedido(acafscedSSaldoCedido);
   } 

     /**
	 * 	Update AcafscedSSaldoCedido 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSSaldoCedido(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSSaldoCedido,acafscedSSaldoCedido.length);
   	
   }
   
   public void setAcafscedSSaldoCedido(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoCedido,acafscedSSaldoCedido.length);
   	
   }
   
     /**
	 * 	Update AcafscedSSaldoCedido 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSaldoCedido(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoCedido+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSSaldoCedido with another Field
	 *	@param value
	 */
   public void setAcafscedSSaldoCedido(Field source) {
       replace(source,0,source.length(),beginAcafscedSSaldoCedido,ACAFSCED_SSALDO_CEDIDO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSSaldoCedido 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSSaldoCedido(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoCedido,ACAFSCED_SSALDO_CEDIDO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSSaldoCedido 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSaldoCedido(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoCedido+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedSSaldoTomado
	 *	@return acafscedSSaldoTomado
	 */
   public char[] getAcafscedSSaldoTomado() throws CFException{
     if (isAcafscedSSaldoTomadoModified()) { 
        acafscedSSaldoTomado = refreshAcafscedSSaldoTomado();
     }
   		return acafscedSSaldoTomado;
   }

  
	/**
	*  set variable acafscedSSaldoTomado
	*  Corresponding COBOL Variable is ACAFSCED-S-SALDO-TOMADO
	*  @param value
	**/
   public void setAcafscedSSaldoTomado(char[] value) {
      acafscedSSaldoTomado = checkAcafscedSSaldoTomadoConstraints(value);
      serializeAcafscedSSaldoTomado(acafscedSSaldoTomado);
   } 

     /**
	 * 	Update AcafscedSSaldoTomado 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSSaldoTomado(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSSaldoTomado,acafscedSSaldoTomado.length);
   	
   }
   
   public void setAcafscedSSaldoTomado(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoTomado,acafscedSSaldoTomado.length);
   	
   }
   
     /**
	 * 	Update AcafscedSSaldoTomado 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSaldoTomado(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoTomado+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSSaldoTomado with another Field
	 *	@param value
	 */
   public void setAcafscedSSaldoTomado(Field source) {
       replace(source,0,source.length(),beginAcafscedSSaldoTomado,ACAFSCED_SSALDO_TOMADO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSSaldoTomado 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSSaldoTomado(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoTomado,ACAFSCED_SSALDO_TOMADO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSSaldoTomado 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSaldoTomado(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSaldoTomado+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedSSalPrcedido
	 *	@return acafscedSSalPrcedido
	 */
   public char[] getAcafscedSSalPrcedido() throws CFException{
     if (isAcafscedSSalPrcedidoModified()) { 
        acafscedSSalPrcedido = refreshAcafscedSSalPrcedido();
     }
   		return acafscedSSalPrcedido;
   }

  
	/**
	*  set variable acafscedSSalPrcedido
	*  Corresponding COBOL Variable is ACAFSCED-S-SAL-PRCEDIDO
	*  @param value
	**/
   public void setAcafscedSSalPrcedido(char[] value) {
      acafscedSSalPrcedido = checkAcafscedSSalPrcedidoConstraints(value);
      serializeAcafscedSSalPrcedido(acafscedSSalPrcedido);
   } 

     /**
	 * 	Update AcafscedSSalPrcedido 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSSalPrcedido(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSSalPrcedido,acafscedSSalPrcedido.length);
   	
   }
   
   public void setAcafscedSSalPrcedido(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrcedido,acafscedSSalPrcedido.length);
   	
   }
   
     /**
	 * 	Update AcafscedSSalPrcedido 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalPrcedido(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrcedido+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSSalPrcedido with another Field
	 *	@param value
	 */
   public void setAcafscedSSalPrcedido(Field source) {
       replace(source,0,source.length(),beginAcafscedSSalPrcedido,ACAFSCED_SSAL_PRCEDIDO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSSalPrcedido 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSSalPrcedido(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrcedido,ACAFSCED_SSAL_PRCEDIDO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSSalPrcedido 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalPrcedido(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrcedido+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedSSalPrtomado
	 *	@return acafscedSSalPrtomado
	 */
   public char[] getAcafscedSSalPrtomado() throws CFException{
     if (isAcafscedSSalPrtomadoModified()) { 
        acafscedSSalPrtomado = refreshAcafscedSSalPrtomado();
     }
   		return acafscedSSalPrtomado;
   }

  
	/**
	*  set variable acafscedSSalPrtomado
	*  Corresponding COBOL Variable is ACAFSCED-S-SAL-PRTOMADO
	*  @param value
	**/
   public void setAcafscedSSalPrtomado(char[] value) {
      acafscedSSalPrtomado = checkAcafscedSSalPrtomadoConstraints(value);
      serializeAcafscedSSalPrtomado(acafscedSSalPrtomado);
   } 

     /**
	 * 	Update AcafscedSSalPrtomado 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSSalPrtomado(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSSalPrtomado,acafscedSSalPrtomado.length);
   	
   }
   
   public void setAcafscedSSalPrtomado(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrtomado,acafscedSSalPrtomado.length);
   	
   }
   
     /**
	 * 	Update AcafscedSSalPrtomado 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalPrtomado(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrtomado+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSSalPrtomado with another Field
	 *	@param value
	 */
   public void setAcafscedSSalPrtomado(Field source) {
       replace(source,0,source.length(),beginAcafscedSSalPrtomado,ACAFSCED_SSAL_PRTOMADO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSSalPrtomado 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSSalPrtomado(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrtomado,ACAFSCED_SSAL_PRTOMADO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSSalPrtomado 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalPrtomado(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalPrtomado+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedSSalTraspaso
	 *	@return acafscedSSalTraspaso
	 */
   public char[] getAcafscedSSalTraspaso() throws CFException{
     if (isAcafscedSSalTraspasoModified()) { 
        acafscedSSalTraspaso = refreshAcafscedSSalTraspaso();
     }
   		return acafscedSSalTraspaso;
   }

  
	/**
	*  set variable acafscedSSalTraspaso
	*  Corresponding COBOL Variable is ACAFSCED-S-SAL-TRASPASO
	*  @param value
	**/
   public void setAcafscedSSalTraspaso(char[] value) {
      acafscedSSalTraspaso = checkAcafscedSSalTraspasoConstraints(value);
      serializeAcafscedSSalTraspaso(acafscedSSalTraspaso);
   } 

     /**
	 * 	Update AcafscedSSalTraspaso 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcafscedSSalTraspaso(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcafscedSSalTraspaso,acafscedSSalTraspaso.length);
   	
   }
   
   public void setAcafscedSSalTraspaso(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalTraspaso,acafscedSSalTraspaso.length);
   	
   }
   
     /**
	 * 	Update AcafscedSSalTraspaso 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalTraspaso(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalTraspaso+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcafscedSSalTraspaso with another Field
	 *	@param value
	 */
   public void setAcafscedSSalTraspaso(Field source) {
       replace(source,0,source.length(),beginAcafscedSSalTraspaso,ACAFSCED_SSAL_TRASPASO_LEN);
   	
   }  
   
     /**
	 * 	Update AcafscedSSalTraspaso 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcafscedSSalTraspaso(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcafscedSSalTraspaso,ACAFSCED_SSAL_TRASPASO_LEN);
   	
   }
   
     /**
	 * 	Update AcafscedSSalTraspaso 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedSSalTraspaso(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcafscedSSalTraspaso+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acafscedControl
	 *	@return acafscedControl
	 */   
	 public AcafscedControl getAcafscedControl() {
   	return acafscedControl;
   }
   /**
	* 	Update AcafscedControl with the passed value
	*   Corresponding COBOL Variable is ACAFSCED-CONTROL
	*	@param value
	*/
   public void setAcafscedControl(char[] value) {
      acafscedControl.setString(value); 
   }   
    
     /**
	 * 	Update AcafscedControl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcafscedControl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedControl.begin,acafscedControl.length());
   }
   
     /**
	 * 	Update AcafscedControl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedControl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedControl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcafscedControl with another Field
	 *	@param value
	 */
   public void setAcafscedControl(Field source) {
   	replace(source,0,source.length(),acafscedControl.begin,acafscedControl.length());
   }  
   
     /**
	 * 	Update AcafscedControl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcafscedControl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acafscedControl.begin,acafscedControl.length());
   }
   
     /**
	 * 	Update AcafscedControl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedControl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acafscedControl.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes AcafscedSalida
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setAcafscedSSaldoCedido(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSaldoTomado(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalPrcedido(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalPrtomado(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalTraspaso(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
          acafscedControl.initialize();
     
   }

		public static int getAcafscedSalidaFieldLength() {
			return ACAFSCED_SALIDA_LENGTH;
		}

}
  
