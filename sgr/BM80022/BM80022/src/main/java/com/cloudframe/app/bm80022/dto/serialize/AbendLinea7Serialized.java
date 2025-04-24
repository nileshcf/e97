package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class AbendLinea7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendLinea7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendLinea7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_LINEA_7_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller602;
            protected  int beginFiller18;
            protected  int beginAbendProg;
            protected  int beginFiller19;
            protected  int beginFiller20;
            protected  int beginAbendParraf;
            protected  int beginFiller21;
            protected  int beginFiller22;
            protected  int beginAbendSenten;
            protected  int beginFiller802;
	
	/**
	* Constructor for AbendLinea7Serialized
	**/
    public AbendLinea7Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendLinea7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_LINEA_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFiller602 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller18 = getStartOffset() + 1;	// set offset for serialization
  
             beginAbendProg = getStartOffset() + 12;	// set offset for serialization
  
             beginFiller19 = getStartOffset() + 20;	// set offset for serialization
  
             beginFiller20 = getStartOffset() + 24;	// set offset for serialization
  
             beginAbendParraf = getStartOffset() + 34;	// set offset for serialization
  
             beginFiller21 = getStartOffset() + 44;	// set offset for serialization
  
             beginFiller22 = getStartOffset() + 46;	// set offset for serialization
  
             beginAbendSenten = getStartOffset() + 58;	// set offset for serialization
  
             beginFiller802 = getStartOffset() + 79;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFiller602Counter = -1;
     public boolean isFiller602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller602Counter != sharedCounter;
         localFiller602Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_602_LEN = 1;
	/**
	 * 	serialize this Filler602
	 */
   protected void serializeFiller602(char[] filler602) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler602,0,getStringValue(),beginFiller602,FILLER_602_LEN);
       localFiller602Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller602Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller602() {	 
   		return (substring(getStringValue(),beginFiller602,beginFiller602 + FILLER_602_LEN));
   	}
     int localFiller18Counter = -1;
     public boolean isFiller18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller18Counter != sharedCounter;
         localFiller18Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_18_LEN = 11;
	/**
	 * 	serialize this Filler18
	 */
   protected void serializeFiller18(char[] filler18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler18,0,getStringValue(),beginFiller18,FILLER_18_LEN);
       localFiller18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller18Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshFiller18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller18() {	 
   		return (substring(getStringValue(),beginFiller18,beginFiller18 + FILLER_18_LEN));
   	}
     int localAbendProgCounter = -1;
     public boolean isAbendProgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendProgCounter != sharedCounter;
         localAbendProgCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_PROG_LEN = 8;
	/**
	 * 	serialize this AbendProg
	 */
   protected void serializeAbendProg(char[] abendProg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendProg,0,getStringValue(),beginAbendProg,ABEND_PROG_LEN);
       localAbendProgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendProgConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAbendProg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendProg() {	 
   		return (substring(getStringValue(),beginAbendProg,beginAbendProg + ABEND_PROG_LEN));
   	}
     int localFiller19Counter = -1;
     public boolean isFiller19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller19Counter != sharedCounter;
         localFiller19Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_19_LEN = 4;
	/**
	 * 	serialize this Filler19
	 */
   protected void serializeFiller19(char[] filler19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler19,0,getStringValue(),beginFiller19,FILLER_19_LEN);
       localFiller19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller19Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFiller19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller19() {	 
   		return (substring(getStringValue(),beginFiller19,beginFiller19 + FILLER_19_LEN));
   	}
     int localFiller20Counter = -1;
     public boolean isFiller20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller20Counter != sharedCounter;
         localFiller20Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_20_LEN = 10;
	/**
	 * 	serialize this Filler20
	 */
   protected void serializeFiller20(char[] filler20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler20,0,getStringValue(),beginFiller20,FILLER_20_LEN);
       localFiller20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller20Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFiller20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller20() {	 
   		return (substring(getStringValue(),beginFiller20,beginFiller20 + FILLER_20_LEN));
   	}
     int localAbendParrafCounter = -1;
     public boolean isAbendParrafModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendParrafCounter != sharedCounter;
         localAbendParrafCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_PARRAF_LEN = 10;
	/**
	 * 	serialize this AbendParraf
	 */
   protected void serializeAbendParraf(char[] abendParraf) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendParraf,0,getStringValue(),beginAbendParraf,ABEND_PARRAF_LEN);
       localAbendParrafCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendParrafConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshAbendParraf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendParraf() {	 
   		return (substring(getStringValue(),beginAbendParraf,beginAbendParraf + ABEND_PARRAF_LEN));
   	}
     int localFiller21Counter = -1;
     public boolean isFiller21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller21Counter != sharedCounter;
         localFiller21Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_21_LEN = 2;
	/**
	 * 	serialize this Filler21
	 */
   protected void serializeFiller21(char[] filler21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler21,0,getStringValue(),beginFiller21,FILLER_21_LEN);
       localFiller21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller21Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFiller21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller21() {	 
   		return (substring(getStringValue(),beginFiller21,beginFiller21 + FILLER_21_LEN));
   	}
     int localFiller22Counter = -1;
     public boolean isFiller22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller22Counter != sharedCounter;
         localFiller22Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_22_LEN = 12;
	/**
	 * 	serialize this Filler22
	 */
   protected void serializeFiller22(char[] filler22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler22,0,getStringValue(),beginFiller22,FILLER_22_LEN);
       localFiller22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller22Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshFiller22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller22() {	 
   		return (substring(getStringValue(),beginFiller22,beginFiller22 + FILLER_22_LEN));
   	}
     int localAbendSentenCounter = -1;
     public boolean isAbendSentenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSentenCounter != sharedCounter;
         localAbendSentenCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_SENTEN_LEN = 21;
	/**
	 * 	serialize this AbendSenten
	 */
   protected void serializeAbendSenten(char[] abendSenten) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendSenten,0,getStringValue(),beginAbendSenten,ABEND_SENTEN_LEN);
       localAbendSentenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendSentenConstraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshAbendSenten is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendSenten() {	 
   		return (substring(getStringValue(),beginAbendSenten,beginAbendSenten + ABEND_SENTEN_LEN));
   	}
     int localFiller802Counter = -1;
     public boolean isFiller802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller802Counter != sharedCounter;
         localFiller802Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_802_LEN = 1;
	/**
	 * 	serialize this Filler802
	 */
   protected void serializeFiller802(char[] filler802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler802,0,getStringValue(),beginFiller802,FILLER_802_LEN);
       localFiller802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller802Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller802() {	 
   		return (substring(getStringValue(),beginFiller802,beginFiller802 + FILLER_802_LEN));
   	}




}
  
