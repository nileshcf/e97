package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class McdynamErrorMsgTxt640Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class McdynamErrorMsgTxt640Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(McdynamErrorMsgTxt640Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCDYNAM_ERROR_MSG_TXT_640_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMcdynamRequest640;
            protected  int beginDsn640;
            protected  int beginMcdynamRc640;
	
	/**
	* Constructor for McdynamErrorMsgTxt640Serialized
	**/
    public McdynamErrorMsgTxt640Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in McdynamErrorMsgTxt640Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCDYNAM_ERROR_MSG_TXT_640_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMcdynamRequest640 = getStartOffset() + 0;	// set offset for serialization
  
             beginDsn640 = getStartOffset() + 10;	// set offset for serialization
  
  
  
             beginMcdynamRc640 = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcdynamRequest640Counter = -1;
     public boolean isMcdynamRequest640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcdynamRequest640Counter != sharedCounter;
         localMcdynamRequest640Counter = sharedCounter; return hasModified;
     }
	protected static final int MCDYNAM_REQUEST_640_LEN = 10;
	/**
	 * 	serialize this McdynamRequest640
	 */
   protected void serializeMcdynamRequest640(char[] mcdynamRequest640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcdynamRequest640,0,getStringValue(),beginMcdynamRequest640,MCDYNAM_REQUEST_640_LEN);
       localMcdynamRequest640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcdynamRequest640Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMcdynamRequest640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcdynamRequest640() {	 
   		return (substring(getStringValue(),beginMcdynamRequest640,beginMcdynamRequest640 + MCDYNAM_REQUEST_640_LEN));
   	}
     int localDsn640Counter = -1;
     public boolean isDsn640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsn640Counter != sharedCounter;
         localDsn640Counter = sharedCounter; return hasModified;
     }
	protected static final int DSN_640_LEN = 39;
	/**
	 * 	serialize this Dsn640
	 */
   protected void serializeDsn640(char[] dsn640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsn640,0,getStringValue(),beginDsn640,DSN_640_LEN);
       localDsn640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsn640Constraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
    /**
	 *	refreshDsn640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsn640() {	 
   		return (substring(getStringValue(),beginDsn640,beginDsn640 + DSN_640_LEN));
   	}
     int localMcdynamRc640Counter = -1;
     public boolean isMcdynamRc640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcdynamRc640Counter != sharedCounter;
         localMcdynamRc640Counter = sharedCounter; return hasModified;
     }
	protected static final int MCDYNAM_RC_640_LEN = 4;
	/**
	 * 	serialize this McdynamRc640
	 */
   protected void serializeMcdynamRc640(char[] mcdynamRc640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcdynamRc640,0,getStringValue(),beginMcdynamRc640,MCDYNAM_RC_640_LEN);
       localMcdynamRc640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcdynamRc640Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMcdynamRc640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcdynamRc640() {	 
   		return (substring(getStringValue(),beginMcdynamRc640,beginMcdynamRc640 + MCDYNAM_RC_640_LEN));
   	}




}
  
