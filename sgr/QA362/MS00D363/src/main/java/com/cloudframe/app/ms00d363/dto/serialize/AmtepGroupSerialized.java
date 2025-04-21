package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class AmtepGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AmtepGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AmtepGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMTEP_GROUP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmtep;
            protected  int beginAmtep0;
            protected  int beginAmtep1;
            protected  int beginAmtep2;
            protected  int beginAmtep3;
            protected  int beginAmtep4;
            protected  int beginAmtep5;
            protected  int beginAmtep6;
            protected  int beginAmtep7;
	
	/**
	* Constructor for AmtepGroupSerialized
	**/
    public AmtepGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AmtepGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMTEP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmtep = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep0 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep2 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep3 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep4 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep5 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep6 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtep7 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmtepCounter = -1;
     public boolean isAmtepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtepCounter != sharedCounter;
         localAmtepCounter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_LEN = 20;
	/**
	 * 	serialize this Amtep
	 */
   protected void serializeAmtep(char[] amtep) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep,0,getStringValue(),beginAmtep,AMTEP_LEN);
       localAmtepCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtepConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep() {	 
   		return (substring(getStringValue(),beginAmtep,beginAmtep + AMTEP_LEN));
   	}
     int localAmtep0Counter = -1;
     public boolean isAmtep0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep0Counter != sharedCounter;
         localAmtep0Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_0_LEN = 20;
	/**
	 * 	serialize this Amtep0
	 */
   protected void serializeAmtep0(char[] amtep0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep0,0,getStringValue(),beginAmtep0,AMTEP_0_LEN);
       localAmtep0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep0Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep0() {	 
   		return (substring(getStringValue(),beginAmtep0,beginAmtep0 + AMTEP_0_LEN));
   	}
     int localAmtep1Counter = -1;
     public boolean isAmtep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep1Counter != sharedCounter;
         localAmtep1Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_1_LEN = 20;
	/**
	 * 	serialize this Amtep1
	 */
   protected void serializeAmtep1(char[] amtep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep1,0,getStringValue(),beginAmtep1,AMTEP_1_LEN);
       localAmtep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep1() {	 
   		return (substring(getStringValue(),beginAmtep1,beginAmtep1 + AMTEP_1_LEN));
   	}
     int localAmtep2Counter = -1;
     public boolean isAmtep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep2Counter != sharedCounter;
         localAmtep2Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_2_LEN = 20;
	/**
	 * 	serialize this Amtep2
	 */
   protected void serializeAmtep2(char[] amtep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep2,0,getStringValue(),beginAmtep2,AMTEP_2_LEN);
       localAmtep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep2() {	 
   		return (substring(getStringValue(),beginAmtep2,beginAmtep2 + AMTEP_2_LEN));
   	}
     int localAmtep3Counter = -1;
     public boolean isAmtep3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep3Counter != sharedCounter;
         localAmtep3Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_3_LEN = 20;
	/**
	 * 	serialize this Amtep3
	 */
   protected void serializeAmtep3(char[] amtep3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep3,0,getStringValue(),beginAmtep3,AMTEP_3_LEN);
       localAmtep3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep3Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep3() {	 
   		return (substring(getStringValue(),beginAmtep3,beginAmtep3 + AMTEP_3_LEN));
   	}
     int localAmtep4Counter = -1;
     public boolean isAmtep4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep4Counter != sharedCounter;
         localAmtep4Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_4_LEN = 20;
	/**
	 * 	serialize this Amtep4
	 */
   protected void serializeAmtep4(char[] amtep4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep4,0,getStringValue(),beginAmtep4,AMTEP_4_LEN);
       localAmtep4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep4Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep4() {	 
   		return (substring(getStringValue(),beginAmtep4,beginAmtep4 + AMTEP_4_LEN));
   	}
     int localAmtep5Counter = -1;
     public boolean isAmtep5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep5Counter != sharedCounter;
         localAmtep5Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_5_LEN = 20;
	/**
	 * 	serialize this Amtep5
	 */
   protected void serializeAmtep5(char[] amtep5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep5,0,getStringValue(),beginAmtep5,AMTEP_5_LEN);
       localAmtep5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep5Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep5() {	 
   		return (substring(getStringValue(),beginAmtep5,beginAmtep5 + AMTEP_5_LEN));
   	}
     int localAmtep6Counter = -1;
     public boolean isAmtep6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep6Counter != sharedCounter;
         localAmtep6Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_6_LEN = 20;
	/**
	 * 	serialize this Amtep6
	 */
   protected void serializeAmtep6(char[] amtep6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep6,0,getStringValue(),beginAmtep6,AMTEP_6_LEN);
       localAmtep6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep6Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep6() {	 
   		return (substring(getStringValue(),beginAmtep6,beginAmtep6 + AMTEP_6_LEN));
   	}
     int localAmtep7Counter = -1;
     public boolean isAmtep7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtep7Counter != sharedCounter;
         localAmtep7Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTEP_7_LEN = 20;
	/**
	 * 	serialize this Amtep7
	 */
   protected void serializeAmtep7(char[] amtep7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtep7,0,getStringValue(),beginAmtep7,AMTEP_7_LEN);
       localAmtep7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtep7Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshAmtep7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtep7() {	 
   		return (substring(getStringValue(),beginAmtep7,beginAmtep7 + AMTEP_7_LEN));
   	}




}
  
