package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdSecurityDesc1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSecurityDesc1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSecurityDesc1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SECURITY_DESC_1_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdFiller;
            protected  int beginMsdFiller2;
	
	/**
	* Constructor for MsdSecurityDesc1Serialized
	**/
    public MsdSecurityDesc1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSecurityDesc1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityDesc1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSecurityDesc1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,132); // serialize this field at offset 132 by default 
    }
    
	/**
	* sets parent for this MsdSecurityDesc1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 132 by default
    }    
	/**
	* initializes the field in MsdSecurityDesc1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SECURITY_DESC_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdFiller = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdFiller2 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdFillerCounter = -1;
     public boolean isMsdFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFillerCounter != sharedCounter;
         localMsdFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FILLER_LEN = 3;
	/**
	 * 	serialize this MsdFiller
	 */
   protected void serializeMsdFiller(char[] msdFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFiller,0,getStringValue(),beginMsdFiller,MSD_FILLER_LEN);
       localMsdFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFiller() {	 
   		return (substring(getStringValue(),beginMsdFiller,beginMsdFiller + MSD_FILLER_LEN));
   	}
     int localMsdFiller2Counter = -1;
     public boolean isMsdFiller2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFiller2Counter != sharedCounter;
         localMsdFiller2Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FILLER_2_LEN = 27;
	/**
	 * 	serialize this MsdFiller2
	 */
   protected void serializeMsdFiller2(char[] msdFiller2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFiller2,0,getStringValue(),beginMsdFiller2,MSD_FILLER_2_LEN);
       localMsdFiller2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFiller2Constraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
    /**
	 *	refreshMsdFiller2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFiller2() {	 
   		return (substring(getStringValue(),beginMsdFiller2,beginMsdFiller2 + MSD_FILLER_2_LEN));
   	}




}
  
