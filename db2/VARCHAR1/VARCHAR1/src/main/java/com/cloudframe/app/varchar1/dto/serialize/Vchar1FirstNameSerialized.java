package com.cloudframe.app.varchar1.dto.serialize;

/**
*  The class Vchar1FirstNameSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Vchar1FirstNameSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Vchar1FirstNameSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VCHAR_1_FIRST_NAME_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVchar1FirstNameLen;
            protected  int beginVchar1FirstNameData;
	
	/**
	* Constructor for Vchar1FirstNameSerialized
	**/
    public Vchar1FirstNameSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Vchar1FirstNameSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1FirstNameSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Vchar1FirstNameSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Vchar1FirstNameSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Vchar1FirstNameSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VCHAR_1_FIRST_NAME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVchar1FirstNameLen = getStartOffset() + 0;	// set offset for serialization
  
             beginVchar1FirstNameData = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localVchar1FirstNameLenCounter = -1;
         public boolean isVchar1FirstNameLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVchar1FirstNameLenCounter != sharedCounter;
            localVchar1FirstNameLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int VCHAR_1_FIRST_NAME_LEN_LEN = 2;
  	/**
	 * serializeVchar1FirstNameLen
	 */
	protected void serializeVchar1FirstNameLen(short vchar1FirstNameLen) {
           replaceValue( //  save the value as string
                   getBinaryString( vchar1FirstNameLen,VCHAR_1_FIRST_NAME_LEN_LEN)
                  ,beginVchar1FirstNameLen
                  ,VCHAR_1_FIRST_NAME_LEN_LEN
                 );
            localVchar1FirstNameLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkVchar1FirstNameLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshVchar1FirstNameLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVchar1FirstNameLen() {	 
			return (getShort(beginVchar1FirstNameLen));
   	}
     int localVchar1FirstNameDataCounter = -1;
     public boolean isVchar1FirstNameDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVchar1FirstNameDataCounter != sharedCounter;
         localVchar1FirstNameDataCounter = sharedCounter; return hasModified;
     }
	protected static final int VCHAR_1_FIRST_NAME_DATA_LEN = 15;
	/**
	 * 	serialize this Vchar1FirstNameData
	 */
   protected void serializeVchar1FirstNameData(char[] vchar1FirstNameData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vchar1FirstNameData,0,getStringValue(),beginVchar1FirstNameData,VCHAR_1_FIRST_NAME_DATA_LEN);
       localVchar1FirstNameDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVchar1FirstNameDataConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshVchar1FirstNameData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVchar1FirstNameData() {	 
   		return (substring(getStringValue(),beginVchar1FirstNameData,beginVchar1FirstNameData + VCHAR_1_FIRST_NAME_DATA_LEN));
   	}




}
  
