package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtFldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtFldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtFldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_FLDS_LENGTH = 29;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExtPricePlan;
            protected  int beginExtSfo;
            protected  int beginExtMarketCd;
            protected  int beginExtMinId;
	
	/**
	* Constructor for ExtFldsSerialized
	**/
    public ExtFldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtFldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtFldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtFldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,314); // serialize this field at offset 314 by default 
    }
    
	/**
	* sets parent for this ExtFldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 314 by default
    }    
	/**
	* initializes the field in ExtFldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_FLDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExtPricePlan = getStartOffset() + 0;	// set offset for serialization
  
             beginExtSfo = getStartOffset() + 5;	// set offset for serialization
  
             beginExtMarketCd = getStartOffset() + 15;	// set offset for serialization
  
             beginExtMinId = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtPricePlanCounter = -1;
     public boolean isExtPricePlanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtPricePlanCounter != sharedCounter;
         localExtPricePlanCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extPricePlan
	 *	@return extPricePlan
	 */
	public char[]  getExtPricePlanString() {
	     return getCharArray(beginExtPricePlan,EXT_PRICE_PLAN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extPricePlanIsNumeric() {
	    return isNumeric(beginExtPricePlan
	                    ,beginExtPricePlan + EXT_PRICE_PLAN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_PRICE_PLAN_LEN = 5;
  	/**
	 * serializeExtPricePlan
	 */
	protected void serializeExtPricePlan(long extPricePlan) {
		 putNumber(beginExtPricePlan,extPricePlan,EXT_PRICE_PLAN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtPricePlanCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtPricePlan
	 */
   	protected  long serializeExtPricePlan(char[] value) {
	    long  extPricePlan;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extPricePlan = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginExtPricePlan
		       ,5
		      );
		 localExtPricePlanCounter = shareString.getSerializedField().getModifiedCounter();
		return  extPricePlan;
    }

   protected long checkExtPricePlanMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtPricePlan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtPricePlan() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtPricePlan
			                 ,EXT_PRICE_PLAN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extPricePlan", beginExtPricePlan,EXT_PRICE_PLAN_LEN);
    }
   	}
     int localExtSfoCounter = -1;
     public boolean isExtSfoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSfoCounter != sharedCounter;
         localExtSfoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extSfo
	 *	@return extSfo
	 */
	public char[]  getExtSfoString() {
	     return getCharArray(beginExtSfo,EXT_SFO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extSfoIsNumeric() {
	    return isNumeric(beginExtSfo
	                    ,beginExtSfo + EXT_SFO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_SFO_LEN = 10;
  	/**
	 * serializeExtSfo
	 */
	protected void serializeExtSfo(long extSfo) {
		 putNumber(beginExtSfo,extSfo,EXT_SFO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtSfoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtSfo
	 */
   	protected  long serializeExtSfo(char[] value) {
	    long  extSfo;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extSfo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginExtSfo
		       ,10
		      );
		 localExtSfoCounter = shareString.getSerializedField().getModifiedCounter();
		return  extSfo;
    }

   protected long checkExtSfoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtSfo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtSfo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtSfo
			                 ,EXT_SFO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extSfo", beginExtSfo,EXT_SFO_LEN);
    }
   	}
     int localExtMarketCdCounter = -1;
     public boolean isExtMarketCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMarketCdCounter != sharedCounter;
         localExtMarketCdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MARKET_CD_LEN = 4;
	/**
	 * 	serialize this ExtMarketCd
	 */
   protected void serializeExtMarketCd(char[] extMarketCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMarketCd,0,getStringValue(),beginExtMarketCd,EXT_MARKET_CD_LEN);
       localExtMarketCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMarketCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshExtMarketCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMarketCd() {	 
   		return (substring(getStringValue(),beginExtMarketCd,beginExtMarketCd + EXT_MARKET_CD_LEN));
   	}
     int localExtMinIdCounter = -1;
     public boolean isExtMinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMinIdCounter != sharedCounter;
         localExtMinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MIN_ID_LEN = 10;
	/**
	 * 	serialize this ExtMinId
	 */
   protected void serializeExtMinId(char[] extMinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMinId,0,getStringValue(),beginExtMinId,EXT_MIN_ID_LEN);
       localExtMinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshExtMinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMinId() {	 
   		return (substring(getStringValue(),beginExtMinId,beginExtMinId + EXT_MIN_ID_LEN));
   	}




}
  
