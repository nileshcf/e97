package com.cloudframe.app.bankint1.dto.serialize;

/**
*  The class AcafscedAreaComunicacionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcafscedAreaComunicacionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcafscedAreaComunicacionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACAFSCED_AREA_COMUNICACION_LENGTH = 510;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for AcafscedAreaComunicacionSerialized
	**/
    public AcafscedAreaComunicacionSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcafscedAreaComunicacionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACAFSCED_AREA_COMUNICACION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
