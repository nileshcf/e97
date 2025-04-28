package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00911CentralSiteFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00911CentralSiteFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00911CentralSiteFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00911_CENTRAL_SITE_FIELDS_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00911IsoBinInd;
            protected  int beginIp00911Filler;
	
	/**
	* Constructor for Ip00911CentralSiteFieldsSerialized
	**/
    public Ip00911CentralSiteFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00911CentralSiteFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911CentralSiteFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00911CentralSiteFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,41); // serialize this field at offset 41 by default 
    }
    
	/**
	* sets parent for this Ip00911CentralSiteFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 41 by default
    }    
	/**
	* initializes the field in Ip00911CentralSiteFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00911_CENTRAL_SITE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00911IsoBinInd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00911Filler = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00911IsoBinIndCounter = -1;
     public boolean isIp00911IsoBinIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911IsoBinIndCounter != sharedCounter;
         localIp00911IsoBinIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_ISO_BIN_IND_LEN = 1;
	/**
	 * 	serialize this Ip00911IsoBinInd
	 */
   protected void serializeIp00911IsoBinInd(char[] ip00911IsoBinInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911IsoBinInd,0,getStringValue(),beginIp00911IsoBinInd,IP_00911_ISO_BIN_IND_LEN);
       localIp00911IsoBinIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911IsoBinIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00911IsoBinInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911IsoBinInd() {	 
   		return (substring(getStringValue(),beginIp00911IsoBinInd,beginIp00911IsoBinInd + IP_00911_ISO_BIN_IND_LEN));
   	}
     int localIp00911FillerCounter = -1;
     public boolean isIp00911FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911FillerCounter != sharedCounter;
         localIp00911FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_FILLER_LEN = 3;
	/**
	 * 	serialize this Ip00911Filler
	 */
   protected void serializeIp00911Filler(char[] ip00911Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911Filler,0,getStringValue(),beginIp00911Filler,IP_00911_FILLER_LEN);
       localIp00911FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00911Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911Filler() {	 
   		return (substring(getStringValue(),beginIp00911Filler,beginIp00911Filler + IP_00911_FILLER_LEN));
   	}




}
  
