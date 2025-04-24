package com.cloudframe.app.read0003.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 0;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}
     int localRead000401Counter = -1;
     public boolean isRead000401Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRead000401Counter != sharedCounter;
         localRead000401Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRead000401Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localBitmap1644Counter = -1;
     public boolean isBitmap1644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitmap1644Counter != sharedCounter;
         localBitmap1644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBitmap1644Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localBitmap1240Counter = -1;
     public boolean isBitmap1240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitmap1240Counter != sharedCounter;
         localBitmap1240Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBitmap1240Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }




}
  
