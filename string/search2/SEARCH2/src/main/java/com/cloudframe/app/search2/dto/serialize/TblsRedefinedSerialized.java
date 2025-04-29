package com.cloudframe.app.search2.dto.serialize;

/**
*  The class TblsRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TblsRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TblsRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBLS_REDEFINED_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSbid;
            protected  int beginEcp;
	
	/**
	* Constructor for TblsRedefinedSerialized
	**/
    public TblsRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TblsRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblsRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TblsRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this TblsRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in TblsRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBLS_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSbid = getStartOffset() + 0;	// set offset for serialization
  
             beginEcp = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSbidCounter = -1;
     public boolean isSbidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSbidCounter != sharedCounter;
         localSbidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sbid
	 *	@return sbid
	 */
	public char[]  getSbidString() {
	     return getCharArray(beginSbid,SBID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sbidIsNumeric() {
	    return isNumeric(beginSbid
	                    ,beginSbid + SBID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SBID_LEN = 5;
  	/**
	 * serializeSbid
	 */
	protected void serializeSbid(long sbid) {
		 putNumber(beginSbid,sbid,SBID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSbidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSbid
	 */
   	protected  long serializeSbid(char[] value) {
	    long  sbid;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sbid = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSbid
		       ,5
		      );
		 localSbidCounter = shareString.getSerializedField().getModifiedCounter();
		return  sbid;
    }

   protected long checkSbidMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSbid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSbid() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSbid
			                 ,SBID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sbid", beginSbid,SBID_LEN);
    }
   	}
     int localEcpCounter = -1;
     public boolean isEcpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEcpCounter != sharedCounter;
         localEcpCounter = sharedCounter; return hasModified;
     }
	protected static final int ECP_LEN = 6;
	/**
	 * 	serialize this Ecp
	 */
   protected void serializeEcp(char[] ecp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ecp,0,getStringValue(),beginEcp,ECP_LEN);
       localEcpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEcpConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshEcp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEcp() {	 
   		return (substring(getStringValue(),beginEcp,beginEcp + ECP_LEN));
   	}




}
  
