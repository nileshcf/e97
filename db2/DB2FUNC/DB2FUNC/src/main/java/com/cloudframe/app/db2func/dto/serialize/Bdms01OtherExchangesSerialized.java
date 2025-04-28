package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01OtherExchangesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01OtherExchangesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01OtherExchangesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_OTHER_EXCHANGES_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01OtherExchangeCd;
            protected  int beginBdms01OtherExchangeSymbol;
	
	/**
	* Constructor for Bdms01OtherExchangesSerialized
	**/
    public Bdms01OtherExchangesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01OtherExchangesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OtherExchangesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01OtherExchangesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,834); // serialize this field at offset 834 by default 
    }
    
	/**
	* sets parent for this Bdms01OtherExchangesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 834 by default
    }    
	/**
	* initializes the field in Bdms01OtherExchangesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_OTHER_EXCHANGES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01OtherExchangeCd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01OtherExchangeSymbol = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01OtherExchangeCdCounter = -1;
     public boolean isBdms01OtherExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtherExchangeCdCounter != sharedCounter;
         localBdms01OtherExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTHER_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01OtherExchangeCd
	 */
   protected void serializeBdms01OtherExchangeCd(char[] bdms01OtherExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtherExchangeCd,0,getStringValue(),beginBdms01OtherExchangeCd,BDMS_01_OTHER_EXCHANGE_CD_LEN);
       localBdms01OtherExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtherExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OtherExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtherExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01OtherExchangeCd,beginBdms01OtherExchangeCd + BDMS_01_OTHER_EXCHANGE_CD_LEN));
   	}
     int localBdms01OtherExchangeSymbolCounter = -1;
     public boolean isBdms01OtherExchangeSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtherExchangeSymbolCounter != sharedCounter;
         localBdms01OtherExchangeSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTHER_EXCHANGE_SYMBOL_LEN = 12;
	/**
	 * 	serialize this Bdms01OtherExchangeSymbol
	 */
   protected void serializeBdms01OtherExchangeSymbol(char[] bdms01OtherExchangeSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtherExchangeSymbol,0,getStringValue(),beginBdms01OtherExchangeSymbol,BDMS_01_OTHER_EXCHANGE_SYMBOL_LEN);
       localBdms01OtherExchangeSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtherExchangeSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01OtherExchangeSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtherExchangeSymbol() {	 
   		return (substring(getStringValue(),beginBdms01OtherExchangeSymbol,beginBdms01OtherExchangeSymbol + BDMS_01_OTHER_EXCHANGE_SYMBOL_LEN));
   	}




}
  
