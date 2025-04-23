package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ConnectPackageMsg630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ConnectPackageMsg630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ConnectPackageMsg630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CONNECT_PACKAGE_MSG_630_LENGTH = 77;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginConnectGftDbpkg630;
            protected  int beginConnectUserDbpkg630;
	
	/**
	* Constructor for ConnectPackageMsg630Serialized
	**/
    public ConnectPackageMsg630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ConnectPackageMsg630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CONNECT_PACKAGE_MSG_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginConnectGftDbpkg630 = getStartOffset() + 22;	// set offset for serialization
  
  
             beginConnectUserDbpkg630 = getStartOffset() + 59;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localConnectGftDbpkg630Counter = -1;
     public boolean isConnectGftDbpkg630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConnectGftDbpkg630Counter != sharedCounter;
         localConnectGftDbpkg630Counter = sharedCounter; return hasModified;
     }
	protected static final int CONNECT_GFT_DBPKG_630_LEN = 18;
	/**
	 * 	serialize this ConnectGftDbpkg630
	 */
   protected void serializeConnectGftDbpkg630(char[] connectGftDbpkg630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(connectGftDbpkg630,0,getStringValue(),beginConnectGftDbpkg630,CONNECT_GFT_DBPKG_630_LEN);
       localConnectGftDbpkg630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConnectGftDbpkg630Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshConnectGftDbpkg630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConnectGftDbpkg630() {	 
   		return (substring(getStringValue(),beginConnectGftDbpkg630,beginConnectGftDbpkg630 + CONNECT_GFT_DBPKG_630_LEN));
   	}
     int localConnectUserDbpkg630Counter = -1;
     public boolean isConnectUserDbpkg630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConnectUserDbpkg630Counter != sharedCounter;
         localConnectUserDbpkg630Counter = sharedCounter; return hasModified;
     }
	protected static final int CONNECT_USER_DBPKG_630_LEN = 18;
	/**
	 * 	serialize this ConnectUserDbpkg630
	 */
   protected void serializeConnectUserDbpkg630(char[] connectUserDbpkg630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(connectUserDbpkg630,0,getStringValue(),beginConnectUserDbpkg630,CONNECT_USER_DBPKG_630_LEN);
       localConnectUserDbpkg630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConnectUserDbpkg630Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshConnectUserDbpkg630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConnectUserDbpkg630() {	 
   		return (substring(getStringValue(),beginConnectUserDbpkg630,beginConnectUserDbpkg630 + CONNECT_USER_DBPKG_630_LEN));
   	}




}
  
