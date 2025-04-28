package com.cloudframe.app.bankint1.dto.serialize;

/**
*  The class AcafscedMensajeErrorSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcafscedMensajeErrorSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcafscedMensajeErrorSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACAFSCED_MENSAJE_ERROR_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcafscedSituacion;
            protected  int beginAcafscedFiller;
            protected  int beginAcafscedRestoMensaje;
	
	/**
	* Constructor for AcafscedMensajeErrorSerialized
	**/
    public AcafscedMensajeErrorSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcafscedMensajeErrorSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedMensajeErrorSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcafscedMensajeErrorSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,88); // serialize this field at offset 88 by default 
    }
    
	/**
	* sets parent for this AcafscedMensajeErrorSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 88 by default
    }    
	/**
	* initializes the field in AcafscedMensajeErrorSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACAFSCED_MENSAJE_ERROR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcafscedSituacion = getStartOffset() + 0;	// set offset for serialization
  
             beginAcafscedFiller = getStartOffset() + 4;	// set offset for serialization
  
             beginAcafscedRestoMensaje = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcafscedSituacionCounter = -1;
     public boolean isAcafscedSituacionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSituacionCounter != sharedCounter;
         localAcafscedSituacionCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SITUACION_LEN = 4;
	/**
	 * 	serialize this AcafscedSituacion
	 */
   protected void serializeAcafscedSituacion(char[] acafscedSituacion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSituacion,0,getStringValue(),beginAcafscedSituacion,ACAFSCED_SITUACION_LEN);
       localAcafscedSituacionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSituacionConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAcafscedSituacion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSituacion() {	 
   		return (substring(getStringValue(),beginAcafscedSituacion,beginAcafscedSituacion + ACAFSCED_SITUACION_LEN));
   	}
     int localAcafscedFillerCounter = -1;
     public boolean isAcafscedFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedFillerCounter != sharedCounter;
         localAcafscedFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_FILLER_LEN = 1;
	/**
	 * 	serialize this AcafscedFiller
	 */
   protected void serializeAcafscedFiller(char[] acafscedFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedFiller,0,getStringValue(),beginAcafscedFiller,ACAFSCED_FILLER_LEN);
       localAcafscedFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAcafscedFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedFiller() {	 
   		return (substring(getStringValue(),beginAcafscedFiller,beginAcafscedFiller + ACAFSCED_FILLER_LEN));
   	}
     int localAcafscedRestoMensajeCounter = -1;
     public boolean isAcafscedRestoMensajeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedRestoMensajeCounter != sharedCounter;
         localAcafscedRestoMensajeCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_RESTO_MENSAJE_LEN = 75;
	/**
	 * 	serialize this AcafscedRestoMensaje
	 */
   protected void serializeAcafscedRestoMensaje(char[] acafscedRestoMensaje) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedRestoMensaje,0,getStringValue(),beginAcafscedRestoMensaje,ACAFSCED_RESTO_MENSAJE_LEN);
       localAcafscedRestoMensajeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedRestoMensajeConstraints(char[] value) {
   			return super.checkConstraints(value , 75 ,false, false);
   }
    /**
	 *	refreshAcafscedRestoMensaje is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedRestoMensaje() {	 
   		return (substring(getStringValue(),beginAcafscedRestoMensaje,beginAcafscedRestoMensaje + ACAFSCED_RESTO_MENSAJE_LEN));
   	}




}
  
