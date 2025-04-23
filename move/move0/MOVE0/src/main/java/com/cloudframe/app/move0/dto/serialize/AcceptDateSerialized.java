package com.cloudframe.app.move0.dto.serialize;

/**
*  The class AcceptDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcceptDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcceptDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACCEPT_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginYyyy01;
            protected  int beginMm01;
            protected  int beginDd01;
	
	/**
	* Constructor for AcceptDateSerialized
	**/
    public AcceptDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcceptDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACCEPT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginYyyy01 = getStartOffset() + 0;	// set offset for serialization
  
             beginMm01 = getStartOffset() + 4;	// set offset for serialization
  
             beginDd01 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localYyyy01Counter = -1;
     public boolean isYyyy01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localYyyy01Counter != sharedCounter;
         localYyyy01Counter = sharedCounter; return hasModified;
     }
	protected static final int YYYY_01_LEN = 4;
	/**
	 * 	serialize this Yyyy01
	 */
   protected void serializeYyyy01(char[] yyyy01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(yyyy01,0,getStringValue(),beginYyyy01,YYYY_01_LEN);
       localYyyy01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkYyyy01Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshYyyy01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshYyyy01() {	 
   		return (substring(getStringValue(),beginYyyy01,beginYyyy01 + YYYY_01_LEN));
   	}
     int localMm01Counter = -1;
     public boolean isMm01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMm01Counter != sharedCounter;
         localMm01Counter = sharedCounter; return hasModified;
     }
	protected static final int MM_01_LEN = 2;
	/**
	 * 	serialize this Mm01
	 */
   protected void serializeMm01(char[] mm01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mm01,0,getStringValue(),beginMm01,MM_01_LEN);
       localMm01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMm01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMm01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMm01() {	 
   		return (substring(getStringValue(),beginMm01,beginMm01 + MM_01_LEN));
   	}
     int localDd01Counter = -1;
     public boolean isDd01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDd01Counter != sharedCounter;
         localDd01Counter = sharedCounter; return hasModified;
     }
	protected static final int DD_01_LEN = 2;
	/**
	 * 	serialize this Dd01
	 */
   protected void serializeDd01(char[] dd01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dd01,0,getStringValue(),beginDd01,DD_01_LEN);
       localDd01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDd01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDd01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDd01() {	 
   		return (substring(getStringValue(),beginDd01,beginDd01 + DD_01_LEN));
   	}




}
  
