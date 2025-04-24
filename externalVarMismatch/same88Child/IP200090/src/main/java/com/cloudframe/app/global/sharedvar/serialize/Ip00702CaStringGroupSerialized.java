package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00702CaStringGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00702CaStringGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00702CaStringGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00702_CA_STRING_GROUP_LENGTH = 2048;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00702CaString;
	
	/**
	* Constructor for Ip00702CaStringGroupSerialized
	**/
    public Ip00702CaStringGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00702CaStringGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00702_CA_STRING_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00702CaString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00702CaStringCounter = -1;
     public boolean isIp00702CaStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00702CaStringCounter != sharedCounter;
         localIp00702CaStringCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00702_CA_STRING_LEN = 2048;
	/**
	 * 	serialize this Ip00702CaString
	 */
   protected void serializeIp00702CaString(char[] ip00702CaString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00702CaString,0,getStringValue(),beginIp00702CaString,IP_00702_CA_STRING_LEN);
       localIp00702CaStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00702CaStringConstraints(char[] value) {
   			return super.checkConstraints(value , 2048 ,false, false);
   }
    /**
	 *	refreshIp00702CaString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00702CaString() {	 
   		return (substring(getStringValue(),beginIp00702CaString,beginIp00702CaString + IP_00702_CA_STRING_LEN));
   	}




}
  
