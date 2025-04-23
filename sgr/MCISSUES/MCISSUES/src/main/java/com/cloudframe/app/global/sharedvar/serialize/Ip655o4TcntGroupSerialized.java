package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip655o4TcntGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip655o4TcntGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip655o4TcntGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_655O_4_TCNT_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp655o4Tcnt;
	
	/**
	* Constructor for Ip655o4TcntGroupSerialized
	**/
    public Ip655o4TcntGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip655o4TcntGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_655O_4_TCNT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp655o4Tcnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp655o4TcntCounter = -1;
         public boolean isIp655o4TcntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp655o4TcntCounter != sharedCounter;
            localIp655o4TcntCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_655O_4_TCNT_LEN = 2;
  	/**
	 * serializeIp655o4Tcnt
	 */
	protected void serializeIp655o4Tcnt(short ip655o4Tcnt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip655o4Tcnt,IP_655O_4_TCNT_LEN)
                  ,beginIp655o4Tcnt
                  ,IP_655O_4_TCNT_LEN
                 );
            localIp655o4TcntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp655o4TcntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp655o4Tcnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp655o4Tcnt() {	 
			return (getShort(beginIp655o4Tcnt));
   	}




}
  
