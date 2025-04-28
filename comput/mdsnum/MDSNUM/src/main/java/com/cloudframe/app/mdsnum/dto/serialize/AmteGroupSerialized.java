package com.cloudframe.app.mdsnum.dto.serialize;

/**
*  The class AmteGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AmteGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AmteGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMTE_GROUP_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmte;
            protected  int beginAmte0;
            protected  int beginAmte1;
            protected  int beginAmte2;
            protected  int beginAmte3;
            protected  int beginAmte4;
            protected  int beginAmte5;
            protected  int beginAmte6;
            protected  int beginAmte7;
	
	/**
	* Constructor for AmteGroupSerialized
	**/
    public AmteGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AmteGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMTE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmte = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte0 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte2 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte3 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte4 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte5 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte6 = getStartOffset() + 0;	// set offset for serialization
  
             beginAmte7 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmteCounter = -1;
     public boolean isAmteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmteCounter != sharedCounter;
         localAmteCounter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_LEN = 16;
	/**
	 * 	serialize this Amte
	 */
   protected void serializeAmte(char[] amte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte,0,getStringValue(),beginAmte,AMTE_LEN);
       localAmteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmteConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte() {	 
   		return (substring(getStringValue(),beginAmte,beginAmte + AMTE_LEN));
   	}
     int localAmte0Counter = -1;
     public boolean isAmte0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte0Counter != sharedCounter;
         localAmte0Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_0_LEN = 16;
	/**
	 * 	serialize this Amte0
	 */
   protected void serializeAmte0(char[] amte0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte0,0,getStringValue(),beginAmte0,AMTE_0_LEN);
       localAmte0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte0Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte0() {	 
   		return (substring(getStringValue(),beginAmte0,beginAmte0 + AMTE_0_LEN));
   	}
     int localAmte1Counter = -1;
     public boolean isAmte1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte1Counter != sharedCounter;
         localAmte1Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_1_LEN = 16;
	/**
	 * 	serialize this Amte1
	 */
   protected void serializeAmte1(char[] amte1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte1,0,getStringValue(),beginAmte1,AMTE_1_LEN);
       localAmte1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte1Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte1() {	 
   		return (substring(getStringValue(),beginAmte1,beginAmte1 + AMTE_1_LEN));
   	}
     int localAmte2Counter = -1;
     public boolean isAmte2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte2Counter != sharedCounter;
         localAmte2Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_2_LEN = 16;
	/**
	 * 	serialize this Amte2
	 */
   protected void serializeAmte2(char[] amte2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte2,0,getStringValue(),beginAmte2,AMTE_2_LEN);
       localAmte2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte2Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte2() {	 
   		return (substring(getStringValue(),beginAmte2,beginAmte2 + AMTE_2_LEN));
   	}
     int localAmte3Counter = -1;
     public boolean isAmte3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte3Counter != sharedCounter;
         localAmte3Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_3_LEN = 16;
	/**
	 * 	serialize this Amte3
	 */
   protected void serializeAmte3(char[] amte3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte3,0,getStringValue(),beginAmte3,AMTE_3_LEN);
       localAmte3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte3Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte3() {	 
   		return (substring(getStringValue(),beginAmte3,beginAmte3 + AMTE_3_LEN));
   	}
     int localAmte4Counter = -1;
     public boolean isAmte4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte4Counter != sharedCounter;
         localAmte4Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_4_LEN = 16;
	/**
	 * 	serialize this Amte4
	 */
   protected void serializeAmte4(char[] amte4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte4,0,getStringValue(),beginAmte4,AMTE_4_LEN);
       localAmte4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte4Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte4() {	 
   		return (substring(getStringValue(),beginAmte4,beginAmte4 + AMTE_4_LEN));
   	}
     int localAmte5Counter = -1;
     public boolean isAmte5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte5Counter != sharedCounter;
         localAmte5Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_5_LEN = 16;
	/**
	 * 	serialize this Amte5
	 */
   protected void serializeAmte5(char[] amte5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte5,0,getStringValue(),beginAmte5,AMTE_5_LEN);
       localAmte5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte5Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte5() {	 
   		return (substring(getStringValue(),beginAmte5,beginAmte5 + AMTE_5_LEN));
   	}
     int localAmte6Counter = -1;
     public boolean isAmte6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte6Counter != sharedCounter;
         localAmte6Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_6_LEN = 16;
	/**
	 * 	serialize this Amte6
	 */
   protected void serializeAmte6(char[] amte6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte6,0,getStringValue(),beginAmte6,AMTE_6_LEN);
       localAmte6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte6Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte6() {	 
   		return (substring(getStringValue(),beginAmte6,beginAmte6 + AMTE_6_LEN));
   	}
     int localAmte7Counter = -1;
     public boolean isAmte7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmte7Counter != sharedCounter;
         localAmte7Counter = sharedCounter; return hasModified;
     }
	protected static final int AMTE_7_LEN = 16;
	/**
	 * 	serialize this Amte7
	 */
   protected void serializeAmte7(char[] amte7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(amte7,0,getStringValue(),beginAmte7,AMTE_7_LEN);
       localAmte7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAmte7Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAmte7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAmte7() {	 
   		return (substring(getStringValue(),beginAmte7,beginAmte7 + AMTE_7_LEN));
   	}




}
  
