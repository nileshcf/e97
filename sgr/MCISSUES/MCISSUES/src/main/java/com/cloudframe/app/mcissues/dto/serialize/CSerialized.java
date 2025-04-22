package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class CSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCVar1;
            protected  int beginCVar2;
            protected  int beginCVar4;
	
	/**
	* Constructor for CSerialized
	**/
    public CSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCVar1 = getStartOffset() + 0;	// set offset for serialization
  
             beginCVar2 = getStartOffset() + 5;	// set offset for serialization
  
             beginCVar4 = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCVar1Counter = -1;
     public boolean isCVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCVar1Counter != sharedCounter;
         localCVar1Counter = sharedCounter; return hasModified;
     }
	protected static final int C_VAR_1_LEN = 5;
	/**
	 * 	serialize this CVar1
	 */
   protected void serializeCVar1(char[] cVar1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cVar1,0,getStringValue(),beginCVar1,C_VAR_1_LEN);
       localCVar1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCVar1Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCVar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCVar1() {	 
   		return (substring(getStringValue(),beginCVar1,beginCVar1 + C_VAR_1_LEN));
   	}
     int localCVar2Counter = -1;
     public boolean isCVar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCVar2Counter != sharedCounter;
         localCVar2Counter = sharedCounter; return hasModified;
     }
	protected static final int C_VAR_2_LEN = 10;
	/**
	 * 	serialize this CVar2
	 */
   protected void serializeCVar2(char[] cVar2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cVar2,0,getStringValue(),beginCVar2,C_VAR_2_LEN);
       localCVar2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCVar2Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCVar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCVar2() {	 
   		return (substring(getStringValue(),beginCVar2,beginCVar2 + C_VAR_2_LEN));
   	}
     int localCVar4Counter = -1;
     public boolean isCVar4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCVar4Counter != sharedCounter;
         localCVar4Counter = sharedCounter; return hasModified;
     }
	protected static final int C_VAR_4_LEN = 35;
	/**
	 * 	serialize this CVar4
	 */
   protected void serializeCVar4(char[] cVar4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cVar4,0,getStringValue(),beginCVar4,C_VAR_4_LEN);
       localCVar4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCVar4Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshCVar4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCVar4() {	 
   		return (substring(getStringValue(),beginCVar4,beginCVar4 + C_VAR_4_LEN));
   	}




}
  
