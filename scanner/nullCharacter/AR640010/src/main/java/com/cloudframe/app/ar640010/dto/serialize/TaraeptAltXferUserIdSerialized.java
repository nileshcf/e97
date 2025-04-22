package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraeptAltXferUserIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraeptAltXferUserIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraeptAltXferUserIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEPT_ALT_XFER_USER_ID_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptAltXferUserIdLen;
            protected  int beginTaraeptAltXferUserIdTxt;
	
	/**
	* Constructor for TaraeptAltXferUserIdSerialized
	**/
    public TaraeptAltXferUserIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraeptAltXferUserIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferUserIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraeptAltXferUserIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,518); // serialize this field at offset 518 by default 
    }
    
	/**
	* sets parent for this TaraeptAltXferUserIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 518 by default
    }    
	/**
	* initializes the field in TaraeptAltXferUserIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEPT_ALT_XFER_USER_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptAltXferUserIdLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraeptAltXferUserIdTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraeptAltXferUserIdLenCounter = -1;
         public boolean isTaraeptAltXferUserIdLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptAltXferUserIdLenCounter != sharedCounter;
            localTaraeptAltXferUserIdLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_ALT_XFER_USER_ID_LEN_LEN = 2;
  	/**
	 * serializeTaraeptAltXferUserIdLen
	 */
	protected void serializeTaraeptAltXferUserIdLen(short taraeptAltXferUserIdLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptAltXferUserIdLen,TARAEPT_ALT_XFER_USER_ID_LEN_LEN)
                  ,beginTaraeptAltXferUserIdLen
                  ,TARAEPT_ALT_XFER_USER_ID_LEN_LEN
                 );
            localTaraeptAltXferUserIdLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptAltXferUserIdLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptAltXferUserIdLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptAltXferUserIdLen() {	 
			return (getShort(beginTaraeptAltXferUserIdLen));
   	}
     int localTaraeptAltXferUserIdTxtCounter = -1;
     public boolean isTaraeptAltXferUserIdTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptAltXferUserIdTxtCounter != sharedCounter;
         localTaraeptAltXferUserIdTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_ALT_XFER_USER_ID_TXT_LEN = 64;
	/**
	 * 	serialize this TaraeptAltXferUserIdTxt
	 */
   protected void serializeTaraeptAltXferUserIdTxt(char[] taraeptAltXferUserIdTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptAltXferUserIdTxt,0,getStringValue(),beginTaraeptAltXferUserIdTxt,TARAEPT_ALT_XFER_USER_ID_TXT_LEN);
       localTaraeptAltXferUserIdTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptAltXferUserIdTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTaraeptAltXferUserIdTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptAltXferUserIdTxt() {	 
   		return (substring(getStringValue(),beginTaraeptAltXferUserIdTxt,beginTaraeptAltXferUserIdTxt + TARAEPT_ALT_XFER_USER_ID_TXT_LEN));
   	}




}
  
