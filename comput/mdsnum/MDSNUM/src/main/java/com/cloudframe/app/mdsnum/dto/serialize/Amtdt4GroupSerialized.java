package com.cloudframe.app.mdsnum.dto.serialize;

/**
*  The class Amtdt4GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Amtdt4GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Amtdt4GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMTDT_4_GROUP_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmtdt4;
            protected  int beginAmtdt40;
            protected  int beginAmtdt41;
            protected  int beginAmtdt42;
            protected  int beginAmtdt43;
            protected  int beginAmtdt44;
            protected  int beginAmtdt45;
            protected  int beginAmtdt46;
            protected  int beginAmtdt47;
	
	/**
	* Constructor for Amtdt4GroupSerialized
	**/
    public Amtdt4GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Amtdt4GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMTDT_4_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmtdt4 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt40 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt41 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt42 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt43 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt44 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt45 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt46 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmtdt47 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmtdt4Counter = -1;
     public boolean isAmtdt4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt4Counter != sharedCounter;
         localAmtdt4Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_4_LEN = 24;
	/**
	 * 	serialize this Amtdt4
	 */
   protected void serializeAmtdt4(char[] amtdt4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt4,0,getStringValue(),beginAmtdt4,AMTDT_4_LEN);
       localAmtdt4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt4Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt4() {	 
   		return (substring(getStringValue(),beginAmtdt4,beginAmtdt4 + AMTDT_4_LEN));
   	}
     int localAmtdt40Counter = -1;
     public boolean isAmtdt40Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt40Counter != sharedCounter;
         localAmtdt40Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_40_LEN = 24;
	/**
	 * 	serialize this Amtdt40
	 */
   protected void serializeAmtdt40(char[] amtdt40) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt40,0,getStringValue(),beginAmtdt40,AMTDT_40_LEN);
       localAmtdt40Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt40Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt40 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt40() {	 
   		return (substring(getStringValue(),beginAmtdt40,beginAmtdt40 + AMTDT_40_LEN));
   	}
     int localAmtdt41Counter = -1;
     public boolean isAmtdt41Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt41Counter != sharedCounter;
         localAmtdt41Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_41_LEN = 24;
	/**
	 * 	serialize this Amtdt41
	 */
   protected void serializeAmtdt41(char[] amtdt41) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt41,0,getStringValue(),beginAmtdt41,AMTDT_41_LEN);
       localAmtdt41Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt41Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt41 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt41() {	 
   		return (substring(getStringValue(),beginAmtdt41,beginAmtdt41 + AMTDT_41_LEN));
   	}
     int localAmtdt42Counter = -1;
     public boolean isAmtdt42Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt42Counter != sharedCounter;
         localAmtdt42Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_42_LEN = 24;
	/**
	 * 	serialize this Amtdt42
	 */
   protected void serializeAmtdt42(char[] amtdt42) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt42,0,getStringValue(),beginAmtdt42,AMTDT_42_LEN);
       localAmtdt42Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt42Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt42 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt42() {	 
   		return (substring(getStringValue(),beginAmtdt42,beginAmtdt42 + AMTDT_42_LEN));
   	}
     int localAmtdt43Counter = -1;
     public boolean isAmtdt43Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt43Counter != sharedCounter;
         localAmtdt43Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_43_LEN = 24;
	/**
	 * 	serialize this Amtdt43
	 */
   protected void serializeAmtdt43(char[] amtdt43) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt43,0,getStringValue(),beginAmtdt43,AMTDT_43_LEN);
       localAmtdt43Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt43Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt43 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt43() {	 
   		return (substring(getStringValue(),beginAmtdt43,beginAmtdt43 + AMTDT_43_LEN));
   	}
     int localAmtdt44Counter = -1;
     public boolean isAmtdt44Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt44Counter != sharedCounter;
         localAmtdt44Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_44_LEN = 24;
	/**
	 * 	serialize this Amtdt44
	 */
   protected void serializeAmtdt44(char[] amtdt44) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt44,0,getStringValue(),beginAmtdt44,AMTDT_44_LEN);
       localAmtdt44Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt44Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt44 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt44() {	 
   		return (substring(getStringValue(),beginAmtdt44,beginAmtdt44 + AMTDT_44_LEN));
   	}
     int localAmtdt45Counter = -1;
     public boolean isAmtdt45Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt45Counter != sharedCounter;
         localAmtdt45Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_45_LEN = 24;
	/**
	 * 	serialize this Amtdt45
	 */
   protected void serializeAmtdt45(char[] amtdt45) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt45,0,getStringValue(),beginAmtdt45,AMTDT_45_LEN);
       localAmtdt45Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt45Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt45 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt45() {	 
   		return (substring(getStringValue(),beginAmtdt45,beginAmtdt45 + AMTDT_45_LEN));
   	}
     int localAmtdt46Counter = -1;
     public boolean isAmtdt46Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt46Counter != sharedCounter;
         localAmtdt46Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_46_LEN = 24;
	/**
	 * 	serialize this Amtdt46
	 */
   protected void serializeAmtdt46(char[] amtdt46) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt46,0,getStringValue(),beginAmtdt46,AMTDT_46_LEN);
       localAmtdt46Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt46Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt46 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt46() {	 
   		return (substring(getStringValue(),beginAmtdt46,beginAmtdt46 + AMTDT_46_LEN));
   	}
     int localAmtdt47Counter = -1;
     public boolean isAmtdt47Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtdt47Counter != sharedCounter;
         localAmtdt47Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTDT_47_LEN = 24;
	/**
	 * 	serialize this Amtdt47
	 */
   protected void serializeAmtdt47(char[] amtdt47) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amtdt47,0,getStringValue(),beginAmtdt47,AMTDT_47_LEN);
       localAmtdt47Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmtdt47Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshAmtdt47 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmtdt47() {	 
   		return (substring(getStringValue(),beginAmtdt47,beginAmtdt47 + AMTDT_47_LEN));
   	}




}
  
