package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class DataTableArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DataTableArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataTableArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_TABLE_ARRAY_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDataHmAirQty;
            protected  int beginDataHmAirQtyDec;
	
	/**
	* Constructor for DataTableArraySerialized
	**/
    public DataTableArraySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DataTableArraySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DataTableArraySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DataTableArraySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DataTableArraySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DataTableArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATA_TABLE_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDataHmAirQty = getStartOffset() + 0;	// set offset for serialization
  
             beginDataHmAirQtyDec = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localDataHmAirQtyCounter = -1;
        public boolean isDataHmAirQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDataHmAirQtyCounter != sharedCounter;
           localDataHmAirQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean dataHmAirQtyIsNumeric() {
	      return decimalIsNumeric(beginDataHmAirQty,DATA_HM_AIR_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DATA_HM_AIR_QTY_LEN = 5;
  	/**
	 * 	serializeDataHmAirQty
	 */
	protected void serializeDataHmAirQty(int dataHmAirQty) {
		   putDecimal(beginDataHmAirQty,dataHmAirQty,DATA_HM_AIR_QTY_LEN,true);
   }
   

   protected int checkDataHmAirQtyMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshDataHmAirQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDataHmAirQty() throws CFException {	
   	try { 
		 return (getIntDecimal(beginDataHmAirQty,DATA_HM_AIR_QTY_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dataHmAirQty", beginDataHmAirQty,DATA_HM_AIR_QTY_LEN);
     }
   	}
        int localDataHmAirQtyDecCounter = -1;
        public boolean isDataHmAirQtyDecModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDataHmAirQtyDecCounter != sharedCounter;
           localDataHmAirQtyDecCounter = sharedCounter; return hasModified; 
        }
	    public boolean dataHmAirQtyDecIsNumeric() {
	      return decimalIsNumeric(beginDataHmAirQtyDec,DATA_HM_AIR_QTY_DEC_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dataHmAirQtyDecString() {
            return getPackedString(beginDataHmAirQtyDec,DATA_HM_AIR_QTY_DEC_LEN);
         }
   protected static final int DATA_HM_AIR_QTY_DEC_LEN = 5;
   protected static final int DATA_HM_AIR_QTY_DEC_SCALE = 3;
  	/**
	 * 	serializeDataHmAirQtyDec
	 */
	protected void serializeDataHmAirQtyDec(BigDecimal dataHmAirQtyDec) {
		   putDecimal(beginDataHmAirQtyDec,dataHmAirQtyDec,DATA_HM_AIR_QTY_DEC_LEN,DATA_HM_AIR_QTY_DEC_SCALE,true);
		 localDataHmAirQtyDecCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDataHmAirQtyDecMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshDataHmAirQtyDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDataHmAirQtyDec() throws CFException {	
   	try { 
		 return (getDecimal(beginDataHmAirQtyDec,DATA_HM_AIR_QTY_DEC_LEN,DATA_HM_AIR_QTY_DEC_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dataHmAirQtyDec", beginDataHmAirQtyDec,DATA_HM_AIR_QTY_DEC_LEN);
     }
   	}




}
  
