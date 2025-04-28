package com.cloudframe.app.bankint1.dto.serialize;

/**
*  The class AcafscedControlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcafscedControlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcafscedControlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACAFSCED_CONTROL_LENGTH = 430;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcafscedNombreRutinaError;
            protected  int beginAcafscedCodigoRetorno;
	
	/**
	* Constructor for AcafscedControlSerialized
	**/
    public AcafscedControlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcafscedControlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedControlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcafscedControlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,80); // serialize this field at offset 80 by default 
    }
    
	/**
	* sets parent for this AcafscedControlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 80 by default
    }    
	/**
	* initializes the field in AcafscedControlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACAFSCED_CONTROL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcafscedNombreRutinaError = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginAcafscedCodigoRetorno = getStartOffset() + 428;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcafscedNombreRutinaErrorCounter = -1;
     public boolean isAcafscedNombreRutinaErrorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedNombreRutinaErrorCounter != sharedCounter;
         localAcafscedNombreRutinaErrorCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_NOMBRE_RUTINA_ERROR_LEN = 8;
	/**
	 * 	serialize this AcafscedNombreRutinaError
	 */
   protected void serializeAcafscedNombreRutinaError(char[] acafscedNombreRutinaError) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedNombreRutinaError,0,getStringValue(),beginAcafscedNombreRutinaError,ACAFSCED_NOMBRE_RUTINA_ERROR_LEN);
       localAcafscedNombreRutinaErrorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedNombreRutinaErrorConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAcafscedNombreRutinaError is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedNombreRutinaError() {	 
   		return (substring(getStringValue(),beginAcafscedNombreRutinaError,beginAcafscedNombreRutinaError + ACAFSCED_NOMBRE_RUTINA_ERROR_LEN));
   	}
     int localAcafscedCodigoRetornoCounter = -1;
     public boolean isAcafscedCodigoRetornoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedCodigoRetornoCounter != sharedCounter;
         localAcafscedCodigoRetornoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_CODIGO_RETORNO_LEN = 2;
	/**
	 * 	serialize this AcafscedCodigoRetorno
	 */
   protected void serializeAcafscedCodigoRetorno(char[] acafscedCodigoRetorno) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedCodigoRetorno,0,getStringValue(),beginAcafscedCodigoRetorno,ACAFSCED_CODIGO_RETORNO_LEN);
       localAcafscedCodigoRetornoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedCodigoRetornoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAcafscedCodigoRetorno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedCodigoRetorno() {	 
   		return (substring(getStringValue(),beginAcafscedCodigoRetorno,beginAcafscedCodigoRetorno + ACAFSCED_CODIGO_RETORNO_LEN));
   	}




}
  
