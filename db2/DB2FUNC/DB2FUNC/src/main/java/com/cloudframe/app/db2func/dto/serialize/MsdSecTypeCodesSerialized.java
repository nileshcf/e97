package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdSecTypeCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSecTypeCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSecTypeCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SEC_TYPE_CODES_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSecTypePos2;
            protected  int beginMsdSecTypePos3;
            protected  int beginMsdSecTypePos4;
            protected  int beginMsdSecTypePos5;
            protected  int beginMsdSecTypePos6;
            protected  int beginMsdSecTypePos7;
	
	/**
	* Constructor for MsdSecTypeCodesSerialized
	**/
    public MsdSecTypeCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSecTypeCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecTypeCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSecTypeCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,463); // serialize this field at offset 463 by default 
    }
    
	/**
	* sets parent for this MsdSecTypeCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 463 by default
    }    
	/**
	* initializes the field in MsdSecTypeCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SEC_TYPE_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSecTypePos2 = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSecTypePos3 = getStartOffset() + 1;	// set offset for serialization
  
             beginMsdSecTypePos4 = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdSecTypePos5 = getStartOffset() + 3;	// set offset for serialization
  
             beginMsdSecTypePos6 = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdSecTypePos7 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSecTypePos2Counter = -1;
     public boolean isMsdSecTypePos2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos2Counter != sharedCounter;
         localMsdSecTypePos2Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_2_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos2
	 */
   protected void serializeMsdSecTypePos2(char[] msdSecTypePos2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos2,0,getStringValue(),beginMsdSecTypePos2,MSD_SEC_TYPE_POS_2_LEN);
       localMsdSecTypePos2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos2() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos2,beginMsdSecTypePos2 + MSD_SEC_TYPE_POS_2_LEN));
   	}
     int localMsdSecTypePos3Counter = -1;
     public boolean isMsdSecTypePos3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos3Counter != sharedCounter;
         localMsdSecTypePos3Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_3_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos3
	 */
   protected void serializeMsdSecTypePos3(char[] msdSecTypePos3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos3,0,getStringValue(),beginMsdSecTypePos3,MSD_SEC_TYPE_POS_3_LEN);
       localMsdSecTypePos3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos3() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos3,beginMsdSecTypePos3 + MSD_SEC_TYPE_POS_3_LEN));
   	}
     int localMsdSecTypePos4Counter = -1;
     public boolean isMsdSecTypePos4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos4Counter != sharedCounter;
         localMsdSecTypePos4Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_4_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos4
	 */
   protected void serializeMsdSecTypePos4(char[] msdSecTypePos4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos4,0,getStringValue(),beginMsdSecTypePos4,MSD_SEC_TYPE_POS_4_LEN);
       localMsdSecTypePos4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos4() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos4,beginMsdSecTypePos4 + MSD_SEC_TYPE_POS_4_LEN));
   	}
     int localMsdSecTypePos5Counter = -1;
     public boolean isMsdSecTypePos5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos5Counter != sharedCounter;
         localMsdSecTypePos5Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_5_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos5
	 */
   protected void serializeMsdSecTypePos5(char[] msdSecTypePos5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos5,0,getStringValue(),beginMsdSecTypePos5,MSD_SEC_TYPE_POS_5_LEN);
       localMsdSecTypePos5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos5() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos5,beginMsdSecTypePos5 + MSD_SEC_TYPE_POS_5_LEN));
   	}
     int localMsdSecTypePos6Counter = -1;
     public boolean isMsdSecTypePos6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos6Counter != sharedCounter;
         localMsdSecTypePos6Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_6_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos6
	 */
   protected void serializeMsdSecTypePos6(char[] msdSecTypePos6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos6,0,getStringValue(),beginMsdSecTypePos6,MSD_SEC_TYPE_POS_6_LEN);
       localMsdSecTypePos6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos6() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos6,beginMsdSecTypePos6 + MSD_SEC_TYPE_POS_6_LEN));
   	}
     int localMsdSecTypePos7Counter = -1;
     public boolean isMsdSecTypePos7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecTypePos7Counter != sharedCounter;
         localMsdSecTypePos7Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_TYPE_POS_7_LEN = 1;
	/**
	 * 	serialize this MsdSecTypePos7
	 */
   protected void serializeMsdSecTypePos7(char[] msdSecTypePos7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecTypePos7,0,getStringValue(),beginMsdSecTypePos7,MSD_SEC_TYPE_POS_7_LEN);
       localMsdSecTypePos7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecTypePos7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecTypePos7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecTypePos7() {	 
   		return (substring(getStringValue(),beginMsdSecTypePos7,beginMsdSecTypePos7 + MSD_SEC_TYPE_POS_7_LEN));
   	}




}
  
