package com.cloudframe.app.proga1.dto.serialize;

/**
*  The class Jobname800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Jobname800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Jobname800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int JOBNAME_800_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginJobGroup800;
            protected  int beginPgmModule800;
	
	/**
	* Constructor for Jobname800Serialized
	**/
    public Jobname800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Jobname800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(JOBNAME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginJobGroup800 = getStartOffset() + 0;	// set offset for serialization
  
             beginPgmModule800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localJobGroup800Counter = -1;
     public boolean isJobGroup800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobGroup800Counter != sharedCounter;
         localJobGroup800Counter = sharedCounter; return hasModified;
     }
	protected static final int JOB_GROUP_800_LEN = 6;
	/**
	 * 	serialize this JobGroup800
	 */
   protected void serializeJobGroup800(char[] jobGroup800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(jobGroup800,0,getStringValue(),beginJobGroup800,JOB_GROUP_800_LEN);
       localJobGroup800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkJobGroup800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshJobGroup800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshJobGroup800() {	 
   		return (substring(getStringValue(),beginJobGroup800,beginJobGroup800 + JOB_GROUP_800_LEN));
   	}
     int localPgmModule800Counter = -1;
     public boolean isPgmModule800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmModule800Counter != sharedCounter;
         localPgmModule800Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_MODULE_800_LEN = 8;
	/**
	 * 	serialize this PgmModule800
	 */
   protected void serializePgmModule800(char[] pgmModule800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmModule800,0,getStringValue(),beginPgmModule800,PGM_MODULE_800_LEN);
       localPgmModule800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmModule800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmModule800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmModule800() {	 
   		return (substring(getStringValue(),beginPgmModule800,beginPgmModule800 + PGM_MODULE_800_LEN));
   	}




}
  
