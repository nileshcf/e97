package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdSecurityNoRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSecurityNoRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSecurityNoRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SECURITY_NO_REDEFINED_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSecurityNo1;
            protected  int beginMsdSecurityNo27;
	
	/**
	* Constructor for MsdSecurityNoRedefinedSerialized
	**/
    public MsdSecurityNoRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSecurityNoRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityNoRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSecurityNoRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,106); // serialize this field at offset 106 by default 
    }
    
	/**
	* sets parent for this MsdSecurityNoRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 106 by default
    }    
	/**
	* initializes the field in MsdSecurityNoRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SECURITY_NO_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSecurityNo1 = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSecurityNo27 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSecurityNo1Counter = -1;
     public boolean isMsdSecurityNo1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityNo1Counter != sharedCounter;
         localMsdSecurityNo1Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_NO_1_LEN = 1;
	/**
	 * 	serialize this MsdSecurityNo1
	 */
   protected void serializeMsdSecurityNo1(char[] msdSecurityNo1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityNo1,0,getStringValue(),beginMsdSecurityNo1,MSD_SECURITY_NO_1_LEN);
       localMsdSecurityNo1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityNo1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecurityNo1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityNo1() {	 
   		return (substring(getStringValue(),beginMsdSecurityNo1,beginMsdSecurityNo1 + MSD_SECURITY_NO_1_LEN));
   	}
     int localMsdSecurityNo27Counter = -1;
     public boolean isMsdSecurityNo27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityNo27Counter != sharedCounter;
         localMsdSecurityNo27Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_NO_27_LEN = 6;
	/**
	 * 	serialize this MsdSecurityNo27
	 */
   protected void serializeMsdSecurityNo27(char[] msdSecurityNo27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityNo27,0,getStringValue(),beginMsdSecurityNo27,MSD_SECURITY_NO_27_LEN);
       localMsdSecurityNo27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityNo27Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMsdSecurityNo27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityNo27() {	 
   		return (substring(getStringValue(),beginMsdSecurityNo27,beginMsdSecurityNo27 + MSD_SECURITY_NO_27_LEN));
   	}




}
  
