package com.cloudframe.app.iovb32k.file.records.serialize;

/**
*  The class OutRecMaxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutRecMaxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutRecMaxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUT_REC_MAX_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutRecMaxString;
	
	/**
	* Constructor for OutRecMaxSerialized
	**/
    public OutRecMaxSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutRecMaxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUT_REC_MAX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutRecMaxString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutRecMaxStringCounter = -1;
     public boolean isOutRecMaxStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutRecMaxStringCounter != sharedCounter;
         localOutRecMaxStringCounter = sharedCounter; return hasModified;
     }
	protected static final int OUT_REC_MAX_STRING_LEN = 32752;
	/**
	 * 	serialize this OutRecMaxString
	 */
   protected void serializeOutRecMaxString(char[] outRecMaxString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outRecMaxString,0,getStringValue(),beginOutRecMaxString,OUT_REC_MAX_STRING_LEN);
       localOutRecMaxStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutRecMaxStringConstraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshOutRecMaxString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutRecMaxString() {	 
   		return (substring(getStringValue(),beginOutRecMaxString,beginOutRecMaxString + OUT_REC_MAX_STRING_LEN));
   	}




}
  
