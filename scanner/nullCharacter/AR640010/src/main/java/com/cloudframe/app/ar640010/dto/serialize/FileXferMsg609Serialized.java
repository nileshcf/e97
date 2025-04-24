package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FileXferMsg609Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileXferMsg609Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileXferMsg609Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_XFER_MSG_609_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftFileName609;
	
	/**
	* Constructor for FileXferMsg609Serialized
	**/
    public FileXferMsg609Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileXferMsg609Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_XFER_MSG_609_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginGftFileName609 = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGftFileName609Counter = -1;
     public boolean isGftFileName609Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftFileName609Counter != sharedCounter;
         localGftFileName609Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_FILE_NAME_609_LEN = 44;
	/**
	 * 	serialize this GftFileName609
	 */
   protected void serializeGftFileName609(char[] gftFileName609) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftFileName609,0,getStringValue(),beginGftFileName609,GFT_FILE_NAME_609_LEN);
       localGftFileName609Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftFileName609Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshGftFileName609 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftFileName609() {	 
   		return (substring(getStringValue(),beginGftFileName609,beginGftFileName609 + GFT_FILE_NAME_609_LEN));
   	}




}
  
