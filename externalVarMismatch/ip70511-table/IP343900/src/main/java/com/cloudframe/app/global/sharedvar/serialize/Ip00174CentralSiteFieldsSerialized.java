package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00174CentralSiteFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00174CentralSiteFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00174CentralSiteFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00174_CENTRAL_SITE_FIELDS_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00174CryptoFlagInd;
	
	/**
	* Constructor for Ip00174CentralSiteFieldsSerialized
	**/
    public Ip00174CentralSiteFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00174CentralSiteFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CentralSiteFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00174CentralSiteFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this Ip00174CentralSiteFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in Ip00174CentralSiteFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00174_CENTRAL_SITE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00174CryptoFlagInd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00174CryptoFlagIndCounter = -1;
     public boolean isIp00174CryptoFlagIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174CryptoFlagIndCounter != sharedCounter;
         localIp00174CryptoFlagIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00174_CRYPTO_FLAG_IND_LEN = 1;
	/**
	 * 	serialize this Ip00174CryptoFlagInd
	 */
   protected void serializeIp00174CryptoFlagInd(char[] ip00174CryptoFlagInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00174CryptoFlagInd,0,getStringValue(),beginIp00174CryptoFlagInd,IP_00174_CRYPTO_FLAG_IND_LEN);
       localIp00174CryptoFlagIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00174CryptoFlagIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00174CryptoFlagInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00174CryptoFlagInd() {	 
   		return (substring(getStringValue(),beginIp00174CryptoFlagInd,beginIp00174CryptoFlagInd + IP_00174_CRYPTO_FLAG_IND_LEN));
   	}




}
  
