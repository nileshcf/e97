package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Key800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Key800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Key800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_800_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpi800;
            protected  int beginBsl800;
            protected  int beginBsid800;
            protected  int beginMsgType800;
            protected  int beginFuncCd800;
            protected  int beginPrcsCd800;
            protected  int beginDe26800;
            protected  int beginProdId800;
	
	/**
	* Constructor for Key800Serialized
	**/
    public Key800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Key800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Key800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Key800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Key800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Key800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpi800 = getStartOffset() + 0;	// set offset for serialization
  
             beginBsl800 = getStartOffset() + 3;	// set offset for serialization
  
             beginBsid800 = getStartOffset() + 4;	// set offset for serialization
  
             beginMsgType800 = getStartOffset() + 10;	// set offset for serialization
  
             beginFuncCd800 = getStartOffset() + 14;	// set offset for serialization
  
             beginPrcsCd800 = getStartOffset() + 17;	// set offset for serialization
  
             beginDe26800 = getStartOffset() + 23;	// set offset for serialization
  
             beginProdId800 = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCpi800Counter = -1;
     public boolean isCpi800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpi800Counter != sharedCounter;
         localCpi800Counter = sharedCounter; return hasModified;
     }
	protected static final int CPI_800_LEN = 3;
	/**
	 * 	serialize this Cpi800
	 */
   protected void serializeCpi800(char[] cpi800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpi800,0,getStringValue(),beginCpi800,CPI_800_LEN);
       localCpi800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpi800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpi800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpi800() {	 
   		return (substring(getStringValue(),beginCpi800,beginCpi800 + CPI_800_LEN));
   	}
     int localBsl800Counter = -1;
     public boolean isBsl800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl800Counter != sharedCounter;
         localBsl800Counter = sharedCounter; return hasModified;
     }
	protected static final int BSL_800_LEN = 1;
	/**
	 * 	serialize this Bsl800
	 */
   protected void serializeBsl800(char[] bsl800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsl800,0,getStringValue(),beginBsl800,BSL_800_LEN);
       localBsl800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsl800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBsl800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsl800() {	 
   		return (substring(getStringValue(),beginBsl800,beginBsl800 + BSL_800_LEN));
   	}
     int localBsid800Counter = -1;
     public boolean isBsid800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsid800Counter != sharedCounter;
         localBsid800Counter = sharedCounter; return hasModified;
     }
	protected static final int BSID_800_LEN = 6;
	/**
	 * 	serialize this Bsid800
	 */
   protected void serializeBsid800(char[] bsid800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsid800,0,getStringValue(),beginBsid800,BSID_800_LEN);
       localBsid800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsid800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBsid800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsid800() {	 
   		return (substring(getStringValue(),beginBsid800,beginBsid800 + BSID_800_LEN));
   	}
     int localMsgType800Counter = -1;
     public boolean isMsgType800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgType800Counter != sharedCounter;
         localMsgType800Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_TYPE_800_LEN = 4;
	/**
	 * 	serialize this MsgType800
	 */
   protected void serializeMsgType800(char[] msgType800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgType800,0,getStringValue(),beginMsgType800,MSG_TYPE_800_LEN);
       localMsgType800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgType800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgType800() {	 
   		return (substring(getStringValue(),beginMsgType800,beginMsgType800 + MSG_TYPE_800_LEN));
   	}
     int localFuncCd800Counter = -1;
     public boolean isFuncCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFuncCd800Counter != sharedCounter;
         localFuncCd800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNC_CD_800_LEN = 3;
	/**
	 * 	serialize this FuncCd800
	 */
   protected void serializeFuncCd800(char[] funcCd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(funcCd800,0,getStringValue(),beginFuncCd800,FUNC_CD_800_LEN);
       localFuncCd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFuncCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFuncCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFuncCd800() {	 
   		return (substring(getStringValue(),beginFuncCd800,beginFuncCd800 + FUNC_CD_800_LEN));
   	}
     int localPrcsCd800Counter = -1;
     public boolean isPrcsCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrcsCd800Counter != sharedCounter;
         localPrcsCd800Counter = sharedCounter; return hasModified;
     }
	protected static final int PRCS_CD_800_LEN = 6;
	/**
	 * 	serialize this PrcsCd800
	 */
   protected void serializePrcsCd800(char[] prcsCd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prcsCd800,0,getStringValue(),beginPrcsCd800,PRCS_CD_800_LEN);
       localPrcsCd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrcsCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPrcsCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrcsCd800() {	 
   		return (substring(getStringValue(),beginPrcsCd800,beginPrcsCd800 + PRCS_CD_800_LEN));
   	}
     int localDe26800Counter = -1;
     public boolean isDe26800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe26800Counter != sharedCounter;
         localDe26800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de26800
	 *	@return de26800
	 */
	public char[]  getDe26800String() {
	     return getCharArray(beginDe26800,DE_26800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de26800IsNumeric() {
	    return isNumeric(beginDe26800
	                    ,beginDe26800 + DE_26800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_26800_LEN = 5;
  	/**
	 * serializeDe26800
	 */
	protected void serializeDe26800(long de26800) {
		 putNumber(beginDe26800,de26800,DE_26800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe26800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe26800
	 */
   	protected  long serializeDe26800(char[] value) {
	    long  de26800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de26800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDe26800
		       ,5
		      );
		 localDe26800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de26800;
    }

   protected long checkDe26800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe26800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDe26800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDe26800
			                 ,DE_26800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de26800", beginDe26800,DE_26800_LEN);
    }
   	}
     int localProdId800Counter = -1;
     public boolean isProdId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdId800Counter != sharedCounter;
         localProdId800Counter = sharedCounter; return hasModified;
     }
	protected static final int PROD_ID_800_LEN = 3;
	/**
	 * 	serialize this ProdId800
	 */
   protected void serializeProdId800(char[] prodId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodId800,0,getStringValue(),beginProdId800,PROD_ID_800_LEN);
       localProdId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshProdId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdId800() {	 
   		return (substring(getStringValue(),beginProdId800,beginProdId800 + PROD_ID_800_LEN));
   	}




}
  
