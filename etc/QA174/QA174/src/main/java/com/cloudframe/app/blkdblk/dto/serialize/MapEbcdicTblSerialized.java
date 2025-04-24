package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class MapEbcdicTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:46. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MapEbcdicTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MapEbcdicTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAP_EBCDIC_TBL_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginMapEbcdic;
           protected static final int MAP_EBCDIC_SIZE = 256;
	
	/**
	* Constructor for MapEbcdicTblSerialized
	**/
    public MapEbcdicTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MapEbcdicTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapEbcdicTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MapEbcdicTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MapEbcdicTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MapEbcdicTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAP_EBCDIC_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginMapEbcdic = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int MAP_EBCDIC_LEN = 1;
   /**
	 *	serializeMapEbcdic as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeMapEbcdic(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginMapEbcdic + index*MAP_EBCDIC_LEN)
   	          , MAP_EBCDIC_LEN 
   	          );
   }

		public int mapEbcdicSize() {
			return MAP_EBCDIC_SIZE;
		}



}
  
