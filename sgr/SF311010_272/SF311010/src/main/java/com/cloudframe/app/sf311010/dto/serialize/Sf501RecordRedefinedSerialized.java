package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501RecordRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501RecordRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501RecordRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_RECORD_REDEFINED_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501Class;
            protected  int beginSf501Type;
            protected  int beginSf501JIcSeqNo;
            protected  int beginSf501JIcSeqNoComp;
            protected  int beginSf501JIsoData;
	
	/**
	* Constructor for Sf501RecordRedefinedSerialized
	**/
    public Sf501RecordRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501RecordRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501RecordRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501RecordRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf501RecordRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf501RecordRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_RECORD_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501Class = getStartOffset() + 0;	// set offset for serialization
  
             beginSf501Type = getStartOffset() + 1;	// set offset for serialization
  
  
             beginSf501JIcSeqNo = getStartOffset() + 53;	// set offset for serialization
  
             beginSf501JIcSeqNoComp = getStartOffset() + 53;	// set offset for serialization
  
             beginSf501JIsoData = getStartOffset() + 61;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf501ClassCounter = -1;
     public boolean isSf501ClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501ClassCounter != sharedCounter;
         localSf501ClassCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_CLASS_LEN = 1;
	/**
	 * 	serialize this Sf501Class
	 */
   protected void serializeSf501Class(char[] sf501Class) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501Class,0,getStringValue(),beginSf501Class,SF_501_CLASS_LEN);
       localSf501ClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501ClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501Class is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501Class() {	 
   		return (substring(getStringValue(),beginSf501Class,beginSf501Class + SF_501_CLASS_LEN));
   	}
     int localSf501TypeCounter = -1;
     public boolean isSf501TypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501TypeCounter != sharedCounter;
         localSf501TypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf501Type
	 */
   protected void serializeSf501Type(char[] sf501Type) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501Type,0,getStringValue(),beginSf501Type,SF_501_TYPE_LEN);
       localSf501TypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501TypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501Type is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501Type() {	 
   		return (substring(getStringValue(),beginSf501Type,beginSf501Type + SF_501_TYPE_LEN));
   	}
     int localSf501JIcSeqNoCounter = -1;
     public boolean isSf501JIcSeqNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JIcSeqNoCounter != sharedCounter;
         localSf501JIcSeqNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JIC_SEQ_NO_LEN = 4;
	/**
	 * 	serialize this Sf501JIcSeqNo
	 */
   protected void serializeSf501JIcSeqNo(char[] sf501JIcSeqNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JIcSeqNo,0,getStringValue(),beginSf501JIcSeqNo,SF_501_JIC_SEQ_NO_LEN);
       localSf501JIcSeqNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JIcSeqNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf501JIcSeqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JIcSeqNo() {	 
   		return (substring(getStringValue(),beginSf501JIcSeqNo,beginSf501JIcSeqNo + SF_501_JIC_SEQ_NO_LEN));
   	}
         int localSf501JIcSeqNoCompCounter = -1;
         public boolean isSf501JIcSeqNoCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf501JIcSeqNoCompCounter != sharedCounter;
            localSf501JIcSeqNoCompCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_501_JIC_SEQ_NO_COMP_LEN = 4;
  	/**
	 * serializeSf501JIcSeqNoComp
	 */
	protected void serializeSf501JIcSeqNoComp(long sf501JIcSeqNoComp) {
           replaceValue( //  save the value as string
                   getBinaryString( sf501JIcSeqNoComp,SF_501_JIC_SEQ_NO_COMP_LEN)
                  ,beginSf501JIcSeqNoComp
                  ,SF_501_JIC_SEQ_NO_COMP_LEN
                 );
            localSf501JIcSeqNoCompCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSf501JIcSeqNoCompMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf501JIcSeqNoComp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf501JIcSeqNoComp() {	 
			return (getUnsignedInt(beginSf501JIcSeqNoComp));
   	}
     int localSf501JIsoDataCounter = -1;
     public boolean isSf501JIsoDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JIsoDataCounter != sharedCounter;
         localSf501JIsoDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JISO_DATA_LEN = 7939;
	/**
	 * 	serialize this Sf501JIsoData
	 */
   protected void serializeSf501JIsoData(char[] sf501JIsoData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JIsoData,0,getStringValue(),beginSf501JIsoData,SF_501_JISO_DATA_LEN);
       localSf501JIsoDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JIsoDataConstraints(char[] value) {
   			return super.checkConstraints(value , 7939 ,false, false);
   }
    /**
	 *	refreshSf501JIsoData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JIsoData() {	 
   		return (substring(getStringValue(),beginSf501JIsoData,beginSf501JIsoData + SF_501_JISO_DATA_LEN));
   	}




}
  
