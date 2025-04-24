package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class Detail1205Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Detail1205Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Detail1205Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_1205_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLserviceDate205;
            protected  int beginLserviceMonth205;
            protected  int beginLserviceCentury205;
            protected  int beginLserviceYear205;
            protected  int beginLserviceHh205;
            protected  int beginLserviceMins205;
            protected  int beginLserviceSec205;
            protected  int beginHserviceDate205;
            protected  int beginHserviceMonth205;
            protected  int beginHserviceCentury205;
            protected  int beginHserviceYear205;
            protected  int beginHserviceHh205;
            protected  int beginHserviceMins205;
            protected  int beginHserviceSec205;
	
	/**
	* Constructor for Detail1205Serialized
	**/
    public Detail1205Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Detail1205Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1205Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Detail1205Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Detail1205Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Detail1205Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_1205_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginLserviceDate205 = getStartOffset() + 28;	// set offset for serialization
  
  
             beginLserviceMonth205 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginLserviceCentury205 = getStartOffset() + 35;	// set offset for serialization
  
             beginLserviceYear205 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginLserviceHh205 = getStartOffset() + 40;	// set offset for serialization
  
  
             beginLserviceMins205 = getStartOffset() + 43;	// set offset for serialization
  
  
             beginLserviceSec205 = getStartOffset() + 46;	// set offset for serialization
  
  
  
  
             beginHserviceDate205 = getStartOffset() + 52;	// set offset for serialization
  
  
             beginHserviceMonth205 = getStartOffset() + 55;	// set offset for serialization
  
  
             beginHserviceCentury205 = getStartOffset() + 59;	// set offset for serialization
  
             beginHserviceYear205 = getStartOffset() + 61;	// set offset for serialization
  
  
             beginHserviceHh205 = getStartOffset() + 64;	// set offset for serialization
  
  
             beginHserviceMins205 = getStartOffset() + 67;	// set offset for serialization
  
  
             beginHserviceSec205 = getStartOffset() + 70;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLserviceDate205Counter = -1;
     public boolean isLserviceDate205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceDate205Counter != sharedCounter;
         localLserviceDate205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_DATE_205_LEN = 2;
	/**
	 * 	serialize this LserviceDate205
	 */
   protected void serializeLserviceDate205(char[] lserviceDate205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceDate205,0,getStringValue(),beginLserviceDate205,LSERVICE_DATE_205_LEN);
       localLserviceDate205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceDate205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceDate205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceDate205() {	 
   		return (substring(getStringValue(),beginLserviceDate205,beginLserviceDate205 + LSERVICE_DATE_205_LEN));
   	}
     int localLserviceMonth205Counter = -1;
     public boolean isLserviceMonth205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMonth205Counter != sharedCounter;
         localLserviceMonth205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MONTH_205_LEN = 3;
	/**
	 * 	serialize this LserviceMonth205
	 */
   protected void serializeLserviceMonth205(char[] lserviceMonth205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMonth205,0,getStringValue(),beginLserviceMonth205,LSERVICE_MONTH_205_LEN);
       localLserviceMonth205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMonth205Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLserviceMonth205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMonth205() {	 
   		return (substring(getStringValue(),beginLserviceMonth205,beginLserviceMonth205 + LSERVICE_MONTH_205_LEN));
   	}
     int localLserviceCentury205Counter = -1;
     public boolean isLserviceCentury205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceCentury205Counter != sharedCounter;
         localLserviceCentury205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_CENTURY_205_LEN = 2;
	/**
	 * 	serialize this LserviceCentury205
	 */
   protected void serializeLserviceCentury205(char[] lserviceCentury205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceCentury205,0,getStringValue(),beginLserviceCentury205,LSERVICE_CENTURY_205_LEN);
       localLserviceCentury205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceCentury205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceCentury205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceCentury205() {	 
   		return (substring(getStringValue(),beginLserviceCentury205,beginLserviceCentury205 + LSERVICE_CENTURY_205_LEN));
   	}
     int localLserviceYear205Counter = -1;
     public boolean isLserviceYear205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceYear205Counter != sharedCounter;
         localLserviceYear205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_YEAR_205_LEN = 2;
	/**
	 * 	serialize this LserviceYear205
	 */
   protected void serializeLserviceYear205(char[] lserviceYear205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceYear205,0,getStringValue(),beginLserviceYear205,LSERVICE_YEAR_205_LEN);
       localLserviceYear205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceYear205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceYear205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceYear205() {	 
   		return (substring(getStringValue(),beginLserviceYear205,beginLserviceYear205 + LSERVICE_YEAR_205_LEN));
   	}
     int localLserviceHh205Counter = -1;
     public boolean isLserviceHh205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceHh205Counter != sharedCounter;
         localLserviceHh205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_HH_205_LEN = 2;
	/**
	 * 	serialize this LserviceHh205
	 */
   protected void serializeLserviceHh205(char[] lserviceHh205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceHh205,0,getStringValue(),beginLserviceHh205,LSERVICE_HH_205_LEN);
       localLserviceHh205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceHh205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceHh205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceHh205() {	 
   		return (substring(getStringValue(),beginLserviceHh205,beginLserviceHh205 + LSERVICE_HH_205_LEN));
   	}
     int localLserviceMins205Counter = -1;
     public boolean isLserviceMins205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMins205Counter != sharedCounter;
         localLserviceMins205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MINS_205_LEN = 2;
	/**
	 * 	serialize this LserviceMins205
	 */
   protected void serializeLserviceMins205(char[] lserviceMins205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMins205,0,getStringValue(),beginLserviceMins205,LSERVICE_MINS_205_LEN);
       localLserviceMins205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMins205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceMins205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMins205() {	 
   		return (substring(getStringValue(),beginLserviceMins205,beginLserviceMins205 + LSERVICE_MINS_205_LEN));
   	}
     int localLserviceSec205Counter = -1;
     public boolean isLserviceSec205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceSec205Counter != sharedCounter;
         localLserviceSec205Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_SEC_205_LEN = 2;
	/**
	 * 	serialize this LserviceSec205
	 */
   protected void serializeLserviceSec205(char[] lserviceSec205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceSec205,0,getStringValue(),beginLserviceSec205,LSERVICE_SEC_205_LEN);
       localLserviceSec205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceSec205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceSec205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceSec205() {	 
   		return (substring(getStringValue(),beginLserviceSec205,beginLserviceSec205 + LSERVICE_SEC_205_LEN));
   	}
     int localHserviceDate205Counter = -1;
     public boolean isHserviceDate205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceDate205Counter != sharedCounter;
         localHserviceDate205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_DATE_205_LEN = 2;
	/**
	 * 	serialize this HserviceDate205
	 */
   protected void serializeHserviceDate205(char[] hserviceDate205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceDate205,0,getStringValue(),beginHserviceDate205,HSERVICE_DATE_205_LEN);
       localHserviceDate205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceDate205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceDate205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceDate205() {	 
   		return (substring(getStringValue(),beginHserviceDate205,beginHserviceDate205 + HSERVICE_DATE_205_LEN));
   	}
     int localHserviceMonth205Counter = -1;
     public boolean isHserviceMonth205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMonth205Counter != sharedCounter;
         localHserviceMonth205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MONTH_205_LEN = 3;
	/**
	 * 	serialize this HserviceMonth205
	 */
   protected void serializeHserviceMonth205(char[] hserviceMonth205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMonth205,0,getStringValue(),beginHserviceMonth205,HSERVICE_MONTH_205_LEN);
       localHserviceMonth205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMonth205Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHserviceMonth205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMonth205() {	 
   		return (substring(getStringValue(),beginHserviceMonth205,beginHserviceMonth205 + HSERVICE_MONTH_205_LEN));
   	}
     int localHserviceCentury205Counter = -1;
     public boolean isHserviceCentury205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceCentury205Counter != sharedCounter;
         localHserviceCentury205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_CENTURY_205_LEN = 2;
	/**
	 * 	serialize this HserviceCentury205
	 */
   protected void serializeHserviceCentury205(char[] hserviceCentury205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceCentury205,0,getStringValue(),beginHserviceCentury205,HSERVICE_CENTURY_205_LEN);
       localHserviceCentury205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceCentury205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceCentury205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceCentury205() {	 
   		return (substring(getStringValue(),beginHserviceCentury205,beginHserviceCentury205 + HSERVICE_CENTURY_205_LEN));
   	}
     int localHserviceYear205Counter = -1;
     public boolean isHserviceYear205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceYear205Counter != sharedCounter;
         localHserviceYear205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_YEAR_205_LEN = 2;
	/**
	 * 	serialize this HserviceYear205
	 */
   protected void serializeHserviceYear205(char[] hserviceYear205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceYear205,0,getStringValue(),beginHserviceYear205,HSERVICE_YEAR_205_LEN);
       localHserviceYear205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceYear205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceYear205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceYear205() {	 
   		return (substring(getStringValue(),beginHserviceYear205,beginHserviceYear205 + HSERVICE_YEAR_205_LEN));
   	}
     int localHserviceHh205Counter = -1;
     public boolean isHserviceHh205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceHh205Counter != sharedCounter;
         localHserviceHh205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_HH_205_LEN = 2;
	/**
	 * 	serialize this HserviceHh205
	 */
   protected void serializeHserviceHh205(char[] hserviceHh205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceHh205,0,getStringValue(),beginHserviceHh205,HSERVICE_HH_205_LEN);
       localHserviceHh205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceHh205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceHh205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceHh205() {	 
   		return (substring(getStringValue(),beginHserviceHh205,beginHserviceHh205 + HSERVICE_HH_205_LEN));
   	}
     int localHserviceMins205Counter = -1;
     public boolean isHserviceMins205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMins205Counter != sharedCounter;
         localHserviceMins205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MINS_205_LEN = 2;
	/**
	 * 	serialize this HserviceMins205
	 */
   protected void serializeHserviceMins205(char[] hserviceMins205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMins205,0,getStringValue(),beginHserviceMins205,HSERVICE_MINS_205_LEN);
       localHserviceMins205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMins205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceMins205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMins205() {	 
   		return (substring(getStringValue(),beginHserviceMins205,beginHserviceMins205 + HSERVICE_MINS_205_LEN));
   	}
     int localHserviceSec205Counter = -1;
     public boolean isHserviceSec205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceSec205Counter != sharedCounter;
         localHserviceSec205Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_SEC_205_LEN = 2;
	/**
	 * 	serialize this HserviceSec205
	 */
   protected void serializeHserviceSec205(char[] hserviceSec205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceSec205,0,getStringValue(),beginHserviceSec205,HSERVICE_SEC_205_LEN);
       localHserviceSec205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceSec205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceSec205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceSec205() {	 
   		return (substring(getStringValue(),beginHserviceSec205,beginHserviceSec205 + HSERVICE_SEC_205_LEN));
   	}




}
  
