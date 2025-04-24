package com.cloudframe.app.ip224620.dto.serialize;

/**
*  The class Pds501Value800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds501Value800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds501Value800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_501_VALUE_800_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds501s1Value800;
            protected  int beginPds501s2Value800;
            protected  int beginPds501s3Value800;
            protected  int beginPds501s4Value800;
	
	/**
	* Constructor for Pds501Value800Serialized
	**/
    public Pds501Value800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Pds501Value800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_501_VALUE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds501s1Value800 = getStartOffset() + 0;	// set offset for serialization
  
             beginPds501s2Value800 = getStartOffset() + 2;	// set offset for serialization
  
             beginPds501s3Value800 = getStartOffset() + 5;	// set offset for serialization
  
             beginPds501s4Value800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPds501s1Value800Counter = -1;
     public boolean isPds501s1Value800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds501s1Value800Counter != sharedCounter;
         localPds501s1Value800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_501S_1_VALUE_800_LEN = 2;
	/**
	 * 	serialize this Pds501s1Value800
	 */
   protected void serializePds501s1Value800(char[] pds501s1Value800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds501s1Value800,0,getStringValue(),beginPds501s1Value800,PDS_501S_1_VALUE_800_LEN);
       localPds501s1Value800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds501s1Value800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPds501s1Value800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds501s1Value800() {	 
   		return (substring(getStringValue(),beginPds501s1Value800,beginPds501s1Value800 + PDS_501S_1_VALUE_800_LEN));
   	}
     int localPds501s2Value800Counter = -1;
     public boolean isPds501s2Value800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds501s2Value800Counter != sharedCounter;
         localPds501s2Value800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_501S_2_VALUE_800_LEN = 3;
	/**
	 * 	serialize this Pds501s2Value800
	 */
   protected void serializePds501s2Value800(char[] pds501s2Value800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds501s2Value800,0,getStringValue(),beginPds501s2Value800,PDS_501S_2_VALUE_800_LEN);
       localPds501s2Value800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds501s2Value800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPds501s2Value800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds501s2Value800() {	 
   		return (substring(getStringValue(),beginPds501s2Value800,beginPds501s2Value800 + PDS_501S_2_VALUE_800_LEN));
   	}
     int localPds501s3Value800Counter = -1;
     public boolean isPds501s3Value800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds501s3Value800Counter != sharedCounter;
         localPds501s3Value800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_501S_3_VALUE_800_LEN = 3;
	/**
	 * 	serialize this Pds501s3Value800
	 */
   protected void serializePds501s3Value800(char[] pds501s3Value800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds501s3Value800,0,getStringValue(),beginPds501s3Value800,PDS_501S_3_VALUE_800_LEN);
       localPds501s3Value800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds501s3Value800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPds501s3Value800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds501s3Value800() {	 
   		return (substring(getStringValue(),beginPds501s3Value800,beginPds501s3Value800 + PDS_501S_3_VALUE_800_LEN));
   	}
     int localPds501s4Value800Counter = -1;
     public boolean isPds501s4Value800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds501s4Value800Counter != sharedCounter;
         localPds501s4Value800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_501S_4_VALUE_800_LEN = 8;
	/**
	 * 	serialize this Pds501s4Value800
	 */
   protected void serializePds501s4Value800(char[] pds501s4Value800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds501s4Value800,0,getStringValue(),beginPds501s4Value800,PDS_501S_4_VALUE_800_LEN);
       localPds501s4Value800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds501s4Value800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPds501s4Value800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds501s4Value800() {	 
   		return (substring(getStringValue(),beginPds501s4Value800,beginPds501s4Value800 + PDS_501S_4_VALUE_800_LEN));
   	}




}
  
