package com.cloudframe.app.gp004760.dto;

/**
*  The class Gp004760CabTccArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class Gp004760CabTccArray extends Gp004760CabTccArraySerialized { 
   
      private List<char[]> gp004760AuthTxnCatCd; 

	
	/**
	* Constructor for Gp004760CabTccArray
	**/
    public Gp004760CabTccArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Gp004760CabTccArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Gp004760CabTccArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of gp004760AuthTxnCatCd
	 *  Corresponding COBOL Variable is GP004760-AUTH-TXN-CAT-CD
	 *	@return gp004760AuthTxnCatCd
	 */
	public List<char[]> getGp004760AuthTxnCatCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GP_004760_AUTH_TXN_CAT_CD_SIZE;index++) {
        	list.add( getGp004760AuthTxnCatCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return gp004760AuthTxnCatCd
	 */
	public char[] getGp004760AuthTxnCatCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGp004760AuthTxnCatCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GP_004760_AUTH_TXN_CAT_CD_SIZE) {
             	index = GP_004760_AUTH_TXN_CAT_CD_SIZE -1; // can't exceed max array size
             	logger.trace("gp004760AuthTxnCatCd - Array index exceeded max Size {}, resetting it to max allowed",GP_004760_AUTH_TXN_CAT_CD_SIZE); 
	    }
   	      return getCharArray( (beginGp004760AuthTxnCatCd + index*GP_004760_AUTH_TXN_CAT_CD_LEN) , GP_004760_AUTH_TXN_CAT_CD_LEN );
    }
    
    
   public int  gp004760AuthTxnCatCdFieldLength() {
   	return GP_004760_AUTH_TXN_CAT_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Gp004760AuthTxnCatCd with the passed value at a given index
	 *  Corresponding COBOL Variable is GP004760-AUTH-TXN-CAT-CD
	 *  @param index
	 *	@param value
	 */
  public void setGp004760AuthTxnCatCd(int index,char[] value) {
   	setGp004760AuthTxnCatCd(index,value,true);
   }
   
   
   /**
	 *	Update Gp004760AuthTxnCatCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGp004760AuthTxnCatCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGp004760AuthTxnCatCd(int,String,boolean), reset it to 0",index);
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
		serializeGp004760AuthTxnCatCd(index,value);		
       }
   }
   

	
	
	

		public static int getGp004760CabTccArrayFieldLength() {
			return GP_004760_CAB_TCC_ARRAY_LENGTH;
		}

}
  
