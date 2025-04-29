package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iGrpCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040iGrpCode extends Ip0040iGrpCodeSerialized { 
   
      private List<char[]> ip0040iGrpCodeDtl; 

	
	/**
	* Constructor for Ip0040iGrpCode
	**/
    public Ip0040iGrpCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iGrpCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iGrpCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip0040iGrpCodeDtl
	 *  Corresponding COBOL Variable is IP0040I-GRP-CODE-DTL
	 *	@return ip0040iGrpCodeDtl
	 */
	public List<char[]> getIp0040iGrpCodeDtl() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_0040I_GRP_CODE_DTL_SIZE;index++) {
        	list.add( getIp0040iGrpCodeDtl( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip0040iGrpCodeDtl
	 */
	public char[] getIp0040iGrpCodeDtl(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp0040iGrpCodeDtl(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_0040I_GRP_CODE_DTL_SIZE) {
             	index = IP_0040I_GRP_CODE_DTL_SIZE -1; // can't exceed max array size
             	logger.trace("ip0040iGrpCodeDtl - Array index exceeded max Size {}, resetting it to max allowed",IP_0040I_GRP_CODE_DTL_SIZE); 
	    }
   	      return getCharArray( (beginIp0040iGrpCodeDtl + index*IP_0040I_GRP_CODE_DTL_LEN) , IP_0040I_GRP_CODE_DTL_LEN );
    }
    
    
   public int  ip0040iGrpCodeDtlFieldLength() {
   	return IP_0040I_GRP_CODE_DTL_LEN;
   }
   
	

  
  	/**
	 *	Update Ip0040iGrpCodeDtl with the passed value at a given index
	 *  Corresponding COBOL Variable is IP0040I-GRP-CODE-DTL
	 *  @param index
	 *	@param value
	 */
  public void setIp0040iGrpCodeDtl(int index,char[] value) {
   	setIp0040iGrpCodeDtl(index,value,true);
   }
   
   
   /**
	 *	Update Ip0040iGrpCodeDtl with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp0040iGrpCodeDtl(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp0040iGrpCodeDtl(int,String,boolean), reset it to 0",index);
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
		serializeIp0040iGrpCodeDtl(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip0040iGrpCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0040I_GRP_CODE_DTL_SIZE;index++) {
             setIp0040iGrpCodeDtl(index, CONSTANTS.SPACE_2);
         }
   }

		public static int getIp0040iGrpCodeFieldLength() {
			return IP_0040I_GRP_CODE_LENGTH;
		}

}
  
