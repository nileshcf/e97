package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class AmtdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AmtdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AmtdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMTD_GROUP_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmtd;
            protected  int beginAmtd0;
            protected  int beginAmtd1;
            protected  int beginAmtd2;
            protected  int beginAmtd3;
            protected  int beginAmtd4;
            protected  int beginAmtd5;
            protected  int beginAmtd6;
            protected  int beginAmtd7;
	
	/**
	* Constructor for AmtdGroupSerialized
	**/
    public AmtdGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AmtdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMTD_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmtd = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd0 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd2 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd3 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd4 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd5 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd6 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtd7 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmtdCounter = -1;
     public boolean isAmtdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdCounter != sharedCounter;
         localAmtdCounter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_LEN = 18;
	/**
	 * 	serialize this Amtd
	 */
   protected void serializeAmtd(char[] amtd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd,0,getStringValue(),beginAmtd,AMTD_LEN);
       localAmtdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd() {	 
   		return (substring(getStringValue(),beginAmtd,beginAmtd + AMTD_LEN));
   	}
     int localAmtd0Counter = -1;
     public boolean isAmtd0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd0Counter != sharedCounter;
         localAmtd0Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_0_LEN = 18;
	/**
	 * 	serialize this Amtd0
	 */
   protected void serializeAmtd0(char[] amtd0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd0,0,getStringValue(),beginAmtd0,AMTD_0_LEN);
       localAmtd0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd0Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd0() {	 
   		return (substring(getStringValue(),beginAmtd0,beginAmtd0 + AMTD_0_LEN));
   	}
     int localAmtd1Counter = -1;
     public boolean isAmtd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd1Counter != sharedCounter;
         localAmtd1Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_1_LEN = 18;
	/**
	 * 	serialize this Amtd1
	 */
   protected void serializeAmtd1(char[] amtd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd1,0,getStringValue(),beginAmtd1,AMTD_1_LEN);
       localAmtd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd1Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd1() {	 
   		return (substring(getStringValue(),beginAmtd1,beginAmtd1 + AMTD_1_LEN));
   	}
     int localAmtd2Counter = -1;
     public boolean isAmtd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd2Counter != sharedCounter;
         localAmtd2Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_2_LEN = 18;
	/**
	 * 	serialize this Amtd2
	 */
   protected void serializeAmtd2(char[] amtd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd2,0,getStringValue(),beginAmtd2,AMTD_2_LEN);
       localAmtd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd2Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd2() {	 
   		return (substring(getStringValue(),beginAmtd2,beginAmtd2 + AMTD_2_LEN));
   	}
     int localAmtd3Counter = -1;
     public boolean isAmtd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd3Counter != sharedCounter;
         localAmtd3Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_3_LEN = 18;
	/**
	 * 	serialize this Amtd3
	 */
   protected void serializeAmtd3(char[] amtd3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd3,0,getStringValue(),beginAmtd3,AMTD_3_LEN);
       localAmtd3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd3Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd3() {	 
   		return (substring(getStringValue(),beginAmtd3,beginAmtd3 + AMTD_3_LEN));
   	}
     int localAmtd4Counter = -1;
     public boolean isAmtd4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd4Counter != sharedCounter;
         localAmtd4Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_4_LEN = 18;
	/**
	 * 	serialize this Amtd4
	 */
   protected void serializeAmtd4(char[] amtd4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd4,0,getStringValue(),beginAmtd4,AMTD_4_LEN);
       localAmtd4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd4Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd4() {	 
   		return (substring(getStringValue(),beginAmtd4,beginAmtd4 + AMTD_4_LEN));
   	}
     int localAmtd5Counter = -1;
     public boolean isAmtd5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd5Counter != sharedCounter;
         localAmtd5Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_5_LEN = 18;
	/**
	 * 	serialize this Amtd5
	 */
   protected void serializeAmtd5(char[] amtd5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd5,0,getStringValue(),beginAmtd5,AMTD_5_LEN);
       localAmtd5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd5Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd5() {	 
   		return (substring(getStringValue(),beginAmtd5,beginAmtd5 + AMTD_5_LEN));
   	}
     int localAmtd6Counter = -1;
     public boolean isAmtd6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd6Counter != sharedCounter;
         localAmtd6Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_6_LEN = 18;
	/**
	 * 	serialize this Amtd6
	 */
   protected void serializeAmtd6(char[] amtd6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd6,0,getStringValue(),beginAmtd6,AMTD_6_LEN);
       localAmtd6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd6Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd6() {	 
   		return (substring(getStringValue(),beginAmtd6,beginAmtd6 + AMTD_6_LEN));
   	}
     int localAmtd7Counter = -1;
     public boolean isAmtd7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtd7Counter != sharedCounter;
         localAmtd7Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTD_7_LEN = 18;
	/**
	 * 	serialize this Amtd7
	 */
   protected void serializeAmtd7(char[] amtd7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtd7,0,getStringValue(),beginAmtd7,AMTD_7_LEN);
       localAmtd7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtd7Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshAmtd7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtd7() {	 
   		return (substring(getStringValue(),beginAmtd7,beginAmtd7 + AMTD_7_LEN));
   	}




}
  
