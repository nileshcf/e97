package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class InfoSecRcd800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InfoSecRcd800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InfoSecRcd800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INFO_SEC_RCD_800_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecClass800;
            protected  int beginRecType800;
            protected  int beginLocalMipId800;
            protected  int beginRemMipId800;
            protected  int beginOperId800;
            protected  int beginMessage800;
	
	/**
	* Constructor for InfoSecRcd800Serialized
	**/
    public InfoSecRcd800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InfoSecRcd800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INFO_SEC_RCD_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginRecClass800 = getStartOffset() + 19;	// set offset for serialization
  
             beginRecType800 = getStartOffset() + 20;	// set offset for serialization
  
             beginLocalMipId800 = getStartOffset() + 21;	// set offset for serialization
  
             beginRemMipId800 = getStartOffset() + 24;	// set offset for serialization
  
             beginOperId800 = getStartOffset() + 27;	// set offset for serialization
  
             beginMessage800 = getStartOffset() + 34;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRecClass800Counter = -1;
     public boolean isRecClass800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecClass800Counter != sharedCounter;
         localRecClass800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_CLASS_800_LEN = 1;
	/**
	 * 	serialize this RecClass800
	 */
   protected void serializeRecClass800(char[] recClass800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recClass800,0,getStringValue(),beginRecClass800,REC_CLASS_800_LEN);
       localRecClass800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecClass800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRecClass800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecClass800() {	 
   		return (substring(getStringValue(),beginRecClass800,beginRecClass800 + REC_CLASS_800_LEN));
   	}
     int localRecType800Counter = -1;
     public boolean isRecType800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecType800Counter != sharedCounter;
         localRecType800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_TYPE_800_LEN = 1;
	/**
	 * 	serialize this RecType800
	 */
   protected void serializeRecType800(char[] recType800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recType800,0,getStringValue(),beginRecType800,REC_TYPE_800_LEN);
       localRecType800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecType800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRecType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecType800() {	 
   		return (substring(getStringValue(),beginRecType800,beginRecType800 + REC_TYPE_800_LEN));
   	}
     int localLocalMipId800Counter = -1;
     public boolean isLocalMipId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLocalMipId800Counter != sharedCounter;
         localLocalMipId800Counter = sharedCounter; return hasModified;
     }
	protected static final int LOCAL_MIP_ID_800_LEN = 3;
	/**
	 * 	serialize this LocalMipId800
	 */
   protected void serializeLocalMipId800(char[] localMipId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(localMipId800,0,getStringValue(),beginLocalMipId800,LOCAL_MIP_ID_800_LEN);
       localLocalMipId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLocalMipId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLocalMipId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLocalMipId800() {	 
   		return (substring(getStringValue(),beginLocalMipId800,beginLocalMipId800 + LOCAL_MIP_ID_800_LEN));
   	}
     int localRemMipId800Counter = -1;
     public boolean isRemMipId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRemMipId800Counter != sharedCounter;
         localRemMipId800Counter = sharedCounter; return hasModified;
     }
	protected static final int REM_MIP_ID_800_LEN = 3;
	/**
	 * 	serialize this RemMipId800
	 */
   protected void serializeRemMipId800(char[] remMipId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(remMipId800,0,getStringValue(),beginRemMipId800,REM_MIP_ID_800_LEN);
       localRemMipId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRemMipId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRemMipId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRemMipId800() {	 
   		return (substring(getStringValue(),beginRemMipId800,beginRemMipId800 + REM_MIP_ID_800_LEN));
   	}
     int localOperId800Counter = -1;
     public boolean isOperId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOperId800Counter != sharedCounter;
         localOperId800Counter = sharedCounter; return hasModified;
     }
	protected static final int OPER_ID_800_LEN = 7;
	/**
	 * 	serialize this OperId800
	 */
   protected void serializeOperId800(char[] operId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(operId800,0,getStringValue(),beginOperId800,OPER_ID_800_LEN);
       localOperId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOperId800Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshOperId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOperId800() {	 
   		return (substring(getStringValue(),beginOperId800,beginOperId800 + OPER_ID_800_LEN));
   	}
     int localMessage800Counter = -1;
     public boolean isMessage800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage800Counter != sharedCounter;
         localMessage800Counter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_800_LEN = 40;
	/**
	 * 	serialize this Message800
	 */
   protected void serializeMessage800(char[] message800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(message800,0,getStringValue(),beginMessage800,MESSAGE_800_LEN);
       localMessage800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessage800Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshMessage800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessage800() {	 
   		return (substring(getStringValue(),beginMessage800,beginMessage800 + MESSAGE_800_LEN));
   	}




}
  
