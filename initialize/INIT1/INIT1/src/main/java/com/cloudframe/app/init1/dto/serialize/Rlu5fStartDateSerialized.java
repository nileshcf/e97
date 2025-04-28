package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fStartDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fStartDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fStartDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_START_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fStartDateMm;
            protected  int beginRlu5fStartDateDd;
            protected  int beginRlu5fStartDateCc;
            protected  int beginRlu5fStartDateYy;
	
	/**
	* Constructor for Rlu5fStartDateSerialized
	**/
    public Rlu5fStartDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fStartDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fStartDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fStartDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1278); // serialize this field at offset 1278 by default 
    }
    
	/**
	* sets parent for this Rlu5fStartDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1278 by default
    }    
	/**
	* initializes the field in Rlu5fStartDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_START_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fStartDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fStartDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fStartDateCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fStartDateYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fStartDateMmCounter = -1;
     public boolean isRlu5fStartDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fStartDateMmCounter != sharedCounter;
         localRlu5fStartDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_START_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Rlu5fStartDateMm
	 */
   protected void serializeRlu5fStartDateMm(char[] rlu5fStartDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fStartDateMm,0,getStringValue(),beginRlu5fStartDateMm,RLU_5F_START_DATE_MM_LEN);
       localRlu5fStartDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fStartDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fStartDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fStartDateMm() {	 
   		return (substring(getStringValue(),beginRlu5fStartDateMm,beginRlu5fStartDateMm + RLU_5F_START_DATE_MM_LEN));
   	}
     int localRlu5fStartDateDdCounter = -1;
     public boolean isRlu5fStartDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fStartDateDdCounter != sharedCounter;
         localRlu5fStartDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_START_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Rlu5fStartDateDd
	 */
   protected void serializeRlu5fStartDateDd(char[] rlu5fStartDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fStartDateDd,0,getStringValue(),beginRlu5fStartDateDd,RLU_5F_START_DATE_DD_LEN);
       localRlu5fStartDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fStartDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fStartDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fStartDateDd() {	 
   		return (substring(getStringValue(),beginRlu5fStartDateDd,beginRlu5fStartDateDd + RLU_5F_START_DATE_DD_LEN));
   	}
     int localRlu5fStartDateCcCounter = -1;
     public boolean isRlu5fStartDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fStartDateCcCounter != sharedCounter;
         localRlu5fStartDateCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_START_DATE_CC_LEN = 2;
	/**
	 * 	serialize this Rlu5fStartDateCc
	 */
   protected void serializeRlu5fStartDateCc(char[] rlu5fStartDateCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fStartDateCc,0,getStringValue(),beginRlu5fStartDateCc,RLU_5F_START_DATE_CC_LEN);
       localRlu5fStartDateCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fStartDateCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fStartDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fStartDateCc() {	 
   		return (substring(getStringValue(),beginRlu5fStartDateCc,beginRlu5fStartDateCc + RLU_5F_START_DATE_CC_LEN));
   	}
     int localRlu5fStartDateYyCounter = -1;
     public boolean isRlu5fStartDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fStartDateYyCounter != sharedCounter;
         localRlu5fStartDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_START_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Rlu5fStartDateYy
	 */
   protected void serializeRlu5fStartDateYy(char[] rlu5fStartDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fStartDateYy,0,getStringValue(),beginRlu5fStartDateYy,RLU_5F_START_DATE_YY_LEN);
       localRlu5fStartDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fStartDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fStartDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fStartDateYy() {	 
   		return (substring(getStringValue(),beginRlu5fStartDateYy,beginRlu5fStartDateYy + RLU_5F_START_DATE_YY_LEN));
   	}




}
  
