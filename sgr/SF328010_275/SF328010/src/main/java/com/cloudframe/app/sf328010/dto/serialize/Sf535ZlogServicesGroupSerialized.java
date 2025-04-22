package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Sf535ZlogServicesGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf535ZlogServicesGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf535ZlogServicesGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_535_ZLOG_SERVICES_GROUP_LENGTH = 11456;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf535ZlogServices;
	
	/**
	* Constructor for Sf535ZlogServicesGroupSerialized
	**/
    public Sf535ZlogServicesGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf535ZlogServicesGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_535_ZLOG_SERVICES_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf535ZlogServices = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf535ZlogServicesCounter = -1;
     public boolean isSf535ZlogServicesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf535ZlogServicesCounter != sharedCounter;
         localSf535ZlogServicesCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_535_ZLOG_SERVICES_LEN = 11456;
	/**
	 * 	serialize this Sf535ZlogServices
	 */
   protected void serializeSf535ZlogServices(char[] sf535ZlogServices) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf535ZlogServices,0,getStringValue(),beginSf535ZlogServices,SF_535_ZLOG_SERVICES_LEN);
       localSf535ZlogServicesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf535ZlogServicesConstraints(char[] value) {
   			return super.checkConstraints(value , 11456 ,false, false);
   }
    /**
	 *	refreshSf535ZlogServices is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf535ZlogServices() {	 
   		return (substring(getStringValue(),beginSf535ZlogServices,beginSf535ZlogServices + SF_535_ZLOG_SERVICES_LEN));
   	}




}
  
