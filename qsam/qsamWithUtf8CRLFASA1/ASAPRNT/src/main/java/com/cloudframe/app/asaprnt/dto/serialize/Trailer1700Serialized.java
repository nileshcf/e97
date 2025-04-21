package com.cloudframe.app.asaprnt.dto.serialize;

/**
*  The class Trailer1700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Trailer1700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Trailer1700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRAILER_1700_LENGTH = 139;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginT1TotLen700;
	
	/**
	* Constructor for Trailer1700Serialized
	**/
    public Trailer1700Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Trailer1700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRAILER_1700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginT1TotLen700 = getStartOffset() + 39;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localT1TotLen700Counter = -1;
     public boolean isT1TotLen700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localT1TotLen700Counter != sharedCounter;
         localT1TotLen700Counter = sharedCounter; return hasModified;
     }
	protected static final int T_1_TOT_LEN_700_LEN = 7;
	/**
	 * 	serialize this T1TotLen700
	 */
   protected void serializeT1TotLen700(char[] t1TotLen700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(t1TotLen700,0,getStringValue(),beginT1TotLen700,T_1_TOT_LEN_700_LEN);
       localT1TotLen700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkT1TotLen700Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshT1TotLen700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshT1TotLen700() {	 
   		return (substring(getStringValue(),beginT1TotLen700,beginT1TotLen700 + T_1_TOT_LEN_700_LEN));
   	}




}
  
