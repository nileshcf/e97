package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class MntAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MntAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MntAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MNT_AREA_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginMntMonth;
           protected static final int MNT_MONTH_SIZE = 12;
	
	/**
	* Constructor for MntAreaSerialized
	**/
    public MntAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MntAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MntAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MntAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this MntAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in MntAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MNT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginMntMonth = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int MNT_MONTH_LEN = 11;
   /**
	 *	serializeMntMonth as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeMntMonth(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginMntMonth + index*MNT_MONTH_LEN)
   	          , MNT_MONTH_LEN 
   	          );
   }

		public int mntMonthSize() {
			return MNT_MONTH_SIZE;
		}



}
  
