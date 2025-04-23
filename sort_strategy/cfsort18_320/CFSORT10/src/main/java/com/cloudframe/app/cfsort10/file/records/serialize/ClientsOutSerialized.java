package com.cloudframe.app.cfsort10.file.records.serialize;

/**
*  The class ClientsOutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClientsOutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClientsOutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLIENTS_OUT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClientsOutString;
	
	/**
	* Constructor for ClientsOutSerialized
	**/
    public ClientsOutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClientsOutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLIENTS_OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginClientsOutString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClientsOutStringCounter = -1;
     public boolean isClientsOutStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClientsOutStringCounter != sharedCounter;
         localClientsOutStringCounter = sharedCounter; return hasModified;
     }
	protected static final int CLIENTS_OUT_STRING_LEN = 80;
	/**
	 * 	serialize this ClientsOutString
	 */
   protected void serializeClientsOutString(char[] clientsOutString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clientsOutString,0,getStringValue(),beginClientsOutString,CLIENTS_OUT_STRING_LEN);
       localClientsOutStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClientsOutStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshClientsOutString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClientsOutString() {	 
   		return (substring(getStringValue(),beginClientsOutString,beginClientsOutString + CLIENTS_OUT_STRING_LEN));
   	}




}
  
