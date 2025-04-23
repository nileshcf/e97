package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip69901CpuInformationGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip69901CpuInformationGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip69901CpuInformationGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_69901_CPU_INFORMATION_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp69901CpuInformation;
	
	/**
	* Constructor for Ip69901CpuInformationGroupSerialized
	**/
    public Ip69901CpuInformationGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip69901CpuInformationGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_69901_CPU_INFORMATION_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp69901CpuInformation = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp69901CpuInformationCounter = -1;
     public boolean isIp69901CpuInformationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69901CpuInformationCounter != sharedCounter;
         localIp69901CpuInformationCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69901_CPU_INFORMATION_LEN = 4;
	/**
	 * 	serialize this Ip69901CpuInformation
	 */
   protected void serializeIp69901CpuInformation(char[] ip69901CpuInformation) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69901CpuInformation,0,getStringValue(),beginIp69901CpuInformation,IP_69901_CPU_INFORMATION_LEN);
       localIp69901CpuInformationCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69901CpuInformationConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp69901CpuInformation is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69901CpuInformation() {	 
   		return (substring(getStringValue(),beginIp69901CpuInformation,beginIp69901CpuInformation + IP_69901_CPU_INFORMATION_LEN));
   	}




}
  
