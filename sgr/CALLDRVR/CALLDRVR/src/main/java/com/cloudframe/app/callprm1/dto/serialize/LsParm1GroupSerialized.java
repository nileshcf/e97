package com.cloudframe.app.callprm1.dto.serialize;

/**
*  The class LsParm1GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParm1GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm1GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_1_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm1;
	
	/**
	* Constructor for LsParm1GroupSerialized
	**/
    public LsParm1GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm1GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_1_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsParm1Counter = -1;
     public boolean isLsParm1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsParm1Counter != sharedCounter;
         localLsParm1Counter = sharedCounter; return hasModified;
     }
	protected static final int LS_PARM_1_LEN = 8;
	/**
	 * 	serialize this LsParm1
	 */
   protected void serializeLsParm1(char[] lsParm1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsParm1,0,getStringValue(),beginLsParm1,LS_PARM_1_LEN);
       localLsParm1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsParm1Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshLsParm1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsParm1() {	 
   		return (substring(getStringValue(),beginLsParm1,beginLsParm1 + LS_PARM_1_LEN));
   	}




}
  
