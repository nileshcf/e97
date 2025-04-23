package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraxtkStatsFileNamSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraxtkStatsFileNamSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraxtkStatsFileNamSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAXTK_STATS_FILE_NAM_LENGTH = 258;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraxtkStatsFileNamLen;
            protected  int beginTaraxtkStatsFileNamTxt;
	
	/**
	* Constructor for TaraxtkStatsFileNamSerialized
	**/
    public TaraxtkStatsFileNamSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraxtkStatsFileNamSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkStatsFileNamSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraxtkStatsFileNamSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,309); // serialize this field at offset 309 by default 
    }
    
	/**
	* sets parent for this TaraxtkStatsFileNamSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 309 by default
    }    
	/**
	* initializes the field in TaraxtkStatsFileNamSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAXTK_STATS_FILE_NAM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraxtkStatsFileNamLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraxtkStatsFileNamTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraxtkStatsFileNamLenCounter = -1;
         public boolean isTaraxtkStatsFileNamLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkStatsFileNamLenCounter != sharedCounter;
            localTaraxtkStatsFileNamLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_STATS_FILE_NAM_LEN_LEN = 2;
  	/**
	 * serializeTaraxtkStatsFileNamLen
	 */
	protected void serializeTaraxtkStatsFileNamLen(short taraxtkStatsFileNamLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkStatsFileNamLen,TARAXTK_STATS_FILE_NAM_LEN_LEN)
                  ,beginTaraxtkStatsFileNamLen
                  ,TARAXTK_STATS_FILE_NAM_LEN_LEN
                 );
            localTaraxtkStatsFileNamLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkStatsFileNamLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkStatsFileNamLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkStatsFileNamLen() {	 
			return (getShort(beginTaraxtkStatsFileNamLen));
   	}
     int localTaraxtkStatsFileNamTxtCounter = -1;
     public boolean isTaraxtkStatsFileNamTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkStatsFileNamTxtCounter != sharedCounter;
         localTaraxtkStatsFileNamTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_STATS_FILE_NAM_TXT_LEN = 256;
	/**
	 * 	serialize this TaraxtkStatsFileNamTxt
	 */
   protected void serializeTaraxtkStatsFileNamTxt(char[] taraxtkStatsFileNamTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkStatsFileNamTxt,0,getStringValue(),beginTaraxtkStatsFileNamTxt,TARAXTK_STATS_FILE_NAM_TXT_LEN);
       localTaraxtkStatsFileNamTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkStatsFileNamTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 256 ,false, false);
   }
    /**
	 *	refreshTaraxtkStatsFileNamTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkStatsFileNamTxt() {	 
   		return (substring(getStringValue(),beginTaraxtkStatsFileNamTxt,beginTaraxtkStatsFileNamTxt + TARAXTK_STATS_FILE_NAM_TXT_LEN));
   	}




}
  
