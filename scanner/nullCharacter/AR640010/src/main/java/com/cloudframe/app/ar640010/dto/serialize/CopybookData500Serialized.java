package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CopybookData500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CopybookData500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CopybookData500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COPYBOOK_DATA_500_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCopybook010500;
            protected  int beginCopybook020500;
            protected  int beginCopybook030500;
            protected  int beginCopybook040500;
            protected  int beginCopybook050500;
            protected  int beginCopybook060500;
            protected  int beginCopybook070500;
            protected  int beginCopybook080500;
            protected  int beginCopybook090500;
	
	/**
	* Constructor for CopybookData500Serialized
	**/
    public CopybookData500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CopybookData500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookData500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CopybookData500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CopybookData500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CopybookData500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COPYBOOK_DATA_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCopybook010500 = getStartOffset() + 0;	// set offset for serialization
  
             beginCopybook020500 = getStartOffset() + 12;	// set offset for serialization
  
             beginCopybook030500 = getStartOffset() + 24;	// set offset for serialization
  
             beginCopybook040500 = getStartOffset() + 36;	// set offset for serialization
  
             beginCopybook050500 = getStartOffset() + 48;	// set offset for serialization
  
             beginCopybook060500 = getStartOffset() + 60;	// set offset for serialization
  
             beginCopybook070500 = getStartOffset() + 72;	// set offset for serialization
  
             beginCopybook080500 = getStartOffset() + 84;	// set offset for serialization
  
             beginCopybook090500 = getStartOffset() + 96;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCopybook010500Counter = -1;
     public boolean isCopybook010500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook010500Counter != sharedCounter;
         localCopybook010500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_010500_LEN = 12;
	/**
	 * 	serialize this Copybook010500
	 */
   protected void serializeCopybook010500(char[] copybook010500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook010500,0,getStringValue(),beginCopybook010500,COPYBOOK_010500_LEN);
       localCopybook010500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook010500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook010500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook010500() {	 
   		return (substring(getStringValue(),beginCopybook010500,beginCopybook010500 + COPYBOOK_010500_LEN));
   	}
     int localCopybook020500Counter = -1;
     public boolean isCopybook020500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook020500Counter != sharedCounter;
         localCopybook020500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_020500_LEN = 12;
	/**
	 * 	serialize this Copybook020500
	 */
   protected void serializeCopybook020500(char[] copybook020500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook020500,0,getStringValue(),beginCopybook020500,COPYBOOK_020500_LEN);
       localCopybook020500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook020500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook020500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook020500() {	 
   		return (substring(getStringValue(),beginCopybook020500,beginCopybook020500 + COPYBOOK_020500_LEN));
   	}
     int localCopybook030500Counter = -1;
     public boolean isCopybook030500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook030500Counter != sharedCounter;
         localCopybook030500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_030500_LEN = 12;
	/**
	 * 	serialize this Copybook030500
	 */
   protected void serializeCopybook030500(char[] copybook030500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook030500,0,getStringValue(),beginCopybook030500,COPYBOOK_030500_LEN);
       localCopybook030500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook030500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook030500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook030500() {	 
   		return (substring(getStringValue(),beginCopybook030500,beginCopybook030500 + COPYBOOK_030500_LEN));
   	}
     int localCopybook040500Counter = -1;
     public boolean isCopybook040500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook040500Counter != sharedCounter;
         localCopybook040500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_040500_LEN = 12;
	/**
	 * 	serialize this Copybook040500
	 */
   protected void serializeCopybook040500(char[] copybook040500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook040500,0,getStringValue(),beginCopybook040500,COPYBOOK_040500_LEN);
       localCopybook040500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook040500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook040500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook040500() {	 
   		return (substring(getStringValue(),beginCopybook040500,beginCopybook040500 + COPYBOOK_040500_LEN));
   	}
     int localCopybook050500Counter = -1;
     public boolean isCopybook050500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook050500Counter != sharedCounter;
         localCopybook050500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_050500_LEN = 12;
	/**
	 * 	serialize this Copybook050500
	 */
   protected void serializeCopybook050500(char[] copybook050500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook050500,0,getStringValue(),beginCopybook050500,COPYBOOK_050500_LEN);
       localCopybook050500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook050500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook050500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook050500() {	 
   		return (substring(getStringValue(),beginCopybook050500,beginCopybook050500 + COPYBOOK_050500_LEN));
   	}
     int localCopybook060500Counter = -1;
     public boolean isCopybook060500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook060500Counter != sharedCounter;
         localCopybook060500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_060500_LEN = 12;
	/**
	 * 	serialize this Copybook060500
	 */
   protected void serializeCopybook060500(char[] copybook060500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook060500,0,getStringValue(),beginCopybook060500,COPYBOOK_060500_LEN);
       localCopybook060500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook060500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook060500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook060500() {	 
   		return (substring(getStringValue(),beginCopybook060500,beginCopybook060500 + COPYBOOK_060500_LEN));
   	}
     int localCopybook070500Counter = -1;
     public boolean isCopybook070500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook070500Counter != sharedCounter;
         localCopybook070500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_070500_LEN = 12;
	/**
	 * 	serialize this Copybook070500
	 */
   protected void serializeCopybook070500(char[] copybook070500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook070500,0,getStringValue(),beginCopybook070500,COPYBOOK_070500_LEN);
       localCopybook070500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook070500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook070500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook070500() {	 
   		return (substring(getStringValue(),beginCopybook070500,beginCopybook070500 + COPYBOOK_070500_LEN));
   	}
     int localCopybook080500Counter = -1;
     public boolean isCopybook080500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook080500Counter != sharedCounter;
         localCopybook080500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_080500_LEN = 12;
	/**
	 * 	serialize this Copybook080500
	 */
   protected void serializeCopybook080500(char[] copybook080500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook080500,0,getStringValue(),beginCopybook080500,COPYBOOK_080500_LEN);
       localCopybook080500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook080500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook080500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook080500() {	 
   		return (substring(getStringValue(),beginCopybook080500,beginCopybook080500 + COPYBOOK_080500_LEN));
   	}
     int localCopybook090500Counter = -1;
     public boolean isCopybook090500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybook090500Counter != sharedCounter;
         localCopybook090500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_090500_LEN = 12;
	/**
	 * 	serialize this Copybook090500
	 */
   protected void serializeCopybook090500(char[] copybook090500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybook090500,0,getStringValue(),beginCopybook090500,COPYBOOK_090500_LEN);
       localCopybook090500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybook090500Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCopybook090500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybook090500() {	 
   		return (substring(getStringValue(),beginCopybook090500,beginCopybook090500 + COPYBOOK_090500_LEN));
   	}




}
  
