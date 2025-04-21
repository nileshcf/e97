package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class Db85102dDb2cloneRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db85102dDb2cloneRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db85102dDb2cloneRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_85102D_DB_2CLONE_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb85102dDb2CloneNum;
	
	/**
	* Constructor for Db85102dDb2cloneRecSerialized
	**/
    public Db85102dDb2cloneRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db85102dDb2cloneRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_85102D_DB_2CLONE_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDb85102dDb2CloneNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb85102dDb2CloneNumCounter = -1;
     public boolean isDb85102dDb2CloneNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dDb2CloneNumCounter != sharedCounter;
         localDb85102dDb2CloneNumCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_DB_2_CLONE_NUM_LEN = 3;
	/**
	 * 	serialize this Db85102dDb2CloneNum
	 */
   protected void serializeDb85102dDb2CloneNum(char[] db85102dDb2CloneNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dDb2CloneNum,0,getStringValue(),beginDb85102dDb2CloneNum,DB_85102D_DB_2_CLONE_NUM_LEN);
       localDb85102dDb2CloneNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dDb2CloneNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDb85102dDb2CloneNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dDb2CloneNum() {	 
   		return (substring(getStringValue(),beginDb85102dDb2CloneNum,beginDb85102dDb2CloneNum + DB_85102D_DB_2_CLONE_NUM_LEN));
   	}




}
  
