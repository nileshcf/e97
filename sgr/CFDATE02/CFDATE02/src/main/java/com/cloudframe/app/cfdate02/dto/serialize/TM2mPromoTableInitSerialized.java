package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class TM2mPromoTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TM2mPromoTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TM2mPromoTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_M_2M_PROMO_TABLE_INIT_LENGTH = 1551;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TM2mPromoTableInitSerialized
	**/
    public TM2mPromoTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TM2mPromoTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_M_2M_PROMO_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
