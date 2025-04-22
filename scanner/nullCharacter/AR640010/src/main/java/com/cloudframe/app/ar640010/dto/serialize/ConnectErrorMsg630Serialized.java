package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ConnectErrorMsg630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ConnectErrorMsg630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ConnectErrorMsg630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CONNECT_ERROR_MSG_630_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginConnectResponse630;
	
	/**
	* Constructor for ConnectErrorMsg630Serialized
	**/
    public ConnectErrorMsg630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ConnectErrorMsg630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CONNECT_ERROR_MSG_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginConnectResponse630 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localConnectResponse630Counter = -1;
     public boolean isConnectResponse630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConnectResponse630Counter != sharedCounter;
         localConnectResponse630Counter = sharedCounter; return hasModified;
     }
	protected static final int CONNECT_RESPONSE_630_LEN = 4;
	/**
	 * 	serialize this ConnectResponse630
	 */
   protected void serializeConnectResponse630(char[] connectResponse630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(connectResponse630,0,getStringValue(),beginConnectResponse630,CONNECT_RESPONSE_630_LEN);
       localConnectResponse630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConnectResponse630Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshConnectResponse630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConnectResponse630() {	 
   		return (substring(getStringValue(),beginConnectResponse630,beginConnectResponse630 + CONNECT_RESPONSE_630_LEN));
   	}




}
  
