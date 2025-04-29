package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class InsallDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InsallDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InsallDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INSALL_DATA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIInsertCnt;
	
	/**
	* Constructor for InsallDataSerialized
	**/
    public InsallDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InsallDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsallDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InsallDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this InsallDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in InsallDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INSALL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIInsertCnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIInsertCntCounter = -1;
     public boolean isIInsertCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIInsertCntCounter != sharedCounter;
         localIInsertCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iInsertCnt
	 *	@return iInsertCnt
	 */
	public char[]  getIInsertCntString() {
	     return getCharArray(beginIInsertCnt,I_INSERT_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iInsertCntIsNumeric() {
	    return isNumeric(beginIInsertCnt
	                    ,beginIInsertCnt + I_INSERT_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_INSERT_CNT_LEN = 9;
  	/**
	 * serializeIInsertCnt
	 */
	protected void serializeIInsertCnt(long iInsertCnt) {
		 putNumber(beginIInsertCnt,iInsertCnt,I_INSERT_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIInsertCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIInsertCnt
	 */
   	protected  long serializeIInsertCnt(char[] value) {
	    long  iInsertCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iInsertCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIInsertCnt
		       ,9
		      );
		 localIInsertCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  iInsertCnt;
    }

   protected long checkIInsertCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIInsertCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIInsertCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIInsertCnt
			                 ,I_INSERT_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iInsertCnt", beginIInsertCnt,I_INSERT_CNT_LEN);
    }
   	}




}
  
