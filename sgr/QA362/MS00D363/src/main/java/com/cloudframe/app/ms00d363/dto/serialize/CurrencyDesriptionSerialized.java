package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurrencyDesriptionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrencyDesriptionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrencyDesriptionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENCY_DESRIPTION_LENGTH = 300;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CurrencyDesriptionSerialized
	**/
    public CurrencyDesriptionSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrencyDesriptionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENCY_DESRIPTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
