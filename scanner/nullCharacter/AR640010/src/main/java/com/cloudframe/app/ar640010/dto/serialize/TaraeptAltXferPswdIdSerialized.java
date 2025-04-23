package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraeptAltXferPswdIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraeptAltXferPswdIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraeptAltXferPswdIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEPT_ALT_XFER_PSWD_ID_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptAltXferPswdIdLen;
            protected  int beginTaraeptAltXferPswdIdTxt;
	
	/**
	* Constructor for TaraeptAltXferPswdIdSerialized
	**/
    public TaraeptAltXferPswdIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraeptAltXferPswdIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferPswdIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraeptAltXferPswdIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,584); // serialize this field at offset 584 by default 
    }
    
	/**
	* sets parent for this TaraeptAltXferPswdIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 584 by default
    }    
	/**
	* initializes the field in TaraeptAltXferPswdIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEPT_ALT_XFER_PSWD_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptAltXferPswdIdLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraeptAltXferPswdIdTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraeptAltXferPswdIdLenCounter = -1;
         public boolean isTaraeptAltXferPswdIdLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptAltXferPswdIdLenCounter != sharedCounter;
            localTaraeptAltXferPswdIdLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_ALT_XFER_PSWD_ID_LEN_LEN = 2;
  	/**
	 * serializeTaraeptAltXferPswdIdLen
	 */
	protected void serializeTaraeptAltXferPswdIdLen(short taraeptAltXferPswdIdLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptAltXferPswdIdLen,TARAEPT_ALT_XFER_PSWD_ID_LEN_LEN)
                  ,beginTaraeptAltXferPswdIdLen
                  ,TARAEPT_ALT_XFER_PSWD_ID_LEN_LEN
                 );
            localTaraeptAltXferPswdIdLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptAltXferPswdIdLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptAltXferPswdIdLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptAltXferPswdIdLen() {	 
			return (getShort(beginTaraeptAltXferPswdIdLen));
   	}
     int localTaraeptAltXferPswdIdTxtCounter = -1;
     public boolean isTaraeptAltXferPswdIdTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptAltXferPswdIdTxtCounter != sharedCounter;
         localTaraeptAltXferPswdIdTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_ALT_XFER_PSWD_ID_TXT_LEN = 64;
	/**
	 * 	serialize this TaraeptAltXferPswdIdTxt
	 */
   protected void serializeTaraeptAltXferPswdIdTxt(char[] taraeptAltXferPswdIdTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptAltXferPswdIdTxt,0,getStringValue(),beginTaraeptAltXferPswdIdTxt,TARAEPT_ALT_XFER_PSWD_ID_TXT_LEN);
       localTaraeptAltXferPswdIdTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptAltXferPswdIdTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTaraeptAltXferPswdIdTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptAltXferPswdIdTxt() {	 
   		return (substring(getStringValue(),beginTaraeptAltXferPswdIdTxt,beginTaraeptAltXferPswdIdTxt + TARAEPT_ALT_XFER_PSWD_ID_TXT_LEN));
   	}




}
  
