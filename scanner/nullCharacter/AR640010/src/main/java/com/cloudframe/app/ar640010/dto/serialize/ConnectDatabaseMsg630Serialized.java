package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ConnectDatabaseMsg630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ConnectDatabaseMsg630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ConnectDatabaseMsg630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CONNECT_DATABASE_MSG_630_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginConnectGftDbid630;
            protected  int beginConnectUserDbid630;
	
	/**
	* Constructor for ConnectDatabaseMsg630Serialized
	**/
    public ConnectDatabaseMsg630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ConnectDatabaseMsg630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CONNECT_DATABASE_MSG_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginConnectGftDbid630 = getStartOffset() + 22;	// set offset for serialization
  
  
             beginConnectUserDbid630 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localConnectGftDbid630Counter = -1;
     public boolean isConnectGftDbid630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConnectGftDbid630Counter != sharedCounter;
         localConnectGftDbid630Counter = sharedCounter; return hasModified;
     }
	protected static final int CONNECT_GFT_DBID_630_LEN = 8;
	/**
	 * 	serialize this ConnectGftDbid630
	 */
   protected void serializeConnectGftDbid630(char[] connectGftDbid630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(connectGftDbid630,0,getStringValue(),beginConnectGftDbid630,CONNECT_GFT_DBID_630_LEN);
       localConnectGftDbid630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConnectGftDbid630Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshConnectGftDbid630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConnectGftDbid630() {	 
   		return (substring(getStringValue(),beginConnectGftDbid630,beginConnectGftDbid630 + CONNECT_GFT_DBID_630_LEN));
   	}
     int localConnectUserDbid630Counter = -1;
     public boolean isConnectUserDbid630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConnectUserDbid630Counter != sharedCounter;
         localConnectUserDbid630Counter = sharedCounter; return hasModified;
     }
	protected static final int CONNECT_USER_DBID_630_LEN = 16;
	/**
	 * 	serialize this ConnectUserDbid630
	 */
   protected void serializeConnectUserDbid630(char[] connectUserDbid630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(connectUserDbid630,0,getStringValue(),beginConnectUserDbid630,CONNECT_USER_DBID_630_LEN);
       localConnectUserDbid630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConnectUserDbid630Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshConnectUserDbid630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConnectUserDbid630() {	 
   		return (substring(getStringValue(),beginConnectUserDbid630,beginConnectUserDbid630 + CONNECT_USER_DBID_630_LEN));
   	}




}
  
