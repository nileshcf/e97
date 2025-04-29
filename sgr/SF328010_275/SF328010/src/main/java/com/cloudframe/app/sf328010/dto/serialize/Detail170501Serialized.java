package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Detail170501Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Detail170501Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Detail170501Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_170501_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLserviceDate705;
            protected  int beginLserviceMonth705;
            protected  int beginLserviceCentury705;
            protected  int beginLserviceYear705;
            protected  int beginLserviceHh705;
            protected  int beginLserviceMins705;
            protected  int beginLserviceSec705;
            protected  int beginHserviceDate705;
            protected  int beginHserviceMonth705;
            protected  int beginHserviceCentury705;
            protected  int beginHserviceYear705;
            protected  int beginHserviceHh705;
            protected  int beginHserviceMins705;
            protected  int beginHserviceSec705;
	
	/**
	* Constructor for Detail170501Serialized
	**/
    public Detail170501Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Detail170501Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail170501Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Detail170501Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Detail170501Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Detail170501Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_170501_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginLserviceDate705 = getStartOffset() + 29;	// set offset for serialization
  
  
             beginLserviceMonth705 = getStartOffset() + 32;	// set offset for serialization
  
  
             beginLserviceCentury705 = getStartOffset() + 36;	// set offset for serialization
  
             beginLserviceYear705 = getStartOffset() + 38;	// set offset for serialization
  
  
             beginLserviceHh705 = getStartOffset() + 41;	// set offset for serialization
  
  
             beginLserviceMins705 = getStartOffset() + 44;	// set offset for serialization
  
  
             beginLserviceSec705 = getStartOffset() + 47;	// set offset for serialization
  
  
  
  
             beginHserviceDate705 = getStartOffset() + 53;	// set offset for serialization
  
  
             beginHserviceMonth705 = getStartOffset() + 56;	// set offset for serialization
  
  
             beginHserviceCentury705 = getStartOffset() + 60;	// set offset for serialization
  
             beginHserviceYear705 = getStartOffset() + 62;	// set offset for serialization
  
  
             beginHserviceHh705 = getStartOffset() + 65;	// set offset for serialization
  
  
             beginHserviceMins705 = getStartOffset() + 68;	// set offset for serialization
  
  
             beginHserviceSec705 = getStartOffset() + 71;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLserviceDate705Counter = -1;
     public boolean isLserviceDate705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceDate705Counter != sharedCounter;
         localLserviceDate705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_DATE_705_LEN = 2;
	/**
	 * 	serialize this LserviceDate705
	 */
   protected void serializeLserviceDate705(char[] lserviceDate705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceDate705,0,getStringValue(),beginLserviceDate705,LSERVICE_DATE_705_LEN);
       localLserviceDate705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceDate705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceDate705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceDate705() {	 
   		return (substring(getStringValue(),beginLserviceDate705,beginLserviceDate705 + LSERVICE_DATE_705_LEN));
   	}
     int localLserviceMonth705Counter = -1;
     public boolean isLserviceMonth705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMonth705Counter != sharedCounter;
         localLserviceMonth705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MONTH_705_LEN = 3;
	/**
	 * 	serialize this LserviceMonth705
	 */
   protected void serializeLserviceMonth705(char[] lserviceMonth705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMonth705,0,getStringValue(),beginLserviceMonth705,LSERVICE_MONTH_705_LEN);
       localLserviceMonth705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMonth705Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLserviceMonth705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMonth705() {	 
   		return (substring(getStringValue(),beginLserviceMonth705,beginLserviceMonth705 + LSERVICE_MONTH_705_LEN));
   	}
     int localLserviceCentury705Counter = -1;
     public boolean isLserviceCentury705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceCentury705Counter != sharedCounter;
         localLserviceCentury705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_CENTURY_705_LEN = 2;
	/**
	 * 	serialize this LserviceCentury705
	 */
   protected void serializeLserviceCentury705(char[] lserviceCentury705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceCentury705,0,getStringValue(),beginLserviceCentury705,LSERVICE_CENTURY_705_LEN);
       localLserviceCentury705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceCentury705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceCentury705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceCentury705() {	 
   		return (substring(getStringValue(),beginLserviceCentury705,beginLserviceCentury705 + LSERVICE_CENTURY_705_LEN));
   	}
     int localLserviceYear705Counter = -1;
     public boolean isLserviceYear705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceYear705Counter != sharedCounter;
         localLserviceYear705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_YEAR_705_LEN = 2;
	/**
	 * 	serialize this LserviceYear705
	 */
   protected void serializeLserviceYear705(char[] lserviceYear705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceYear705,0,getStringValue(),beginLserviceYear705,LSERVICE_YEAR_705_LEN);
       localLserviceYear705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceYear705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceYear705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceYear705() {	 
   		return (substring(getStringValue(),beginLserviceYear705,beginLserviceYear705 + LSERVICE_YEAR_705_LEN));
   	}
     int localLserviceHh705Counter = -1;
     public boolean isLserviceHh705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceHh705Counter != sharedCounter;
         localLserviceHh705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_HH_705_LEN = 2;
	/**
	 * 	serialize this LserviceHh705
	 */
   protected void serializeLserviceHh705(char[] lserviceHh705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceHh705,0,getStringValue(),beginLserviceHh705,LSERVICE_HH_705_LEN);
       localLserviceHh705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceHh705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceHh705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceHh705() {	 
   		return (substring(getStringValue(),beginLserviceHh705,beginLserviceHh705 + LSERVICE_HH_705_LEN));
   	}
     int localLserviceMins705Counter = -1;
     public boolean isLserviceMins705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMins705Counter != sharedCounter;
         localLserviceMins705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MINS_705_LEN = 2;
	/**
	 * 	serialize this LserviceMins705
	 */
   protected void serializeLserviceMins705(char[] lserviceMins705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMins705,0,getStringValue(),beginLserviceMins705,LSERVICE_MINS_705_LEN);
       localLserviceMins705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMins705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceMins705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMins705() {	 
   		return (substring(getStringValue(),beginLserviceMins705,beginLserviceMins705 + LSERVICE_MINS_705_LEN));
   	}
     int localLserviceSec705Counter = -1;
     public boolean isLserviceSec705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceSec705Counter != sharedCounter;
         localLserviceSec705Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_SEC_705_LEN = 2;
	/**
	 * 	serialize this LserviceSec705
	 */
   protected void serializeLserviceSec705(char[] lserviceSec705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceSec705,0,getStringValue(),beginLserviceSec705,LSERVICE_SEC_705_LEN);
       localLserviceSec705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceSec705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceSec705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceSec705() {	 
   		return (substring(getStringValue(),beginLserviceSec705,beginLserviceSec705 + LSERVICE_SEC_705_LEN));
   	}
     int localHserviceDate705Counter = -1;
     public boolean isHserviceDate705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceDate705Counter != sharedCounter;
         localHserviceDate705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_DATE_705_LEN = 2;
	/**
	 * 	serialize this HserviceDate705
	 */
   protected void serializeHserviceDate705(char[] hserviceDate705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceDate705,0,getStringValue(),beginHserviceDate705,HSERVICE_DATE_705_LEN);
       localHserviceDate705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceDate705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceDate705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceDate705() {	 
   		return (substring(getStringValue(),beginHserviceDate705,beginHserviceDate705 + HSERVICE_DATE_705_LEN));
   	}
     int localHserviceMonth705Counter = -1;
     public boolean isHserviceMonth705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMonth705Counter != sharedCounter;
         localHserviceMonth705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MONTH_705_LEN = 3;
	/**
	 * 	serialize this HserviceMonth705
	 */
   protected void serializeHserviceMonth705(char[] hserviceMonth705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMonth705,0,getStringValue(),beginHserviceMonth705,HSERVICE_MONTH_705_LEN);
       localHserviceMonth705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMonth705Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHserviceMonth705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMonth705() {	 
   		return (substring(getStringValue(),beginHserviceMonth705,beginHserviceMonth705 + HSERVICE_MONTH_705_LEN));
   	}
     int localHserviceCentury705Counter = -1;
     public boolean isHserviceCentury705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceCentury705Counter != sharedCounter;
         localHserviceCentury705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_CENTURY_705_LEN = 2;
	/**
	 * 	serialize this HserviceCentury705
	 */
   protected void serializeHserviceCentury705(char[] hserviceCentury705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceCentury705,0,getStringValue(),beginHserviceCentury705,HSERVICE_CENTURY_705_LEN);
       localHserviceCentury705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceCentury705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceCentury705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceCentury705() {	 
   		return (substring(getStringValue(),beginHserviceCentury705,beginHserviceCentury705 + HSERVICE_CENTURY_705_LEN));
   	}
     int localHserviceYear705Counter = -1;
     public boolean isHserviceYear705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceYear705Counter != sharedCounter;
         localHserviceYear705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_YEAR_705_LEN = 2;
	/**
	 * 	serialize this HserviceYear705
	 */
   protected void serializeHserviceYear705(char[] hserviceYear705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceYear705,0,getStringValue(),beginHserviceYear705,HSERVICE_YEAR_705_LEN);
       localHserviceYear705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceYear705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceYear705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceYear705() {	 
   		return (substring(getStringValue(),beginHserviceYear705,beginHserviceYear705 + HSERVICE_YEAR_705_LEN));
   	}
     int localHserviceHh705Counter = -1;
     public boolean isHserviceHh705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceHh705Counter != sharedCounter;
         localHserviceHh705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_HH_705_LEN = 2;
	/**
	 * 	serialize this HserviceHh705
	 */
   protected void serializeHserviceHh705(char[] hserviceHh705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceHh705,0,getStringValue(),beginHserviceHh705,HSERVICE_HH_705_LEN);
       localHserviceHh705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceHh705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceHh705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceHh705() {	 
   		return (substring(getStringValue(),beginHserviceHh705,beginHserviceHh705 + HSERVICE_HH_705_LEN));
   	}
     int localHserviceMins705Counter = -1;
     public boolean isHserviceMins705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMins705Counter != sharedCounter;
         localHserviceMins705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MINS_705_LEN = 2;
	/**
	 * 	serialize this HserviceMins705
	 */
   protected void serializeHserviceMins705(char[] hserviceMins705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMins705,0,getStringValue(),beginHserviceMins705,HSERVICE_MINS_705_LEN);
       localHserviceMins705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMins705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceMins705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMins705() {	 
   		return (substring(getStringValue(),beginHserviceMins705,beginHserviceMins705 + HSERVICE_MINS_705_LEN));
   	}
     int localHserviceSec705Counter = -1;
     public boolean isHserviceSec705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceSec705Counter != sharedCounter;
         localHserviceSec705Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_SEC_705_LEN = 2;
	/**
	 * 	serialize this HserviceSec705
	 */
   protected void serializeHserviceSec705(char[] hserviceSec705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceSec705,0,getStringValue(),beginHserviceSec705,HSERVICE_SEC_705_LEN);
       localHserviceSec705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceSec705Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceSec705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceSec705() {	 
   		return (substring(getStringValue(),beginHserviceSec705,beginHserviceSec705 + HSERVICE_SEC_705_LEN));
   	}




}
  
