package com.cloudframe.app.cfsort10.file.records.serialize;

/**
*  The class WorkClientSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
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
            protected  int beginClientNameWk;
            protected  int beginClientNumberWk;
            protected  int beginClientPhNoWk;
	
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
             beginClientNameWk = getStartOffset() + 0;	// set offset for serialization
  
             beginClientNumberWk = getStartOffset() + 20;	// set offset for serialization
  
             beginClientPhNoWk = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClientNameWkCounter = -1;
     public boolean isClientNameWkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClientNameWkCounter != sharedCounter;
         localClientNameWkCounter = sharedCounter; return hasModified;
     }
	protected static final int CLIENT_NAME_WK_LEN = 20;
	/**
	 * 	serialize this ClientNameWk
	 */
   protected void serializeClientNameWk(char[] clientNameWk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clientNameWk,0,getStringValue(),beginClientNameWk,CLIENT_NAME_WK_LEN);
       localClientNameWkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClientNameWkConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshClientNameWk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClientNameWk() {	 
   		return (substring(getStringValue(),beginClientNameWk,beginClientNameWk + CLIENT_NAME_WK_LEN));
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
     int localClientPhNoWkCounter = -1;
     public boolean isClientPhNoWkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClientPhNoWkCounter != sharedCounter;
         localClientPhNoWkCounter = sharedCounter; return hasModified;
     }
	protected static final int CLIENT_PH_NO_WK_LEN = 14;
	/**
	 * 	serialize this ClientPhNoWk
	 */
   protected void serializeClientPhNoWk(char[] clientPhNoWk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clientPhNoWk,0,getStringValue(),beginClientPhNoWk,CLIENT_PH_NO_WK_LEN);
       localClientPhNoWkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClientPhNoWkConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshClientPhNoWk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClientPhNoWk() {	 
   		return (substring(getStringValue(),beginClientPhNoWk,beginClientPhNoWk + CLIENT_PH_NO_WK_LEN));
   	}




}
  
