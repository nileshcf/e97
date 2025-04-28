package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpDetail6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpDetail6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpDetail6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_DETAIL_6_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpCc6;
            protected  int beginRpMpIpq15;
            protected  int beginRpMpIpq16;
            protected  int beginRpMpIpq17;
            protected  int beginRpMpIpq18;
            protected  int beginRpMpIpq19;
            protected  int beginRpMpIpq20;
	
	/**
	* Constructor for RpMpDetail6Serialized
	**/
    public RpMpDetail6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpDetail6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_DETAIL_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpMpCc6 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpMpIpq15 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginRpMpIpq16 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginRpMpIpq17 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginRpMpIpq18 = getStartOffset() + 51;	// set offset for serialization
  
  
             beginRpMpIpq19 = getStartOffset() + 65;	// set offset for serialization
  
  
             beginRpMpIpq20 = getStartOffset() + 79;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpMpCc6Counter = -1;
     public boolean isRpMpCc6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpCc6Counter != sharedCounter;
         localRpMpCc6Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_CC_6_LEN = 1;
	/**
	 * 	serialize this RpMpCc6
	 */
   protected void serializeRpMpCc6(char[] rpMpCc6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpCc6,0,getStringValue(),beginRpMpCc6,RP_MP_CC_6_LEN);
       localRpMpCc6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpCc6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpCc6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpCc6() {	 
   		return (substring(getStringValue(),beginRpMpCc6,beginRpMpCc6 + RP_MP_CC_6_LEN));
   	}
     int localRpMpIpq15Counter = -1;
     public boolean isRpMpIpq15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq15Counter != sharedCounter;
         localRpMpIpq15Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_15_LEN = 4;
	/**
	 * 	serialize this RpMpIpq15
	 */
   protected void serializeRpMpIpq15(char[] rpMpIpq15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq15,0,getStringValue(),beginRpMpIpq15,RP_MP_IPQ_15_LEN);
       localRpMpIpq15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq15Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq15() {	 
   		return (substring(getStringValue(),beginRpMpIpq15,beginRpMpIpq15 + RP_MP_IPQ_15_LEN));
   	}
     int localRpMpIpq16Counter = -1;
     public boolean isRpMpIpq16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq16Counter != sharedCounter;
         localRpMpIpq16Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_16_LEN = 4;
	/**
	 * 	serialize this RpMpIpq16
	 */
   protected void serializeRpMpIpq16(char[] rpMpIpq16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq16,0,getStringValue(),beginRpMpIpq16,RP_MP_IPQ_16_LEN);
       localRpMpIpq16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq16Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq16() {	 
   		return (substring(getStringValue(),beginRpMpIpq16,beginRpMpIpq16 + RP_MP_IPQ_16_LEN));
   	}
     int localRpMpIpq17Counter = -1;
     public boolean isRpMpIpq17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq17Counter != sharedCounter;
         localRpMpIpq17Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_17_LEN = 4;
	/**
	 * 	serialize this RpMpIpq17
	 */
   protected void serializeRpMpIpq17(char[] rpMpIpq17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq17,0,getStringValue(),beginRpMpIpq17,RP_MP_IPQ_17_LEN);
       localRpMpIpq17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq17Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq17() {	 
   		return (substring(getStringValue(),beginRpMpIpq17,beginRpMpIpq17 + RP_MP_IPQ_17_LEN));
   	}
     int localRpMpIpq18Counter = -1;
     public boolean isRpMpIpq18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq18Counter != sharedCounter;
         localRpMpIpq18Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_18_LEN = 4;
	/**
	 * 	serialize this RpMpIpq18
	 */
   protected void serializeRpMpIpq18(char[] rpMpIpq18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq18,0,getStringValue(),beginRpMpIpq18,RP_MP_IPQ_18_LEN);
       localRpMpIpq18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq18Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq18() {	 
   		return (substring(getStringValue(),beginRpMpIpq18,beginRpMpIpq18 + RP_MP_IPQ_18_LEN));
   	}
     int localRpMpIpq19Counter = -1;
     public boolean isRpMpIpq19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq19Counter != sharedCounter;
         localRpMpIpq19Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_19_LEN = 4;
	/**
	 * 	serialize this RpMpIpq19
	 */
   protected void serializeRpMpIpq19(char[] rpMpIpq19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq19,0,getStringValue(),beginRpMpIpq19,RP_MP_IPQ_19_LEN);
       localRpMpIpq19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq19Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq19() {	 
   		return (substring(getStringValue(),beginRpMpIpq19,beginRpMpIpq19 + RP_MP_IPQ_19_LEN));
   	}
     int localRpMpIpq20Counter = -1;
     public boolean isRpMpIpq20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIpq20Counter != sharedCounter;
         localRpMpIpq20Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_IPQ_20_LEN = 4;
	/**
	 * 	serialize this RpMpIpq20
	 */
   protected void serializeRpMpIpq20(char[] rpMpIpq20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIpq20,0,getStringValue(),beginRpMpIpq20,RP_MP_IPQ_20_LEN);
       localRpMpIpq20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIpq20Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIpq20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIpq20() {	 
   		return (substring(getStringValue(),beginRpMpIpq20,beginRpMpIpq20 + RP_MP_IPQ_20_LEN));
   	}




}
  
