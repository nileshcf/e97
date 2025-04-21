package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301IsCemreqMqSrvActveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301IsCemreqMqSrvActveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301IsCemreqMqSrvActveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301IsCemreqMqSrvActve;
	
	/**
	* Constructor for Ip70301IsCemreqMqSrvActveGroupSerialized
	**/
    public Ip70301IsCemreqMqSrvActveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301IsCemreqMqSrvActveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301IsCemreqMqSrvActve = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301IsCemreqMqSrvActveCounter = -1;
     public boolean isIp70301IsCemreqMqSrvActveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301IsCemreqMqSrvActveCounter != sharedCounter;
         localIp70301IsCemreqMqSrvActveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_LEN = 1;
	/**
	 * 	serialize this Ip70301IsCemreqMqSrvActve
	 */
   protected void serializeIp70301IsCemreqMqSrvActve(char[] ip70301IsCemreqMqSrvActve) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301IsCemreqMqSrvActve,0,getStringValue(),beginIp70301IsCemreqMqSrvActve,IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_LEN);
       localIp70301IsCemreqMqSrvActveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301IsCemreqMqSrvActveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301IsCemreqMqSrvActve is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301IsCemreqMqSrvActve() {	 
   		return (substring(getStringValue(),beginIp70301IsCemreqMqSrvActve,beginIp70301IsCemreqMqSrvActve + IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_LEN));
   	}




}
  
