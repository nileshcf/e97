package com.cloudframe.app.cfsort03.file.records.serialize;

/**
*  The class WorkClientSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkClientSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkClientSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_CLIENT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClientNumberWk;
	
	/**
	* Constructor for WorkClientSerialized
	**/
    public WorkClientSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkClientSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_CLIENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginClientNumberWk = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClientNumberWkCounter = -1;
     public boolean isClientNumberWkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClientNumberWkCounter != sharedCounter;
         localClientNumberWkCounter = sharedCounter; return hasModified;
     }
	protected static final int CLIENT_NUMBER_WK_LEN = 7;
	/**
	 * 	serialize this ClientNumberWk
	 */
   protected void serializeClientNumberWk(char[] clientNumberWk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clientNumberWk,0,getStringValue(),beginClientNumberWk,CLIENT_NUMBER_WK_LEN);
       localClientNumberWkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClientNumberWkConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshClientNumberWk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClientNumberWk() {	 
   		return (substring(getStringValue(),beginClientNumberWk,beginClientNumberWk + CLIENT_NUMBER_WK_LEN));
   	}




}
  
