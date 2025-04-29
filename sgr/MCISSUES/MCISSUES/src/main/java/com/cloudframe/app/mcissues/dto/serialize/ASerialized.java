package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class ASerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAVar1;
            protected  int beginAVar2;
            protected  int beginAVar4;
	
	/**
	* Constructor for ASerialized
	**/
    public ASerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAVar1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAVar2 = getStartOffset() + 5;	// set offset for serialization
  
             beginAVar4 = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAVar1Counter = -1;
     public boolean isAVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAVar1Counter != sharedCounter;
         localAVar1Counter = sharedCounter; return hasModified;
     }
	protected static final int A_VAR_1_LEN = 5;
	/**
	 * 	serialize this AVar1
	 */
   protected void serializeAVar1(char[] aVar1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aVar1,0,getStringValue(),beginAVar1,A_VAR_1_LEN);
       localAVar1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAVar1Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshAVar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAVar1() {	 
   		return (substring(getStringValue(),beginAVar1,beginAVar1 + A_VAR_1_LEN));
   	}
     int localAVar2Counter = -1;
     public boolean isAVar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAVar2Counter != sharedCounter;
         localAVar2Counter = sharedCounter; return hasModified;
     }
	protected static final int A_VAR_2_LEN = 10;
	/**
	 * 	serialize this AVar2
	 */
   protected void serializeAVar2(char[] aVar2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aVar2,0,getStringValue(),beginAVar2,A_VAR_2_LEN);
       localAVar2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAVar2Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshAVar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAVar2() {	 
   		return (substring(getStringValue(),beginAVar2,beginAVar2 + A_VAR_2_LEN));
   	}
     int localAVar4Counter = -1;
     public boolean isAVar4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAVar4Counter != sharedCounter;
         localAVar4Counter = sharedCounter; return hasModified;
     }
	protected static final int A_VAR_4_LEN = 25;
	/**
	 * 	serialize this AVar4
	 */
   protected void serializeAVar4(char[] aVar4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aVar4,0,getStringValue(),beginAVar4,A_VAR_4_LEN);
       localAVar4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAVar4Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshAVar4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAVar4() {	 
   		return (substring(getStringValue(),beginAVar4,beginAVar4 + A_VAR_4_LEN));
   	}




}
  
