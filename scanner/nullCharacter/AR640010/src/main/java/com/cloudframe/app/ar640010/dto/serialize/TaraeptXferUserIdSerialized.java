package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraeptXferUserIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraeptXferUserIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraeptXferUserIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEPT_XFER_USER_ID_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptXferUserIdLen;
            protected  int beginTaraeptXferUserIdTxt;
	
	/**
	* Constructor for TaraeptXferUserIdSerialized
	**/
    public TaraeptXferUserIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraeptXferUserIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferUserIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraeptXferUserIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,34); // serialize this field at offset 34 by default 
    }
    
	/**
	* sets parent for this TaraeptXferUserIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 34 by default
    }    
	/**
	* initializes the field in TaraeptXferUserIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEPT_XFER_USER_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptXferUserIdLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraeptXferUserIdTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraeptXferUserIdLenCounter = -1;
         public boolean isTaraeptXferUserIdLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptXferUserIdLenCounter != sharedCounter;
            localTaraeptXferUserIdLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_XFER_USER_ID_LEN_LEN = 2;
  	/**
	 * serializeTaraeptXferUserIdLen
	 */
	protected void serializeTaraeptXferUserIdLen(short taraeptXferUserIdLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptXferUserIdLen,TARAEPT_XFER_USER_ID_LEN_LEN)
                  ,beginTaraeptXferUserIdLen
                  ,TARAEPT_XFER_USER_ID_LEN_LEN
                 );
            localTaraeptXferUserIdLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptXferUserIdLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptXferUserIdLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptXferUserIdLen() {	 
			return (getShort(beginTaraeptXferUserIdLen));
   	}
     int localTaraeptXferUserIdTxtCounter = -1;
     public boolean isTaraeptXferUserIdTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptXferUserIdTxtCounter != sharedCounter;
         localTaraeptXferUserIdTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_XFER_USER_ID_TXT_LEN = 64;
	/**
	 * 	serialize this TaraeptXferUserIdTxt
	 */
   protected void serializeTaraeptXferUserIdTxt(char[] taraeptXferUserIdTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptXferUserIdTxt,0,getStringValue(),beginTaraeptXferUserIdTxt,TARAEPT_XFER_USER_ID_TXT_LEN);
       localTaraeptXferUserIdTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptXferUserIdTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTaraeptXferUserIdTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptXferUserIdTxt() {	 
   		return (substring(getStringValue(),beginTaraeptXferUserIdTxt,beginTaraeptXferUserIdTxt + TARAEPT_XFER_USER_ID_TXT_LEN));
   	}




}
  
