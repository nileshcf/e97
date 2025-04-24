package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class CertificationRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CertificationRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CertificationRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CERTIFICATION_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCrParameterId;
            protected  int beginCrDomesticOnSoil;
            protected  int beginLocalEnv;
	
	/**
	* Constructor for CertificationRecSerialized
	**/
    public CertificationRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CertificationRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CERTIFICATION_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCrParameterId = getStartOffset() + 0;	// set offset for serialization
  
             beginCrDomesticOnSoil = getStartOffset() + 12;	// set offset for serialization
  
             beginLocalEnv = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCrParameterIdCounter = -1;
     public boolean isCrParameterIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrParameterIdCounter != sharedCounter;
         localCrParameterIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CR_PARAMETER_ID_LEN = 8;
	/**
	 * 	serialize this CrParameterId
	 */
   protected void serializeCrParameterId(char[] crParameterId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crParameterId,0,getStringValue(),beginCrParameterId,CR_PARAMETER_ID_LEN);
       localCrParameterIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrParameterIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCrParameterId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrParameterId() {	 
   		return (substring(getStringValue(),beginCrParameterId,beginCrParameterId + CR_PARAMETER_ID_LEN));
   	}
     int localCrDomesticOnSoilCounter = -1;
     public boolean isCrDomesticOnSoilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrDomesticOnSoilCounter != sharedCounter;
         localCrDomesticOnSoilCounter = sharedCounter; return hasModified;
     }
	protected static final int CR_DOMESTIC_ON_SOIL_LEN = 5;
	/**
	 * 	serialize this CrDomesticOnSoil
	 */
   protected void serializeCrDomesticOnSoil(char[] crDomesticOnSoil) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crDomesticOnSoil,0,getStringValue(),beginCrDomesticOnSoil,CR_DOMESTIC_ON_SOIL_LEN);
       localCrDomesticOnSoilCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrDomesticOnSoilConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCrDomesticOnSoil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrDomesticOnSoil() {	 
   		return (substring(getStringValue(),beginCrDomesticOnSoil,beginCrDomesticOnSoil + CR_DOMESTIC_ON_SOIL_LEN));
   	}
     int localLocalEnvCounter = -1;
     public boolean isLocalEnvModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLocalEnvCounter != sharedCounter;
         localLocalEnvCounter = sharedCounter; return hasModified;
     }
	protected static final int LOCAL_ENV_LEN = 14;
	/**
	 * 	serialize this LocalEnv
	 */
   protected void serializeLocalEnv(char[] localEnv) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(localEnv,0,getStringValue(),beginLocalEnv,LOCAL_ENV_LEN);
       localLocalEnvCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLocalEnvConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshLocalEnv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLocalEnv() {	 
   		return (substring(getStringValue(),beginLocalEnv,beginLocalEnv + LOCAL_ENV_LEN));
   	}




}
  
