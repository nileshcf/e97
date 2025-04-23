package com.cloudframe.app.special2.dto.serialize;

/**
*  The class TiArbolNodoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TiArbolNodoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TiArbolNodoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TI_ARBOL_NODO_LENGTH = 34;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTiNMaxheight;
	
	/**
	* Constructor for TiArbolNodoSerialized
	**/
    public TiArbolNodoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TiArbolNodoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TiArbolNodoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TiArbolNodoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this TiArbolNodoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in TiArbolNodoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TI_ARBOL_NODO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTiNMaxheight = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTiNMaxheightCounter = -1;
     public boolean isTiNMaxheightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTiNMaxheightCounter != sharedCounter;
         localTiNMaxheightCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightString() {
	     return getCharArray(beginTiNMaxheight,TI_NMAXHEIGHT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNMaxheightIsNumeric() {
	    return isNumeric(beginTiNMaxheight
	                    ,beginTiNMaxheight + TI_NMAXHEIGHT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TI_NMAXHEIGHT_LEN = 5;
  	/**
	 * serializeTiNMaxheight
	 */
	protected void serializeTiNMaxheight(int tiNMaxheight) {
		 putNumber(beginTiNMaxheight,tiNMaxheight,TI_NMAXHEIGHT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTiNMaxheightCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTiNMaxheight
	 */
   	protected  int serializeTiNMaxheight(char[] value) {
	    int  tiNMaxheight;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tiNMaxheight = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginTiNMaxheight
		       ,5
		      );
		 localTiNMaxheightCounter = shareString.getSerializedField().getModifiedCounter();
		return  tiNMaxheight;
    }

   protected int checkTiNMaxheightMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTiNMaxheight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTiNMaxheight() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTiNMaxheight
			                 ,TI_NMAXHEIGHT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tiNMaxheight", beginTiNMaxheight,TI_NMAXHEIGHT_LEN);
    }
   	}




}
  
