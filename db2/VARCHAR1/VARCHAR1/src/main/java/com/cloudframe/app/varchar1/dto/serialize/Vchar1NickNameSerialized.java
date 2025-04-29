package com.cloudframe.app.varchar1.dto.serialize;

/**
*  The class Vchar1NickNameSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Vchar1NickNameSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Vchar1NickNameSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VCHAR_1_NICK_NAME_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVchar1NickNameLen;
            protected  int beginVchar1NickNameData;
	
	/**
	* Constructor for Vchar1NickNameSerialized
	**/
    public Vchar1NickNameSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Vchar1NickNameSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1NickNameSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Vchar1NickNameSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,34); // serialize this field at offset 34 by default 
    }
    
	/**
	* sets parent for this Vchar1NickNameSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 34 by default
    }    
	/**
	* initializes the field in Vchar1NickNameSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VCHAR_1_NICK_NAME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVchar1NickNameLen = getStartOffset() + 0;	// set offset for serialization
  
             beginVchar1NickNameData = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localVchar1NickNameLenCounter = -1;
         public boolean isVchar1NickNameLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVchar1NickNameLenCounter != sharedCounter;
            localVchar1NickNameLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int VCHAR_1_NICK_NAME_LEN_LEN = 2;
  	/**
	 * serializeVchar1NickNameLen
	 */
	protected void serializeVchar1NickNameLen(short vchar1NickNameLen) {
           replaceValue( //  save the value as string
                   getBinaryString( vchar1NickNameLen,VCHAR_1_NICK_NAME_LEN_LEN)
                  ,beginVchar1NickNameLen
                  ,VCHAR_1_NICK_NAME_LEN_LEN
                 );
            localVchar1NickNameLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkVchar1NickNameLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshVchar1NickNameLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVchar1NickNameLen() {	 
			return (getShort(beginVchar1NickNameLen));
   	}
     int localVchar1NickNameDataCounter = -1;
     public boolean isVchar1NickNameDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVchar1NickNameDataCounter != sharedCounter;
         localVchar1NickNameDataCounter = sharedCounter; return hasModified;
     }
	protected static final int VCHAR_1_NICK_NAME_DATA_LEN = 15;
	/**
	 * 	serialize this Vchar1NickNameData
	 */
   protected void serializeVchar1NickNameData(char[] vchar1NickNameData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vchar1NickNameData,0,getStringValue(),beginVchar1NickNameData,VCHAR_1_NICK_NAME_DATA_LEN);
       localVchar1NickNameDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVchar1NickNameDataConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshVchar1NickNameData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVchar1NickNameData() {	 
   		return (substring(getStringValue(),beginVchar1NickNameData,beginVchar1NickNameData + VCHAR_1_NICK_NAME_DATA_LEN));
   	}




}
  
