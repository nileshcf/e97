package com.cloudframe.app.bankint1.dto.serialize;

/**
*  The class AcafscedSalidaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcafscedSalidaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcafscedSalidaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACAFSCED_SALIDA_LENGTH = 510;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcafscedSSaldoCedido;
            protected  int beginAcafscedSSaldoTomado;
            protected  int beginAcafscedSSalPrcedido;
            protected  int beginAcafscedSSalPrtomado;
            protected  int beginAcafscedSSalTraspaso;
	
	/**
	* Constructor for AcafscedSalidaSerialized
	**/
    public AcafscedSalidaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcafscedSalidaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedSalidaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcafscedSalidaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AcafscedSalidaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AcafscedSalidaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACAFSCED_SALIDA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcafscedSSaldoCedido = getStartOffset() + 0;	// set offset for serialization
  
             beginAcafscedSSaldoTomado = getStartOffset() + 16;	// set offset for serialization
  
             beginAcafscedSSalPrcedido = getStartOffset() + 32;	// set offset for serialization
  
             beginAcafscedSSalPrtomado = getStartOffset() + 48;	// set offset for serialization
  
             beginAcafscedSSalTraspaso = getStartOffset() + 64;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAcafscedSSaldoCedidoCounter = -1;
     public boolean isAcafscedSSaldoCedidoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSSaldoCedidoCounter != sharedCounter;
         localAcafscedSSaldoCedidoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SSALDO_CEDIDO_LEN = 16;
	/**
	 * 	serialize this AcafscedSSaldoCedido
	 */
   protected void serializeAcafscedSSaldoCedido(char[] acafscedSSaldoCedido) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSSaldoCedido,0,getStringValue(),beginAcafscedSSaldoCedido,ACAFSCED_SSALDO_CEDIDO_LEN);
       localAcafscedSSaldoCedidoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSSaldoCedidoConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAcafscedSSaldoCedido is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSSaldoCedido() {	 
   		return (substring(getStringValue(),beginAcafscedSSaldoCedido,beginAcafscedSSaldoCedido + ACAFSCED_SSALDO_CEDIDO_LEN));
   	}
     int localAcafscedSSaldoTomadoCounter = -1;
     public boolean isAcafscedSSaldoTomadoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSSaldoTomadoCounter != sharedCounter;
         localAcafscedSSaldoTomadoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SSALDO_TOMADO_LEN = 16;
	/**
	 * 	serialize this AcafscedSSaldoTomado
	 */
   protected void serializeAcafscedSSaldoTomado(char[] acafscedSSaldoTomado) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSSaldoTomado,0,getStringValue(),beginAcafscedSSaldoTomado,ACAFSCED_SSALDO_TOMADO_LEN);
       localAcafscedSSaldoTomadoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSSaldoTomadoConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAcafscedSSaldoTomado is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSSaldoTomado() {	 
   		return (substring(getStringValue(),beginAcafscedSSaldoTomado,beginAcafscedSSaldoTomado + ACAFSCED_SSALDO_TOMADO_LEN));
   	}
     int localAcafscedSSalPrcedidoCounter = -1;
     public boolean isAcafscedSSalPrcedidoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSSalPrcedidoCounter != sharedCounter;
         localAcafscedSSalPrcedidoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SSAL_PRCEDIDO_LEN = 16;
	/**
	 * 	serialize this AcafscedSSalPrcedido
	 */
   protected void serializeAcafscedSSalPrcedido(char[] acafscedSSalPrcedido) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSSalPrcedido,0,getStringValue(),beginAcafscedSSalPrcedido,ACAFSCED_SSAL_PRCEDIDO_LEN);
       localAcafscedSSalPrcedidoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSSalPrcedidoConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAcafscedSSalPrcedido is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSSalPrcedido() {	 
   		return (substring(getStringValue(),beginAcafscedSSalPrcedido,beginAcafscedSSalPrcedido + ACAFSCED_SSAL_PRCEDIDO_LEN));
   	}
     int localAcafscedSSalPrtomadoCounter = -1;
     public boolean isAcafscedSSalPrtomadoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSSalPrtomadoCounter != sharedCounter;
         localAcafscedSSalPrtomadoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SSAL_PRTOMADO_LEN = 16;
	/**
	 * 	serialize this AcafscedSSalPrtomado
	 */
   protected void serializeAcafscedSSalPrtomado(char[] acafscedSSalPrtomado) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSSalPrtomado,0,getStringValue(),beginAcafscedSSalPrtomado,ACAFSCED_SSAL_PRTOMADO_LEN);
       localAcafscedSSalPrtomadoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSSalPrtomadoConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAcafscedSSalPrtomado is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSSalPrtomado() {	 
   		return (substring(getStringValue(),beginAcafscedSSalPrtomado,beginAcafscedSSalPrtomado + ACAFSCED_SSAL_PRTOMADO_LEN));
   	}
     int localAcafscedSSalTraspasoCounter = -1;
     public boolean isAcafscedSSalTraspasoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSSalTraspasoCounter != sharedCounter;
         localAcafscedSSalTraspasoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SSAL_TRASPASO_LEN = 16;
	/**
	 * 	serialize this AcafscedSSalTraspaso
	 */
   protected void serializeAcafscedSSalTraspaso(char[] acafscedSSalTraspaso) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSSalTraspaso,0,getStringValue(),beginAcafscedSSalTraspaso,ACAFSCED_SSAL_TRASPASO_LEN);
       localAcafscedSSalTraspasoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSSalTraspasoConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAcafscedSSalTraspaso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSSalTraspaso() {	 
   		return (substring(getStringValue(),beginAcafscedSSalTraspaso,beginAcafscedSSalTraspaso + ACAFSCED_SSAL_TRASPASO_LEN));
   	}




}
  
