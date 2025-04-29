package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CutoffEndGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CutoffEndGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CutoffEndGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUTOFF_END_GROUP_800_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCutoffEnd800;
	
	/**
	* Constructor for CutoffEndGroup800Serialized
	**/
    public CutoffEndGroup800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in CutoffEndGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUTOFF_END_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCutoffEnd800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCutoffEnd800Counter = -1;
     public boolean isCutoffEnd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffEnd800Counter != sharedCounter;
         localCutoffEnd800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_END_800_LEN = 26;
	/**
	 * 	serialize this CutoffEnd800
	 */
   protected void serializeCutoffEnd800(char[] cutoffEnd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffEnd800,0,getStringValue(),beginCutoffEnd800,CUTOFF_END_800_LEN);
       localCutoffEnd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffEnd800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffEnd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffEnd800() {	 
   		return (substring(getStringValue(),beginCutoffEnd800,beginCutoffEnd800 + CUTOFF_END_800_LEN));
   	}




}
  
