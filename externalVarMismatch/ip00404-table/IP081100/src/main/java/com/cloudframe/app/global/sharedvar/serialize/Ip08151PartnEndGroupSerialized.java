package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08151PartnEndGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08151PartnEndGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08151PartnEndGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08151_PARTN_END_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08151PartnEnd;
	
	/**
	* Constructor for Ip08151PartnEndGroupSerialized
	**/
    public Ip08151PartnEndGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip08151PartnEndGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08151_PARTN_END_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08151PartnEnd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08151PartnEndCounter = -1;
     public boolean isIp08151PartnEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08151PartnEndCounter != sharedCounter;
         localIp08151PartnEndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08151_PARTN_END_LEN = 3;
	/**
	 * 	serialize this Ip08151PartnEnd
	 */
   protected void serializeIp08151PartnEnd(char[] ip08151PartnEnd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08151PartnEnd,0,getStringValue(),beginIp08151PartnEnd,IP_08151_PARTN_END_LEN);
       localIp08151PartnEndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08151PartnEndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08151PartnEnd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08151PartnEnd() {	 
   		return (substring(getStringValue(),beginIp08151PartnEnd,beginIp08151PartnEnd + IP_08151_PARTN_END_LEN));
   	}




}
  
