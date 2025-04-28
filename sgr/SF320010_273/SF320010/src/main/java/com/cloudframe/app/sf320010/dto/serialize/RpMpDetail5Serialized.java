package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpDetail5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpDetail5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpDetail5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_DETAIL_5_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpCc5;
            protected  int beginRpMpIpq8;
            protected  int beginRpMpIpq9;
            protected  int beginRpMpIpq10;
            protected  int beginRpMpIpq11;
            protected  int beginRpMpIpq12;
            protected  int beginRpMpIpq13;
            protected  int beginRpMpIpq14;
	
	/**
	* Constructor for RpMpDetail5Serialized
	**/
    public RpMpDetail5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpDetail5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_DETAIL_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpMpCc5 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpMpIpq8 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginRpMpIpq9 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginRpMpIpq10 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginRpMpIpq11 = getStartOffset() + 51;	// set offset for serialization
  
  
             beginRpMpIpq12 = getStartOffset() + 65;	// set offset for serialization
  
  
             beginRpMpIpq13 = getStartOffset() + 79;	// set offset for serialization
  
  
             beginRpMpIpq14 = getStartOffset() + 93;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpMpCc5Counter = -1;
     public boolean isRpMpCc5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpCc5Counter != sharedCounter;
         localRpMpCc5Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_CC_5_LEN = 1;
	/**
	 * 	serialize this RpMpCc5
	 */
   protected void serializeRpMpCc5(char[] rpMpCc5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpCc5,0,getStringValue(),beginRpMpCc5,RP_MP_CC_5_LEN);
       localRpMpCc5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpCc5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpCc5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpCc5() {	 
   		return (substring(getStringValue(),beginRpMpCc5,beginRpMpCc5 + RP_MP_CC_5_LEN));
   	}
     int localRpMpIpq8Counter = -1;
     public boolean isRpMpIpq8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq8Counter != sharedCounter;
         localRpMpIpq8Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_8_LEN = 4;
	/**
	 * 	serialize this RpMpIpq8
	 */
   protected void serializeRpMpIpq8(char[] rpMpIpq8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq8,0,getStringValue(),beginRpMpIpq8,RP_MP_IPQ_8_LEN);
       localRpMpIpq8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq8Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq8() {	 
   		return (substring(getStringValue(),beginRpMpIpq8,beginRpMpIpq8 + RP_MP_IPQ_8_LEN));
   	}
     int localRpMpIpq9Counter = -1;
     public boolean isRpMpIpq9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq9Counter != sharedCounter;
         localRpMpIpq9Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_9_LEN = 4;
	/**
	 * 	serialize this RpMpIpq9
	 */
   protected void serializeRpMpIpq9(char[] rpMpIpq9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq9,0,getStringValue(),beginRpMpIpq9,RP_MP_IPQ_9_LEN);
       localRpMpIpq9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq9Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq9() {	 
   		return (substring(getStringValue(),beginRpMpIpq9,beginRpMpIpq9 + RP_MP_IPQ_9_LEN));
   	}
     int localRpMpIpq10Counter = -1;
     public boolean isRpMpIpq10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq10Counter != sharedCounter;
         localRpMpIpq10Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_10_LEN = 4;
	/**
	 * 	serialize this RpMpIpq10
	 */
   protected void serializeRpMpIpq10(char[] rpMpIpq10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq10,0,getStringValue(),beginRpMpIpq10,RP_MP_IPQ_10_LEN);
       localRpMpIpq10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq10Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq10() {	 
   		return (substring(getStringValue(),beginRpMpIpq10,beginRpMpIpq10 + RP_MP_IPQ_10_LEN));
   	}
     int localRpMpIpq11Counter = -1;
     public boolean isRpMpIpq11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq11Counter != sharedCounter;
         localRpMpIpq11Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_11_LEN = 4;
	/**
	 * 	serialize this RpMpIpq11
	 */
   protected void serializeRpMpIpq11(char[] rpMpIpq11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq11,0,getStringValue(),beginRpMpIpq11,RP_MP_IPQ_11_LEN);
       localRpMpIpq11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq11Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq11() {	 
   		return (substring(getStringValue(),beginRpMpIpq11,beginRpMpIpq11 + RP_MP_IPQ_11_LEN));
   	}
     int localRpMpIpq12Counter = -1;
     public boolean isRpMpIpq12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq12Counter != sharedCounter;
         localRpMpIpq12Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_12_LEN = 4;
	/**
	 * 	serialize this RpMpIpq12
	 */
   protected void serializeRpMpIpq12(char[] rpMpIpq12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq12,0,getStringValue(),beginRpMpIpq12,RP_MP_IPQ_12_LEN);
       localRpMpIpq12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq12Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq12() {	 
   		return (substring(getStringValue(),beginRpMpIpq12,beginRpMpIpq12 + RP_MP_IPQ_12_LEN));
   	}
     int localRpMpIpq13Counter = -1;
     public boolean isRpMpIpq13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq13Counter != sharedCounter;
         localRpMpIpq13Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_13_LEN = 4;
	/**
	 * 	serialize this RpMpIpq13
	 */
   protected void serializeRpMpIpq13(char[] rpMpIpq13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq13,0,getStringValue(),beginRpMpIpq13,RP_MP_IPQ_13_LEN);
       localRpMpIpq13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq13Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq13() {	 
   		return (substring(getStringValue(),beginRpMpIpq13,beginRpMpIpq13 + RP_MP_IPQ_13_LEN));
   	}
     int localRpMpIpq14Counter = -1;
     public boolean isRpMpIpq14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq14Counter != sharedCounter;
         localRpMpIpq14Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_14_LEN = 4;
	/**
	 * 	serialize this RpMpIpq14
	 */
   protected void serializeRpMpIpq14(char[] rpMpIpq14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq14,0,getStringValue(),beginRpMpIpq14,RP_MP_IPQ_14_LEN);
       localRpMpIpq14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq14Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq14() {	 
   		return (substring(getStringValue(),beginRpMpIpq14,beginRpMpIpq14 + RP_MP_IPQ_14_LEN));
   	}




}
  
