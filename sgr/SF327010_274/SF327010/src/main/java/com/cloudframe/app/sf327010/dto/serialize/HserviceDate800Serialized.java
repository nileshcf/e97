package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class HserviceDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HserviceDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HserviceDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HSERVICE_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHserviceCc800;
            protected  int beginHserviceYy800;
            protected  int beginHserviceMm800;
            protected  int beginHserviceDd800;
	
	/**
	* Constructor for HserviceDate800Serialized
	**/
    public HserviceDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HserviceDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HserviceDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this HserviceDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in HserviceDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HSERVICE_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHserviceCc800 = getStartOffset() + 0;	// set offset for serialization
  
             beginHserviceYy800 = getStartOffset() + 2;	// set offset for serialization
  
             beginHserviceMm800 = getStartOffset() + 4;	// set offset for serialization
  
             beginHserviceDd800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHserviceCc800Counter = -1;
     public boolean isHserviceCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceCc800Counter != sharedCounter;
         localHserviceCc800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_CC_800_LEN = 2;
	/**
	 * 	serialize this HserviceCc800
	 */
   protected void serializeHserviceCc800(char[] hserviceCc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceCc800,0,getStringValue(),beginHserviceCc800,HSERVICE_CC_800_LEN);
       localHserviceCc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceCc800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceCc800() {	 
   		return (substring(getStringValue(),beginHserviceCc800,beginHserviceCc800 + HSERVICE_CC_800_LEN));
   	}
     int localHserviceYy800Counter = -1;
     public boolean isHserviceYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceYy800Counter != sharedCounter;
         localHserviceYy800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_YY_800_LEN = 2;
	/**
	 * 	serialize this HserviceYy800
	 */
   protected void serializeHserviceYy800(char[] hserviceYy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceYy800,0,getStringValue(),beginHserviceYy800,HSERVICE_YY_800_LEN);
       localHserviceYy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceYy800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceYy800() {	 
   		return (substring(getStringValue(),beginHserviceYy800,beginHserviceYy800 + HSERVICE_YY_800_LEN));
   	}
     int localHserviceMm800Counter = -1;
     public boolean isHserviceMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMm800Counter != sharedCounter;
         localHserviceMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MM_800_LEN = 2;
	/**
	 * 	serialize this HserviceMm800
	 */
   protected void serializeHserviceMm800(char[] hserviceMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMm800,0,getStringValue(),beginHserviceMm800,HSERVICE_MM_800_LEN);
       localHserviceMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMm800() {	 
   		return (substring(getStringValue(),beginHserviceMm800,beginHserviceMm800 + HSERVICE_MM_800_LEN));
   	}
     int localHserviceDd800Counter = -1;
     public boolean isHserviceDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceDd800Counter != sharedCounter;
         localHserviceDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_DD_800_LEN = 2;
	/**
	 * 	serialize this HserviceDd800
	 */
   protected void serializeHserviceDd800(char[] hserviceDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceDd800,0,getStringValue(),beginHserviceDd800,HSERVICE_DD_800_LEN);
       localHserviceDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceDd800() {	 
   		return (substring(getStringValue(),beginHserviceDd800,beginHserviceDd800 + HSERVICE_DD_800_LEN));
   	}




}
  
