package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class LrmStat630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LrmStat630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LrmStat630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LRM_STAT_630_LENGTH = 330;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLrmStatValues630;
           protected int beginLrmStatTable630;
           protected static final int LRM_STAT_TABLE_630_SIZE = 5;
	
	/**
	* Constructor for LrmStat630Serialized
	**/
    public LrmStat630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LrmStat630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LRM_STAT_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLrmStatValues630 = getStartOffset() + 0;	// set offset for serialization
  
	        beginLrmStatTable630 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
     int localLrmStatValues630Counter = -1;
     public boolean isLrmStatValues630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLrmStatValues630Counter != sharedCounter;
         localLrmStatValues630Counter = sharedCounter; return hasModified;
     }
	protected static final int LRM_STAT_VALUES_630_LEN = 330;
	/**
	 * 	serialize this LrmStatValues630
	 */
   protected void serializeLrmStatValues630(char[] lrmStatValues630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lrmStatValues630,0,getStringValue(),beginLrmStatValues630,LRM_STAT_VALUES_630_LEN);
       localLrmStatValues630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLrmStatValues630Constraints(char[] value) {
   			return super.checkConstraints(value , 330 ,false, false);
   }
    /**
	 *	refreshLrmStatValues630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLrmStatValues630() {	 
   		return (substring(getStringValue(),beginLrmStatValues630,beginLrmStatValues630 + LRM_STAT_VALUES_630_LEN));
   	}

		public int lrmStatTable630Size() {
			return LRM_STAT_TABLE_630_SIZE;
		}



}
  
