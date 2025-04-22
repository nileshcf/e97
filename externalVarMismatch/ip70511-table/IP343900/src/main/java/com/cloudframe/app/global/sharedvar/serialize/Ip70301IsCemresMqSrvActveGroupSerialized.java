package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301IsCemresMqSrvActveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301IsCemresMqSrvActveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301IsCemresMqSrvActveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_IS_CEMRES_MQ_SRV_ACTVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301IsCemresMqSrvActve;
	
	/**
	* Constructor for Ip70301IsCemresMqSrvActveGroupSerialized
	**/
    public Ip70301IsCemresMqSrvActveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301IsCemresMqSrvActveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_IS_CEMRES_MQ_SRV_ACTVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301IsCemresMqSrvActve = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301IsCemresMqSrvActveCounter = -1;
     public boolean isIp70301IsCemresMqSrvActveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301IsCemresMqSrvActveCounter != sharedCounter;
         localIp70301IsCemresMqSrvActveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_IS_CEMRES_MQ_SRV_ACTVE_LEN = 1;
	/**
	 * 	serialize this Ip70301IsCemresMqSrvActve
	 */
   protected void serializeIp70301IsCemresMqSrvActve(char[] ip70301IsCemresMqSrvActve) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301IsCemresMqSrvActve,0,getStringValue(),beginIp70301IsCemresMqSrvActve,IP_70301_IS_CEMRES_MQ_SRV_ACTVE_LEN);
       localIp70301IsCemresMqSrvActveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301IsCemresMqSrvActveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301IsCemresMqSrvActve is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301IsCemresMqSrvActve() {	 
   		return (substring(getStringValue(),beginIp70301IsCemresMqSrvActve,beginIp70301IsCemresMqSrvActve + IP_70301_IS_CEMRES_MQ_SRV_ACTVE_LEN));
   	}




}
  
