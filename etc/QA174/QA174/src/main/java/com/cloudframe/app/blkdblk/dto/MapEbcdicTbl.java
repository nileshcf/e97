package com.cloudframe.app.blkdblk.dto;

/**
*  The class MapEbcdicTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:46. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class MapEbcdicTbl extends MapEbcdicTblSerialized { 
   
      private List<char[]> mapEbcdic; 

	
	/**
	* Constructor for MapEbcdicTbl
	**/
    public MapEbcdicTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MapEbcdicTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapEbcdicTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of mapEbcdic
	 *  Corresponding COBOL Variable is MAP-EBCDIC
	 *	@return mapEbcdic
	 */
	public List<char[]> getMapEbcdic() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < MAP_EBCDIC_SIZE;index++) {
        	list.add( getMapEbcdic( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return mapEbcdic
	 */
	public char[] getMapEbcdic(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getMapEbcdic(), resetting it to 0",index);
		    index = 0;
        } else if (index >= MAP_EBCDIC_SIZE) {
             	index = MAP_EBCDIC_SIZE -1; // can't exceed max array size
             	logger.trace("mapEbcdic - Array index exceeded max Size {}, resetting it to max allowed",MAP_EBCDIC_SIZE); 
	    }
   	      return getCharArray( (beginMapEbcdic + index*MAP_EBCDIC_LEN) , MAP_EBCDIC_LEN );
    }
    
    
   public int  mapEbcdicFieldLength() {
   	return MAP_EBCDIC_LEN;
   }
   
	

  
  	/**
	 *	Update MapEbcdic with the passed value at a given index
	 *  Corresponding COBOL Variable is MAP-EBCDIC
	 *  @param index
	 *	@param value
	 */
  public void setMapEbcdic(int index,char[] value) {
   	setMapEbcdic(index,value,true);
   }
   
   
   /**
	 *	Update MapEbcdic with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setMapEbcdic(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setMapEbcdic(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeMapEbcdic(index,value);		
       }
   }
   

	
	
	

		public static int getMapEbcdicTblFieldLength() {
			return MAP_EBCDIC_TBL_LENGTH;
		}

}
  
