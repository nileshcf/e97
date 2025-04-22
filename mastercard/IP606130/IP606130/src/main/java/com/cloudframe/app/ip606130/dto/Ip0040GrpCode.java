package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040GrpCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040GrpCode extends Ip0040GrpCodeSerialized { 
   
      private List<char[]> ip0040GrpCodeDtl; 

	
	/**
	* Constructor for Ip0040GrpCode
	**/
    public Ip0040GrpCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040GrpCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040GrpCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip0040GrpCodeDtl
	 *  Corresponding COBOL Variable is IP0040-GRP-CODE-DTL
	 *	@return ip0040GrpCodeDtl
	 */
	public List<char[]> getIp0040GrpCodeDtl() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_0040_GRP_CODE_DTL_SIZE;index++) {
        	list.add( getIp0040GrpCodeDtl( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip0040GrpCodeDtl
	 */
	public char[] getIp0040GrpCodeDtl(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp0040GrpCodeDtl(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_0040_GRP_CODE_DTL_SIZE) {
             	index = IP_0040_GRP_CODE_DTL_SIZE -1; // can't exceed max array size
             	logger.trace("ip0040GrpCodeDtl - Array index exceeded max Size {}, resetting it to max allowed",IP_0040_GRP_CODE_DTL_SIZE); 
	    }
   	      return getCharArray( (beginIp0040GrpCodeDtl + index*IP_0040_GRP_CODE_DTL_LEN) , IP_0040_GRP_CODE_DTL_LEN );
    }
    
    
   public int  ip0040GrpCodeDtlFieldLength() {
   	return IP_0040_GRP_CODE_DTL_LEN;
   }
   
	

  
  	/**
	 *	Update Ip0040GrpCodeDtl with the passed value at a given index
	 *  Corresponding COBOL Variable is IP0040-GRP-CODE-DTL
	 *  @param index
	 *	@param value
	 */
  public void setIp0040GrpCodeDtl(int index,char[] value) {
   	setIp0040GrpCodeDtl(index,value,true);
   }
   
   
   /**
	 *	Update Ip0040GrpCodeDtl with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp0040GrpCodeDtl(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp0040GrpCodeDtl(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp0040GrpCodeDtl(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip0040GrpCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0040_GRP_CODE_DTL_SIZE;index++) {
             setIp0040GrpCodeDtl(index, CONSTANTS.SPACE_2);
         }
   }

		public static int getIp0040GrpCodeFieldLength() {
			return IP_0040_GRP_CODE_LENGTH;
		}

}
  
