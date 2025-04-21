package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip66601UserTagInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserTagInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserTagInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_TAG_INFORMATION_LENGTH = 9102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66601UserTcnt;
	
	/**
	* Constructor for Ip66601UserTagInformationSerialized
	**/
    public Ip66601UserTagInformationSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip66601UserTagInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_TAG_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66601UserTcnt = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp66601UserTcntCounter = -1;
         public boolean isIp66601UserTcntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTcntCounter != sharedCounter;
            localIp66601UserTcntCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TCNT_LEN = 2;
  	/**
	 * serializeIp66601UserTcnt
	 */
	protected void serializeIp66601UserTcnt(short ip66601UserTcnt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTcnt,IP_66601_USER_TCNT_LEN)
                  ,beginIp66601UserTcnt
                  ,IP_66601_USER_TCNT_LEN
                 );
            localIp66601UserTcntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTcntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTcnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTcnt() {	 
			return (getShort(beginIp66601UserTcnt));
   	}




}
  
