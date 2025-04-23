package com.cloudframe.app.cfif01.dto;

/**
*  The class DataTableArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class DataTableArray extends DataTableArraySerialized { 
   

								private int dataHmAirQty;

								private BigDecimal dataHmAirQtyDec = BigDecimal.ZERO;
	
	/**
	* Constructor for DataTableArray
	**/
    public DataTableArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DataTableArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DataTableArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getDataHmAirQty() throws CFException {
        if (isDataHmAirQtyModified()) { 
           dataHmAirQty = refreshDataHmAirQty();
        }
   		return dataHmAirQty;
	}
	
	/**
	 * 	Update DataHmAirQty with the passed value
	 *  Corresponding COBOL Variable is DATA-HM-AIR-QTY
	 *	@param number
	 */
	public void setDataHmAirQty(int number) {
			dataHmAirQty = checkDataHmAirQtyMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDataHmAirQty(dataHmAirQty);
	}


	public void setDataHmAirQty(long number) {
	    number = checkDataHmAirQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDataHmAirQty((int)number);
	}
	
	public BigDecimal getDataHmAirQtyDec() throws CFException {
        if (isDataHmAirQtyDecModified()) { 
           dataHmAirQtyDec = refreshDataHmAirQtyDec();
        }
   		return dataHmAirQtyDec;
	}

    public char[] getDataHmAirQtyDecString() {
          return  dataHmAirQtyDecString();
    }
	
	/**
	 * 	Update DataHmAirQtyDec with the passed number
	 *  Corresponding COBOL Variable is DATA-HM-AIR-QTY-DEC
	 *	@param number
	 */
	public void setDataHmAirQtyDec(BigDecimal number) {	
     dataHmAirQtyDec = checkDataHmAirQtyDecMaxLimit(number);
	    serializeDataHmAirQtyDec(dataHmAirQtyDec);
   }

	
	
	

		public static int getDataTableArrayFieldLength() {
			return DATA_TABLE_ARRAY_LENGTH;
		}

}
  
