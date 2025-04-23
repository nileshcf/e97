package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041CentralSiteFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041CentralSiteFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041CentralSiteFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_CENTRAL_SITE_FIELDS_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0041IsoBinInd;
            protected  int beginIp0041Filler;
	
	/**
	* Constructor for Ip0041CentralSiteFieldsSerialized
	**/
    public Ip0041CentralSiteFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0041CentralSiteFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CentralSiteFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0041CentralSiteFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,124); // serialize this field at offset 124 by default 
    }
    
	/**
	* sets parent for this Ip0041CentralSiteFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 124 by default
    }    
	/**
	* initializes the field in Ip0041CentralSiteFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_CENTRAL_SITE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0041IsoBinInd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0041Filler = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0041IsoBinIndCounter = -1;
     public boolean isIp0041IsoBinIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041IsoBinIndCounter != sharedCounter;
         localIp0041IsoBinIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_ISO_BIN_IND_LEN = 1;
	/**
	 * 	serialize this Ip0041IsoBinInd
	 */
   protected void serializeIp0041IsoBinInd(char[] ip0041IsoBinInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041IsoBinInd,0,getStringValue(),beginIp0041IsoBinInd,IP_0041_ISO_BIN_IND_LEN);
       localIp0041IsoBinIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041IsoBinIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041IsoBinInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041IsoBinInd() {	 
   		return (substring(getStringValue(),beginIp0041IsoBinInd,beginIp0041IsoBinInd + IP_0041_ISO_BIN_IND_LEN));
   	}
     int localIp0041FillerCounter = -1;
     public boolean isIp0041FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041FillerCounter != sharedCounter;
         localIp0041FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_FILLER_LEN = 5;
	/**
	 * 	serialize this Ip0041Filler
	 */
   protected void serializeIp0041Filler(char[] ip0041Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041Filler,0,getStringValue(),beginIp0041Filler,IP_0041_FILLER_LEN);
       localIp0041FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp0041Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041Filler() {	 
   		return (substring(getStringValue(),beginIp0041Filler,beginIp0041Filler + IP_0041_FILLER_LEN));
   	}




}
  
