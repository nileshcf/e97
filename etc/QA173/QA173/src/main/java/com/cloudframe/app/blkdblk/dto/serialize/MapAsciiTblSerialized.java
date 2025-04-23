package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class MapAsciiTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MapAsciiTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MapAsciiTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAP_ASCII_TBL_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginMapAscii;
           protected static final int MAP_ASCII_SIZE = 256;
	
	/**
	* Constructor for MapAsciiTblSerialized
	**/
    public MapAsciiTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MapAsciiTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapAsciiTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MapAsciiTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MapAsciiTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MapAsciiTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAP_ASCII_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginMapAscii = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int MAP_ASCII_LEN = 1;
   /**
	 *	serializeMapAscii as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeMapAscii(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginMapAscii + index*MAP_ASCII_LEN)
   	          , MAP_ASCII_LEN 
   	          );
   }

		public int mapAsciiSize() {
			return MAP_ASCII_SIZE;
		}



}
  
