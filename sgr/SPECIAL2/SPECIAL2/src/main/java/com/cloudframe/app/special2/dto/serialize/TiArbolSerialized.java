package com.cloudframe.app.special2.dto.serialize;

/**
*  The class TiArbolSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TiArbolSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TiArbolSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TI_ARBOL_LENGTH = 1702;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTiNTot;
           protected int beginTiArbolNodo;
           protected static final int TI_ARBOL_NODO_SIZE = 50;
	
	/**
	* Constructor for TiArbolSerialized
	**/
    public TiArbolSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TiArbolSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TiArbolSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TiArbolSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this TiArbolSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in TiArbolSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TI_ARBOL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTiNTot = getStartOffset() + 0;	// set offset for serialization
  
	        beginTiArbolNodo = getStartOffset() + 2; // set offset for serialization
  
	   /*  end of offset */
	}
     int localTiNTotCounter = -1;
     public boolean isTiNTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTiNTotCounter != sharedCounter;
         localTiNTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tiNTot
	 *	@return tiNTot
	 */
	public char[]  getTiNTotString() {
	     return getCharArray(beginTiNTot,TI_NTOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNTotIsNumeric() {
	    return isNumeric(beginTiNTot
	                    ,beginTiNTot + TI_NTOT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TI_NTOT_LEN = 2;
  	/**
	 * serializeTiNTot
	 */
	protected void serializeTiNTot(int tiNTot) {
		 putNumber(beginTiNTot,tiNTot,TI_NTOT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTiNTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTiNTot
	 */
   	protected  int serializeTiNTot(char[] value) {
	    int  tiNTot;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tiNTot = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTiNTot
		       ,2
		      );
		 localTiNTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  tiNTot;
    }

   protected int checkTiNTotMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTiNTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTiNTot() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTiNTot
			                 ,TI_NTOT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tiNTot", beginTiNTot,TI_NTOT_LEN);
    }
   	}

		public int tiArbolNodoSize() {
			return TI_ARBOL_NODO_SIZE;
		}



}
  
