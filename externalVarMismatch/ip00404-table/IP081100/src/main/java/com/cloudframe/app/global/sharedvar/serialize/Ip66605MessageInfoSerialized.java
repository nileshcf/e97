package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66605MessageInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66605MessageInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66605MessageInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66605_MESSAGE_INFO_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66605WriteRecs;
            protected  int beginIp66605DoesTagTableExist;
	
	/**
	* Constructor for Ip66605MessageInfoSerialized
	**/
    public Ip66605MessageInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip66605MessageInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66605_MESSAGE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66605WriteRecs = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66605DoesTagTableExist = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp66605WriteRecsCounter = -1;
     public boolean isIp66605WriteRecsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605WriteRecsCounter != sharedCounter;
         localIp66605WriteRecsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_WRITE_RECS_LEN = 1;
	/**
	 * 	serialize this Ip66605WriteRecs
	 */
   protected void serializeIp66605WriteRecs(char[] ip66605WriteRecs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605WriteRecs,0,getStringValue(),beginIp66605WriteRecs,IP_66605_WRITE_RECS_LEN);
       localIp66605WriteRecsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605WriteRecsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605WriteRecs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605WriteRecs() {	 
   		return (substring(getStringValue(),beginIp66605WriteRecs,beginIp66605WriteRecs + IP_66605_WRITE_RECS_LEN));
   	}
     int localIp66605DoesTagTableExistCounter = -1;
     public boolean isIp66605DoesTagTableExistModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605DoesTagTableExistCounter != sharedCounter;
         localIp66605DoesTagTableExistCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_DOES_TAG_TABLE_EXIST_LEN = 1;
	/**
	 * 	serialize this Ip66605DoesTagTableExist
	 */
   protected void serializeIp66605DoesTagTableExist(char[] ip66605DoesTagTableExist) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605DoesTagTableExist,0,getStringValue(),beginIp66605DoesTagTableExist,IP_66605_DOES_TAG_TABLE_EXIST_LEN);
       localIp66605DoesTagTableExistCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605DoesTagTableExistConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605DoesTagTableExist is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605DoesTagTableExist() {	 
   		return (substring(getStringValue(),beginIp66605DoesTagTableExist,beginIp66605DoesTagTableExist + IP_66605_DOES_TAG_TABLE_EXIST_LEN));
   	}




}
  
