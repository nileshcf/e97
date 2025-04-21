package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraeptXferPswdIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraeptXferPswdIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraeptXferPswdIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEPT_XFER_PSWD_ID_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptXferPswdIdLen;
            protected  int beginTaraeptXferPswdIdTxt;
	
	/**
	* Constructor for TaraeptXferPswdIdSerialized
	**/
    public TaraeptXferPswdIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraeptXferPswdIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferPswdIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraeptXferPswdIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this TaraeptXferPswdIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in TaraeptXferPswdIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEPT_XFER_PSWD_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptXferPswdIdLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraeptXferPswdIdTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraeptXferPswdIdLenCounter = -1;
         public boolean isTaraeptXferPswdIdLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptXferPswdIdLenCounter != sharedCounter;
            localTaraeptXferPswdIdLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_XFER_PSWD_ID_LEN_LEN = 2;
  	/**
	 * serializeTaraeptXferPswdIdLen
	 */
	protected void serializeTaraeptXferPswdIdLen(short taraeptXferPswdIdLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptXferPswdIdLen,TARAEPT_XFER_PSWD_ID_LEN_LEN)
                  ,beginTaraeptXferPswdIdLen
                  ,TARAEPT_XFER_PSWD_ID_LEN_LEN
                 );
            localTaraeptXferPswdIdLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptXferPswdIdLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptXferPswdIdLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptXferPswdIdLen() {	 
			return (getShort(beginTaraeptXferPswdIdLen));
   	}
     int localTaraeptXferPswdIdTxtCounter = -1;
     public boolean isTaraeptXferPswdIdTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptXferPswdIdTxtCounter != sharedCounter;
         localTaraeptXferPswdIdTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_XFER_PSWD_ID_TXT_LEN = 64;
	/**
	 * 	serialize this TaraeptXferPswdIdTxt
	 */
   protected void serializeTaraeptXferPswdIdTxt(char[] taraeptXferPswdIdTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptXferPswdIdTxt,0,getStringValue(),beginTaraeptXferPswdIdTxt,TARAEPT_XFER_PSWD_ID_TXT_LEN);
       localTaraeptXferPswdIdTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptXferPswdIdTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTaraeptXferPswdIdTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptXferPswdIdTxt() {	 
   		return (substring(getStringValue(),beginTaraeptXferPswdIdTxt,beginTaraeptXferPswdIdTxt + TARAEPT_XFER_PSWD_ID_TXT_LEN));
   	}




}
  
