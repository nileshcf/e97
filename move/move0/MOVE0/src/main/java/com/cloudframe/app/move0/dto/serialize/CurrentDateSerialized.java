package com.cloudframe.app.move0.dto.serialize;

/**
*  The class CurrentDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_DATE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMm;
            protected  int beginDd;
            protected  int beginYyyy;
	
	/**
	* Constructor for CurrentDateSerialized
	**/
    public CurrentDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CurrentDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CurrentDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMmCounter = -1;
     public boolean isMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMmCounter != sharedCounter;
         localMmCounter = sharedCounter; return hasModified;
     }
	protected static final int MM_LEN = 2;
	/**
	 * 	serialize this Mm
	 */
   protected void serializeMm(char[] mm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mm,0,getStringValue(),beginMm,MM_LEN);
       localMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMm() {	 
   		return (substring(getStringValue(),beginMm,beginMm + MM_LEN));
   	}
     int localDdCounter = -1;
     public boolean isDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDdCounter != sharedCounter;
         localDdCounter = sharedCounter; return hasModified;
     }
	protected static final int DD_LEN = 2;
	/**
	 * 	serialize this Dd
	 */
   protected void serializeDd(char[] dd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dd,0,getStringValue(),beginDd,DD_LEN);
       localDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDd() {	 
   		return (substring(getStringValue(),beginDd,beginDd + DD_LEN));
   	}
     int localYyyyCounter = -1;
     public boolean isYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localYyyyCounter != sharedCounter;
         localYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int YYYY_LEN = 4;
	/**
	 * 	serialize this Yyyy
	 */
   protected void serializeYyyy(char[] yyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(yyyy,0,getStringValue(),beginYyyy,YYYY_LEN);
       localYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshYyyy() {	 
   		return (substring(getStringValue(),beginYyyy,beginYyyy + YYYY_LEN));
   	}




}
  
