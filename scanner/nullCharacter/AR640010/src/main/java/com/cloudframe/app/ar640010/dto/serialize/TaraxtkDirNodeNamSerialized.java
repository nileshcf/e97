package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraxtkDirNodeNamSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraxtkDirNodeNamSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraxtkDirNodeNamSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAXTK_DIR_NODE_NAM_LENGTH = 258;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraxtkDirNodeNamLen;
            protected  int beginTaraxtkDirNodeNamTxt;
	
	/**
	* Constructor for TaraxtkDirNodeNamSerialized
	**/
    public TaraxtkDirNodeNamSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraxtkDirNodeNamSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkDirNodeNamSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraxtkDirNodeNamSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,25); // serialize this field at offset 25 by default 
    }
    
	/**
	* sets parent for this TaraxtkDirNodeNamSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 25 by default
    }    
	/**
	* initializes the field in TaraxtkDirNodeNamSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAXTK_DIR_NODE_NAM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraxtkDirNodeNamLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraxtkDirNodeNamTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraxtkDirNodeNamLenCounter = -1;
         public boolean isTaraxtkDirNodeNamLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkDirNodeNamLenCounter != sharedCounter;
            localTaraxtkDirNodeNamLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_DIR_NODE_NAM_LEN_LEN = 2;
  	/**
	 * serializeTaraxtkDirNodeNamLen
	 */
	protected void serializeTaraxtkDirNodeNamLen(short taraxtkDirNodeNamLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkDirNodeNamLen,TARAXTK_DIR_NODE_NAM_LEN_LEN)
                  ,beginTaraxtkDirNodeNamLen
                  ,TARAXTK_DIR_NODE_NAM_LEN_LEN
                 );
            localTaraxtkDirNodeNamLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkDirNodeNamLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkDirNodeNamLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkDirNodeNamLen() {	 
			return (getShort(beginTaraxtkDirNodeNamLen));
   	}
     int localTaraxtkDirNodeNamTxtCounter = -1;
     public boolean isTaraxtkDirNodeNamTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkDirNodeNamTxtCounter != sharedCounter;
         localTaraxtkDirNodeNamTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_DIR_NODE_NAM_TXT_LEN = 256;
	/**
	 * 	serialize this TaraxtkDirNodeNamTxt
	 */
   protected void serializeTaraxtkDirNodeNamTxt(char[] taraxtkDirNodeNamTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkDirNodeNamTxt,0,getStringValue(),beginTaraxtkDirNodeNamTxt,TARAXTK_DIR_NODE_NAM_TXT_LEN);
       localTaraxtkDirNodeNamTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkDirNodeNamTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 256 ,false, false);
   }
    /**
	 *	refreshTaraxtkDirNodeNamTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkDirNodeNamTxt() {	 
   		return (substring(getStringValue(),beginTaraxtkDirNodeNamTxt,beginTaraxtkDirNodeNamTxt + TARAXTK_DIR_NODE_NAM_TXT_LEN));
   	}




}
  
