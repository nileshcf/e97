package com.cloudframe.app.callprm2.dto.serialize;

/**
*  The class LsParm4GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParm4GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm4GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_4_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm4;
	
	/**
	* Constructor for LsParm4GroupSerialized
	**/
    public LsParm4GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm4GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_4_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm4 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsParm4Counter = -1;
     public boolean isLsParm4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsParm4Counter != sharedCounter;
         localLsParm4Counter = sharedCounter; return hasModified;
     }
	protected static final int LS_PARM_4_LEN = 8;
	/**
	 * 	serialize this LsParm4
	 */
   protected void serializeLsParm4(char[] lsParm4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsParm4,0,getStringValue(),beginLsParm4,LS_PARM_4_LEN);
       localLsParm4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsParm4Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshLsParm4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsParm4() {	 
   		return (substring(getStringValue(),beginLsParm4,beginLsParm4 + LS_PARM_4_LEN));
   	}




}
  
