package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01OsiSymbolContSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01OsiSymbolContSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01OsiSymbolContSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_OSI_SYMBOL_CONT_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SearchOptSymbolType;
            protected  int beginBdms01SearchOptSymbol;
            protected  int beginBdms01SearchOptStrike;
            protected  int beginBdms01SearchOptStrikex;
	
	/**
	* Constructor for Bdms01OsiSymbolContSerialized
	**/
    public Bdms01OsiSymbolContSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01OsiSymbolContSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OsiSymbolContSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01OsiSymbolContSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,74); // serialize this field at offset 74 by default 
    }
    
	/**
	* sets parent for this Bdms01OsiSymbolContSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 74 by default
    }    
	/**
	* initializes the field in Bdms01OsiSymbolContSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_OSI_SYMBOL_CONT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SearchOptSymbolType = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01SearchOptSymbol = getStartOffset() + 1;	// set offset for serialization
  
             beginBdms01SearchOptStrike = getStartOffset() + 7;	// set offset for serialization
  
             beginBdms01SearchOptStrikex = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01SearchOptSymbolTypeCounter = -1;
     public boolean isBdms01SearchOptSymbolTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptSymbolTypeCounter != sharedCounter;
         localBdms01SearchOptSymbolTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_SYMBOL_TYPE_LEN = 1;
	/**
	 * 	serialize this Bdms01SearchOptSymbolType
	 */
   protected void serializeBdms01SearchOptSymbolType(char[] bdms01SearchOptSymbolType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptSymbolType,0,getStringValue(),beginBdms01SearchOptSymbolType,BDMS_01_SEARCH_OPT_SYMBOL_TYPE_LEN);
       localBdms01SearchOptSymbolTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptSymbolTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptSymbolType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptSymbolType() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptSymbolType,beginBdms01SearchOptSymbolType + BDMS_01_SEARCH_OPT_SYMBOL_TYPE_LEN));
   	}
     int localBdms01SearchOptSymbolCounter = -1;
     public boolean isBdms01SearchOptSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptSymbolCounter != sharedCounter;
         localBdms01SearchOptSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_SYMBOL_LEN = 6;
	/**
	 * 	serialize this Bdms01SearchOptSymbol
	 */
   protected void serializeBdms01SearchOptSymbol(char[] bdms01SearchOptSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptSymbol,0,getStringValue(),beginBdms01SearchOptSymbol,BDMS_01_SEARCH_OPT_SYMBOL_LEN);
       localBdms01SearchOptSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptSymbol() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptSymbol,beginBdms01SearchOptSymbol + BDMS_01_SEARCH_OPT_SYMBOL_LEN));
   	}
     int localBdms01SearchOptStrikeCounter = -1;
     
     public boolean isBdms01SearchOptStrikeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptStrikeCounter != sharedCounter;
         localBdms01SearchOptStrikeCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01SearchOptStrike
	 *	@return bdms01SearchOptStrike
	 */
	public char[]  getBdms01SearchOptStrikeString() {
	    return getCharArray(beginBdms01SearchOptStrike,BDMS_01_SEARCH_OPT_STRIKE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SearchOptStrikeIsNumeric() {
		    return isNumeric(beginBdms01SearchOptStrike
	                    ,beginBdms01SearchOptStrike + BDMS_01_SEARCH_OPT_STRIKE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_SEARCH_OPT_STRIKE_LEN = 8;
  protected  static final int BDMS_01_SEARCH_OPT_STRIKE_SCALE = 3;

   protected BigDecimal checkBdms01SearchOptStrikeMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeBdms01SearchOptStrike
	 */
	protected void serializeBdms01SearchOptStrike(BigDecimal bdms01SearchOptStrike) {
	       putNumber(beginBdms01SearchOptStrike,bdms01SearchOptStrike,BDMS_01_SEARCH_OPT_STRIKE_LEN,BDMS_01_SEARCH_OPT_STRIKE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01SearchOptStrikeCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01SearchOptStrike
	 */
   	protected  BigDecimal serializeBdms01SearchOptStrike(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBdms01SearchOptStrike
		       ,8
		      );		 localBdms01SearchOptStrikeCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_SEARCH_OPT_STRIKE_LEN,BDMS_01_SEARCH_OPT_STRIKE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01SearchOptStrike", beginBdms01SearchOptStrike,BDMS_01_SEARCH_OPT_STRIKE_LEN);
    	}
    }
    /**
	 *	refreshBdms01SearchOptStrike is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01SearchOptStrike() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01SearchOptStrike
			            ,BDMS_01_SEARCH_OPT_STRIKE_LEN
			            ,BDMS_01_SEARCH_OPT_STRIKE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01SearchOptStrike", beginBdms01SearchOptStrike,BDMS_01_SEARCH_OPT_STRIKE_LEN);
    }
   	}
     int localBdms01SearchOptStrikexCounter = -1;
     public boolean isBdms01SearchOptStrikexModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptStrikexCounter != sharedCounter;
         localBdms01SearchOptStrikexCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_STRIKEX_LEN = 8;
	/**
	 * 	serialize this Bdms01SearchOptStrikex
	 */
   protected void serializeBdms01SearchOptStrikex(char[] bdms01SearchOptStrikex) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptStrikex,0,getStringValue(),beginBdms01SearchOptStrikex,BDMS_01_SEARCH_OPT_STRIKEX_LEN);
       localBdms01SearchOptStrikexCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptStrikexConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptStrikex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptStrikex() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptStrikex,beginBdms01SearchOptStrikex + BDMS_01_SEARCH_OPT_STRIKEX_LEN));
   	}




}
  
