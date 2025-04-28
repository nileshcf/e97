package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301IsItCallFromNspkGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301IsItCallFromNspkGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301IsItCallFromNspkGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_IS_IT_CALL_FROM_NSPK_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301IsItCallFromNspk;
	
	/**
	* Constructor for Ip70301IsItCallFromNspkGroupSerialized
	**/
    public Ip70301IsItCallFromNspkGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301IsItCallFromNspkGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_IS_IT_CALL_FROM_NSPK_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301IsItCallFromNspk = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301IsItCallFromNspkCounter = -1;
     public boolean isIp70301IsItCallFromNspkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301IsItCallFromNspkCounter != sharedCounter;
         localIp70301IsItCallFromNspkCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_IS_IT_CALL_FROM_NSPK_LEN = 1;
	/**
	 * 	serialize this Ip70301IsItCallFromNspk
	 */
   protected void serializeIp70301IsItCallFromNspk(char[] ip70301IsItCallFromNspk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301IsItCallFromNspk,0,getStringValue(),beginIp70301IsItCallFromNspk,IP_70301_IS_IT_CALL_FROM_NSPK_LEN);
       localIp70301IsItCallFromNspkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301IsItCallFromNspkConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301IsItCallFromNspk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301IsItCallFromNspk() {	 
   		return (substring(getStringValue(),beginIp70301IsItCallFromNspk,beginIp70301IsItCallFromNspk + IP_70301_IS_IT_CALL_FROM_NSPK_LEN));
   	}




}
  
