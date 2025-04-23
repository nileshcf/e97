package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000804PdsAttributesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000804PdsAttributesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000804PdsAttributesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000804_PDS_ATTRIBUTES_LENGTH = 210002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000804MaxPdsNo;
	
	/**
	* Constructor for Ip000804PdsAttributesSerialized
	**/
    public Ip000804PdsAttributesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip000804PdsAttributesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000804_PDS_ATTRIBUTES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000804MaxPdsNo = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp000804MaxPdsNoCounter = -1;
         public boolean isIp000804MaxPdsNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000804MaxPdsNoCounter != sharedCounter;
            localIp000804MaxPdsNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000804_MAX_PDS_NO_LEN = 2;
  	/**
	 * serializeIp000804MaxPdsNo
	 */
	protected void serializeIp000804MaxPdsNo(short ip000804MaxPdsNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000804MaxPdsNo,IP_000804_MAX_PDS_NO_LEN)
                  ,beginIp000804MaxPdsNo
                  ,IP_000804_MAX_PDS_NO_LEN
                 );
            localIp000804MaxPdsNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000804MaxPdsNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000804MaxPdsNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000804MaxPdsNo() {	 
			return (getShort(beginIp000804MaxPdsNo));
   	}




}
  
