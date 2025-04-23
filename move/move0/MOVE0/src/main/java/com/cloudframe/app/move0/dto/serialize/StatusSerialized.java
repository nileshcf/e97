package com.cloudframe.app.move0.dto.serialize;

/**
*  The class StatusSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StatusSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StatusSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STATUS_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGnpHHeaderTimeSs1;
            protected  int beginGnpHHeaderTimeSs2;
            protected  int beginGnpHHeaderTimeSs3;
	
	/**
	* Constructor for StatusSerialized
	**/
    public StatusSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StatusSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STATUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginGnpHHeaderTimeSs1 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginGnpHHeaderTimeSs2 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginGnpHHeaderTimeSs3 = getStartOffset() + 8;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localGnpHHeaderTimeSs1Counter = -1;
     public boolean isGnpHHeaderTimeSs1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGnpHHeaderTimeSs1Counter != sharedCounter;
         localGnpHHeaderTimeSs1Counter = sharedCounter; return hasModified;
     }
	protected static final int GNP_HHEADER_TIME_SS_1_LEN = 2;
	/**
	 * 	serialize this GnpHHeaderTimeSs1
	 */
   protected void serializeGnpHHeaderTimeSs1(char[] gnpHHeaderTimeSs1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gnpHHeaderTimeSs1,0,getStringValue(),beginGnpHHeaderTimeSs1,GNP_HHEADER_TIME_SS_1_LEN);
       localGnpHHeaderTimeSs1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGnpHHeaderTimeSs1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGnpHHeaderTimeSs1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGnpHHeaderTimeSs1() {	 
   		return (substring(getStringValue(),beginGnpHHeaderTimeSs1,beginGnpHHeaderTimeSs1 + GNP_HHEADER_TIME_SS_1_LEN));
   	}
     int localGnpHHeaderTimeSs2Counter = -1;
     public boolean isGnpHHeaderTimeSs2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGnpHHeaderTimeSs2Counter != sharedCounter;
         localGnpHHeaderTimeSs2Counter = sharedCounter; return hasModified;
     }
	protected static final int GNP_HHEADER_TIME_SS_2_LEN = 2;
	/**
	 * 	serialize this GnpHHeaderTimeSs2
	 */
   protected void serializeGnpHHeaderTimeSs2(char[] gnpHHeaderTimeSs2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gnpHHeaderTimeSs2,0,getStringValue(),beginGnpHHeaderTimeSs2,GNP_HHEADER_TIME_SS_2_LEN);
       localGnpHHeaderTimeSs2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGnpHHeaderTimeSs2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGnpHHeaderTimeSs2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGnpHHeaderTimeSs2() {	 
   		return (substring(getStringValue(),beginGnpHHeaderTimeSs2,beginGnpHHeaderTimeSs2 + GNP_HHEADER_TIME_SS_2_LEN));
   	}
     int localGnpHHeaderTimeSs3Counter = -1;
     public boolean isGnpHHeaderTimeSs3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGnpHHeaderTimeSs3Counter != sharedCounter;
         localGnpHHeaderTimeSs3Counter = sharedCounter; return hasModified;
     }
	protected static final int GNP_HHEADER_TIME_SS_3_LEN = 2;
	/**
	 * 	serialize this GnpHHeaderTimeSs3
	 */
   protected void serializeGnpHHeaderTimeSs3(char[] gnpHHeaderTimeSs3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gnpHHeaderTimeSs3,0,getStringValue(),beginGnpHHeaderTimeSs3,GNP_HHEADER_TIME_SS_3_LEN);
       localGnpHHeaderTimeSs3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGnpHHeaderTimeSs3Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGnpHHeaderTimeSs3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGnpHHeaderTimeSs3() {	 
   		return (substring(getStringValue(),beginGnpHHeaderTimeSs3,beginGnpHHeaderTimeSs3 + GNP_HHEADER_TIME_SS_3_LEN));
   	}




}
  
