package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip69931InputFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:34. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip69931InputFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip69931InputFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_69931_INPUT_FIELDS_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp69931ProcessingAgreement;
            protected  int beginIp69931ApplicationSystemId;
	
	/**
	* Constructor for Ip69931InputFieldsSerialized
	**/
    public Ip69931InputFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip69931InputFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931InputFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip69931InputFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip69931InputFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip69931InputFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_69931_INPUT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp69931ProcessingAgreement = getStartOffset() + 0;	// set offset for serialization
  
             beginIp69931ApplicationSystemId = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp69931ProcessingAgreementCounter = -1;
     public boolean isIp69931ProcessingAgreementModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931ProcessingAgreementCounter != sharedCounter;
         localIp69931ProcessingAgreementCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69931_PROCESSING_AGREEMENT_LEN = 11;
	/**
	 * 	serialize this Ip69931ProcessingAgreement
	 */
   protected void serializeIp69931ProcessingAgreement(char[] ip69931ProcessingAgreement) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69931ProcessingAgreement,0,getStringValue(),beginIp69931ProcessingAgreement,IP_69931_PROCESSING_AGREEMENT_LEN);
       localIp69931ProcessingAgreementCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69931ProcessingAgreementConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp69931ProcessingAgreement is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69931ProcessingAgreement() {	 
   		return (substring(getStringValue(),beginIp69931ProcessingAgreement,beginIp69931ProcessingAgreement + IP_69931_PROCESSING_AGREEMENT_LEN));
   	}
     int localIp69931ApplicationSystemIdCounter = -1;
     public boolean isIp69931ApplicationSystemIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931ApplicationSystemIdCounter != sharedCounter;
         localIp69931ApplicationSystemIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69931_APPLICATION_SYSTEM_ID_LEN = 3;
	/**
	 * 	serialize this Ip69931ApplicationSystemId
	 */
   protected void serializeIp69931ApplicationSystemId(char[] ip69931ApplicationSystemId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69931ApplicationSystemId,0,getStringValue(),beginIp69931ApplicationSystemId,IP_69931_APPLICATION_SYSTEM_ID_LEN);
       localIp69931ApplicationSystemIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69931ApplicationSystemIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp69931ApplicationSystemId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69931ApplicationSystemId() {	 
   		return (substring(getStringValue(),beginIp69931ApplicationSystemId,beginIp69931ApplicationSystemId + IP_69931_APPLICATION_SYSTEM_ID_LEN));
   	}




}
  
