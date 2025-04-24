package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504TcntGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504TcntGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504TcntGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_TCNT_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504Tcnt;
	
	/**
	* Constructor for Ip65504TcntGroupSerialized
	**/
    public Ip65504TcntGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip65504TcntGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_TCNT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504Tcnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504TcntCounter = -1;
         public boolean isIp65504TcntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TcntCounter != sharedCounter;
            localIp65504TcntCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TCNT_LEN = 2;
  	/**
	 * serializeIp65504Tcnt
	 */
	protected void serializeIp65504Tcnt(short ip65504Tcnt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504Tcnt,IP_65504_TCNT_LEN)
                  ,beginIp65504Tcnt
                  ,IP_65504_TCNT_LEN
                 );
            localIp65504TcntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TcntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504Tcnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504Tcnt() {	 
			return (getShort(beginIp65504Tcnt));
   	}




}
  
