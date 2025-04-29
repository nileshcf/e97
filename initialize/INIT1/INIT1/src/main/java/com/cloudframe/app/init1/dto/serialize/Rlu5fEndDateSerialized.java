package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fEndDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fEndDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fEndDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_END_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fEndDateMm;
            protected  int beginRlu5fEndDateDd;
            protected  int beginRlu5fEndDateCc;
            protected  int beginRlu5fEndDateYy;
	
	/**
	* Constructor for Rlu5fEndDateSerialized
	**/
    public Rlu5fEndDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fEndDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fEndDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fEndDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1286); // serialize this field at offset 1286 by default 
    }
    
	/**
	* sets parent for this Rlu5fEndDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1286 by default
    }    
	/**
	* initializes the field in Rlu5fEndDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_END_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fEndDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fEndDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fEndDateCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fEndDateYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fEndDateMmCounter = -1;
     public boolean isRlu5fEndDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fEndDateMmCounter != sharedCounter;
         localRlu5fEndDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_END_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Rlu5fEndDateMm
	 */
   protected void serializeRlu5fEndDateMm(char[] rlu5fEndDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fEndDateMm,0,getStringValue(),beginRlu5fEndDateMm,RLU_5F_END_DATE_MM_LEN);
       localRlu5fEndDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fEndDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fEndDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fEndDateMm() {	 
   		return (substring(getStringValue(),beginRlu5fEndDateMm,beginRlu5fEndDateMm + RLU_5F_END_DATE_MM_LEN));
   	}
     int localRlu5fEndDateDdCounter = -1;
     public boolean isRlu5fEndDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fEndDateDdCounter != sharedCounter;
         localRlu5fEndDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_END_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Rlu5fEndDateDd
	 */
   protected void serializeRlu5fEndDateDd(char[] rlu5fEndDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fEndDateDd,0,getStringValue(),beginRlu5fEndDateDd,RLU_5F_END_DATE_DD_LEN);
       localRlu5fEndDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fEndDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fEndDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fEndDateDd() {	 
   		return (substring(getStringValue(),beginRlu5fEndDateDd,beginRlu5fEndDateDd + RLU_5F_END_DATE_DD_LEN));
   	}
     int localRlu5fEndDateCcCounter = -1;
     public boolean isRlu5fEndDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fEndDateCcCounter != sharedCounter;
         localRlu5fEndDateCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_END_DATE_CC_LEN = 2;
	/**
	 * 	serialize this Rlu5fEndDateCc
	 */
   protected void serializeRlu5fEndDateCc(char[] rlu5fEndDateCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fEndDateCc,0,getStringValue(),beginRlu5fEndDateCc,RLU_5F_END_DATE_CC_LEN);
       localRlu5fEndDateCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fEndDateCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fEndDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fEndDateCc() {	 
   		return (substring(getStringValue(),beginRlu5fEndDateCc,beginRlu5fEndDateCc + RLU_5F_END_DATE_CC_LEN));
   	}
     int localRlu5fEndDateYyCounter = -1;
     public boolean isRlu5fEndDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fEndDateYyCounter != sharedCounter;
         localRlu5fEndDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_END_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Rlu5fEndDateYy
	 */
   protected void serializeRlu5fEndDateYy(char[] rlu5fEndDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fEndDateYy,0,getStringValue(),beginRlu5fEndDateYy,RLU_5F_END_DATE_YY_LEN);
       localRlu5fEndDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fEndDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fEndDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fEndDateYy() {	 
   		return (substring(getStringValue(),beginRlu5fEndDateYy,beginRlu5fEndDateYy + RLU_5F_END_DATE_YY_LEN));
   	}




}
  
