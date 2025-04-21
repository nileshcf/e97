package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class AmtfGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AmtfGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AmtfGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMTF_GROUP_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmtf;
            protected  int beginAmtf0;
            protected  int beginAmtf1;
            protected  int beginAmtf2;
            protected  int beginAmtf3;
            protected  int beginAmtf4;
            protected  int beginAmtf5;
            protected  int beginAmtf6;
            protected  int beginAmtf7;
	
	/**
	* Constructor for AmtfGroupSerialized
	**/
    public AmtfGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AmtfGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMTF_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmtf = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf0 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf2 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf3 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf4 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf5 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf6 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtf7 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmtfCounter = -1;
     public boolean isAmtfModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtfCounter != sharedCounter;
         localAmtfCounter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_LEN = 11;
	/**
	 * 	serialize this Amtf
	 */
   protected void serializeAmtf(char[] amtf) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf,0,getStringValue(),beginAmtf,AMTF_LEN);
       localAmtfCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtfConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf() {	 
   		return (substring(getStringValue(),beginAmtf,beginAmtf + AMTF_LEN));
   	}
     int localAmtf0Counter = -1;
     public boolean isAmtf0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf0Counter != sharedCounter;
         localAmtf0Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_0_LEN = 11;
	/**
	 * 	serialize this Amtf0
	 */
   protected void serializeAmtf0(char[] amtf0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf0,0,getStringValue(),beginAmtf0,AMTF_0_LEN);
       localAmtf0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf0Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf0() {	 
   		return (substring(getStringValue(),beginAmtf0,beginAmtf0 + AMTF_0_LEN));
   	}
     int localAmtf1Counter = -1;
     public boolean isAmtf1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf1Counter != sharedCounter;
         localAmtf1Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_1_LEN = 11;
	/**
	 * 	serialize this Amtf1
	 */
   protected void serializeAmtf1(char[] amtf1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf1,0,getStringValue(),beginAmtf1,AMTF_1_LEN);
       localAmtf1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf1Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf1() {	 
   		return (substring(getStringValue(),beginAmtf1,beginAmtf1 + AMTF_1_LEN));
   	}
     int localAmtf2Counter = -1;
     public boolean isAmtf2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf2Counter != sharedCounter;
         localAmtf2Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_2_LEN = 11;
	/**
	 * 	serialize this Amtf2
	 */
   protected void serializeAmtf2(char[] amtf2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf2,0,getStringValue(),beginAmtf2,AMTF_2_LEN);
       localAmtf2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf2Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf2() {	 
   		return (substring(getStringValue(),beginAmtf2,beginAmtf2 + AMTF_2_LEN));
   	}
     int localAmtf3Counter = -1;
     public boolean isAmtf3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf3Counter != sharedCounter;
         localAmtf3Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_3_LEN = 11;
	/**
	 * 	serialize this Amtf3
	 */
   protected void serializeAmtf3(char[] amtf3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf3,0,getStringValue(),beginAmtf3,AMTF_3_LEN);
       localAmtf3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf3Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf3() {	 
   		return (substring(getStringValue(),beginAmtf3,beginAmtf3 + AMTF_3_LEN));
   	}
     int localAmtf4Counter = -1;
     public boolean isAmtf4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf4Counter != sharedCounter;
         localAmtf4Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_4_LEN = 11;
	/**
	 * 	serialize this Amtf4
	 */
   protected void serializeAmtf4(char[] amtf4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf4,0,getStringValue(),beginAmtf4,AMTF_4_LEN);
       localAmtf4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf4Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf4() {	 
   		return (substring(getStringValue(),beginAmtf4,beginAmtf4 + AMTF_4_LEN));
   	}
     int localAmtf5Counter = -1;
     public boolean isAmtf5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf5Counter != sharedCounter;
         localAmtf5Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_5_LEN = 11;
	/**
	 * 	serialize this Amtf5
	 */
   protected void serializeAmtf5(char[] amtf5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf5,0,getStringValue(),beginAmtf5,AMTF_5_LEN);
       localAmtf5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf5Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf5() {	 
   		return (substring(getStringValue(),beginAmtf5,beginAmtf5 + AMTF_5_LEN));
   	}
     int localAmtf6Counter = -1;
     public boolean isAmtf6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf6Counter != sharedCounter;
         localAmtf6Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_6_LEN = 11;
	/**
	 * 	serialize this Amtf6
	 */
   protected void serializeAmtf6(char[] amtf6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf6,0,getStringValue(),beginAmtf6,AMTF_6_LEN);
       localAmtf6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf6Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf6() {	 
   		return (substring(getStringValue(),beginAmtf6,beginAmtf6 + AMTF_6_LEN));
   	}
     int localAmtf7Counter = -1;
     public boolean isAmtf7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtf7Counter != sharedCounter;
         localAmtf7Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTF_7_LEN = 11;
	/**
	 * 	serialize this Amtf7
	 */
   protected void serializeAmtf7(char[] amtf7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtf7,0,getStringValue(),beginAmtf7,AMTF_7_LEN);
       localAmtf7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtf7Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshAmtf7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtf7() {	 
   		return (substring(getStringValue(),beginAmtf7,beginAmtf7 + AMTF_7_LEN));
   	}




}
  
