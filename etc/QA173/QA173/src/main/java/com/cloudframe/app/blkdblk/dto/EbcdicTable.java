package com.cloudframe.app.blkdblk.dto;

/**
*  The class EbcdicTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:39. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class EbcdicTable extends EbcdicTableSerialized {
   
				private MapEbcdicTbl mapEbcdicTbl = new MapEbcdicTbl();
      private List<char[]> ebcdicToAscii; 

	
	/**
	* Constructor for EbcdicTable
	**/
    public EbcdicTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mapEbcdicTbl.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mapEbcdicTbl
	 *	@return mapEbcdicTbl
	 */   
	 public MapEbcdicTbl getMapEbcdicTbl() {
   	return mapEbcdicTbl;
   }
   /**
	* 	Update MapEbcdicTbl with the passed value
	*   Corresponding COBOL Variable is MAP-EBCDIC-TBL
	*	@param value
	*/
   public void setMapEbcdicTbl(char[] value) {
      mapEbcdicTbl.setString(value); 
   }   
    
     /**
	 * 	Update MapEbcdicTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMapEbcdicTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mapEbcdicTbl.begin,mapEbcdicTbl.length());
   }
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMapEbcdicTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mapEbcdicTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MapEbcdicTbl with another Field
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source) {
   	replace(source,0,source.length(),mapEbcdicTbl.begin,mapEbcdicTbl.length());
   }  
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mapEbcdicTbl.begin,mapEbcdicTbl.length());
   }
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mapEbcdicTbl.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of ebcdicToAscii
	 *  Corresponding COBOL Variable is EBCDIC-TO-ASCII
	 *	@return ebcdicToAscii
	 */
	public List<char[]> getEbcdicToAscii() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < EBCDIC_TO_ASCII_SIZE;index++) {
        	list.add( getEbcdicToAscii( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ebcdicToAscii
	 */
	public char[] getEbcdicToAscii(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getEbcdicToAscii(), resetting it to 0",index);
		    index = 0;
        } else if (index >= EBCDIC_TO_ASCII_SIZE) {
             	index = EBCDIC_TO_ASCII_SIZE -1; // can't exceed max array size
             	logger.trace("ebcdicToAscii - Array index exceeded max Size {}, resetting it to max allowed",EBCDIC_TO_ASCII_SIZE); 
	    }
   	      return getCharArray( (beginEbcdicToAscii + index*EBCDIC_TO_ASCII_LEN) , EBCDIC_TO_ASCII_LEN );
    }
    
    
   public int  ebcdicToAsciiFieldLength() {
   	return EBCDIC_TO_ASCII_LEN;
   }
   
	

  
  	/**
	 *	Update EbcdicToAscii with the passed value at a given index
	 *  Corresponding COBOL Variable is EBCDIC-TO-ASCII
	 *  @param index
	 *	@param value
	 */
  public void setEbcdicToAscii(int index,char[] value) {
   	setEbcdicToAscii(index,value,true);
   }
   
   
   /**
	 *	Update EbcdicToAscii with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setEbcdicToAscii(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setEbcdicToAscii(int,String,boolean), reset it to 0",index);
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
		serializeEbcdicToAscii(index,value);		
       }
   }
   

	
	
	

		public static int getEbcdicTableFieldLength() {
			return EBCDIC_TABLE_LENGTH;
		}

}
  
