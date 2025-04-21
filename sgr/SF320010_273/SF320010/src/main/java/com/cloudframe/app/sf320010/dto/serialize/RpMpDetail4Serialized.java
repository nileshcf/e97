package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpDetail4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpDetail4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpDetail4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_DETAIL_4_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpCc4;
            protected  int beginRpMpIpq1;
            protected  int beginRpMpIpq2;
            protected  int beginRpMpIpq3;
            protected  int beginRpMpIpq4;
            protected  int beginRpMpIpq5;
            protected  int beginRpMpIpq6;
            protected  int beginRpMpIpq7;
	
	/**
	* Constructor for RpMpDetail4Serialized
	**/
    public RpMpDetail4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpDetail4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_DETAIL_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpMpCc4 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpMpIpq1 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginRpMpIpq2 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginRpMpIpq3 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginRpMpIpq4 = getStartOffset() + 51;	// set offset for serialization
  
  
             beginRpMpIpq5 = getStartOffset() + 65;	// set offset for serialization
  
  
             beginRpMpIpq6 = getStartOffset() + 79;	// set offset for serialization
  
  
             beginRpMpIpq7 = getStartOffset() + 93;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpMpCc4Counter = -1;
     public boolean isRpMpCc4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpCc4Counter != sharedCounter;
         localRpMpCc4Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_CC_4_LEN = 1;
	/**
	 * 	serialize this RpMpCc4
	 */
   protected void serializeRpMpCc4(char[] rpMpCc4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpCc4,0,getStringValue(),beginRpMpCc4,RP_MP_CC_4_LEN);
       localRpMpCc4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpCc4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpCc4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpCc4() {	 
   		return (substring(getStringValue(),beginRpMpCc4,beginRpMpCc4 + RP_MP_CC_4_LEN));
   	}
     int localRpMpIpq1Counter = -1;
     public boolean isRpMpIpq1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq1Counter != sharedCounter;
         localRpMpIpq1Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_1_LEN = 4;
	/**
	 * 	serialize this RpMpIpq1
	 */
   protected void serializeRpMpIpq1(char[] rpMpIpq1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq1,0,getStringValue(),beginRpMpIpq1,RP_MP_IPQ_1_LEN);
       localRpMpIpq1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq1Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq1() {	 
   		return (substring(getStringValue(),beginRpMpIpq1,beginRpMpIpq1 + RP_MP_IPQ_1_LEN));
   	}
     int localRpMpIpq2Counter = -1;
     public boolean isRpMpIpq2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq2Counter != sharedCounter;
         localRpMpIpq2Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_2_LEN = 4;
	/**
	 * 	serialize this RpMpIpq2
	 */
   protected void serializeRpMpIpq2(char[] rpMpIpq2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq2,0,getStringValue(),beginRpMpIpq2,RP_MP_IPQ_2_LEN);
       localRpMpIpq2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq2Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq2() {	 
   		return (substring(getStringValue(),beginRpMpIpq2,beginRpMpIpq2 + RP_MP_IPQ_2_LEN));
   	}
     int localRpMpIpq3Counter = -1;
     public boolean isRpMpIpq3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq3Counter != sharedCounter;
         localRpMpIpq3Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_3_LEN = 4;
	/**
	 * 	serialize this RpMpIpq3
	 */
   protected void serializeRpMpIpq3(char[] rpMpIpq3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq3,0,getStringValue(),beginRpMpIpq3,RP_MP_IPQ_3_LEN);
       localRpMpIpq3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq3Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq3() {	 
   		return (substring(getStringValue(),beginRpMpIpq3,beginRpMpIpq3 + RP_MP_IPQ_3_LEN));
   	}
     int localRpMpIpq4Counter = -1;
     public boolean isRpMpIpq4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq4Counter != sharedCounter;
         localRpMpIpq4Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_4_LEN = 4;
	/**
	 * 	serialize this RpMpIpq4
	 */
   protected void serializeRpMpIpq4(char[] rpMpIpq4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq4,0,getStringValue(),beginRpMpIpq4,RP_MP_IPQ_4_LEN);
       localRpMpIpq4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq4Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq4() {	 
   		return (substring(getStringValue(),beginRpMpIpq4,beginRpMpIpq4 + RP_MP_IPQ_4_LEN));
   	}
     int localRpMpIpq5Counter = -1;
     public boolean isRpMpIpq5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq5Counter != sharedCounter;
         localRpMpIpq5Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_5_LEN = 4;
	/**
	 * 	serialize this RpMpIpq5
	 */
   protected void serializeRpMpIpq5(char[] rpMpIpq5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq5,0,getStringValue(),beginRpMpIpq5,RP_MP_IPQ_5_LEN);
       localRpMpIpq5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq5Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq5() {	 
   		return (substring(getStringValue(),beginRpMpIpq5,beginRpMpIpq5 + RP_MP_IPQ_5_LEN));
   	}
     int localRpMpIpq6Counter = -1;
     public boolean isRpMpIpq6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq6Counter != sharedCounter;
         localRpMpIpq6Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_6_LEN = 4;
	/**
	 * 	serialize this RpMpIpq6
	 */
   protected void serializeRpMpIpq6(char[] rpMpIpq6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq6,0,getStringValue(),beginRpMpIpq6,RP_MP_IPQ_6_LEN);
       localRpMpIpq6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq6Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq6() {	 
   		return (substring(getStringValue(),beginRpMpIpq6,beginRpMpIpq6 + RP_MP_IPQ_6_LEN));
   	}
     int localRpMpIpq7Counter = -1;
     public boolean isRpMpIpq7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq7Counter != sharedCounter;
         localRpMpIpq7Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_7_LEN = 4;
	/**
	 * 	serialize this RpMpIpq7
	 */
   protected void serializeRpMpIpq7(char[] rpMpIpq7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq7,0,getStringValue(),beginRpMpIpq7,RP_MP_IPQ_7_LEN);
       localRpMpIpq7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq7Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq7() {	 
   		return (substring(getStringValue(),beginRpMpIpq7,beginRpMpIpq7 + RP_MP_IPQ_7_LEN));
   	}




}
  
