package com.cloudframe.app.init2.dto.serialize;

/**
*  The class L6560ParmInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class L6560ParmInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L6560ParmInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_6560_PARM_INFO_LENGTH = 1017;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL6560IoParmInfo;
	
	/**
	* Constructor for L6560ParmInfoSerialized
	**/
    public L6560ParmInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in L6560ParmInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_6560_PARM_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginL6560IoParmInfo = getStartOffset() + 132;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localL6560IoParmInfoCounter = -1;
     public boolean isL6560IoParmInfoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560IoParmInfoCounter != sharedCounter;
         localL6560IoParmInfoCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_IO_PARM_INFO_LEN = 25;
	/**
	 * 	serialize this L6560IoParmInfo
	 */
   protected void serializeL6560IoParmInfo(char[] l6560IoParmInfo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560IoParmInfo,0,getStringValue(),beginL6560IoParmInfo,L_6560_IO_PARM_INFO_LEN);
       localL6560IoParmInfoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560IoParmInfoConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshL6560IoParmInfo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560IoParmInfo() {	 
   		return (substring(getStringValue(),beginL6560IoParmInfo,beginL6560IoParmInfo + L_6560_IO_PARM_INFO_LEN));
   	}




}
  
