package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class SrvreqHeader802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SrvreqHeader802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SrvreqHeader802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRVREQ_HEADER_802_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSrHeaderId802;
            protected  int beginSrHeaderVer802;
            protected  int beginSrRequestCount802;
	
	/**
	* Constructor for SrvreqHeader802Serialized
	**/
    public SrvreqHeader802Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SrvreqHeader802Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SrvreqHeader802Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SrvreqHeader802Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SrvreqHeader802Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SrvreqHeader802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRVREQ_HEADER_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSrHeaderId802 = getStartOffset() + 0;	// set offset for serialization
  
             beginSrHeaderVer802 = getStartOffset() + 2;	// set offset for serialization
  
             beginSrRequestCount802 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSrHeaderId802Counter = -1;
     public boolean isSrHeaderId802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrHeaderId802Counter != sharedCounter;
         localSrHeaderId802Counter = sharedCounter; return hasModified;
     }
	protected static final int SR_HEADER_ID_802_LEN = 2;
	/**
	 * 	serialize this SrHeaderId802
	 */
   protected void serializeSrHeaderId802(char[] srHeaderId802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srHeaderId802,0,getStringValue(),beginSrHeaderId802,SR_HEADER_ID_802_LEN);
       localSrHeaderId802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrHeaderId802Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSrHeaderId802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrHeaderId802() {	 
   		return (substring(getStringValue(),beginSrHeaderId802,beginSrHeaderId802 + SR_HEADER_ID_802_LEN));
   	}
     int localSrHeaderVer802Counter = -1;
     public boolean isSrHeaderVer802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrHeaderVer802Counter != sharedCounter;
         localSrHeaderVer802Counter = sharedCounter; return hasModified;
     }
	protected static final int SR_HEADER_VER_802_LEN = 3;
	/**
	 * 	serialize this SrHeaderVer802
	 */
   protected void serializeSrHeaderVer802(char[] srHeaderVer802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srHeaderVer802,0,getStringValue(),beginSrHeaderVer802,SR_HEADER_VER_802_LEN);
       localSrHeaderVer802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrHeaderVer802Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSrHeaderVer802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrHeaderVer802() {	 
   		return (substring(getStringValue(),beginSrHeaderVer802,beginSrHeaderVer802 + SR_HEADER_VER_802_LEN));
   	}
     int localSrRequestCount802Counter = -1;
     public boolean isSrRequestCount802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrRequestCount802Counter != sharedCounter;
         localSrRequestCount802Counter = sharedCounter; return hasModified;
     }
	protected static final int SR_REQUEST_COUNT_802_LEN = 1;
	/**
	 * 	serialize this SrRequestCount802
	 */
   protected void serializeSrRequestCount802(char[] srRequestCount802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srRequestCount802,0,getStringValue(),beginSrRequestCount802,SR_REQUEST_COUNT_802_LEN);
       localSrRequestCount802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrRequestCount802Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSrRequestCount802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrRequestCount802() {	 
   		return (substring(getStringValue(),beginSrRequestCount802,beginSrRequestCount802 + SR_REQUEST_COUNT_802_LEN));
   	}




}
  
