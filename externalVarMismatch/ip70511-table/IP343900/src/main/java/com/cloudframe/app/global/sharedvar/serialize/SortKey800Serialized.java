package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SortKey800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortKey800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortKey800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_KEY_800_LENGTH = 212;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSkEndpoint800;
            protected  int beginSkFrmtInd800;
            protected  int beginSkDestId800;
            protected  int beginSkDestIdx800;
            protected  int beginSkTxnSortCd800;
            protected  int beginSkOrgnId800;
            protected  int beginSkRevInd800;
            protected  int beginSkSettleInd800;
            protected  int beginSkCurrencyCd800;
            protected  int beginSkMcc800;
            protected  int beginSkMccInfo800;
            protected  int beginSkDelCyc800;
            protected  int beginSkTipabroInd800;
            protected  int beginSkInbndFrmtInd800;
            protected  int beginSkInfileId800;
            protected  int beginSkInfileRevCd800;
            protected  int beginSkMsgCount800;
            protected  int beginSkOutfileId800;
            protected  int beginSkAb800;
            protected  int beginSkPurgeDt800;
            protected  int beginSkFlexRouteInd800;
	
	/**
	* Constructor for SortKey800Serialized
	**/
    public SortKey800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in SortKey800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_KEY_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSkEndpoint800 = getStartOffset() + 0;	// set offset for serialization
  
             beginSkFrmtInd800 = getStartOffset() + 7;	// set offset for serialization
  
             beginSkDestId800 = getStartOffset() + 8;	// set offset for serialization
  
             beginSkDestIdx800 = getStartOffset() + 8;	// set offset for serialization
  
             beginSkTxnSortCd800 = getStartOffset() + 19;	// set offset for serialization
  
             beginSkOrgnId800 = getStartOffset() + 21;	// set offset for serialization
  
             beginSkRevInd800 = getStartOffset() + 32;	// set offset for serialization
  
             beginSkSettleInd800 = getStartOffset() + 33;	// set offset for serialization
  
             beginSkCurrencyCd800 = getStartOffset() + 34;	// set offset for serialization
  
             beginSkMcc800 = getStartOffset() + 37;	// set offset for serialization
  
             beginSkMccInfo800 = getStartOffset() + 41;	// set offset for serialization
  
             beginSkDelCyc800 = getStartOffset() + 137;	// set offset for serialization
  
             beginSkTipabroInd800 = getStartOffset() + 138;	// set offset for serialization
  
             beginSkInbndFrmtInd800 = getStartOffset() + 139;	// set offset for serialization
  
             beginSkInfileId800 = getStartOffset() + 140;	// set offset for serialization
  
             beginSkInfileRevCd800 = getStartOffset() + 165;	// set offset for serialization
  
             beginSkMsgCount800 = getStartOffset() + 166;	// set offset for serialization
  
             beginSkOutfileId800 = getStartOffset() + 177;	// set offset for serialization
  
             beginSkAb800 = getStartOffset() + 202;	// set offset for serialization
  
             beginSkPurgeDt800 = getStartOffset() + 205;	// set offset for serialization
  
             beginSkFlexRouteInd800 = getStartOffset() + 211;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSkEndpoint800Counter = -1;
     public boolean isSkEndpoint800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkEndpoint800Counter != sharedCounter;
         localSkEndpoint800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skEndpoint800
	 *	@return skEndpoint800
	 */
	public char[]  getSkEndpoint800String() {
	     return getCharArray(beginSkEndpoint800,SK_ENDPOINT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skEndpoint800IsNumeric() {
	    return isNumeric(beginSkEndpoint800
	                    ,beginSkEndpoint800 + SK_ENDPOINT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_ENDPOINT_800_LEN = 7;
  	/**
	 * serializeSkEndpoint800
	 */
	protected void serializeSkEndpoint800(long skEndpoint800) {
		 putNumber(beginSkEndpoint800,skEndpoint800,SK_ENDPOINT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkEndpoint800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkEndpoint800
	 */
   	protected  long serializeSkEndpoint800(char[] value) {
	    long  skEndpoint800;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skEndpoint800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSkEndpoint800
		       ,7
		      );
		 localSkEndpoint800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skEndpoint800;
    }

   protected long checkSkEndpoint800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkEndpoint800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSkEndpoint800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSkEndpoint800
			                 ,SK_ENDPOINT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skEndpoint800", beginSkEndpoint800,SK_ENDPOINT_800_LEN);
    }
   	}
     int localSkFrmtInd800Counter = -1;
     public boolean isSkFrmtInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkFrmtInd800Counter != sharedCounter;
         localSkFrmtInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_FRMT_IND_800_LEN = 1;
	/**
	 * 	serialize this SkFrmtInd800
	 */
   protected void serializeSkFrmtInd800(char[] skFrmtInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skFrmtInd800,0,getStringValue(),beginSkFrmtInd800,SK_FRMT_IND_800_LEN);
       localSkFrmtInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkFrmtInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkFrmtInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkFrmtInd800() {	 
   		return (substring(getStringValue(),beginSkFrmtInd800,beginSkFrmtInd800 + SK_FRMT_IND_800_LEN));
   	}
     int localSkDestId800Counter = -1;
     public boolean isSkDestId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkDestId800Counter != sharedCounter;
         localSkDestId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skDestId800
	 *	@return skDestId800
	 */
	public char[]  getSkDestId800String() {
	     return getCharArray(beginSkDestId800,SK_DEST_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skDestId800IsNumeric() {
	    return isNumeric(beginSkDestId800
	                    ,beginSkDestId800 + SK_DEST_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_DEST_ID_800_LEN = 11;
  	/**
	 * serializeSkDestId800
	 */
	protected void serializeSkDestId800(long skDestId800) {
		 putNumber(beginSkDestId800,skDestId800,SK_DEST_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkDestId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkDestId800
	 */
   	protected  long serializeSkDestId800(char[] value) {
	    long  skDestId800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skDestId800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginSkDestId800
		       ,11
		      );
		 localSkDestId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skDestId800;
    }

   protected long checkSkDestId800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkDestId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSkDestId800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSkDestId800
			                 ,SK_DEST_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skDestId800", beginSkDestId800,SK_DEST_ID_800_LEN);
    }
   	}
     int localSkDestIdx800Counter = -1;
     public boolean isSkDestIdx800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkDestIdx800Counter != sharedCounter;
         localSkDestIdx800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_DEST_IDX_800_LEN = 11;
	/**
	 * 	serialize this SkDestIdx800
	 */
   protected void serializeSkDestIdx800(char[] skDestIdx800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skDestIdx800,0,getStringValue(),beginSkDestIdx800,SK_DEST_IDX_800_LEN);
       localSkDestIdx800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkDestIdx800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSkDestIdx800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkDestIdx800() {	 
   		return (substring(getStringValue(),beginSkDestIdx800,beginSkDestIdx800 + SK_DEST_IDX_800_LEN));
   	}
     int localSkTxnSortCd800Counter = -1;
     public boolean isSkTxnSortCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkTxnSortCd800Counter != sharedCounter;
         localSkTxnSortCd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skTxnSortCd800
	 *	@return skTxnSortCd800
	 */
	public char[]  getSkTxnSortCd800String() {
	     return getCharArray(beginSkTxnSortCd800,SK_TXN_SORT_CD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skTxnSortCd800IsNumeric() {
	    return isNumeric(beginSkTxnSortCd800
	                    ,beginSkTxnSortCd800 + SK_TXN_SORT_CD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_TXN_SORT_CD_800_LEN = 2;
  	/**
	 * serializeSkTxnSortCd800
	 */
	protected void serializeSkTxnSortCd800(int skTxnSortCd800) {
		 putNumber(beginSkTxnSortCd800,skTxnSortCd800,SK_TXN_SORT_CD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkTxnSortCd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkTxnSortCd800
	 */
   	protected  int serializeSkTxnSortCd800(char[] value) {
	    int  skTxnSortCd800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skTxnSortCd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSkTxnSortCd800
		       ,2
		      );
		 localSkTxnSortCd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skTxnSortCd800;
    }

   protected int checkSkTxnSortCd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkTxnSortCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSkTxnSortCd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSkTxnSortCd800
			                 ,SK_TXN_SORT_CD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skTxnSortCd800", beginSkTxnSortCd800,SK_TXN_SORT_CD_800_LEN);
    }
   	}
     int localSkOrgnId800Counter = -1;
     public boolean isSkOrgnId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkOrgnId800Counter != sharedCounter;
         localSkOrgnId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skOrgnId800
	 *	@return skOrgnId800
	 */
	public char[]  getSkOrgnId800String() {
	     return getCharArray(beginSkOrgnId800,SK_ORGN_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skOrgnId800IsNumeric() {
	    return isNumeric(beginSkOrgnId800
	                    ,beginSkOrgnId800 + SK_ORGN_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_ORGN_ID_800_LEN = 11;
  	/**
	 * serializeSkOrgnId800
	 */
	protected void serializeSkOrgnId800(long skOrgnId800) {
		 putNumber(beginSkOrgnId800,skOrgnId800,SK_ORGN_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkOrgnId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkOrgnId800
	 */
   	protected  long serializeSkOrgnId800(char[] value) {
	    long  skOrgnId800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skOrgnId800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginSkOrgnId800
		       ,11
		      );
		 localSkOrgnId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skOrgnId800;
    }

   protected long checkSkOrgnId800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkOrgnId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSkOrgnId800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSkOrgnId800
			                 ,SK_ORGN_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skOrgnId800", beginSkOrgnId800,SK_ORGN_ID_800_LEN);
    }
   	}
     int localSkRevInd800Counter = -1;
     public boolean isSkRevInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkRevInd800Counter != sharedCounter;
         localSkRevInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_REV_IND_800_LEN = 1;
	/**
	 * 	serialize this SkRevInd800
	 */
   protected void serializeSkRevInd800(char[] skRevInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skRevInd800,0,getStringValue(),beginSkRevInd800,SK_REV_IND_800_LEN);
       localSkRevInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkRevInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkRevInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkRevInd800() {	 
   		return (substring(getStringValue(),beginSkRevInd800,beginSkRevInd800 + SK_REV_IND_800_LEN));
   	}
     int localSkSettleInd800Counter = -1;
     public boolean isSkSettleInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkSettleInd800Counter != sharedCounter;
         localSkSettleInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_SETTLE_IND_800_LEN = 1;
	/**
	 * 	serialize this SkSettleInd800
	 */
   protected void serializeSkSettleInd800(char[] skSettleInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skSettleInd800,0,getStringValue(),beginSkSettleInd800,SK_SETTLE_IND_800_LEN);
       localSkSettleInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkSettleInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkSettleInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkSettleInd800() {	 
   		return (substring(getStringValue(),beginSkSettleInd800,beginSkSettleInd800 + SK_SETTLE_IND_800_LEN));
   	}
     int localSkCurrencyCd800Counter = -1;
     public boolean isSkCurrencyCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkCurrencyCd800Counter != sharedCounter;
         localSkCurrencyCd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skCurrencyCd800
	 *	@return skCurrencyCd800
	 */
	public char[]  getSkCurrencyCd800String() {
	     return getCharArray(beginSkCurrencyCd800,SK_CURRENCY_CD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skCurrencyCd800IsNumeric() {
	    return isNumeric(beginSkCurrencyCd800
	                    ,beginSkCurrencyCd800 + SK_CURRENCY_CD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_CURRENCY_CD_800_LEN = 3;
  	/**
	 * serializeSkCurrencyCd800
	 */
	protected void serializeSkCurrencyCd800(int skCurrencyCd800) {
		 putNumber(beginSkCurrencyCd800,skCurrencyCd800,SK_CURRENCY_CD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkCurrencyCd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkCurrencyCd800
	 */
   	protected  int serializeSkCurrencyCd800(char[] value) {
	    int  skCurrencyCd800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skCurrencyCd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSkCurrencyCd800
		       ,3
		      );
		 localSkCurrencyCd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skCurrencyCd800;
    }

   protected int checkSkCurrencyCd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkCurrencyCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSkCurrencyCd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSkCurrencyCd800
			                 ,SK_CURRENCY_CD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skCurrencyCd800", beginSkCurrencyCd800,SK_CURRENCY_CD_800_LEN);
    }
   	}
     int localSkMcc800Counter = -1;
     public boolean isSkMcc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkMcc800Counter != sharedCounter;
         localSkMcc800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skMcc800
	 *	@return skMcc800
	 */
	public char[]  getSkMcc800String() {
	     return getCharArray(beginSkMcc800,SK_MCC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skMcc800IsNumeric() {
	    return isNumeric(beginSkMcc800
	                    ,beginSkMcc800 + SK_MCC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_MCC_800_LEN = 4;
  	/**
	 * serializeSkMcc800
	 */
	protected void serializeSkMcc800(int skMcc800) {
		 putNumber(beginSkMcc800,skMcc800,SK_MCC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkMcc800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkMcc800
	 */
   	protected  int serializeSkMcc800(char[] value) {
	    int  skMcc800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skMcc800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSkMcc800
		       ,4
		      );
		 localSkMcc800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skMcc800;
    }

   protected int checkSkMcc800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkMcc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSkMcc800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSkMcc800
			                 ,SK_MCC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skMcc800", beginSkMcc800,SK_MCC_800_LEN);
    }
   	}
     int localSkMccInfo800Counter = -1;
     public boolean isSkMccInfo800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkMccInfo800Counter != sharedCounter;
         localSkMccInfo800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_MCC_INFO_800_LEN = 96;
	/**
	 * 	serialize this SkMccInfo800
	 */
   protected void serializeSkMccInfo800(char[] skMccInfo800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skMccInfo800,0,getStringValue(),beginSkMccInfo800,SK_MCC_INFO_800_LEN);
       localSkMccInfo800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkMccInfo800Constraints(char[] value) {
   			return super.checkConstraints(value , 96 ,false, false);
   }
    /**
	 *	refreshSkMccInfo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkMccInfo800() {	 
   		return (substring(getStringValue(),beginSkMccInfo800,beginSkMccInfo800 + SK_MCC_INFO_800_LEN));
   	}
     int localSkDelCyc800Counter = -1;
     public boolean isSkDelCyc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkDelCyc800Counter != sharedCounter;
         localSkDelCyc800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_DEL_CYC_800_LEN = 1;
	/**
	 * 	serialize this SkDelCyc800
	 */
   protected void serializeSkDelCyc800(char[] skDelCyc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skDelCyc800,0,getStringValue(),beginSkDelCyc800,SK_DEL_CYC_800_LEN);
       localSkDelCyc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkDelCyc800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkDelCyc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkDelCyc800() {	 
   		return (substring(getStringValue(),beginSkDelCyc800,beginSkDelCyc800 + SK_DEL_CYC_800_LEN));
   	}
     int localSkTipabroInd800Counter = -1;
     public boolean isSkTipabroInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkTipabroInd800Counter != sharedCounter;
         localSkTipabroInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_TIPABRO_IND_800_LEN = 1;
	/**
	 * 	serialize this SkTipabroInd800
	 */
   protected void serializeSkTipabroInd800(char[] skTipabroInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skTipabroInd800,0,getStringValue(),beginSkTipabroInd800,SK_TIPABRO_IND_800_LEN);
       localSkTipabroInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkTipabroInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkTipabroInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkTipabroInd800() {	 
   		return (substring(getStringValue(),beginSkTipabroInd800,beginSkTipabroInd800 + SK_TIPABRO_IND_800_LEN));
   	}
     int localSkInbndFrmtInd800Counter = -1;
     public boolean isSkInbndFrmtInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkInbndFrmtInd800Counter != sharedCounter;
         localSkInbndFrmtInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_INBND_FRMT_IND_800_LEN = 1;
	/**
	 * 	serialize this SkInbndFrmtInd800
	 */
   protected void serializeSkInbndFrmtInd800(char[] skInbndFrmtInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skInbndFrmtInd800,0,getStringValue(),beginSkInbndFrmtInd800,SK_INBND_FRMT_IND_800_LEN);
       localSkInbndFrmtInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkInbndFrmtInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkInbndFrmtInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkInbndFrmtInd800() {	 
   		return (substring(getStringValue(),beginSkInbndFrmtInd800,beginSkInbndFrmtInd800 + SK_INBND_FRMT_IND_800_LEN));
   	}
     int localSkInfileId800Counter = -1;
     public boolean isSkInfileId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkInfileId800Counter != sharedCounter;
         localSkInfileId800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_INFILE_ID_800_LEN = 25;
	/**
	 * 	serialize this SkInfileId800
	 */
   protected void serializeSkInfileId800(char[] skInfileId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skInfileId800,0,getStringValue(),beginSkInfileId800,SK_INFILE_ID_800_LEN);
       localSkInfileId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkInfileId800Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshSkInfileId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkInfileId800() {	 
   		return (substring(getStringValue(),beginSkInfileId800,beginSkInfileId800 + SK_INFILE_ID_800_LEN));
   	}
     int localSkInfileRevCd800Counter = -1;
     public boolean isSkInfileRevCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkInfileRevCd800Counter != sharedCounter;
         localSkInfileRevCd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_INFILE_REV_CD_800_LEN = 1;
	/**
	 * 	serialize this SkInfileRevCd800
	 */
   protected void serializeSkInfileRevCd800(char[] skInfileRevCd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skInfileRevCd800,0,getStringValue(),beginSkInfileRevCd800,SK_INFILE_REV_CD_800_LEN);
       localSkInfileRevCd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkInfileRevCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkInfileRevCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkInfileRevCd800() {	 
   		return (substring(getStringValue(),beginSkInfileRevCd800,beginSkInfileRevCd800 + SK_INFILE_REV_CD_800_LEN));
   	}
     int localSkMsgCount800Counter = -1;
     public boolean isSkMsgCount800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkMsgCount800Counter != sharedCounter;
         localSkMsgCount800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of skMsgCount800
	 *	@return skMsgCount800
	 */
	public char[]  getSkMsgCount800String() {
	     return getCharArray(beginSkMsgCount800,SK_MSG_COUNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean skMsgCount800IsNumeric() {
	    return isNumeric(beginSkMsgCount800
	                    ,beginSkMsgCount800 + SK_MSG_COUNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SK_MSG_COUNT_800_LEN = 11;
  	/**
	 * serializeSkMsgCount800
	 */
	protected void serializeSkMsgCount800(long skMsgCount800) {
		 putNumber(beginSkMsgCount800,skMsgCount800,SK_MSG_COUNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSkMsgCount800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSkMsgCount800
	 */
   	protected  long serializeSkMsgCount800(char[] value) {
	    long  skMsgCount800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    skMsgCount800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginSkMsgCount800
		       ,11
		      );
		 localSkMsgCount800Counter = shareString.getSerializedField().getModifiedCounter();
		return  skMsgCount800;
    }

   protected long checkSkMsgCount800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSkMsgCount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSkMsgCount800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSkMsgCount800
			                 ,SK_MSG_COUNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("skMsgCount800", beginSkMsgCount800,SK_MSG_COUNT_800_LEN);
    }
   	}
     int localSkOutfileId800Counter = -1;
     public boolean isSkOutfileId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkOutfileId800Counter != sharedCounter;
         localSkOutfileId800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_OUTFILE_ID_800_LEN = 25;
	/**
	 * 	serialize this SkOutfileId800
	 */
   protected void serializeSkOutfileId800(char[] skOutfileId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skOutfileId800,0,getStringValue(),beginSkOutfileId800,SK_OUTFILE_ID_800_LEN);
       localSkOutfileId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkOutfileId800Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshSkOutfileId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkOutfileId800() {	 
   		return (substring(getStringValue(),beginSkOutfileId800,beginSkOutfileId800 + SK_OUTFILE_ID_800_LEN));
   	}
     int localSkAb800Counter = -1;
     public boolean isSkAb800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkAb800Counter != sharedCounter;
         localSkAb800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_AB_800_LEN = 3;
	/**
	 * 	serialize this SkAb800
	 */
   protected void serializeSkAb800(char[] skAb800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skAb800,0,getStringValue(),beginSkAb800,SK_AB_800_LEN);
       localSkAb800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkAb800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSkAb800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkAb800() {	 
   		return (substring(getStringValue(),beginSkAb800,beginSkAb800 + SK_AB_800_LEN));
   	}
     int localSkPurgeDt800Counter = -1;
     public boolean isSkPurgeDt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkPurgeDt800Counter != sharedCounter;
         localSkPurgeDt800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_PURGE_DT_800_LEN = 6;
	/**
	 * 	serialize this SkPurgeDt800
	 */
   protected void serializeSkPurgeDt800(char[] skPurgeDt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skPurgeDt800,0,getStringValue(),beginSkPurgeDt800,SK_PURGE_DT_800_LEN);
       localSkPurgeDt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkPurgeDt800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSkPurgeDt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkPurgeDt800() {	 
   		return (substring(getStringValue(),beginSkPurgeDt800,beginSkPurgeDt800 + SK_PURGE_DT_800_LEN));
   	}
     int localSkFlexRouteInd800Counter = -1;
     public boolean isSkFlexRouteInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkFlexRouteInd800Counter != sharedCounter;
         localSkFlexRouteInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int SK_FLEX_ROUTE_IND_800_LEN = 1;
	/**
	 * 	serialize this SkFlexRouteInd800
	 */
   protected void serializeSkFlexRouteInd800(char[] skFlexRouteInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(skFlexRouteInd800,0,getStringValue(),beginSkFlexRouteInd800,SK_FLEX_ROUTE_IND_800_LEN);
       localSkFlexRouteInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSkFlexRouteInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSkFlexRouteInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSkFlexRouteInd800() {	 
   		return (substring(getStringValue(),beginSkFlexRouteInd800,beginSkFlexRouteInd800 + SK_FLEX_ROUTE_IND_800_LEN));
   	}




}
  
