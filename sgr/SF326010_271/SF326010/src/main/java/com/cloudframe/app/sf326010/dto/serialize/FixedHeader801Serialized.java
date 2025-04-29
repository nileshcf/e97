package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class FixedHeader801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FixedHeader801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FixedHeader801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FIXED_HEADER_801_LENGTH = 8232;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001MiplogClass801;
            protected  int beginSys001MiplogTyp801;
            protected  int beginSys001MiplogRefNum801;
            protected  int beginSys001MiplogBoxId801;
            protected  int beginSys001MiplogElaTimX801;
	
	/**
	* Constructor for FixedHeader801Serialized
	**/
    public FixedHeader801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FixedHeader801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FixedHeader801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FixedHeader801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FixedHeader801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FIXED_HEADER_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001MiplogClass801 = getStartOffset() + 15;	// set offset for serialization
  
             beginSys001MiplogTyp801 = getStartOffset() + 16;	// set offset for serialization
  
             beginSys001MiplogRefNum801 = getStartOffset() + 17;	// set offset for serialization
  
             beginSys001MiplogBoxId801 = getStartOffset() + 23;	// set offset for serialization
  
  
  
             beginSys001MiplogElaTimX801 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001MiplogClass801Counter = -1;
     public boolean isSys001MiplogClass801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogClass801Counter != sharedCounter;
         localSys001MiplogClass801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_CLASS_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogClass801
	 */
   protected void serializeSys001MiplogClass801(char[] sys001MiplogClass801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogClass801,0,getStringValue(),beginSys001MiplogClass801,SYS_001_MIPLOG_CLASS_801_LEN);
       localSys001MiplogClass801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogClass801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogClass801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogClass801() {	 
   		return (substring(getStringValue(),beginSys001MiplogClass801,beginSys001MiplogClass801 + SYS_001_MIPLOG_CLASS_801_LEN));
   	}
     int localSys001MiplogTyp801Counter = -1;
     public boolean isSys001MiplogTyp801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogTyp801Counter != sharedCounter;
         localSys001MiplogTyp801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_TYP_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogTyp801
	 */
   protected void serializeSys001MiplogTyp801(char[] sys001MiplogTyp801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogTyp801,0,getStringValue(),beginSys001MiplogTyp801,SYS_001_MIPLOG_TYP_801_LEN);
       localSys001MiplogTyp801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogTyp801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogTyp801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogTyp801() {	 
   		return (substring(getStringValue(),beginSys001MiplogTyp801,beginSys001MiplogTyp801 + SYS_001_MIPLOG_TYP_801_LEN));
   	}
     int localSys001MiplogRefNum801Counter = -1;
     public boolean isSys001MiplogRefNum801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogRefNum801Counter != sharedCounter;
         localSys001MiplogRefNum801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_REF_NUM_801_LEN = 6;
	/**
	 * 	serialize this Sys001MiplogRefNum801
	 */
   protected void serializeSys001MiplogRefNum801(char[] sys001MiplogRefNum801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogRefNum801,0,getStringValue(),beginSys001MiplogRefNum801,SYS_001_MIPLOG_REF_NUM_801_LEN);
       localSys001MiplogRefNum801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogRefNum801Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSys001MiplogRefNum801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogRefNum801() {	 
   		return (substring(getStringValue(),beginSys001MiplogRefNum801,beginSys001MiplogRefNum801 + SYS_001_MIPLOG_REF_NUM_801_LEN));
   	}
     int localSys001MiplogBoxId801Counter = -1;
     public boolean isSys001MiplogBoxId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogBoxId801Counter != sharedCounter;
         localSys001MiplogBoxId801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_BOX_ID_801_LEN = 3;
	/**
	 * 	serialize this Sys001MiplogBoxId801
	 */
   protected void serializeSys001MiplogBoxId801(char[] sys001MiplogBoxId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogBoxId801,0,getStringValue(),beginSys001MiplogBoxId801,SYS_001_MIPLOG_BOX_ID_801_LEN);
       localSys001MiplogBoxId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogBoxId801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSys001MiplogBoxId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogBoxId801() {	 
   		return (substring(getStringValue(),beginSys001MiplogBoxId801,beginSys001MiplogBoxId801 + SYS_001_MIPLOG_BOX_ID_801_LEN));
   	}
     int localSys001MiplogElaTimX801Counter = -1;
     public boolean isSys001MiplogElaTimX801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogElaTimX801Counter != sharedCounter;
         localSys001MiplogElaTimX801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_ELA_TIM_X_801_LEN = 4;
	/**
	 * 	serialize this Sys001MiplogElaTimX801
	 */
   protected void serializeSys001MiplogElaTimX801(char[] sys001MiplogElaTimX801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogElaTimX801,0,getStringValue(),beginSys001MiplogElaTimX801,SYS_001_MIPLOG_ELA_TIM_X_801_LEN);
       localSys001MiplogElaTimX801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogElaTimX801Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSys001MiplogElaTimX801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogElaTimX801() {	 
   		return (substring(getStringValue(),beginSys001MiplogElaTimX801,beginSys001MiplogElaTimX801 + SYS_001_MIPLOG_ELA_TIM_X_801_LEN));
   	}




}
  
