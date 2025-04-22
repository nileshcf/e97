package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnPgmAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPgmAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPgmAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PGM_AREA_LENGTH = 1024;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnErrMsgArea;
            protected  int beginCmnErrMsgBytes;
	
	/**
	* Constructor for CmnPgmAreaSerialized
	**/
    public CmnPgmAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPgmAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPgmAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CmnPgmAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CmnPgmAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PGM_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnErrMsgArea = getStartOffset() + 91;	// set offset for serialization
  
             beginCmnErrMsgBytes = getStartOffset() + 91;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnErrMsgAreaCounter = -1;
     public boolean isCmnErrMsgAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrMsgAreaCounter != sharedCounter;
         localCmnErrMsgAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_MSG_AREA_LEN = 512;
	/**
	 * 	serialize this CmnErrMsgArea
	 */
   protected void serializeCmnErrMsgArea(char[] cmnErrMsgArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrMsgArea,0,getStringValue(),beginCmnErrMsgArea,CMN_ERR_MSG_AREA_LEN);
       localCmnErrMsgAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrMsgAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 512 ,false, false);
   }
    /**
	 *	refreshCmnErrMsgArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrMsgArea() {	 
   		return (substring(getStringValue(),beginCmnErrMsgArea,beginCmnErrMsgArea + CMN_ERR_MSG_AREA_LEN));
   	}
     int localCmnErrMsgBytesCounter = -1;
     public boolean isCmnErrMsgBytesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrMsgBytesCounter != sharedCounter;
         localCmnErrMsgBytesCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_MSG_BYTES_LEN = 512;
	/**
	 * 	serialize this CmnErrMsgBytes
	 */
   protected void serializeCmnErrMsgBytes(char[] cmnErrMsgBytes) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrMsgBytes,0,getStringValue(),beginCmnErrMsgBytes,CMN_ERR_MSG_BYTES_LEN);
       localCmnErrMsgBytesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrMsgBytesConstraints(char[] value) {
   			return super.checkConstraints(value , 512 ,false, false);
   }
    /**
	 *	refreshCmnErrMsgBytes is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrMsgBytes() {	 
   		return (substring(getStringValue(),beginCmnErrMsgBytes,beginCmnErrMsgBytes + CMN_ERR_MSG_BYTES_LEN));
   	}




}
  
