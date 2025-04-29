package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class LserviceDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LserviceDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LserviceDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LSERVICE_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLserviceCc800;
            protected  int beginLserviceYy800;
            protected  int beginLserviceMm800;
            protected  int beginLserviceDd800;
	
	/**
	* Constructor for LserviceDate800Serialized
	**/
    public LserviceDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LserviceDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LserviceDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this LserviceDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in LserviceDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LSERVICE_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLserviceCc800 = getStartOffset() + 0;	// set offset for serialization
  
             beginLserviceYy800 = getStartOffset() + 2;	// set offset for serialization
  
             beginLserviceMm800 = getStartOffset() + 4;	// set offset for serialization
  
             beginLserviceDd800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLserviceCc800Counter = -1;
     public boolean isLserviceCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceCc800Counter != sharedCounter;
         localLserviceCc800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_CC_800_LEN = 2;
	/**
	 * 	serialize this LserviceCc800
	 */
   protected void serializeLserviceCc800(char[] lserviceCc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceCc800,0,getStringValue(),beginLserviceCc800,LSERVICE_CC_800_LEN);
       localLserviceCc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceCc800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceCc800() {	 
   		return (substring(getStringValue(),beginLserviceCc800,beginLserviceCc800 + LSERVICE_CC_800_LEN));
   	}
     int localLserviceYy800Counter = -1;
     public boolean isLserviceYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceYy800Counter != sharedCounter;
         localLserviceYy800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_YY_800_LEN = 2;
	/**
	 * 	serialize this LserviceYy800
	 */
   protected void serializeLserviceYy800(char[] lserviceYy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceYy800,0,getStringValue(),beginLserviceYy800,LSERVICE_YY_800_LEN);
       localLserviceYy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceYy800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceYy800() {	 
   		return (substring(getStringValue(),beginLserviceYy800,beginLserviceYy800 + LSERVICE_YY_800_LEN));
   	}
     int localLserviceMm800Counter = -1;
     public boolean isLserviceMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMm800Counter != sharedCounter;
         localLserviceMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MM_800_LEN = 2;
	/**
	 * 	serialize this LserviceMm800
	 */
   protected void serializeLserviceMm800(char[] lserviceMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMm800,0,getStringValue(),beginLserviceMm800,LSERVICE_MM_800_LEN);
       localLserviceMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMm800() {	 
   		return (substring(getStringValue(),beginLserviceMm800,beginLserviceMm800 + LSERVICE_MM_800_LEN));
   	}
     int localLserviceDd800Counter = -1;
     public boolean isLserviceDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceDd800Counter != sharedCounter;
         localLserviceDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_DD_800_LEN = 2;
	/**
	 * 	serialize this LserviceDd800
	 */
   protected void serializeLserviceDd800(char[] lserviceDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceDd800,0,getStringValue(),beginLserviceDd800,LSERVICE_DD_800_LEN);
       localLserviceDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceDd800() {	 
   		return (substring(getStringValue(),beginLserviceDd800,beginLserviceDd800 + LSERVICE_DD_800_LEN));
   	}




}
  
